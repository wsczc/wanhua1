package com.qyq.dao;

import com.qyq.pojo.Dict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DictDao extends JpaRepositoryImplementation<Dict,Integer> {
    Dict findByid(Integer id);

    @Modifying
    @Query(value ="select * from t_dict d where d.pid is null",nativeQuery = true)
    List<Dict> findBypid(Integer pid);

    @Modifying
    @Query(value ="select * from t_dict d where d.pid=?1",nativeQuery = true)
    List<Dict> findBypidz(Integer pid);

    List<Dict> findBydatatag(Integer tagid);

    @Transactional
    @Modifying
    @Query(value ="delete from t_dict where data_tag = ?1",nativeQuery = true)
    void deleteBydatatag(Integer tagid);
}
