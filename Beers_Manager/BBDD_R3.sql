-- Tables
CREATE TABLE R3_CERVEZA(
CID			NUMBER(5) PRIMARY KEY,
CNOMBRE		VARCHAR2(25) NOT NULL,
CGRADUACION	NUMBER(3,1),
CPRECIO		NUMBER(4,2)
);

CREATE TABLE R3_TIENDAS(
TID			NUMBER(5) PRIMARY KEY,
TNOMBRE		VARCHAR2(30) NOT NULL,
TTIPO		VARCHAR2(20) NOT NULL,
TCIUDAD		VARCHAR2(15)
);

CREATE TABLE R3_VENTAS(
VID			NUMBER(6) PRIMARY KEY,
VCLIENTE	VARCHAR2(20) NOT NULL,
VREFCID		NUMBER(5) REFERENCES R3_CERVEZA(CID),
VREFTID		NUMBER(5) REFERENCES R3_TIENDAS(TID),
VCANTIDAD	NUMBER(4) NOT NULL
);

-- Inserts
INSERT INTO R3_CERVEZA VALUES (1, 'Voll-Damm', 7.2, 1.10);
INSERT INTO R3_CERVEZA VALUES (2, 'Alhambra 1925', 6.4, 1);
INSERT INTO R3_CERVEZA VALUES (3, 'Estrella Galicia 1906', 6.5, 0.80);
INSERT INTO R3_CERVEZA VALUES (4, 'Ambar Export', 7, 0.90);
INSERT INTO R3_CERVEZA VALUES (5, 'Mahou Maestra', 7.5, 2);
INSERT INTO R3_CERVEZA VALUES (6, 'Legado de Yuste', 6.5, 1.10);

INSERT INTO R3_TIENDAS VALUES (1, 'Mercadona', 'Supermercado', 'C.Real');
INSERT INTO R3_TIENDAS VALUES (2, 'Carrefour', 'Hipermercado', 'Manzanares');
INSERT INTO R3_TIENDAS VALUES (3, 'Lydl', 'Supermercado', 'Miguelturra');
INSERT INTO R3_TIENDAS VALUES (4, 'Chino Felix', 'Chino', 'C.Real');
INSERT INTO R3_TIENDAS VALUES (5, 'Ultramarinos Jose', 'Tienda de barrio', 'Almagro');

INSERT INTO R3_VENTAS VALUES(1, 'Edi', 3, 4, 12);
INSERT INTO R3_VENTAS VALUES(2, 'Javi', 1, 1, 6);
INSERT INTO R3_VENTAS VALUES(3, 'Fran Verde', 2, 3, 6);
INSERT INTO R3_VENTAS VALUES(4, 'Javi Pc15', 6, 5, 2);
INSERT INTO R3_VENTAS VALUES(5, 'Jairo', 5, 2, 1);
INSERT INTO R3_VENTAS VALUES(6, 'Javi', 1, 3, 6);
INSERT INTO R3_VENTAS VALUES(7, 'Edi', 4, 1, 2);
INSERT INTO R3_VENTAS VALUES(8, 'Jairo', 5, 1, 1);
INSERT INTO R3_VENTAS VALUES(9, 'Jairo', 5, 3, 1);

/*
select vcliente, tnombre, cnombre, vcantidad from r3_ventas, r3_tiendas, r3_cerveza
  where cid = vrefcid and tid = vreftid order by vcantidad;

  

select vcliente Cliente, sum(vcantidad), cnombre
    from R3_VENTAS, r3_cerveza where cid = vrefcid
    group by vcliente, cnombre;
*/