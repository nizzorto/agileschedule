package br.com.agileschedule.Form;

public class UserForm {
	
	private String userName;
	private String senha;
	
	public UserForm(String userName, String senha) {
		super();
		this.userName = userName;
		this.senha = senha;
	}
	public UserForm() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
