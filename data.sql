CREATE TABLE food (
  fid number primary key,
  tid number ,--���ID �������
  fname varchar2(255) NOT NULL,--��ʳ����
  fpic varchar2(255) NOT NULL,--��ʳͼƬ
  fprice number NOT NULL,--��ʳ����
  forder number, --default '1' COMMENT '��ʳ����',
  fdesc varchar2(500) NOT NULL,--��ʳ����
  fregtime date NOT NULL --ע�����ں�ʱ�� 
);

create sequence food_fid_seq
start with 1;

INSERT INTO food VALUES (food_fid_seq.nextval, 32, 'ϺƤ�ܲ�˿��', '52da1ae8a9375.jpg', 14, 1, '�嵭��ϺƤ�ܲ�˿��!��Ϊ�����е��ļ���Ʒ���������ҵ����С��嵭���ܲ�˿���ϵ�ζ��ϺƤ���������Ũ�����������ϣ�һ���嵭ˬ�ڵ�ϺƤ�ܲ�˿��������',sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 32, '�׸�����', '52da147fc29fb.jpg', 15, 2,'�׸�������ϴ���İ׸򾭹����ƣ����뵽���ʵļ����У����ϸ��ֵ�ζƷ�����ʼӼ�����������ζ����Ӫ����ֵ�ߣ����ں��º�����ζ������Ҳ����Ʒ����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 26, '÷�Ӳ��ݷ�', '52da0feb79de3.jpg', 10, 5, '÷�Ӳ��ݷ� ϲ������ˮ�����ѣ�һ�����ܴ������ˮ΢������ζ���׷���Ӳ���У��ǿ��ٲ���������伢����ѡ', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, 'ˮ����Ƭ', '52da0e14dce6a.jpg', 30, 4, 'ˮ����Ƭ ʹ��С��������������������Ƭˬ������������������壬�����������Ѿ��Բ��ܴ��', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '����С����', '52fcef7a7ab06.jpg', 20, 2, '����С����  �����壬����ִ࣬�ڲ���������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 38, '��ݮζ������', '52da0a1841e10.jpg', 5, 1, '��ݮζ������  ϸϸ��ɳ�����棬��������ɿڵ���ݮ�ǽ�������һ��������ˬ�ڣ����ļ�������ϼѵ�Ʒ��', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 33, '�����ײ˷�˿', '52da1b7bbfe87.jpg', 9, 1, '�����ײ˷�˿  ϲ����������Ѿ���ϲ������ˣ�ʹ�ô�ͳ�ַ����Ƶ���ˣ�����ˬ�ڵķ�˿������ˬ��Ϊһ�壬�������������������΢΢���������Թ�ζ', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 33, '����ţ����', '52da1db1dd3b6.jpg', 8, 10, '����ţ����  �������㼯Ϊһ�壬���ֵ�ζƷ������⿣����ʾ�������ζ����������ˬ��ţ�⣬�������ζ����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 40, 'ƻ����֭', '52fceb99d6f92.jpg', 5, 1, '���ʵ�ƻ���ͳ��ӣ���ե���͡�', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 14, '��ˬ����֭', '52fc1e482e4e2.jpg', 6, 1, '��ܰ�������������������Ц��Ƶ��<br>�������������Ȳ���ڿ�����<br>��ѿȸ���֮�󣬷�����Ź����䡣<br>�������ƽ�ʤ�ţ������ƾ������ˡ�', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 14, '���������մ�ˮ', '52fc1e9874cec.jpg', 4, 1, '��ܰ�������������������Ц��Ƶ��<br>�������������Ȳ���ڿ�����<br>��ѿȸ���֮�󣬷�����Ź����䡣<br>�������ƽ�ʤ�ţ������ƾ������ˡ�', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 25, '������', '52fced755d4a1.jpg', 8, 1, '������  ���������������������ۣ�����͡���θ������Ʒ', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 43, '������ˮ', '52fc1fea98afd.jpg', 5, 1, 'ϸ��б����С���� <br>������������̲. <br>�뻴���彥������ <br>ѩĭ�黨����յ.<br>ޤ�������Դ���,<br>�˼���ζ���延.', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 32, '���﷬Ѽ��', '52fcee55f24eb.jpg', 10, 1, '���﷬Ѽ��  �������̲����Ϻõ�Ʒ', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 40, '��ե��ݮ֭', '52fc206e27500.jpg', 6, 1, 'ϸ��б����С���� <br>������������̲. <br>�뻴���彥������ <br>ѩĭ�黨����յ.<br>ޤ�������Դ���,<br>�˼���ζ���延.', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 40, '��եľ����', '52fc20a9458c6.jpg', 6, 1, 'ϸ��б����С���� <br>������������̲. <br>�뻴���彥������ <br>ѩĭ�黨����յ.<br>ޤ�������Դ���,<br>�˼���ζ���延.', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 25, '��ɳ����', '52fc22baeccf5.jpg', 8, 1, '��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣<br>����ζŨ�ʹ��䣬��Ƣ��ξ����š�<br>���������곬�ڣ���ɫ����������š�', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 40, '���ˮ��֭', '52fc27a7f3f6b.jpg', 10, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 25, '��ɽ��ɳ', '52fc233ad861d.jpg', 10, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 41, '��ݮ��ɳ��', '52fc23ba2900e.jpg', 0, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '����ţ��', '52fc3b2132278.jpg', 40, 1, '���������磬������ɽ�ȡ�<br>ɽ����ӯ����������������<br>���Զ�Ϊ����˫Ǯ��һ����<br>��֮����У��뷹ͬʱ�졣<br>������ʽ����ؼ�������<br>ÿ����Ӳͣ���ʱ��˼�⡣<br>��Ϊ����ͣ���ζ�����㡣<br>��ʳ�����飬�Ϸ紵����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 25, 'ˮ��ħ��', '52fc24512e9c1.jpg', 10, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 25, '�ɿ���ӣ�����', '52fc24878e2f1.jpg', 10, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 25, '��ݮ���ѩ��', '52fc24bfd5442.jpg', 8, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 25, 'ˮ��ɳ��', '52fc24e7d52e6.jpg', 10, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 42, '����â������', '52fc2513180f3.jpg', 10, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 25, 'ˮ����ݮ', '52fc2553d94d3.jpg', 8, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 37, '��������', '52fc27e146137.jpg', 10, 1, '��Σ����̾��ϡ���������������档<br>�������������У������������Ѵ���<br>��ȻʳƷ�񣬷����ֹ��档��ɫ����Ⱦ���崼�ɽ���<br>���ǧ��̣�������ʱ���������ֲ豥�����������䡣', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '�����ˮ��˺��', '52fc3b7fe2e8c.jpg', 35, 1, '���������磬������ɽ�ȡ�<br>ɽ����ӯ����������������<br>���Զ�Ϊ����˫Ǯ��һ����<br>��֮����У��뷹ͬʱ�졣<br>������ʽ����ؼ�������<br>ÿ����Ӳͣ���ʱ��˼�⡣<br>��Ϊ����ͣ���ζ�����㡣<br>��ʳ�����飬�Ϸ紵����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '����ɽ���Ӽ�', '52fc3bad1708a.jpg', 35, 1, '���������磬������ɽ�ȡ�<br>ɽ����ӯ����������������<br>���Զ�Ϊ����˫Ǯ��һ����<br>��֮����У��뷹ͬʱ�졣<br>������ʽ����ؼ�������<br>ÿ����Ӳͣ���ʱ��˼�⡣<br>��Ϊ����ͣ���ζ�����㡣<br>��ʳ�����飬�Ϸ紵����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '��������', '52fc3bd4d7b9c.jpg', 36, 1, '���������磬������ɽ�ȡ�<br>ɽ����ӯ����������������<br>���Զ�Ϊ����˫Ǯ��һ����<br>��֮����У��뷹ͬʱ�졣<br>������ʽ����ؼ�������<br>ÿ����Ӳͣ���ʱ��˼�⡣<br>��Ϊ����ͣ���ζ�����㡣<br>��ʳ�����飬�Ϸ紵����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '��ɽĢ�������', '52fc3c2872a3a.jpg', 40, 1, '���������磬������ɽ�ȡ�<br>ɽ����ӯ����������������<br>���Զ�Ϊ����˫Ǯ��һ����<br>��֮����У��뷹ͬʱ�졣<br>������ʽ����ؼ�������<br>ÿ����Ӳͣ���ʱ��˼�⡣<br>��Ϊ����ͣ���ζ�����㡣<br>��ʳ�����飬�Ϸ紵����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '�ϳɶ�����ѿ��', '52fc3c674077e.jpg', 40, 1, '���������磬������ɽ�ȡ�<br>ɽ����ӯ����������������<br>���Զ�Ϊ����˫Ǯ��һ����<br>��֮����У��뷹ͬʱ�졣<br>������ʽ����ؼ�������<br>ÿ����Ӳͣ���ʱ��˼�⡣<br>��Ϊ����ͣ���ζ�����㡣<br>��ʳ�����飬�Ϸ紵����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '��������', '52fc3c8e9cb23.jpg', 39, 1, '���������磬������ɽ�ȡ�<br>ɽ����ӯ����������������<br>���Զ�Ϊ����˫Ǯ��һ����<br>��֮����У��뷹ͬʱ�졣<br>������ʽ����ؼ�������<br>ÿ����Ӳͣ���ʱ��˼�⡣<br>��Ϊ����ͣ���ζ�����㡣<br>��ʳ�����飬�Ϸ紵����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '���ʰǴ�����', '52fc3ce075f0c.jpg', 40, 1, '���������磬������ɽ�ȡ�<br>ɽ����ӯ����������������<br>���Զ�Ϊ����˫Ǯ��һ����<br>��֮����У��뷹ͬʱ�졣<br>������ʽ����ؼ�������<br>ÿ����Ӳͣ���ʱ��˼�⡣<br>��Ϊ����ͣ���ζ�����㡣<br>��ʳ�����飬�Ϸ紵����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 15, '��ϲ�˱���Ѭ��', '52fc3d2cd68ec.jpg', 35, 1, '���������磬������ɽ�ȡ�<br>ɽ����ӯ����������������<br>���Զ�Ϊ����˫Ǯ��һ����<br>��֮����У��뷹ͬʱ�졣<br>������ʽ����ؼ�������<br>ÿ����Ӳͣ���ʱ��˼�⡣<br>��Ϊ����ͣ���ζ�����㡣<br>��ʳ�����飬�Ϸ紵����', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 31, '��ҩ����', '52fc3db2cfc13.jpg', 39, 1, '���������ӽ��飬ɣ�������������<br>�ݽ费��ʮ��յ��һ���ո��峵�顣<br>�ม���뻱ѿ����������޽Ҷ�㡣<br>ϸ��б����С���� <br>������������̲. <br>�뻴���彥������ <br>ѩĭ�黨����յ.<br>ޤ�������Դ���,<br>�˼���ζ���延.', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 44, '�������', '52fc3f1620ef9.jpg', 45, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 45, '����ɰ��', '52fc3f77e6e20.jpg', 45, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 46, '������', '52fc3fac1853e.jpg', 45, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 26, '��Ϻţ�', '52fc40de9d72f.jpg', 20, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 26, '����ţ�', '52fc410a53153.jpg', 25, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 26, '���빽��ţ�Ƿ�', '52fc4130ce1c5.jpg', 20, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 48, '��ζ���㷹', '52fc415b1ffbb.jpg', 20, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 19, '�������', '52fc8eaf149fc.jpg', 30, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 22, '��������', '52fc8ee8618c3.jpg', 35, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 23, '���ռ���', '52fc8f110d265.jpg', 50, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 21, '�ഺ���', '52fc8f76d4a6e.jpg', 25, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 59, '����', '52fc8fa12a233.jpg', 15, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 27, '��ݮСϺ', '52fc8fdcd8fc1.jpg', 35, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 27, 'ǧ�㶹��', '52fc901433aa4.jpg', 30, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 49, '�����ݷ�', '52fc95f53ac02.jpg', 20, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 50, 'ϲɳ��Ƿ�', '52fc964ad89de.jpg', 20, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 55, '�ƽ�Ƿ�', '52fc9682bb47d.jpg', 18, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 57, '��������', '52fc96c751a2d.jpg', 15, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 57, '�嵭����', '52fc96fad99fc.jpg', 13, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 58, '���౦��', '52fc972152868.jpg', 5, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 59, '��˾ƴ��', '52fc975e311c0.jpg', 20, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 28, '̼�����', '52fc978d44a54.jpg', 20, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 60, '��Ϻ����', '52fc97c9e34b7.jpg', 15, 1, '���������ӽ��飬ɣ�������������', sysdate);
INSERT INTO food VALUES (food_fid_seq.nextval, 19, '���Ƴ��ȱ�', '52fc98252b588.jpg', 30, 1, '���������ӽ��飬ɣ�������������', sysdate);
commit;

CREATE TABLE ftype (
  tid number primary key,
  tname varchar2(250) NOT NULL
); 

create sequence ftype_tid_seq 
start with 100;

INSERT INTO ftype VALUES (19,'���');
INSERT INTO ftype VALUES (23,'������ζ');
INSERT INTO ftype VALUES (22,'����');
INSERT INTO ftype VALUES (21,'���');
INSERT INTO ftype VALUES (15,'����');
INSERT INTO ftype VALUES (14,'����');
INSERT INTO ftype VALUES (25,'��Ʒ');
INSERT INTO ftype VALUES (26,'��ʽ�Ƿ�');
INSERT INTO ftype VALUES (27,'�ҳ���');
INSERT INTO ftype VALUES (28,'�ձ����ջ��');
INSERT INTO ftype VALUES (29,'�Ĵ����');
INSERT INTO ftype VALUES (30,'������');
INSERT INTO ftype VALUES (31,'����');
INSERT INTO ftype VALUES (32,'�̲�');
INSERT INTO ftype VALUES (33,'�׷�');
INSERT INTO ftype VALUES (38,'�����');
INSERT INTO ftype VALUES (37,'����');
INSERT INTO ftype VALUES (39,'ơ��');
INSERT INTO ftype VALUES (40,'��֭');
INSERT INTO ftype VALUES (41,'��ɳ');
INSERT INTO ftype VALUES (42,'����');
INSERT INTO ftype VALUES (43,'��ˮ');
INSERT INTO ftype VALUES (44,'�������');
INSERT INTO ftype VALUES (45,'����ɰ��');
INSERT INTO ftype VALUES (46,'������');
INSERT INTO ftype VALUES (47,'���»��');
INSERT INTO ftype VALUES (48,'��ʽ�Ƿ�');
INSERT INTO ftype VALUES (49,'�����ݷ�');
INSERT INTO ftype VALUES (50,'�ҳ��Ƿ�');
INSERT INTO ftype VALUES (55,'����Ƿ�');
INSERT INTO ftype VALUES (52,'����');
INSERT INTO ftype VALUES (53,'����');
INSERT INTO ftype VALUES (56,'����');
INSERT INTO ftype VALUES (57,'����');
INSERT INTO ftype VALUES (58,'����');
INSERT INTO ftype VALUES (59,'��ͷ');
INSERT INTO ftype VALUES (60,'��������');
commit;
