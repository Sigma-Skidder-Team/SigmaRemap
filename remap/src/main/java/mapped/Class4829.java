// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class4829 extends Class4825
{
    private static String[] field20591;
    public float field20655;
    public Class2118 field20656;
    public final int field20657 = 0;
    public final List<Class4868> field20658;
    private Class7776 field20659;
    
    public Class4829(final Class4803 class4803, final String s) {
        super(class4803, s, 0, Class869.method5277().field4632.method7695() - 70, Class869.method5277().field4632.method7694(), 110, false);
        this.field20655 = 0.0f;
        this.field20656 = Class2118.field12348;
        this.field20658 = new ArrayList<Class4868>();
        this.method14301(true);
        this.method14311(false);
    }
    
    public float method14460() {
        return 1.0f - this.field20655;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        final int n3 = 20;
        if (this.field20656 == Class2118.field12348) {
            if (Math.abs(Class869.method5277().field4632.method7695() - n2) < n3) {
                if (!this.field20475.method14248(((Class4801)this.field20475).field20459)) {
                    this.field20656 = Class2118.field12346;
                }
            }
        }
        final float n4 = 0.05f;
        this.field20655 += ((this.field20656 != Class2118.field12346) ? ((this.field20656 != Class2118.field12347) ? 0.0f : (-n4)) : n4);
        if (this.field20655 < 1.0f) {
            if (this.field20655 <= 0.0f) {
                this.field20655 = 0.0f;
                this.field20656 = Class2118.field12348;
            }
        }
        else {
            this.field20655 = 1.0f;
            this.field20656 = Class2118.field12348;
        }
        if (Class869.method5277().field4632.method7695() - n2 > this.method14278()) {
            this.field20656 = Class2118.field12347;
        }
        float n5 = Class7707.method24584(this.field20655, 0.0f, 1.0f, 1.0f);
        if (this.field20656 == Class2118.field12347) {
            n5 = Class7707.method24582(this.field20655, 0.0f, 1.0f, 1.0f);
        }
        this.method14275(Class869.method5277().field4632.method7695() - (int)(this.method14278() * n5));
    }
    
    @Override
    public void method14205(final float n) {
        final int n2 = 20;
        if (n >= 0.6) {
            Class8154.method26915(this.field20478 + n2, this.field20479 + n2, this.field20480 - n2 * 2, this.field20481 - n2 * 2, Class6430.method19118(Class265.field1278.field1292, 0.9f * n));
            super.method14205(n);
        }
    }
}