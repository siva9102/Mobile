package com.Mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mobile.Entity.MobileEntity;
import com.Mobile.Service.MobileService;
import com.globalExceptionHandler.ColorNotFoundException;
import com.globalExceptionHandler.NameNotFoundException;
import com.globalExceptionHandler.NumberNotFoundException;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/mob/api")
public class MobileController {
	@Autowired
	MobileService ms;

	@PostMapping(value = "/Postvalue")
	public String PostAll(@RequestBody List<MobileEntity> a) {

		return ms.PostAll(a);
	}

	 @GetMapping(value="/getvalue1")
	public List<MobileEntity> getAll()
	{
	return ms.getAll();
	}
	@GetMapping(value = "/getvalue/{a}")
	public MobileEntity get(@PathVariable Integer a) {

		return ms.get(a);
	}

	@PutMapping(value = "/putvalue/{s}")
	public String get123(@RequestBody MobileEntity m,@PathVariable Integer s) {
		return ms.get123(m,s);
	}
	
	@DeleteMapping(value = "/deletevalue/{a}")
	public String get1(@PathVariable Integer a) {
		return ms.get1(a);
	}
	
	@PatchMapping(value = "/patchvalue/{s}")
	public String get124(@RequestBody MobileEntity m,@PathVariable Integer s) {
		return ms.get124(m,s);
	}
	@GetMapping("/getmax")
	public Integer getMax() {
	 return ms.getMax();	
		
		
	}
	@GetMapping("/getmax1")
	public MobileEntity getMax1() {
	 return ms.getMax1();	
		
	}	
	@GetMapping("/getsort")
	public List<MobileEntity> getsort() {
	 return ms.getsort();	
		}
	@GetMapping("/getcount")
	public Long  getcount() {
	return ms.getcount();	
		}
	@GetMapping("/getevenprice")
	public List<MobileEntity> getprint () {
	return ms.getprint();	
		}	
	@GetMapping("/getsum")
	public Integer  getsum1 () {
	return ms.getsum1();	
		}	
	@GetMapping("/geteven")
	public List<MobileEntity> getprint1 () {
	return ms.getprint1();	
		}
	@GetMapping("/getmaxvalue")
	public int getmax1 () {
	return ms.getmax1();	
		}
	@GetMapping("/getmaxprice")
	public MobileEntity getmprice() {
	 return ms.getmprice();	
		}
	@GetMapping(value="/getbrand/{a}")
	public List<MobileEntity> getb(@PathVariable String a)
	{
	return ms.getb(a);
	}
	@GetMapping(value="/getprice1/{a}/{b}")
	public List<MobileEntity> getb1(@PathVariable Integer a,@PathVariable Integer b)
	{
	return ms.getb1(a,b);
	}
	@GetMapping(value="/getprice2")
	public List<MobileEntity> getb2(@RequestParam Integer a,@RequestParam Integer b)
	{
	return ms.getb2(a,b);
	}
	//JPQL query
	@GetMapping(value="/getvalue5/{a}")
	public List<MobileEntity> getb3(@PathVariable Integer a)
	{
	return ms.getb3(a);
	}
	@GetMapping(value="/getvalue6/{a}")
	public List<MobileEntity> getb4(@PathVariable String a)
	{
	return ms.getb4(a);
	}
	
	@GetMapping(value="/getexception/{a}")
	public List<MobileEntity> getexcep(@PathVariable String a) throws NameNotFoundException
	{
	return ms.getexcep(a);
	}
	
	
	@GetMapping(value="/getexception1/{a}")
	public List<MobileEntity> getexcep1(@PathVariable String a) throws NumberNotFoundException
	{
	return ms.getexcep1(a);
	}	
	@GetMapping(value="/getgit/{a}")
	public List<MobileEntity> getexcep2(@PathVariable String a) throws ColorNotFoundException
	{
	return ms.getexcep2(a);
	}	
@GetMapping(value="/primenum/{a}")
public Integer getprime(@PathVariable Integer a) {
	
		for(int i=1;i<10;i++) {
		boolean isPrime = true;
		for(int j=2;j<i;j++) {
			
		if(i%j==0) {
			
		boolean isprime=false;	
		break;
		}	
			if(isPrime==true) {
				
		return(i);		
			}
		}
		}
		return a;
	
}


}


