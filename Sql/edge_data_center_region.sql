create table if not exists edge_data_center_region(
region_code bigint not null,
data_centre Integer null,
edge_location_coordinates varchar(255) null,
region_specific_services varchar(255) null,
network_security_appliances varchar(255) null,
cloud_data_center varchar(255) null,
elasticity_provisonning varchar(255) null,
edge_location_cloud_fronts varchar(255) null,
latency_avoidance varchar(255) null,
constraint edge_data_center_region_pk primary key(region_code));
