// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class4790 extends Class4703<Class427>
{
    private static String[] field20424;
    private final Class1796 field20425;
    private final Random field20426;
    
    public Class4790(final Class8551 class8551, final Class1796 field20425) {
        super(class8551);
        this.field20426 = new Random();
        this.field20425 = field20425;
        this.field20284 = 0.15f;
        this.field20285 = 0.75f;
    }
    
    private int method14163(final Class8321 class8321) {
        int n = 1;
        if (class8321.method27690() <= 48) {
            if (class8321.method27690() <= 32) {
                if (class8321.method27690() <= 16) {
                    if (class8321.method27690() > 1) {
                        n = 2;
                    }
                }
                else {
                    n = 3;
                }
            }
            else {
                n = 4;
            }
        }
        else {
            n = 5;
        }
        return n;
    }
    
    public void method14164(final Class427 class427, final float n, final float n2, final Class7351 class428, final Class7807 class429, final int n3) {
        class428.method22567();
        final Class8321 method2107 = class427.method2107();
        this.field20426.setSeed(method2107.method27620() ? 187 : (Class3820.method11696(method2107.method27622()) + method2107.method27632()));
        Class6313 class430 = this.field20425.method6534(method2107, class427.field2391, null);
        if (Class8571.method28987()) {
            class430 = Class9404.method34966(method2107, class430, Class9168.field38843, true);
        }
        final boolean method2108 = class430.method18693();
        final int method2109 = this.method14163(method2107);
        float n4 = MathHelper.sin((class427.method2113() + n2) / 10.0f + class427.field2619) * 0.1f + 0.1f;
        if (!this.method14167()) {
            n4 = 0.0f;
        }
        class428.method22564(0.0, n4 + 0.25f * class430.method18697().method23402(Class2016.field11493).field25540.getY(), 0.0);
        class428.method22566(Vector3f.YP.rotation((class427.method2113() + n2) / 20.0f + class427.field2619));
        final float method2110 = class430.method18697().field29086.field25540.getX();
        final float method2111 = class430.method18697().field29086.field25540.getY();
        final float method2112 = class430.method18697().field29086.field25540.getZ();
        if (!method2108) {
            class428.method22564(-0.0f * (method2109 - 1) * 0.5f * method2110, -0.0f * (method2109 - 1) * 0.5f * method2111, -0.09375f * (method2109 - 1) * 0.5f * method2112);
        }
        for (int i = 0; i < method2109; ++i) {
            class428.method22567();
            if (i > 0) {
                if (!method2108) {
                    class428.method22564((this.field20426.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f, (this.field20426.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f, 0.0);
                }
                else {
                    float n5 = (this.field20426.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    float n6 = (this.field20426.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    final float n7 = (this.field20426.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    if (!this.method14166()) {
                        n5 = 0.0f;
                        n6 = 0.0f;
                    }
                    class428.method22564(n5, n6, n7);
                }
            }
            this.field20425.method6531(method2107, Class2016.field11493, false, class428, class429, n3, Class1904.field10335, class430);
            class428.method22568();
            if (!method2108) {
                class428.method22564(0.0f * method2110, 0.0f * method2111, 0.09375f * method2112);
            }
        }
        class428.method22568();
        super.method13951(class427, n, n2, class428, class429, n3);
    }
    
    public Class1932 method14165(final Class427 class427) {
        return Class1774.field9853;
    }
    
    public boolean method14166() {
        return true;
    }
    
    public boolean method14167() {
        return true;
    }
}
