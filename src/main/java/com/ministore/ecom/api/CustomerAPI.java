/**
 * Copyright (c) 2022 E-com . All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://crafie.ministore.com/LICENSE.txt
 */
package com.ministore.ecom.api;

import com.ministore.ecom.datas.model.Customer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

/**
 * REST Web Service
 *
 */
@Path("customer")
public class CustomerAPI {

    /** Creates a new instance of CustomerAPI */
    public CustomerAPI() {
    }

    /**
     * Retrieves representation of an instance of CustomerAPI
     * @return an instance of Customer
     */
    @GET
    @Produces("text/plain")
    public String getText() {
		Customer customer = new Customer();
        // Return a String representation of Customer
        return "" + customer;
    }
}
