// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

public class Class4903 extends Class4841
{
    private static String[] field20975;
    private float field20976;
    public boolean field20977;
    
    public Class4903(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final float field20976) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20977 = false;
        this.field20976 = field20976;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        final int n3 = this.method14320() - this.method14280();
        if (this.field20977) {
            this.method14727(n3 / (float)this.method14276());
        }
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(final float n) {
        for (int i = 0; i < this.field20480; ++i) {
            Class8154.method26874((float)(this.field20478 + i), (float)this.field20479, 1.0f, (float)this.field20481, Class6430.method19118(Color.HSBtoRGB(i / (float)this.field20480, 1.0f, 1.0f), n));
        }
        Class8154.method26878((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278()), Class6430.method19118(Class265.field1281.field1292, 0.5f * n));
        Class4885.method14626(this.field20478 + Math.round(this.field20480 * this.field20976) + 1, this.field20479 + 4, Color.HSBtoRGB(this.field20976, 1.0f, 1.0f), n);
        super.method14205(n);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        this.field20977 = true;
        return super.method14211(n, n2, n3);
    }
    
    @Override
    public void method14233(final int n, final int n2, final int n3) {
        this.field20977 = false;
    }
    
    public float method14726() {
        return this.field20976;
    }
    
    public void method14727(final float n) {
        this.method14728(n, true);
    }
    
    public void method14728(float min, final boolean b) {
        min = Math.min(Math.max(min, 0.0f), 1.0f);
        final float field20976 = this.field20976;
        this.field20976 = min;
        if (b) {
            if (field20976 != min) {
                this.method14517();
            }
        }
    }
}
