// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.commons.lang3.StringUtils;

public class Class3937 extends Class3936
{
    public Class3937(final Properties class9288) {
        super(Class298.field1713, class9288);
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        super.method11853(class1847, class1848, class1849, class1850, class1851);
        final TileEntity method6727 = class1847.getTileEntity(class1848);
        if (method6727 instanceof Class493) {
            final Class493 class1852 = (Class493)method6727;
            GameProfile method6728 = null;
            if (class1851.method27656()) {
                final CompoundNBT method6729 = class1851.method27657();
                if (!method6729.contains("SkullOwner", 10)) {
                    if (method6729.contains("SkullOwner", 8)) {
                        if (!StringUtils.isBlank((CharSequence)method6729.getString("SkullOwner"))) {
                            method6728 = new GameProfile((UUID)null, method6729.getString("SkullOwner"));
                        }
                    }
                }
                else {
                    method6728 = Class9346.method34640(method6729.getCompound("SkullOwner"));
                }
            }
            class1852.method2506(method6728);
        }
    }
}
