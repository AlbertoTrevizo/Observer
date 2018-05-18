import enums.Estado;
import models.Alumno;
import models.Beca;
import models.Informador;
import models.Padre;
import org.junit.Test;

public class AlumnoTest {

    @Test
    public void test1(){
        Alumno alumno = new Alumno();
        System.out.println(alumno.getEstado());
        alumno.setEstado(Estado.REPROBADO);
        System.out.println(alumno.getEstado());
    }

    @Test
    public void test2(){
        Alumno alumno = new Alumno();
        System.out.println(alumno.getEstado());
        alumno.agregarObservador(new Padre());
        alumno.setEstado(Estado.REPROBADO);
        System.out.println(alumno.getEstado());
    }

    @Test
    public void test3(){
        Alumno alumno = new Alumno();
        System.out.println(alumno.getEstado());
        alumno.agregarObservador(new Padre());
        alumno.agregarObservador(new Informador());
        alumno.agregarObservador(new Beca());
        alumno.setEstado(Estado.REPROBADO);
        System.out.println(alumno.getEstado());
    }
}