package model.dao;



public interface  DepartmentDao {
  
    void insert(Depart obj);
    void update(Department obj);
    void deleteByiD(integer id);
    Department findById(Integer id);
    List<Department> findAll();

   


    
}
