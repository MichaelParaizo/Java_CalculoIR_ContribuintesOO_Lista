package util;

public class TaxPayer {


    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;


    public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }


    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public Double getServicesIncome() {
        return servicesIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }


    public Double salaryTax() {


        if (getSalaryIncome() / 12 < 3000) {

            return this.salaryIncome += 0;

        } else if (getSalaryIncome() / 12 >= 3000 && getSalaryIncome() / 12 <= 5000) {

            return this.salaryIncome = (getSalaryIncome() * 10) / 100.0;


        } else {

            return this.salaryIncome = (getSalaryIncome() * 20.0) / 100.0;

        }


    }

    public Double servicesTax() {

        if (getServicesIncome() > 0.0) {

            return servicesIncome *= 0.15;

        } else {

            return this.servicesIncome = 0.00;

        }
    }

    public Double capitalTax() {

        if (getCapitalIncome() > 0) {

            return this.capitalIncome = (getCapitalIncome() * 20.0) / 100;

        } else {

            return this.capitalIncome = 0.00;

        }


    }


    public Double grossTax() {

        return getSalaryIncome() + getServicesIncome() + getCapitalIncome();


    }


    public Double taxRebate() {

        if (grossTax() > getEducationSpending() + getHealthSpending()) {

            return getEducationSpending() + getHealthSpending();


        } else {

            return grossTax() * 30.0 / 100;

        }
    }


    public Double netTax() {
        return grossTax() - taxRebate();
    }


}
