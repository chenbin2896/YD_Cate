package top.axbt.to.controller.ZController.ZCusController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.axbt.to.domain.TbCusinfo;
import top.axbt.to.service.CusinfoService;

import static org.junit.Assert.*;

/**
 * Create by 张晨彬
 * 2018/12/2/002 16:37
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZCusViewControllerTest {

    @Autowired
    private CusinfoService cusinfoService;

    @Test
    public void test(){
        TbCusinfo tbCusinfo = cusinfoService.findOne(11111L);
        System.out.println(tbCusinfo);
    }



}