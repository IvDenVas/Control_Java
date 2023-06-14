package model;

import java.io.FileWriter;
import java.io.IOException;

public class Data implements Writeable{
    @Override
    public  void write(Object o, String name) {
        try(FileWriter writer = new FileWriter(name, true))
        {
            writer.write(o.toString());
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
