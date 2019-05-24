package com.company;

// Lukasz Rachwal S19638
// Maciej Rybacki S18553

public class ChemicalElement {

    private String name;
    private String symbolicName;
    private int atomicNumber;
    private Type type;

    public ChemicalElement(String name, String symbolicName, int atomicNumber, Type type) {
        this.name = name;
        this.symbolicName = symbolicName;
        this.atomicNumber = atomicNumber;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getSymbolicName() {
        return this.symbolicName;
    }

    public int getAtomicNumber() {
        return this.atomicNumber;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isAlkaliMetal() {
        if (this.type.equals(Type.ALKALI))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isTransitionMetal() {
        if (this.type.equals(Type.TRANSITION))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isMetal() {
        if (this.type.equals(Type.METAL))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public enum Type {
        ALKALI, TRANSITION, METAL;
    }
}
