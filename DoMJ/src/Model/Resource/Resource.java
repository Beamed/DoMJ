package Model.Resource;

public abstract class Resource {
    static final Integer DEFAULT_DEPLETION_AMT = 0;
    static final Integer DEFAULT_AMT = 1000;
    public Resource(String name_)
    {
        this(name_, DEFAULT_AMT, DEFAULT_DEPLETION_AMT);
    }

    public Resource(String name_, Integer amount) {
        this(name_, amount, DEFAULT_DEPLETION_AMT);
    }

    public Resource(String name_, Integer amount, Integer amt_to_deplete) {
        name = name_;
        amt = amount;
        depletion_amt = amt_to_deplete;
    }

    Integer deplete(Integer amt_to_deplete) {
        return amt -= amt_to_deplete;
    }

    Integer deplete() {
        return amt -= depletion_amt;
    }

    public String toString() {
        String str = name;
        if(depletion_amt > 0) {
            str += ": " + amt.toString();
        }
        return str;
    }
    private Integer depletion_amt;
    private Integer amt;
    private String name;
}