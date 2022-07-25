package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	//Opera��o responsavel por inserir esse obj no banco de dados que vai ser enviado como paramentro de entrada 
	void insert(Department obj);
	
	void update(Department obj);
	void deleteById(Integer id);
	
	//Essa opera��o vai ser responsavel por pegar ID e consultar no banco de dados um obj que tenha esse ID, se existir vai retornar e se n�o retorna null 
	Department findById(Integer id);
	
	//Para retornar todos os departamententos
	List<Department> findAll();	
}
