// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;
import java.util.Map;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Collection;
import org.json.JSONException;
import java.util.ArrayList;

public class Class88 implements Iterable<Object>
{
    private final ArrayList<Object> field201;
    
    public Class88() {
        this.field201 = new ArrayList<Object>();
    }
    
    public Class88(final Class8826 class8826) throws JSONException {
        this();
        if (class8826.method30788() != '[') {
            throw class8826.method30794("A JSONArray text must start with '['");
        }
        if (class8826.method30788() == ']') {
            return;
        }
        class8826.method30781();
        while (true) {
            if (class8826.method30788() == ',') {
                class8826.method30781();
                this.field201.add(Class4405.field19729);
            }
            else {
                class8826.method30781();
                this.field201.add(class8826.method30792());
            }
            switch (class8826.method30788()) {
                case ',': {
                    if (class8826.method30788() == ']') {
                        return;
                    }
                    class8826.method30781();
                    continue;
                }
                case ']': {
                    return;
                }
                default: {
                    throw class8826.method30794("Expected a ',' or ']'");
                }
            }
        }
    }
    
    public Class88(final String s) throws JSONException {
        this(new Class8826(s));
    }
    
    public Class88(final Collection<?> collection) {
        this.field201 = new ArrayList<Object>();
        if (collection != null) {
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                this.field201.add(Class4405.method13312(iterator.next()));
            }
        }
    }
    
    public Class88(final Object o) throws JSONException {
        this();
        if (!o.getClass().isArray()) {
            throw new Class2381("JSONArray initial value should be a string or collection or array.");
        }
        for (int length = Array.getLength(o), i = 0; i < length; ++i) {
            this.method486(Class4405.method13312(Array.get(o, i)));
        }
    }
    
    @Override
    public Iterator<Object> iterator() {
        return this.field201.iterator();
    }
    
    public Object method449(final int i) throws JSONException {
        final Object method463 = this.method463(i);
        if (method463 != null) {
            return method463;
        }
        throw new Class2381("JSONArray[" + i + "] not found.");
    }
    
    public boolean method450(final int i) throws JSONException {
        final Object method449 = this.method449(i);
        if (method449.equals(Boolean.FALSE) || (method449 instanceof String && ((String)method449).equalsIgnoreCase("false"))) {
            return false;
        }
        if (!method449.equals(Boolean.TRUE) && (!(method449 instanceof String) || !((String)method449).equalsIgnoreCase("true"))) {
            throw new Class2381("JSONArray[" + i + "] is not a boolean.");
        }
        return true;
    }
    
    public double method451(final int i) throws JSONException {
        final Object method449 = this.method449(i);
        try {
            return (method449 instanceof Number) ? ((Number)method449).doubleValue() : Double.parseDouble((String)method449);
        }
        catch (final Exception ex) {
            throw new Class2381("JSONArray[" + i + "] is not a number.");
        }
    }
    
    public <E extends Enum<E>> E method452(final Class<E> clazz, final int i) throws JSONException {
        final Enum method470 = this.method470((Class<Enum>)clazz, i);
        if (method470 != null) {
            return (E)method470;
        }
        throw new Class2381("JSONObject[" + Class4405.method13304(Integer.toString(i)) + "] is not an enum of type " + Class4405.method13304(clazz.getSimpleName()) + ".");
    }
    
    public BigDecimal method453(final int i) throws JSONException {
        final Object method449 = this.method449(i);
        try {
            return new BigDecimal(method449.toString());
        }
        catch (final Exception ex) {
            throw new Class2381("JSONArray[" + i + "] could not convert to BigDecimal.");
        }
    }
    
    public BigInteger method454(final int i) throws JSONException {
        final Object method449 = this.method449(i);
        try {
            return new BigInteger(method449.toString());
        }
        catch (final Exception ex) {
            throw new Class2381("JSONArray[" + i + "] could not convert to BigInteger.");
        }
    }
    
    public int method455(final int i) throws JSONException {
        final Object method449 = this.method449(i);
        try {
            return (method449 instanceof Number) ? ((Number)method449).intValue() : Integer.parseInt((String)method449);
        }
        catch (final Exception ex) {
            throw new Class2381("JSONArray[" + i + "] is not a number.");
        }
    }
    
    public Class88 method456(final int i) throws JSONException {
        final Object method449 = this.method449(i);
        if (!(method449 instanceof Class88)) {
            throw new Class2381("JSONArray[" + i + "] is not a JSONArray.");
        }
        return (Class88)method449;
    }
    
    public Class4405 method457(final int i) throws JSONException {
        final Object method449 = this.method449(i);
        if (!(method449 instanceof Class4405)) {
            throw new Class2381("JSONArray[" + i + "] is not a JSONObject.");
        }
        return (Class4405)method449;
    }
    
    public long method458(final int i) throws JSONException {
        final Object method449 = this.method449(i);
        try {
            return (method449 instanceof Number) ? ((Number)method449).longValue() : Long.parseLong((String)method449);
        }
        catch (final Exception ex) {
            throw new Class2381("JSONArray[" + i + "] is not a number.");
        }
    }
    
    public String method459(final int i) throws JSONException {
        final Object method449 = this.method449(i);
        if (!(method449 instanceof String)) {
            throw new Class2381("JSONArray[" + i + "] not a string.");
        }
        return (String)method449;
    }
    
    public boolean method460(final int n) {
        return Class4405.field19729.equals(this.method463(n));
    }
    
    public String method461(final String str) throws JSONException {
        final int method462 = this.method462();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < method462; ++i) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(Class4405.method13311(this.field201.get(i)));
        }
        return sb.toString();
    }
    
    public int method462() {
        return this.field201.size();
    }
    
    public Object method463(final int index) {
        return (index >= 0 && index < this.method462()) ? this.field201.get(index) : null;
    }
    
    public boolean method464(final int n) {
        return this.method465(n, false);
    }
    
    public boolean method465(final int n, final boolean b) {
        try {
            return this.method450(n);
        }
        catch (final Exception ex) {
            return b;
        }
    }
    
    public double method466(final int n) {
        return this.method467(n, Double.NaN);
    }
    
    public double method467(final int n, final double n2) {
        try {
            return this.method451(n);
        }
        catch (final Exception ex) {
            return n2;
        }
    }
    
    public int method468(final int n) {
        return this.method469(n, 0);
    }
    
    public int method469(final int n, final int n2) {
        try {
            return this.method455(n);
        }
        catch (final Exception ex) {
            return n2;
        }
    }
    
    public <E extends Enum<E>> E method470(final Class<E> clazz, final int n) {
        return this.method471(clazz, n, (E)null);
    }
    
    public <E extends Enum<E>> E method471(final Class<E> enumClass, final int n, final E e) {
        try {
            final Object method463 = this.method463(n);
            if (Class4405.field19729.equals(method463)) {
                return e;
            }
            if (enumClass.isAssignableFrom(((Enum<E>)method463).getClass())) {
                return (E)method463;
            }
            return Enum.valueOf(enumClass, method463.toString());
        }
        catch (final IllegalArgumentException | NullPointerException ex) {
            return e;
        }
    }
    
    public BigInteger method472(final int n, final BigInteger bigInteger) {
        try {
            return this.method454(n);
        }
        catch (final Exception ex) {
            return bigInteger;
        }
    }
    
    public BigDecimal method473(final int n, final BigDecimal bigDecimal) {
        try {
            return this.method453(n);
        }
        catch (final Exception ex) {
            return bigDecimal;
        }
    }
    
    public Class88 method474(final int n) {
        final Object method463 = this.method463(n);
        return (method463 instanceof Class88) ? ((Class88)method463) : null;
    }
    
    public Class4405 method475(final int n) {
        final Object method463 = this.method463(n);
        return (method463 instanceof Class4405) ? ((Class4405)method463) : null;
    }
    
    public long method476(final int n) {
        return this.method477(n, 0L);
    }
    
    public long method477(final int n, final long n2) {
        try {
            return this.method458(n);
        }
        catch (final Exception ex) {
            return n2;
        }
    }
    
    public String method478(final int n) {
        return this.method479(n, "");
    }
    
    public String method479(final int n, final String s) {
        final Object method463 = this.method463(n);
        return Class4405.field19729.equals(method463) ? s : method463.toString();
    }
    
    public Class88 method480(final boolean b) {
        this.method486(b ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }
    
    public Class88 method481(final Collection<?> collection) {
        this.method486(new Class88(collection));
        return this;
    }
    
    public Class88 method482(final double value) throws JSONException {
        final Double n = new Double(value);
        Class4405.method13309(n);
        this.method486(n);
        return this;
    }
    
    public Class88 method483(final int value) {
        this.method486(new Integer(value));
        return this;
    }
    
    public Class88 method484(final long value) {
        this.method486(new Long(value));
        return this;
    }
    
    public Class88 method485(final Map<?, ?> map) {
        this.method486(new Class4405(map));
        return this;
    }
    
    public Class88 method486(final Object e) {
        this.field201.add(e);
        return this;
    }
    
    public Class88 method487(final int n, final boolean b) throws JSONException {
        this.method493(n, b ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }
    
    public Class88 method488(final int n, final Collection<?> collection) throws JSONException {
        this.method493(n, new Class88(collection));
        return this;
    }
    
    public Class88 method489(final int n, final double value) throws JSONException {
        this.method493(n, new Double(value));
        return this;
    }
    
    public Class88 method490(final int n, final int value) throws JSONException {
        this.method493(n, new Integer(value));
        return this;
    }
    
    public Class88 method491(final int n, final long value) throws JSONException {
        this.method493(n, new Long(value));
        return this;
    }
    
    public Class88 method492(final int n, final Map<?, ?> map) throws JSONException {
        this.method493(n, new Class4405(map));
        return this;
    }
    
    public Class88 method493(final int i, final Object element) throws JSONException {
        Class4405.method13309(element);
        if (i >= 0) {
            if (i >= this.method462()) {
                while (i != this.method462()) {
                    this.method486(Class4405.field19729);
                }
                this.method486(element);
            }
            else {
                this.field201.set(i, element);
            }
            return this;
        }
        throw new Class2381("JSONArray[" + i + "] not found.");
    }
    
    public Object method494(final int index) {
        return (index >= 0 && index < this.method462()) ? this.field201.remove(index) : null;
    }
    
    public boolean method495(final Object o) {
        if (!(o instanceof Class88)) {
            return false;
        }
        final int method462 = this.method462();
        if (method462 == ((Class88)o).method462()) {
            for (int i = 0; i < method462; ++i) {
                final Object method463 = this.method449(i);
                final Object method464 = ((Class88)o).method449(i);
                if (!(method463 instanceof Class4405)) {
                    if (!(method463 instanceof Class88)) {
                        if (!method463.equals(method464)) {
                            return false;
                        }
                    }
                    else if (!((Class88)method463).method495(method464)) {
                        return false;
                    }
                }
                else if (!((Class4405)method463).method13307(method464)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public Class4405 method496(final Class88 class88) throws JSONException {
        if (class88 != null) {
            if (class88.method462() != 0) {
                if (this.method462() != 0) {
                    final Class4405 class89 = new Class4405();
                    for (int i = 0; i < class88.method462(); ++i) {
                        class89.method13301(class88.method459(i), this.method463(i));
                    }
                    return class89;
                }
            }
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
            return this.method498(stringWriter, n, 0).toString();
        }
    }
    
    public Writer method497(final Writer writer) throws JSONException {
        return this.method498(writer, 0, 0);
    }
    
    public Writer method498(final Writer writer, final int n, final int n2) throws JSONException {
        try {
            int n3 = 0;
            final int method462 = this.method462();
            writer.write(91);
            if (method462 == 1) {
                Class4405.method13314(writer, this.field201.get(0), n, n2);
            }
            else if (method462 != 0) {
                final int n4 = n2 + n;
                for (int i = 0; i < method462; ++i) {
                    if (n3 != 0) {
                        writer.write(44);
                    }
                    if (n > 0) {
                        writer.write(10);
                    }
                    Class4405.method13315(writer, n4);
                    Class4405.method13314(writer, this.field201.get(i), n, n4);
                    n3 = 1;
                }
                if (n > 0) {
                    writer.write(10);
                }
                Class4405.method13315(writer, n2);
            }
            writer.write(93);
            return writer;
        }
        catch (final IOException ex) {
            throw new Class2381(ex);
        }
    }
}
