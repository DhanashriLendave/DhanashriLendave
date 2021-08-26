 * @author Dhanashree
 *code for demonstrate inheritance
 */

// super class Google
class Google{
    static String company="Google";
    int noOfEmployees=95000;
    void print(){
        System.out.println("Welcome to "+company);
        System.out.println("We have "+noOfEmployees+" no of employees.");
    }
    void work(){
        System.out.println("We are working in Google");
    }
}
/*
Single inheritance
Super class-Google
 child class- Development*/

class Development extends Google{
    int noOfEmployees=10000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in development department.");
    }
    void work(){
        System.out.println("We are working in development department of "+company);
    }
}
    /*
    hierarchical inheritance
    Super class-Google
     child class- Design*/

    class Design extends Google{
        int noOfEmployees=15000;
        void print(){
            System.out.println("We have "+noOfEmployees+" no of employees in design department.");
        }
        void work(){
            System.out.println("We are working in design department of "+company);
        }
    }

    /*
    multilevel inheritance
    first super class-Google
    Second Super class-Design
     child class- Testing */

    class Testing extends Design{
        int noOfEmployees=18000;
        void print(){
            System.out.println("We have "+noOfEmployees+" no of employees in testing department.");
        }
        void work(){
            System.out.println("We are working in testing department of "+company);
        }
    }
    /*
    single inheritance
    Super class-Google
     child class- Sales*/

    class Sales extends Google{
        int noOfEmployees=20000;
        void print(){
            System.out.println("We have "+noOfEmployees+" no of employees in sales department.");
        }
        void work(){
            System.out.println("We are working in sales department of "+company);
        }
    }

    /*
    multilevel inheritance
    first Super class-Google
    second super class- Sales
     child class- Account*/

    class Account extends Sales{
        int noOfEmployees=40000;
        void print(){
            System.out.println("We have "+noOfEmployees+" no of employees in account department.");
        }
        void work(){
            System.out.println("We are working in account department of "+company);
        }
    }


    class Java24 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google g1=new Google();
        g1.print();
        g1.work();

        Development d1=new Development();
        d1.work();
        d1.print();

        Design ds=new Design();
        ds.print();
        ds.work();

        Testing t1= new Testing();
        t1.print();
        t1.work();

        Sales s1=new Sales();
        s1.print();
        s1.work();

        Account ac=new Account();
        ac.work();
        ac.print();
	}

}
