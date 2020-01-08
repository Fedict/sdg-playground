/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.fedict.signup.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import java.net.URL;
import javax.persistence.Entity;

/**
 *
 * @author Bart.Hanssens
 */
@Entity
public class Site extends PanacheEntity {
	public String description;
	public URL website;
	public String adminEmail;
	public String contactEmail;
	public Boolean forward;
	public Boolean approved;
	
	
}
