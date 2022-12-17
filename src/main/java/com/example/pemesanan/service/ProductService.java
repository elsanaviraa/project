package com.example.pemesanan.service;

//import java.io.IOException;
import java.util.List;

//import org.springframework.web.multipart.MultipartFile;

import com.example.pemesanan.dto.ViewProductDto;
import com.example.pemesanan.model.Product;

public interface ProductService {

	public List<Product> findAll();
	public String regProduct(Product req);
	public String updProduct(Product req);
	public String delProduct(String id);
	
	public List<ViewProductDto> getViewByDto (String idProduct);
	public List<Product> getProductByIdProduct(String idProduct);
	
	//utk tambah gambar
	//public String uploadImage(MultipartFile file, String idProduct) throws IOException;
	//public byte[] getgambarbyid (String idProduct);
}
