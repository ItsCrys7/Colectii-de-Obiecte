package LinkedList;

import java.util.LinkedList;

public class CosCumparaturi {
    LinkedList<Produs> listaProduse;

    public CosCumparaturi() {
        listaProduse = new LinkedList<Produs>();
    }

    public void adaugaProdus(Produs produs) {
        listaProduse.add(produs);
    }

    public double calculeazaTotal() {
        double total = 0;
        for (Produs produs : listaProduse) {
            total += produs.pret;
        }
        return total;
    }
}

