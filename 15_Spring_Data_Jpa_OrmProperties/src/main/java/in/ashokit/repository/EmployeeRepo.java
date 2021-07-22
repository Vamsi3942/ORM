package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Serializable>
{

}
