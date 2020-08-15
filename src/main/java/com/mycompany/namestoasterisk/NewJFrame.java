/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.namestoasterisk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class NewJFrame extends javax.swing.JFrame {
    ArrayList<String> names;
    
    public ArrayList<String> loadNames(){
        names=new ArrayList<>();
        try {
            FileReader fr;
            //fr = new FileReader("names.csv");
            fr = new FileReader("names.csv");
            BufferedReader bf;
            bf = new BufferedReader(fr);
            String linha;
            linha=bf.readLine();
            while(linha!=null){
                names.add(linha);
                linha=bf.readLine();
                //System.out.println(linha);
            }
        } catch (Exception e) {
            System.out.println("Error on load file");
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
        }
        return names;
    }
    
    
    
    public String exemploLimpar(String source){
        String revome=",.";
        for (int i = 0; i < revome.length(); i++) {
            if(source.contains(revome.substring(i,(i+1)))){
               source=source.replace(",","");
            }
            if(source.contains(revome.substring(i,(i+1)))){
               source=source.replace(".","");
            }
        }
        return source;
    }
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtArquivo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Como ler um arquivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 4, 300, 30);

        jButton2.setText("Como ler um arquivo e mostrar no console?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 45, 300, 30);

        jButton3.setText("ler um arquivo e mostrar em uma área de texto?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 86, 300, 30);

        jButton4.setText("Como selecionar um arquivo?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 127, 300, 30);
        getContentPane().add(txtArquivo);
        txtArquivo.setBounds(370, 130, 430, 30);

        jButton5.setText("Strings - Exemplos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 180, 300, 30);

        jButton6.setText("Resposta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(690, 350, 150, 40);

        jButton7.setText("Buscas em String");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 230, 300, 30);

        jButton8.setText("Contar letras");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(10, 290, 300, 40);

        jButton10.setText("Método");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(10, 360, 300, 30);

        setBounds(0, 0, 876, 463);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<String> names;
        names=new ArrayList<>();
        try {
            FileReader fr;
            fr = new FileReader("names.csv");
            BufferedReader bf;
            bf = new BufferedReader(fr);
            String linha;
            while(true){
                linha=bf.readLine();
                if(linha==null){
                    break;
                }
                names.add(linha);
                
            }
        } catch (Exception e) {
            System.out.println("Error on load file");
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<String> names;
        names=new ArrayList<>();
        try {
            FileReader fr;
            //fr = new FileReader("names.csv");
            fr = new FileReader("names.csv");
            BufferedReader bf;
            bf = new BufferedReader(fr);
            String linha;
            while(true){
                linha=bf.readLine();
                if(linha==null){
                    break;
                }
                names.add(linha);
                System.out.println("Linha "+linha);
            }
        } catch (Exception e) {
            System.out.println("Error on load file");
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser escolheArquivo = new JFileChooser(); //criamos uma variável para armazenar o fileChooser
        escolheArquivo.showOpenDialog(this); //Estamos abrindo a janela para navegar nos arquivos do computador mesmo //caso as caixas de mensagem podemos colocar null ou this
        try {
            File arquivoEscolhido = escolheArquivo.getSelectedFile(); //estamos criando uma variável para receber o arquivo //escolhido
            String nomeArquivo = arquivoEscolhido.getAbsolutePath(); //estamos criando uma variável para armazenar o //caminho(juntamente com o nome) do arquivo
            txtArquivo.setText(nomeArquivo); //estamos colocando caminho e nome do arquivo na caixa de texto
            ArrayList<String> names;
            names=new ArrayList<>();

            FileReader fr;
            //fr = new FileReader("names.csv");
            fr = new FileReader(nomeArquivo);
            BufferedReader bf;
            bf = new BufferedReader(fr);
            String linha;
            while(true){
                linha=bf.readLine();
                if(linha==null){
                    break;
                }
                names.add(linha);
                System.out.println("Linha "+linha);
            }
            
        } catch (Exception e) {
            System.out.println("Error on load file");
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //separar elementos de uma string
        String txt = "Nesta frase vamos colocar espaços entre as palavras, sempre espaços.";
        String[] post=txt.split(" "); // <- veja o critério de separação 
        
        int count=0;
        for(String palavra: post){
            System.out.println("Palavra "+count+" "+ palavra);
            count++;
        }
        
        //trocar elementos em uma string
        txt=txt.replace(" ", "#");
        System.out.println(txt);
        
        txt=txt.replaceFirst("espaços", "#");
        System.out.println(txt);
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String txt = "Hello John, are you and Marcelo playing football on Friday?";
        loadNames();
        for (int i = 0; i < names.size(); i++) {
            txt=txt.replaceAll(names.get(i), "*");  
        }
        System.out.println(" " + txt + " !");
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
      
        System.out.println("----");
        for (String mes : meses) {
            System.out.println(mes);
        }
        
        if(meses.contains("Abril")){
            meses.remove("Abril");
        }
        System.out.println("----");
        for (String mes : meses) {
            System.out.println(mes);
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
      
        System.out.println("----");
        for (String mes : meses) {
            System.out.println(mes);
        }
        
        String m = JOptionPane.showInputDialog("Qual deseja remover");
        
        String trocar="";
        for (int i = 0; i < m.length(); i++) {
            trocar+="*";
        }
        
        if(meses.contains(m)){
            meses.remove(m);
            meses.add(trocar);
        }
        System.out.println("----");
        for (String mes : meses) {
            System.out.println(mes);
        }
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        String txt = "Nesta frase vamos colocar espaços entre as palavras, sempre espaços.";
        System.out.println(txt);
        String txtLimpo = exemploLimpar(txt);
        System.out.println(txtLimpo);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables
}
