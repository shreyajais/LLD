package LLD.Splitwise.domain;
import LLD.Splitwise.domain.Enums.SplitType;
import LLD.Splitwise.domain.Transactions.Transaction;

import java.util.List;
import java.util.Map;

public class UserBalanceSheet {
   List<Transaction> transactions;
   List<Transaction> transactionsPaidByUser;
   List<Transaction> transactionsPaidForUser;
   Double totalAmountUserBorrowedNowPending;
   Double totalAmountUserLendNowPending;
   Map<User, Integer> totalAmountLendToUser;
   Map<User, Integer> totalAmountBorrowedFromUser;
}
