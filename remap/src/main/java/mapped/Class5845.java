// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.function.Function;

public abstract class Class5845<T extends Entity> extends Class5901
{
    public float field23955;
    public boolean field23956;
    public boolean field23957;
    
    public Class5845() {
        this(Class6332::method18770);
    }
    
    public Class5845(final Function<ResourceLocation, Class6332> function) {
        super(function);
        this.field23957 = true;
    }
    
    public abstract void method17557(final T p0, final float p1, final float p2, final float p3, final float p4, final float p5);
    
    public void method17558(final T t, final float n, final float n2, final float n3) {
    }
    
    public void method17569(final Class5845<T> class5845) {
        class5845.field23955 = this.field23955;
        class5845.field23956 = this.field23956;
        class5845.field23957 = this.field23957;
    }
}
