package com.appletantam.yesql_back.src.auth.dao;

import com.appletantam.yesql_back.src.auth.dto.UserDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AuthDAOImpl implements AuthDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public UserDTO adduser(UserDTO userDTO) {
        sqlSession.insert("auth.insertUser", userDTO);
        return userDTO;
    }

    @Override
    public String checkDuplicatedId(String userId) {
        return sqlSession.selectOne("auth.selectDuplicatedId", userId);
    }

    @Override
    public UserDTO selectLogin(UserDTO userDTO) {
        return sqlSession.selectOne("auth.selectLogin", userDTO);
    }

    @Override
    public String selectCd(String userId) { return sqlSession.selectOne("auth.selectCd", userId); }

    @Override
    public void addUserDatabase(Map<String, String> map) { sqlSession.insert("auth.insertUserDatabase", map); }
}