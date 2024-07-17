package LLD.ATM.domain;

import LLD.ATM.domain.Processor.WithdrawalCashProcessor;
import LLD.ATM.domain.State.AtmState;

import java.util.List;

public class Atm {
    AtmState atmState;
    List<WithdrawalCashProcessor> withdrawalCashProcessors;
}
// Design Pattern:
// chain of resposibility
