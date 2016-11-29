package main.java;

public class AppendNumeralResult {

    private String numeralToAppend;
    private int valueOfAppendedNumeralToSubtract;

    public AppendNumeralResult(String numeralToAppend, int valueOfAppendedNumeralToSubtract) {
        this.numeralToAppend = numeralToAppend;
        this.valueOfAppendedNumeralToSubtract = valueOfAppendedNumeralToSubtract;
    }

    public int getValueOfAppendedNumeralToSubtract() {
        return valueOfAppendedNumeralToSubtract;
    }

    public String getNumeralToAppend() {
        return numeralToAppend;
    }
}
