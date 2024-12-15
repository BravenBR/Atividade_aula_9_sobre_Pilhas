/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadepilha;

import javax.swing.JOptionPane;
import java.util.Stack;

public class Atividadepilha {
    public static void main(String[] args) {
        int op, program=0;
        String frase1 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String frase2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";
        
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1- EXEMPLO FRASE 1\n2- EXEMPLO FRASE 2\n3- ENCERRAR PROGRAMA\nOPCAO: "));
            
            switch (op) {
                case 1: {
                    String[] palavras = frase1.split(" ");
                    StringBuilder resultado = new StringBuilder();

                    for (String palavra : palavras) {
                        Stack<Character> pilha = new Stack<>();

                        for (int i = 0; i < palavra.length(); i++) {
                            pilha.push(palavra.charAt(i));
                        }

                        while (!pilha.isEmpty()) {
                            resultado.append(pilha.pop());
                        }

                        resultado.append(" ");
                    }
                    JOptionPane.showMessageDialog(null, resultado.toString().trim());
                    break;
                }
                case 2: {
                    String[] palavras = frase2.split(" ");
                    StringBuilder resultado = new StringBuilder();

                    for (String palavra : palavras) {
                        Stack<Character> pilha = new Stack<>();

                        for (int i = 0; i < palavra.length(); i++) {
                            pilha.push(palavra.charAt(i));
                        }

                        while (!pilha.isEmpty()) {
                            resultado.append(pilha.pop());
                        }

                        resultado.append(" ");
                    }
                    JOptionPane.showMessageDialog(null, resultado.toString().trim());
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null,"Programa encerrado!");
                    program = 1;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcao nao disponivel");
                }
            }
        }while(program!=1);      
    }
}
