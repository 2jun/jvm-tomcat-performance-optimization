package top.yy2.zaj.jvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yy2.zaj.jvm.domain.Person;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeapController {
    List<Person> list= new ArrayList<>();
    @GetMapping("/heap")
    public String heap() throws Exception{
        while(true){
            list.add(new Person());
            Thread.sleep(1);
        }
    }
}
