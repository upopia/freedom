package edu.freedom.utopia.dao;

import edu.freedom.utopia.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description 订单持久层
 * @Author: lihj
 * @Date: 2020/8/5 2:56 下午
 */
@Repository
public interface OrderRepository extends JpaRepository<Order,String> {
}
