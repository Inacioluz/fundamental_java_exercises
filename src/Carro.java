public class Carro {
    private String marca = "bmw";
    private String modelo = "320i";
    private int ano = 2021;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    void exibitDetalhes(){
        System.out.println("O carro da marca " + marca + " do modelo " + modelo + " do ano " + ano + " é bonito");
    }

}
