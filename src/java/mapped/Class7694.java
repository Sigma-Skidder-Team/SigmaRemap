// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;

public class Class7694 implements Class7693
{
    private static String[] field30558;
    private Class2212[] field30559;
    private Class2212[] field30560;
    private Class2212[] field30561;
    private int field30562;
    private static final Class2212[] field30563;
    
    public Class7694() {
        this(null, null, null);
    }
    
    public Class7694(final Class2212[] array, final Class2212[] array2, final Class2212[] array3) {
        this(array, array2, array3, Integer.MAX_VALUE);
    }
    
    public Class7694(final Class2212[] array, final Class2212[] array2, final Class2212[] array3, final int field30562) {
        this.field30562 = Integer.MAX_VALUE;
        this.field30559 = method24468(array);
        this.field30560 = method24468(array2);
        this.field30561 = method24468(array3);
        this.field30562 = field30562;
    }
    
    private static Class2212[] method24468(final Class2212[] array) {
        return (array != null) ? array : Class7694.field30563;
    }
    
    public Class2212[] method24469() {
        return this.field30559;
    }
    
    public Class2212[] method24470() {
        return this.field30560;
    }
    
    public Class2212[] method24471() {
        return this.field30561;
    }
    
    public int method24472() {
        return (this.field30559 != null) ? this.field30559.length : 0;
    }
    
    @Override
    public Class2212[] method24467(final Class327[] array) {
        final int n = this.field30559.length + this.field30561.length;
        final int n2 = array.length - n;
        int n3 = 0;
        for (int n4 = 0; n4 + this.field30560.length <= n2 && n + n4 + this.field30560.length <= this.field30562; n4 += this.field30560.length) {
            ++n3;
        }
        final ArrayList list = new ArrayList();
        list.addAll(Arrays.asList(this.field30559));
        for (int i = 0; i < n3; ++i) {
            list.addAll(Arrays.asList(this.field30560));
        }
        list.addAll(Arrays.asList(this.field30561));
        return (Class2212[])list.toArray(new Class2212[list.size()]);
    }
    
    public Class7694 method24473(final Class2212... array) {
        return new Class7694(array, this.field30560, this.field30561);
    }
    
    public Class7694 method24474(final Class2212... array) {
        return new Class7694(this.field30559, array, this.field30561);
    }
    
    public Class7694 method24475(final Class2212... array) {
        return new Class7694(this.field30559, this.field30560, array);
    }
    
    public Class7694 method24476(final int n) {
        return new Class7694(this.field30559, this.field30560, this.field30561, n);
    }
    
    static {
        field30563 = new Class2212[0];
    }
}
