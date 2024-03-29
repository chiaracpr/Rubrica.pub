package rubrica;

import java.util.LinkedList;

public class Rubrica {

    private LinkedList<Persona> elenco;

    public Rubrica(LinkedList<Persona> elenco) {
        this.elenco = elenco;
    }

    public LinkedList<Persona> getMerce() {
        return elenco;
    }

    public void setMerce(LinkedList<Persona> merce) {
        this.elenco = merce;
    }

    void aggiungi(String nome, String cognome, String numTel)
    {
        Persona persona = new Persona(nome, cognome, numTel);
        this.elenco.add(persona);
        System.out.println("contatto aggiunto");
    }
    String trovaPersona(String nome, String cognome)
    {
        String numero="";
        for(int i=0;i<this.elenco.size();i++)
        {
            if(elenco.get(i).getNome()==nome && elenco.get(i).getCognome()==cognome)
            {
                numero=elenco.get(i).getNumTel();
                System.out.println("contatto trovato");
            }

        }

        return numero;
    }


    LinkedList trovaPersone(String nome,String cognome)

    {
        LinkedList<String> numero=new Linkedlist;

        for(int i=0;i<elenco.size();i++)
        {
            if(elenco.get(i).getCognome()==cognome && elenco.get(i).getNome()==nome)
            {
                numero.add(elenco.get(i).getNumTel());
                System.out.println("persona trovata");
            }

        }

        return numero;

    }



}
