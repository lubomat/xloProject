drop table if exists vehicles;
create table vehicles(
                         id int primary key auto_increment,
                         type varchar(20) not null,
                         description varchar(200) not null,
                         price int not null,
                         imageUrl varchar(150) not null,
                         brand varchar(20) not null,
                         model varchar(20) not null,
                         color varchar(20) not null,
                         fuelType varchar(10) not null,
                         yearOfProduction int not null,
                         engineSize int not null,
                         sold bit
)