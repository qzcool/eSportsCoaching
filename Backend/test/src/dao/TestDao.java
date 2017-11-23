package dao;

import java.util.List;

import pojo.Students;

public interface TestDao {

	List<String> classFind();//获取班级名称

	int stdInsert(Students student);

}
