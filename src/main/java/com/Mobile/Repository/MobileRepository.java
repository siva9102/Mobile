package com.Mobile.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Mobile.Entity.MobileEntity;

public interface MobileRepository extends JpaRepository <MobileEntity,Integer> {
	
	@Query(value = "SELECT max(price) FROM mobiledb.mobiletable",nativeQuery=true)
	public int getmax1();
	
@Query(value = "SELECT *FROM mobiledb.mobiletable WHERE price=(SELECT max(price) FROM mobiledb.mobiletable )",nativeQuery=true)
public MobileEntity getmprice();

@Query(value = "SELECT *FROM mobiledb.mobiletable WHERE barnd=?1",nativeQuery=true)
public List<MobileEntity> getb(String a);

@Query(value = "SELECT *FROM mobiledb.mobiletable WHERE price BETWEEN ?1 and ?2",nativeQuery=true)
public List<MobileEntity> getb1(Integer a,Integer b);

@Query(value = "SELECT *FROM mobiledb.mobiletable WHERE price BETWEEN ?1 and ?2",nativeQuery=true)
public List<MobileEntity> getb2(Integer a,Integer b);

@Query(value = "SELECT e FROM MobileEntity e WHERE e.price=?1")
public List<MobileEntity> getb3(Integer a);

//@Query(value = "SELECT *FROM mobiledb.mobiletable WHERE barnd LIKE 'a%' ",nativeQuery=true)
//public List<MobileEntity> getb4(String a);

//@Query(value = "SELECT *FROM mobiledb.mobiletable WHERE barnd LIKE '%a' ",nativeQuery=true)
//public List<MobileEntity> getb4(String a);

//@Query(value = "SELECT *FROM mobiledb.mobiletable WHERE barnd LIKE '%a%' ",nativeQuery=true)
//public List<MobileEntity> getb4(String a);

//@Query(value = "SELECT *FROM mobiledb.mobiletable WHERE barnd LIKE '_a%' ",nativeQuery=true)
//public List<MobileEntity> getb4(String a);

//@Query(value = "SELECT *FROM mobiledb.mobiletable WHERE barnd LIKE '%a_' ",nativeQuery=true)
//public List<MobileEntity> getb4(String a);

@Query(value = "SELECT e FROM MobileEntity e WHERE e.barnd LIKE in ('a%','s%','d%')")
//public List<MobileEntity> getb4(String  a);

//@Query(value = "SELECT e FROM MobileEntity e WHERE e.barnd LIKE '%a'")
//public List<MobileEntity> getb4(String  a);

//@Query(value = "SELECT e FROM MobileEntity e WHERE e.barnd LIKE '%a%'")
//public List<MobileEntity> getb4(String  a);

//@Query(value = "SELECT e FROM MobileEntity e WHERE e.barnd LIKE '_a%'")
//public List<MobileEntity> getb4(String  a);

//@Query(value = "SELECT e FROM MobileEntity e WHERE e.barnd LIKE '%n_'")
//public List<MobileEntity> getb4(String  a);

@Query(value = "SELECT barnd from MobileEntity WHERE price  between 22000 and 50000",nativeQuery=true)
public List<MobileEntity> getb4(String a);


@Query(value = "SELECT *FROM Mobiledb.mobiletable WHERE barnd=?1",nativeQuery=true)
public List<MobileEntity> getexcep(String a);

@Query(value = "SELECT *FROM Mobiledb.mobiletable WHERE size=?1",nativeQuery=true)
public List<MobileEntity> getexcep1(String a);

@Query(value = "SELECT *FROM Mobiledb.mobiletable WHERE color=?1",nativeQuery=true)
public List<MobileEntity> getexcep2(String a);

//@Query(value = "SELECT *FROM Mobiledb.mobiletable WHERE price=?1",nativeQuery=true)
////public List<MobileEntity> getexcep1(String a);
}
	
	



