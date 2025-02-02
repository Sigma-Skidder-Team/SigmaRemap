// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DataFixUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;

public class Builder<T extends Entity>
{
    private final Class8962<T> field37278;
    private final Class1976 field37279;
    private boolean field37280;
    private boolean field37281;
    private boolean field37282;
    private boolean field37283;
    private EntitySize field37284;
    
    private Builder(final Class8962<T> field37278, final Class1976 field37279) {
        this.field37280 = true;
        this.field37281 = true;
        this.field37284 = EntitySize.method27563(0.6f, 1.8f);
        this.field37278 = field37278;
        this.field37279 = field37279;
        this.field37283 = (field37279 == Class1976.field10949 || field37279 == Class1976.field10952);
    }
    
    public static <T extends Entity> Builder<T> method31155(final Class8962<T> class8962, final Class1976 class8963) {
        return new Builder<T>(class8962, class8963);
    }
    
    public static <T extends Entity> Builder<T> method31156(final Class1976 class1976) {
        return new Builder<T>((class7499, class7500) -> null, class1976);
    }
    
    public Builder<T> method31157(final float n, final float n2) {
        this.field37284 = EntitySize.method27563(n, n2);
        return this;
    }
    
    public Builder<T> method31158() {
        this.field37281 = false;
        return this;
    }
    
    public Builder<T> method31159() {
        this.field37280 = false;
        return this;
    }
    
    public Builder<T> method31160() {
        this.field37282 = true;
        return this;
    }
    
    public Builder<T> method31161() {
        this.field37283 = true;
        return this;
    }
    
    public EntityType<T> method31162(final String s) {
        if (this.field37280) {
            try {
                Class5494.method16768().getSchema(DataFixUtils.makeKey(Class9528.method35579().getWorldVersion())).getChoiceType(Class9451.field40625, s);
                return new EntityType<T>(this.field37278, this.field37279, this.field37280, this.field37281, this.field37282, this.field37283, this.field37284);
            }
            catch (final IllegalStateException ex) {
                if (Class9528.field41021) {
                    throw ex;
                }
            }
            EntityType.method23388().warn("No data fixer registered for entity {}", (Object)s);
        }
        return new EntityType<T>(this.field37278, this.field37279, this.field37280, this.field37281, this.field37282, this.field37283, this.field37284);
    }
}
