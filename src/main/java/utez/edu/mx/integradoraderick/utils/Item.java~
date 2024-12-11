package utez.edu.mx.integradoraderick.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public enum Item {

    ITEM1("Camiseta", 12.5, "ruta/a/imagen1.jpg"),
    ITEM2("Pantalones", 25.0, "ruta/a/imagen2.jpg"),
    ITEM3("Zapatos Deportivos", 45.0, "ruta/a/imagen3.jpg"),
    ITEM4("Sombrero", 18.0, "ruta/a/imagen4.jpg"),
    ITEM5("Reloj de pulsera", 35.0, "ruta/a/imagen5.jpg"),
    ITEM6("Gafas de sol", 15.0, "ruta/a/imagen6.jpg"),
    ITEM7("Mochila", 22.0, "ruta/a/imagen7.jpg"),
    ITEM8("Chaqueta de invierno", 40.0, "ruta/a/imagen8.jpg"),
    ITEM9("Botas", 30.0, "ruta/a/imagen9.jpg"),
    ITEM10("Pantalones cortos", 12.0, "ruta/a/imagen10.jpg"),
    ITEM11("Cinturón", 7.5, "ruta/a/imagen11.jpg"),
    ITEM12("Cartera", 25.0, "ruta/a/imagen12.jpg"),
    ITEM13("Camisa de cuadros", 20.0, "ruta/a/imagen13.jpg"),
    ITEM14("Bañador", 14.0, "ruta/a/imagen14.jpg"),
    ITEM15("Suéter de lana", 27.5, "ruta/a/imagen15.jpg"),
    ITEM16("Bufanda", 8.0, "ruta/a/imagen16.jpg"),
    ITEM17("Guantes", 9.0, "ruta/a/imagen17.jpg"),
    ITEM18("Camiseta deportiva", 19.0, "ruta/a/imagen18.jpg"),
    ITEM19("Zapatos de vestir", 40.0, "ruta/a/imagen19.jpg"),
    ITEM20("Cargador portátil", 15.0, "ruta/a/imagen20.jpg"),
    ITEM21("Auriculares", 25.0, "ruta/a/imagen21.jpg"),
    ITEM22("Teléfono móvil", 199.99, "ruta/a/imagen22.jpg"),
    ITEM23("Tablet", 150.0, "ruta/a/imagen23.jpg"),
    ITEM24("Laptop", 500.0, "ruta/a/imagen24.jpg"),
    ITEM25("Altavoces Bluetooth", 35.0, "ruta/a/imagen25.jpg"),
    ITEM26("Batería externa", 18.0, "ruta/a/imagen26.jpg"),
    ITEM27("Cargador inalámbrico", 12.0, "ruta/a/imagen27.jpg"),
    ITEM28("Cámara fotográfica", 100.0, "ruta/a/imagen28.jpg"),
    ITEM29("Videocámara", 220.0, "ruta/a/imagen29.jpg"),
    ITEM30("Monitor", 120.0, "ruta/a/imagen30.jpg"),
    ITEM31("Teclado mecánico", 40.0, "ruta/a/imagen31.jpg"),
    ITEM32("Ratón de computadora", 25.0, "ruta/a/imagen32.jpg"),
    ITEM33("Bicicleta", 150.0, "ruta/a/imagen33.jpg"),
    ITEM34("Patines", 30.0, "ruta/a/imagen34.jpg"),
    ITEM35("Raqueta de tenis", 40.0, "ruta/a/imagen35.jpg"),
    ITEM36("Balón de fútbol", 15.0, "ruta/a/imagen36.jpg"),
    ITEM37("Pelota de baloncesto", 20.0, "ruta/a/imagen37.jpg"),
    ITEM38("Patinete", 50.0, "ruta/a/imagen38.jpg"),
    ITEM39("Tienda de campaña", 75.0, "ruta/a/imagen39.jpg"),
    ITEM40("Saco de dormir", 35.0, "ruta/a/imagen40.jpg"),
    ITEM41("Linterna", 12.5, "ruta/a/imagen41.jpg"),
    ITEM42("Termo", 15.0, "ruta/a/imagen42.jpg"),
    ITEM43("Manta", 18.0, "ruta/a/imagen43.jpg"),
    ITEM44("Olla de camping", 30.0, "ruta/a/imagen44.jpg"),
    ITEM45("Cuchillo de supervivencia", 20.0, "ruta/a/imagen45.jpg"),
    ITEM46("GPS portátil", 100.0, "ruta/a/imagen46.jpg"),
    ITEM47("Libro de aventuras", 12.0, "ruta/a/imagen47.jpg"),
    ITEM48("Juegos de mesa", 22.5, "ruta/a/imagen48.jpg"),
    ITEM49("Rompecabezas", 10.0, "ruta/a/imagen49.jpg"),
    ITEM50("Cámara instantánea", 65.0, "ruta/a/imagen50.jpg");

    private String nombre;
    private double precio;
    private Image imagen;

    Item(String nombre, double precio, String rutaImagen) {
        this.nombre = nombre;
        this.precio = precio;
        try {
            this.imagen = ImageIO.read(new File(rutaImagen));
        } catch (IOException e) {
            e.printStackTrace();
            this.imagen = null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Image getImagen() {
        return imagen;
    }
}
