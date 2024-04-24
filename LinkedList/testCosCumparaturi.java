package LinkedList;

public class testCosCumparaturi {
    public static void main(String[] args) {
        cosTest();
    }

    public static void cosTest() {
        CosCumparaturi cos = new CosCumparaturi();
        cos.adaugaProdus(new Produs("Lapte", 5.5));
        cos.adaugaProdus(new Produs("Pâine", 1.2));
        cos.adaugaProdus(new Produs("Ouă", 3.7));
        System.out.println("Totalul prețurilor este: " + cos.calculeazaTotal());
    }
}
