package com.elemetAknowlegment.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elemetAknowlegment.Entity.orderHeader;

@Repository
public interface orderHeaderRepository extends JpaRepository<orderHeader, Serializable>{

}
