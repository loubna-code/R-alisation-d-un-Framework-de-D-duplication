package module_fusion;
import Alignement.Observer;

public class Fusion implements Observer {
    private Data dataInput1;
    private Data dataInput2;
    private Data dataOutput;
    private FusionStrategy fusionstrategy ;
    public void update() {}
    public Data getDataInput1() {
        return dataInput1;
    }
    public void setDataInput1(Data dataInput1) {
        this.dataInput1 = dataInput1;
    }
    public Data getDataInput2() {
        return dataInput2;
    }
    public void setDataInput2(Data dataInput2) {
        this.dataInput2 = dataInput2;
    }
    public Data getDataOutput() {
        return dataOutput;
    }
    public void setDataOutput(Data dataOutput) {
        this.dataOutput = dataOutput;
    }
    public FusionStrategy getFusionstrategy() {
        return fusionstrategy;
    }
    public void setFusionstrategy(FusionStrategy fusionstrategy) {
        this.fusionstrategy = fusionstrategy;
    }

    

    
}
