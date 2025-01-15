// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;
import java.util.Date;
import javax.annotation.Nullable;

public final class Class6957
{
    private final String[] field27234;
    
    public Class6957(final Class8640 class8640) {
        this.field27234 = class8640.field36241.toArray(new String[class8640.field36241.size()]);
    }
    
    private Class6957(final String[] field27234) {
        this.field27234 = field27234;
    }
    
    @Nullable
    public String method21360(final String s) {
        return method21368(this.field27234, s);
    }
    
    @Nullable
    public Date method21361(final String s) {
        final String method21360 = this.method21360(s);
        return (method21360 == null) ? null : Class6525.method19743(method21360);
    }
    
    public int method21362() {
        return this.field27234.length / 2;
    }
    
    public String method21363(final int n) {
        return this.field27234[n * 2];
    }
    
    public String method21364(final int n) {
        return this.field27234[n * 2 + 1];
    }
    
    public Set<String> method21365() {
        final TreeSet s = new TreeSet((Comparator<? super E>)String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < this.method21362(); ++i) {
            s.add(this.method21363(i));
        }
        return (Set<String>)Collections.unmodifiableSet((Set<?>)s);
    }
    
    public List<String> values(final String s) {
        List<? extends String> list = null;
        for (int i = 0; i < this.method21362(); ++i) {
            if (s.equalsIgnoreCase(this.method21363(i))) {
                if (list == null) {
                    list = new ArrayList<String>(2);
                }
                list.add(this.method21364(i));
            }
        }
        return (List<String>)((list == null) ? Collections.emptyList() : Collections.unmodifiableList((List<?>)list));
    }
    
    public Class8640 method21366() {
        final Class8640 class8640 = new Class8640();
        Collections.addAll(class8640.field36241, this.field27234);
        return class8640;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class6957 && Arrays.equals(((Class6957)o).field27234, this.field27234);
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.field27234);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.method21362(); ++i) {
            sb.append(this.method21363(i)).append(": ").append(this.method21364(i)).append("\n");
        }
        return sb.toString();
    }
    
    public Map<String, List<String>> method21367() {
        final TreeMap treeMap = new TreeMap((Comparator<? super K>)String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < this.method21362(); ++i) {
            final String lowerCase = this.method21363(i).toLowerCase(Locale.US);
            List list = (List)treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(this.method21364(i));
        }
        return treeMap;
    }
    
    private static String method21368(final String[] array, final String s) {
        for (int i = array.length - 2; i >= 0; i -= 2) {
            if (s.equalsIgnoreCase(array[i])) {
                return array[i + 1];
            }
        }
        return null;
    }
    
    public static Class6957 method21369(String... array) {
        if (array == null) {
            throw new NullPointerException("namesAndValues == null");
        }
        if (array.length % 2 == 0) {
            array = array.clone();
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                array[i] = array[i].trim();
            }
            int j = 0;
            while (j < array.length) {
                final String str = array[j];
                final String str2 = array[j + 1];
                if (str.length() != 0) {
                    if (str.indexOf(0) == -1) {
                        if (str2.indexOf(0) == -1) {
                            j += 2;
                            continue;
                        }
                    }
                }
                throw new IllegalArgumentException("Unexpected header: " + str + ": " + str2);
            }
            return new Class6957(array);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }
    
    public static Class6957 method21370(final Map<String, String> map) {
        if (map != null) {
            final String[] array = new String[map.size() * 2];
            int n = 0;
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    final String trim = entry.getKey().trim();
                    final String trim2 = ((String)entry.getValue()).trim();
                    if (trim.length() != 0) {
                        if (trim.indexOf(0) == -1) {
                            if (trim2.indexOf(0) == -1) {
                                array[n] = trim;
                                array[n + 1] = trim2;
                                n += 2;
                                continue;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unexpected header: " + trim + ": " + trim2);
                }
                throw new IllegalArgumentException("Headers cannot be null");
            }
            return new Class6957(array);
        }
        throw new NullPointerException("headers == null");
    }
}
