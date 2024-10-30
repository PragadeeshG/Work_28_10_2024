package com.test1;

public class EdgeDataCenterRegion {
	private long regionCode;
	private Integer dataCentre;
	private String edgeLocationCoordinates;
	private String regionSpecificServices;
	private String networkSecurityAppliances;
	private String cloudDataCenter;
	private String elasticityProvisonning;
	private String edgeLocationCloudFronts;
	private String latencyAvoidance;

	public EdgeDataCenterRegion() {

	}

	public EdgeDataCenterRegion(long regionCode, Integer dataCentre, String edgeLocationCoordinates,
			String regionSpecificServices, String networkSecurityAppliances, String cloudDataCenter,
			String elasticityProvisonning, String edgeLocationCloudFronts, String latencyAvoidance) {
		super();
		this.regionCode = regionCode;
		this.dataCentre = dataCentre;
		this.edgeLocationCoordinates = edgeLocationCoordinates;
		this.regionSpecificServices = regionSpecificServices;
		this.networkSecurityAppliances = networkSecurityAppliances;
		this.cloudDataCenter = cloudDataCenter;
		this.elasticityProvisonning = elasticityProvisonning;
		this.edgeLocationCloudFronts = edgeLocationCloudFronts;
		this.latencyAvoidance = latencyAvoidance;
	}

	public long getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(long regionCode) {
		this.regionCode = regionCode;
	}

	public Integer getDataCentre() {
		return dataCentre;
	}

	public void setDataCentre(Integer dataCentre) {
		this.dataCentre = dataCentre;
	}

	public String getEdgeLocationCoordinates() {
		return edgeLocationCoordinates;
	}

	public void setEdgeLocationCoordinates(String edgeLocationCoordinates) {
		this.edgeLocationCoordinates = edgeLocationCoordinates;
	}

	public String getRegionSpecificServices() {
		return regionSpecificServices;
	}

	public void setRegionSpecificServices(String regionSpecificServices) {
		this.regionSpecificServices = regionSpecificServices;
	}

	public String getNetworkSecurityAppliances() {
		return networkSecurityAppliances;
	}

	public void setNetworkSecurityAppliances(String networkSecurityAppliances) {
		this.networkSecurityAppliances = networkSecurityAppliances;
	}

	public String getCloudDataCenter() {
		return cloudDataCenter;
	}

	public void setCloudDataCenter(String cloudDataCenter) {
		this.cloudDataCenter = cloudDataCenter;
	}

	public String getElasticityProvisonning() {
		return elasticityProvisonning;
	}

	public void setElasticityProvisonning(String elasticityProvisonning) {
		this.elasticityProvisonning = elasticityProvisonning;
	}

	public String getEdgeLocationCloudFronts() {
		return edgeLocationCloudFronts;
	}

	public void setEdgeLocationCloudFronts(String edgeLocationCloudFronts) {
		this.edgeLocationCloudFronts = edgeLocationCloudFronts;
	}

	public String getLatencyAvoidance() {
		return latencyAvoidance;
	}

	public void setLatencyAvoidance(String latencyAvoidance) {
		this.latencyAvoidance = latencyAvoidance;
	}

}
