package Mensagem;

public abstract class Mensagem {
    private String texto;
    private String emailRemetente;
    private Boolean anonima;

    public Mensagem(){

    }
    public Mensagem(String emailRemetente, String texto, Boolean anonima) {
        this.emailRemetente = emailRemetente;
        this.texto = texto;
        this.anonima = anonima;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }

    

}
