package LLD.Splitwise.domain.Split;

import LLD.Splitwise.domain.Enums.SplitRatios;

public class SplitFactory {

    SplitFactory instance;

    public SplitFactory getSplitMethodInstance(){
        if(instance==null) return new SplitFactory();
        else return instance;
    }
    public static SplitMethod getSplitMethod(SplitRatios splitRatios) {

        switch(splitRatios){
            case EQUAL : return new EqualSplitMethod();
            case PERCENTAGE:return new PercentageSplitMethod();
            default:return new EqualSplitMethod();
        }
    }
}
