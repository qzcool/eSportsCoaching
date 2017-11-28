package cn.gt.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gt.dao.student.StDao;

@Service("stService")
public class StServiceImpl implements StService {

	@Autowired
	private StDao stDao;
}
