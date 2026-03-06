package ro.ase.acs.classes;

import ro.ase.acs.interfaces.AbstractValuesReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValuesReader implements AbstractValuesReader {
   private final static Scanner scanner=new Scanner(System.in);

    @Override
    public List<Integer> readValues(int numberOfValues) {
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<numberOfValues;i++){
            System.out.print("Value = ");
            list.add(scanner.nextInt());
        }

        return list;
    }
}
