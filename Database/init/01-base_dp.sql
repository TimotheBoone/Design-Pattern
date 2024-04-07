create database michka_dp;
use michka_dp;

create table if not exists ADRESSE
(
    ID_ADRESSE  int auto_increment
        primary key,
    type_voie   varchar(10)  null,
    nom_voie    varchar(100) null,
    numero_voie varchar(10)  null,
    code_postal varchar(5)   null,
    ville       varchar(100) null
);

create table if not exists CATEGORIE_SURFACE_BIEN
(
    ID_CATEGORIE_SURFACE_BIEN  int auto_increment
        primary key,
    LIB_CATEGORIE_SURFACE_BIEN varchar(30) not null
);



create table if not exists TYPE_BIEN
(
    ID_TYPE_BIEN  int auto_increment
        primary key,
    LIB_TYPE_BIEN varchar(30) default 'TYPE DE BIEN' not null comment 'Libellé du type de bien'
);

create table if not exists BIEN
(
    ID_BIEN                int auto_increment
        primary key,
    type_bien              int                                         null,
    categorie_surface_bien int                                         null,
    surface_habitable      decimal(5, 2) default 0.00                  not null,
    nbr_pieces             int                                         null,
    `description libre`    text                                        null,
    Commentaire_agence     longtext                                    null,
    date_creation          date          default (cast(now() as date)) null,
    date_derniere_maj      date                                        null,
    ID_ADRESSE             int                                         null,
    NO_APPARTEMENT         varchar(3)                                  null,
    ETAGE                  int                                         null,
    constraint FK_ADRESSE
        foreign key (ID_ADRESSE) references ADRESSE (ID_ADRESSE),
    constraint FK_SURFACE_BIEN
        foreign key (categorie_surface_bien) references CATEGORIE_SURFACE_BIEN (ID_CATEGORIE_SURFACE_BIEN),
    constraint FK_TYPE_BIEN
        foreign key (type_bien) references TYPE_BIEN (ID_TYPE_BIEN)
);

create definer = ilg@localhost trigger BIEN_BEFORE_INSERT
    before insert
    on BIEN
    for each row
BEGIN
    SET NEW.date_creation=date(now());
    SET NEW.date_derniere_maj = date(now());
END;

