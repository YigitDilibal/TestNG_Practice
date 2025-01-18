package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P01_annotations {


    @Test
    public void yigit(){
        System.out.println("Yigit Testi calisti");
    }

    @Test (dependsOnMethods = "yigit")
    public void seda(){
        System.out.println("Seda Testi calisti");
    }

    @Test (priority = -1)
    public void sumeyra(){
        System.out.println("Sumeyra Testi calisti");
    }

    @Test
    public void babayigit(){
        System.out.println("babayigit Testi calisti");
    }



}
