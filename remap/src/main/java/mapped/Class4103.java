// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class4103 extends Item
{
    private static String[] field18203;
    
    public Class4103(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public boolean method11712(final ItemStack class8321, final World class8322, final BlockState class8323, final BlockPos class8324, final LivingEntity class8325) {
        if (!class8322.isRemote) {
            class8321.method27636(1, class8325, class8326 -> class8326.method2794(Class2215.field13600));
        }
        final Class3833 method21696 = class8323.method21696();
        if (!class8323.method21755(Class7188.field27907)) {
            if (method21696 != Class7521.field29240) {
                if (method21696 != Class7521.field29241) {
                    if (method21696 != Class7521.field29242) {
                        if (method21696 != Class7521.field29243) {
                            if (method21696 != Class7521.field29388) {
                                if (method21696 != Class7521.field29411) {
                                    if (!method21696.method11785(Class7188.field27879)) {
                                        return super.method11712(class8321, class8322, class8323, class8324, class8325);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean method11713(final BlockState class7096) {
        final Class3833 method21696 = class7096.method21696();
        if (method21696 != Class7521.field29240) {
            if (method21696 != Class7521.field29293) {
                if (method21696 != Class7521.field29411) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public float method11706(final ItemStack class8321, final BlockState class8322) {
        final Class3833 method21696 = class8322.method21696();
        if (method21696 != Class7521.field29240 && !class8322.method21755(Class7188.field27907)) {
            return method21696.method11785(Class7188.field27879) ? 5.0f : super.method11706(class8321, class8322);
        }
        return 15.0f;
    }
}
