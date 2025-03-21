package models;

public class Localizacao {
    // Atributos da localização
    private int id; // Identificador único da localização
    private double latitude; // Latitude geográfica (ex.: -23.5)
    private double longitude; // Longitude geográfica (ex.: -46.6)
    private int idAreaVerde; // ID da área verde associada à localização

    // Construtor para inicializar uma nova localização
    public Localizacao(int id, double latitude, double longitude, int idAreaVerde) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.idAreaVerde = idAreaVerde;
    }

    // Getters e Setters para encapsulamento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getIdAreaVerde() {
        return idAreaVerde;
    }

    public void setIdAreaVerde(int idAreaVerde) {
        this.idAreaVerde = idAreaVerde;
    }

    // Retorna uma representação em string da localização
    @Override
    public String toString() {
        return "Localização [ID: " + id + ", Latitude: " + latitude + ", Longitude: " + longitude +
                ", ID Área Verde: " + idAreaVerde + "]";
    }
}