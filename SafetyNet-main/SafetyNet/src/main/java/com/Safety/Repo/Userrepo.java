package com.Safety.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Safety.Model.Register;
@EnableJpaRepositories
@Repository
public interface Userrepo extends JpaRepository<Register,Integer>{

	//Register findByEmail(String email);

	//Optional<Register> findOneByEmailAndPassword(String email, String encodedPassword);

//	Optional<Register> findOneByAddressAndGender(String gender, String encodedPassword);

	Optional<Register> findOneByAddressAndGender(String gender, String encodedPassword);

	//Register findByAddress(String address);

	Register findByAddress(String address);

}
