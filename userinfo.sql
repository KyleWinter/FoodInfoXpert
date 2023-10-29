create table userinfo
(
userid number(5) primary key,
usercode varchar2(50) unique,
userpwd varchar2(50) not null,
nickname varchar2(50)
)；

insert into userinfo values(1,'a','1','蜡笔小新');
commit;

select * from userinfo;

--序列

create sequence userinfo_userid_seq
start with 101

select userinfo_userid_seq.nextval from dual


insert into userinfo values(userinfo_userid_seq.nextval,'b','2','美牙');

select * from userinfo where usercode='' and userpwd='';

rollback;
