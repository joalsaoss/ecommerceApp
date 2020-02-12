/**
 * 
 */
package com.joalsaoss.ecommerce.utils;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.joalsaoss.ecommerce.enums.MessageEnum;

/**
 * @author Jose Alvaro
 *
 */
public class EcommMessages {

	/**
	 * 
	 */
	private EcommMessages() {
		super();
	}

	/**
	 * 
	 * @param constant
	 * @param strLanguage
	 * @return
	 */
	public static String getMessage(String constant, String strLanguage) {
		String messageType = MessageEnum.MESSAGES.getPackageName();
		Locale language = new Locale("");
		if (strLanguage != null) {
			language = new Locale(strLanguage);
		}
		try {
			ResourceBundle resource = ResourceBundle.getBundle(messageType, language);
			return resource.getString(constant);
		} catch (MissingResourceException exception) {
			return EcommConstants.MESSAGE_NOT_FOUND + ": " + constant;
		}
	}

	/**
	 * 
	 * @param constant
	 * @param type
	 * @param strLanguage
	 * @return
	 */
	public static String getMessage(String constant, MessageEnum type, String strLanguage) {
		Locale language = new Locale("");
		if (strLanguage != null) {
			language = new Locale(strLanguage);
		}
		String messageType = MessageEnum.MESSAGES.getPackageName();
		if (type != null) {
			messageType = type.getPackageName();
		}
		try {
			ResourceBundle resource = ResourceBundle.getBundle(messageType, language);
			return resource.getString(constant);
		} catch (MissingResourceException exception) {
			return EcommConstants.MESSAGE_NOT_FOUND + ": " + constant;
		}
	}

}
