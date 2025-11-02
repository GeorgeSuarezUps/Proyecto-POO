package poo;

import uni1a.*; 

public class PruebaAudioVisual {

	public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println(">>> EJECUTANDO EL CATÁLOGO DE CONTENIDO AUDIOVISUAL <<<");
        System.out.println("=====================================================");

        // ====================================================
        // I. ENSAMBLANDO LAS RELACIONES CLAVE (ASOCIACIÓN, AGREGACIÓN, COMPOSICIÓN)
        // ====================================================
        System.out.println("\n--- NUEVAS ADQUISICIONES ---");
        
        // --- 1. COMPOSICIÓN (SerieDeTV es DUEÑA de Temporada) ---
        SerieDeTV serieA = new SerieDeTV("Westworld", 60, "Ciencia Ficción");
        
        // Las temporadas nacen y viven dentro de la serie
        Temporada t1 = new Temporada(1, 10, "El Laberinto");
        Temporada t2 = new Temporada(2, 10, "El Mundo Exterior");
        
        serieA.agregarTemporada(t1);
        serieA.agregarTemporada(t2);
        
        System.out.println(" Nueva Serie: 'Westworld' contiene " + serieA.getNumeroDeTemporadas() + " temporadas.");

        // --- 2. AGREGACIÓN (Documental HACE USO de Investigador) ---
        Documental docA = new Documental("Secretos del CERN", 85, "Física", "Partículas Elementales");
        
        // Los investigadores existen más allá del documental
        Investigador inv1 = new Investigador("Dr. Elías Torres", "Física Cuántica", "MIT");
        Investigador inv2 = new Investigador("Dra. Anya Sharma", "Ingeniería de Materiales", "CERN");
        
        docA.agregarInvestigador(inv1);
        docA.agregarInvestigador(inv2);
        System.out.println(" Nuevo Documental: 'Secretos del CERN' usó a " + docA.getInvestigadores().size() + " expertos.");

        // --- 3. ASOCIACIÓN (Película CONTRATA a Actor) ---
        Pelicula peliA = new Pelicula("Blade Runner 2049", 164, "Neo-Noir", "Sony Pictures");
        
        Actor act1 = new Actor("Ryan Gosling", "Canadá", 1980);
        Actor act2 = new Actor("Ana de Armas", "Cuba", 1988);
        
        peliA.agregarActor(act1);
        peliA.agregarActor(act2);
        System.out.println(" Nueva Película tiene " + peliA.getActores().size() + " actores en su elenco.");


        // ====================================================
        // II. DESPLIEGUE DEL CATÁLOGO (PRUEBA DE HERENCIA Y POLIMORFISMO)
        // ====================================================
        System.out.println("\n--- CATÁLOGO MULTIFORMATO ---");
        
        // Creación de las NUEVAS subclases (Clip y Film)
        Clip clip1 = new Clip("Avance 'Westworld'", 2, "Promoción", "YouTube", true);
        Film film1 = new Film("La Naranja Mecánica", 136, "Distopía", "Stanley Kubrick", 2); 
        
        // Arreglo Polimórfico
        ContenidoAudiovisual[] catalogo = new ContenidoAudiovisual[5];
        catalogo[0] = peliA; // Película (Asociación)
        catalogo[1] = serieA; // SerieDeTV (Composición)
        catalogo[2] = docA; // Documental (Agregación)
        catalogo[3] = clip1; // Nueva Subclase
        catalogo[4] = film1; // Nueva Subclase

        // Polimorfismo en acción
        for (ContenidoAudiovisual contenido : catalogo) {
            contenido.mostrarDetalles();
        }
        
        // ====================================================
        // III. PROBANDO ACCIONES ÚNICAS DE CADA CLASE
        // ====================================================
        System.out.println("\n--- FUNCIONALIDADES ÚNICAS ---");
        
        System.out.println("Clip:");
        clip1.compartir(); 
        
        System.out.println("\n Film:");
        System.out.println("Reporte Financiero: " + film1.obtenerPresupuesto()); 
        
        
        System.out.println("\n=====================================================");
        System.out.println(">>> FIN DE CATALOGO MULTIPLATAFORMA <<<");
        System.out.println("=====================================================");
    }
}