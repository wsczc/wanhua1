package com.qyq.dao;

import com.qyq.pojo.Dict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface DictDao extends JpaRepositoryImplementation<Dict,Integer> {
}
