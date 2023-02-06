/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.io.Serializable;

/**
 *
 * @author mauro
 */
public class Document implements Serializable {
 
    private static final long serialVersionUID
        = 100000000L;
    private String name;
    private String type;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    public String getName()
    {
        return name;
    }
 
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType (String type)
    {
        this.type = type;
    }
 
    @Override
    public String toString()
    {
        return "Documento clinico [name=" + name + "]. "+ type + "Tamano:"+ size;
    }
    
}
