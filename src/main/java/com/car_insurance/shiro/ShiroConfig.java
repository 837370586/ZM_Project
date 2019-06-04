package com.car_insurance.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    /*
    * 创建ShiroFilterFactoryBean
    * */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        /*
         * Shiro内置过滤器，可以实现权限相关拦截器
         * 			常用的过滤器
         * 					anon:无需（登录）认证可以访问
         * 					authc:必须认证才可以访问
         * 					user:如果使用rememberme的功能可以直接访问
         *					perms:该资源必须得到资源权限才可以访问
         * 					role:该资源必须得到角色权限才可以访问
         * */
        Map<String,String> fiter = new LinkedHashMap<String,String>();
        fiter.put("/login", "anon");
        fiter.put("/toLogin", "anon");
        fiter.put("/index", "anon");
        fiter.put("/qqq", "anon");
        fiter.put("/shouye", "anon");
        fiter.put("/loginOut", "anon");

        fiter.put("/*","authc");
       //修改登录页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(fiter);

        return shiroFilterFactoryBean;
    }

    /*
     * 创建DefaultWebSecurityManager
     * */
    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联Realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    /*
     * 创建Realm
     * */
    @Bean(name="userRealm")
    public UserRealm getRealm(){

        return new UserRealm();
    }



}
