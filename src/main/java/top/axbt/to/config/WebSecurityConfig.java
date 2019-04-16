package top.axbt.to.config;



/**
 * Create by 张晨彬
 * 2018/12/1/001 14:04
 */

/*@Configuration*/
public class WebSecurityConfig /*extends WebSecurityConfigurerAdapter*/ {

    /*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("123456").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/css/style.css")
                .defaultSuccessUrl("/page/man/index.html")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/css/**");
    }*/
}
