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
	public static final String PRODUCT_CONTROLLER_CREATE_CATEGORY = "/category/create";
	public static final String PRODUCT_CONTROLLER_UPDATE_CATEGORY = "/category/update";
	public static final String PRODUCT_CONTROLLER_GETALL_CATEGORY = "/category/getall";
	public static final String PRODUCT_CONTROLLER_DELETE_CATEGORY = "/category/delete/{id}";
	public static final String PRODUCT_CONTROLLER_GETBYID_CATEGORY = "/category/getbyid/{id}";

	// Products
	public static final String PRODUCT_CONTROLLER_CREATE_PRODUCT = "/product/create";
	public static final String PRODUCT_CONTROLLER_UPDATE_PRODUCT = "/product/update";
	public static final String PRODUCT_CONTROLLER_GETALL_PRODUCT = "/product/getall";
	public static final String PRODUCT_CONTROLLER_DELETE_PRODUCT = "/product/delete/{id}";
	public static final String PRODUCT_CONTROLLER_GETBYID_PRODUCT = "/product/getbyid/{id}";

	// PhotoProducts
	public static final String PRODUCT_CONTROLLER_CREATE_PHOTOPRODUCT = "/photoproduct/create";
	public static final String PRODUCT_CONTROLLER_UPDATE_PHOTOPRODUCT = "/photoproduct/update";
	public static final String PRODUCT_CONTROLLER_GETALL_PHOTOPRODUCT = "/photoproduct/getall";
	public static final String PRODUCT_CONTROLLER_DELETE_PHOTOPRODUCT = "/photoproduct/delete/{id}";
	public static final String PRODUCT_CONTROLLER_GETBYID_PHOTOPRODUCT = "/photoproduct/getbyid/{id}";

	// Customer
	public static final String CUSTOMER_CONTROLLER_CREATE_CUSTOMER = "/customer/create";
	public static final String CUSTOMER_CONTROLLER_UPDATE_CUSTOMER = "/customer/update";
	public static final String CUSTOMER_CONTROLLER_GETALL_CUSTOMER = "/customer/getall";
	public static final String CUSTOMER_CONTROLLER_DELETE_CUSTOMER = "/customer/delete/{id}";
	public static final String CUSTOMER_CONTROLLER_GETBYID_CUSTOMER = "/customer/getbyid/{id}";

	// CITIES
	public static final String CUSTOMER_CONTROLLER_CREATE_CITY = "/city/create";
	public static final String CUSTOMER_CONTROLLER_UPDATE_CITY = "/city/update";
	public static final String CUSTOMER_CONTROLLER_GETALL_CITY = "/city/getall";
	public static final String CUSTOMER_CONTROLLER_DELETE_CITY = "/city/delete/{id}";
	public static final String CUSTOMER_CONTROLLER_GETBYID_CITY = "/city/getbyid/{id}";

	// ADDRESSES
	public static final String CUSTOMER_CONTROLLER_CREATE_ADDRESS = "/address/create";
	public static final String CUSTOMER_CONTROLLER_UPDATE_ADDRESS = "/address/update";
	public static final String CUSTOMER_CONTROLLER_GETALL_ADDRESS = "/address/getall";
	public static final String CUSTOMER_CONTROLLER_DELETE_ADDRESS = "/address/delete/{id}";
	public static final String CUSTOMER_CONTROLLER_GETBYID_ADDRESS = "/address/getbyid/{id}";

	// SHOPPINGCART
	public static final String BUY_CONTROLLER_CREATE_SHOPPINGCART = "/shoppingcart/create";
	public static final String BUY_CONTROLLER_UPDATE_SHOPPINGCART = "/shoppingcart/update";
	public static final String BUY_CONTROLLER_GETALL_SHOPPINGCART = "/shoppingcart/getall";
	public static final String BUY_CONTROLLER_DELETE_SHOPPINGCART = "/shoppingcart/delete/{id}";
	public static final String BUY_CONTROLLER_GETBYID_SHOPPINGCART = "/shoppingcart/getbyid/{id}";

	// WISHLIST
	public static final String BUY_CONTROLLER_CREATE_WISHLIST = "/wishlist/create";
	public static final String BUY_CONTROLLER_UPDATE_WISHLIST = "/wishlist/update";
	public static final String BUY_CONTROLLER_GETALL_WISHLIST = "/wishlist/getall";
	public static final String BUY_CONTROLLER_DELETE_WISHLIST = "/wishlist/delete/{id}";
	public static final String BUY_CONTROLLER_GETBYID_WISHLIST = "/wishlist/getbyid/{id}";

	/**
	 * Formatts
	 */
	public static final String FORMAT_DATETIME_SHORT_WITH_DASH = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_DATE_SHORT_WITH_DASH = "yyyy-MM-dd";
	public static final String FORMAT_DATETIME_SHORT_WITH_SLASH = "yyyy/MM/dd HH:mm:ss";
	public static final String FORMAT_DATE_SHORT_WITH_SLASH = "yyyy/MM/dd";
	public static final String FORMAT_DATE_CREDITCARD_WITH_SLASH = "yyyy/MM";
	public static final String FORMAT_TIME = "HH:mm:ss";
	public static final String FORMAT_SHORT_TIME = "HH:mm";

	/**
	 * Normal messages
	 */
	public static final String MESSAGE_SUCCESS_CATEGORY_CREATE = "message_success_category_create";
	public static final String MESSAGE_SUCCESS_CATEGORY_UPDATE = "message_success_category_update";
	public static final String MESSAGE_SUCCESS_PRODUCT_CREATE = "message_success_product_create";
	public static final String MESSAGE_SUCCESS_PRODUCT_UPDATE = "message_success_product_update";
	public static final String MESSAGE_SUCCESS_SHOPPINGCART_CREATE = "message_success_shoppingcart_create";
	public static final String MESSAGE_SUCCESS_SHOPPINGCART_UPDATE = "message_success_shoppingcart_update";
	public static final String MESSAGE_SUCCESS_WISHLIST_CREATE = "message_success_wishlist_create";
	public static final String MESSAGE_SUCCESS_WISHLIST_UPDATE = "message_success_wishlist_update";
	public static final String MESSAGE_SUCCESS_CUSTOMER_CREATE = "message_success_customer_create";
	public static final String MESSAGE_SUCCESS_CUSTOMER_UPDATE = "message_success_customer_update";
	public static final String MESSAGE_SUCCESS_ADDRESS_CREATE = "message_success_address_create";
	public static final String MESSAGE_SUCCESS_ADDRESS_UPDATE = "message_success_address_update";
	public static final String MESSAGE_SUCCESS_CITY_CREATE = "message_success_city_create";
	public static final String MESSAGE_SUCCESS_CITY_UPDATE = "message_success_city_update";

	public static final String MESSAGE_GETALL_PRODUCTS_OK = "message_getall_products_ok";
	public static final String MESSAGE_GETALL_PRODUCTS_NOT_FOUND = "message_getall_products_not_found";
	public static final String MESSAGE_GETALL_CATEGORY_OK = "message_getall_category_ok";
	public static final String MESSAGE_GETALL_CATEGORY_NOT_FOUND = "message_getall_category_not_found";
	public static final String MESSAGE_GETALL_SHOPPINGCART_OK = "message_getall_shoppingcart_ok";
	public static final String MESSAGE_GETALL_SHOPPINGCART_NOT_FOUND = "message_getall_shoppingcart_not_found";
	public static final String MESSAGE_GETALL_WISHLIST_OK = "message_getall_wishlist_ok";
	public static final String MESSAGE_GETALL_WISHLIST_NOT_FOUND = "message_getall_wishlist_not_found";
	public static final String MESSAGE_GETALL_CUSTOMER_OK = "message_getall_customer_ok";
	public static final String MESSAGE_GETALL_CUSTOMER_NOT_FOUND = "message_getall_customer_not_found";
	public static final String MESSAGE_GETALL_ADDRESS_OK = "message_getall_address_ok";
	public static final String MESSAGE_GETALL_ADDRESS_NOT_FOUND = "message_getall_address_not_found";
	public static final String MESSAGE_GETALL_CITY_OK = "message_getall_city_ok";
	public static final String MESSAGE_GETALL_CITY_NOT_FOUND = "message_getall_city_not_found";
	public static final String MESSAGE_GETALL_PHOTOPRODUCT_OK = "message_getall_photoproduct_ok";
	public static final String MESSAGE_GETALL_PHOTOPRODUCT_NOT_FOUND = "message_getall_photoproduct_not_found";

	public static final String MESSAGE_ERROR_ADDRESS_CREATE = "message_error_address_create";
	public static final String MESSAGE_ERROR_ADDRESS_UPDATE = "message_error_address_update";
	public static final String MESSAGE_ERROR_CATEGORY_CREATE = "message_error_category_create";
	public static final String MESSAGE_ERROR_CATEGORY_UPDATE = "message_error_category_update";
	public static final String MESSAGE_ERROR_CITY_CREATE = "message_error_city_create";
	public static final String MESSAGE_ERROR_CITY_UPDATE = "message_error_city_update";
	public static final String MESSAGE_ERROR_CUSTOMER_CREATE = "message_error_customer_create";
	public static final String MESSAGE_ERROR_CUSTOMER_UPDATE = "message_error_customer_update";
	public static final String MESSAGE_ERROR_PRODUCT_CREATE = "message_error_product_create";
	public static final String MESSAGE_ERROR_PRODUCT_UPDATE = "message_error_product_update";
	public static final String MESSAGE_ERROR_SHOPPINGCART_CREATE = "message_error_shoppingcart_create";
	public static final String MESSAGE_ERROR_SHOPPINGCART_UPDATE = "message_error_shoppingcart_update";
	public static final String MESSAGE_ERROR_WISHLIST_CREATE = "message_error_wishlist_create";
	public static final String MESSAGE_ERROR_WISHLIST_UPDATE = "message_error_wishlist_update";

	/**
	 * Error messages
	 */
	public static final String MESSAGE_NOT_FOUND = "Mensaje no encontrado";
	public static final String MENSAJE_ARCHIVO_PROCESADO_NO_ENCONTRADO = "mensaje_archivo_procesado_no_encontrado";
	public static final String MENSAJE_BANCO_DE_PROYECTOS_NO_ENCONTRADO = "mensaje_banco_de_proyectos_no_encontrado";

	/**
	 * Validation messages
	 */
	public static final String MESSAGE_VALIDATION_ADDRESS_EMPTY = "message_validation_address_empty";
	public static final String MESSAGE_VALIDATION_CITY_EMPTY = "message_validation_city_empty";
	public static final String MESSAGE_VALIDATION_CUSTOMER_EMPTY = "message_validation_customer_empty";
	public static final String MESSAGE_VALIDATION_CATEGORY_EMPTY = "message_validation_category_empty";
	public static final String MESSAGE_VALIDATION_PHOTOPRODUCT_EMPTY = "message_validation_photoproduct_empty";
	public static final String MESSAGE_VALIDATION_PRODUCT_EMPTY = "message_validation_product_empty";
	public static final String MESSAGE_VALIDATION_SHOPPINGCART_EMPTY = "message_validation_shoppingcart_empty";
	public static final String MESSAGE_VALIDATION_WISHLIST_EMPTY = "message_validation_wishlist_empty";
	/**
	 * 
	 */
	public static final int ACTIVE_STATUS = 1;
	public static final int INACTIVE_STATUS = 0;

	/**
	 * 
	 */
	public static final String STRING_ACTIVE_STATUS = "Activo";
	public static final String STRING_INACTIVE_STATUS = "Inactivo";

	/**
	 * Response HTTP
	 */
	public static final int SUCCESS_RESPONSE = 200;
	public static final int EXTERNAL_ERROR_RESPONSE = 400;
	public static final int EXCEPCION_RESPONSE = 500;

	/**
	 * Email constants.
	 */
	public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/*
	 * Mensajes expcepciones
	 */
	public static final String MESSAGE_GENERIC_EXCEPCION = "message_excepcion_generica";
}
