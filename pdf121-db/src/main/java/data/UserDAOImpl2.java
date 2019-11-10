package data;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDAOImpl2 extends JdbcDaoSupport implements UserDAO {

	@Override
	public List<User> findUserList() {
		String sql ="select * from users";
		UserRowMapper rowMapper = new UserRowMapper();
		List<User> userList = getJdbcTemplate().query(sql,rowMapper);
		return userList;
	}
	
	
}
