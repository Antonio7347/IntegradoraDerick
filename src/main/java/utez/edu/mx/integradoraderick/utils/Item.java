package utez.edu.mx.integradoraderick.utils;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public enum Item {

    ITEM1(1, "Camiseta", 12.5, "img/camiseta.jpeg"),
    ITEM2(2, "Pantalones", 25.0, "img/pantalones.png"),
    ITEM3(3, "Zapatos Deportivos", 45.0, "img/zapatosDeportivos.jpeg"),
    ITEM4(4, "Sombrero", 18.0, "img/sombrero.jpeg"),
    ITEM5(5, "Reloj de pulsera", 35.0, "img/relojPulsera.jpeg"),
    ITEM6(6, "Gafas de sol", 15.0, "img/gafasSol.jpeg"),
    ITEM7(7, "Mochila", 22.0, "img/mochila.jpeg"),
    ITEM8(8, "Chaqueta de invierno", 40.0, "img/chaquetaInvierno.jpeg"),
    ITEM9(9, "Botas", 30.0, "img/botas.jpeg"),
    ITEM10(10, "Pantalones cortos", 12.0, "img/pantalonesCortos.jpeg"),
    ITEM11(11, "Cinturón", 7.5, "img/cinturon.jpeg"),
    ITEM12(12, "Cartera", 25.0, "img/cartera.jpeg"),
    ITEM13(13, "Camisa de cuadros", 20.0, "img/camisaCuadros.jpeg"),
    ITEM14(14, "Bañador", 14.0, "img/bañador.jpg"),
    ITEM15(15, "Suéter de lana", 27.5, "img/sueterLana.jpeg"),
    ITEM16(16, "Bufanda", 8.0, "img/bufanda.jpeg"),
    ITEM17(17, "Guantes", 9.0, "img/guantes.jpeg"),
    ITEM18(18, "Camiseta deportiva", 19.0, "img/camisetaDeportiva.jpeg"),
    ITEM19(19, "Zapatos de vestir", 40.0, "img/zapatosVestir.jpeg"),
    ITEM20(20, "Cargador portátil", 15.0, "img/cargadorPortatil.jpeg"),
    ITEM21(21, "Auriculares", 25.0, "img/auriculares.jpeg"),
    ITEM22(22, "Teléfono móvil", 199.99, "img/telefonoMovil.jpeg"),
    ITEM23(23, "Tablet", 150.0, "img/tablet.jpg"),
    ITEM24(24, "Laptop", 500.0, "img/laptop.jpeg"),
    ITEM25(25, "Altavoces Bluetooth", 35.0, "img/altavocesBluetooth.jpg"),
    ITEM26(26, "Batería externa", 18.0, "img/bateriaExterna.jpeg"),
    ITEM27(27, "Cargador inalámbrico", 12.0, "img/cargadorInalambrico.jpg"),
    ITEM28(28, "Cámara fotográfica", 100.0, "img/camaraFotografica.jpeg"),
    ITEM29(29, "Videocámara", 220.0, "img/videocamara.jpeg"),
    ITEM30(30, "Monitor", 120.0, "img/monitor.jpeg"),
    ITEM31(31, "Teclado mecánico", 40.0, "img/tecladoMecanico.jpeg"),
    ITEM32(32, "Ratón de computadora", 25.0, "img/ratonComputadora.jpeg"),
    ITEM33(33, "Bicicleta", 150.0, "img/bicicleta.jpeg"),
    ITEM34(34, "Patines", 30.0, "img/patines.jpeg"),
    ITEM35(35, "Raqueta de tenis", 40.0, "img/raquetaTenis.jpeg"),
    ITEM36(36, "Balón de fútbol", 15.0, "img/balonFutbol.jpeg"),
    ITEM37(37, "Pelota de baloncesto", 20.0, "img/pelotaBaloncesto.jpeg"),
    ITEM38(38, "Patinete", 50.0, "img/patinete.jpeg"),
    ITEM39(39, "Tienda de campaña", 75.0, "img/tiendaCampaña.jpeg"),
    ITEM40(40, "Saco de dormir", 35.0, "img/sacoDormir.jpeg"),
    ITEM41(41, "Linterna", 12.5, "img/linterna.jpeg"),
    ITEM42(42, "Termo", 15.0, "img/termo.jpeg"),
    ITEM43(43, "Manta", 18.0, "img/manta.jpeg"),
    ITEM44(44, "Olla de camping", 30.0, "img/ollaCamping.jpg"),
    ITEM45(45, "Cuchillo de supervivencia", 20.0, "img/cuchilloSupervivencia.jpeg"),
    ITEM46(46, "GPS portátil", 100.0, "img/gpsPortatil.jpeg"),
    ITEM47(47, "Libro de aventuras", 12.0, "img/libroAventuras.jpeg"),
    ITEM48(48, "Juegos de mesa", 22.5, "img/juegoMesa.jpeg"),
    ITEM49(49, "Rompecabezas", 10.0, "img/rompecabezas.jpeg"),
    ITEM50(50, "Cámara instantánea", 65.0, "img/camaraInstantanea.jpeg");
    private int id;
    private String nombre;
    private double precio;
    private String rutaImagen;

    // Constructor
    Item(int id, String nombre, double precio, String rutaImagen) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }
}
