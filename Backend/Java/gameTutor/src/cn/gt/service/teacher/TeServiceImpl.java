package cn.gt.service.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gt.dao.teacher.TeDao;

@Service("teService")
public class TeServiceImpl implements TeService {

	@Autowired
	private TeDao tedao;
}
