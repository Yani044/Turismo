/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicios;

import com.mercadopago.MercadoPago;
import com.mercadopago.exceptions.MPConfException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.Item;



public class PagoService {
    
  public void pagar() throws MPConfException, MPException{
      
        // Agrega credenciales
        MercadoPago.SDK.setAccessToken("PROD_ACCESS_TOKEN");

        // Crea un objeto de preferencia
        Preference preference = new Preference();

        // Crea un ítem en la preferencia
        Item item = new Item();
        item.setTitle("Mi producto")
            .setQuantity(1)
            .setUnitPrice((float) 75.56);
        preference.appendItem(item);
        preference.save();

        /*   PARA AGREGAR AL BOTON PAGAR
        <form action="/procesar-pago" method="POST">
  <script
   src="https://www.mercadopago.com.mx/integrations/v1/web-payment-checkout.js"
   data-preference-id="${preference.id}">
  </script>
</form>
        */
      
  }
  

    
}



