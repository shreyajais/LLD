package LLD.Splitwise.domain.Split;

import LLD.Splitwise.domain.AbstractTimelineEntity;
import LLD.Splitwise.domain.Enums.SplitRatios;
import LLD.Splitwise.domain.User;

import java.util.List;
import java.util.UUID;

public class Split extends AbstractTimelineEntity {
    final String id;
    final User payer;

    final double amount;

    final SplitRatios splitRatios;
    final List<User> splitGroup;



    public Split(User payer, List<User> splitGroup, double amount, SplitRatios splitRatios, User updatedBy) {
        super(updatedBy);
        this.id = UUID.randomUUID().toString();
        this.payer = payer;
        this.splitGroup = splitGroup;
        this.amount = amount;
        this.splitRatios = splitRatios;
    }

    public String getId() {
        return id;
    }

    public User getPayer() {
        return payer;
    }

    public double getAmount() {
        return amount;
    }

    public SplitRatios getSplitRatios() {
        return splitRatios;
    }

    public List<User> getSplitGroup() {
        return splitGroup;
    }
}
