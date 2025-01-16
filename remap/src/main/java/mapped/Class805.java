// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.commons.lang3.tuple.Pair;
import java.util.Random;
import java.util.UUID;

public class Class805 extends Class804
{
    private static final DataParameter<String> field4327;
    private Class5328 field4328;
    private int field4329;
    private UUID field4330;
    
    public Class805(final EntityType<? extends Class805> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public float method4228(final BlockPos class354, final Class1852 class355) {
        return (class355.getBlockState(class354.method1139()).getBlock() != Blocks.field29392) ? (class355.method6963(class354) - 0.5f) : 10.0f;
    }
    
    public static boolean method4705(final EntityType<Class805> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return class7500.getBlockState(class7502.method1139()).getBlock() == Blocks.field29392 && class7500.method6993(class7502, 0) > 8;
    }
    
    @Override
    public void onStruckByLightning(final LightningBoltEntity class422) {
        final UUID method1865 = class422.method1865();
        if (!method1865.equals(this.field4330)) {
            this.method4707((this.method4708() != Class1983.field10981) ? Class1983.field10981 : Class1983.field10982);
            this.field4330 = method1865;
            this.method1695(Class8520.field35369, 2.0f, 1.0f);
        }
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class805.field4327, Class1983.method7994(Class1983.field10981));
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (method2715.getItem() == Items.field31300) {
            if (!this.method2625()) {
                if (!playerEntity.field3025.field27304) {
                    method2715.method27693(1);
                    boolean b = false;
                    ItemStack class514;
                    if (this.field4328 == null) {
                        class514 = new ItemStack(Items.field31301);
                    }
                    else {
                        b = true;
                        class514 = new ItemStack(Items.field31612);
                        Class4035.method12228(class514, this.field4328, this.field4329);
                        this.field4328 = null;
                        this.field4329 = 0;
                    }
                    if (!method2715.method27620()) {
                        if (!playerEntity.field3006.method2362(class514)) {
                            playerEntity.method2822(class514, false);
                        }
                    }
                    else {
                        playerEntity.method2716(class513, class514);
                    }
                    Class7795 class515;
                    if (!b) {
                        class515 = Class8520.field35371;
                    }
                    else {
                        class515 = Class8520.field35372;
                    }
                    this.method1695(class515, 1.0f, 1.0f);
                    return true;
                }
            }
        }
        if (method2715.getItem() == Items.field31426 && !this.method2625()) {
            this.world.method6709(Class8432.field34619, this.getPosX(), this.method1942(0.5), this.getPosZ(), 0.0, 0.0, 0.0);
            if (!this.world.isRemote) {
                this.method1652();
                final Class804 class516 = EntityType.field28968.method23371(this.world);
                class516.method1730(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
                class516.method2665(this.method2664());
                class516.field2951 = this.field2951;
                if (this.hasCustomName()) {
                    class516.method1872(this.getCustomName());
                    class516.method1875(this.method1876());
                }
                if (this.method4194()) {
                    class516.method4190();
                }
                class516.method1851(this.method1850());
                this.world.method6886(class516);
                for (int i = 0; i < 5; ++i) {
                    this.world.method6886(new Class427(this.world, this.getPosX(), this.method1942(1.0), this.getPosZ(), new ItemStack(Class1983.method7995(this.method4708()).method21696())));
                }
                method2715.method27636(1, playerEntity, class518 -> class518.method2795(class517));
                this.method1695(Class8520.field35373, 1.0f, 1.0f);
            }
            return true;
        }
        if (this.method4708() == Class1983.field10982) {
            if (method2715.getItem().method11742(Class7855.field32266)) {
                if (this.field4328 == null) {
                    final Pair<Class5328, Integer> method2716 = this.method4706(method2715);
                    if (!playerEntity.field3025.field27304) {
                        method2715.method27693(1);
                    }
                    for (int j = 0; j < 4; ++j) {
                        this.world.method6709(Class8432.field34612, this.getPosX() + this.rand.nextFloat() / 2.0f, this.method1942(0.5), this.getPosZ() + this.rand.nextFloat() / 2.0f, 0.0, this.rand.nextFloat() / 5.0f, 0.0);
                    }
                    this.field4328 = (Class5328)method2716.getLeft();
                    this.field4329 = (int)method2716.getRight();
                    this.method1695(Class8520.field35370, 2.0f, 1.0f);
                }
                else {
                    for (int k = 0; k < 2; ++k) {
                        this.world.method6709(Class8432.field34639, this.getPosX() + this.rand.nextFloat() / 2.0f, this.method1942(0.5), this.getPosZ() + this.rand.nextFloat() / 2.0f, 0.0, this.rand.nextFloat() / 5.0f, 0.0);
                    }
                }
            }
        }
        return super.method4195(playerEntity, class513);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putString("Type", Class1983.method7994(this.method4708()));
        if (this.field4328 != null) {
            class51.putByte("EffectId", (byte)Class5328.method16451(this.field4328));
            class51.putInt("EffectDuration", this.field4329);
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4707(Class1983.method7996(class51.getString("Type")));
        if (class51.contains("EffectId", 1)) {
            this.field4328 = Class5328.method16450(class51.getByte("EffectId"));
        }
        if (class51.contains("EffectDuration", 3)) {
            this.field4329 = class51.getInt("EffectDuration");
        }
    }
    
    private Pair<Class5328, Integer> method4706(final ItemStack class8321) {
        final Class3882 class8322 = (Class3882)((Class4036)class8321.getItem()).method12240();
        return (Pair<Class5328, Integer>)Pair.of((Object)class8322.method11961(), (Object)class8322.method11962());
    }
    
    private void method4707(final Class1983 class1983) {
        this.dataManager.set(Class805.field4327, Class1983.method7994(class1983));
    }
    
    public Class1983 method4708() {
        return Class1983.method7996(this.dataManager.get(Class805.field4327));
    }
    
    public Class805 method4709(final Class788 class788) {
        final Class805 class789 = EntityType.field29007.method23371(this.world);
        class789.method4707(this.method4710((Class805)class788));
        return class789;
    }
    
    private Class1983 method4710(final Class805 class805) {
        final Class1983 method4708 = this.method4708();
        final Class1983 method4709 = class805.method4708();
        Class1983 class806;
        if (method4708 == method4709 && this.rand.nextInt(1024) == 0) {
            class806 = ((method4708 != Class1983.field10982) ? Class1983.field10982 : Class1983.field10981);
        }
        else {
            class806 = (this.rand.nextBoolean() ? method4708 : method4709);
        }
        return class806;
    }
    
    static {
        field4327 = EntityDataManager.method33564(Class805.class, Class7709.field30656);
    }
}
