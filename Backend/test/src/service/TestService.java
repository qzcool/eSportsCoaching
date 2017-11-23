package service;

import java.util.List;

import pojo.Students;

public interface TestService {

	public List<String> classFind();//获取班级名称
	
	public int stdInsert(Students student);

}
