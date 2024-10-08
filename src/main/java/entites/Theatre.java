package entites;

public class Theatre {
    String name;
    int maxCapacity;
    int customers;
    double revenue;

    public Theatre(String name, int maxCapacity, int customers, double revenue) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.customers = customers;
        this.revenue = revenue;
    }

    public void inscrire(int customers, double price) {
        if (this.customers != this.maxCapacity) {
            if (this.customers + customers < this.maxCapacity) {
                this.customers += customers;
                this.revenue += (price * customers);
            } else {
                int acceptedCustomers = maxCapacity - this.customers;
                this.customers+=acceptedCustomers;
                this.revenue += (price * acceptedCustomers);
                System.out.println("Le théâtre est complet ! Nous n'avons pu inscrire que " + acceptedCustomers + " personnes.");
            }
        }
        else {
            System.out.println("Le théâtre est complet !");
        }
    }

    public int getCustomers() {
        return customers;
    }

    public double getRevenue() {
        return revenue;
    }
}
