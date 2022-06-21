package curso.java.ejerciciocinco;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Nombre del metodo: save()");
    }

    @Override
    public void findAll() {
        System.out.println("Nombre del metodo: findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Nombre del metodo: delete()");
    }
}
