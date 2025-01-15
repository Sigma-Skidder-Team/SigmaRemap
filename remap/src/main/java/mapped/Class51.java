// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.common.base.Strings;
import java.io.DataInput;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import java.util.Set;
import java.io.IOException;
import java.util.Iterator;
import java.io.DataOutput;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;

public class Class51 implements Class41
{
    private static final Logger field124;
    private static final Pattern field125;
    public static final Class6068<Class51> field126;
    private final Map<String, Class41> field127;
    
    private Class51(final Map<String, Class41> field127) {
        this.field127 = field127;
    }
    
    public Class51() {
        this(Maps.newHashMap());
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        for (final String s : this.field127.keySet()) {
            method334(s, this.field127.get(s), dataOutput);
        }
        dataOutput.writeByte(0);
    }
    
    public Set<String> method293() {
        return this.field127.keySet();
    }
    
    @Override
    public byte method260() {
        return 10;
    }
    
    @Override
    public Class6068<Class51> method261() {
        return Class51.field126;
    }
    
    public int method294() {
        return this.field127.size();
    }
    
    @Nullable
    public Class41 method295(final String s, final Class41 class41) {
        return this.field127.put(s, class41);
    }
    
    public void method296(final String s, final byte b) {
        this.field127.put(s, Class47.method283(b));
    }
    
    public void method297(final String s, final short n) {
        this.field127.put(s, Class48.method286(n));
    }
    
    public void method298(final String s, final int n) {
        this.field127.put(s, Class45.method279(n));
    }
    
    public void method299(final String s, final long n) {
        this.field127.put(s, Class49.method288(n));
    }
    
    public void method300(final String s, final UUID uuid) {
        this.method299(s + "Most", uuid.getMostSignificantBits());
        this.method299(s + "Least", uuid.getLeastSignificantBits());
    }
    
    public UUID method301(final String s) {
        return new UUID(this.method320(s + "Most"), this.method320(s + "Least"));
    }
    
    public boolean method302(final String s) {
        return this.method316(s + "Most", 99) && this.method316(s + "Least", 99);
    }
    
    public void method303(final String s) {
        this.method330(s + "Most");
        this.method330(s + "Least");
    }
    
    public void method304(final String s, final float n) {
        this.field127.put(s, Class46.method281(n));
    }
    
    public void method305(final String s, final double n) {
        this.field127.put(s, Class44.method277(n));
    }
    
    public void method306(final String s, final String s2) {
        this.field127.put(s, Class50.method290(s2));
    }
    
    public void method307(final String s, final byte[] array) {
        this.field127.put(s, new Class40(array));
    }
    
    public void method308(final String s, final int[] array) {
        this.field127.put(s, new Class53(array));
    }
    
    public void method309(final String s, final List<Integer> list) {
        this.field127.put(s, new Class53(list));
    }
    
    public void method310(final String s, final long[] array) {
        this.field127.put(s, new Class39(array));
    }
    
    public void method311(final String s, final List<Long> list) {
        this.field127.put(s, new Class39(list));
    }
    
    public void method312(final String s, final boolean b) {
        this.field127.put(s, Class47.method284(b));
    }
    
    @Nullable
    public Class41 method313(final String s) {
        return this.field127.get(s);
    }
    
    public byte method314(final String s) {
        final Class41 class41 = this.field127.get(s);
        return (byte)((class41 != null) ? class41.method260() : 0);
    }
    
    public boolean method315(final String s) {
        return this.field127.containsKey(s);
    }
    
    public boolean method316(final String s, final int n) {
        final byte method314 = this.method314(s);
        if (method314 == n) {
            return true;
        }
        if (n == 99) {
            if (method314 != 1) {
                if (method314 != 2) {
                    if (method314 != 3) {
                        if (method314 != 4) {
                            if (method314 != 5) {
                                if (method314 != 6) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public byte method317(final String s) {
        try {
            if (this.method316(s, 99)) {
                return this.field127.get(s).method273();
            }
        }
        catch (final ClassCastException ex) {}
        return 0;
    }
    
    public short method318(final String s) {
        try {
            if (this.method316(s, 99)) {
                return this.field127.get(s).method272();
            }
        }
        catch (final ClassCastException ex) {}
        return 0;
    }
    
    public int method319(final String s) {
        try {
            if (this.method316(s, 99)) {
                return this.field127.get(s).method271();
            }
        }
        catch (final ClassCastException ex) {}
        return 0;
    }
    
    public long method320(final String s) {
        try {
            if (this.method316(s, 99)) {
                return this.field127.get(s).method270();
            }
        }
        catch (final ClassCastException ex) {}
        return 0L;
    }
    
    public float method321(final String s) {
        try {
            if (this.method316(s, 99)) {
                return this.field127.get(s).method275();
            }
        }
        catch (final ClassCastException ex) {}
        return 0.0f;
    }
    
    public double method322(final String s) {
        try {
            if (this.method316(s, 99)) {
                return this.field127.get(s).method274();
            }
        }
        catch (final ClassCastException ex) {}
        return 0.0;
    }
    
    public String method323(final String s) {
        try {
            if (this.method316(s, 8)) {
                return this.field127.get(s).method267();
            }
        }
        catch (final ClassCastException ex) {}
        return "";
    }
    
    public byte[] method324(final String s) {
        try {
            if (this.method316(s, 7)) {
                return this.field127.get(s).method266();
            }
        }
        catch (final ClassCastException ex) {
            throw new Class2365(this.method332(s, Class40.field96, ex));
        }
        return new byte[0];
    }
    
    public int[] method325(final String s) {
        try {
            if (this.method316(s, 11)) {
                return this.field127.get(s).method358();
            }
        }
        catch (final ClassCastException ex) {
            throw new Class2365(this.method332(s, Class53.field132, ex));
        }
        return new int[0];
    }
    
    public long[] method326(final String s) {
        try {
            if (this.method316(s, 12)) {
                return this.field127.get(s).method264();
            }
        }
        catch (final ClassCastException ex) {
            throw new Class2365(this.method332(s, Class39.field94, ex));
        }
        return new long[0];
    }
    
    public Class51 method327(final String s) {
        try {
            if (this.method316(s, 10)) {
                return this.field127.get(s);
            }
        }
        catch (final ClassCastException ex) {
            throw new Class2365(this.method332(s, Class51.field126, ex));
        }
        return new Class51();
    }
    
    public Class52 method328(final String s, final int n) {
        try {
            if (this.method314(s) == 9) {
                final Class52 class52 = this.field127.get(s);
                if (!class52.isEmpty() && class52.method356() != n) {
                    return new Class52();
                }
                return class52;
            }
        }
        catch (final ClassCastException ex) {
            throw new Class2365(this.method332(s, Class52.field128, ex));
        }
        return new Class52();
    }
    
    public boolean method329(final String s) {
        return this.method317(s) != 0;
    }
    
    public void method330(final String s) {
        this.field127.remove(s);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        Set<String> keySet = this.field127.keySet();
        if (Class51.field124.isDebugEnabled()) {
            final ArrayList arrayList = Lists.newArrayList((Iterable)this.field127.keySet());
            Collections.sort((List<Comparable>)arrayList);
            keySet = (Set<String>)arrayList;
        }
        for (final String s : keySet) {
            if (sb.length() != 1) {
                sb.append(',');
            }
            sb.append(method339(s)).append(':').append(this.field127.get(s));
        }
        return sb.append('}').toString();
    }
    
    public boolean method331() {
        return this.field127.isEmpty();
    }
    
    private Class7689 method332(final String s, final Class6068<?> class6068, final ClassCastException ex) {
        final Class7689 method24421 = Class7689.method24421(ex, "Reading NBT data");
        final Class5204 method24422 = method24421.method24419("Corrupt NBT tag", 1);
        method24422.method16296("Tag type found", () -> this.field127.get(s2).method261().method18120());
        method24422.method16296("Tag type expected", class6068::method18120);
        method24422.method16297("Tag name", s);
        return method24421;
    }
    
    public Class51 method333() {
        return new Class51(Maps.newHashMap(Maps.transformValues((Map)this.field127, Class41::method265)));
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class51 && Objects.equals(this.field127, ((Class51)o).field127));
    }
    
    @Override
    public int hashCode() {
        return this.field127.hashCode();
    }
    
    private static void method334(final String s, final Class41 class41, final DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(class41.method260());
        if (class41.method260() != 0) {
            dataOutput.writeUTF(s);
            class41.method259(dataOutput);
        }
    }
    
    private static byte method335(final DataInput dataInput, final Class7553 class7553) throws IOException {
        return dataInput.readByte();
    }
    
    private static String method336(final DataInput dataInput, final Class7553 class7553) throws IOException {
        return dataInput.readUTF();
    }
    
    private static Class41 method337(final Class6068<?> class6068, final String s, final DataInput dataInput, final int n, final Class7553 class6069) {
        try {
            return class6068.method18123(dataInput, n, class6069);
        }
        catch (final IOException ex) {
            final Class7689 method24421 = Class7689.method24421(ex, "Loading NBT data");
            final Class5204 method24422 = method24421.method24418("NBT Tag");
            method24422.method16297("Tag name", s);
            method24422.method16297("Tag type", class6068.method18120());
            throw new Class2365(method24421);
        }
    }
    
    public Class51 method338(final Class51 class51) {
        for (final String s : class51.field127.keySet()) {
            final Class41 class52 = class51.field127.get(s);
            if (class52.method260() != 10) {
                this.method295(s, class52.method265());
            }
            else if (!this.method316(s, 10)) {
                this.method295(s, class52.method265());
            }
            else {
                this.method327(s).method338((Class51)class52);
            }
        }
        return this;
    }
    
    public static String method339(final String input) {
        return Class51.field125.matcher(input).matches() ? input : Class50.method292(input);
    }
    
    public static Class2250 method340(final String input) {
        if (!Class51.field125.matcher(input).matches()) {
            final String method292 = Class50.method292(input);
            final String substring = method292.substring(0, 1);
            return new Class2260(substring).method8458(new Class2260(method292.substring(1, method292.length() - 1)).method8469(Class51.field98)).method8457(substring);
        }
        return new Class2260(input).method8469(Class51.field98);
    }
    
    @Override
    public Class2250 method263(final String s, final int n) {
        if (!this.field127.isEmpty()) {
            final Class2260 class2260 = new Class2260("{");
            Set<String> keySet = this.field127.keySet();
            if (Class51.field124.isDebugEnabled()) {
                final ArrayList arrayList = Lists.newArrayList((Iterable)this.field127.keySet());
                Collections.sort((List<Comparable>)arrayList);
                keySet = (Set<String>)arrayList;
            }
            if (!s.isEmpty()) {
                class2260.method8457("\n");
            }
            final Iterator<Object> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                final String s2 = iterator.next();
                final Class2250 method8458 = new Class2260(Strings.repeat(s, n + 1)).method8458(method340(s2)).method8457(String.valueOf(':')).method8457(" ").method8458(this.field127.get(s2).method263(s, n + 1));
                if (iterator.hasNext()) {
                    method8458.method8457(String.valueOf(',')).method8457(s.isEmpty() ? " " : "\n");
                }
                class2260.method8458(method8458);
            }
            if (!s.isEmpty()) {
                class2260.method8457("\n").method8457(Strings.repeat(s, n));
            }
            class2260.method8457("}");
            return class2260;
        }
        return new Class2260("{}");
    }
    
    static {
        field124 = LogManager.getLogger();
        field125 = Pattern.compile("[A-Za-z0-9._+-]+");
        field126 = new Class6073();
    }
}
