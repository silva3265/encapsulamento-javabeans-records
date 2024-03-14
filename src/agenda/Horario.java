package agenda;

public record Horario(int hora, int minuto) { //record - tipo especial de classe 

    public Horario {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }
    }

    public String formatar() {
        return String.format("%dh%dm", hora(), minuto());
    }

}
