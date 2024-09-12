import java.util.Arrays;
public class desafio {
    public static void main(String[] args){
        double[] faturamento_anual = {100, 200, 0, 150, 300, 250, 0, 180, 220, 280, 200, 150, 0, 175, 225, 275, 250, 300, 0, 200, 150, 250, 275, 225, 0, 190, 210, 220, 300, 175, 0, 200, 180, 220, 280, 250, 0, 150, 175, 225, 275, 200, 0, 190, 225, 250, 275, 225, 0, 200, 175, 225, 275, 250, 0, 200, 225, 275, 250, 275, 0, 200, 220, 280, 250, 275, 0, 175, 200, 250, 275, 200, 0, 200, 220, 280, 250, 300, 0, 175, 200, 250, 275, 200, 0, 190, 210, 220, 300, 175, 0, 200, 225, 275, 250, 275, 0, 190, 225, 250, 275, 225, 0};
        primeiraQuestao();
        faturamento(faturamento_anual);
    }

    static void primeiraQuestao(){
        int index = 12;
            int sum = 0;
            int k = 1;
    
            while(k < index){
                k = k+1;
                sum = sum+k;
    
            }
            System.out.println("1) " + sum);
    }

    static void faturamento(double[] faturamento){
        Arrays.sort(faturamento);
        double minValue = Double.MAX_VALUE;
        double maxValue = faturamento[faturamento.length-1];
        double totalAnual = 0;
        double mediaAnual = 0;
        int qtdDias = 0;
        int diasSuperiorAMedia = 0;

        for(int i = 0; i<faturamento.length ; i++){
            if(faturamento[i] != 0){
                totalAnual += faturamento[i];
                qtdDias++;

                if(faturamento[i] < minValue ){
                    minValue = faturamento[i];
                }
            }
            
        }
        mediaAnual = totalAnual/qtdDias;
        for(int i = 0; i<faturamento.length; i++){
            if(faturamento[i] !=0 && faturamento[i]> mediaAnual){
                diasSuperiorAMedia++;
            }
        }

        System.out.println("Menor valor de faturamento:"+ minValue);
        System.out.println("Maior valor de faturamento:"+maxValue);
        System.out.println("Média anual:"+mediaAnual);
        System.out.println("Qtd de dias que o faturamento foi maior que a média:"+diasSuperiorAMedia);
            
    }
}


