package cn.gt.service.admins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gt.dao.admins.AdDao;

@Service("adService")
public class AdServiceImpl implements AdService {

	 @Autowired
	 private AdDao adDao;
}
