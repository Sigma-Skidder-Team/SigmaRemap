// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public class Class7930 extends Class7929
{
    public final Entity field32594;
    private boolean field32595;
    
    public Class7930(final String s, final Entity field32594) {
        super(s);
        this.field32594 = field32594;
    }
    
    public Class7930 method25727() {
        this.field32595 = true;
        return this;
    }
    
    public boolean method25728() {
        return this.field32595;
    }
    
    @Nullable
    @Override
    public Entity method25714() {
        return this.field32594;
    }
    
    @Override
    public ITextComponent method25690(final Class511 class511) {
        final ItemStack class512 = (this.field32594 instanceof Class511) ? ((Class511)this.field32594).method2713() : ItemStack.field34174;
        final String string = "death.attack." + this.field32593;
        return (!class512.method27620() && class512.method27667()) ? new Class2259(string + ".item", new Object[] { class511.getDisplayName(), this.field32594.getDisplayName(), class512.method27684() }) : new Class2259(string, new Object[] { class511.getDisplayName(), this.field32594.getDisplayName() });
    }
    
    @Override
    public boolean method25722() {
        if (this.field32594 != null) {
            if (this.field32594 instanceof Class511) {
                if (!(this.field32594 instanceof Class512)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Nullable
    @Override
    public Vec3d method25726() {
        return (this.field32594 == null) ? null : this.field32594.method1934();
    }
}
