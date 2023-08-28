import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }    

    public static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCOS", "MARIA", "PEDRO", "PAULA"};
        System.out.println("Imprimindo a lista de candidatos informando seu índice");

        for (int indice= 0; indice < candidatos.length; indice++ ){
            System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "PEDRO", "JOÃO", "MARCOS", "LUCIA", "MARIA", "PAULA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDAATO");
        }else if (salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

        
    }

}
