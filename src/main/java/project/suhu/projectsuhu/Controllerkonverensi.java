/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.suhu.projectsuhu;

import java.util.Scanner;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class Controllerkonverensi {
    suhu sh = new suhu();
    @RequestMapping("/Konversi")
    public String getsuhu(Model mode,HttpServletRequest data){
        
        
        String konverensiA,konverensiB,konverensiC,konverensiD;
        String angka = data.getParameter("input");
        Integer input = Integer.valueOf(angka);
        float suhuA,suhuB,suhuC,suhuD;
       
        suhuA = sh.celcius(input);
        konverensiA = input + " °F"+ " = " + suhuA + " °C";
        suhuB = sh.fahrenheit(input);
        konverensiB = input +" °C" + " = " + suhuB + " °F";
        suhuC = sh.kelvin(input);  
        konverensiC =  input +" °C"+ " = " + suhuC + " °K";
        suhuD = sh.ck(input);
        konverensiD = input + " °K" + " = " + suhuD + " °C";
        
            
        
        mode.addAttribute("hasilA", konverensiA);
        mode.addAttribute("hasilB", konverensiB);
        mode.addAttribute("hasilC", konverensiC);
        mode.addAttribute("hasilD", konverensiD);
        return "view";
        
    }
    @RequestMapping("/Loop")
    public String getLoop(){
        String hasil = " ";
        
        for(int i = 55; i >= -1; i--){
            hasil += " Hasil : " + i + "<br>";
        }
        return hasil;
    }
}
