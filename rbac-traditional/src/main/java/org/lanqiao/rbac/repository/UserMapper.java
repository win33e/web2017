package org.lanqiao.rbac.repository;

import java.util.List;

import org.lanqiao.rbac.core.Mapper;
import org.lanqiao.rbac.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends Mapper{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commons_user
     *
     * @mbg.generated Fri Aug 18 22:10:32 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commons_user
     *
     * @mbg.generated Fri Aug 18 22:10:32 CST 2017
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commons_user
     *
     * @mbg.generated Fri Aug 18 22:10:32 CST 2017
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commons_user
     *
     * @mbg.generated Fri Aug 18 22:10:32 CST 2017
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commons_user
     *
     * @mbg.generated Fri Aug 18 22:10:32 CST 2017
     */
    int updateByPrimaryKey(User record);
}