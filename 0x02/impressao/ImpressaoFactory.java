public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao impressaoTamanho, int totalPaginas, int paginasColoridas, boolean ehFrenteVerso){
        return new Impressao(impressaoTamanho, totalPaginas, paginasColoridas, ehFrenteVerso);
    }
}