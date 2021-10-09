package kz.iitu.jakartaee.cdi.decorator;

public interface DataSource {

    void writeData(String data);
    String readData();

}
