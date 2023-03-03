
public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);

        model.subscribe(new PhoneModel.Observer(){

            public void print(){
                System.out.println("Observador adicionado");
            }
        });

        model.unscribe(new PhoneModel.Observer() {
            public void print(){
                System.out.println("Observador adicionado");
            }
        });

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
