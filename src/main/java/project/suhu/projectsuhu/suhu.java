/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.suhu.projectsuhu;

/**
 *
 * @author hp
 */
public class suhu {
    
    public float celcius(float x)
    {
        return (x-32)*5/9;
    }
    public float fahrenheit(float x)
    {
        return (float) (1.8*x+32);
    }
    public float kelvin(float x)
    {
        return (float) (x + 273);
    }
    public float ck(float x)
    {
        return (float) (x - 273);
    }
    
}
