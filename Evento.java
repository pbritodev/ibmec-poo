public class Evento {
    String nome;
    String data;
    String local;
    String maisInfo;
    int numeroParticipantes;
    int maxParticipantes;

    Evento(String nome, String data, String local, String maisInfo, int numeroParticipantes, int maxParticipantes){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.numeroParticipantes = 0;
        this.maxParticipantes = 0;
        this.maisInfo = maisInfo;
    }
}
