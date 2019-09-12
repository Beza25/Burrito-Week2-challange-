import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int riceRandom, beansRandom, meatRandom, salsaRandom, veggiesRandom;


        //Store the buritos here
        String[] burritos = new String[10];

        //Options for buritos and with their randomization
        String[] rice = {"white", "brown", "no rice"};

        String[] meat = {"chiken", "steak", "carnidas", "chorizo", "sofirtas", "veggies"};

        String[] beans = {"pinto", "black", "no beans"};
        String[] salsa = {"mild", "medium", "hot", "no salsa"};
        String[] veggies = {"lettuce", "fajita veggies", "no veggies"};


        //Select one item from rice randomly and append it to the burritos array
        for (int i = 0; i < burritos.length; i++) {

                riceRandom = random.nextInt(rice.length);
                meatRandom = random.nextInt(meat.length);
                beansRandom = random.nextInt(beans.length);
                salsaRandom = random.nextInt(salsa.length);
                veggiesRandom = random.nextInt(veggies.length);
                burritos[i] = "Burrito " + (i + 1) + ": " + rice[riceRandom] + ", " + meat[meatRandom] + ", " + beans[beansRandom] + ", " + salsa[salsaRandom] + ", " + veggies[veggiesRandom];

            System.out.println(burritos[i]);

        }
    }


}
