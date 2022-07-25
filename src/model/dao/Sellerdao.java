package model.dao;

import java.util.List;

import model.entities.Seller;

public interface Sellerdao {
	//Operação responsável por inserir esse obj no banco de dados que vai ser enviado como parâmentro de entrada 
	void insert(Seller obj);
	
	void update(Seller obj);
	void deleteById(Integer id);

	//Essa operação vai ser responsável por pegar ID e consultar no banco de dados um obj que tenha esse ID, se existir vai retornar e se não retorna null 
	Seller findById(Integer id);
	
	//Para retornar todos os departamententos
	List<Seller> findAll();
}
