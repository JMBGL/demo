package com.practice.dao;

import com.practice.pojo.WrapPlatformFeedProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Jet Ma
 * @Created: 2022-12-09
 */
@Repository
public interface WrapPlatformFeedProviderDao extends JpaRepository<WrapPlatformFeedProvider, Long> {

}
