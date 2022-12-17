package com.example.pemesanan.service;

import java.util.List;
import com.example.pemesanan.model.Admin;

public interface AdminService {
	
	public List<Admin> findAll();
	public String regAdmin(Admin req);
	public String updAdmin(Admin req);
	public String delAdmin(String id);

}
