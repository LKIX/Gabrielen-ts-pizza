
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
    private Float pago;
    private Integer pedido1;
    private Integer pedido2;
    private Integer pedido3;
    private Integer pedido4;
    private Integer pedido5;
    private Integer pedido6;
    private Integer pedido7;
    private Integer pedido8;
    private Integer pedido9;
    private Integer pedido10;

    public Venta(Float pago,String cedulaDeIdentidad, String nombre, Integer pedido1, Integer pedido2, Integer pedido3, Integer pedido4, Integer pedido5, Integer pedido6, Integer pedido7, Integer pedido8, Integer pedido9, Integer pedido10) {
        this.cedulaDeIdentidad = cedulaDeIdentidad;
        this.pago=pago;
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

    public Integer getPedido1() {
        return pedido1;
    }

    public void setPedido1(Integer pedido1) {
        this.pedido1 = pedido1;
    }

    public Integer getPedido2() {
        return pedido2;
    }

    public void setPedido2(Integer pedido2) {
        this.pedido2 = pedido2;
    }

    public Integer getPedido3() {
        return pedido3;
    }

    public void setPedido3(Integer pedido3) {
        this.pedido3 = pedido3;
    }

    public Integer getPedido4() {
        return pedido4;
    }

    public void setPedido4(Integer pedido4) {
        this.pedido4 = pedido4;
    }

    public Integer getPedido5() {
        return pedido5;
    }

    public void setPedido5(Integer pedido5) {
        this.pedido5 = pedido5;
    }

    public Integer getPedido6() {
        return pedido6;
    }

    public void setPedido6(Integer pedido6) {
        this.pedido6 = pedido6;
    }

    public Integer getPedido7() {
        return pedido7;
    }

    public void setPedido7(Integer pedido7) {
        this.pedido7 = pedido7;
    }

    public Integer getPedido8() {
        return pedido8;
    }

    public void setPedido8(Integer pedido8) {
        this.pedido8 = pedido8;
    }

    public Integer getPedido9() {
        return pedido9;
    }

    public void setPedido9(Integer pedido9) {
        this.pedido9 = pedido9;
    }

    public Integer getPedido10() {
        return pedido10;
    }

    public void setPedido10(Integer pedido10) {
        this.pedido10 = pedido10;
    }

    public Float getPago() {
        return pago;
    }

    public void setPago(Float pago) {
        this.pago = pago;
    }
  }

