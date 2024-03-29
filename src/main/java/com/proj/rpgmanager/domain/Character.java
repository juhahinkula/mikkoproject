package com.proj.rpgmanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Character {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
	private String name;  
	private String charclass;
	private String race;
	private String description;
	
	private int level;
	private int str;
	private int dex;
	private int con;
	private int inte;
	private int wis;
	private int cha;
	private int hp;
	private int hitdie;
	
		
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="groupId")
	private Group group;
	
			
	public Character() {
		
	}
	
	
	public Character( String name, String charclass, String race, String description, int level, int str,
			int dex, int con, int inte, int wis, int cha, int hp, int hitdie, Group group) {
		
		super();
		this.name = name;
		this.charclass = charclass;
		this.race = race;
		this.description = description;
		this.level = level;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.inte = inte;
		this.wis = wis;
		this.cha = cha;
		this.hp = hp;
		this.hitdie = hitdie;
		this.group = group;
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCharclass() {
		return charclass;
	}
	public void setCharclass(String charclass) {
		this.charclass = charclass;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getCon() {
		return con;
	}
	public void setCon(int con) {
		this.con = con;
	}
	public int getInte() {
		return inte;
	}
	public void setInte(int inte) {
		this.inte = inte;
	}
	public int getWis() {
		return wis;
	}
	public void setWis(int wis) {
		this.wis = wis;
	}
	public int getCha() {
		return cha;
	}
	public void setCha(int cha) {
		this.cha = cha;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHitdie() {
		return hitdie;
	}
	public void setHitdie(int hitdie) {
		this.hitdie = hitdie;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
	
	
}
