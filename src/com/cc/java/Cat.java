package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String getStringsAttributes(String flag){

        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
        
            default:
                return "#!?";
            
        }
    }


    public String getName() {
        return name;
    }


    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

  
    


}
