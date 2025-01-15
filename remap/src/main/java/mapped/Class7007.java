// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class7007 extends Class7006
{
    private static String[] field27324;
    private final Entity field27325;
    
    public Class7007(final Entity class399) {
        this(class399, class399.method1934());
    }
    
    public Class7007(final Entity field27325, final Vec3d class5487) {
        super(class5487);
        this.field27325 = field27325;
    }
    
    public Entity method21452() {
        return this.field27325;
    }
    
    @Override
    public Class2165 method21449() {
        return Class2165.field12882;
    }
}
