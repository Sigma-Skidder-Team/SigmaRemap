// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3390 extends Class3167
{
    private int field16101;
    
    public Class3390() {
        super(Class8013.field32989, "VeltPvP", "Disabler for VeltPvP.");
    }
    
    @Override
    public void method9879() {
        this.field16101 = 0;
    }
    
    @Class6753
    public void method10810(final Class5744 class5744) {
        if (this.method9906()) {
            if (Class3390.field15514.field4684 != null) {
                if (class5744.method17046()) {
                    ++this.field16101;
                    final double n = -0.1;
                    if (this.field16101 >= 20) {
                        this.field16101 = 0;
                        class5744.method17037(n);
                        class5744.method17045(false);
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10811(final Class5723 class5723) {
        if (this.method9906()) {
            return;
        }
    }
}
