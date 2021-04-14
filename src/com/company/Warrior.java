package com.company;

public class Warrior extends Hero{
    public Warrior() {
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior суперспособность " + superAbilityType;
    }
}
