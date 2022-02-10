package com.sample;

public class IntegerAddition implements Addition{
    @Override
    public Object add(Object param1, Object param2) {
        if (param1 instanceof Integer && param2 instanceof Integer) {
            return (Integer) param1 + (Integer) param2;
        }
        return null;
    }
}
