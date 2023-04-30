/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

import java.math.BigDecimal;
import model.Orcamento;
import model.OrcamentoProxy;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Orcamento orcamento new Orcamento(new BigDecimal("100"),new  BigDecimal("10"));
        System.out.println("Valor do orcamento="+orcamento.getValorOrcamento());
        System.out.println("tempo para ver desconto="+orcamento.getdescontoOrcamento());
        
        OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
        System.out.println("Valor sem proxy="+proxy.getDescontoOrcamento());
        System.out.println("Valor com proxy="+proxy.getDescontoOrcamento());
        System.out.println("Valor com proxy="+proxy.getDescontoOrcamento());



        
    }
}
