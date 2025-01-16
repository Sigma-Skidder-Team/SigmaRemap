// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3166 extends Class3167
{
    private int field15513;
    
    public Class3166() {
        super(Class8013.field32986, "AGC", "Criticals for Anti Gaming Chair");
    }
    
    @Override
    public void method9879() {
        this.field15513 = 0;
    }
    
    @Class6753
    @Class6757
    private void method9880(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            if (!Class3166.field15514.player.onGround) {
                this.field15513 = 0;
            }
            else {
                if (this.field15513 > 0) {
                    if (this.field15513 % 2 != 0) {
                        class5744.method17037(class5744.method17036() - 1.0E-14);
                    }
                    class5744.method17045(false);
                }
                ++this.field15513;
                class5744.method17033(true);
            }
            if (Class3166.field15514.field4682.method27337()) {
                if (Class3166.field15514.player.onGround) {
                    this.field15513 = 0;
                    class5744.method17037(Class3166.field15514.player.posY);
                    class5744.method17045(true);
                }
            }
        }
    }
}
