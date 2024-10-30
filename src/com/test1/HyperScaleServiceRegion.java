package com.test1;

public class HyperScaleServiceRegion {
	private String dataCentre;
	private String electricalNetwork;
	private String hyperScalarTask;
	private String hypervisors;
	private Integer uninterruptedCode;
	private Integer automaticTransferSwitchCode;
	private String proximity;
	private String backupGen;
	private String pricing;
	private String hardwareRequirements;

	public HyperScaleServiceRegion() {

	}

	public HyperScaleServiceRegion(String dataCentre, String electricalNetwork, String hyperScalarTask,
			String hypervisors, Integer uninterruptedCode, Integer automaticTransferSwitchCode, String proximity,
			String backupGen, String pricing, String hardwareRequirements) {
		super();
		this.dataCentre = dataCentre;
		this.electricalNetwork = electricalNetwork;
		this.hyperScalarTask = hyperScalarTask;
		this.hypervisors = hypervisors;
		this.uninterruptedCode = uninterruptedCode;
		this.automaticTransferSwitchCode = automaticTransferSwitchCode;
		this.proximity = proximity;
		this.backupGen = backupGen;
		this.pricing = pricing;
		this.hardwareRequirements = hardwareRequirements;
	}

	public String getDataCentre() {
		return dataCentre;
	}

	public void setDataCentre(String dataCentre) {
		this.dataCentre = dataCentre;
	}

	public String getElectricalNetwork() {
		return electricalNetwork;
	}

	public void setElectricalNetwork(String electricalNetwork) {
		this.electricalNetwork = electricalNetwork;
	}

	public String getHyperScalarTask() {
		return hyperScalarTask;
	}

	public void setHyperScalarTask(String hyperScalarTask) {
		this.hyperScalarTask = hyperScalarTask;
	}

	public String getHypervisors() {
		return hypervisors;
	}

	public void setHypervisors(String hypervisors) {
		this.hypervisors = hypervisors;
	}

	public Integer getUninterruptedCode() {
		return uninterruptedCode;
	}

	public void setUninterruptedCode(Integer uninterruptedCode) {
		this.uninterruptedCode = uninterruptedCode;
	}

	public Integer getAutomaticTransferSwitchCode() {
		return automaticTransferSwitchCode;
	}

	public void setAutomaticTransferSwitchCode(Integer automaticTransferSwitchCode) {
		this.automaticTransferSwitchCode = automaticTransferSwitchCode;
	}

	public String getProximity() {
		return proximity;
	}

	public void setProximity(String proximity) {
		this.proximity = proximity;
	}

	public String getBackupGen() {
		return backupGen;
	}

	public void setBackupGen(String backupGen) {
		this.backupGen = backupGen;
	}

	public String getPricing() {
		return pricing;
	}

	public void setPricing(String pricing) {
		this.pricing = pricing;
	}

	public String getHardwareRequirements() {
		return hardwareRequirements;
	}

	public void setHardwareRequirements(String hardwareRequirements) {
		this.hardwareRequirements = hardwareRequirements;
	}

}
