package com.company.field;


import java.util.Arrays;

public class Field {
    private static char[][] mainField;

    public static void init(int num) {
        mainField = new char[num][num];
        for (char[] part : mainField) {
            Arrays.fill(part, ' ');
        }
    }

    //region GettersAndSetters

    public static char[][] getMainField() {
        return mainField;
    }

    //endregion
}
