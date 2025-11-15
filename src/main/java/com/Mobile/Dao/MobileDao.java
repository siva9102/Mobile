package com.Mobile.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Mobile.Entity.MobileEntity;
import com.Mobile.Repository.MobileRepository;
import com.globalExceptionHandler.ColorNotFoundException;
import com.globalExceptionHandler.NameNotFoundException;
import com.globalExceptionHandler.NumberNotFoundException;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mc;
	
	public String PostAll(List <MobileEntity> a) {
		
		
		mc.saveAll(a);
		return "saved successfully";
	}
	public List<MobileEntity> getAll() {
		
		return mc.findAll();
		
	}
	
public MobileEntity get(Integer a) {
		
		
		MobileEntity x = mc.findById(a).orElse(null);
		return x;
	}	
	
public String get1(Integer a) {
	
	
	 mc.deleteById(a);;
	return "deleted successfully";
}
public String get123(@RequestBody MobileEntity m,@PathVariable Integer a) {
	MobileEntity x = mc.findById(a).get();
	x.setBarnd(m.getBarnd());
	x.setPrice(m.getPrice());
	x.setColor(m.getColor());
	x.setSize(m.getSize());
	 mc.save(x);
	return "updates successfully";
}
public String get124(@RequestBody MobileEntity m,@PathVariable Integer a) {
	MobileEntity x = mc.findById(a).get();
	x.setPrice(m.getPrice());
	mc.save(x);
	return "updates successfully";
}	
public int getmax1() {
	return  mc.getmax1();
	
}
public MobileEntity getmprice() {
	return  mc.getmprice();
}
public List<MobileEntity> getb(String a)
{
return mc.getb(a);
}
public List<MobileEntity> getb1(Integer a,Integer b)
{
return mc.getb1(a,b);
}
public List<MobileEntity> getb2(@RequestParam Integer a,@RequestParam Integer b)
{
return mc.getb2(a,b);
}
public List<MobileEntity> getb3(@PathVariable Integer a)
{
return mc.getb3(a);
}
public List<MobileEntity> getb4(@PathVariable String a)
{
return mc.getb4(a);
}
public List<MobileEntity> getexcep(@PathVariable String a) throws NameNotFoundException
{
return mc.getexcep(a);
}
public List<MobileEntity> getexcep1(@PathVariable String a) throws NumberNotFoundException
{
return mc.getexcep1(a);
}
public List<MobileEntity> getexcep2(@PathVariable String a) throws ColorNotFoundException
{
return mc.getexcep2(a);
}
}
