package dao;

import java.util.List;

import ent.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deletedById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
