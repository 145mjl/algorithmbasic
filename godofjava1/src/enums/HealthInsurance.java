package enums;

public enum HealthInsurance {
    LEVEL_ONE(1000,1.0),
    LEVEL_TWO(2000,2.0),
    LEVEL_THREE(3000,3.2),
    LEVEL_FOUR(4000,4.5),
    LEVEL_FIVE(5000,5.6),
    LEVEL_SIX(6000,7.1);

    private final int salary;
    private final double ratio;

    HealthInsurance(int salary,double ratio){
        this.salary=salary;
        this.ratio=ratio;
    }

    public int getSalary(){
        return salary;
    }

    public double getRatio(){
        return ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        HealthInsurance result=null;
        HealthInsurance[] values=HealthInsurance.values();
        for(HealthInsurance value:values){
            if(value.getSalary()==(salary/1000+1)*1000)
                result=value;
        }

        if(salary>7000){
            result=HealthInsurance.LEVEL_SIX;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] salaryArray=new int[]{1500,5500,8000};
        HealthInsurance[] insurances=new HealthInsurance[3];
        insurances[0]=HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurances[1]=HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurances[2]=HealthInsurance.getHealthInsurance(salaryArray[2]);

        for(int loop=0;loop<3;loop++){
            System.out.println(salaryArray[loop]+"="+insurances[loop]+","+insurances[loop].getRatio());
        }
    }
}
