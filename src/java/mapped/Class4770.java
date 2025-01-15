// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4770 extends Class4712<Class767, Class5872<Class767>>
{
    private static final Class1932 field20397;
    private static final Class1932 field20398;
    
    public Class4770(final Class8551 class8551) {
        super(class8551, new Class5872(0.0f), 1.0f);
        this.method13978(new Class1807(this));
    }
    
    public int method14116(final Class767 class767, final float n) {
        return 15;
    }
    
    public Class1932 method14117(final Class767 class767) {
        final int method4255 = class767.method4255();
        return (method4255 > 0 && (method4255 > 80 || method4255 / 5 % 2 != 1)) ? Class4770.field20397 : Class4770.field20398;
    }
    
    public void method14118(final Class767 class767, final Class7351 class768, final float n) {
        float n2 = 2.0f;
        final int method4255 = class767.method4255();
        if (method4255 > 0) {
            n2 -= (method4255 - n) / 220.0f * 0.5f;
        }
        class768.method22565(n2, n2, n2);
    }
    
    static {
        field20397 = new Class1932("textures/entity/wither/wither_invulnerable.png");
        field20398 = new Class1932("textures/entity/wither/wither.png");
    }
}
