public class Humano implements SerVivo {

    private String nome;
    private double peso;

    public Humano(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public void comer(double kg) {
        System.out.println(nome + " comeu " + kg + " kg de comida.");
        this.peso += kg;
    }

    @Override
    public void andar(double velocidade) {
        System.out.println(nome + " anda a " + velocidade + " km/h.");
    }

    @Override
    public void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
    }
}
