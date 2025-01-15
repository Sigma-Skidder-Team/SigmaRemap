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
import org.json.JSONException;
import java.util.HashMap;
import java.util.Map;

public class Class4405
{
    private final Map<String, Object> field19728;
    public static final Object field19729;
    
    public Class4405() {
        this.field19728 = new HashMap<String, Object>();
    }
    
    public Class4405(final Class4405 class4405, final String[] array) {
        this();
        for (int i = 0; i < array.length; ++i) {
            try {
                this.method13302(array[i], class4405.method13277(array[i]));
            }
            catch (final Exception ex) {}
        }
    }
    
    public Class4405(final Class8826 class8826) throws JSONException {
        this();
        if (class8826.method30788() != '{') {
            throw class8826.method30794("A JSONObject text must begin with '{'");
        }
        while (true) {
            switch (class8826.method30788()) {
                case '\0': {
                    throw class8826.method30794("A JSONObject text must end with '}'");
                }
                case '}': {
                    return;
                }
                default: {
                    class8826.method30781();
                    final String string = class8826.method30792().toString();
                    if (class8826.method30788() != ':') {
                        throw class8826.method30794("Expected a ':' after a key");
                    }
                    this.method13302(string, class8826.method30792());
                    switch (class8826.method30788()) {
                        case ',':
                        case ';': {
                            if (class8826.method30788() == '}') {
                                return;
                            }
                            class8826.method30781();
                            continue;
                        }
                        case '}': {
                            return;
                        }
                        default: {
                            throw class8826.method30794("Expected a ',' or '}'");
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public Class4405(final Map<?, ?> map) {
        this.field19728 = new HashMap<String, Object>();
        if (map != null) {
            for (final Map.Entry<K, Object> entry : map.entrySet()) {
                final Object value = entry.getValue();
                if (value == null) {
                    continue;
                }
                this.field19728.put(String.valueOf(entry.getKey()), method13312(value));
            }
        }
    }
    
    public Class4405(final Object o) {
        this();
        this.method13294(o);
    }
    
    public Class4405(final Object obj, final String[] array) {
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
    
    public Class4405(final String s) throws JSONException {
        this(new Class8826(s));
    }
    
    public Class4405(final String baseName, final Locale locale) throws JSONException {
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
            Class4405 class4405 = this;
            for (final String s : split) {
                Class4405 method13289 = class4405.method13289(s);
                if (method13289 == null) {
                    method13289 = new Class4405();
                    class4405.method13301(s, method13289);
                }
                class4405 = method13289;
            }
            class4405.method13301(split[n], bundle.getString(nextElement));
        }
    }
    
    public Class4405 method13254(final String s, final Object o) throws JSONException {
        method13309(o);
        final Object method13277 = this.method13277(s);
        if (method13277 != null) {
            if (!(method13277 instanceof Class88)) {
                this.method13301(s, new Class88().method486(method13277).method486(o));
            }
            else {
                ((Class88)method13277).method486(o);
            }
        }
        else {
            this.method13301(s, (o instanceof Class88) ? new Class88().method486(o) : o);
        }
        return this;
    }
    
    public Class4405 method13255(final String str, final Object o) throws JSONException {
        method13309(o);
        final Object method13277 = this.method13277(str);
        if (method13277 != null) {
            if (!(method13277 instanceof Class88)) {
                throw new Class2381("JSONObject[" + str + "] is not a JSONArray.");
            }
            this.method13301(str, ((Class88)method13277).method486(o));
        }
        else {
            this.method13301(str, new Class88().method486(o));
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
    
    public Object method13257(final String s) throws JSONException {
        if (s == null) {
            throw new Class2381("Null key.");
        }
        final Object method13277 = this.method13277(s);
        if (method13277 != null) {
            return method13277;
        }
        throw new Class2381("JSONObject[" + method13304(s) + "] not found.");
    }
    
    public <E extends Enum<E>> E method13258(final Class<E> clazz, final String s) throws JSONException {
        final Enum method13278 = this.method13278((Class<Enum>)clazz, s);
        if (method13278 != null) {
            return (E)method13278;
        }
        throw new Class2381("JSONObject[" + method13304(s) + "] is not an enum of type " + method13304(clazz.getSimpleName()) + ".");
    }
    
    public boolean method13253(final String s) throws JSONException {
        final Object method13257 = this.method13257(s);
        if (method13257.equals(Boolean.FALSE) || (method13257 instanceof String && ((String)method13257).equalsIgnoreCase("false"))) {
            return false;
        }
        if (!method13257.equals(Boolean.TRUE) && (!(method13257 instanceof String) || !((String)method13257).equalsIgnoreCase("true"))) {
            throw new Class2381("JSONObject[" + method13304(s) + "] is not a Boolean.");
        }
        return true;
    }
    
    public BigInteger method13259(final String s) throws JSONException {
        final Object method13257 = this.method13257(s);
        try {
            return new BigInteger(method13257.toString());
        }
        catch (final Exception ex) {
            throw new Class2381("JSONObject[" + method13304(s) + "] could not be converted to BigInteger.");
        }
    }
    
    public BigDecimal method13260(final String s) throws JSONException {
        final Object method13257 = this.method13257(s);
        try {
            return new BigDecimal(method13257.toString());
        }
        catch (final Exception ex) {
            throw new Class2381("JSONObject[" + method13304(s) + "] could not be converted to BigDecimal.");
        }
    }
    
    public double method13261(final String s) throws JSONException {
        final Object method13257 = this.method13257(s);
        try {
            return (method13257 instanceof Number) ? ((Number)method13257).doubleValue() : Double.parseDouble((String)method13257);
        }
        catch (final Exception ex) {
            throw new Class2381("JSONObject[" + method13304(s) + "] is not a number.");
        }
    }
    
    public int method13262(final String s) throws JSONException {
        final Object method13257 = this.method13257(s);
        try {
            return (method13257 instanceof Number) ? ((Number)method13257).intValue() : Integer.parseInt((String)method13257);
        }
        catch (final Exception ex) {
            throw new Class2381("JSONObject[" + method13304(s) + "] is not an int.");
        }
    }
    
    public Class88 method13263(final String s) throws JSONException {
        final Object method13257 = this.method13257(s);
        if (!(method13257 instanceof Class88)) {
            throw new Class2381("JSONObject[" + method13304(s) + "] is not a JSONArray.");
        }
        return (Class88)method13257;
    }
    
    public Class4405 method13264(final String s) throws JSONException {
        final Object method13257 = this.method13257(s);
        if (!(method13257 instanceof Class4405)) {
            throw new Class2381("JSONObject[" + method13304(s) + "] is not a JSONObject.");
        }
        return (Class4405)method13257;
    }
    
    public long method13265(final String s) throws JSONException {
        final Object method13257 = this.method13257(s);
        try {
            return (method13257 instanceof Number) ? ((Number)method13257).longValue() : Long.parseLong((String)method13257);
        }
        catch (final Exception ex) {
            throw new Class2381("JSONObject[" + method13304(s) + "] is not a long.");
        }
    }
    
    public static String[] method13266(final Class4405 class4405) {
        final int method13274 = class4405.method13274();
        if (method13274 != 0) {
            final Iterator<String> method13275 = class4405.method13272();
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
    
    public String method13268(final String s) throws JSONException {
        final Object method13257 = this.method13257(s);
        if (!(method13257 instanceof String)) {
            throw new Class2381("JSONObject[" + method13304(s) + "] not a string.");
        }
        return (String)method13257;
    }
    
    public boolean method13269(final String s) {
        return this.field19728.containsKey(s);
    }
    
    public Class4405 method13270(final String s) throws JSONException {
        final Object method13277 = this.method13277(s);
        if (method13277 != null) {
            if (!(method13277 instanceof BigInteger)) {
                if (!(method13277 instanceof BigDecimal)) {
                    if (!(method13277 instanceof Integer)) {
                        if (!(method13277 instanceof Long)) {
                            if (!(method13277 instanceof Double)) {
                                if (!(method13277 instanceof Float)) {
                                    throw new Class2381("Unable to increment [" + method13304(s) + "].");
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
                    this.method13301(s, ((BigDecimal)method13277).add(BigDecimal.ONE));
                }
            }
            else {
                this.method13301(s, ((BigInteger)method13277).add(BigInteger.ONE));
            }
        }
        else {
            this.method13298(s, 1);
        }
        return this;
    }
    
    public boolean method13271(final String s) {
        return Class4405.field19729.equals(this.method13277(s));
    }
    
    public Iterator<String> method13272() {
        return this.method13273().iterator();
    }
    
    public Set<String> method13273() {
        return this.field19728.keySet();
    }
    
    public int method13274() {
        return this.field19728.size();
    }
    
    public Class88 method13275() {
        final Class88 class88 = new Class88();
        final Iterator<String> method13272 = this.method13272();
        while (method13272.hasNext()) {
            class88.method486(method13272.next());
        }
        return (class88.method462() != 0) ? class88 : null;
    }
    
    public static String method13276(final Number n) throws JSONException {
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
        throw new Class2381("Null pointer");
    }
    
    public Object method13277(final String s) {
        return (s != null) ? this.field19728.get(s) : null;
    }
    
    public <E extends Enum<E>> E method13278(final Class<E> clazz, final String s) {
        return this.method13279(clazz, s, (E)null);
    }
    
    public <E extends Enum<E>> E method13279(final Class<E> enumClass, final String s, final E e) {
        try {
            final Object method13277 = this.method13277(s);
            if (Class4405.field19729.equals(method13277)) {
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
            return this.method13253(s);
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
    
    public Class88 method13288(final String s) {
        final Object method13277 = this.method13277(s);
        return (method13277 instanceof Class88) ? ((Class88)method13277) : null;
    }
    
    public Class4405 method13289(final String s) {
        final Object method13277 = this.method13277(s);
        return (method13277 instanceof Class4405) ? ((Class4405)method13277) : null;
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
        final Object method13277 = this.method13277(s);
        return Class4405.field19729.equals(method13277) ? s2 : method13277.toString();
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
                            this.field19728.put(s, method13312(invoke));
                        }
                    }
                }
            }
            catch (final Exception ex) {}
        }
    }
    
    public Class4405 method13295(final String s, final boolean b) throws JSONException {
        this.method13301(s, b ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }
    
    public Class4405 method13296(final String s, final Collection<?> collection) throws JSONException {
        this.method13301(s, new Class88(collection));
        return this;
    }
    
    public Class4405 method13297(final String s, final double value) throws JSONException {
        this.method13301(s, new Double(value));
        return this;
    }
    
    public Class4405 method13298(final String s, final int value) throws JSONException {
        this.method13301(s, new Integer(value));
        return this;
    }
    
    public Class4405 method13299(final String s, final long value) throws JSONException {
        this.method13301(s, new Long(value));
        return this;
    }
    
    public Class4405 method13300(final String s, final Map<?, ?> map) throws JSONException {
        this.method13301(s, new Class4405(map));
        return this;
    }
    
    public Class4405 method13301(final String s, final Object o) throws JSONException {
        if (s != null) {
            if (o == null) {
                this.method13306(s);
            }
            else {
                method13309(o);
                this.field19728.put(s, o);
            }
            return this;
        }
        throw new NullPointerException("Null key.");
    }
    
    public Class4405 method13302(final String str, final Object o) throws JSONException {
        if (str != null) {
            if (o != null) {
                if (this.method13277(str) != null) {
                    throw new Class2381("Duplicate key \"" + str + "\"");
                }
                this.method13301(str, o);
            }
        }
        return this;
    }
    
    public Class4405 method13303(final String s, final Object o) throws JSONException {
        if (s != null) {
            if (o != null) {
                this.method13301(s, o);
            }
        }
        return this;
    }
    
    public static String method13304(final String s) {
        final StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                return method13305(s, stringWriter).toString();
            }
            catch (final IOException ex) {
                return "";
            }
        }
    }
    
    public static Writer method13305(final String s, final Writer writer) throws IOException {
        if (s == null || s.length() == 0) {
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
        return this.field19728.remove(s);
    }
    
    public boolean method13307(final Object o) {
        try {
            if (!(o instanceof Class4405)) {
                return false;
            }
            final Set<String> method13273 = this.method13273();
            if (!method13273.equals(((Class4405)o).method13273())) {
                return false;
            }
            for (final String s : method13273) {
                final Object method13274 = this.method13257(s);
                final Object method13275 = ((Class4405)o).method13257(s);
                if (method13274 instanceof Class4405) {
                    if (!((Class4405)method13274).method13307(method13275)) {
                        return false;
                    }
                    continue;
                }
                else if (method13274 instanceof Class88) {
                    if (!((Class88)method13274).method495(method13275)) {
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
            return Class4405.field19729;
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
    
    public static void method13309(final Object o) throws JSONException {
        if (o != null) {
            if (!(o instanceof Double)) {
                if (o instanceof Float) {
                    if (((Float)o).isInfinite() || ((Float)o).isNaN()) {
                        throw new Class2381("JSON does not allow non-finite numbers.");
                    }
                }
            }
            else if (((Double)o).isInfinite() || ((Double)o).isNaN()) {
                throw new Class2381("JSON does not allow non-finite numbers.");
            }
        }
    }
    
    public Class88 method13310(final Class88 class88) throws JSONException {
        if (class88 != null && class88.method462() != 0) {
            final Class88 class89 = new Class88();
            for (int i = 0; i < class88.method462(); ++i) {
                class89.method486(this.method13277(class88.method459(i)));
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
    
    public String toString(final int n) throws JSONException {
        final StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            return this.method13316(stringWriter, n, 0).toString();
        }
    }
    
    public static String method13311(final Object o) throws JSONException {
        if (o == null || o.equals(null)) {
            return "null";
        }
        if (o instanceof Class8369) {
            String method27912;
            try {
                method27912 = ((Class8369)o).method27912();
            }
            catch (final Exception ex) {
                throw new Class2381(ex);
            }
            if (method27912 instanceof String) {
                return method27912;
            }
            throw new Class2381("Bad value from toJSONString: " + (Object)method27912);
        }
        else {
            if (o instanceof Number) {
                return method13276((Number)o);
            }
            if (o instanceof Boolean || o instanceof Class4405 || o instanceof Class88) {
                return o.toString();
            }
            if (o instanceof Map) {
                return new Class4405((Map<?, ?>)o).toString();
            }
            if (o instanceof Collection) {
                return new Class88((Collection<?>)o).toString();
            }
            if (o.getClass().isArray()) {
                return new Class88(o).toString();
            }
            return method13304(o.toString());
        }
    }
    
    public static Object method13312(final Object obj) {
        try {
            if (obj == null) {
                return Class4405.field19729;
            }
            if (obj instanceof Class4405 || obj instanceof Class88 || Class4405.field19729.equals(obj) || obj instanceof Class8369 || obj instanceof Byte || obj instanceof Character || obj instanceof Short || obj instanceof Integer || obj instanceof Long || obj instanceof Boolean || obj instanceof Float || obj instanceof Double || obj instanceof String || obj instanceof BigInteger || obj instanceof BigDecimal) {
                return obj;
            }
            if (obj instanceof Collection) {
                return new Class88((Collection<?>)obj);
            }
            if (obj.getClass().isArray()) {
                return new Class88(obj);
            }
            if (obj instanceof Map) {
                return new Class4405((Map<?, ?>)obj);
            }
            final Package package1 = obj.getClass().getPackage();
            final String s = (package1 != null) ? package1.getName() : "";
            if (s.startsWith("java.") || s.startsWith("javax.") || obj.getClass().getClassLoader() == null) {
                return obj.toString();
            }
            return new Class4405(obj);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public Writer method13313(final Writer writer) throws JSONException {
        return this.method13316(writer, 0, 0);
    }
    
    public static final Writer method13314(final Writer writer, final Object o, final int n, final int n2) throws JSONException, IOException {
        if (o == null || o.equals(null)) {
            writer.write("null");
        }
        else if (o instanceof Class4405) {
            ((Class4405)o).method13316(writer, n, n2);
        }
        else if (o instanceof Class88) {
            ((Class88)o).method498(writer, n, n2);
        }
        else if (o instanceof Map) {
            new Class4405((Map<?, ?>)o).method13316(writer, n, n2);
        }
        else if (o instanceof Collection) {
            new Class88((Collection<?>)o).method498(writer, n, n2);
        }
        else if (o.getClass().isArray()) {
            new Class88(o).method498(writer, n, n2);
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
                throw new Class2381(ex);
            }
            writer.write((method27912 != null) ? method27912.toString() : method13304(o.toString()));
        }
        else {
            method13305(o.toString(), writer);
        }
        return writer;
    }
    
    public static final void method13315(final Writer writer, final int n) throws IOException {
        for (int i = 0; i < n; ++i) {
            writer.write(32);
        }
    }
    
    public Writer method13316(final Writer writer, final int n, final int n2) throws JSONException {
        try {
            int n3 = 0;
            final int method13274 = this.method13274();
            final Iterator<String> method13275 = this.method13272();
            writer.write(123);
            if (method13274 == 1) {
                final String next = method13275.next();
                writer.write(method13304(next.toString()));
                writer.write(58);
                if (n > 0) {
                    writer.write(32);
                }
                method13314(writer, this.field19728.get(next), n, n2);
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
                    writer.write(method13304(next2.toString()));
                    writer.write(58);
                    if (n > 0) {
                        writer.write(32);
                    }
                    method13314(writer, this.field19728.get(next2), n, n4);
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
            throw new Class2381(ex);
        }
    }
    
    static {
        field19729 = new Class6776(null);
    }
}
