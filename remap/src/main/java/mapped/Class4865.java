// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4865 extends Class4841
{
    private static String[] field20591;
    private float field20831;
    private boolean field20593;
    private final List<Class7131> field20606;
    
    public Class4865(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20831 = 1.0f;
        this.field20593 = false;
        this.field20606 = new ArrayList<Class7131>();
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), this.field20479 + this.field20481 * this.field20831, Class6430.method19118(Class265.field1273.field1292, 0.2f));
        Class8154.method26876((float)this.field20478, (float)(this.field20479 + this.field20481), (float)(this.field20478 + this.field20480), this.field20479 + this.field20481 * this.field20831, Class6430.method19118(Class265.field1278.field1292, 0.2f));
        super.method14205(n);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        if (!super.method14211(this.field20478, this.field20479, n3)) {
            this.field20593 = true;
            return false;
        }
        return true;
    }
    
    public float method14591(final int n) {
        return (n - this.method14281()) / (float)this.field20481;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20593) {
            this.method14593(this.method14591(n2));
            this.method14595();
        }
    }
    
    @Override
    public void method14233(final int n, final int n2, final int n3) {
        super.method14233(n, n2, n3);
        this.field20593 = false;
    }
    
    @Override
    public void method14235(final float n) {
        if (this.method14308()) {
            this.method14593(this.method14592() - n / 2000.0f);
            this.method14595();
        }
        super.method14235(n);
    }
    
    public float method14592() {
        return this.field20831;
    }
    
    public void method14593(final float a) {
        this.field20831 = Math.min(Math.max(a, 0.0f), 1.0f);
    }
    
    public Class4815 method14594(final Class7131 class7131) {
        this.field20606.add(class7131);
        return this;
    }
    
    public void method14595() {
        final Iterator<Class7131> iterator = this.field20606.iterator();
        while (iterator.hasNext()) {
            iterator.next().method21883(this);
        }
    }
}