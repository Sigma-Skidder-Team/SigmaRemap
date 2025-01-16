// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Iterator;

public class Class3565 extends Class3555<PlayerEntity>
{
    private static String[] field16633;
    public final /* synthetic */ Class790 field16656;
    
    public Class3565(final Class790 field16656) {
        this.field16656 = field16656;
        super(field16656, PlayerEntity.class, 20, true, true, null);
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16656.method2625()) {
            if (super.method11013()) {
                final Iterator<Entity> iterator = (Iterator<Entity>)this.field16656.world.method7128((Class<? extends Class790>)Class790.class, this.field16656.getBoundingBox().method18495(8.0, 4.0, 8.0)).iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().method2625()) {
                        continue;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public double method11096() {
        return super.method11096() * 0.5;
    }
}
