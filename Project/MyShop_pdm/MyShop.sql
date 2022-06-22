/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2022/4/23 14:56:24                           */
/*==============================================================*/


drop table if exists address;

drop table if exists cart;

drop table if exists class;

drop table if exists goods;

drop table if exists order_items;

drop table if exists orders;

drop table if exists user;

/*==============================================================*/
/* Table: address                                               */
/*==============================================================*/
create table address
(
   a_id                 int not null auto_increment,
   u_id                 int,
   a_receiver_name      varchar(30),
   a_phone              varchar(30),
   a_detail             varchar(200),
   a_state              int,
   primary key (a_id)
);

/*==============================================================*/
/* Table: cart                                                  */
/*==============================================================*/
create table cart
(
   s_id                 int not null auto_increment,
   g_id                 int,
   u_id                 int,
   s_count              decimal(12,2),
   s_num                int,
   primary key (s_id)
);

/*==============================================================*/
/* Table: class                                                 */
/*==============================================================*/
create table class
(
   c_id                 int not null auto_increment,
   c_name               varchar(30),
   c_info               varchar(200),
   primary key (c_id)
);

/*==============================================================*/
/* Table: goods                                                 */
/*==============================================================*/
create table goods
(
   g_id                 int not null auto_increment,
   c_id                 int,
   g_name               varchar(50),
   g_launchtime         date,
   g_image              varchar(100),
   g_price              decimal(12,2),
   g_state              int,
   g_info               varchar(200),
   primary key (g_id)
);

/*==============================================================*/
/* Table: order_items                                           */
/*==============================================================*/
create table order_items
(
   oi_id                int not null auto_increment,
   o_num                varchar(64),
   g_id                 int,
   oi_count             decimal(12,2),
   oi_num               int,
   primary key (oi_id)
);

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   o_num                varchar(64) not null,
   a_id                 int,
   u_id                 int,
   o_count              decimal(12,2),
   o_date               datetime,
   o_status             int,
   primary key (o_num)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   u_id                 int not null auto_increment,
   u_name               varchar(30) not null,
   u_password           varchar(30) not null,
   u_email              varchar(30) not null,
   u_sex                varchar(30),
   u_status             int,
   u_key                varchar(64),
   u_role               int,
   primary key (u_id)
);

alter table address add constraint FK_u_a_fk foreign key (u_id)
      references user (u_id) on delete restrict on update restrict;

alter table cart add constraint FK_g_s_fk foreign key (g_id)
      references goods (g_id) on delete restrict on update restrict;

alter table cart add constraint FK_u_s_fk foreign key (u_id)
      references user (u_id) on delete restrict on update restrict;

alter table goods add constraint FK_c_g_fk foreign key (c_id)
      references class (c_id) on delete restrict on update restrict;

alter table order_items add constraint FK_oi_g_fk foreign key (g_id)
      references goods (g_id) on delete restrict on update restrict;

alter table order_items add constraint FK_oi_o_fk foreign key (o_num)
      references orders (o_num) on delete restrict on update restrict;

alter table orders add constraint FK_a_o_fk foreign key (a_id)
      references address (a_id) on delete restrict on update restrict;

alter table orders add constraint FK_u_o_fk foreign key (u_id)
      references user (u_id) on delete restrict on update restrict;

