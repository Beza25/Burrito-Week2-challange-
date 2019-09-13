import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int riceRandom, beansRandom, meatRandom, salsaRandom, veggiesRandom, cheeseRandom, guacRandom,
                quesoRandom, sourCreamRandom;
        String cheese, guac, queso, sourCream;

        //Store the buritos here
        String[] burritos = new String[25];

        //Options for buritos and with their randomization
        String[] rice = {"white", "brown", "none", "all"};
        String[] meat = {"chiken", "steak", "carnidas", "chorizo", "sofirtas", "veggies", "none",  "all"};
        String[] beans = {"pinto", "black", "none"};
        String[] salsa = {"mild", "medium", "hot", "none", "all"};
        String[] veggies = {"lettuce", "fajita veggies", "none", "all"};
        String[] Cheese = {"yes", "no"};
        String[] Guac = {"yes", "no"};
        String[] Queso = {"yes", "no"};
        String[] SourCream = {"yes", "no"};



        //Select one item from rice randomly and append it to the burritos array
        for (int i = 0; i < burritos.length; i++) {
            riceRandom = random.nextInt(rice.length);
            meatRandom = random.nextInt(meat.length);
            beansRandom = random.nextInt(beans.length);
            salsaRandom = random.nextInt(salsa.length);
            veggiesRandom = random.nextInt(veggies.length);
            cheeseRandom = random.nextInt(Cheese.length);
            guacRandom = random.nextInt(Guac.length);
            quesoRandom = random.nextInt(Queso.length);
            sourCreamRandom = random.nextInt(SourCream.length);
            if(Cheese[cheeseRandom].equals("yes")){
                cheese = "cheese";
            } else if (Guac[guacRandom].equals("yes")) {
                guac = "guac";
            }else if(Queso[quesoRandom].equals("yes")){
                queso = "queso";
            }else if(SourCream[sourCreamRandom].equals("yes")){
            }

            burritos[i] = "Burrito " + (i + 1) + ": " + rice[riceRandom] + ", " + meat[meatRandom] + ", " + beans[beansRandom] + ", " + salsa[salsaRandom] + ", " + veggies[veggiesRandom];

            System.out.println(burritos[i ]);

        }
    }


}
