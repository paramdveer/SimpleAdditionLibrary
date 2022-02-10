package com.sample;

public class StringAddition implements Addition {

    @Override
    public Object add(Object param1, Object param2) {
        if (param1 instanceof String && param2 instanceof String) {
            return param1+" "+param2;
        }
        return null;
    }
}
