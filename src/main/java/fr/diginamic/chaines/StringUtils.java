package fr.diginamic.chaines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class StringUtils {
    public static String premiereLettreMaj(String nom){
        return nom.substring(0, 1).toUpperCase()+nom.substring(1);
    }

    public static String append(Object... objects){
        StringBuilder builder = new StringBuilder();

        for(int i=0; i<objects.length; i++){
            builder.append(objects[i]);
        }

        return builder.toString();
    }
}
