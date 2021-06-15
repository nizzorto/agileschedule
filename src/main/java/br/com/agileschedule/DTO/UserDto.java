package br.com.agileschedule.DTO;

public class UserDto {

	private Long id;
	private String user;
	private String senha;

	public UserDto() {
		super();
	}

	public UserDto(Long id, String user, String senha) {
		super();
		this.id = id;
		this.user = user;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

	public String getSenha() {
		return senha;
	}

}
