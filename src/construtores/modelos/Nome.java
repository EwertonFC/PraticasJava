package construtores.modelos;

public class Nome {

    private String nome;

    public Nome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
