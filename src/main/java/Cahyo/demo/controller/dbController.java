/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cahyo.demo.controller;

import Cahyo.demo.entity.Mahasiswa;
import Cahyo.demo.repo.MahasiswaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Cahyo
 */
@Controller
public class dbController {
    @Autowired
    private MahasiswaRepo mhsRepo;
    @RequestMapping("/daftar-mahasiswa")
    public void daftarMahasiswa(Model model){
        model.addAttribute("daftarMahasiswa", mhsRepo.findAll());
    }
    @RequestMapping(value = "/tambah", method = RequestMethod.GET)
    public void addData(@ModelAttribute("mhs") Mahasiswa mhs,
            BindingResult bind){}
    @RequestMapping(value = "/tambah", method = RequestMethod.POST)
    public void addDataProcessing(@ModelAttribute("mhs") Mahasiswa mhs,
            BindingResult bind){
    System.out.println(mhs.getNim());
    System.out.println(mhs.getNama());
    System.out.println(mhs.getJurusan());
  
//prosses simpan data
    mhsRepo.save(mhs);
    }
}
