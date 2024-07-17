package LLD.VendingMachine.domain;

public abstract class VendingMachineState {

    public void idleState(){
        System.out.println("System in idle state");
    }

    public void takeOperationInput(int placeholder, int count){
        System.out.println("System in operation state");
    }

    public void takePayment(Cash cash){

    }

    public void denspenseItem(){
        System.out.println("System in despense item  state");
    }

    public void returnExchange(int placeholder, int count){
        System.out.println("System in operation state");
    }

    public void operationCompleted(){
        System.out.println("System in operation item  state");
    }
}
