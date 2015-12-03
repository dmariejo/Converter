package Model;

/**
 * Created by Dylan MARIE-JOSEPH on 02/12/15.
 */
public class Currency {

    private double convertValue;
    private String curren;

    public Currency(double convertValue, String curren){

        this.convertValue = convertValue;
        this.curren = curren;

    }

    public String getCurren(){

        return this.curren;

    }

    public double getConvertValue(){

        return this.convertValue;

    }

    public double converter(Currency to, double qty){

        return qty * this.convertValue / to.convertValue;

    }

}
