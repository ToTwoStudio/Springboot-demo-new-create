package com.totwo.createdemo.servicelmpl;



import com.totwo.createdemo.mapper.MainMapper;
import com.totwo.createdemo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MainServicelmpl implements MainService {
    @Autowired
    private MainMapper mMainMapper;

}
