public class Heroi {

    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método atacar que exibe a mensagem conforme o tipo de herói
    public void atacar() {
        String ataque = "";

        // Estrutura de decisão para definir o ataque conforme o tipo
        switch (this.tipo.toLowerCase()) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                ataque = "usou ataque desconhecido";
                break;
        }

        // Exibe a mensagem de ataque
        System.out.println("O " + this.tipo +" "+ nome+" atacou usando " + ataque);
    }
}