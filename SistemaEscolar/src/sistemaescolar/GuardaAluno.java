/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaescolar;

/**
 *
 * @author ht3026191
 */

public class GuardaAluno {
    String nome, sala;
    float nota1, nota2, nota3, nota4, soma, media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }
    
    public String getSala() {
        return sala;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public float getNota4() {
        return nota4;
    }
    
    public String getResultado(){
        
        soma = nota1 + nota2 + nota3 + nota4;
        media = (soma/4);
        
        if(media >= 6){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
    
}
