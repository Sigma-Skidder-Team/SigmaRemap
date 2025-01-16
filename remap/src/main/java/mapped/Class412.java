// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import javax.annotation.Nullable;

public class Class412 extends Class409
{
    private static String[] field2509;
    private LivingEntity field2510;
    
    public Class412(final EntityType<? extends Class412> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class412(final World class1847, final LivingEntity field2510) {
        super(EntityType.field29037, field2510, class1847);
        this.field2510 = field2510;
    }
    
    public Class412(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29037, n, n2, n3, class1847);
    }
    
    @Override
    public Item method2013() {
        return Items.field31436;
    }
    
    @Override
    public void method2016(final RayTraceResult class7006) {
        final LivingEntity method2019 = this.method2019();
        if (class7006.getType() == RayTraceResult.Type.ENTITY) {
            final Entity method2020 = ((Class7007)class7006).method21452();
            if (method2020 == this.field2510) {
                return;
            }
            method2020.attackEntityFrom(DamageSource.method25699(this, method2019), 0.0f);
        }
        if (class7006.getType() == RayTraceResult.Type.BLOCK) {
            final BlockPos method2021 = ((BlockRayTraceResult)class7006).getPos();
            final TileEntity method2022 = this.world.getTileEntity(method2021);
            if (method2022 instanceof Class488) {
                final Class488 class7007 = (Class488)method2022;
                if (method2019 == null) {
                    class7007.method2437(this);
                    return;
                }
                if (method2019 instanceof Class513) {
                    Class7770.field31778.method13813((Class513)method2019, this.world.getBlockState(method2021));
                }
                class7007.method2437(method2019);
                this.method1652();
                return;
            }
        }
        for (int i = 0; i < 32; ++i) {
            this.world.method6709(Class8432.field34637, this.getPosX(), this.getPosY() + this.rand.nextDouble() * 2.0, this.getPosZ(), this.rand.nextGaussian(), 0.0, this.rand.nextGaussian());
        }
        if (!this.world.isRemote) {
            if (!(method2019 instanceof Class513)) {
                if (method2019 != null) {
                    method2019.method1878(this.getPosX(), this.getPosY(), this.getPosZ());
                    method2019.fallDistance = 0.0f;
                }
            }
            else {
                final Class513 class7008 = (Class513)method2019;
                if (class7008.field3039.getNetworkManager().method11187()) {
                    if (class7008.world == this.world) {
                        if (!class7008.method2783()) {
                            if (this.rand.nextFloat() < 0.05f) {
                                if (this.world.method6765().method31216(Class8878.field37318)) {
                                    final Class842 class7009 = EntityType.field28978.method23371(this.world);
                                    class7009.method5034(true);
                                    class7009.method1730(method2019.getPosX(), method2019.getPosY(), method2019.getPosZ(), method2019.rotationYaw, method2019.rotationPitch);
                                    this.world.method6886(class7009);
                                }
                            }
                            if (method2019.isPassenger()) {
                                method2019.stopRiding();
                            }
                            method2019.method1878(this.getPosX(), this.getPosY(), this.getPosZ());
                            method2019.fallDistance = 0.0f;
                            method2019.attackEntityFrom(DamageSource.field32572, 5.0f);
                        }
                    }
                }
            }
            this.method1652();
        }
    }
    
    @Override
    public void method1659() {
        final LivingEntity method2019 = this.method2019();
        if (method2019 != null) {
            if (method2019 instanceof PlayerEntity) {
                if (!method2019.method1768()) {
                    this.method1652();
                    return;
                }
            }
        }
        super.method1659();
    }
    
    @Nullable
    @Override
    public Entity method1854(final DimensionType class383) {
        if (this.field2517.dimension != class383) {
            this.field2517 = null;
        }
        return super.method1854(class383);
    }
}
