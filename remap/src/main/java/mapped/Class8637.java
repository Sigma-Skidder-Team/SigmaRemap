// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.HashSet;
import com.google.common.collect.Sets;
import java.util.Set;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class Class8637
{
    public static final Class5096 field36231;
    public static final Class8637 field36232;
    private final List<Class7272> field36233;
    private final int field36234;
    private final int field36235;
    private final int field36236;
    private final boolean field36237;
    
    public Class8637(final List<Class7272> field36233, final int field36234, final int field36235, final int field36236, final boolean field36237) {
        this.field36233 = field36233;
        this.field36234 = field36234;
        this.field36235 = field36235;
        this.field36236 = field36236;
        this.field36237 = field36237;
    }
    
    private static boolean method29302(final int n, final int n2) {
        return n / n2 * n2 == n;
    }
    
    public Pair<Integer, Integer> method29301(final int i, final int j) {
        final Pair<Integer, Integer> method29303 = this.method29303(i, j);
        final int intValue = method29303.getFirst();
        final int intValue2 = method29303.getSecond();
        if (method29302(i, intValue) && method29302(j, intValue2)) {
            return method29303;
        }
        throw new IllegalArgumentException(String.format("Image size %s,%s is not multiply of frame size %s,%s", i, j, intValue, intValue2));
    }
    
    private Pair<Integer, Integer> method29303(final int n, final int n2) {
        if (this.field36234 != -1) {
            return (Pair<Integer, Integer>)((this.field36235 == -1) ? Pair.of((Object)this.field36234, (Object)n2) : Pair.of((Object)this.field36234, (Object)this.field36235));
        }
        if (this.field36235 == -1) {
            final int min = Math.min(n, n2);
            return (Pair<Integer, Integer>)Pair.of((Object)min, (Object)min);
        }
        return (Pair<Integer, Integer>)Pair.of((Object)n, (Object)this.field36235);
    }
    
    public int method29304(final int n) {
        return (this.field36235 != -1) ? this.field36235 : n;
    }
    
    public int method29305(final int n) {
        return (this.field36234 != -1) ? this.field36234 : n;
    }
    
    public int method29306() {
        return this.field36233.size();
    }
    
    public int method29307() {
        return this.field36236;
    }
    
    public boolean method29308() {
        return this.field36237;
    }
    
    private Class7272 method29309(final int n) {
        return this.field36233.get(n);
    }
    
    public int method29310(final int n) {
        final Class7272 method29309 = this.method29309(n);
        return method29309.method22281() ? this.field36236 : method29309.method22282();
    }
    
    public int method29311(final int n) {
        return this.field36233.get(n).method22283();
    }
    
    public Set<Integer> method29312() {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<Class7272> iterator = this.field36233.iterator();
        while (iterator.hasNext()) {
            hashSet.add(iterator.next().method22283());
        }
        return hashSet;
    }
    
    static {
        field36231 = new Class5096();
        field36232 = new Class8636(Lists.newArrayList(), -1, -1, 1, false);
    }
}
