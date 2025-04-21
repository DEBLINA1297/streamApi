package April18T;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group transactions by type and sum their amounts.
class Transaction
{
    String type;
    double amount;
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
public class GroupTransactions {
    public static void main(String[] args) {
        List<Transaction> t = Arrays.asList(
                new Transaction("Pg", 7000),
                new Transaction("Transport", 500),
                new Transaction("Lunch", 1000),
                new Transaction("SkinCare", 1000),
                new Transaction("Lunch", 2000)
        );
        Map<String,Double>  M= t.stream().collect(Collectors
                .groupingBy(Transaction::getType,Collectors.summingDouble(Transaction::getAmount)));
        System.out.println(M);
    }
}
