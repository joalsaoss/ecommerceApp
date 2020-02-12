/**
 * 
 */
package com.joalsaoss.ecommerce.utils;

/**
 * @author Jose Alvaro Rodriguez Botero
 *
 */
public class EcommConstants {

	private EcommConstants() {
		super();
	}

	/**
	 * Seguridad Token
	 */
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String AUTHORITIES_KEY = "scopes";

	public static final String JWT_SECRETO = "#S4b4n4B0g.";
	public static final int JWT_EXPIRACION_MS_SESSION = 180000000;

	/**
	 * Web services
	 */
	public static final String SERVICIO_WEB = "http://localhost:8080/appgateway";
	public static final String HEADER_CONTENT_TYPE = "Content-Type";
	public static final String HEADER_APP_JSON = "application/json";
	public static final String HEADER_ACCEPT = "Accept";
	public static final String URL = "http://192.168.1.170:8080/seguridadApi";

	/**
	 * Log severity
	 */
	public static final String SEVERIDAD_DEBUG = "debug";
	public static final String SEVERIDAD_ERROR = "error";
	public static final String SEVERIDAD_FATAL = "fatal";
	public static final String SEVERIDAD_INFO = "info";
	public static final String SEVERIDAD_TRACE = "trace";
	public static final String SEVERIDAD_WARN = "warn";

	/**
	 * Table names
	 */
	public static final String ADDRESS = "address";
	public static final String CATEGORY = "category";
	public static final String CITY = "city";
	public static final String CUSTOMER = "customer";
	public static final String PRODUCT = "product";
	public static final String SHOPPINGCART = "shoppingcart";
	public static final String WISHLIST = "wishlist";

	/**
	 * Fields by entity
	 */
	public static final String ADDRESS_ID = "address.idAddress";
	public static final String ADDRESS_ADDRESS = "address.address";
	public static final String CATEGORY_ID = "category.idCategory";
	public static final String CATEGORY_IDMAINCATEGORY = "category.idMainCategory";
	public static final String CATEGORY_CATEGORYNAME = "category.categoryName";
	public static final String CATEGORY_DATEADDED = "category.dateAdded";
	public static final String CATEGORY_DATEMODIFIED = "category.dateModified";
	public static final String CATEGORY_STATUS = "category.status";
	public static final String CITY_ID = "city.idCity";
	public static final String CITY_CITYNAME = "city.cityName";
	public static final String CUSTOMER_IDCUSTOMER = "customer.idCustomer";
	public static final String CUSTOMER_FIRSTNAME = "customer.firstName";
	public static final String CUSTOMER_LASTNAME = "customer.LastName";
	public static final String CUSTOMER_EMAIL = "customer.email";
	public static final String CUSTOMER_PHONE = "customer.phone";
	public static final String PRODUCT_ID = "product.idProduct";
	public static final String PRODUCT_TITLE = "product.title";
	public static final String PRODUCT_KEYWORDS = "product.keywords";
	public static final String PRODUCT_DESCRIPTION = "product.description";
	public static final String PRODUCT_RATING = "product.rating";
	public static final String PRODUCT_DATEADDED = "product.dateAdded";
	public static final String PRODUCT_DATEMODIFIED = "product.dateModified";
	public static final String SHOPPINGCART_ID = "shoppingcart.idShoppingCart";
	public static final String SHOPPINGCART_IDCUSTOMER = "shoppingcart.IdCustomer";
	public static final String SHOPPINGCART_CUSTOMERNAME = "shoppingcart.customerName";
	public static final String SHOPPINGCART_IDPRODUCT = "shoppingcart.idProduct";
	public static final String SHOPPINGCART_PRODUCTNAME = "shoppingcart.productName";
	public static final String SHOPPINGCART_DATEADDED = "shoppingcart.dateAdded";
	public static final String SHOPPINGCART_DATEMODIFIED = "shoppingcart.dateModified";
	public static final String SHOPPINGCART_STATUS = "shoppingcart.status";
	public static final String WISHLIST_ID = "wishlist.idWishlist";
	public static final String WISHLIST_IDCUSTOMER = "wishlist.IdCustomer";
	public static final String WISHLIST_CUSTOMERNAME = "wishlist.customerName";
	public static final String WISHLIST_IDPRODUCT = "wishlist.idProduct";
	public static final String WISHLIST_PRODUCTNAME = "wishlist.productName";
	public static final String WISHLIST_DATEADDED = "wishlist.dateAdded";
	public static final String WISHLIST_DATEMODIFIED = "wishlist.dateModified";
	public static final String WISHLIST_STATUS = "wishlist.status";

	/**
	 * Controllers constants
	 */
	public static final String WEB_CONTROLLER_GET_HOME = "/home";
	public static final String WEB_CONTROLLER_REQUEST_INDEX = "/";

	// Category
	public static final String CATEGORY_CONTROLLER_CREATE_CATEGORY = "/category/create";
	public static final String CATEGORY_CONTROLLER_UPDATE_CATEGORY = "/category/update";
	public static final String CATEGORY_CONTROLLER_GETALL_CATEGORY = "/category/getall";
	public static final String CATEGORY_CONTROLLER_GETBYID_CATEGORY = "/category/getbyid/{id}";

	// Customer
	public static final String CUSTOMER_CONTROLLER_CREATE_CUSTOMER = "/customer/create";
	public static final String CUSTOMER_CONTROLLER_UPDATE_CUSTOMER = "/customer/update";
	public static final String CUSTOMER_CONTROLLER_GETALL_CUSTOMER = "/customer/getall";
	public static final String CUSTOMER_CONTROLLER_GETBYID_CUSTOMER = "/customer/getbyid/{id}";

	// Products
	public static final String PRODUCT_CONTROLLER_CREATE_PRODUCT = "/product/create";
	public static final String PRODUCT_CONTROLLER_UPDATE_PRODUCT = "/product/update";
	public static final String PRODUCT_CONTROLLER_GETALL_PRODUCT = "/product/getall";
	public static final String PRODUCT_CONTROLLER_GETBYID_PRODUCT = "/product/getbyid/{id}";

	/**
	 * Fields length
	 */
	public static final int BUZON_USUARIO_ORIGINA_MIN_LENGTH = 1;
	public static final int BUZON_USUARIO_ORIGINA_MAX_LENGTH = 100;
	public static final int BUZON_USUARIO_DESTINO_MIN_LENGTH = 1;
	public static final int BUZON_USUARIO_DESTINO_MAX_LENGTH = 100;
	public static final int BUZON_USUARIO_MENSAJE_MIN_LENGTH = 1;
	public static final int BUZON_USUARIO_MENSAJE_MAX_LENGTH = 10000;

	/**
	 * Formatos
	 */
	public static final String FORMAT_DATETIME_SHORT_WITH_DASH = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_DATE_SHORT_WITH_DASH = "yyyy-MM-dd";
	public static final String FORMAT_DATETIME_SHORT_WITH_SLASH = "yyyy/MM/dd HH:mm:ss";
	public static final String FORMAT_DATE_SHORT_WITH_SLASH = "yyyy/MM/dd";
	public static final String FORMAT_DATE_CREDITCARD_WITH_SLASH = "yyyy/MM";
	public static final String FORMAT_TIME = "HH:mm:ss";
	public static final String FORMAT_SHORT_TIME = "HH:mm";

	/**
	 * Mensajes normales
	 */
	public static final String MENSAJE_EXITO_CORREO = "mensaje_exito_correo";
	public static final String MENSAJE_INICIO_SESION_CORRECTO = "mensaje_inicio_sesion_correcto";
	public static final String MENSAJE_CAMBIAR_CLAVE_CORRECTO = "mensaje_cambiar_clave_correcto";
	public static final String MENSAJE_CAMBIAR_CLAVE_INCORRECTO = "mensaje_cambiar_clave_incorrecto";
	public static final String MENSAJE_RESTABLACER_CLAVE_CORRECTO = "mensaje_restablecer_clave_correcto";
	public static final String MENSAJE_CORREO_ENVIADO_CORRECTO = "mensaje_correo_enviado_correcto";
	public static final String MENSAJE_CREAR_COMPONENTE_GASTO_CORRECTO = "mensaje_crear_componente_gasto_correcto";
	public static final String MENSAJE_CAMBIAR_ESTADO_COMPONENTE_GASTO_CORRECTO = "mensaje_cambiar_estado_componente_gasto_correcto";
	public static final String MENSAJE_MODIFICAR_COMPONENTE_GASTO_CORRECTO = "mensaje_modificar_componente_gasto_correcto";
	public static final String MENSAJE_OBTENER_COMPONENTE_GASTO_TODOS_CORRECTO = "mensaje_obtener_componente_gasto_todos_correcto";
	
	
	public static final String MESSAGE_GETALL_PRODUCTS_OK = "message_getall_products_ok";
	public static final String MESSAGE_GETALL_PRODUCTS_NOT_FOUND = "message_getall_products_not_found";
	
	/**
	 * Mensajes de error
	 */
	public static final String MESSAGE_NOT_FOUND = "Mensaje no encontrado";
	public static final String MENSAJE_ARCHIVO_PROCESADO_NO_ENCONTRADO = "mensaje_archivo_procesado_no_encontrado";
	public static final String MENSAJE_BANCO_DE_PROYECTOS_NO_ENCONTRADO = "mensaje_banco_de_proyectos_no_encontrado";
	/**
	 * Mensajes de validacion
	 */
	public static final String MENSAJE_VALIDACION_APROPIACION_RESERVA_VACIO = "mensaje_validacion_apropiacion_reserva_vacio";
	public static final String MENSAJE_VALIDACION_APROPIACION_DEFINITIVA_VACIO = "mensaje_validacion_apropiacion_definitiva_vacio";
	public static final String MENSAJE_VALIDACION_MENSAJE_TAMANO_INVALIDO = "mensaje_validacion_mensaje_tamano_invalido";

	/**
	 * 
	 */
	public static final int ESTADO_ACTIVO = 1;
	public static final int ESTADO_INACTIVO = 0;
	public static final int ESTADO_MENSAJE_LEIDO = 1;
	public static final int ESTADO_MENSAJE_NO_LEIDO = 0;

	/**
	 * 
	 */
	public static final String ESTADO_STRING_ACTIVO = "Activo";
	public static final String ESTADO_STRING_INACTIVO = "Inactivo";

	/**
	 * 
	 */
	public static final String TIPO_PD = "PD";
	public static final String TIPO_PI = "PI";

	/**
	 * Respuestas HTTP
	 */
	public static final int RESPUESTA_EXITOSA = 200;
	public static final int RESPUESTA_ERROR_EXTERNO = 400;
	public static final int RESPUESTA_TIEMPO_EXCEDIDO = 408;
	public static final int RESPUESTA_EXCEPCION = 500;

	/**
	 * Constantes email.
	 */
	public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/*
	 * Mensajes expcepciones
	 */
	public static final String MENSAJE_EXCEPCION_GENERICA = "mensaje_excepcion_generica";
}
