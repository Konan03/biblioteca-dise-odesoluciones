package view;

import model.Biblioteca;

import javax.swing.*;
import java.awt.*;

public class GUIPrincipal extends JFrame {

    private Biblioteca biblioteca;
    private JPanel panelInformacionBiblioteca;

    public GUIPrincipal(Biblioteca biblioteca){
        setTitle("Sistema de biblioteca");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        this.biblioteca = biblioteca;
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        panelInformacionBiblioteca = new JPanel();
        panelInformacionBiblioteca.setLayout(new GridLayout(3,1));

        JLabel lblRazonSocial = new JLabel("Biblioteca: " + biblioteca.getRazonSocial());
        JLabel lblFechaFundacion = new JLabel("Fundacion: " + biblioteca.getFechaFuncacion());
        JLabel lblNit = new JLabel("Nit: " + biblioteca.getNit());

        panelInformacionBiblioteca.add(lblRazonSocial);
        panelInformacionBiblioteca.add(lblFechaFundacion);
        panelInformacionBiblioteca.add(lblNit);

        add(panelInformacionBiblioteca, BorderLayout.CENTER);

    }
}
