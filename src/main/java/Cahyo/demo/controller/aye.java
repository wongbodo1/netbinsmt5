/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cahyo.demo.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author Cahyo
 */

@Controller
public class aye {
 @RequestMapping("/index")
 public Map<String, Object> index(@RequestParam("nama")String nama){   
     Map<String, Object> hasil = new HashMap<>();
     hasil.put("nama", nama);
     hasil.put("jurusan", "Teknik Informatika");     
     return hasil;
 }
}


