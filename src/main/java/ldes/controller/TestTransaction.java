package ldes.controller;

import ldes.dao.ATestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class TestTransaction {

    @Autowired
    private ATestDao aTestDao;

    @Autowired
    private DataSourceTransactionManager transactionManager;

    @Transactional(rollbackFor = Exception.class)
    @RequestMapping("/transactional/add")
    public void add(){
        try{
            aTestDao.insertIntoA("asdf");
            aTestDao.insertIntoA("aaaaaa");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // 通过AOP 实现, 只有捕获RuntimeException 时才会发生回滚

}
