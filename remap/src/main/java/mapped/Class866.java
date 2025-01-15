// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public class Class866 extends Class865
{
    private static String[] field4617;
    public final /* synthetic */ Class429 field4618;
    
    public Class866(final Class429 field4618) {
        this.field4618 = field4618;
    }
    
    @Override
    public Class1849 method5216() {
        return (Class1849)this.field4618.field2391;
    }
    
    @Override
    public void method5217() {
        this.field4618.method1650().method33569(Class429.method2150(), this.method5212());
        this.field4618.method1650().method33569(Class429.method2151(), this.method5208());
    }
    
    @Override
    public Vec3d method5222() {
        return this.field4618.method1934();
    }
    
    public Class429 method5226() {
        return this.field4618;
    }
    
    @Override
    public Class7492 method5223() {
        return new Class7492(this, this.field4618.method1934(), this.field4618.method1792(), this.method5216(), 2, this.method5214().getString(), this.field4618.getDisplayName(), this.method5216().method6679(), this.field4618);
    }
}
