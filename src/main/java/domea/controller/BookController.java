package domea.controller;

import com.google.gson.Gson;
import domea.service.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class BookController {
    @Autowired
    BookManager bookManager;

    @RequestMapping("/books")
    @ResponseBody
    public  String books(){
        return  new Gson().toJson(bookManager.getBooks());
       // return  "{\"code\":1,\"msg\":1}";
    }





}
