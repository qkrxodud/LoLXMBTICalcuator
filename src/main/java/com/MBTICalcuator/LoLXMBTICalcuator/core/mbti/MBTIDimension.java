package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

public enum MBTIDimension {
    EI("E", "I"),
    SN("S", "N"),
    TF("T", "F"),
    JP("J", "P");

    private final String typeA; // A 유형 (첫 번째)
    private final String typeB; // B 유형 (두 번째)

    MBTIDimension(String typeA, String typeB) {
        this.typeA = typeA;
        this.typeB = typeB;
    }

    public String getTypeA() {
        return typeA;
    }

    public String getTypeB() {
        return typeB;
    }
}
