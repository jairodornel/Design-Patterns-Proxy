/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Orcamento {
    private final BigDecimal valorOrcamento;
    private final BigDecimal descontoOrcamento;
    
    public Orcamento() {}

    public Orcamento(BigDecimal valorOrcamento, BigDecimal descontoOrcamento) {
        this.valorOrcamento = valorOrcamento;
        this.descontoOrcamento = descontoOrcamento;
    }
    
     public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void   setValorOrcamento( BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public BigDecimal getDescontoOrcamento() {
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e ){
            throws  new RuntimeException(e);
        }
        
        return descontoOrcamento;
    }

    public void   setDescontoOrcamento( BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }

    
}
