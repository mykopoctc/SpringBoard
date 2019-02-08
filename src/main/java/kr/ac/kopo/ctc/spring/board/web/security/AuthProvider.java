package kr.ac.kopo.ctc.spring.board.web.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import kr.ac.kopo.ctc.spring.board.domain.User;
import kr.ac.kopo.ctc.spring.board.service.UserService;

@Component("authProvider")
public class AuthProvider implements AuthenticationProvider  {
    
    @Autowired
    UserService userService;
 
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        
        User user = userService.findByUsername(username);
        
        // email에 맞는 user가 없거나 비밀번호가 맞지 않는 경우.
        if (null == user || !user.getPassword().equals(password)) {
            return null;
        }
        
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        
        // 로그인한 계정에게 권한 부여
        if (user.isAdmin()) {
            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else {
            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_USER"));
        }
        
        // 로그인 성공시 로그인 사용자 정보 반환
        return new MyAuthenticaion(username, password, grantedAuthorityList, user);
    }
    
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
 
}

class MyAuthenticaion extends UsernamePasswordAuthenticationToken {

	private static final long serialVersionUID = 1L;

	User user;

	public MyAuthenticaion(String id, String password, List<GrantedAuthority> grantedAuthorityList, User user) {
		super(id, password, grantedAuthorityList);
		this.user = user;
	}

}
