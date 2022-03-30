package fis.fresher.java.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import fis.fresher.java.jpa.entity.OrderProduct;
import fis.fresher.java.jpa.entity.OrderRow;
@Repository
public interface orderproductRepository extends JpaRepository<OrderProduct, Long>{

}
