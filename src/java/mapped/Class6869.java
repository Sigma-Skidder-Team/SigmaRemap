// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6869 implements Class6866
{
    private static String[] field26908;
    private final Class2240 field26909;
    private final String field26910;
    private final String field26911;
    private Class2204 field26912;
    private long field26913;
    private float field26914;
    private float field26915;
    private final boolean field26916;
    
    public Class6869(final Class2240 field26909, final Class2250 class2250, final Class2250 class2251, final boolean field26910) {
        this.field26912 = Class2204.field13417;
        this.field26909 = field26909;
        this.field26910 = class2250.method8461();
        this.field26911 = ((class2251 != null) ? class2251.method8461() : null);
        this.field26916 = field26910;
    }
    
    @Override
    public Class2204 method20978(final Class690 class690, final long field26913) {
        class690.method3853().method5290().method5849(Class6869.field26901);
        Class8726.method30069(1.0f, 1.0f, 1.0f);
        class690.method3186(0, 0, 0, 96, 160, 32);
        this.field26909.method8444(class690, 6, 6);
        if (this.field26911 != null) {
            class690.method3853().field4643.method6610(this.field26910, 30.0f, 7.0f, -11534256);
            class690.method3853().field4643.method6610(this.field26911, 30.0f, 18.0f, -16777216);
        }
        else {
            class690.method3853().field4643.method6610(this.field26910, 30.0f, 12.0f, -11534256);
        }
        if (this.field26916) {
            Class565.method3293(3, 28, 157, 29, -1);
            final float field26914 = (float)Class9546.method35655(this.field26914, this.field26915, (field26913 - this.field26913) / 100.0f);
            int n;
            if (this.field26915 < this.field26914) {
                n = -11206656;
            }
            else {
                n = -16755456;
            }
            Class565.method3293(3, 28, (int)(3.0f + 154.0f * field26914), 29, n);
            this.field26914 = field26914;
            this.field26913 = field26913;
        }
        return this.field26912;
    }
    
    public void method20985() {
        this.field26912 = Class2204.field13418;
    }
    
    public void method20986(final float field26915) {
        this.field26915 = field26915;
    }
}
