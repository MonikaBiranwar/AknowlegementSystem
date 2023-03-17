package com.elemetAknowlegment.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elemetAknowlegment.Entity.address;

@Repository
public interface addressRepository extends JpaRepository<address, Serializable>{

}
