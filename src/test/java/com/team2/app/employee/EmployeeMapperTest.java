package com.team2.app.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class EmployeeMapperTest {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	//비밀번호 암호화
    @Test
    void test() throws Exception{
            EmployeeVO employeeVO = new EmployeeVO();
            employeeVO.setEmpId("rlagofls0824");
            employeeVO.setEmpPwd(passwordEncoder.encode("0824"));
            employeeMapper.chpass(employeeVO);
    }
    
}
