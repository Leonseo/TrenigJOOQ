@Data
public clacc City {
  
  private Long id;
  private Long countryId;
  private String name;
}
//Связь один-ко-многим. Country содержит множество связанных City. 
//City содержит countryid

create table countries 
(
  id              bigserail primary key,
  name            varchar(255),
  government_form varchar(255),
  population      int
  );

create table cities
(
  id        bigserial primary key,
  coutry_id bigint,
  name      varchar(255)
);

