package ch.gc.gicc.converter.transactions;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long>{
	
	List<TransactionEntity> findAll();
}
