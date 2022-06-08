package com.example.demo1.resources;


import com.example.demo1.enity.Product;
import com.example.demo1.repository.InMemoryProductModel;
import com.example.demo1.repository.ProductModel;

import javax.ws.rs.*;
import java.util.List;

@Path("/products")
@Produces("application/json")
@Consumes("application/json")
public class ProductResources {
    ProductModel productModel;

    public ProductResources() {
        this.productModel = new InMemoryProductModel();
    }

    @GET
    @Produces("application/json")
    public List<Product> findAll(){
        return productModel.findAll();
    }

    @Path("{id}")
    @GET
    @Produces("application/json")
    public Product findById(@PathParam("id") int id){
        return productModel.findById(id);
    }
    @POST
    public Product create(Product product){
        return productModel.save(product);
    }
    @PUT
    @Path("{id}")
    public Product update(@PathParam("id") int id, Product updateProduct){
        return productModel.update(updateProduct,id);
    }
    @DELETE
    @Path("{id}")
    public boolean delete(@PathParam("id") int id){
        return productModel.delete(id);
    }
}
