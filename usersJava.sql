PGDMP                         z         	   usersJava    14.2    14.2     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    24577 	   usersJava    DATABASE     k   CREATE DATABASE "usersJava" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE "usersJava";
                postgres    false            ?            1259    24579    tbl_user    TABLE     ?   CREATE TABLE public.tbl_user (
    id integer NOT NULL,
    login character varying NOT NULL,
    passwd character varying NOT NULL
);
    DROP TABLE public.tbl_user;
       public         heap    postgres    false            ?            1259    24578    tbl_user_id_seq    SEQUENCE     ?   CREATE SEQUENCE public.tbl_user_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.tbl_user_id_seq;
       public          postgres    false    210            ?           0    0    tbl_user_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.tbl_user_id_seq OWNED BY public.tbl_user.id;
          public          postgres    false    209            \           2604    24582    tbl_user id    DEFAULT     j   ALTER TABLE ONLY public.tbl_user ALTER COLUMN id SET DEFAULT nextval('public.tbl_user_id_seq'::regclass);
 :   ALTER TABLE public.tbl_user ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    210    209    210            ?          0    24579    tbl_user 
   TABLE DATA           5   COPY public.tbl_user (id, login, passwd) FROM stdin;
    public          postgres    false    210   z
       ?           0    0    tbl_user_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.tbl_user_id_seq', 7, true);
          public          postgres    false    209            ^           2606    24586    tbl_user tbl_user_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.tbl_user
    ADD CONSTRAINT tbl_user_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.tbl_user DROP CONSTRAINT tbl_user_pkey;
       public            postgres    false    210            ?   [   x?-?;
?0??#d71z?ES(????#y/&????8?u??D)?Ӷ??ԯ?z?)[??c?T???????h??q_????`?2n/?*?ϸ_     