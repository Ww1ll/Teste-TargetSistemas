public class faturamento {
    public static void main(String[] args) {

        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        double soma = (SP + RJ + MG + ES + Outros);


        double percentualSP = (SP/soma) * 100;
        double percentualRJ = (RJ/soma) * 100;
        double percentualMG = (MG/soma) * 100;
        double percentualES = (ES/soma) * 100;
        double percentualOutros = (Outros/soma) * 100;


        System.out.println("O percentual de representação em cada estado é: ");
        System.out.println("");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.println("");
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.println("");
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.println("");
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.println("");
        System.out.printf("Outros estados: %.2f%%\n", percentualOutros);

    }
}
