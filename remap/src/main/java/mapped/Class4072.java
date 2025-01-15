// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Multimap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Set;

public class Class4072 extends Class4071
{
    private final Set<Class3833> field18167;
    public final float field18168;
    public final float field18169;
    public final float field18170;
    
    public Class4072(final float n, final float field18170, final Class2038 class2038, final Set<Class3833> field18171, final Class8959 class2039) {
        super(class2038, class2039);
        this.field18167 = field18171;
        this.field18168 = class2038.method8110();
        this.field18169 = n + class2038.method8111();
        this.field18170 = field18170;
    }
    
    @Override
    public float method11706(final ItemStack class8321, final Class7096 class8322) {
        return this.field18167.contains(class8322.method21696()) ? this.field18168 : 1.0f;
    }
    
    @Override
    public boolean method11711(final ItemStack class8321, final LivingEntity class8322, final LivingEntity class8323) {
        class8321.method27636(2, class8323, class8324 -> class8324.method2794(Class2215.field13600));
        return true;
    }
    
    @Override
    public boolean method11712(final ItemStack class8321, final World class8322, final Class7096 class8323, final BlockPos class8324, final LivingEntity class8325) {
        if (!class8322.field10067) {
            if (class8323.method21718(class8322, class8324) != 0.0f) {
                class8321.method27636(1, class8325, class8326 -> class8326.method2794(Class2215.field13600));
            }
        }
        return true;
    }
    
    @Override
    public Multimap<String, Class7919> method11739(final Class2215 class2215) {
        final Multimap<String, Class7919> method11739 = super.method11739(class2215);
        if (class2215 == Class2215.field13600) {
            method11739.put((Object)Class8107.field33410.method29978(), (Object)new Class7919(Class4072.field17361, "Tool modifier", this.field18169, Class2157.field12809));
            method11739.put((Object)Class8107.field33412.method29978(), (Object)new Class7919(Class4072.field17362, "Tool modifier", this.field18170, Class2157.field12809));
        }
        return method11739;
    }
}
