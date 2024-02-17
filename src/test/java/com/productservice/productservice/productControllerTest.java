//package com.productservice.productservice;
//
//import com.productservice.productservice.controllers.ProductController;
//import com.productservice.productservice.dtos.GenericProductDto;
//import com.productservice.productservice.exceptions.ProductNotFoundException;
//import com.productservice.productservice.services.ProductService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest
//public class productControllerTest {
//    @Autowired
//    private ProductController productController;
//    //we are not annotating it with autowired because we want to mock it
//    @MockBean
//    private ProductService productService;
//    @Test
//    void testPlusOneIsTwoOrNot(){
//       // assert(2==1+1);
//        //assertEquals(11,1+1,"1+1 should be 2");
//        assertTrue(2==2);
//       // assert(11,1+1,"1+1 should be 2");
//    }
//    void testGetProductByIdNegative() throws ProductNotFoundException {
//
//
//    assertThrows(ProductNotFoundException.class,()->productController.getProductById(1000000L));
//    }
//    @Test
//    void testGetProductByITestMockingd() throws ProductNotFoundException {
//        //this method is dependent on product service  instead of calling actual productservice.getproductbyid
//        GenericProductDto genericProductDto=new GenericProductDto();
//        genericProductDto.setId(1);
//        when(productService.getProductById(100L)).thenReturn(genericProductDto);
//        when(productService.getProductById(any(Long.class))).thenReturn(genericProductDto);
//       // assertNull(productController.getProductById(100L));
//        assertEquals(genericProductDto,productController.getProductById(1000L));
//    }
//    @Test
//    void testgetProductByidException() throws ProductNotFoundException {
//        when(productService.getProductById(100l)).thenThrow(ProductNotFoundException.class);
//        assertThrows(ProductNotFoundException.class,()->productController.getProductById(100L));
//
//    }
//    @Test
//    void testGetProductByIdCustom() throws ProductNotFoundException {
//        GenericProductDto genericProductDto =new GenericProductDto();
//        when(productService.getProductById(10l)).thenReturn(genericProductDto);
//        assertEquals(genericProductDto,productController.getProductById(10L));
//    }
//
//
//}
