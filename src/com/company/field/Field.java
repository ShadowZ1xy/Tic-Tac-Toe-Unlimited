package com.company.field;


import java.util.Arrays;

public class Field {
    private static int size;
    private static char[][] mainField;

    public Field(int num) {
    }

    public static void init(int num) {
        size = num * num;
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
