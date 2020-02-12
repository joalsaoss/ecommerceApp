/**
 * 
 */
package com.joalsaoss.ecommerce.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


/**
 * @author Jose Alvaro
 *
 */
@Component
public class EcommLogger {
	
	public static final EcommLogger ECOMM_LOGGER = new EcommLogger();
	
	/**
	 * 
	 */
	public EcommLogger() {
		super();
	}

	/**
	 * 
	 * @param message
	 * @param severity
	 * @param claseName
	 */
	public void messageLogger(String message, String severity, Class<?> claseName) {
		Logger logger = LogManager.getLogger(claseName);

		switch (severity) {
		case EcommConstants.SEVERIDAD_DEBUG:
			logger.debug(message);
			break;
		case EcommConstants.SEVERIDAD_ERROR:
			logger.error(message);
			break;
		case EcommConstants.SEVERIDAD_FATAL:
			logger.fatal(message);
			break;
		case EcommConstants.SEVERIDAD_INFO:
			logger.info(message);
			break;
		case EcommConstants.SEVERIDAD_TRACE:
			logger.trace(message);
			break;
		case EcommConstants.SEVERIDAD_WARN:
			logger.warn(message);
			break;
		default:
			logger.debug(message);
			break;
		}
	}	
}
