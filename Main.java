//Arboles rojo-negro

public class Main {
    public static void main(String[] args) {
        Arbol arbolito = new Arbol();
        arbolito.insertar(5);
        arbolito.insertar(17);
        arbolito.insertar(2);
        arbolito.insertar(7);
        arbolito.recorrerInOrder();
        arbolito.encontrar(7);
        arbolito.eliminar(2);
        arbolito.recorrerInOrder();
        arbolito.recorrerPostOrder();
        arbolito.recorrerPreOrder();
    }
}
