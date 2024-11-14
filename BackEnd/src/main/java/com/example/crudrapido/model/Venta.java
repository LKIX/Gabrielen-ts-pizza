package com.example.crudrapido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="venta")
@Table(name="tbl_venta")
public class Venta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String cedulaDeIdentidad;
    private String nombre;
    private String pedido1;
    private String pedido2;
    private String pedido3;
    private String pedido4;
    private String pedido5;
    private String pedido6;
    private String pedido7;
    private String pedido8;
    private String pedido9;
    private String pedido10;

    public Venta(String cedulaDeIdentidad, String nombre, String pedido1, String pedido2, String pedido3, String pedido4, String pedido5, String pedido6, String pedido7, String pedido8, String pedido9, String pedido10) {
        this.cedulaDeIdentidad = cedulaDeIdentidad;
        this.nombre = nombre;
        this.pedido10 = pedido10;
        this.pedido1 = pedido1;
        this.pedido2 = pedido2;
        this.pedido3 = pedido3;
        this.pedido4 = pedido4;
        this.pedido5 = pedido5;
        this.pedido6 = pedido6;
        this.pedido7 = pedido7;
        this.pedido8 = pedido8;
        this.pedido9 = pedido9;
    }

    public Venta(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedulaDeIdentidad() {
        return cedulaDeIdentidad;
    }

    public void setCedulaDeIdentidad(String cedulaDeIdentidad) {
        this.cedulaDeIdentidad = cedulaDeIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPedido1() {
        return pedido1;
    }

    public void setPedido1(String pedido1) {
        this.pedido1 = pedido1;
    }

    public String getPedido2() {
        return pedido2;
    }

    public void setPedido2(String pedido2) {
        this.pedido2 = pedido2;
    }

    public String getPedido3() {
        return pedido3;
    }

    public void setPedido3(String pedido3) {
        this.pedido3 = pedido3;
    }

    public String getPedido4() {
        return pedido4;
    }

    public void setPedido4(String pedido4) {
        this.pedido4 = pedido4;
    }

    public String getPedido5() {
        return pedido5;
    }

    public void setPedido5(String pedido5) {
        this.pedido5 = pedido5;
    }

    public String getPedido6() {
        return pedido6;
    }

    public void setPedido6(String pedido6) {
        this.pedido6 = pedido6;
    }

    public String getPedido7() {
        return pedido7;
    }

    public void setPedido7(String pedido7) {
        this.pedido7 = pedido7;
    }

    public String getPedido8() {
        return pedido8;
    }

    public void setPedido8(String pedido8) {
        this.pedido8 = pedido8;
    }

    public String getPedido9() {
        return pedido9;
    }

    public void setPedido9(String pedido9) {
        this.pedido9 = pedido9;
    }

    public String getPedido10() {
        return pedido10;
    }

    public void setPedido10(String pedido10) {
        this.pedido10 = pedido10;
    }

}
