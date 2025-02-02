// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Multimap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class4102 extends Item
{
    public Class4102(final Properties properties) {
        super(properties);
        this.method11705(new ResourceLocation("throwing"), (class8321, class8322, class8323) -> {
            if (class8323 != null) {
                if (class8323.method2756()) {
                    if (class8323.method2766() == class8321) {
                        return 1.0f;
                    }
                }
            }
            return 0.0f;
        });
    }
    
    @Override
    public boolean method11703(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099) {
        return !class7099.method2889();
    }
    
    @Override
    public Class1992 method11725(final ItemStack class8321) {
        return Class1992.field11159;
    }
    
    @Override
    public int method11726(final ItemStack class8321) {
        return 72000;
    }
    
    @Override
    public void method11727(final ItemStack class8321, final World class8322, final LivingEntity class8323, final int n) {
        if (class8323 instanceof PlayerEntity) {
            final PlayerEntity class8324 = (PlayerEntity)class8323;
            if (this.method11726(class8321) - n >= 10) {
                final int method30220 = Class8742.method30220(class8321);
                if (method30220 <= 0 || class8324.method1709()) {
                    if (!class8322.isRemote) {
                        class8321.method27636(1, class8324, class8328 -> class8328.method2795(class8327.method2757()));
                        if (method30220 == 0) {
                            final Class403 class8325 = new Class403(class8322, class8324, class8321);
                            class8325.method1963(class8324, class8324.rotationPitch, class8324.rotationYaw, 0.0f, 2.5f + method30220 * 0.5f, 1.0f);
                            if (class8324.field3025.field27304) {
                                class8325.field2474 = Class2151.field12784;
                            }
                            class8322.method6886(class8325);
                            class8322.method6707(null, class8325, Class8520.field35640, Class286.field1585, 1.0f, 1.0f);
                            if (!class8324.field3025.field27304) {
                                class8324.inventory.method2365(class8321);
                            }
                        }
                    }
                    class8324.method2859(Class8276.field33981.method8449(this));
                    if (method30220 > 0) {
                        final float field2399 = class8324.rotationYaw;
                        final float field2400 = class8324.rotationPitch;
                        final float n2 = -MathHelper.sin(field2399 * 0.017453292f) * MathHelper.cos(field2400 * 0.017453292f);
                        final float n3 = -MathHelper.sin(field2400 * 0.017453292f);
                        final float n4 = MathHelper.cos(field2399 * 0.017453292f) * MathHelper.cos(field2400 * 0.017453292f);
                        final float method30221 = MathHelper.method35640(n2 * n2 + n3 * n3 + n4 * n4);
                        final float n5 = 3.0f * ((1.0f + method30220) / 4.0f);
                        class8324.method1738(n2 * (n5 / method30221), n3 * (n5 / method30221), n4 * (n5 / method30221));
                        class8324.method2743(20);
                        if (class8324.onGround) {
                            class8324.method1671(Class2160.field12826, new Vec3d(0.0, 1.1999999284744263, 0.0));
                        }
                        Class7795 class8326;
                        if (method30220 < 3) {
                            if (method30220 != 2) {
                                class8326 = Class8520.field35637;
                            }
                            else {
                                class8326 = Class8520.field35638;
                            }
                        }
                        else {
                            class8326 = Class8520.field35639;
                        }
                        class8322.method6707(null, class8324, class8326, Class286.field1585, 1.0f, 1.0f);
                    }
                }
            }
        }
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        if (method2715.method27632() >= method2715.method27634() - 1) {
            return Class9355.method34677(method2715);
        }
        if (Class8742.method30220(method2715) > 0 && !class1848.method1709()) {
            return Class9355.method34677(method2715);
        }
        class1848.method2762(class1849);
        return Class9355.method34675(method2715);
    }
    
    @Override
    public boolean method11711(final ItemStack class8321, final LivingEntity class8322, final LivingEntity class8323) {
        class8321.method27636(1, class8323, class8324 -> class8324.method2794(Class2215.field13600));
        return true;
    }
    
    @Override
    public boolean method11712(final ItemStack class8321, final World class8322, final BlockState class8323, final BlockPos class8324, final LivingEntity class8325) {
        if (class8323.method21718(class8322, class8324) != 0.0) {
            class8321.method27636(2, class8325, class8326 -> class8326.method2794(Class2215.field13600));
        }
        return true;
    }
    
    @Override
    public Multimap<String, Class7919> method11739(final Class2215 class2215) {
        final Multimap<String, Class7919> method11739 = super.method11739(class2215);
        if (class2215 == Class2215.field13600) {
            method11739.put((Object)Class8107.field33410.method29978(), (Object)new Class7919(Class4102.field17361, "Tool modifier", 8.0, Class2157.field12809));
            method11739.put((Object)Class8107.field33412.method29978(), (Object)new Class7919(Class4102.field17362, "Tool modifier", -2.9000000953674316, Class2157.field12809));
        }
        return method11739;
    }
    
    @Override
    public int method11734() {
        return 1;
    }
}
