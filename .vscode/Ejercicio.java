import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner vr = new Scanner(System.in);
        String[] nombre ={"valeria reyes", "sebas reyes", "junir reyes",
            "mili reyes", "omar reyes", " victor reyes", "sheyla rojas",
            "carla reyes", "junan lopes", "mirian peres"};
            String [] carrera = {"sistemas", " arquitectura", "derecho", 
                "enfermera", "doctora","profesor", "cientifico", "bailarin",
                "deportista","psicologo"};
             int [] pc1 = {20,15,18,16,19,14,13,15,18,17};
             int [] pc2 = {20,15,18,16,19,14,13,15,18,17}; 
             int [] pc = {20,15,18,16,19,14,13,15,18,17}; 
            double  sumat = 0.0;

             double [] promedio = new double [nombre.length];

             for ( int i=0; i<promedio.length; i++){
             promedio[i] = (pc1[i])+ (pc2[i])+ (pc[i])/ 3.0;
                sumat += promedio[i];

             }
             double promedioT = sumat / promedio.length;
             
             String linea= "#".repeat(70);
             StringBuilder sb = new StringBuilder ();
             sb.append(linea).append("\n");
            sb.append(String.format("%-30s %-20s %4s %4s %4s %8s\n", "nombre",
              "carrera", "pc1" , "pc2", "pc", "promedio" )); 
              sb.append(linea).append("\n");

              for(int i=0; i<nombre.length;i++){
                sb.append(String.format("%-30s %-20s %4d %4d %4d %8.2f\n",
                nombre[i].toUpperCase() , carrera[i], pc1[i], pc2[i], pc[i], promedio[i]
                ));
            }
                 sb.append(linea).append("\n");
                 sb.append(String.format("%-50s %6.2f\n", "Promedio Total", promedioT));
                 sb.append(linea);

                System.out.println(sb);
             

        }
    }
        

   
