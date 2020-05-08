package com.github.seaframework.core.util;

import com.github.seaframework.core.common.SymbolConst;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.KeyValue;
import org.apache.commons.collections.MapUtils;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * module name
 *
 * @author spy
 * @version 1.0 2019-08-15
 * @since 1.0
 */
@Slf4j
public final class MapUtil {

    private MapUtil() {
    }

    /**
     * empty map
     *
     * @return
     */
    public static Map empty() {
        return Collections.emptyMap();
    }


    /**
     * deep clone
     * change to fastJSON
     *
     * @param original
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K, V> Map<K, V> clone(Map<K, V> original) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(original);

        return gson.fromJson(jsonString, Map.class);
    }

    public static Object getObject(final Map map, final Object key) {
        return MapUtils.getObject(map, key);
    }


    /**
     * Gets a String from a Map in a null-safe manner.
     * <p>
     * The String is obtained via <code>toString</code>.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a String, <code>null</code> if null map input
     */
    public static String getString(final Map map, final Object key) {
        return MapUtils.getString(map, key);
    }

    /**
     * Gets a Boolean from a Map in a null-safe manner.
     * <p>
     * If the value is a <code>Boolean</code> it is returned directly.
     * If the value is a <code>String</code> and it equals 'true' ignoring case
     * then <code>true</code> is returned, otherwise <code>false</code>.
     * If the value is a <code>Number</code> an integer zero value returns
     * <code>false</code> and non-zero returns <code>true</code>.
     * Otherwise, <code>null</code> is returned.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Boolean, <code>null</code> if null map input
     */
    public static Boolean getBoolean(final Map map, final Object key) {
        return MapUtils.getBoolean(map, key);
    }

    /**
     * Gets a Number from a Map in a null-safe manner.
     * <p>
     * If the value is a <code>Number</code> it is returned directly.
     * If the value is a <code>String</code> it is converted using
     * {@link NumberFormat#parse(String)} on the system default formatter
     * returning <code>null</code> if the conversion fails.
     * Otherwise, <code>null</code> is returned.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Number, <code>null</code> if null map input
     */
    public static Number getNumber(final Map map, final Object key) {

        return MapUtils.getNumber(map, key);
    }

    /**
     * Gets a Byte from a Map in a null-safe manner.
     * <p>
     * The Byte is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Byte, <code>null</code> if null map input
     */
    public static Byte getByte(final Map map, final Object key) {
        return MapUtils.getByte(map, key);
    }

    /**
     * Gets a Short from a Map in a null-safe manner.
     * <p>
     * The Short is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Short, <code>null</code> if null map input
     */
    public static Short getShort(final Map map, final Object key) {
        return MapUtils.getShort(map, key);
    }

    /**
     * Gets a Integer from a Map in a null-safe manner.
     * <p>
     * The Integer is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Integer, <code>null</code> if null map input
     */
    public static Integer getInteger(final Map map, final Object key) {
        return MapUtils.getInteger(map, key);
    }

    /**
     * Gets a Long from a Map in a null-safe manner.
     * <p>
     * The Long is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Long, <code>null</code> if null map input
     */
    public static Long getLong(final Map map, final Object key) {
        return MapUtils.getLong(map, key);
    }

    /**
     * Gets a Float from a Map in a null-safe manner.
     * <p>
     * The Float is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Float, <code>null</code> if null map input
     */
    public static Float getFloat(final Map map, final Object key) {
        return MapUtils.getFloat(map, key);
    }

    /**
     * Gets a Double from a Map in a null-safe manner.
     * <p>
     * The Double is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Double, <code>null</code> if null map input
     */
    public static Double getDouble(final Map map, final Object key) {
        return MapUtils.getDouble(map, key);
    }

    /**
     * Gets a Map from a Map in a null-safe manner.
     * <p>
     * If the value returned from the specified map is not a Map then
     * <code>null</code> is returned.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Map, <code>null</code> if null map input
     */
    public static Map getMap(final Map map, final Object key) {
        return MapUtils.getMap(map, key);
    }

    // Type safe getters with default values
    //-------------------------------------------------------------------------

    /**
     * Looks up the given key in the given map, converting null into the
     * given default value.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null
     * @return the value in the map, or defaultValue if the original value
     * is null or the map is null
     */
    public static Object getObject(Map map, Object key, Object defaultValue) {
        return MapUtils.getObject(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * a string, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a string, or defaultValue if the
     * original value is null, the map is null or the string conversion
     * fails
     */
    public static String getString(Map map, Object key, String defaultValue) {
        return MapUtils.getString(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * a boolean, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a boolean, or defaultValue if the
     * original value is null, the map is null or the boolean conversion
     * fails
     */
    public static Boolean getBoolean(Map map, Object key, Boolean defaultValue) {
        return MapUtils.getBoolean(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * a number, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a number, or defaultValue if the
     * original value is null, the map is null or the number conversion
     * fails
     */
    public static Number getNumber(Map map, Object key, Number defaultValue) {
        return MapUtils.getNumber(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * a byte, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a number, or defaultValue if the
     * original value is null, the map is null or the number conversion
     * fails
     */
    public static Byte getByte(Map map, Object key, Byte defaultValue) {
        return MapUtils.getByte(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * a short, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a number, or defaultValue if the
     * original value is null, the map is null or the number conversion
     * fails
     */
    public static Short getShort(Map map, Object key, Short defaultValue) {
        return MapUtils.getShort(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * an integer, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a number, or defaultValue if the
     * original value is null, the map is null or the number conversion
     * fails
     */
    public static Integer getInteger(Map map, Object key, Integer defaultValue) {
        return MapUtils.getInteger(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * a long, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a number, or defaultValue if the
     * original value is null, the map is null or the number conversion
     * fails
     */
    public static Long getLong(Map map, Object key, Long defaultValue) {
        return MapUtils.getLong(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * a float, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a number, or defaultValue if the
     * original value is null, the map is null or the number conversion
     * fails
     */
    public static Float getFloat(Map map, Object key, Float defaultValue) {
        return MapUtils.getFloat(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * a double, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a number, or defaultValue if the
     * original value is null, the map is null or the number conversion
     * fails
     */
    public static Double getDouble(Map map, Object key, Double defaultValue) {
        return MapUtils.getDouble(map, key, defaultValue);
    }

    /**
     * Looks up the given key in the given map, converting the result into
     * a map, using the default value if the the conversion fails.
     *
     * @param map          the map whose value to look up
     * @param key          the key of the value to look up in that map
     * @param defaultValue what to return if the value is null or if the
     *                     conversion fails
     * @return the value in the map as a number, or defaultValue if the
     * original value is null, the map is null or the map conversion
     * fails
     */
    public static Map getMap(Map map, Object key, Map defaultValue) {
        return MapUtils.getMap(map, key, defaultValue);
    }


    // Type safe primitive getters
    //-------------------------------------------------------------------------

    /**
     * Gets a boolean from a Map in a null-safe manner.
     * <p>
     * If the value is a <code>Boolean</code> its value is returned.
     * If the value is a <code>String</code> and it equals 'true' ignoring case
     * then <code>true</code> is returned, otherwise <code>false</code>.
     * If the value is a <code>Number</code> an integer zero value returns
     * <code>false</code> and non-zero returns <code>true</code>.
     * Otherwise, <code>false</code> is returned.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a Boolean, <code>false</code> if null map input
     */
    public static boolean getBooleanValue(final Map map, final Object key) {
        return MapUtils.getBooleanValue(map, key);
    }

    /**
     * Gets a byte from a Map in a null-safe manner.
     * <p>
     * The byte is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a byte, <code>0</code> if null map input
     */
    public static byte getByteValue(final Map map, final Object key) {
        return MapUtils.getByteValue(map, key);

    }

    /**
     * Gets a short from a Map in a null-safe manner.
     * <p>
     * The short is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a short, <code>0</code> if null map input
     */
    public static short getShortValue(final Map map, final Object key) {
        return MapUtils.getShortValue(map, key);
    }

    /**
     * Gets an int from a Map in a null-safe manner.
     * <p>
     * The int is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as an int, <code>0</code> if null map input
     */
    public static int getIntValue(final Map map, final Object key) {
        return MapUtils.getIntValue(map, key);
    }

    /**
     * Gets a long from a Map in a null-safe manner.
     * <p>
     * The long is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a long, <code>0L</code> if null map input
     */
    public static long getLongValue(final Map map, final Object key) {
        return MapUtils.getLongValue(map, key);

    }

    /**
     * Gets a float from a Map in a null-safe manner.
     * <p>
     * The float is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a float, <code>0.0F</code> if null map input
     */
    public static float getFloatValue(final Map map, final Object key) {
        return MapUtils.getFloatValue(map, key);
    }

    /**
     * Gets a double from a Map in a null-safe manner.
     * <p>
     * The double is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map the map to use
     * @param key the key to look up
     * @return the value in the Map as a double, <code>0.0</code> if null map input
     */
    public static double getDoubleValue(final Map map, final Object key) {
        return MapUtils.getDoubleValue(map, key);
    }

    // Type safe primitive getters with default values
    //-------------------------------------------------------------------------

    /**
     * Gets a boolean from a Map in a null-safe manner,
     * using the default value if the the conversion fails.
     * <p>
     * If the value is a <code>Boolean</code> its value is returned.
     * If the value is a <code>String</code> and it equals 'true' ignoring case
     * then <code>true</code> is returned, otherwise <code>false</code>.
     * If the value is a <code>Number</code> an integer zero value returns
     * <code>false</code> and non-zero returns <code>true</code>.
     * Otherwise, <code>defaultValue</code> is returned.
     *
     * @param map          the map to use
     * @param key          the key to look up
     * @param defaultValue return if the value is null or if the
     *                     conversion fails
     * @return the value in the Map as a Boolean, <code>defaultValue</code> if null map input
     */
    public static boolean getBooleanValue(final Map map, final Object key, boolean defaultValue) {
        return MapUtils.getBooleanValue(map, key, defaultValue);
    }

    /**
     * Gets a byte from a Map in a null-safe manner,
     * using the default value if the the conversion fails.
     * <p>
     * The byte is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map          the map to use
     * @param key          the key to look up
     * @param defaultValue return if the value is null or if the
     *                     conversion fails
     * @return the value in the Map as a byte, <code>defaultValue</code> if null map input
     */
    public static byte getByteValue(final Map map, final Object key, byte defaultValue) {
        return MapUtils.getByteValue(map, key, defaultValue);
    }

    /**
     * Gets a short from a Map in a null-safe manner,
     * using the default value if the the conversion fails.
     * <p>
     * The short is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map          the map to use
     * @param key          the key to look up
     * @param defaultValue return if the value is null or if the
     *                     conversion fails
     * @return the value in the Map as a short, <code>defaultValue</code> if null map input
     */
    public static short getShortValue(final Map map, final Object key, short defaultValue) {
        return MapUtils.getShortValue(map, key, defaultValue);
    }

    /**
     * Gets an int from a Map in a null-safe manner,
     * using the default value if the the conversion fails.
     * <p>
     * The int is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map          the map to use
     * @param key          the key to look up
     * @param defaultValue return if the value is null or if the
     *                     conversion fails
     * @return the value in the Map as an int, <code>defaultValue</code> if null map input
     */
    public static int getIntValue(final Map map, final Object key, int defaultValue) {
        return MapUtils.getIntValue(map, key, defaultValue);
    }

    /**
     * Gets a long from a Map in a null-safe manner,
     * using the default value if the the conversion fails.
     * <p>
     * The long is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map          the map to use
     * @param key          the key to look up
     * @param defaultValue return if the value is null or if the
     *                     conversion fails
     * @return the value in the Map as a long, <code>defaultValue</code> if null map input
     */
    public static long getLongValue(final Map map, final Object key, long defaultValue) {
        return MapUtils.getLongValue(map, key, defaultValue);
    }

    /**
     * Gets a float from a Map in a null-safe manner,
     * using the default value if the the conversion fails.
     * <p>
     * The float is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map          the map to use
     * @param key          the key to look up
     * @param defaultValue return if the value is null or if the
     *                     conversion fails
     * @return the value in the Map as a float, <code>defaultValue</code> if null map input
     */
    public static float getFloatValue(final Map map, final Object key, float defaultValue) {
        return MapUtils.getFloatValue(map, key, defaultValue);
    }

    /**
     * Gets a double from a Map in a null-safe manner,
     * using the default value if the the conversion fails.
     * <p>
     * The double is obtained from the results of {@link #getNumber(Map, Object)}.
     *
     * @param map          the map to use
     * @param key          the key to look up
     * @param defaultValue return if the value is null or if the
     *                     conversion fails
     * @return the value in the Map as a double, <code>defaultValue</code> if null map input
     */
    public static double getDoubleValue(final Map map, final Object key, double defaultValue) {
        return MapUtils.getDoubleValue(map, key, defaultValue);

    }

    // Conversion methods
    //-------------------------------------------------------------------------

    /**
     * Gets a new Properties object initialised with the values from a Map.
     * A null input will return an empty properties object.
     *
     * @param map the map to convert to a Properties object, may not be null
     * @return the properties object
     */
    public static Properties toProperties(final Map map) {
        return MapUtils.toProperties(map);
    }

    /**
     * Creates a new HashMap using data copied from a ResourceBundle.
     *
     * @param resourceBundle the resource bundle to convert, may not be null
     * @return the hashmap containing the data
     * @throws NullPointerException if the bundle is null
     */
    public static Map toMap(final ResourceBundle resourceBundle) {
        return MapUtils.toMap(resourceBundle);
    }


    // Misc
    //-----------------------------------------------------------------------

    /**
     * Inverts the supplied map returning a new HashMap such that the keys of
     * the input are swapped with the values.
     * <p>
     * This operation assumes that the inverse mapping is well defined.
     * If the input map had multiple entries with the same value mapped to
     * different keys, the returned map will map one of those keys to the
     * value, but the exact key which will be mapped is undefined.
     *
     * @param map the map to invert, may not be null
     * @return a new HashMap containing the inverted data
     * @throws NullPointerException if the map is null
     */
    public static Map invertMap(Map map) {
        return MapUtils.invertMap(map);
    }

    //-----------------------------------------------------------------------

    /**
     * Protects against adding null values to a map.
     * <p>
     * This method checks the value being added to the map, and if it is null
     * it is replaced by an empty string.
     * <p>
     * This could be useful if the map does not accept null values, or for
     * receiving data from a source that may provide null or empty string
     * which should be held in the same way in the map.
     * <p>
     * Keys are not validated.
     *
     * @param map   the map to add to, may not be null
     * @param key   the key
     * @param value the value, null converted to ""
     * @throws NullPointerException if the map is null
     */
    public static void safeAddToMap(Map map, Object key, Object value) {
        MapUtils.safeAddToMap(map, key, value);
    }

    //-----------------------------------------------------------------------

    /**
     * Puts all the keys and values from the specified array into the map.
     * <p>
     * This method is an alternative to the {@link java.util.Map#putAll(java.util.Map)}
     * method and constructors. It allows you to build a map from an object array
     * of various possible styles.
     * <p>
     * If the first entry in the object array implements {@link java.util.Map.Entry}
     * or {@link KeyValue} then the key and value are added from that object.
     * If the first entry in the object array is an object array itself, then
     * it is assumed that index 0 in the sub-array is the key and index 1 is the value.
     * Otherwise, the array is treated as keys and values in alternate indices.
     * <p>
     * For example, to create a color map:
     * <pre>
     * Map colorMap = MapUtils.putAll(new HashMap(), new String[][] {
     *     {"RED", "#FF0000"},
     *     {"GREEN", "#00FF00"},
     *     {"BLUE", "#0000FF"}
     * });
     * </pre>
     * or:
     * <pre>
     * Map colorMap = MapUtils.putAll(new HashMap(), new String[] {
     *     "RED", "#FF0000",
     *     "GREEN", "#00FF00",
     *     "BLUE", "#0000FF"
     * });
     * </pre>
     * or:
     * <pre>
     * Map colorMap = MapUtils.putAll(new HashMap(), new Map.Entry[] {
     *     new DefaultMapEntry("RED", "#FF0000"),
     *     new DefaultMapEntry("GREEN", "#00FF00"),
     *     new DefaultMapEntry("BLUE", "#0000FF")
     * });
     * </pre>
     *
     * @param map   the map to populate, must not be null
     * @param array an array to populate from, null ignored
     * @return the input map
     * @throws NullPointerException     if map is null
     * @throws IllegalArgumentException if sub-array or entry matching used and an
     *                                  entry is invalid
     * @throws ClassCastException       if the array contents is mixed
     * @since Commons Collections 3.2
     */
    public static Map putAll(Map map, Object[] array) {
        return MapUtils.putAll(map, array);
    }

    //-----------------------------------------------------------------------

    /**
     * Null-safe check if the specified map is empty.
     * <p>
     * Null returns true.
     *
     * @param map the map to check, may be null
     * @return true if empty or null
     * @since Commons Collections 3.2
     */
    public static boolean isEmpty(Map map) {
        return (map == null || map.isEmpty());
    }

    /**
     * Null-safe check if the specified map is not empty.
     * <p>
     * Null returns false.
     *
     * @param map the map to check, may be null
     * @return true if non-null and non-empty
     * @since Commons Collections 3.2
     */
    public static boolean isNotEmpty(Map map) {
        return !MapUtils.isEmpty(map);
    }


    /**
     * to string by comma
     * eg. abc=111,abc2=d1
     *
     * @param map
     * @return
     */
    public static String toString(Map<String, String> map) {
        return toString(map, SymbolConst.COMMA);
    }

    /**
     * to string
     *
     * @param map
     * @param separator
     * @return
     */
    public static String toString(Map<String, String> map, String separator) {
        if (isNotEmpty(map) && StringUtil.isNotEmpty(separator)) {
            StringBuilder sb = new StringBuilder();
            map.entrySet().forEach(item -> {
                sb.append(item.getKey()).append("=").append(item.getValue()).append(separator);
            });
            String content = sb.toString();
            if (content.length() <= 1) {
                return content;
            }
            return StringUtil.substring(content, 0, content.length() - separator.length());
        }

        return StringUtil.EMPTY;
    }

}
