// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6832 extends Class6831
{
    private static String[] field26828;
    private final ClientPlayerEntity field26829;
    private int field26830;
    
    public Class6832(final ClientPlayerEntity field26829) {
        super(Class8520.field35149, Class286.field1585);
        this.field26829 = field26829;
        this.field26840 = true;
        this.field26841 = 0;
        this.field26835 = 0.1f;
    }
    
    @Override
    public void method20918() {
        ++this.field26830;
        if (!this.field26829.removed && (this.field26830 <= 20 || this.field26829.method2773())) {
            this.field26837 = (float)this.field26829.getPosX();
            this.field26838 = (float)this.field26829.getPosY();
            this.field26839 = (float)this.field26829.getPosZ();
            final float n = (float)this.field26829.getMotion().lengthSquared();
            if (n < 1.0E-7) {
                this.field26835 = 0.0f;
            }
            else {
                this.field26835 = MathHelper.clamp(n / 4.0f, 0.0f, 1.0f);
            }
            if (this.field26830 >= 20) {
                if (this.field26830 < 40) {
                    this.field26835 *= (float)((this.field26830 - 20) / 20.0);
                }
            }
            else {
                this.field26835 = 0.0f;
            }
            if (this.field26835 <= 0.8f) {
                this.field26836 = 1.0f;
            }
            else {
                this.field26836 = 1.0f + (this.field26835 - 0.8f);
            }
        }
        else {
            this.field26827 = true;
        }
    }
}
