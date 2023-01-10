package com.infy.infytvseries.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

public class UserDTO {

	private Integer registrationId;

	@NotNull(message = "{user.name.notpresent}")
	@Pattern(regexp = "[A-Z][a-z]+(\\s[A-Z][a-z]+)*", message = "{user.name.invalid}")
	private String userName;

	@NotNull(message = "{user.email.notpresent}")
	@Pattern(regexp = "[A-Za-z]+[0-9]+[@](gmail|infy)[.](com)", message = "{user.email.invalid}")
	private String email;

	@NotNull(message = "{user.regdate.notpresent}")
	private LocalDate regDate;

	@NotNull(message = "{user.seriestype.notpresent}")
	@Pattern(regexp = "(Hindi|English)", message = "{user.seriestype.invalid}")
	private String seriesType;

	@NotNull(message = "{user.seriesname.notpresent}")
	private String seriesName;
	public Integer getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}
	

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public String getSeriesType() {
		return seriesType;
	}
	public void setSeriesType(String seriesType) {
		this.seriesType = seriesType;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
}
