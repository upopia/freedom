package edu.freedom.utopia.dao;

import edu.freedom.utopia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description todo
 * @Author: lihj
 * @Date: 2020/8/5 2:02 下午
 */

public interface UserRepository extends JpaRepository<User, Long> {

}
