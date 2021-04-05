package com.partola.security.oauth2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {
	private String contextPath;
	private String realmImportFile;
	AdminUser adminUser = new AdminUser();
	
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	
	public void setRealmImportFile(String realmImportFile) {
		this.realmImportFile = realmImportFile;
	}
	
	public void setAdminUser(AdminUser adminUser) {
		this.adminUser = adminUser;
	}
	
	public String getContextPath() {
		return contextPath;
	}
	
	public String getRealmImportFile() {
		return realmImportFile;
	}
	
	public AdminUser getAdminUser() {
		return adminUser;
	}
	
	public static class AdminUser {
		private String username = "admin";
		private String password = "admin";
		
		public void setUsername(String username) {
			this.username = username;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getUsername() {
			return username;
		}
		
		public String getPassword() {
			return password;
		}
	}
}
