
public class Calculator {

    private String number1;
    private String number2;
    private String operator;
    
    private Float result;
    private static Calculator instance = null;

    public Calculator(){
        number1 = "";
        number2 = "";
        operator = "";
        result =  (float) 0.0;
    }

    public static Calculator getInstance(){
        if(instance == null){
            instance = new Calculator();
        }
        return instance;
    }

    public void setNumber(String number){
        if(operator.equals("")){
            number1 += number;
        } else {
            number2 += number;
        }
    }

    public void clear(){
        number1 = "";
        number2 = "";
        operator = "";
    }
    

    public void clearResult(){
        result = (float) 0;
    }

    public void setOperator(String operator){
        if(number1.equals("")){
            number1 = Float.toString(result);
            this.operator = operator;
        }
        else{
            this.operator = operator;
        }
    }

    public Float calculate(){
        result = calc();
        return result;
    }

    private Float calc(){

        if(number2.equals("")){
            number2 = number1;
        }
        else if(number1.equals("")){
            number1 = Float.toString(result);
        }

        System.out.println(number1 + " " + operator + " " + number2);
        switch(operator){
            case "+":
                result = Float.parseFloat(number1) + Float.parseFloat(number2);
                break;
            case "-":
                result = Float.parseFloat(number1) - Float.parseFloat(number2);
                break;
            case "*":
                result = Float.parseFloat(number1) * Float.parseFloat(number2);
                break;
            case "/":
                result = Float.parseFloat(number1) / Float.parseFloat(number2);
                break;
                
        }
        clear();
        return result;
    }

}
