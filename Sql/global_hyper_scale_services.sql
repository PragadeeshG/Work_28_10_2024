create table if not exists global_hyper_scale_services(
service_id bigint not null,
service_code varchar(255) null,
scalable_computing varchar(255) null,
horizontal_scalability char null,
vertical_scalability char null,
resource_pooling varchar(255) null,
orcehstration_support varchar(255) null,
intelligent_load_balancing varchar(255) null,
virtual_server_access varchar(255) null,
virtual_networking varchar(255) null,
check_points varchar(255) null,
constraint global_hyper_scale_services_pk primary key(service_id));