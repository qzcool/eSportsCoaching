package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TestDao;
import pojo.Students;


@Service("TestService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	//获取班级名称
	public List<String> classFind() {
		// TODO Auto-generated method stub
		List<String> list = testDao.classFind();
		return list;
	}

	public int stdInsert(Students student) {
		// TODO Auto-generated method stub
		int i = testDao.stdInsert(student);
		return i;
	}
}
