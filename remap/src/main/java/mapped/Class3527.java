// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3527 extends Class3446
{
    private static String[] field16541;
    private final Class853 field16542;
    private float field16543;
    private int field16544;
    
    public Class3527(final Class853 field16542) {
        this.field16542 = field16542;
        this.method11019(EnumSet.of(Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16542.method4152() == null) {
            if (!this.field16542.onGround) {
                if (!this.field16542.method1706()) {
                    if (!this.field16542.method1723()) {
                        if (!this.field16542.method2653(Class9439.field40498)) {
                            return false;
                        }
                    }
                }
            }
            if (this.field16542.method4148() instanceof Class6567) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void method11016() {
        final int field16544 = this.field16544 - 1;
        this.field16544 = field16544;
        if (field16544 <= 0) {
            this.field16544 = 40 + this.field16542.method2633().nextInt(60);
            this.field16543 = (float)this.field16542.method2633().nextInt(360);
        }
        ((Class6567)this.field16542.method4148()).method19913(this.field16543, false);
    }
}
