package com.Mobile.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.Mobile.Dao.MobileDao;
import com.Mobile.Entity.MobileEntity;
import com.globalExceptionHandler.ColorNotFoundException;
import com.globalExceptionHandler.NameNotFoundException;
import com.globalExceptionHandler.NumberNotFoundException;


@Service
public class MobileService {
@Autowired
MobileDao md;

public String PostAll(List <MobileEntity> a) {
	return md.PostAll(a);
	
}
public List<MobileEntity> getAll() {
	return  md.getAll();
	
}
public MobileEntity get(Integer a) {
	return  md.get(a);
	
}



public String get1(Integer a) {
	return  md.get1(a);
	
}
public String get123(MobileEntity m,Integer a) {
	return  md.get123(m,a);
	
}
public String get124(MobileEntity m,Integer a) {
	return  md.get124(m,a);
	
}

public Integer getMax(){
	
List <MobileEntity> x = md.getAll();	
return x.stream().map(y->y.getPrice()).max(Comparable::compareTo).get();
	
}
public MobileEntity getMax1() {
List	<MobileEntity> x = md.getAll();
	return  x.stream().max(Comparator.comparing(MobileEntity::getPrice)).get();
	
}
public List<MobileEntity> getsort() {
List	<MobileEntity> x = md.getAll();
	return  x.stream().sorted(Comparator.comparing(MobileEntity::getPrice)).collect(Collectors.toList());
	
}
public Long  getcount() {
List	<MobileEntity> x = md.getAll();
	return  x.stream().map(y->y.getColor()).count();
	
}
public List<MobileEntity> getprint() {
List<MobileEntity> x = md.getAll();
	return  x.stream().map(y->{
	if(y.getBarnd()==null||y.getBarnd().length() % 2 == 0 ) 
	{
		y.setPrice(y.getPrice()+y.getPrice()*10/100);
		}
	return y;
}).collect(Collectors.toList());
	
}
public Integer  getsum1() {
List	<MobileEntity> x = md.getAll();
	return  x.stream().collect(Collectors.summingInt(y->y.getPrice()));
	
}
public List<MobileEntity> getprint1() {
List<MobileEntity> x = md.getAll();
	return  x.stream().filter(y->y.getBarnd()==null||y.getBarnd().length() % 2 == 0 ).collect(Collectors.toList());
	
}
public int getmax1() {
	return  md.getmax1();
	
}
public MobileEntity getmprice() {
	return  md.getmprice();
	
}
public List<MobileEntity> getb(String a)
{
return md.getb(a);

}
public List<MobileEntity> getb1(Integer a,Integer b)
{
return md.getb1(a,b);

}
public List<MobileEntity> getb2(@RequestParam Integer a,@RequestParam Integer b)
{
return md.getb2(a,b);
}
public List<MobileEntity> getb3(@PathVariable Integer a)
{
return md.getb3(a);
}
public List<MobileEntity> getb4(@PathVariable String a)
{
return md.getb4(a);
}
public List<MobileEntity> getexcep(@PathVariable String a) throws NameNotFoundException
{
	List<MobileEntity> result = md.getexcep(a);
	if(result.isEmpty()) {
	
	throw new NameNotFoundException("Name Not Found");
	
	}
	else {
return md.getexcep(a);
	}
}
public List<MobileEntity> getexcep1(@PathVariable String a) throws NumberNotFoundException
{
	List<MobileEntity> x = md.getexcep1(a);
	if(x.isEmpty()) {
	
	throw new NumberNotFoundException("Number Not Found");
	
	}
	else {
return md.getexcep1(a);
	}
}


public List<MobileEntity> getexcep2(@PathVariable String a) throws ColorNotFoundException
{
	List<MobileEntity> result = md.getexcep2(a);
	if(result.isEmpty()) {
	
	throw new ColorNotFoundException("Color Not Found");
	
	}
	else {
return md.getexcep2(a);
	}
}

}