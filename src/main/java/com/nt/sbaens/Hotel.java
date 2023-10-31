package com.nt.sbaens;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;



@Component("hotel")
@Data
public class Hotel {
	@Value("1008")
	 private Integer Hotelid;
	@Value("${hotel.name}")
	private String HotelName;
	@Value("${hotel.addrs}")
    private String HotelLocation;
   
    @Value("#{pmenu. BondaPrice+pmenu.PuriPrice}")
    private float billamt;
    @Value("${custmer.name}")
    private String custName;
    @Value("${user.name}")
    private String userName;
    @Value("${os.name}")
    private String osName;
    @Value("${Path}")
    private String pathData;


	}
    
    
    
    
    
    
	

