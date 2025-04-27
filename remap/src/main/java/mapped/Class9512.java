// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.lang.reflect.Array;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.function.Predicate;
import java.util.Map;
import java.util.List;
import com.google.common.base.Joiner;

public class Class9512
{
    private static final Joiner field40925;
    private final List<String[]> field40926;
    private final Map<Character, Predicate<Class7990>> field40927;
    private int field40928;
    private int field40929;
    
    private Class9512() {
        this.field40926 = Lists.newArrayList();
        (this.field40927 = Maps.newHashMap()).put(' ', Predicates.alwaysTrue());
    }
    
    public Class9512 method35438(final String... array) {
        if (ArrayUtils.isEmpty(array) || StringUtils.isEmpty(array[0])) {
            throw new IllegalArgumentException("Empty pattern for aisle");
        }
        if (this.field40926.isEmpty()) {
            this.field40928 = array.length;
            this.field40929 = array[0].length();
        }
        if (array.length == this.field40928) {
            for (final String s : array) {
                if (s.length() != this.field40929) {
                    throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.field40929 + ", found one with " + s.length() + ")");
                }
                for (final char c : s.toCharArray()) {
                    if (!this.field40927.containsKey(c)) {
                        this.field40927.put(c, null);
                    }
                }
            }
            this.field40926.add(array);
            return this;
        }
        throw new IllegalArgumentException("Expected aisle with height of " + this.field40928 + ", but was given one with a height of " + array.length + ")");
    }
    
    public static Class9512 method35439() {
        return new Class9512();
    }
    
    public Class9512 method35440(final char c, final Predicate<Class7990> predicate) {
        this.field40927.put(c, predicate);
        return this;
    }
    
    public Class8691 method35441() {
        return new Class8691(this.method35442());
    }
    
    private Predicate<Class7990>[][][] method35442() {
        this.method35443();
        final Predicate[][][] array = (Predicate[][][])Array.newInstance(Predicate.class, this.field40926.size(), this.field40928, this.field40929);
        for (int i = 0; i < this.field40926.size(); ++i) {
            for (int j = 0; j < this.field40928; ++j) {
                for (int k = 0; k < this.field40929; ++k) {
                    array[i][j][k] = this.field40927.get(this.field40926.get(i)[j].charAt(k));
                }
            }
        }
        return array;
    }
    
    private void method35443() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Map.Entry entry : this.field40927.entrySet()) {
            if (entry.getValue() != null) {
                continue;
            }
            arrayList.add(entry.getKey());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new IllegalStateException("Predicates for character(s) " + Class9512.field40925.join(arrayList) + " are missing");
    }
    
    static {
        field40925 = Joiner.on(",");
    }
}
