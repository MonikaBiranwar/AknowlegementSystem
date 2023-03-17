package com.elemetAknowlegment.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elemetAknowlegment.Entity.orderItems;

@Repository
public interface orderItemsRepository extends JpaRepository<orderItems, Serializable>{

}
