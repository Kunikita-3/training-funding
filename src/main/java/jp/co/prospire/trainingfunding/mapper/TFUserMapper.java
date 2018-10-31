package jp.co.prospire.trainingfunding.mapper;

import jp.co.prospire.trainingfunding.domain.TFUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TFUserMapper {
    List<TFUser> selectTFUserAll();
}
