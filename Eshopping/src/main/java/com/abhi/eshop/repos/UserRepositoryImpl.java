//package com.abhi.eshop.repos;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.EmptyResultDataAccessException;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//import org.springframework.stereotype.Repository;
//
//import com.abhi.eshop.entities.User;
//
//import java.sql.PreparedStatement;
//import java.sql.Statement;
////import java.util.List;
//
//
//@Repository
//public abstract class UserRepositoryImpl implements UserRepository {
//	
//	   private static final String SQL_CREATE = "INSERT INTO ET_USERS(USER_ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD) VALUES(NEXTVAL('ET_USERS_SEQ'), ?, ?, ?, ?)";
//	    private static final String SQL_COUNT_BY_EMAIL = "SELECT COUNT(*) FROM ET_USERS WHERE EMAIL = ?";
////	    private static final String SQL_FIND_BY_ID = "SELECT USER_ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD " +
////	            "FROM ET_USERS WHERE USER_ID = ?";
////	    private static final String SQL_FIND_BY_EMAIL = "SELECT USER_ID, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD " +
////	            "FROM ET_USERS WHERE EMAIL = ?";
//
//	    @Autowired
//	    JdbcTemplate jdbcTemplate;
//
//	    @Override
//	    public User create(String firstName, String lastName, String email, String password) {
////	            KeyHolder keyHolder = new GeneratedKeyHolder();
//	            jdbcTemplate.update(connection -> {
//	                PreparedStatement ps = connection.prepareStatement(SQL_CREATE, Statement.RETURN_GENERATED_KEYS);
//	                ps.setString(1, firstName);
//	                ps.setString(2, lastName);
//	                ps.setString(3, email);
//	                ps.setString(4, password);
//	                return ps;
//	            });
//				return null;
//	            
//	     
//	        
//	    }
//	    
//	 
//
////	    @Override
////	    public User findByEmailAndPassword(String email, String password)  {
////	      
////            List<User> user = jdbcTemplate.query(SQL_FIND_BY_EMAIL, new Object[]{email}, userRowMapper);
////	            if(!(password = user.getPassword()))
////	            	System.out.println("Invalid email/password");
////	         
////	            return user;
////
////	    }
//
//	    @Override
//	    public Integer getCountByEmail(String email) {
//	        return jdbcTemplate.queryForObject(SQL_COUNT_BY_EMAIL, Integer.class);
//	    }
//
////	    @Override
////	    public User findById(Integer userId) {
////	        return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[]{userId}, userRowMapper);
////	    }
//
//	    private RowMapper<User> userRowMapper = ((rs, rowNum) -> {
//	        return new User(
//	                rs.getString("FIRST_NAME"),
//	                rs.getString("LAST_NAME"),
//	                rs.getString("EMAIL"),
//	                rs.getString("PASSWORD"));
//	    });
//	
//	
//
//}
