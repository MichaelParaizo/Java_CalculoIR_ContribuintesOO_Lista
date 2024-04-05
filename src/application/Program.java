package application;

import util.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new java.util.Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        TaxPayer taxPayer;


        System.out.printf("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println();
            System.out.println("Digite os dados do " + i + "o contribuinte: ");
            System.out.printf("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();
            System.out.printf("Renda anual com prestação de serviço: ");
            double servicesIncome = sc.nextDouble();
            System.out.printf("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.printf("Gastos médicos: ");
            double healthSpending = sc.nextDouble();
            System.out.printf("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();


            taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            list.add(taxPayer);

            taxPayer.salaryTax();
            taxPayer.servicesTax();
            taxPayer.capitalTax();


        }


        for (TaxPayer element : list) {

            for (int i = 0; i < list.size(); i++) {

                element = list.get(i);
                System.out.println();
                System.out.println("Resumo do " + (i + 1) + " contribuinte: ");


                System.out.printf("Imposto bruto total:  %.2f%n", element.grossTax());
                System.out.printf("Abatimento:  %.2f%n", element.taxRebate());
                System.out.printf("Imposto devido:  %.2f%n", element.netTax());


            }

        }


        sc.close();

    }
}
