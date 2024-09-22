public class Soma {
    public int calcular(int indice) {
        int soma = 0;
        for (int k = 1; k < indice; k++) {
            soma += k;
        }
        return soma;
    }
}
