package ec.edu.epn.gr4mat1b23b;

public enum Estado {
    PRESTADO("Prestado"),
    DISPONIBLE("Disponible");

    private String valor;

    Estado(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
