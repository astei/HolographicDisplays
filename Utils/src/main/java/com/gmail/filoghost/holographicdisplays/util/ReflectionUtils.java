package com.gmail.filoghost.holographicdisplays.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.logging.Level;

import org.bukkit.Bukkit;

public class ReflectionUtils {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void putInPrivateStaticMap(Class<?> clazz, String fieldName, Object key, Object value) throws Exception {
		Field field = clazz.getDeclaredField(fieldName);
		field.setAccessible(true);
		Map map = (Map) field.get(null);
		map.put(key, value);
	}

	public static void setPrivateField(Class<?> clazz, Object handle, String fieldName, Object value) throws Exception {
		Field field = clazz.getDeclaredField(fieldName);
		field.setAccessible(true);
		field.set(handle, value);
	}
	
	public static Object getPrivateField(Class<?> clazz, Object handle, String fieldName) throws Exception {
		Field field = clazz.getDeclaredField(fieldName);
		field.setAccessible(true);
		return field.get(handle);
	}

	public static StackTraceElement getStackTraceElement(int index) {
		// Patched out: taking stack traces every time you call getId() is extremely expensive with lots of holograms.
		return null;
	}
}
