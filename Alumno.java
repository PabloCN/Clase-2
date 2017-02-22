/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprogramaoo;

/**
 *
 * @author Angel Crepuscular
 */
public class Alumno {
    
 String nombre;
 int edad;
 int matricula;
 double promedio;
 char sexo;
 String programa_academico;
 int semestre;
 String situacion_academica; 


public Alumno(){
 
 nombre= "";
 edad= 0;
 matricula=0 ;
 semestre= 0;
 sexo= 'i';
 promedio= 0;
 programa_academico= "";
 situacion_academica= "";

}

 public Alumno(String nombre, int edad, String programa_academico, String situacion_academica, double promedio,
         char sexo, int semestre, int matricula)
     {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.matricula = matricula;
        this.semestre = semestre;
        this.sexo = sexo; 
        this.situacion_academica = situacion_academica;
        this.programa_academico = programa_academico;
        
     }

     public Alumno(Alumno usr)
     {
        nombre = usr.getNombre();
        edad = usr.getEdad();
        promedio= usr.getPromedio();
        matricula = usr.getMatricula();
        semestre = usr.getSemestre();
        sexo =  usr.getSexo();
        situacion_academica =  usr.getSitAca();
        programa_academico =  usr.getProAca();       
     }

     void setNombre(String n)
     {
        nombre = n;
     }

     String getNombre()
     {
        return nombre;
     }

     /* El metodo setEdad() está sobrecargado */
     void setEdad(int e)
     {
        edad = e;
     }

     /*void setEdad(float e)
     {
        edad = (int)e;
     }*/

     int getEdad()
     {
        return edad;
     }

     void setPromedio(double d)
     {
        promedio = d;
     }

    double getPromedio(){
        return promedio;
     }


 void setMatricula(int m){
        matricula = m;
     }

     int getMatricula(){
        return matricula;
     }
     
     
      void setSemestre(int s)
     {
        semestre = s;
     }

     int getSemestre()
     {
        return semestre;
     }
     
     
      void setSexo(char sx)
     {
        sexo = sx;
     }

     char getSexo()
     {
        return sexo;
     }
     
      void setSitAca(String sa)
     {
        situacion_academica = sa;
     }

     String getSitAca()
     {
        return situacion_academica;
     }
     
      void setProAca(String pa)
     {
        programa_academico = pa;
     }

     String getProAca()
     {
        return programa_academico;
     }
     
     
 void saludar(){
 System.out.println("Hola, ¿Como estas?, soy " + nombre);
 
 }

 
}





