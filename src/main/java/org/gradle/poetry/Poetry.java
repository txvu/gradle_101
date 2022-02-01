package org.gradle.poetry;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Base64;


public class Poetry {
    public List<String> isaacVu() {
        List<String> lines = new ArrayList<String>();
        lines.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        lines.add("is nostrud exercitation ullamco laboris nisi ut aliquip ex");

        return lines;
    }

    public void emit(List<String> lines) {
        for (String line: lines) {
            System.out.println(encode(line));
        }
    }

    public String encode(String text) {
        Base64 codec = new Base64();
        return new String(codec.encode(text.getBytes()));
    }

    public static void main(String[] args) {
        Poetry p = new Poetry();
        p.emit(p.isaacVu());
    }
}
