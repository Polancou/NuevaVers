/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author RamsesMtnz
 */
@ManagedBean
public class beanImagenes {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 7; i++) {
            images.add( i + ".jpg");
        }
    }
 
    public List<String> getImages() {
        return images;
    }
}
