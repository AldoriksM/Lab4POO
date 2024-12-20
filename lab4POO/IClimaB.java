import java.util.Date;
import java.util.List;

public interface IClimaB {
    
    // Enciende el sistema de climatización
    void encender();
    
    // Apaga el sistema de climatización
    void apagar();
    
    // Ajusta la temperatura interna del sistema en un incremento especificado de ±1 grado
    int ajustarTemperatura(int incremento);
    
    // Activa el modo automático de climatización ajustando la temperatura según el clima externo
    int modoAutomatico(int temperaturaAmbiente);
    
    // Configura el nivel de ventilación entre los valores 0 a 3
    void ajustarVentilacion(int intensidad);
    
    // Activa el modo de ahorro de energía, reduciendo la intensidad de ventilación
    void activarModoEco();
    
    // Cambia la dirección de ventilación a opciones como parabrisas, frontal, pies o todo
    void ajustarDireccionVentilacion(String direccion);
    
    // Ajusta la calefacción de los asientos delanteros y traseros a niveles entre 0 y 3
    void activarCalefaccionAsientos(int nivelDelantero, int nivelTrasero);
    
    // Activa la calefacción rápida para calentar el habitáculo rápidamente
    void activarCalefaccionRapida();
    
    // Activa el desempañador del vehículo
    void activarDesempañador();
    
    // Desactiva el desempañador
    void desactivarDesempañador();
    
    // Programa la próxima cita de mantenimiento del sistema
    void programarMantenimiento(Date fecha);
    
    // Retorna una lista con el historial de mantenimiento, mostrando fechas de cambio de filtro y otros eventos relevantes
    List<String> verHistorialMantenimiento();
}