package TercerEjercicio;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        
        //TercerEjercicio.introducirValores();
        
        int adecuacionFuncional = TercerEjercicio.calculoAdecuacionFuncional(0,0,0);
        adecuacionFuncional = TercerEjercicio.calculoAdecuacionFuncional(10,10,10);
        adecuacionFuncional = TercerEjercicio.calculoAdecuacionFuncional(35,35,35);
        adecuacionFuncional = TercerEjercicio.calculoAdecuacionFuncional(50,50,50);
        adecuacionFuncional = TercerEjercicio.calculoAdecuacionFuncional(70,70,70);
        adecuacionFuncional = TercerEjercicio.calculoAdecuacionFuncional(90,90,90);
        adecuacionFuncional = TercerEjercicio.calculoAdecuacionFuncional(89,89,89);
        
        int mantenibilidad = TercerEjercicio.calculoMantenibilidad(0,0,0,0,0);
        mantenibilidad = TercerEjercicio.calculoMantenibilidad(10,10,10,10,10);
        mantenibilidad = TercerEjercicio.calculoMantenibilidad(35,35,35,35,35);
        mantenibilidad = TercerEjercicio.calculoMantenibilidad(50,50,50,50,50);
        mantenibilidad = TercerEjercicio.calculoMantenibilidad(70,70,70,70,70);
        mantenibilidad = TercerEjercicio.calculoMantenibilidad(90,90,90,90,90);
        mantenibilidad = TercerEjercicio.calculoMantenibilidad(89,89,89,89,89);
        
        int nivelCalidad = TercerEjercicio.calculoNivelCalidad(1,4);
        nivelCalidad = TercerEjercicio.calculoNivelCalidad(2,5);
        nivelCalidad = TercerEjercicio.calculoNivelCalidad(4,1);
        nivelCalidad = TercerEjercicio.calculoNivelCalidad(5,2);
        nivelCalidad = TercerEjercicio.calculoNivelCalidad(3,1);
        nivelCalidad = TercerEjercicio.calculoNivelCalidad(0,1);
        nivelCalidad = TercerEjercicio.calculoNivelCalidad(0,3);
    }
}
