package main.java.br.unb.gcs.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {

	private String login;
	private String senha;
	private String nome;
	private String email;
	private String matricula;
	
	
	public Usuario(String login, String senha, String nome,
			String email, String matricula) {		
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.matricula = matricula;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	private Pattern pattern;
	private Matcher matcher;
 
	private static final String REGGEX_EMAIL = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
 
	public void ValidarEmail() {
		pattern = Pattern.compile(REGGEX_EMAIL);
	}
	
	public boolean validateEmail(final String hex) {		 
		matcher = pattern.matcher(hex);
		return matcher.matches();
 	}
	
}
