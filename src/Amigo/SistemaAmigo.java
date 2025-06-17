package Amigo;

import Mensagem.Mensagem;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {

    private List<Amigo> amigos;
    private List<Mensagem> mensagens;


    private List<Amigo> amigo = new ArrayList<>();



    public void CadastrarAmigo(String nomeAmigo, String emailAmigo){
        Amigo novoAmigo = new Amigo(nomeAmigo,emailAmigo);
        amigo.add(novoAmigo);
    }


    public Amigo pesquisaAmigo(String emailAmigo){
        for (Amigo amigo : amigos) {
            if (amigo.getEmail().equals(emailAmigo)) {
                return amigo;
            }
        }
        return null;
    }






}





