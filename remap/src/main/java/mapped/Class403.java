// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class403 extends Class402
{
    private static final DataParameter<Byte> field2484;
    private static final DataParameter<Boolean> field2485;
    private ItemStack field2486;
    private boolean field2487;
    public int field2488;
    
    public Class403(final EntityType<? extends Class403> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2486 = new ItemStack(Items.field31607);
    }
    
    public Class403(final World class1847, final LivingEntity class1848, final ItemStack class1849) {
        super(EntityType.field29040, class1848, class1847);
        this.field2486 = new ItemStack(Items.field31607);
        this.field2486 = class1849.method27641();
        this.dataManager.set(Class403.field2484, (byte)Class8742.method30219(class1849));
        this.dataManager.set(Class403.field2485, class1849.method27671());
    }
    
    public Class403(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29040, n, n2, n3, class1847);
        this.field2486 = new ItemStack(Items.field31607);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class403.field2484, (Byte)0);
        this.dataManager.register(Class403.field2485, false);
    }
    
    @Override
    public void method1659() {
        if (this.field2473 > 4) {
            this.field2487 = true;
        }
        final Entity method1973 = this.method1973();
        if (this.field2487 || this.method1987()) {
            if (method1973 != null) {
                final byte byteValue = this.dataManager.get(Class403.field2484);
                if (byteValue > 0 && !this.method1990()) {
                    if (!this.world.isRemote) {
                        if (this.field2474 == Class2151.field12783) {
                            this.method1767(this.method1974(), 0.1f);
                        }
                    }
                    this.method1652();
                }
                else if (byteValue > 0) {
                    this.method1986(true);
                    final Vec3d class5487 = new Vec3d(method1973.getPosX() - this.getPosX(), method1973.method1944() - this.getPosY(), method1973.getPosZ() - this.getPosZ());
                    this.method1948(this.getPosX(), this.getPosY() + class5487.y * 0.015 * byteValue, this.getPosZ());
                    if (this.world.isRemote) {
                        this.lastTickPosY = this.getPosY();
                    }
                    this.method1936(this.getMotion().scale(0.95).add(class5487.normalize().scale(0.05 * byteValue)));
                    if (this.field2488 == 0) {
                        this.method1695(Class8520.field35636, 10.0f, 1.0f);
                    }
                    ++this.field2488;
                }
            }
        }
        super.method1659();
    }
    
    private boolean method1990() {
        final Entity method1973 = this.method1973();
        return method1973 != null && method1973.method1768() && (!(method1973 instanceof Class513) || !method1973.isSpectator());
    }
    
    @Override
    public ItemStack method1974() {
        return this.field2486.method27641();
    }
    
    public boolean method1991() {
        return this.dataManager.get(Class403.field2485);
    }
    
    @Nullable
    @Override
    public EntityRayTraceResult method1971(final Vec3d class5487, final Vec3d class5488) {
        return this.field2487 ? null : super.method1971(class5487, class5488);
    }
    
    @Override
    public void method1967(final EntityRayTraceResult class7007) {
        final Entity method21452 = class7007.getEntity();
        float n = 8.0f;
        if (method21452 instanceof LivingEntity) {
            n += Class8742.method30202(this.field2486, ((LivingEntity)method21452).method2712());
        }
        final Entity method21453 = this.method1973();
        final DamageSource method21454 = DamageSource.method25697(this, (method21453 != null) ? method21453 : this);
        this.field2487 = true;
        Class7795 class7008 = Class8520.field35634;
        if (method21452.attackEntityFrom(method21454, n)) {
            if (method21452.getType() == EntityType.field28977) {
                return;
            }
            if (method21452 instanceof LivingEntity) {
                final LivingEntity class7009 = (LivingEntity)method21452;
                if (method21453 instanceof LivingEntity) {
                    Class8742.method30204(class7009, method21453);
                    Class8742.method30205((LivingEntity)method21453, class7009);
                }
                this.method1970(class7009);
            }
        }
        this.method1936(this.getMotion().mul(-0.01, -0.1, -0.01));
        float n2 = 1.0f;
        if (this.world instanceof Class1849) {
            if (this.world.method6770()) {
                if (Class8742.method30221(this.field2486)) {
                    final BlockPos method21455 = method21452.method1894();
                    if (this.world.method6994(method21455)) {
                        final LightningBoltEntity class7010 = new LightningBoltEntity(this.world, method21455.getX() + 0.5, method21455.getY(), method21455.getZ() + 0.5, false);
                        class7010.method2038((method21453 instanceof Class513) ? ((Class513)method21453) : null);
                        ((Class1849)this.world).method6903(class7010);
                        class7008 = Class8520.field35641;
                        n2 = 5.0f;
                    }
                }
            }
        }
        this.method1695(class7008, n2, 1.0f);
    }
    
    @Override
    public Class7795 method1968() {
        return Class8520.field35635;
    }
    
    @Override
    public void method1736(final PlayerEntity playerEntity) {
        final Entity method1973 = this.method1973();
        if (method1973 == null || method1973.method1865() == playerEntity.method1865()) {
            super.method1736(playerEntity);
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("Trident", 10)) {
            this.field2486 = ItemStack.method27619(class51.getCompound("Trident"));
        }
        this.field2487 = class51.getBoolean("DealtDamage");
        this.dataManager.set(Class403.field2484, (byte)Class8742.method30219(this.field2486));
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.put("Trident", this.field2486.method27627(new CompoundNBT()));
        class51.putBoolean("DealtDamage", this.field2487);
    }
    
    @Override
    public void method1964() {
        final byte byteValue = this.dataManager.get(Class403.field2484);
        if (this.field2474 != Class2151.field12783 || byteValue <= 0) {
            super.method1964();
        }
    }
    
    @Override
    public float method1985() {
        return 0.99f;
    }
    
    @Override
    public boolean method1752(final double n, final double n2, final double n3) {
        return true;
    }
    
    static {
        field2484 = EntityDataManager.method33564(Class403.class, Class7709.field30653);
        field2485 = EntityDataManager.method33564(Class403.class, Class7709.field30661);
    }
}
