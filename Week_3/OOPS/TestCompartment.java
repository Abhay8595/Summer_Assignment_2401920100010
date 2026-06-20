public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];

        for(int i = 0; i < compartments.length; i++) {
            int num = (int)(Math.random() * 4) + 1;
            if(num==1){
                compartments[i]=new FirstClass();
                System.out.println(compartments[i].notice());
            }
            else if(num==2){
                compartments[i]=new General();
                System.out.println(compartments[i].notice());
            }
            else if(num==3){
                compartments[i]=new Ladies();
                System.out.println(compartments[i].notice());
            }
            else{
                compartments[i]=new Luggage();
                System.out.println(compartments[i].notice());
            }
        }
    }
}
