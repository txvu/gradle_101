package org.gradle.poetry;
import java.util.ArrayList;
import java.util.List;


public class Poetry {
    public List<String> isaacVu() {
        List<String> lines = new ArrayList<String>();
        lines.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        lines.add("is nostrud exercitation ullamco laboris nisi ut aliquip ex");

        return lines;
    }

    public void emit(List<String> lines) {
        for (String line: lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Poetry p = new Poetry();
        p.emit(p.isaacVu());
    }
}
