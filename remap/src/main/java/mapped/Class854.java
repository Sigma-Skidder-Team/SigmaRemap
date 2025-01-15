// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class Class854 extends Class853
{
    private static String[] field4561;
    
    public Class854(final EntityType<? extends Class854> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.20000000298023224);
    }
    
    public static boolean method5143(final EntityType<Class854> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return class7500.method6954() != Class2113.field12290;
    }
    
    @Override
    public boolean method4180(final Class1852 class1852) {
        return class1852.method6975(this) && !class1852.method6968(this.method1886());
    }
    
    @Override
    public void method5129(final int n, final boolean b) {
        super.method5129(n, b);
        this.method2710(Class8107.field33413).method23941(n * 3);
    }
    
    @Override
    public float method1726() {
        return 1.0f;
    }
    
    @Override
    public Class6909 method5132() {
        return Class8432.field34623;
    }
    
    @Override
    public Class1932 method4161() {
        return this.method5131() ? Class9020.field38063 : this.method1642().method23368();
    }
    
    @Override
    public boolean method1804() {
        return false;
    }
    
    @Override
    public int method5134() {
        return super.method5134() * 4;
    }
    
    @Override
    public void method5133() {
        this.field4557 *= 0.9f;
    }
    
    @Override
    public void method2725() {
        final Vec3d method1935 = this.method1935();
        this.method1937(method1935.x, this.method2724() + this.method5130() * 0.1f, method1935.z);
        this.field2448 = true;
    }
    
    @Override
    public void method2727(final Class7909<Class7255> class7909) {
        if (class7909 != Class7324.field28320) {
            super.method2727(class7909);
        }
        else {
            final Vec3d method1935 = this.method1935();
            this.method1937(method1935.x, 0.22f + this.method5130() * 0.05f, method1935.z);
            this.field2448 = true;
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public boolean method5136() {
        return this.method2749();
    }
    
    @Override
    public float method5137() {
        return super.method5137() + 2.0f;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return this.method5131() ? Class8520.field35588 : Class8520.field35357;
    }
    
    @Override
    public Class7795 method2684() {
        return this.method5131() ? Class8520.field35587 : Class8520.field35356;
    }
    
    @Override
    public Class7795 method5138() {
        return this.method5131() ? Class8520.field35589 : Class8520.field35359;
    }
    
    @Override
    public Class7795 method5141() {
        return Class8520.field35358;
    }
}
