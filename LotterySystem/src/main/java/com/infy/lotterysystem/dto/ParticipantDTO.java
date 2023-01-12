package com.infy.lotterysystem.dto;

import com.infy.lotterysystem.entity.Participant;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ParticipantDTO {

	private Integer participantId;

	@NotNull(message = "{lottery.name.absent}")
	@Pattern(regexp ="[A-Za-z]+(\\s[A-Za-z]+)*" , message = "{lottery.name.invalid}")
	private String name;

	@NotNull(message = "{lottery.age.absent}")
	private Integer age;

	@NotNull(message = "{lottery.mailid.absent}")
	@Pattern(regexp ="([a-z0-9]+)[@](infy|gmail|yahoo)(.com)" , message = "{lottery.mailid.invalid}")
	private String mailId;

	@NotNull(message = "{lottery.contactno.absent}")
	private Long contactNo;

	@NotNull(message = "{lottery.couponnumber.absent}")
	@Pattern(regexp = "[A-Z]{3}[0-9]{3}", message = "{lottery.couponnumber.invalid}")
	private String couponNumber;

	@NotNull(message = "{lottery.winningamount.absent}")
	private Integer winningAmount;
	public Integer getParticipantId() {
		return participantId;
	}
	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getCouponNumber() {
		return couponNumber;
	}
	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
	}
	public Integer getWinningAmount() {
		return winningAmount;
	}
	public void setWinningAmount(Integer winningAmount) {
		this.winningAmount = winningAmount;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public static ParticipantDTO prepareDTO(Participant participant)
	{
		ParticipantDTO participantDTO=new ParticipantDTO();
		participantDTO.setParticipantId(participant.getParticipantId());
		participantDTO.setName(participant.getName());
		participantDTO.setMailId(participant.getMailId());
		participantDTO.setContactNo(participant.getContactNo());
		participantDTO.setCouponNumber(participant.getCouponNumber());
		participantDTO.setWinningAmount(participant.getWinningAmount());
		return participantDTO;
		
	}
	public static Participant prepareEntity(ParticipantDTO participantDTO){
		Participant participant =new Participant();
		participant.setName(participantDTO.getName());
		participant.setMailId(participantDTO.getMailId());
		participant.setContactNo(participantDTO.getContactNo());
		participant.setCouponNumber(participantDTO.getCouponNumber());
		participant.setWinningAmount(participantDTO.getWinningAmount());
		return participant;
	}
	
}
