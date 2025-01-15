// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class5750 extends Class5714
{
    private static String[] field23341;
    private Entity field23342;
    private boolean field23343;
    
    public Class5750(final Entity field23342, final boolean field23343) {
        this.field23342 = field23342;
        this.field23343 = field23343;
    }
    
    public Entity method17057() {
        return this.field23342;
    }
    
    public void method17058(final Entity field23342) {
        this.field23342 = field23342;
    }
    
    public boolean method17059() {
        return this.field23343;
    }
    
    public void method17060() {
        this.field23343 = false;
    }
}
