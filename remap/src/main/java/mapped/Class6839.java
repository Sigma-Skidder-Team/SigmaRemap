// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class6839 extends Class6831
{
    private static String[] field26851;
    private final Class428 field26852;
    private float field26853;
    
    public Class6839(final Class428 field26852) {
        super(Class8520.field35368, Class286.field1584);
        this.field26853 = 0.0f;
        this.field26852 = field26852;
        this.field26840 = true;
        this.field26841 = 0;
        this.field26835 = 0.0f;
        this.field26837 = (float)field26852.method1938();
        this.field26838 = (float)field26852.method1941();
        this.field26839 = (float)field26852.method1945();
    }
    
    @Override
    public boolean method20917() {
        return true;
    }
    
    @Override
    public void method20918() {
        if (!this.field26852.field2410) {
            this.field26837 = (float)this.field26852.method1938();
            this.field26838 = (float)this.field26852.method1941();
            this.field26839 = (float)this.field26852.method1945();
            final float method35641 = MathHelper.method35641(Entity.method1680(this.field26852.method1935()));
            if (method35641 < 0.01) {
                this.field26853 = 0.0f;
                this.field26835 = 0.0f;
            }
            else {
                this.field26853 = MathHelper.method35653(this.field26853 + 0.0025f, 0.0f, 1.0f);
                this.field26835 = MathHelper.method35700(MathHelper.method35653(method35641, 0.0f, 0.5f), 0.0f, 0.7f);
            }
        }
        else {
            this.field26827 = true;
        }
    }
}
