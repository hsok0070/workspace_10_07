package data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	@Autowired
	private EmpMapper empmapper;
	
	public void selectEmpResult(int empno) {
		EMP emp = empmapper.selectEmp(empno);
		System.out.println("사원명 : "+emp.getEname()+"mgr"+emp.getMgr());
	}
}
