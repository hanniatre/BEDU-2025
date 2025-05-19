public abstract class UnidadEmergencias {
    String nombre;

    public UnidadEmergencias(String nombre) {
        this.nombre = nombre;
    }

    public void activarUnidad() {
        System.out.println("Activando unidad: " + nombre);
    }

    public abstract void responder();
}