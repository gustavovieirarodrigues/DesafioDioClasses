public class Main {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Arthur", 30, "guerreiro");
        Heroi heroi2 = new Heroi("Merlin", 50, "mago");
        Heroi heroi3 = new Heroi("Kenshin", 25, "ninja");
        Heroi heroi4 = new Heroi("Aang", 22, "monge");

        heroi1.atacar(); // Saída: O guerreiro atacou usando espada
        heroi2.atacar(); // Saída: O mago atacou usando magia
        heroi3.atacar(); // Saída: O ninja atacou usando shuriken
        heroi4.atacar(); // Saída: O monge atacou usando artes marciais
    }
}