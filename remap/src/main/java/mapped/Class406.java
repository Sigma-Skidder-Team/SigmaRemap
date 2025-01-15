// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.OptionalInt;

public class Class406 extends Entity implements Class407, Class401
{
    private static final DataParameter<ItemStack> field2494;
    private static final DataParameter<OptionalInt> field2495;
    private static final DataParameter<Boolean> field2496;
    private int field2497;
    private int field2498;
    public LivingEntity field2499;
    
    public Class406(final EntityType<? extends Class406> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method1649() {
        this.dataManager.register(Class406.field2494, ItemStack.field34174);
        this.dataManager.register(Class406.field2495, OptionalInt.empty());
        this.dataManager.register(Class406.field2496, false);
    }
    
    @Override
    public boolean method1753(final double n) {
        return n < 4096.0 && !this.method2003();
    }
    
    @Override
    public boolean method1752(final double n, final double n2, final double n3) {
        return super.method1752(n, n2, n3) && !this.method2003();
    }
    
    public Class406(final World class1847, final double n, final double n2, final double n3, final ItemStack class1848) {
        super(EntityType.field28984, class1847);
        this.field2497 = 0;
        this.setPosition(n, n2, n3);
        int n4 = 1;
        if (!class1848.method27620()) {
            if (class1848.method27656()) {
                this.dataManager.set(Class406.field2494, class1848.method27641());
                n4 += class1848.method27659("Fireworks").method317("Flight");
            }
        }
        this.setMotion(this.rand.nextGaussian() * 0.001, 0.05, this.rand.nextGaussian() * 0.001);
        this.field2498 = 10 * n4 + this.rand.nextInt(6) + this.rand.nextInt(7);
    }
    
    public Class406(final World class1847, final ItemStack class1848, final LivingEntity field2499) {
        this(class1847, field2499.getPosX(), field2499.getPosY(), field2499.getPosZ(), class1848);
        this.dataManager.set(Class406.field2495, OptionalInt.of(field2499.getEntityId()));
        this.field2499 = field2499;
    }
    
    public Class406(final World class1847, final ItemStack class1848, final double n, final double n2, final double n3, final boolean b) {
        this(class1847, n, n2, n3, class1848);
        this.dataManager.set(Class406.field2496, b);
    }
    
    @Override
    public void method1797(final double n, final double n2, final double n3) {
        this.setMotion(n, n2, n3);
        if (this.prevRotationPitch == 0.0f) {
            if (this.prevRotationYaw == 0.0f) {
                final float method35641 = MathHelper.sqrt(n * n + n3 * n3);
                this.rotationYaw = (float)(MathHelper.method35693(n, n3) * 57.2957763671875);
                this.rotationPitch = (float)(MathHelper.method35693(n2, method35641) * 57.2957763671875);
                this.prevRotationYaw = this.rotationYaw;
                this.prevRotationPitch = this.rotationPitch;
            }
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.method2003()) {
            if (!this.method2004()) {
                this.method1936(this.getMotion().mul(1.15, 1.0, 1.15).add(0.0, 0.04, 0.0));
            }
            this.method1671(Class2160.field12826, this.getMotion());
        }
        else {
            if (this.field2499 == null) {
                this.dataManager.get(Class406.field2495).ifPresent(n2 -> {
                    this.world.getEntityByID(n2);
                    final LivingEntity class511;
                    if (!(!(class511 instanceof LivingEntity))) {
                        this.field2499 = class511;
                    }
                    return;
                });
            }
            if (this.field2499 != null) {
                if (this.field2499.method2773()) {
                    final Vec3d method1791 = this.field2499.method1791();
                    final Vec3d method1792 = this.field2499.getMotion();
                    this.field2499.method1936(method1792.add(method1791.x * 0.1 + (method1791.x * 1.5 - method1792.x) * 0.5, method1791.y * 0.1 + (method1791.y * 1.5 - method1792.y) * 0.5, method1791.z * 0.1 + (method1791.z * 1.5 - method1792.z) * 0.5));
                }
                this.setPosition(this.field2499.getPosX(), this.field2499.getPosY(), this.field2499.getPosZ());
                this.method1936(this.field2499.getMotion());
            }
        }
        final Vec3d method1793 = this.getMotion();
        final Class7006 method1794 = Class7476.method23093(this, this.getBoundingBox().method18493(method1793).method18496(1.0), class512 -> {
            final boolean b;
            if (!class512.isSpectator()) {
                if (!(!class512.method1768())) {
                    if (!(!class512.method1749())) {
                        return b;
                    }
                }
            }
            return b;
        }, Class2040.field11632, true);
        if (!this.noClip) {
            this.method2000(method1794);
            this.isAirBorne = true;
        }
        final float method1795 = MathHelper.sqrt(Entity.horizontalMag(method1793));
        this.rotationYaw = (float)(MathHelper.method35693(method1793.x, method1793.z) * 57.2957763671875);
        this.rotationPitch = (float)(MathHelper.method35693(method1793.y, method1795) * 57.2957763671875);
        while (this.rotationPitch - this.prevRotationPitch < -180.0f) {
            this.prevRotationPitch -= 360.0f;
        }
        while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
            this.prevRotationPitch += 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
            this.prevRotationYaw -= 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
            this.prevRotationYaw += 360.0f;
        }
        this.rotationPitch = MathHelper.method35700(0.2f, this.prevRotationPitch, this.rotationPitch);
        this.rotationYaw = MathHelper.method35700(0.2f, this.prevRotationYaw, this.rotationYaw);
        if (this.field2497 == 0) {
            if (!this.method1696()) {
                this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35194, Class286.field1586, 3.0f, 1.0f);
            }
        }
        ++this.field2497;
        if (this.world.isRemote) {
            if (this.field2497 % 2 < 2) {
                this.world.method6709(Class8432.field34621, this.getPosX(), this.getPosY() - 0.3, this.getPosZ(), this.rand.nextGaussian() * 0.05, -this.getMotion().y * 0.5, this.rand.nextGaussian() * 0.05);
            }
        }
        if (!this.world.isRemote) {
            if (this.field2497 > this.field2498) {
                this.method1999();
            }
        }
    }
    
    private void method1999() {
        this.world.method6761(this, (byte)17);
        this.method2002();
        this.method1652();
    }
    
    public void method2000(final Class7006 class7006) {
        if (class7006.method21449() == Class2165.field12882 && !this.world.isRemote) {
            this.method1999();
        }
        else if (this.collided) {
            BlockPos class7007;
            if (class7006.method21449() != Class2165.field12881) {
                class7007 = new BlockPos(this);
            }
            else {
                class7007 = new BlockPos(((Class7005)class7006).method21447());
            }
            this.world.method6701(class7007).method21741(this.world, class7007, this);
            if (this.method2001()) {
                this.method1999();
            }
        }
    }
    
    private boolean method2001() {
        final ItemStack class8321 = this.dataManager.get(Class406.field2494);
        final Class51 class8322 = class8321.method27620() ? null : class8321.method27660("Fireworks");
        final Class52 class8323 = (class8322 == null) ? null : class8322.method328("Explosions", 10);
        return class8323 != null && !class8323.isEmpty();
    }
    
    private void method2002() {
        float n = 0.0f;
        final ItemStack class8321 = this.dataManager.get(Class406.field2494);
        final Class51 class8322 = class8321.method27620() ? null : class8321.method27660("Fireworks");
        final Class52 class8323 = (class8322 == null) ? null : class8322.method328("Explosions", 10);
        if (class8323 != null) {
            if (!class8323.isEmpty()) {
                n = 5.0f + class8323.size() * 2;
            }
        }
        if (n > 0.0f) {
            if (this.field2499 != null) {
                this.field2499.attackEntityFrom(DamageSource.field32581, 5.0f + class8323.size() * 2);
            }
            final Vec3d method1934 = this.method1934();
            for (final LivingEntity class8324 : this.world.method7128((Class<? extends LivingEntity>) LivingEntity.class, this.getBoundingBox().method18496(5.0))) {
                if (class8324 == this.field2499) {
                    continue;
                }
                if (this.method1734(class8324) > 25.0) {
                    continue;
                }
                int n2 = 0;
                for (int i = 0; i < 2; ++i) {
                    if (this.world.method6987(new Class8478(method1934, new Vec3d(class8324.getPosX(), class8324.method1942(0.5 * i), class8324.getPosZ()), Class2040.field11632, Class2191.field13325, this)).method21449() == Class2165.field12880) {
                        n2 = 1;
                        break;
                    }
                }
                if (n2 == 0) {
                    continue;
                }
                class8324.attackEntityFrom(DamageSource.field32581, n * (float)Math.sqrt((5.0 - this.method1732(class8324)) / 5.0));
            }
        }
    }
    
    private boolean method2003() {
        return this.dataManager.get(Class406.field2495).isPresent();
    }
    
    public boolean method2004() {
        return this.dataManager.get(Class406.field2496);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b == 17) {
            if (this.world.isRemote) {
                if (this.method2001()) {
                    final ItemStack class8321 = this.dataManager.get(Class406.field2494);
                    final Class51 class8322 = class8321.method27620() ? null : class8321.method27660("Fireworks");
                    final Vec3d method1935 = this.getMotion();
                    this.world.method6781(this.getPosX(), this.getPosY(), this.getPosZ(), method1935.x, method1935.y, method1935.z, class8322);
                }
                else {
                    for (int i = 0; i < this.rand.nextInt(3) + 2; ++i) {
                        this.world.method6709(Class8432.field34636, this.getPosX(), this.getPosY(), this.getPosZ(), this.rand.nextGaussian() * 0.05, 0.005, this.rand.nextGaussian() * 0.05);
                    }
                }
            }
        }
        super.method1798(b);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method298("Life", this.field2497);
        class51.method298("LifeTime", this.field2498);
        final ItemStack class52 = this.dataManager.get(Class406.field2494);
        if (!class52.method27620()) {
            class51.method295("FireworksItem", class52.method27627(new Class51()));
        }
        class51.method312("ShotAtAngle", this.dataManager.get(Class406.field2496));
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2497 = class51.method319("Life");
        this.field2498 = class51.method319("LifeTime");
        final ItemStack method27619 = ItemStack.method27619(class51.method327("FireworksItem"));
        if (!method27619.method27620()) {
            this.dataManager.set(Class406.field2494, method27619);
        }
        if (class51.method315("ShotAtAngle")) {
            this.dataManager.set(Class406.field2496, class51.method329("ShotAtAngle"));
        }
    }
    
    @Override
    public ItemStack method2005() {
        final ItemStack class8321 = this.dataManager.get(Class406.field2494);
        return class8321.method27620() ? new ItemStack(Items.field31532) : class8321;
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
    
    @Override
    public void method1958(double n, double n2, double n3, final float n4, final float n5) {
        final float method35641 = MathHelper.sqrt(n * n + n2 * n2 + n3 * n3);
        n /= method35641;
        n2 /= method35641;
        n3 /= method35641;
        n += this.rand.nextGaussian() * 0.007499999832361937 * n5;
        n2 += this.rand.nextGaussian() * 0.007499999832361937 * n5;
        n3 += this.rand.nextGaussian() * 0.007499999832361937 * n5;
        n *= n4;
        n2 *= n4;
        n3 *= n4;
        this.setMotion(n, n2, n3);
    }
    
    static {
        field2494 = EntityDataManager.method33564(Class406.class, Class7709.field30659);
        field2495 = EntityDataManager.method33564(Class406.class, Class7709.field30670);
        field2496 = EntityDataManager.method33564(Class406.class, Class7709.field30661);
    }
}
