// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

import java.util.Iterator;

public class Class3938 extends Class3936
{
    private static Class8691 field17821;
    private static Class8691 field17822;
    
    public Class3938(final Class9288 class9288) {
        super(Class298.field1712, class9288);
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        super.method11853(class1847, class1848, class1849, class1850, class1851);
        final TileEntity method6727 = class1847.getTileEntity(class1848);
        if (method6727 instanceof Class493) {
            method12051(class1847, class1848, (Class493)method6727);
        }
    }
    
    public static void method12051(final World class1847, final BlockPos class1848, final Class493 class1849) {
        if (!class1847.isRemote) {
            final Block method21696 = class1849.method2194().getBlock();
            if (method21696 == Class7521.field29455 || method21696 == Class7521.field29456) {
                if (class1848.getY() >= 2) {
                    if (class1847.method6954() != Class2113.field12290) {
                        final Class8691 method21697 = method12053();
                        final Class7820 method21698 = method21697.method29796(class1847, class1848);
                        if (method21698 != null) {
                            for (int i = 0; i < method21697.method29794(); ++i) {
                                for (int j = 0; j < method21697.method29793(); ++j) {
                                    final Class7990 method21699 = method21698.method25270(i, j, 0);
                                    class1847.setBlockState(method21699.method26068(), Class7521.field29147.getDefaultState(), 2);
                                    class1847.method6955(2001, method21699.method26068(), Block.method11774(method21699.method26065()));
                                }
                            }
                            final Class767 class1850 = EntityType.field29048.method23371(class1847);
                            final BlockPos method21700 = method21698.method25270(1, 2, 0).method26068();
                            class1850.method1730(method21700.getX() + 0.5, method21700.getY() + 0.55, method21700.getZ() + 0.5, (method21698.method25266().getAxis() != Direction.Axis.X) ? 90.0f : 0.0f, 0.0f);
                            class1850.field2951 = ((method21698.method25266().getAxis() != Direction.Axis.X) ? 90.0f : 0.0f);
                            class1850.method4245();
                            final Iterator<Entity> iterator = (Iterator<Entity>)class1847.method7128((Class<? extends Class513>)Class513.class, class1850.getBoundingBox().method18496(50.0)).iterator();
                            while (iterator.hasNext()) {
                                Class7770.field31788.method13788(iterator.next(), class1850);
                            }
                            class1847.method6886(class1850);
                            for (int k = 0; k < method21697.method29794(); ++k) {
                                for (int l = 0; l < method21697.method29793(); ++l) {
                                    class1847.method6694(method21698.method25270(k, l, 0).method26068(), Class7521.field29147);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static boolean method12052(final World class1847, final BlockPos class1848, final ItemStack class1849) {
        if (class1849.getItem() == Items.field31524) {
            if (class1848.getY() >= 2) {
                if (class1847.method6954() != Class2113.field12290) {
                    if (!class1847.isRemote) {
                        return method12054().method29796(class1847, class1848) != null;
                    }
                }
            }
        }
        return false;
    }
    
    private static Class8691 method12053() {
        if (Class3938.field17821 == null) {
            Class3938.field17821 = Class9512.method35439().method35438("^^^", "###", "~#~").method35440('#', Class7990.method26069(Class169.method766(Class7521.field29339))).method35440('^', Class7990.method26069(Class169.method766(Class7521.field29455).or(Class169.method766(Class7521.field29456)))).method35440('~', Class7990.method26069(Class114.method607(Material.AIR))).method35441();
        }
        return Class3938.field17821;
    }
    
    private static Class8691 method12054() {
        if (Class3938.field17822 == null) {
            Class3938.field17822 = Class9512.method35439().method35438("   ", "###", "~#~").method35440('#', Class7990.method26069(Class169.method766(Class7521.field29339))).method35440('~', Class7990.method26069(Class114.method607(Material.AIR))).method35441();
        }
        return Class3938.field17822;
    }
}
