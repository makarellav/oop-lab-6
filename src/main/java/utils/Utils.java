package utils;

import java.util.HashSet;
import java.util.Set;

public class Utils {
    public static Set<String> allowedSizes = new HashSet<>(){{
        add("Small");
        add("Medium");
        add("Large");
    }};

    public static Set<String> allowedAgeGroups = new HashSet<>(){{
        add("0+");
        add("3+");
        add("6+");
        add("12+");
        add("18+");
    }};
}
