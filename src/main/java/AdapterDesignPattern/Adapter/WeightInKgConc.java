package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeightInPound;

public class WeightInKgConc implements WeightInKg {
WeightInPound weightInPound;
    @Override
    public double getWeightInKg() {
        return weightInPound.inPounds()*45;
    }
}
