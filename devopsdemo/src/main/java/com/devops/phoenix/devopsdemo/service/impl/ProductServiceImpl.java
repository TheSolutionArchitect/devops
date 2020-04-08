package com.devops.phoenix.devopsdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devops.phoenix.devopsdemo.domain.Products;
import com.devops.phoenix.devopsdemo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Products> getProducts(){
		List<Products> pList= new ArrayList<Products>();
		pList.add(new Products(1, "Wireless IP Telephony", "Take full advantage of high-quality VoIP while retaining the convenience and ease of use you expect from a desktop phone", 4, ""));
		pList.add(new Products(1, "Wireless Routers", "Improve productivity by meeting voice-communications needs throughout your organization", 3, ""));
		pList.add(new Products(1, "Wireless Adapters ", "Models include color displays, dynamic soft keys for call features and functions and support optional key expansion module as an accessory", 4, ""));
		pList.add(new Products(1, "Wireless LAN", "Get on-campus mobility using voice over wireless LAN. Extend communications for deskless workers", 2, ""));
		pList.add(new Products(1, "LAN Controller", "Improve team performance and increase ROI with Cisco IP phones.", 5, ""));
		pList.add(new Products(1, "Antennas", "Customize XML-based services to provide users with information such as stock quotes, directories, and web content.", 4, ""));
		
		return pList;
	}
}
