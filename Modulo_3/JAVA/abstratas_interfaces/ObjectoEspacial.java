package abstratas_interfaces;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author wesan
 */
public interface ObjectoEspacial {
    int k = 42;

    int getPositionX();
    int getPositionY();


    int setPositionX();
    int setPositionY();

    void exploda(int intensidadeDaExplosao);

    boolean colideCom(ObjectoEspacial oe);

    MP3 suaMusica();

    String nome();
    String descricao();

}
