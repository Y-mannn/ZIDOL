package com.zidol.fc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userCode;
	
	@Column
	@NotNull
	private String userEmail;
	
	@Column
	@NotNull
	private String userPassword;
	
	@Column
	@NotNull
	private String userName;
	
	@Column
	@NotNull
	private String userNickname;

	@Builder
	public User(long userCode, @NotNull String userEmail, @NotNull String userPassword, @NotNull String userName,
			@NotNull String userNickname) {
		super();
		this.userCode = userCode;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userNickname = userNickname;
	}

}
