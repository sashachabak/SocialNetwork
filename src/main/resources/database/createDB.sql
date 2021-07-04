create table users
(
    id                BIGINT auto_increment,
    email             VARCHAR(100)                 not null,
    first_name        VARCHAR(50)                  not null,
    last_name         VARCHAR(50)                  not null,
    password          VARCHAR(255)                 not null,
    gender            VARCHAR(10)                  not null,
    age               int                          not null,
    country           VARCHAR(32)                  not null,
    role              VARCHAR(10) default 'USER'   not null,
    status            VARCHAR(10) default 'ACTIVE' not null,
    time_registration TIMESTAMP                    not null,
    constraint users_pk
        primary key (id)
);

create unique index users_email_uindex
    on users (email);

