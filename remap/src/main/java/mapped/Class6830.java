// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class6830 extends Class6831
{
    private static String[] field26824;
    private final Class512 field26825;
    private final Class428 field26826;
    
    public Class6830(final Class512 field26825, final Class428 field26826) {
        super(Class8520.field35367, Class286.field1584);
        this.field26825 = field26825;
        this.field26826 = field26826;
        this.field26842 = Class229.field809;
        this.field26840 = true;
        this.field26841 = 0;
        this.field26835 = 0.0f;
    }
    
    @Override
    public boolean method20917() {
        return true;
    }
    
    @Override
    public void method20918() {
        if (!this.field26826.field2410) {
            if (this.field26825.method1805()) {
                if (this.field26825.method1920() == this.field26826) {
                    final float method35641 = MathHelper.method35641(Entity.method1680(this.field26826.method1935()));
                    if (method35641 < 0.01) {
                        this.field26835 = 0.0f;
                        return;
                    }
                    this.field26835 = 0.0f + MathHelper.method35653(method35641, 0.0f, 1.0f) * 0.75f;
                    return;
                }
            }
        }
        this.field26827 = true;
    }
}
