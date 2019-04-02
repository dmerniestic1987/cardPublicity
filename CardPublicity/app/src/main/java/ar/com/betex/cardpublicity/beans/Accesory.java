package ar.com.betex.cardpublicity.beans;

import java.util.ArrayList;
import java.util.List;

import ar.com.betex.cardpublicity.R;

public class Accesory {
    private String name;
    private String descripcion;
    private Long id;
    private int imageResource;

    public Accesory(String name, String descripcion, int imageResource) {
        this.name = name;
        this.descripcion = descripcion;
        this.imageResource = imageResource;
        this.id = new Long((this.name + this.descripcion).hashCode());
    }

    public static List<Accesory> accesoriesList(){
        List<Accesory> accesorios = new ArrayList<>();
        Accesory accesiorio = new Accesory("Asiento DeLuxe", "Asiento de cuero importado de Tailandia", R.drawable.asiento);
        accesorios.add(accesiorio);


        accesiorio = new Accesory("Cubre Carter", "Cubre Carter inferior de motor de Titanio", R.drawable.cubre_carter);
        accesorios.add(accesiorio);


        accesiorio = new Accesory("Espejo", "Espejo Laterial", R.drawable.espejo);
        accesorios.add(accesiorio);


        accesiorio = new Accesory("Espejo retrovisor", "Espejo retrovisor aleman", R.drawable.espejo_retrovisor);
        accesorios.add(accesiorio);


        accesiorio = new Accesory("Filtro de Aire", "Filtro de Aire para motor naftero", R.drawable.filtro_aire);
        accesorios.add(accesiorio);


        accesiorio = new Accesory("Kit de Alarma", "Kit de Alarma Ultra SEC", R.drawable.kit_alarma);
        accesorios.add(accesiorio);


        accesiorio = new Accesory("Llanta deportiva", "Llanta de aliación de aluminio", R.drawable.llanta);
        accesorios.add(accesiorio);


        accesiorio = new Accesory("Kit llantas", "Kit llantas 17 pulgadas deportivas", R.drawable.rueda);
        accesorios.add(accesiorio);


        accesiorio = new Accesory("Tuercas de seguridad", "Tuercas de seguridad de Autos", R.drawable.tuerca_autos);
        accesorios.add(accesiorio);


        accesiorio = new Accesory("Volante deportivo", "Volante deportivo", R.drawable.volante);
        accesorios.add(accesiorio);

        return accesorios;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
