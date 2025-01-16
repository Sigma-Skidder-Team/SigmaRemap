// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.List;

public class Class3478 extends Class3446
{
    private static String[] field16386;
    private final Class7843 field16387;
    private int field16388;
    public final /* synthetic */ Class851 field16389;
    
    private Class3478(final Class851 field16389) {
        this.field16389 = field16389;
        this.field16387 = new Class7843().method25337(64.0);
        this.field16388 = 20;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16388 <= 0) {
            this.field16388 = 60;
            final List<PlayerEntity> method7141 = this.field16389.world.method7141(this.field16387, this.field16389, this.field16389.getBoundingBox().grow(16.0, 64.0, 16.0));
            if (!method7141.isEmpty()) {
                method7141.sort((class513, class514) -> (class513.getPosY() <= class514.getPosY()) ? 1 : -1);
                for (final PlayerEntity playerEntity : method7141) {
                    if (!this.field16389.method2647(playerEntity, Class7843.field32117)) {
                        continue;
                    }
                    this.field16389.method4153(playerEntity);
                    return true;
                }
            }
            return false;
        }
        --this.field16388;
        return false;
    }
    
    @Override
    public boolean method11017() {
        final LivingEntity method4152 = this.field16389.method4152();
        return method4152 != null && this.field16389.method2647(method4152, Class7843.field32117);
    }
}
