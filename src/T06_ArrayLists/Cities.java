package T06_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {

        List<String> cityList = new ArrayList<>(); // erstellt eine ArrayList "cityList"

        cityList.add("Oslo"); // neue Element hinzufügen
        cityList.add("Paris");
        cityList.add("Rome");
        System.out.println("cityList = " + cityList);

        int index = cityList.indexOf("Paris"); // sucht "Paris" index
        cityList.add(index, "London");  // fügt London vor Paris ein
        System.out.println("cityList = " + cityList);
    }
}
