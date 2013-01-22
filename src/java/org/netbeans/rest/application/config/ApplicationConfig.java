/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Michael Suryadi
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    public Set<Class<?>> getClasses() {
        return getRestResourceClasses();
    }

    /**
     * Do not modify this method. It is automatically generated by NetBeans REST support.
     */
    private Set<Class<?>> getRestResourceClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        resources.add(service.ProductFacadeREST.class);
        resources.add(service.DiscountCodeFacadeREST.class);
        resources.add(service.PurchaseOrderFacadeREST.class);
        resources.add(service.MicroMarketFacadeREST.class);
        resources.add(service.ManufacturerFacadeREST.class);
        resources.add(service.ProductCodeFacadeREST.class);
        resources.add(service.CustomerFacadeREST.class);
        return resources;
    }
    
}
