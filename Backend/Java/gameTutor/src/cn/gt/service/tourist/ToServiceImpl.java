package cn.gt.service.tourist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gt.dao.tourist.ToDao;

@Service("toService")
public class ToServiceImpl implements ToService {

	@Autowired
	private ToDao toDao;
}
