package com.minlia.guide.long2string;


import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertThrows;

class Long2StringTest {

    long longPrimitiveVariable = 100L;
    Long longBoxedObject = 150L;


    @Test
    public void long_toString() {
        String primitiveString = Long.toString(longPrimitiveVariable);
        String stringFromLong = Long.toString(longBoxedObject);

        System.out.println(primitiveString);
        System.out.println(stringFromLong);
    }

    @Test
    public void long_toString_when_null_then_null_pointer_exception() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            longBoxedObject = null;
            String primitiveString = Long.toString(longPrimitiveVariable);
            String stringFromLong = Long.toString(longBoxedObject);

            System.out.println(primitiveString);
            System.out.println(stringFromLong);
        });
        //java.lang.NullPointerException: Cannot invoke "java.lang.Long.longValue()" because "this.obj" is null
        System.out.println(exception);


    }

    @Test
    public void string_valueOf() {
        String primitiveString = String.valueOf(longPrimitiveVariable);
        String stringFromLong = String.valueOf(longBoxedObject);

        System.out.println(primitiveString);
        System.out.println(stringFromLong);
    }


    @Test
    public void string_valueOf_when_null_then_null_string() {
        longBoxedObject = null;

        String primitiveString = String.valueOf(longPrimitiveVariable);
        String stringFromLong = String.valueOf(longBoxedObject);

        System.out.println(primitiveString);
        System.out.println(stringFromLong);
    }

    @Test
    public void string_format() {

        String primitiveString = String.format("%d", longPrimitiveVariable);
        String stringFromLong = String.format("%d", longBoxedObject);

        System.out.println(primitiveString);
        System.out.println(stringFromLong);
    }

    @Test
    public void string_format_when_null_then_null_string() {

        longBoxedObject = null;
        String primitiveString = String.format("%d", longPrimitiveVariable);
        String stringFromLong = String.format("%d", longBoxedObject);

        System.out.println(primitiveString);
        System.out.println(stringFromLong);
    }


    @Test
    public void long_object_toString() {
        String stringFromLong = longBoxedObject.toString();
        System.out.println(stringFromLong);
    }

    @Test
    public void long_object_toString_when_null_then_null_pointer_exception() {

        longBoxedObject = null;
        Exception exception = assertThrows(NullPointerException.class, () -> {
            String stringFromLong = longBoxedObject.toString();
            System.out.println(stringFromLong);
        });
        System.out.println(exception);
    }

    @Test
    public void plus_operator() {
        String primitiveString = "" + longPrimitiveVariable;
        String stringFromLong = "" + longBoxedObject;

        System.out.println(primitiveString);
        System.out.println(stringFromLong);
    }


    @Test
    public void stringBuilder_or_StringBuffer() {
        String primitiveString = new StringBuilder().append(longPrimitiveVariable).toString();
        String stringFromLong = new StringBuilder().append(longBoxedObject).toString();

        System.out.println(primitiveString);
        System.out.println(stringFromLong);
    }

    @Test
    public void decimal_format() {
        String primitiveString = new DecimalFormat("#").format(longPrimitiveVariable);
        String stringFromLong = new DecimalFormat("#").format(longBoxedObject);

        System.out.println(primitiveString);
        System.out.println(stringFromLong);
    }

    @Test
    public void decimal_format_when_null_then_illegal_argument_exception() {
        longBoxedObject = null;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            String stringFromLong = new DecimalFormat("#").format(longBoxedObject);
            System.out.println(stringFromLong);
        });
        System.out.println(exception);
    }


}
