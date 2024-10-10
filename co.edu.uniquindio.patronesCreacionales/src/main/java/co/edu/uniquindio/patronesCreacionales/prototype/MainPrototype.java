package co.edu.uniquindio.patronesCreacionales.prototype;


import co.edu.uniquindio.patronesCreacionales.prototype.model.TelaImpl;
import co.edu.uniquindio.patronesCreacionales.prototype.model.Tipo;

public class MainPrototype {
    public static void main(String[] args) {
        clonTela();
    }
    private static void clonTela() {
       TelaImpl tela1= new TelaImpl();
       tela1.setTipo(Tipo.LANA);
       tela1.setTamano(1.50);
       tela1.setColor("OCRE");

       TelaImpl tela2= new TelaImpl();
       tela2.setColor("NEGRO");
       tela2.setTamano(2.00);
       tela2.setTipo(Tipo.POLIESTER);

       TelaImpl tela3= new TelaImpl();
       tela3.setTamano(1.00);
       tela3.setColor("FUEGO CREPUSCULAR");
        tela3.setTipo(Tipo.LINO);

        TelaImpl telaClonada=(TelaImpl) tela1.clonar();
        System.out.println(tela1);
    }
}