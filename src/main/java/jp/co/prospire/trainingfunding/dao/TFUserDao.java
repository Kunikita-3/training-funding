package jp.co.prospire.trainingfunding.dao;

import jp.co.prospire.trainingfunding.domain.TFUser;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TFUserDao {
    private final SqlSession sqlSession;

    public TFUserDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<TFUser> selectTFUserAll() {
        return this.sqlSession.selectList("selectTFUserAll");
    }

}
