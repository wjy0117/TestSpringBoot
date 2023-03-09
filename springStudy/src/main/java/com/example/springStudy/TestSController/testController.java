package com.example.springStudy.TestSController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller 어노테이션은 해당클래스가 컨트롤러라는 것을 명시한다.
//어노테이션의 장점, 1.폴더나 파일의 이름을 줄여서 표현 2. 정보은닉
@Controller //@ 어노테이션
//@RequestMapping 어노테이션은 "/TestS/"로 접근하는 url 처리를 이 testController 클래스에서 처리한다고 알린다.
//접근할 이름 설정, 형식적으로 실행할 html을 가진 폴더명과 동일하게 설정. localhost:8080/TestS/(어쩌고)

//url로 /TestS/가 입력되면 아래의 testController클래스 실행.
@RequestMapping("/TestS/")
public class testController {
    //@GetMapping 어노테이션은 /hello로 접근하기위한 url을 testController에서 처리한다 알린다.
    //아래의 Hello 메소드 호출
    //위의 TestS뒤에 어떤식으로 호출하여 폴더내의 파일을 실행할지 설정.
    //@RequestMapping으로 폴더명을 정하고, @GetMapping으로 파일에 접근할

    //url로 /hellp가 입력되면 Hello()함수 실행
    @GetMapping("/hello")
    public String Hello(){
        //template 폴더 내의 tests 폴더 내의 hello파일 실행.
        return "/TestS/hello";
    }
    @GetMapping("/hello2")
    public String Hello2(){
        return "/TestS/test";
    }
}