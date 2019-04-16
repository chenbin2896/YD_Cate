package top.axbt.to;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Create by 张晨彬
 * 2018/12/10/010 14:26
 */


public class RestTest {

    @Test
    public void test(){

        RestTemplate template = new RestTemplate();
        ResponseEntity<String> forEntity = template.getForEntity("http://localhost/mancategory/findAll", String.class);
        String mancategories =  forEntity.getBody();
    }
}
