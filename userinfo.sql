create table userinfo
(
userid number(5) primary key,
usercode varchar2(50) unique,
userpwd varchar2(50) not null,
nickname varchar2(50)
)��

insert into userinfo values(1,'a','1','����С��');
commit;

select * from userinfo;

--����

create sequence userinfo_userid_seq
start with 101

select userinfo_userid_seq.nextval from dual


insert into userinfo values(userinfo_userid_seq.nextval,'b','2','����');

select * from userinfo where usercode='' and userpwd='';

rollback;
