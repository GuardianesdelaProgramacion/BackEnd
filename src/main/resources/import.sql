/******CATEGORÍA****/
INSERT INTO  musarana_db.categoria (`categoria`) VALUES ('Cabello'), ('Cuerpo'), ('Cuidado dental'), ('Protección Solar'), ('Cara');
/*****SECCION*****/
INSERT INTO musarana_db.seccion (seccion) VALUES ('Todos los productos'),('Más vendidos'), ('Carrusel'), ('Búsqueda'), ('Banner'), ('Descuentos');
/*****MODO DE USO ****/
INSERT INTO musarana_db.modo_de_uso (`modo_de_uso`) VALUES ('FROTAR LA BARRA HÚMEDA EN LAS MANOS Y USAR LA ESPUMA RESULTANTE PARA LAVAR EL CABELLO.'), ('FROTAR LA BARRA EN LAS MANOS O DIRECTAMENTE SOBRE EL CABELLO DE MEDIAS A PUNTAS.'), ('FROTAR LA BARRA SOBRE LA ZONA DESEADA Y ESPARCIR EL PRODUCTO CON LAS MANOS.'),('HUMEDECE TU CEPILLO Y FRÓTALO SOBRE LA TABLETA, CEPILLA COMO DE COSTUMBRE Y ENJUAGA CON AGUA.'),('FROTAR LA BARRA SOBRE LA ZONA DESEADA Y ESPARCIR EL PRODUCTO CON LAS MANOS.'),('USAR UNA GOTA DE PRODUCTO Y DAR UN LIGERO MASAJE SOBRE LA ZONA DESEADA');
/*****PRESENTACIÓN*****/
INSERT INTO musarana_db.presentacion (`presentacion`) VALUES ('Chico'), ('Grande');
/*****IMAGEN PRODUCTO*****/
INSERT INTO musarana_db.imagen_producto (imagen) VALUES ('https://i.ibb.co/0mYYDGn/S001-2.jpg'), ('https://i.ibb.co/GtVyW49/S001-3.jpg');
/*****ESTADO*****/
INSERT INTO musarana_db.estado (estado) VALUES ('Aguascalientes'), ('Baja California'), ('Baja California Sur'), ('Campeche'), ('Ciudad de Mèxico'), ('Chiapas'), ('Chihuahua'), ('Coahuila de Zaragoza'), ('Colima'), ('Durango'), ('Guanajuato'), ('Guerrero'), ('Hidalgo'), ('Jalisco'), ('México'), ('Michoacán de Ocampo'), ('Morelos'), ('Nayarit'), ('Nuevo León'), ('Oaxaca de Juárez'), ('Puebla'), ('Querétaro'), ('Quintana Roo'), ('San Luis Potosí'), ('Sinaloa'), ('Sonora'), ('Tabasco'), ('Tamaulipas'), ('Tlaxcala'), ('Veracruz de Ignacio de la Llave'), ('Yucatán'), ('Zacatecas');
/*****BLOG*****/
INSERT INTO musarana_db.blog (fecha, contenido, categoria_blog, titulo, resumen) VALUES ('2022-08-22','Lorem, ipsum  velit actaque!', 'tips','BAÑATE COMO HOMBRE', 'Lorem, ipsum dolor sit amet doloribus, obcaecati velit');
/****IMAGEN BLOG****/
INSERT INTO musarana_db.imagen_blog (imagen, blog_id_blog) VALUES ('<img src=\"https://i.ibb.co/sw3XmFM/50-3.png\" alt=\"50-3\" border=\"0\">', '1');
/****CONTACTO*****/
INSERT INTO musarana_db.contacto (`asunto_cn`, `comentario`, `nombre_cn`, `telefono_cn`) VALUES ('hola, asdasdfasfada', 'asDFASDFSDAFDFASDFDSAAF', 'Ollin', '55398531');
INSERT INTO musarana_db.contacto (`asunto_cn`, `comentario`, `nombre_cn`, `telefono_cn`) VALUES ('wsdASDa', 'fdggsdfgdfs', 'Lucuia', '55409932');
INSERT INTO musarana_db.contacto (`asunto_cn`, `comentario`, `nombre_cn`, `telefono_cn`) VALUES ('SAFDASFDAdsaGHFGH', 'FDGSDFGSDFG', 'Luis', '55555555');