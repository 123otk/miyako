set names utf8;
set foreign_key_checks=0;

drop database if exists miyako;
create database if not exists miyako;

use miyako;

create table user_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) unique not null comment "ユーザーID",
password varchar(16) not null comment "パスワード",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
sex tinyint not null default 0 comment "性別",
email varchar(32) not null comment "メールアドレス",
status tinyint not null default 0 comment "ステータス",
logined tinyint not null default 0 comment "ログインフラグ",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="会員情報テーブル"
;


create table product_info(
id int primary key not null auto_increment comment "ID",
product_id int unique not null comment "商品ID",
product_name varchar(100) unique not null comment "商品名",
product_name_kana varchar(100) not null comment "商品名かな",
product_description varchar(255) not null comment "商品詳細",
category_id int not null comment "カテゴリID",
price int comment "価格",
product_stock int comment "在庫",
image_file_path varchar(100) comment "画像ファイルパス",
image_file_name varchar(50) comment "画像ファイル名",
release_date datetime not null comment "発売年月",
release_company varchar(50) comment "発売会社",
status tinyint not null default 0 comment "ステータス",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日",
foreign key(category_id) references category(category_id)
)
default charset=utf8
comment="商品情報テーブル"
;


INSERT INTO product_info values
(1,1,"菊","きく","菊が美しい着物です。",2,20000,100,"./imageProduct","kimon1.jpg",now(),"mitako",0,now(),now()),
(2,2,"桜","さくら","桜が美しい着物です。",2,20000,100,"./imageProduct","kimon2.jpg",now(),"mitako",0,now(),now()),
(3,3,"和花","わばな","様々な和花が美しい着物です。",2,50000,100,"./imageProduct","kimon3.jpg",now(),"mitako",0,now(),now()),
(4,4,"牡丹","ぼたん","牡丹が美しい着物です。",2,14000,100,"./imageProduct","kimon4.jpg",now(),"mitako",0,now(),now()),
(5,5,"椿","つばき","椿が美しい着物です。",2,30000,100,"./imageProduct","kimon5.jpg",now(),"kokyu",0,now(),now()),
(6,6,"梅","うめ","梅が美しい着物です。",2,30000,100,"./imageProduct","kimon6.jpg",now(),"kokyu",0,now(),now()),
(7,7,"バチ型簪(菊)","ばちがたかんざし(きく)","菊が美しいバチ型の簪です。",3,4000,100,"./imageProduct","kami.jpg",now(),"kamiya",0,now(),now()),
(8,8,"バチ型簪(桜)","ばちがたかんざし(さくら)","桜が美しいバチ型の簪です。",3,3500,100,"./imageProduct","kami1.jpg",now(),"kamiya",0,now(),now()),
(9,9,"バチ型簪(和花)","ばちがたかんざし(わばな)","様々な和花が美しいバチ型の簪です。",3,5700,100,"./imageProduct","kami2.jpg",now(),"kamiya",0,now(),now()),
(10,10,"桔梗一本簪","ききょういっぽんかんざし","桔梗をモチーフにした、一本簪です。",3,4000,100,"./imageProduct","kami3.jpg",now(),"kamiya",0,now(),now()),
(11,11,"梅花一本簪","ばいかいっぽんかんざし","梅花をモチーフにした、一本簪です。",3,3500,100,"./imageProduct","kami4.jpg",now(),"kamiya",0,now(),now()),
(12,12,"桜花一本簪","おうかいっぽんかんざし","桜花をモチーフにした、一本簪です。",3,5700,100,"./imageProduct","kami5.jpg",now(),"kamiya",0,now(),now()),
(13,13,"梅花草履","ばいかぞうり","梅花をモチーフにした草履です。",4,14000,100,"./imageProduct","zouri.jpg",now(),"mitako",0,now(),now()),
(14,14,"吉日草履","きちじつぞうり","祝いの席などフォーマルな場にも履いていただける草履です。",4,15800,100,"./imageProduct","zouri1.jpg",now(),"mitako",0,now(),now()),
(15,15,"和モダン草履","わもだんぞうり","古すぎず新しすぎない、和モダンな草履です。",4,9800,100,"./imageProduct","zouri2.jpg",now(),"mitako",0,now(),now()),
(16,16,"もも草履","ももぞうり","ソフトな色調で女性にぴったりな草履です。",4,15800,100,"./imageProduct","zouri7.jpg",now(),"mitako",0,now(),now()),
(17,17,"京草履","みやこぞうり","当店自慢のベーシックな草履です。",4,14000,100,"./imageProduct","zouri9.jpg",now(),"mitako",0,now(),now()),
(18,18,"厚底草履","あつぞこぞうり","これであなたもモデル級!？脚長草履。",4,11200,100,"./imageProduct","zouri10.jpg",now(),"mitako",0,now(),now()),
(19,19,"男性用草履","だんせいようぞうり","清涼感のある色調で、夏祭りにぴったりな草履です。",4,7800,100,"./imageProduct","zouri11.jpg",now(),"mitako",0,now(),now());



create table cart_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
temp_user_id varchar(16) comment "仮ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カート情報テーブル"
;


create table purchase_history_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
destination_id int not null comment "宛先情報ID",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日",
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
)
default charset=utf8
comment="購入履歴情報テーブル"
;


create table destination_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
email varchar(32) not null comment "メールアドレス",
tel_number varchar(13) not null comment "電話番号",
user_address varchar(50) not null comment "住所",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="宛先情報テーブル"
;


create table category(
id int primary key not null comment "ID",
category_id int not null unique comment "カテゴリーID",
category_name varchar(20) not null unique comment "カテゴリー名",
category_description varchar(100) comment "カテゴリー詳細",
insert_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カテゴリーマスターテーブル"
;
INSERT INTO category VALUES
(1,1,"全てのカテゴリ","全てのカテゴリです",now(),"0000-01-01"),
(2,2,"着物","きものです",now(),"0000-01-01"),
(3,3,"髪飾り","髪飾りです",now(),"0000-01-01"),
(4,4,"草履","草履です",now(),"0000-01-01");


INSERT INTO user_info( user_id, password, family_name, first_name, family_name_kana, first_name_kana, sex, email, status, logined, regist_date, update_date)
VALUES("admin", "admin","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("guest","guest","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest2","guest2","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest3","guest3","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest4","guest4","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest5","guest5","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest6","guest6","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest7","guest7","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest8","guest8","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest9","guest9","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest10","guest10","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest11","guest11","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("guest12","guest12","一般","次郎","いっぱん","じろう",0,"internous@gmail.com",1,1,now(),now()),
("admin2", "admin2","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin3", "admin3","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin4", "admin4","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin5", "admin5","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin6", "admin6","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin7", "admin7","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin8", "admin8","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin9", "admin9","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin10", "admin10","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin11", "admin11","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now()),
("admin12", "admin12","管理者","太郎","かんりしゃ","たろう",0,"kanrisha@gmail.com",1,1,now(),now());




