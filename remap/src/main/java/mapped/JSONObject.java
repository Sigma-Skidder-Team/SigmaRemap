// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;
import java.util.Collection;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.Locale;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class JSONObject
{
    private final Map<String, Object> map;
    public static final Object field19729;
    
    public JSONObject() {
        this.map = new HashMap<String, Object>();
    }
    
    public JSONObject(final JSONObject JSONObject, final String[] array) {
        this();
        for (int i = 0; i < array.length; ++i) {
            try {
                this.putOnce(array[i], JSONObject.opt(array[i]));
            }
            catch (final Exception ex) {}
        }
    }
    
    public JSONObject(final JSONTokener x) throws org.json.JSONException {
        this();
        if (x.nextClean() != '{') {
            throw x.syntaxError("A JSONObject text must begin with '{'");
        }
        while (true) {
            switch (x.nextClean()) {
                case '\0': {
                    throw x.syntaxError("A JSONObject text must end with '}'");
                }
                case '}': {
                    return;
                }
                default: {
                    x.back();
                    final String key = x.nextValue().toString();
                    if (x.nextClean() != ':') {
                        throw x.syntaxError("Expected a ':' after a key");
                    }
                    this.putOnce(key, x.nextValue());
                    switch (x.nextClean()) {
                        case ',':
                        case ';': {
                            if (x.nextClean() == '}') {
                                return;
                            }
                            x.back();
                            continue;
                        }
                        case '}': {
                            return;
                        }
                        default: {
                            throw x.syntaxError("Expected a ',' or '}'");
                        }
                    }
                }
            }
        }
    }
    
    public JSONObject(final Map<?, ?> map) {
        this.map = new HashMap<String, Object>();
        if (map != null) {
            for (final Map.Entry<K, Object> entry : map.entrySet()) {
                final Object value = entry.getValue();
                if (value == null) {
                    continue;
                }
                this.map.put(String.valueOf(entry.getKey()), method13312(value));
            }
        }
    }
    
    public JSONObject(final Object o) {
        this();
        this.method13294(o);
    }
    
    public JSONObject(final Object obj, final String[] array) {
        this();
        final Class<?> class1 = obj.getClass();
        for (int i = 0; i < array.length; ++i) {
            final String name = array[i];
            try {
                this.method13303(name, class1.getField(name).get(obj));
            }
            catch (final Exception ex) {}
        }
    }
    
    public JSONObject(final String s) throws org.json.JSONException {
        this(new JSONTokener(s));
    }
    
    public JSONObject(final String baseName, final Locale locale) throws org.json.JSONException {
        this();
        final ResourceBundle bundle = ResourceBundle.getBundle(baseName, locale, Thread.currentThread().getContextClassLoader());
        final Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            final String nextElement = keys.nextElement();
            if (nextElement == null) {
                continue;
            }
            final String[] split = nextElement.split("\\.");
            final int n = split.length - 1;
            JSONObject JSONObject = this;
            for (final String s : split) {
                JSONObject method13289 = JSONObject.method13289(s);
                if (method13289 == null) {
                    method13289 = new JSONObject();
                    JSONObject.put(s, method13289);
                }
                JSONObject = method13289;
            }
            JSONObject.put(split[n], bundle.getString(nextElement));
        }
    }
    
    public JSONObject method13254(final String s, final Object o) throws org.json.JSONException {
        method13309(o);
        final Object method13277 = this.opt(s);
        if (method13277 != null) {
            if (!(method13277 instanceof JSONArray)) {
                this.put(s, new JSONArray().method486(method13277).method486(o));
            }
            else {
                ((JSONArray)method13277).method486(o);
            }
        }
        else {
            this.put(s, (o instanceof JSONArray) ? new JSONArray().method486(o) : o);
        }
        return this;
    }
    
    public JSONObject method13255(final String str, final Object o) throws org.json.JSONException {
        method13309(o);
        final Object method13277 = this.opt(str);
        if (method13277 != null) {
            if (!(method13277 instanceof JSONArray)) {
                throw new JSONException("JSONObject[" + str + "] is not a JSONArray.");
            }
            this.put(str, ((JSONArray)method13277).method486(o));
        }
        else {
            this.put(str, new JSONArray().method486(o));
        }
        return this;
    }
    
    public static String method13256(final double d) {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            String s = Double.toString(d);
            if (s.indexOf(46) > 0) {
                if (s.indexOf(101) < 0) {
                    if (s.indexOf(69) < 0) {
                        while (s.endsWith("0")) {
                            s = s.substring(0, s.length() - 1);
                        }
                        if (s.endsWith(".")) {
                            s = s.substring(0, s.length() - 1);
                        }
                    }
                }
            }
            return s;
        }
        return "null";
    }
    
    public Object get(final String s) throws org.json.JSONException {
        if (s == null) {
            throw new JSONException("Null key.");
        }
        final Object method13277 = this.opt(s);
        if (method13277 != null) {
            return method13277;
        }
        throw new JSONException("JSONObject[" + quote(s) + "] not found.");
    }
    
    public <E extends Enum<E>> E method13258(final Class<E> clazz, final String s) throws org.json.JSONException {
        final Enum method13278 = this.method13278((Class<Enum>)clazz, s);
        if (method13278 != null) {
            return (E)method13278;
        }
        throw new JSONException("JSONObject[" + quote(s) + "] is not an enum of type " + quote(clazz.getSimpleName()) + ".");
    }
    
    public boolean getBoolean(final String s) throws org.json.JSONException {
        final Object method13257 = this.get(s);
        if (method13257.equals(Boolean.FALSE) || (method13257 instanceof String && ((String)method13257).equalsIgnoreCase("false"))) {
            return false;
        }
        if (!method13257.equals(Boolean.TRUE) && (!(method13257 instanceof String) || !((String)method13257).equalsIgnoreCase("true"))) {
            throw new JSONException("JSONObject[" + quote(s) + "] is not a Boolean.");
        }
        return true;
    }
    
    public BigInteger method13259(final String s) throws org.json.JSONException {
        final Object method13257 = this.get(s);
        try {
            return new BigInteger(method13257.toString());
        }
        catch (final Exception ex) {
            throw new JSONException("JSONObject[" + quote(s) + "] could not be converted to BigInteger.");
        }
    }
    
    public BigDecimal method13260(final String s) throws org.json.JSONException {
        final Object method13257 = this.get(s);
        try {
            return new BigDecimal(method13257.toString());
        }
        catch (final Exception ex) {
            throw new JSONException("JSONObject[" + quote(s) + "] could not be converted to BigDecimal.");
        }
    }
    
    public double method13261(final String s) throws org.json.JSONException {
        final Object method13257 = this.get(s);
        try {
            return (method13257 instanceof Number) ? ((Number)method13257).doubleValue() : Double.parseDouble((String)method13257);
        }
        catch (final Exception ex) {
            throw new JSONException("JSONObject[" + quote(s) + "] is not a number.");
        }
    }
    
    public int method13262(final String s) throws org.json.JSONException {
        final Object method13257 = this.get(s);
        try {
            return (method13257 instanceof Number) ? ((Number)method13257).intValue() : Integer.parseInt((String)method13257);
        }
        catch (final Exception ex) {
            throw new JSONException("JSONObject[" + quote(s) + "] is not an int.");
        }
    }
    
    public JSONArray method13263(final String s) throws org.json.JSONException {
        final Object method13257 = this.get(s);
        if (!(method13257 instanceof JSONArray)) {
            throw new JSONException("JSONObject[" + quote(s) + "] is not a JSONArray.");
        }
        return (JSONArray)method13257;
    }
    
    public JSONObject method13264(final String s) throws org.json.JSONException {
        final Object method13257 = this.get(s);
        if (!(method13257 instanceof JSONObject)) {
            throw new JSONException("JSONObject[" + quote(s) + "] is not a JSONObject.");
        }
        return (JSONObject)method13257;
    }
    
    public long method13265(final String s) throws org.json.JSONException {
        final Object method13257 = this.get(s);
        try {
            return (method13257 instanceof Number) ? ((Number)method13257).longValue() : Long.parseLong((String)method13257);
        }
        catch (final Exception ex) {
            throw new JSONException("JSONObject[" + quote(s) + "] is not a long.");
        }
    }
    
    public static String[] method13266(final JSONObject JSONObject) {
        final int method13274 = JSONObject.method13274();
        if (method13274 != 0) {
            final Iterator<String> method13275 = JSONObject.method13272();
            final String[] array = new String[method13274];
            int n = 0;
            while (method13275.hasNext()) {
                array[n] = method13275.next();
                ++n;
            }
            return array;
        }
        return null;
    }
    
    public static String[] method13267(final Object o) {
        if (o == null) {
            return null;
        }
        final Field[] fields = o.getClass().getFields();
        final int length = fields.length;
        if (length != 0) {
            final String[] array = new String[length];
            for (int i = 0; i < length; ++i) {
                array[i] = fields[i].getName();
            }
            return array;
        }
        return null;
    }
    
    public String getString(final String s) throws org.json.JSONException {
        final Object object = this.get(s);
        if (!(object instanceof String)) {
            throw new JSONException("JSONObject[" + quote(s) + "] not a string.");
        }
        return (String)object;
    }
    
    public boolean has(final String s) {
        return this.map.containsKey(s);
    }
    
    public JSONObject increment(final String s) throws org.json.JSONException {
        final Object method13277 = this.opt(s);
        if (method13277 != null) {
            if (!(method13277 instanceof BigInteger)) {
                if (!(method13277 instanceof BigDecimal)) {
                    if (!(method13277 instanceof Integer)) {
                        if (!(method13277 instanceof Long)) {
                            if (!(method13277 instanceof Double)) {
                                if (!(method13277 instanceof Float)) {
                                    throw new JSONException("Unable to increment [" + quote(s) + "].");
                                }
                                this.method13297(s, (float)method13277 + 1.0f);
                            }
                            else {
                                this.method13297(s, (double)method13277 + 1.0);
                            }
                        }
                        else {
                            this.method13299(s, (long)method13277 + 1L);
                        }
                    }
                    else {
                        this.method13298(s, (int)method13277 + 1);
                    }
                }
                else {
                    this.put(s, ((BigDecimal)method13277).add(BigDecimal.ONE));
                }
            }
            else {
                this.put(s, ((BigInteger)method13277).add(BigInteger.ONE));
            }
        }
        else {
            this.method13298(s, 1);
        }
        return this;
    }
    
    public boolean method13271(final String s) {
        return JSONObject.field19729.equals(this.opt(s));
    }
    
    public Iterator<String> method13272() {
        return this.method13273().iterator();
    }
    
    public Set<String> method13273() {
        return this.map.keySet();
    }
    
    public int method13274() {
        return this.map.size();
    }
    
    public JSONArray method13275() {
        final JSONArray JSONArray = new JSONArray();
        final Iterator<String> method13272 = this.method13272();
        while (method13272.hasNext()) {
            JSONArray.method486(method13272.next());
        }
        return (JSONArray.length() != 0) ? JSONArray : null;
    }
    
    public static String method13276(final Number n) throws org.json.JSONException {
        if (n != null) {
            method13309(n);
            String s = n.toString();
            if (s.indexOf(46) > 0) {
                if (s.indexOf(101) < 0) {
                    if (s.indexOf(69) < 0) {
                        while (s.endsWith("0")) {
                            s = s.substring(0, s.length() - 1);
                        }
                        if (s.endsWith(".")) {
                            s = s.substring(0, s.length() - 1);
                        }
                    }
                }
            }
            return s;
        }
        throw new JSONException("Null pointer");
    }
    
    public Object opt(final String s) {
        return (s != null) ? this.map.get(s) : null;
    }
    
    public <E extends Enum<E>> E method13278(final Class<E> clazz, final String s) {
        return this.method13279(clazz, s, (E)null);
    }
    
    public <E extends Enum<E>> E method13279(final Class<E> enumClass, final String s, final E e) {
        try {
            final Object method13277 = this.opt(s);
            if (JSONObject.field19729.equals(method13277)) {
                return e;
            }
            if (enumClass.isAssignableFrom(((Enum<E>)method13277).getClass())) {
                return (E)method13277;
            }
            return Enum.valueOf(enumClass, method13277.toString());
        }
        catch (final IllegalArgumentException | NullPointerException ex) {
            return e;
        }
    }
    
    public boolean method13280(final String s) {
        return this.method13281(s, false);
    }
    
    public boolean method13281(final String s, final boolean b) {
        try {
            return this.getBoolean(s);
        }
        catch (final Exception ex) {
            return b;
        }
    }
    
    public double method13282(final String s) {
        return this.method13285(s, Double.NaN);
    }
    
    public BigInteger method13283(final String s, final BigInteger bigInteger) {
        try {
            return this.method13259(s);
        }
        catch (final Exception ex) {
            return bigInteger;
        }
    }
    
    public BigDecimal method13284(final String s, final BigDecimal bigDecimal) {
        try {
            return this.method13260(s);
        }
        catch (final Exception ex) {
            return bigDecimal;
        }
    }
    
    public double method13285(final String s, final double n) {
        try {
            return this.method13261(s);
        }
        catch (final Exception ex) {
            return n;
        }
    }
    
    public int method13286(final String s) {
        return this.method13287(s, 0);
    }
    
    public int method13287(final String s, final int n) {
        try {
            return this.method13262(s);
        }
        catch (final Exception ex) {
            return n;
        }
    }
    
    public JSONArray method13288(final String s) {
        final Object method13277 = this.opt(s);
        return (method13277 instanceof JSONArray) ? ((JSONArray)method13277) : null;
    }
    
    public JSONObject method13289(final String s) {
        final Object method13277 = this.opt(s);
        return (method13277 instanceof JSONObject) ? ((JSONObject)method13277) : null;
    }
    
    public long method13290(final String s) {
        return this.method13291(s, 0L);
    }
    
    public long method13291(final String s, final long n) {
        try {
            return this.method13265(s);
        }
        catch (final Exception ex) {
            return n;
        }
    }
    
    public String method13292(final String s) {
        return this.method13293(s, "");
    }
    
    public String method13293(final String s, final String s2) {
        final Object method13277 = this.opt(s);
        return JSONObject.field19729.equals(method13277) ? s2 : method13277.toString();
    }
    
    private void method13294(final Object obj) {
        final Class<?> class1 = obj.getClass();
        final Method[] array = (class1.getClassLoader() != null) ? class1.getMethods() : class1.getDeclaredMethods();
        for (int i = 0; i < array.length; ++i) {
            try {
                final Method method = array[i];
                if (Modifier.isPublic(method.getModifiers())) {
                    final String name = method.getName();
                    String s = "";
                    if (name.startsWith("get")) {
                        if ("getClass".equals(name) || "getDeclaringClass".equals(name)) {
                            s = "";
                        }
                        else {
                            s = name.substring(3);
                        }
                    }
                    else if (name.startsWith("is")) {
                        s = name.substring(2);
                    }
                    if (s.length() > 0 && Character.isUpperCase(s.charAt(0)) && method.getParameterTypes().length == 0) {
                        if (s.length() == 1) {
                            s = s.toLowerCase();
                        }
                        else if (!Character.isUpperCase(s.charAt(1))) {
                            s = s.substring(0, 1).toLowerCase() + s.substring(1);
                        }
                        final Object invoke = method.invoke(obj, (Object[])null);
                        if (invoke != null) {
                            this.map.put(s, method13312(invoke));
                        }
                    }
                }
            }
            catch (final Exception ex) {}
        }
    }
    
    public JSONObject method13295(final String s, final boolean b) throws org.json.JSONException {
        this.put(s, b ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }
    
    public JSONObject method13296(final String s, final Collection<?> collection) throws org.json.JSONException {
        this.put(s, new JSONArray(collection));
        return this;
    }
    
    public JSONObject method13297(final String s, final double value) throws org.json.JSONException {
        this.put(s, new Double(value));
        return this;
    }
    
    public JSONObject method13298(final String s, final int value) throws org.json.JSONException {
        this.put(s, new Integer(value));
        return this;
    }
    
    public JSONObject method13299(final String s, final long value) throws org.json.JSONException {
        this.put(s, new Long(value));
        return this;
    }
    
    public JSONObject method13300(final String s, final Map<?, ?> map) throws org.json.JSONException {
        this.put(s, new JSONObject(map));
        return this;
    }
    
    public JSONObject put(final String s, final Object o) throws org.json.JSONException {
        if (s != null) {
            if (o == null) {
                this.method13306(s);
            }
            else {
                method13309(o);
                this.map.put(s, o);
            }
            return this;
        }
        throw new NullPointerException("Null key.");
    }
    
    public JSONObject putOnce(final String str, final Object o) throws org.json.JSONException {
        if (str != null) {
            if (o != null) {
                if (this.opt(str) != null) {
                    throw new JSONException("Duplicate key \"" + str + "\"");
                }
                this.put(str, o);
            }
        }
        return this;
    }
    
    public JSONObject method13303(final String s, final Object o) throws org.json.JSONException {
        if (s != null) {
            if (o != null) {
                this.put(s, o);
            }
        }
        return this;
    }
    
    public static String quote(final String s) {
        final StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                return writeEscapedString(s, stringWriter).toString();
            }
            catch (final IOException ex) {
                return "";
            }
        }
    }
    
    public static Writer writeEscapedString(final String s, final Writer writer) throws IOException {
        if (s == null || s.isEmpty()) {
            writer.write("\"\"");
            return writer;
        }
        int char1 = 0;
        final int length = s.length();
        writer.write(34);
        for (int i = 0; i < length; ++i) {
            final int n = char1;
            char1 = s.charAt(i);
            switch (char1) {
                case 34:
                case 92: {
                    writer.write(92);
                    writer.write(char1);
                    break;
                }
                case 47: {
                    if (n == 60) {
                        writer.write(92);
                    }
                    writer.write(char1);
                    break;
                }
                case 8: {
                    writer.write("\\b");
                    break;
                }
                case 9: {
                    writer.write("\\t");
                    break;
                }
                case 10: {
                    writer.write("\\n");
                    break;
                }
                case 12: {
                    writer.write("\\f");
                    break;
                }
                case 13: {
                    writer.write("\\r");
                    break;
                }
                default: {
                    if (char1 < 32 || (char1 >= 128 && char1 < 160) || (char1 >= 8192 && char1 < 8448)) {
                        writer.write("\\u");
                        final String hexString = Integer.toHexString(char1);
                        writer.write("0000", 0, 4 - hexString.length());
                        writer.write(hexString);
                        break;
                    }
                    writer.write(char1);
                    break;
                }
            }
        }
        writer.write(34);
        return writer;
    }
    
    public Object method13306(final String s) {
        return this.map.remove(s);
    }
    
    public boolean method13307(final Object o) {
        try {
            if (!(o instanceof JSONObject)) {
                return false;
            }
            final Set<String> method13273 = this.method13273();
            if (!method13273.equals(((JSONObject)o).method13273())) {
                return false;
            }
            for (final String s : method13273) {
                final Object method13274 = this.get(s);
                final Object method13275 = ((JSONObject)o).get(s);
                if (method13274 instanceof JSONObject) {
                    if (!((JSONObject)method13274).method13307(method13275)) {
                        return false;
                    }
                    continue;
                }
                else if (method13274 instanceof JSONArray) {
                    if (!((JSONArray)method13274).method495(method13275)) {
                        return false;
                    }
                    continue;
                }
                else {
                    if (!method13274.equals(method13275)) {
                        return false;
                    }
                    continue;
                }
            }
            return true;
        }
        catch (final Throwable t) {
            return false;
        }
    }
    
    public static Object method13308(final String s) {
        if (s.equals("")) {
            return s;
        }
        if (s.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (s.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (s.equalsIgnoreCase("null")) {
            return JSONObject.field19729;
        }
        final char char1 = s.charAt(0);
        if (char1 < '0' || char1 > '9') {
            if (char1 != '-') {
                return s;
            }
        }
        try {
            if (s.indexOf(46) > -1 || s.indexOf(101) > -1 || s.indexOf(69) > -1) {
                final Double value = Double.valueOf(s);
                if (!value.isInfinite() && !value.isNaN()) {
                    return value;
                }
            }
            else {
                final Long n = new Long(s);
                if (s.equals(n.toString())) {
                    if (n == n.intValue()) {
                        return n.intValue();
                    }
                    return n;
                }
            }
        }
        catch (final Exception ex) {}
        return s;
    }
    
    public static void method13309(final Object o) throws org.json.JSONException {
        if (o != null) {
            if (!(o instanceof Double)) {
                if (o instanceof Float) {
                    if (((Float)o).isInfinite() || ((Float)o).isNaN()) {
                        throw new JSONException("JSON does not allow non-finite numbers.");
                    }
                }
            }
            else if (((Double)o).isInfinite() || ((Double)o).isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        }
    }
    
    public JSONArray method13310(final JSONArray JSONArray) throws org.json.JSONException {
        if (JSONArray != null && JSONArray.length() != 0) {
            final JSONArray class89 = new JSONArray();
            for (int i = 0; i < JSONArray.length(); ++i) {
                class89.method486(this.opt(JSONArray.method459(i)));
            }
            return class89;
        }
        return null;
    }
    
    @Override
    public String toString() {
        try {
            return this.toString(0);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public String toString(final int n) throws org.json.JSONException {
        final StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            return this.method13316(stringWriter, n, 0).toString();
        }
    }
    
    public static String method13311(final Object o) throws org.json.JSONException {
        if (o == null || o.equals(null)) {
            return "null";
        }
        if (o instanceof Class8369) {
            String method27912;
            try {
                method27912 = ((Class8369)o).method27912();
            }
            catch (final Exception ex) {
                throw new JSONException(ex);
            }
            if (method27912 instanceof String) {
                return method27912;
            }
            throw new JSONException("Bad value from toJSONString: " + (Object)method27912);
        }
        else {
            if (o instanceof Number) {
                return method13276((Number)o);
            }
            if (o instanceof Boolean || o instanceof JSONObject || o instanceof JSONArray) {
                return o.toString();
            }
            if (o instanceof Map) {
                return new JSONObject((Map<?, ?>)o).toString();
            }
            if (o instanceof Collection) {
                return new JSONArray((Collection<?>)o).toString();
            }
            if (o.getClass().isArray()) {
                return new JSONArray(o).toString();
            }
            return quote(o.toString());
        }
    }
    
    public static Object method13312(final Object obj) {
        try {
            if (obj == null) {
                return JSONObject.field19729;
            }
            if (obj instanceof JSONObject || obj instanceof JSONArray || JSONObject.field19729.equals(obj) || obj instanceof Class8369 || obj instanceof Byte || obj instanceof Character || obj instanceof Short || obj instanceof Integer || obj instanceof Long || obj instanceof Boolean || obj instanceof Float || obj instanceof Double || obj instanceof String || obj instanceof BigInteger || obj instanceof BigDecimal) {
                return obj;
            }
            if (obj instanceof Collection) {
                return new JSONArray((Collection<?>)obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray(obj);
            }
            if (obj instanceof Map) {
                return new JSONObject((Map<?, ?>)obj);
            }
            final Package package1 = obj.getClass().getPackage();
            final String s = (package1 != null) ? package1.getName() : "";
            if (s.startsWith("java.") || s.startsWith("javax.") || obj.getClass().getClassLoader() == null) {
                return obj.toString();
            }
            return new JSONObject(obj);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public Writer method13313(final Writer writer) throws org.json.JSONException {
        return this.method13316(writer, 0, 0);
    }
    
    public static final Writer method13314(final Writer writer, final Object o, final int n, final int n2) throws org.json.JSONException, IOException {
        if (o == null || o.equals(null)) {
            writer.write("null");
        }
        else if (o instanceof JSONObject) {
            ((JSONObject)o).method13316(writer, n, n2);
        }
        else if (o instanceof JSONArray) {
            ((JSONArray)o).method498(writer, n, n2);
        }
        else if (o instanceof Map) {
            new JSONObject((Map<?, ?>)o).method13316(writer, n, n2);
        }
        else if (o instanceof Collection) {
            new JSONArray((Collection<?>)o).method498(writer, n, n2);
        }
        else if (o.getClass().isArray()) {
            new JSONArray(o).method498(writer, n, n2);
        }
        else if (o instanceof Number) {
            writer.write(method13276((Number)o));
        }
        else if (o instanceof Boolean) {
            writer.write(o.toString());
        }
        else if (o instanceof Class8369) {
            String method27912;
            try {
                method27912 = ((Class8369)o).method27912();
            }
            catch (final Exception ex) {
                throw new JSONException(ex);
            }
            writer.write((method27912 != null) ? method27912.toString() : quote(o.toString()));
        }
        else {
            writeEscapedString(o.toString(), writer);
        }
        return writer;
    }
    
    public static final void method13315(final Writer writer, final int n) throws IOException {
        for (int i = 0; i < n; ++i) {
            writer.write(32);
        }
    }
    
    public Writer method13316(final Writer writer, final int n, final int n2) throws org.json.JSONException {
        try {
            int n3 = 0;
            final int method13274 = this.method13274();
            final Iterator<String> method13275 = this.method13272();
            writer.write(123);
            if (method13274 == 1) {
                final String next = method13275.next();
                writer.write(quote(next.toString()));
                writer.write(58);
                if (n > 0) {
                    writer.write(32);
                }
                method13314(writer, this.map.get(next), n, n2);
            }
            else if (method13274 != 0) {
                final int n4 = n2 + n;
                while (method13275.hasNext()) {
                    final String next2 = method13275.next();
                    if (n3 != 0) {
                        writer.write(44);
                    }
                    if (n > 0) {
                        writer.write(10);
                    }
                    method13315(writer, n4);
                    writer.write(quote(next2.toString()));
                    writer.write(58);
                    if (n > 0) {
                        writer.write(32);
                    }
                    method13314(writer, this.map.get(next2), n, n4);
                    n3 = 1;
                }
                if (n > 0) {
                    writer.write(10);
                }
                method13315(writer, n2);
            }
            writer.write(125);
            return writer;
        }
        catch (final IOException ex) {
            throw new JSONException(ex);
        }
    }
    
    static {
        field19729 = new Class6776(null);
    }
}
