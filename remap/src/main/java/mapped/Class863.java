// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class863 extends Class860
{
    private static String[] field4606;
    
    public Class863(final Class7499<? extends Class863> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class863(final Class1847 class1847, final BlockPos class1848) {
        super(Class7499.field28995, class1847, class1848);
        this.method1656(class1848.getX() + 0.5, class1848.getY() + 0.5, class1848.getZ() + 0.5);
        this.method1889(new Class6221(this.method1938() - 0.1875, this.method1941() - 0.25 + 0.125, this.method1945() - 0.1875, this.method1938() + 0.1875, this.method1941() + 0.25 + 0.125, this.method1945() + 0.1875));
        this.field2390 = true;
    }
    
    @Override
    public void method1656(final double n, final double n2, final double n3) {
        super.method1656(MathHelper.floor(n) + 0.5, MathHelper.floor(n2) + 0.5, MathHelper.floor(n3) + 0.5);
    }
    
    @Override
    public void method5187() {
        this.method1948(this.field4599.getX() + 0.5, this.field4599.getY() + 0.5, this.field4599.getZ() + 0.5);
    }
    
    @Override
    public void method5186(final Direction class179) {
    }
    
    @Override
    public int method5190() {
        return 9;
    }
    
    @Override
    public int method5191() {
        return 9;
    }
    
    @Override
    public float method1890(final Class290 class290, final Class8295 class291) {
        return -0.0625f;
    }
    
    @Override
    public boolean method1753(final double n) {
        return n < 1024.0;
    }
    
    @Override
    public void method5192(final Entity class399) {
        this.method1695(Class8520.field35341, 1.0f, 1.0f);
    }
    
    @Override
    public void method1761(final Class51 class51) {
    }
    
    @Override
    public void method1760(final Class51 class51) {
    }
    
    @Override
    public boolean method1770(final Class512 class512, final Class316 class513) {
        if (!this.field2391.field10067) {
            int n = 0;
            final List<Class759> method7128 = this.field2391.method7128((Class<? extends Class759>)Class759.class, new Class6221(this.method1938() - 7.0, this.method1941() - 7.0, this.method1945() - 7.0, this.method1938() + 7.0, this.method1941() + 7.0, this.method1945() + 7.0));
            for (final Class759 class514 : method7128) {
                if (class514.method4206() != class512) {
                    continue;
                }
                class514.method4207(this, true);
                n = 1;
            }
            if (n == 0) {
                this.method1652();
                if (class512.field3025.field27304) {
                    for (final Class759 class515 : method7128) {
                        if (!class515.method4205()) {
                            continue;
                        }
                        if (class515.method4206() != this) {
                            continue;
                        }
                        class515.method4203(true, false);
                    }
                }
            }
            return true;
        }
        return true;
    }
    
    @Override
    public boolean method5189() {
        return this.field2391.method6701(this.field4599).method21696().method11785(Class7188.field27911);
    }
    
    public static Class863 method5205(final Class1847 class1847, final BlockPos class1848) {
        final int method1074 = class1848.getX();
        final int method1075 = class1848.getY();
        final int method1076 = class1848.getZ();
        for (final Class863 class1849 : class1847.method7128((Class<? extends Class863>)Class863.class, new Class6221(method1074 - 1.0, method1075 - 1.0, method1076 - 1.0, method1074 + 1.0, method1075 + 1.0, method1076 + 1.0))) {
            if (!class1849.method5194().equals(class1848)) {
                continue;
            }
            return class1849;
        }
        final Class863 class1850 = new Class863(class1847, class1848);
        class1847.method6886(class1850);
        class1850.method5193();
        return class1850;
    }
    
    @Override
    public void method5193() {
        this.method1695(Class8520.field35342, 1.0f, 1.0f);
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this, this.method1642(), 0, this.method5194());
    }
}
