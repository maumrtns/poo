public class MainCarro {
    public static void main(String[] args) {

        Carro punto = new Carro();
        punto.cavalos = 100;
        punto.cor = "Preta";
        punto.montadora = "Fiat";
        punto.transmissao = "Manual";
        punto.capacidadeTanque = 50;
        punto.combustivel = 0;
        punto.kmPorLitros = 10;

        Carro civic = new Carro();
        civic.cavalos = 150;
        civic.cor = "Prata";
        civic.montadora = "Honda";
        civic.transmissao = "Automatica";
        civic.capacidadeTanque = 48;
        civic.combustivel = 10;
        civic.kmPorLitros = 8;

        System.out.println("Situaçao do Tanque - Punto: " + punto.combustivel);
        System.out.println("Situaçao do Tanque - Civic: " + civic.combustivel);

        System.out.println("Abastecendo 20 litros no Punto");
        punto.abastercer(20);
        System.out.println("Abastecendo 50 litros no Punto");
        int sobraPunto = punto.abastercer(50);

        System.out.println("Abastecendo 30 litros no Civic");
        civic.abastercer(30);
        System.out.println("Abastecendo 100 litros no Civic");
        int sobraCivic = civic.abastercer(100);

        System.out.println("Punto, depois de abastecer: " +
                punto.combustivel + " , sobrou " + sobraPunto);
        System.out.println("Civic, depois de abastecer: " +
                civic.combustivel + " , sobrou " + sobraCivic);

        System.out.println("Autonomia Punto: " + punto.autonomiaCombustivel());
        System.out.println("Autonomia Civic: " + civic.autonomiaCombustivel());

    }
}
