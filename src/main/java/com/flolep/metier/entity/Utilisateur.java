package com.flolep.metier.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Utilisateur {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;
	String login;
}
