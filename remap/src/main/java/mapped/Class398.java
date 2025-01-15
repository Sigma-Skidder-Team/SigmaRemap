// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public class Class398 implements Class397
{
    private final StringBuffer field2377;
    private final Class394 field2378;
    
    public Class398(final Class394 field2378) {
        this.field2377 = new StringBuffer();
        this.field2378 = field2378;
    }
    
    public void method1635() {
        this.field2377.setLength(0);
    }
    
    public String method1636() {
        return this.field2377.toString();
    }
    
    public Class7492 method1637() {
        final Class1849 method1481 = this.field2378.method1481(Class383.field2223);
        return new Class7492(this, new Vec3d(method1481.method6758()), Vec2f.ZERO, method1481, 4, "Recon", new Class2260("Rcon"), this.field2378, null);
    }
    
    @Override
    public void method1494(final Class2250 class2250) {
        this.field2377.append(class2250.getString());
    }
    
    @Override
    public boolean method1575() {
        return true;
    }
    
    @Override
    public boolean method1576() {
        return true;
    }
    
    @Override
    public boolean method1623() {
        return this.field2378.method1450();
    }
}
