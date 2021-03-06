package edu.freedom.utopia.dao;

import edu.freedom.utopia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description 用户持久层
 * @Author: lihj
 * @Date: 2020/8/5 2:02 下午
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
