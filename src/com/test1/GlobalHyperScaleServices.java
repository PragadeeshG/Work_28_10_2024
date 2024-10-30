package com.test1;

public class GlobalHyperScaleServices {
	private long serviceId;
	private String serviceCode;
	private String scalableComputing;
	private boolean horizontalScalability;
	private boolean verticalScalability;
	private String resourcePooling;
	private String orcehstrationSupport;
	private String intelligentLoadBalancing;
	private String virtualServerAccess;
	private String virtualNetworking;
	private String checkPoints;

	public GlobalHyperScaleServices() {

	}

	public GlobalHyperScaleServices(long serviceId, String serviceCode, String scalableComputing,
			boolean horizontalScalability, boolean verticalScalability, String resourcePooling,
			String orcehstrationSupport, String intelligentLoadBalancing, String virtualServerAccess,
			String virtualNetworking, String checkPoints) {
		super();
		this.serviceId = serviceId;
		this.serviceCode = serviceCode;
		this.scalableComputing = scalableComputing;
		this.horizontalScalability = horizontalScalability;
		this.verticalScalability = verticalScalability;
		this.resourcePooling = resourcePooling;
		this.orcehstrationSupport = orcehstrationSupport;
		this.intelligentLoadBalancing = intelligentLoadBalancing;
		this.virtualServerAccess = virtualServerAccess;
		this.virtualNetworking = virtualNetworking;
		this.checkPoints = checkPoints;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getScalableComputing() {
		return scalableComputing;
	}

	public void setScalableComputing(String scalableComputing) {
		this.scalableComputing = scalableComputing;
	}

	public boolean isHorizontalScalability() {
		return horizontalScalability;
	}

	public void setHorizontalScalability(boolean horizontalScalability) {
		this.horizontalScalability = horizontalScalability;
	}

	public boolean isVerticalScalability() {
		return verticalScalability;
	}

	public void setVerticalScalability(boolean verticalScalability) {
		this.verticalScalability = verticalScalability;
	}

	public String getResourcePooling() {
		return resourcePooling;
	}

	public void setResourcePooling(String resourcePooling) {
		this.resourcePooling = resourcePooling;
	}

	public String getOrcehstrationSupport() {
		return orcehstrationSupport;
	}

	public void setOrcehstrationSupport(String orcehstrationSupport) {
		this.orcehstrationSupport = orcehstrationSupport;
	}

	public String getIntelligentLoadBalancing() {
		return intelligentLoadBalancing;
	}

	public void setIntelligentLoadBalancing(String intelligentLoadBalancing) {
		this.intelligentLoadBalancing = intelligentLoadBalancing;
	}

	public String getVirtualServerAccess() {
		return virtualServerAccess;
	}

	public void setVirtualServerAccess(String virtualServerAccess) {
		this.virtualServerAccess = virtualServerAccess;
	}

	public String getVirtualNetworking() {
		return virtualNetworking;
	}

	public void setVirtualNetworking(String virtualNetworking) {
		this.virtualNetworking = virtualNetworking;
	}

	public String getCheckPoints() {
		return checkPoints;
	}

	public void setCheckPoints(String checkPoints) {
		this.checkPoints = checkPoints;
	}

}
