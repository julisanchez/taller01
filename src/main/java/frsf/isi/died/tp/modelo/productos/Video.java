package frsf.isi.died.tp.modelo.productos;

public class Video extends MaterialCapacitacion {

    private static Double costo_segundo = 0.15;
    private Integer duracion_seg;

    public Video(){}

    public Video(Integer id, String titulo){
        super(id,titulo);
    }

    public Video(Integer id, String titulo, Double costo, Integer duracion){
        super(id,titulo,costo);
        this.duracion_seg = duracion;
    }

    @Override
    public Double precio() {
        return this.getCosto() + this.duracion_seg * this.costo_segundo;
    }

    @Override
    public Boolean esLibro() {
        return false;
    }

    @Override
    public Boolean esVideo() {
        return true;
    }
}
