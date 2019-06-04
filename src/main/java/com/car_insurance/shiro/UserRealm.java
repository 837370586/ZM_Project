package com.car_insurance.shiro;


import com.car_insurance.entity.AccountExample;
import com.car_insurance.service.AccountService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.util.StringUtils;


import javax.annotation.Resource;
import java.util.List;

public class UserRealm extends AuthorizingRealm {

    @Resource
    private AccountService accountService;

   /*
   * 执行授权逻辑
   * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Subject subject = SecurityUtils.getSubject();
        //info.addStringPermission("user:service ");
        AccountExample accountExample = (AccountExample)subject.getPrincipal();
        List<String> list =accountService.getPermissions(accountExample.getAccount_name());
        System.out.println(list);
        if(list!=null) {
            for (String perms : list) {
                if(!StringUtils.isEmpty(perms)) {
                    info.addStringPermission(perms);

                }
            }
        }
        return info;
    }

    /*
     * 执行认证逻辑
     * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {


        UsernamePasswordToken token = (UsernamePasswordToken)arg0;

        AccountExample accountExample =accountService.findAccountByName(token.getUsername());



        if(accountExample==null){
               return null;
        }

        return new SimpleAuthenticationInfo(accountExample,accountExample.getAccount_password(),"");
    }
}
