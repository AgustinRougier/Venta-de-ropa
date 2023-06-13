import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQue tipo de prenda le gustaria llevar?");
        System.out.println("\n1.Una camisa");
        System.out.println("\n2.Un pantalon");
        System.out.println("\n3.Unas zapatillas?\n");

        int opcion = 0;

        while (opcion == 0){
            String entrada = scanner.nextLine();
            switch (entrada.toLowerCase()){
                case "1":
                    System.out.println("\n¿Que tipo de manga le gustaria que tenga la camisa?");
                    System.out.println("\n1.Manga corta");
                    System.out.println("\n2.Manga larga");
                    System.out.println("\n3.Sin manga\n");
                    int camisaOpcion = 0;
                    int opcionPago = scanner.nextInt();
                    while (camisaOpcion == 0) {
                        String camisaEntrada = scanner.nextLine();
                        switch (camisaEntrada.toLowerCase()) {
                            case "1":
                                System.out.println("\nEligió: manga corta");
                                System.out.println("\n¿De que color le gustaria que fuera la camisa?\n");
                                String colorCamisa = scanner.nextLine();
                                System.out.println("\n¿Que talle desea para la camisa?\n");
                                String tallaCamisa = scanner.nextLine();
                                System.out.println("\nLa camisa manga corta" + colorCamisa + " " + tallaCamisa + " se agregó al carrito de compras.");
                                camisaOpcion = 1;

                                System.out.println("\n¿Le gustaria seguir comprando o quiere proceder a pagar la compra?");
                                System.out.println("\n1.Seguir comprando");
                                System.out.println("\n2.Pagar lo que llevo\n");

                                if (opcionPago == 1) {
                                    System.out.println("\n¿Que otra cosa le gustaria comprar?\n");
                                    opcion = 0;
                                } else if (opcionPago == 2) {
                                    System.out.println("\n¿Que metodo de compra le gustaria usar?\n");
                                    opcion = 1;
                                } else {
                                    System.out.println("\nPor favor eliga una de las opciones presentadas\n");
                                }
                                break;

                            case "2":
                                System.out.println("\nEligió: manga larga");
                                System.out.println("\n¿De que color le gustaria que fuera la camisa?\n");
                                String colorCamisa2 = scanner.nextLine();
                                System.out.println("\n¿Que talle desea para la camisa?\n");
                                String tallaCamisa2 = scanner.nextLine();
                                System.out.println("\nLa camisa manga larga" + colorCamisa2 + " " + tallaCamisa2 + " se agregó al carrito de compras.");
                                camisaOpcion = 1;

                                System.out.println("\n¿Le gustaria seguir comprando o quiere proceder a pagar la compra?");
                                System.out.println("\n1.Seguir comprando");
                                System.out.println("\n2.Pagar lo que llevo\n");

                                if (opcionPago == 1) {
                                    System.out.println("\n¿Que otra cosa le gustaria comprar?\n");
                                    opcion = 0;
                                } else if (opcionPago == 2) {
                                    System.out.println("\n¿Que metodo de compra le gustaria usar?\n");
                                    opcion = 1;
                                } else {
                                    System.out.println("\nPor favor eliga una de las opciones presentadas\n");
                                }
                                break;
                                System.out.println("\nPor favor eliga una de las opciones presentadas\n");

                            case "3":
                                System.out.println("\nEligió: sin manga");
                                System.out.println("\n¿De que color le gustaria que fuera la camisa?\n");
                                String colorCamisa3 = scanner.nextLine();
                                System.out.println("\n¿Que talle desea para la camisa?\n");
                                String tallaCamisa3 = scanner.nextLine();
                                System.out.println("\nLa camisa sin manga" + colorCamisa3 + " " + tallaCamisa3+ " se agregó al carrito de compras.");
                                camisaOpcion = 1;

                                System.out.println("\n¿Le gustaria seguir comprando o quiere proceder a pagar la compra?");
                                System.out.println("\n1.Seguir comprando");
                                System.out.println("\n2.Pagar lo que llevo\n");

                                if (opcionPago == 1) {
                                    System.out.println("\n¿Que otra cosa le gustaria comprar?\n");
                                    opcion = 0;
                                } else if (opcionPago == 2) {
                                    System.out.println("\n¿Que metodo de compra le gustaria usar?\n");
                                    opcion = 1;
                                } else {
                                    System.out.println("\nPor favor eliga una de las opciones presentadas\n");
                                }
                                break;
                            }
                        }
                    }
            }
            opcion = 1;
            switch (entrada.toLowerCase()) {
                case "2":
                    System.out.println("\n¿Que tipo de pantalon le gustaria comprar?");
                    System.out.println("\n1.Short");
                    System.out.println("\n2.Jogging");
                    System.out.println("\n3.Cargo\n");

                    int pantalonOpcion = 0;
                    while (pantalonOpcion == 0) {
                        String pantalonEntrada = scanner.nextLine();
                        switch (pantalonEntrada.toLowerCase()) {
                            case "1":
                                System.out.println("\nBien ahi wacho un shorsito para este verano va como piña");
                                System.out.println("\n¿De que color queres el shorsito papa?\n");
                                String colorShort = scanner.nextLine();
                                System.out.println("\n¿Cual es tu talla? Mira que no tenemos talla XXXXXXL para gorrrrdos como vos\n");
                                String tallaShort = scanner.nextLine();
                                System.out.println("\nEl short " + colorShort + " " + tallaShort + " fue agregado al changuito papa.");
                                pantalonOpcion = 1;
                                break;

                            case "2":
                                System.out.println("\nBien ahi wacho un jogginsito para estar bien tranqui por casa");
                                System.out.println("\n¿De que color queres el jogging papa?\n");
                                String colorJogging = scanner.nextLine();
                                System.out.println("\n¿Cual es tu talla? Mira que no tenemos talla XXXXXXL para gorrrrdos como vos\n");
                                String tallaJogging = scanner.nextLine();
                                System.out
                                        .println("\nEl jogging " + colorJogging + " " + tallaJogging + " fue agregado al changuito papa.");
                                pantalonOpcion = 1;
                                break;

                            case "3":
                                System.out.println("\nBien ahi wacho un cargo bien facherito para encarar a la minusa");
                                System.out.println("\n¿De que color queres el cargo papa?\n");
                                String colorCargo = scanner.nextLine();
                                System.out.println("\n¿Cual es tu talla? Mira que no tenemos talla XXXXXXL para gorrrrdos como vos\n");
                                String tallaCargo = scanner.nextLine();
                                System.out.println("\nEl cargo " + colorCargo + " " + tallaCargo + " fue agregado al changuito papa.");
                                pantalonOpcion = 1;
                                break;
                            default:
                                System.out.println("\nNo te entendi papa, ¿Queres un short, un jogging o un cargo? Dale no es muy dificil.\n");
                                break;

                        }
                    }
            }

        }
    }
}