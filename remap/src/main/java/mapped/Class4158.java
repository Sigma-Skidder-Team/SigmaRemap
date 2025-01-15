// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public abstract class Class4158<T extends TileEntity>
{
    public final Class9550 field18539;
    private Class5412 field18540;
    private Class1932 field18541;
    
    public Class4158(final Class9550 field18539) {
        this.field18540 = null;
        this.field18541 = null;
        this.field18539 = field18539;
    }
    
    public abstract void method12454(final T p0, final float p1, final Class7351 p2, final Class7807 p3, final int p4, final int p5);
    
    public boolean method12455(final T t) {
        return false;
    }
    
    public Class8651<EntityType, Class5412> method12456() {
        return (Class8651<EntityType, Class5412>)((this.field18540 != null) ? Class8651.method29439(this.field18540) : null);
    }
    
    public void method12457(final Class8651<EntityType, Class5412> class8651) {
        this.field18540 = class8651.method29437().get();
    }
    
    public Class1932 method12458() {
        return this.field18541;
    }
    
    public void method12459(final Class1932 field18541) {
        this.field18541 = field18541;
    }
}
