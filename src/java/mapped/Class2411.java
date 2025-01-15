// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.io.Serializable;

public class Class2411 implements Serializable
{
    private static String[] field14274;
    private static final long field14275 = 1L;
    private ArrayList field14276;
    
    public Class2411() {
        this.field14276 = new ArrayList();
    }
    
    public int method9620() {
        return this.field14276.size();
    }
    
    public Class2414 method9621(final int index) {
        return this.field14276.get(index);
    }
    
    public int method9622(final int n) {
        return Class2414.method9670(this.method9621(n));
    }
    
    public int method9623(final int n) {
        return Class2414.method9671(this.method9621(n));
    }
    
    public void method9624(final int n, final int n2) {
        this.field14276.add(new Class2414(this, n, n2));
    }
    
    public void method9625(final int n, final int n2) {
        this.field14276.add(0, new Class2414(this, n, n2));
    }
    
    public boolean method9626(final int n, final int n2) {
        return this.field14276.contains(new Class2414(this, n, n2));
    }
}
