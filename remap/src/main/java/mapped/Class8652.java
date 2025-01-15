// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.TreeSet;
import java.lang.reflect.Array;
import java.util.EnumSet;
import com.google.common.collect.Lists;
import net.minecraft.util.Direction;
import net.minecraft.util.IStringSerializable;

import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;

public class Class8652
{
    private String field36317;
    public static final Class9449[] field36318;
    public static final Class181[] field36319;
    private static Map<Class1932, Class3090> field36320;
    private static final Class6786<Enum> field36321;
    private static final Class6786<Class181> field36322;
    
    public Class8652(final String field36317) {
        this.field36317 = null;
        this.field36317 = field36317;
    }
    
    public String method29440(final String s) {
        String s2 = s;
        final int lastIndex = s.lastIndexOf(47);
        if (lastIndex >= 0) {
            s2 = s.substring(lastIndex + 1);
        }
        final int lastIndex2 = s2.lastIndexOf(46);
        if (lastIndex2 >= 0) {
            s2 = s2.substring(0, lastIndex2);
        }
        return s2;
    }
    
    public String method29441(final String s) {
        final int lastIndex = s.lastIndexOf(47);
        return (lastIndex >= 0) ? s.substring(0, lastIndex) : "";
    }
    
    public Class8802[] method29442(final String s) {
        if (s != null) {
            final ArrayList list = new ArrayList();
            final String[] method28937 = Class8571.method28937(s, " ");
            for (int i = 0; i < method28937.length; ++i) {
                final Class8802[] method28938 = this.method29444(method28937[i]);
                if (method28938 != null) {
                    list.addAll(Arrays.asList(method28938));
                }
            }
            return (Class8802[])list.toArray(new Class8802[list.size()]);
        }
        return null;
    }
    
    public Class7096 method29443(final String s, final Class7096 class7096) {
        final Class8802[] method29444 = this.method29444(s);
        if (method29444 == null) {
            return class7096;
        }
        if (method29444.length == 1) {
            return Class90.field208.method499(method29444[0].method30709()).method11878();
        }
        return class7096;
    }
    
    public Class8802[] method29444(String trim) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        if (trim.length() <= 0) {
            return null;
        }
        final String[] method28937 = Class8571.method28937(trim, ":");
        String s;
        int n;
        if (method28937.length > 1 && this.method29445(method28937)) {
            s = method28937[0];
            n = 1;
        }
        else {
            s = "minecraft";
            n = 0;
        }
        final String s2 = method28937[n];
        final String[] array = Arrays.copyOfRange(method28937, n + 1, method28937.length);
        final Class3833[] method28938 = this.method29447(s, s2);
        if (method28938 != null) {
            final Class8802[] array2 = new Class8802[method28938.length];
            for (int i = 0; i < method28938.length; ++i) {
                final Class3833 class3833 = method28938[i];
                final int method28939 = Class90.field208.method504(class3833);
                int[] method28940 = null;
                if (array.length > 0) {
                    method28940 = this.method29448(class3833, array);
                    if (method28940 == null) {
                        return null;
                    }
                }
                array2[i] = new Class8802(method28939, method28940);
            }
            return array2;
        }
        return null;
    }
    
    public boolean method29445(final String[] array) {
        if (array.length > 1) {
            final String s = array[1];
            return s.length() >= 1 && !s.contains("=");
        }
        return false;
    }
    
    public boolean method29446(final String s) {
        return s != null && s.length() >= 1 && Character.isDigit(s.charAt(0));
    }
    
    public Class3833[] method29447(final String str, final String str2) {
        final String string = str + ":" + str2;
        final Class3833 method20650 = Class6770.method20650(new Class1932(string));
        if (method20650 != null) {
            return new Class3833[] { method20650 };
        }
        this.method29461("Block not found for name: " + string);
        return null;
    }
    
    public int[] method29448(final Class3833 class3833, final String[] array) {
        if (array.length <= 0) {
            return null;
        }
        final Collection<Class7111<?>> method21770 = class3833.method11878().method21770();
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < array.length; ++i) {
            final String str = array[i];
            if (str.length() > 0) {
                final String[] method21771 = Class8571.method28937(str, "=");
                if (method21771.length != 2) {
                    this.method29461("Invalid block property: " + str);
                    return null;
                }
                final String s = method21771[0];
                final String s2 = method21771[1];
                final Class7111 method21772 = Class6779.method20704(s, (Collection<Class7111>)method21770);
                if (method21772 == null) {
                    this.method29461("Property not found: " + s + ", block: " + class3833);
                    return null;
                }
                Object o = hashMap.get(s);
                if (o == null) {
                    o = new ArrayList<Comparable>();
                    hashMap.put(method21772, o);
                }
                final String[] method21773 = Class8571.method28937(s2, ",");
                for (int j = 0; j < method21773.length; ++j) {
                    final String str2 = method21773[j];
                    final Comparable method21774 = method29449(method21772, str2);
                    if (method21774 == null) {
                        this.method29461("Property value not found: " + str2 + ", property: " + s + ", block: " + class3833);
                        return null;
                    }
                    ((List<Comparable>)o).add(method21774);
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        final ArrayList list = new ArrayList();
        final int method21775 = Class6770.method20652(class3833);
        for (int k = 0; k < method21775; ++k) {
            try {
                if (this.method29453(Class6770.method20653(class3833, k), hashMap)) {
                    list.add(k);
                }
            }
            catch (final IllegalArgumentException ex) {}
        }
        if (list.size() == method21775) {
            return null;
        }
        final int[] array2 = new int[list.size()];
        for (int l = 0; l < array2.length; ++l) {
            array2[l] = (int)list.get(l);
        }
        return array2;
    }
    
    public static Comparable method29449(final Class7111 class7111, final String s) {
        Comparable comparable = method29452(s, class7111.method21827());
        if (comparable == null) {
            comparable = method29450(s, class7111.method21829());
        }
        return comparable;
    }
    
    public static Comparable method29450(final String obj, final Collection<Comparable> collection) {
        for (final Comparable comparable : collection) {
            if (!method29451(comparable).equals(obj)) {
                continue;
            }
            return comparable;
        }
        return null;
    }
    
    private static Object method29451(final Comparable comparable) {
        if (!(comparable instanceof IStringSerializable)) {
            return comparable.toString();
        }
        return ((IStringSerializable)comparable).getName();
    }
    
    public static Comparable method29452(final String s, final Class clazz) {
        if (clazz == String.class) {
            return s;
        }
        if (clazz == Boolean.class) {
            return Boolean.valueOf(s);
        }
        if (clazz == Float.class) {
            return Float.valueOf(s);
        }
        if (clazz == Double.class) {
            return Double.valueOf(s);
        }
        if (clazz != Integer.class) {
            return (clazz != Long.class) ? null : Long.valueOf(s);
        }
        return Integer.valueOf(s);
    }
    
    public boolean method29453(final Class7096 class7096, final Map<Class7111, List<Comparable>> map) {
        for (final Class7111 class7097 : map.keySet()) {
            final List list = map.get(class7097);
            final Comparable method21772 = class7096.method21772((Class7111<Comparable>)class7097);
            if (method21772 == null) {
                return false;
            }
            if (list.contains(method21772)) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public Class3090[] method29454(String s) {
        if (s != null) {
            s = s.trim();
            boolean b = false;
            if (s.startsWith("!")) {
                b = true;
                s = s.substring(1);
            }
            final String[] method28937 = Class8571.method28937(s, " ");
            ArrayList list = new ArrayList();
            for (int i = 0; i < method28937.length; ++i) {
                final String str = method28937[i];
                final Class3090 method28938 = this.method29455(str);
                if (method28938 != null) {
                    list.add(method28938);
                }
                else {
                    this.method29461("Biome not found: " + str);
                }
            }
            if (b) {
                final ArrayList arrayList = Lists.newArrayList((Iterator)Class90.field217.iterator());
                arrayList.removeAll(list);
                list = arrayList;
            }
            return (Class3090[])list.toArray(new Class3090[list.size()]);
        }
        return null;
    }
    
    public Class3090 method29455(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        final Class3090 method26042 = Class7984.method26042(new Class1932(lowerCase));
        if (method26042 == null) {
            final Class1932 class1932 = new Class1932(lowerCase.replace(" ", "").replace("_", ""));
            if (Class8652.field36320 == null) {
                Class8652.field36320 = new HashMap<Class1932, Class3090>();
                for (final Class1932 class1933 : Class7984.method26044()) {
                    Class8652.field36320.put(new Class1932(class1933.method7798(), class1933.method7797().replace(" ", "").replace("_", "").toLowerCase()), Class7984.method26042(class1933));
                }
            }
            final Class3090 class1934 = Class8652.field36320.get(class1932);
            return (class1934 == null) ? null : class1934;
        }
        return method26042;
    }
    
    public int method29456(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        final int method28933 = Class8571.method28933(trim, -1);
        if (method28933 >= 0) {
            return method28933;
        }
        this.method29461("Invalid number: " + trim);
        return n;
    }
    
    public int[] method29457(final String str) {
        if (str != null) {
            final ArrayList list = new ArrayList();
            final String[] method28937 = Class8571.method28937(str, " ,");
            for (int i = 0; i < method28937.length; ++i) {
                final String str2 = method28937[i];
                if (!str2.contains("-")) {
                    final int method28938 = Class8571.method28933(str2, -1);
                    if (method28938 >= 0) {
                        list.add(method28938);
                    }
                    else {
                        this.method29461("Invalid number: " + str2 + ", when parsing: " + str);
                    }
                }
                else {
                    final String[] method28939 = Class8571.method28937(str2, "-");
                    Label_0281: {
                        if (method28939.length == 2) {
                            final int method28940 = Class8571.method28933(method28939[0], -1);
                            final int method28941 = Class8571.method28933(method28939[1], -1);
                            if (method28940 >= 0) {
                                if (method28941 >= 0) {
                                    if (method28940 <= method28941) {
                                        for (int j = method28940; j <= method28941; ++j) {
                                            list.add(j);
                                        }
                                        break Label_0281;
                                    }
                                }
                            }
                            this.method29461("Invalid interval: " + str2 + ", when parsing: " + str);
                        }
                        else {
                            this.method29461("Invalid interval: " + str2 + ", when parsing: " + str);
                        }
                    }
                }
            }
            final int[] array = new int[list.size()];
            for (int k = 0; k < array.length; ++k) {
                array[k] = (int)list.get(k);
            }
            return array;
        }
        return null;
    }
    
    public boolean[] method29458(final String s, final boolean[] array) {
        if (s != null) {
            final EnumSet<Direction> all = EnumSet.allOf(Direction.class);
            final String[] method28937 = Class8571.method28937(s, " ,");
            for (int i = 0; i < method28937.length; ++i) {
                final String s2 = method28937[i];
                if (!s2.equals("sides")) {
                    if (!s2.equals("all")) {
                        final Direction method28938 = this.method29459(s2);
                        if (method28938 != null) {
                            all.add((Object)method28938);
                        }
                    }
                    else {
                        all.addAll((Collection<?>)Arrays.asList(Direction.VALUES));
                    }
                }
                else {
                    all.add((Object) Direction.NORTH);
                    all.add((Object) Direction.SOUTH);
                    all.add((Object) Direction.WEST);
                    all.add((Object) Direction.EAST);
                }
            }
            final boolean[] array2 = new boolean[Direction.VALUES.length];
            for (int j = 0; j < array2.length; ++j) {
                array2[j] = all.contains(Direction.VALUES[j]);
            }
            return array2;
        }
        return array;
    }
    
    public Direction method29459(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.equals("bottom") || lowerCase.equals("down")) {
            return Direction.DOWN;
        }
        if (lowerCase.equals("top") || lowerCase.equals("up")) {
            return Direction.UP;
        }
        if (lowerCase.equals("north")) {
            return Direction.NORTH;
        }
        if (lowerCase.equals("south")) {
            return Direction.SOUTH;
        }
        if (lowerCase.equals("east")) {
            return Direction.EAST;
        }
        if (!lowerCase.equals("west")) {
            Class8571.method28848("Unknown face: " + lowerCase);
            return null;
        }
        return Direction.WEST;
    }
    
    public void method29460(final String str) {
        Class8571.method28847("" + this.field36317 + ": " + str);
    }
    
    public void method29461(final String str) {
        Class8571.method28848("" + this.field36317 + ": " + str);
    }
    
    public Class7740 method29462(final String s) {
        if (s != null) {
            final Class7740 class7740 = new Class7740();
            final String[] method28937 = Class8571.method28937(s, " ,");
            for (int i = 0; i < method28937.length; ++i) {
                final Class7356 method28938 = this.method29463(method28937[i]);
                if (method28938 == null) {
                    return null;
                }
                class7740.method24696(method28938);
            }
            return class7740;
        }
        return null;
    }
    
    private Class7356 method29463(final String str) {
        if (str == null) {
            return null;
        }
        if (str.indexOf(45) < 0) {
            final int method28933 = Class8571.method28933(str, -1);
            if (method28933 >= 0) {
                return new Class7356(method28933, method28933);
            }
            this.method29461("Invalid integer: " + str);
            return null;
        }
        else {
            final String[] method28934 = Class8571.method28937(str, "-");
            if (method28934.length != 2) {
                this.method29461("Invalid range: " + str);
                return null;
            }
            final int method28935 = Class8571.method28933(method28934[0], -1);
            final int method28936 = Class8571.method28933(method28934[1], -1);
            if (method28935 >= 0 && method28936 >= 0) {
                return new Class7356(method28935, method28936);
            }
            this.method29461("Invalid range: " + str);
            return null;
        }
    }
    
    public boolean method29464(final String str, final boolean b) {
        if (str == null) {
            return b;
        }
        final String trim = str.toLowerCase().trim();
        if (trim.equals("true")) {
            return true;
        }
        if (!trim.equals("false")) {
            this.method29461("Invalid boolean: " + str);
            return b;
        }
        return false;
    }
    
    public Boolean method29465(final String str) {
        if (str == null) {
            return null;
        }
        final String trim = str.toLowerCase().trim();
        if (trim.equals("true")) {
            return Boolean.TRUE;
        }
        if (!trim.equals("false")) {
            this.method29461("Invalid boolean: " + str);
            return null;
        }
        return Boolean.FALSE;
    }
    
    public static int method29466(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        try {
            return Integer.parseInt(trim, 16) & 0xFFFFFF;
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public static int method29467(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        try {
            return (int)(Long.parseLong(trim, 16) & -1L);
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public Class6332 method29468(String trim, final Class6332 class6332) {
        if (trim != null) {
            trim = trim.toLowerCase().trim();
            final Class6332[] field25344 = Class6332.field25344;
            for (int i = 0; i < field25344.length; ++i) {
                final Class6332 class6333 = field25344[i];
                if (trim.equals(class6333.method18712().toLowerCase())) {
                    return class6333;
                }
            }
            return class6332;
        }
        return class6332;
    }
    
    public <T> T method29469(final String str, final T[] array, final Class6786 class6786, final String str2) {
        if (str != null) {
            final String trim = str.toLowerCase().trim();
            for (int i = 0; i < array.length; ++i) {
                final T t = array[i];
                final String method20744 = class6786.method20744(t);
                if (method20744 != null && method20744.toLowerCase().equals(trim)) {
                    return t;
                }
            }
            this.method29461("Invalid " + str2 + ": " + str);
            return null;
        }
        return null;
    }
    
    public <T> T[] method29470(String trim, final T[] array, final Class6786 class6786, final String s, final T[] array2) {
        if (trim != null) {
            trim = trim.toLowerCase().trim();
            final String[] method28937 = Class8571.method28937(trim, " ");
            final Object[] array3 = (Object[])Array.newInstance(array.getClass().getComponentType(), method28937.length);
            for (int i = 0; i < method28937.length; ++i) {
                final T method28938 = this.method29469(method28937[i], array, class6786, s);
                if (method28938 == null) {
                    return array2;
                }
                array3[i] = method28938;
            }
            return (T[])array3;
        }
        return null;
    }
    
    public Enum method29471(final String s, final Enum[] array, final String s2) {
        return this.method29469(s, array, Class8652.field36321, s2);
    }
    
    public Enum[] method29472(final String s, final Enum[] array, final String s2, final Enum[] array2) {
        return this.method29470(s, array, Class8652.field36321, s2, array2);
    }
    
    public Class181[] method29473(final String s, final String s2, final Class181[] array) {
        return this.method29470(s, Class181.values(), Class8652.field36322, s2, array);
    }
    
    public Class2185[] method29474(final String s, final String s2, final Class2185[] array) {
        return this.method29470(s, Class2185.values(), Class8652.field36321, s2, array);
    }
    
    public Class8998 method29475(final String s, final String s2) {
        return (s != null && s2 != null) ? new Class8998(s, s2) : null;
    }
    
    public Class9449[] method29476(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        final String[] method28937 = Class8571.method28937(s, " ");
        for (int i = 0; i < method28937.length; ++i) {
            final String str = method28937[i];
            final Class9449 method28938 = this.method29477(str);
            if (method28938 == null) {
                this.method29461("Invalid profession: " + str);
                return Class8652.field36318;
            }
            list.add(method28938);
        }
        if (!list.isEmpty()) {
            return (Class9449[])list.toArray(new Class9449[list.size()]);
        }
        return null;
    }
    
    private Class9449 method29477(final String s) {
        String s2 = s;
        String s3 = null;
        final int lastIndex = s.lastIndexOf(58);
        if (lastIndex >= 0) {
            final String substring = s.substring(0, lastIndex);
            final String substring2 = s.substring(lastIndex + 1);
            if (substring2.isEmpty() || substring2.matches("[0-9].*")) {
                s2 = substring;
                s3 = substring2;
            }
        }
        final Class9334 method29478 = this.method29478(s2);
        if (method29478 != null) {
            return new Class9449(method29478, this.method29457(s3));
        }
        return null;
    }
    
    private Class9334 method29478(String lowerCase) {
        if (lowerCase != null) {
            lowerCase = lowerCase.toLowerCase();
            final Class1932 class1932 = new Class1932(lowerCase);
            final Class93<Class9334> field240 = Class90.field240;
            return field240.method510(class1932) ? ((Class9334)field240.method505(class1932)) : null;
        }
        return null;
    }
    
    public int[] method29479(String trim) {
        trim = trim.trim();
        final TreeSet set = new TreeSet();
        final String[] method28937 = Class8571.method28937(trim, " ");
        for (int i = 0; i < method28937.length; ++i) {
            final String s = method28937[i];
            final Class3820 method28938 = Class8333.method27771(new Class1932(s));
            if (method28938 != null) {
                final int method28939 = Class8333.method27772(method28938);
                if (method28939 >= 0) {
                    set.add(new Integer(method28939));
                }
                else {
                    this.method29461("Item has no ID: " + method28938 + ", name: " + s);
                }
            }
            else {
                this.method29461("Item not found: " + s);
            }
        }
        return Class8571.method29008((Integer[])set.toArray(new Integer[set.size()]));
    }
    
    public int[] method29480(String trim) {
        trim = trim.trim();
        final TreeSet set = new TreeSet();
        final String[] method28937 = Class8571.method28937(trim, " ");
        for (int i = 0; i < method28937.length; ++i) {
            final String s = method28937[i];
            final Class7499 method28938 = Class9423.method35021(new Class1932(s));
            if (method28938 != null) {
                final int method28939 = Class90.field210.method504(method28938);
                if (method28939 >= 0) {
                    set.add(new Integer(method28939));
                }
                else {
                    this.method29461("Entity has no ID: " + method28938 + ", name: " + s);
                }
            }
            else {
                this.method29461("Entity not found: " + s);
            }
        }
        return Class8571.method29008((Integer[])set.toArray(new Integer[set.size()]));
    }
    
    static {
        field36318 = new Class9449[0];
        field36319 = new Class181[0];
        Class8652.field36320 = null;
        field36321 = new Class6787();
        field36322 = new Class6785();
    }
}
