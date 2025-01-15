// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6203 extends Class6159
{
    private static String[] field25035;
    private boolean field25036;
    private final Class7805 field25037;
    
    private Class6203(final Class1847 class1847, final double n, final double n2, final double n3, final double field24939, final double field24940, final double field24941, final Class7805 field24942) {
        super(class1847, n, n2, n3);
        this.field24939 = field24939;
        this.field24940 = field24940;
        this.field24941 = field24941;
        this.field24953 = MathHelper.method35659(this.field24949, 0.7176471f, 0.8745098f);
        this.field24954 = MathHelper.method35659(this.field24949, 0.0f, 0.0f);
        this.field24955 = MathHelper.method35659(this.field24949, 0.8235294f, 0.9764706f);
        this.field24930 *= 0.75f;
        this.field24951 = (int)(20.0 / (this.field24949.nextFloat() * 0.8 + 0.2));
        this.field25036 = false;
        this.field24944 = false;
        this.method18429(this.field25037 = field24942);
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18429(this.field25037);
            if (this.field24943) {
                this.field24940 = 0.0;
                this.field25036 = true;
            }
            if (this.field25036) {
                this.field24940 += 0.002;
            }
            this.method18431(this.field24939, this.field24940, this.field24941);
            if (this.field24937 == this.field24934) {
                this.field24939 *= 1.1;
                this.field24941 *= 1.1;
            }
            this.field24939 *= 0.9599999785423279;
            this.field24941 *= 0.9599999785423279;
            if (this.field25036) {
                this.field24940 *= 0.9599999785423279;
            }
        }
        else {
            this.method18439();
        }
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public float method18430(final float n) {
        return this.field24930 * MathHelper.clamp((this.field24950 + n) / this.field24951 * 32.0f, 0.0f, 1.0f);
    }
}
