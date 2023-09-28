public class Clube{
    private Frequentador[] frequentadores;
    private int quantFreq;

    /**
     * Aqui é o construtor da classe Clube, onde ela inicializa frequentadores com o mínimo de 2 usuários.
     * @param n
     * O paramâmetro n tem relação a quantidade de frequentadores não deixando que ele seja número negativo e não menor que 2. 
     */
    public Clube(int n){
        if(n<=2) n=2;
        frequentadores = new Frequentador[n];
        quantFreq = 0;
    }
    /**
     * Adiciona um novo frequentador ao clube, desde que o clube não esteja cheio
     * e o frequentador não seja duplicado.
     *
     * @param novo O novo frequentador a ser adicionado ao clube.
     * @return true se o frequentador foi adicionado com sucesso, false caso contrário.
     */
    public boolean addFrequentador(Frequentador novo){
        boolean resposta = true;
        if(quantFreq == frequentadores.length)
            resposta = false;
        else{
            for (int i = 0; i < quantFreq && resposta; i++) {
                if(frequentadores[i].equals(novo))
                        resposta = false;
            }
            if(resposta){
                frequentadores[quantFreq] = novo;
                quantFreq++;
            }
        }
        return resposta;        
    }
    /***
     * Esse método é responsável por registrar a entrada das visitas.
     * Ele faz um laço de repetição para percorrer a lista de frequentadores para ver se existe algum com o mesmo ID que ele forneceu.
     * Se um frequentador com o identificador especificado for encontrado, sua visita é registrada. 
     * @param idFreq O identificador do frequentador cuja visita será registrada.
     */
    public void registrarVisita(String idFreq){
        for (int i = 0; i < quantFreq; i++) {
            if(idFreq.equals(frequentadores[i].getId()))
                frequentadores[i].registrarVisita();
        }
    }
    /***
     * Esse método faz o mesmo do método acima, mas ele registra a saída das visitas.
     * Ele faz um laço de repetição para percorrer a lista de frequentadores para ver se existe algum com o mesmo ID que ele forneceu.
     * Se um frequentador com o identificador especificado for encontrado, sua saída é registrada.
     * @param idFreq O identificador do frequentador cuja saída será registrada.
     */
    public void registrarSaida(String idFreq){
        for (int i = 0; i < quantFreq; i++) {
            if(idFreq.equals(frequentadores[i].getId()))
                frequentadores[i].registrarSaida();
        }
    }
    /**
 * Este método cria um relatório que lista todos os frequentadores que visitaram o clube
 * na data especificada e retorna o relatório como uma string formatada.
 *
 * @param dia A data para a qual o relatório de visitas será gerado.
 * @return Uma string contendo o relatório das visitas na data especificada.
 */
    public String relatorioVisitasData(Data dia){
        StringBuilder relat = new StringBuilder("Visitas em "+dia+"\n");
        for (int i = 0; i < quantFreq; i++) {
            if(frequentadores[i].visitouClubeEm(dia))
                relat.append(frequentadores[i]+"\n");
        }
        return relat.toString();
    }

    public String relatorioVisitasFreq(String idFreq){
        for (int i = 0; i < quantFreq; i++) {
            if(idFreq.equals(frequentadores[i].getId()))
                return frequentadores[i].relatorioVisitas();
        }
        return "Não existe este sócio";
    }
}