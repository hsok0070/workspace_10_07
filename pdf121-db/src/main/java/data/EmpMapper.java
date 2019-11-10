package data;

import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
	
	EMP selectEmp(@Param("en") int empno);

}
