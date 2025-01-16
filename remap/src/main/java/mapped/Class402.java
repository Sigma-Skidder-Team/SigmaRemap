// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Arrays;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.UUID;
import java.util.Optional;

public abstract class Class402 extends Entity implements Class401
{
    private static final DataParameter<Byte> field2468;
    public static final DataParameter<Optional<UUID>> field2469;
    private static final DataParameter<Byte> field2470;
    private Class7096 field2471;
    public boolean field2472;
    public int field2473;
    public Class2151 field2474;
    public int field2475;
    public UUID field2476;
    private int field2477;
    private int field2478;
    private double field2479;
    private int field2480;
    private Class7795 field2481;
    private IntOpenHashSet field2482;
    private List<Entity> field2483;
    
    public Class402(final EntityType<? extends Class402> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2474 = Class2151.field12782;
        this.field2479 = 2.0;
        this.field2481 = this.method1968();
    }
    
    public Class402(final EntityType<? extends Class402> class7499, final double n, final double n2, final double n3, final World class7500) {
        this(class7499, class7500);
        this.setPosition(n, n2, n3);
    }
    
    public Class402(final EntityType<? extends Class402> class7499, final LivingEntity class7500, final World class7501) {
        this(class7499, class7500.getPosX(), class7500.method1944() - 0.10000000149011612, class7500.getPosZ(), class7501);
        this.method1972(class7500);
        if (class7500 instanceof PlayerEntity) {
            this.field2474 = Class2151.field12783;
        }
    }
    
    public void method1962(final Class7795 field2481) {
        this.field2481 = field2481;
    }
    
    @Override
    public boolean method1753(final double n) {
        double v = this.getBoundingBox().getAverageEdgeLength() * 10.0;
        if (Double.isNaN(v)) {
            v = 1.0;
        }
        final double n2 = v * 64.0 * method1869();
        return n < n2 * n2;
    }
    
    @Override
    public void method1649() {
        this.dataManager.register(Class402.field2468, (Byte)0);
        this.dataManager.register(Class402.field2469, Optional.empty());
        this.dataManager.register(Class402.field2470, (Byte)0);
    }
    
    public void method1963(final Entity class399, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.method1958(-MathHelper.sin(n2 * 0.017453292f) * MathHelper.cos(n * 0.017453292f), -MathHelper.sin(n * 0.017453292f), MathHelper.cos(n2 * 0.017453292f) * MathHelper.cos(n * 0.017453292f), n4, n5);
        this.method1936(this.getMotion().add(class399.getMotion().x, class399.onGround ? 0.0 : class399.getMotion().y, class399.getMotion().z));
    }
    
    @Override
    public void method1958(final double n, final double n2, final double n3, final float n4, final float n5) {
        final Vec3d method16748 = new Vec3d(n, n2, n3).normalize().add(this.rand.nextGaussian() * 0.007499999832361937 * n5, this.rand.nextGaussian() * 0.007499999832361937 * n5, this.rand.nextGaussian() * 0.007499999832361937 * n5).scale(n4);
        this.method1936(method16748);
        final float method16749 = MathHelper.sqrt(Entity.horizontalMag(method16748));
        this.rotationYaw = (float)(MathHelper.method35693(method16748.x, method16748.z) * 57.2957763671875);
        this.rotationPitch = (float)(MathHelper.method35693(method16748.y, method16749) * 57.2957763671875);
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
        this.field2477 = 0;
    }
    
    @Override
    public void method1788(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
        this.setPosition(n, n2, n3);
        this.method1655(n4, n5);
    }
    
    @Override
    public void method1797(final double n, final double n2, final double n3) {
        this.setMotion(n, n2, n3);
        if (this.prevRotationPitch == 0.0f) {
            if (this.prevRotationYaw == 0.0f) {
                this.rotationPitch = (float)(MathHelper.method35693(n2, MathHelper.sqrt(n * n + n3 * n3)) * 57.2957763671875);
                this.rotationYaw = (float)(MathHelper.method35693(n, n3) * 57.2957763671875);
                this.prevRotationPitch = this.rotationPitch;
                this.prevRotationYaw = this.rotationYaw;
                this.method1730(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
                this.field2477 = 0;
            }
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        final boolean method1987 = this.method1987();
        final Vec3d method1988 = this.getMotion();
        if (this.prevRotationPitch == 0.0f) {
            if (this.prevRotationYaw == 0.0f) {
                final float method1989 = MathHelper.sqrt(Entity.horizontalMag(method1988));
                this.rotationYaw = (float)(MathHelper.method35693(method1988.x, method1988.z) * 57.2957763671875);
                this.rotationPitch = (float)(MathHelper.method35693(method1988.y, method1989) * 57.2957763671875);
                this.prevRotationYaw = this.rotationYaw;
                this.prevRotationPitch = this.rotationPitch;
            }
        }
        final BlockPos class354 = new BlockPos(this);
        final Class7096 method1990 = this.world.getBlockState(class354);
        if (!method1990.method21706()) {
            if (!method1987) {
                final VoxelShape method1991 = method1990.method21727(this.world, class354);
                if (!method1991.isEmpty()) {
                    final Vec3d method1992 = this.method1934();
                    final Iterator<AxisAlignedBB> iterator = method1991.toBoundingBoxList().iterator();
                    while (iterator.hasNext()) {
                        if (!iterator.next().offset(class354).contains(method1992)) {
                            continue;
                        }
                        this.field2472 = true;
                        break;
                    }
                }
            }
        }
        if (this.field2475 > 0) {
            --this.field2475;
        }
        if (this.method1709()) {
            this.method1667();
        }
        if (this.field2472 && !method1987) {
            if (this.field2471 != method1990 && this.world.method6976(this.getBoundingBox().intersect(0.06))) {
                this.field2472 = false;
                this.method1936(method1988.mul(this.rand.nextFloat() * 0.2f, this.rand.nextFloat() * 0.2f, this.rand.nextFloat() * 0.2f));
                this.field2477 = 0;
                this.field2478 = 0;
            }
            else if (!this.world.isRemote) {
                this.method1964();
            }
            ++this.field2473;
        }
        else {
            this.field2473 = 0;
            ++this.field2478;
            final Vec3d method1993 = this.method1934();
            Vec3d class355 = method1993.add(method1988);
            RayTraceResult method1994 = this.world.rayTraceBlocks(new RayTraceContext(method1993, class355, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this));
            if (method1994.getType() != RayTraceResult.Type.MISS) {
                class355 = method1994.getHitVec();
            }
            while (!this.removed) {
                Class7007 method1995 = this.method1971(method1993, class355);
                if (method1995 != null) {
                    method1994 = method1995;
                }
                if (method1994 != null) {
                    if (method1994.getType() == RayTraceResult.Type.ENTITY) {
                        final Entity method1996 = ((Class7007)method1994).method21452();
                        final Entity method1997 = this.method1973();
                        if (method1996 instanceof PlayerEntity) {
                            if (method1997 instanceof PlayerEntity) {
                                if (!((PlayerEntity)method1997).method2826((PlayerEntity)method1996)) {
                                    method1994 = null;
                                    method1995 = null;
                                }
                            }
                        }
                    }
                }
                if (method1994 != null) {
                    if (!method1987) {
                        this.method1965(method1994);
                        this.isAirBorne = true;
                    }
                }
                if (method1995 == null) {
                    break;
                }
                if (this.method1983() <= 0) {
                    break;
                }
                method1994 = null;
            }
            final Vec3d method1998 = this.getMotion();
            final double field22770 = method1998.x;
            final double field22771 = method1998.y;
            final double field22772 = method1998.z;
            if (this.method1981()) {
                for (int i = 0; i < 4; ++i) {
                    this.world.method6709(Class8432.field34603, this.getPosX() + field22770 * i / 4.0, this.getPosY() + field22771 * i / 4.0, this.getPosZ() + field22772 * i / 4.0, -field22770, -field22771 + 0.2, -field22772);
                }
            }
            final double n = this.getPosX() + field22770;
            final double n2 = this.getPosY() + field22771;
            final double n3 = this.getPosZ() + field22772;
            final float method1999 = MathHelper.sqrt(Entity.horizontalMag(method1998));
            if (!method1987) {
                this.rotationYaw = (float)(MathHelper.method35693(field22770, field22772) * 57.2957763671875);
            }
            else {
                this.rotationYaw = (float)(MathHelper.method35693(-field22770, -field22772) * 57.2957763671875);
            }
            this.rotationPitch = (float)(MathHelper.method35693(field22771, method1999) * 57.2957763671875);
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
            float method2000 = 0.99f;
            if (this.method1706()) {
                for (int j = 0; j < 4; ++j) {
                    this.world.method6709(Class8432.field34601, n - field22770 * 0.25, n2 - field22771 * 0.25, n3 - field22772 * 0.25, field22770, field22771, field22772);
                }
                method2000 = this.method1985();
            }
            this.method1936(method1998.scale(method2000));
            if (!this.method1698()) {
                if (!method1987) {
                    final Vec3d method2001 = this.getMotion();
                    this.setMotion(method2001.x, method2001.y - 0.05000000074505806, method2001.z);
                }
            }
            this.setPosition(n, n2, n3);
            this.method1689();
        }
    }
    
    public void method1964() {
        ++this.field2477;
        if (this.field2477 >= 1200) {
            this.method1652();
        }
    }
    
    public void method1965(final RayTraceResult class7006) {
        final RayTraceResult.Type method21449 = class7006.getType();
        if (method21449 != RayTraceResult.Type.ENTITY) {
            if (method21449 == RayTraceResult.Type.BLOCK) {
                final BlockRayTraceResult class7007 = (BlockRayTraceResult)class7006;
                final Class7096 method21450 = this.world.getBlockState(class7007.getPos());
                this.field2471 = method21450;
                final Vec3d method21451 = class7007.getHitVec().subtract(this.getPosX(), this.getPosY(), this.getPosZ());
                this.method1936(method21451);
                final Vec3d method21452 = method21451.normalize().scale(0.05000000074505806);
                this.method1948(this.getPosX() - method21452.x, this.getPosY() - method21452.y, this.getPosZ() - method21452.z);
                this.method1695(this.method1969(), 1.0f, 1.2f / (this.rand.nextFloat() * 0.2f + 0.9f));
                this.field2472 = true;
                this.field2475 = 7;
                this.method1978(false);
                this.method1979((byte)0);
                this.method1962(Class8520.field34991);
                this.method1988(false);
                this.method1966();
                method21450.method21760(this.world, method21450, class7007, this);
            }
        }
        else {
            this.method1967((Class7007)class7006);
        }
    }
    
    private void method1966() {
        if (this.field2483 != null) {
            this.field2483.clear();
        }
        if (this.field2482 != null) {
            this.field2482.clear();
        }
    }
    
    public void method1967(final Class7007 class7007) {
        final Entity method21452 = class7007.method21452();
        int method21453 = MathHelper.ceil(Math.max((float)this.getMotion().length() * this.field2479, 0.0));
        if (this.method1983() > 0) {
            if (this.field2482 == null) {
                this.field2482 = new IntOpenHashSet(5);
            }
            if (this.field2483 == null) {
                this.field2483 = Lists.newArrayListWithCapacity(5);
            }
            if (this.field2482.size() >= this.method1983() + 1) {
                this.method1652();
                return;
            }
            this.field2482.add(method21452.getEntityId());
        }
        if (this.method1981()) {
            method21453 += this.rand.nextInt(method21453 / 2 + 2);
        }
        final Entity method21454 = this.method1973();
        DamageSource class7008;
        if (method21454 != null) {
            class7008 = DamageSource.method25696(this, method21454);
            if (method21454 instanceof LivingEntity) {
                ((LivingEntity)method21454).method2639(method21452);
            }
        }
        else {
            class7008 = DamageSource.method25696(this, this);
        }
        final boolean b = method21452.getType() == EntityType.field28977;
        final int method21455 = method21452.method1666();
        if (this.method1804()) {
            if (!b) {
                method21452.setFire(5);
            }
        }
        if (!method21452.attackEntityFrom(class7008, (float)method21453)) {
            method21452.method1665(method21455);
            this.method1936(this.getMotion().scale(-0.1));
            this.rotationYaw += 180.0f;
            this.prevRotationYaw += 180.0f;
            this.field2478 = 0;
            if (!this.world.isRemote) {
                if (this.getMotion().lengthSquared() < 1.0E-7) {
                    if (this.field2474 == Class2151.field12783) {
                        this.method1767(this.method1974(), 0.1f);
                    }
                    this.method1652();
                }
            }
        }
        else {
            if (b) {
                return;
            }
            if (method21452 instanceof LivingEntity) {
                final LivingEntity class7009 = (LivingEntity)method21452;
                if (!this.world.isRemote) {
                    if (this.method1983() <= 0) {
                        class7009.method2703(class7009.method2702() + 1);
                    }
                }
                if (this.field2480 > 0) {
                    final Vec3d method21456 = this.getMotion().mul(1.0, 0.0, 1.0).normalize().scale(this.field2480 * 0.6);
                    if (method21456.lengthSquared() > 0.0) {
                        class7009.method1738(method21456.x, 0.1, method21456.z);
                    }
                }
                if (!this.world.isRemote) {
                    if (method21454 instanceof LivingEntity) {
                        Class8742.method30204(class7009, method21454);
                        Class8742.method30205((LivingEntity)method21454, class7009);
                    }
                }
                this.method1970(class7009);
                if (method21454 != null) {
                    if (class7009 != method21454) {
                        if (class7009 instanceof PlayerEntity) {
                            if (method21454 instanceof Class513) {
                                ((Class513)method21454).field3039.method17469(new Class4306(6, 0.0f));
                            }
                        }
                    }
                }
                if (!method21452.method1768()) {
                    if (this.field2483 != null) {
                        this.field2483.add(class7009);
                    }
                }
                if (!this.world.isRemote) {
                    if (method21454 instanceof Class513) {
                        final Class513 class7010 = (Class513)method21454;
                        if (this.field2483 != null && this.method1982()) {
                            Class7770.field31807.method13831(class7010, this.field2483, this.field2483.size());
                        }
                        else if (!method21452.method1768()) {
                            if (this.method1982()) {
                                Class7770.field31807.method13831(class7010, Arrays.asList(method21452), 0);
                            }
                        }
                    }
                }
            }
            this.method1695(this.field2481, 1.0f, 1.2f / (this.rand.nextFloat() * 0.2f + 0.9f));
            if (this.method1983() <= 0) {
                this.method1652();
            }
        }
    }
    
    public Class7795 method1968() {
        return Class8520.field34991;
    }
    
    public final Class7795 method1969() {
        return this.field2481;
    }
    
    public void method1970(final LivingEntity class511) {
    }
    
    @Nullable
    public Class7007 method1971(final Vec3d class5487, final Vec3d class5488) {
        return Class7476.method23094(this.world, this, class5487, class5488, this.getBoundingBox().expand(this.getMotion()).intersect(1.0), class5489 -> {
            final boolean b;
            if (!class5489.isSpectator()) {
                if (!(!class5489.method1768())) {
                    if (!(!class5489.method1749())) {
                        if (class5489 != this.method1973() || this.field2478 >= 5) {
                            if (this.field2482 == null || !this.field2482.contains(class5489.getEntityId())) {
                                return b;
                            }
                        }
                    }
                }
            }
            return b;
        });
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        class51.putShort("life", (short)this.field2477);
        if (this.field2471 != null) {
            class51.put("inBlockState", Class9346.method34649(this.field2471));
        }
        class51.putByte("shake", (byte)this.field2475);
        class51.putBoolean("inGround", this.field2472);
        class51.putByte("pickup", (byte)this.field2474.ordinal());
        class51.putDouble("damage", this.field2479);
        class51.putBoolean("crit", this.method1981());
        class51.putByte("PierceLevel", this.method1983());
        if (this.field2476 != null) {
            class51.putUniqueId("OwnerUUID", this.field2476);
        }
        class51.putString("SoundEvent", Registry.field205.getKey(this.field2481).toString());
        class51.putBoolean("ShotFromCrossbow", this.method1982());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        this.field2477 = class51.getShort("life");
        if (class51.contains("inBlockState", 10)) {
            this.field2471 = Class9346.method34647(class51.getCompound("inBlockState"));
        }
        this.field2475 = (class51.getByte("shake") & 0xFF);
        this.field2472 = class51.getBoolean("inGround");
        if (class51.contains("damage", 99)) {
            this.field2479 = class51.getDouble("damage");
        }
        if (!class51.contains("pickup", 99)) {
            if (class51.contains("player", 99)) {
                this.field2474 = (class51.getBoolean("player") ? Class2151.field12783 : Class2151.field12782);
            }
        }
        else {
            this.field2474 = Class2151.method8320(class51.getByte("pickup"));
        }
        this.method1978(class51.getBoolean("crit"));
        this.method1979(class51.getByte("PierceLevel"));
        if (class51.hasUniqueId("OwnerUUID")) {
            this.field2476 = class51.getUniqueId("OwnerUUID");
        }
        if (class51.contains("SoundEvent", 8)) {
            this.field2481 = Registry.field205.method506(new ResourceLocation(class51.getString("SoundEvent"))).orElse(this.method1968());
        }
        this.method1988(class51.getBoolean("ShotFromCrossbow"));
    }
    
    public void method1972(final Entity class399) {
        this.field2476 = ((class399 != null) ? class399.method1865() : null);
        if (class399 instanceof PlayerEntity) {
            this.field2474 = (((PlayerEntity)class399).field3025.field27304 ? Class2151.field12784 : Class2151.field12783);
        }
    }
    
    @Nullable
    public Entity method1973() {
        return (this.field2476 != null && this.world instanceof Class1849) ? ((Class1849)this.world).method6914(this.field2476) : null;
    }
    
    @Override
    public void method1736(final PlayerEntity playerEntity) {
        if (!this.world.isRemote) {
            if (this.field2472 || this.method1987()) {
                if (this.field2475 <= 0) {
                    int n = 0;
                    Label_0122: {
                        if (this.field2474 != Class2151.field12783) {
                            if (this.field2474 != Class2151.field12784 || !playerEntity.field3025.field27304) {
                                if (!this.method1987() || this.method1973().method1865() != playerEntity.method1865()) {
                                    n = 0;
                                    break Label_0122;
                                }
                            }
                        }
                        n = 1;
                    }
                    int n2 = n;
                    if (this.field2474 == Class2151.field12783) {
                        if (!playerEntity.field3006.method2362(this.method1974())) {
                            n2 = 0;
                        }
                    }
                    if (n2 != 0) {
                        playerEntity.method2746(this, 1);
                        this.method1652();
                    }
                }
            }
        }
    }
    
    public abstract ItemStack method1974();
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    public void method1975(final double field2479) {
        this.field2479 = field2479;
    }
    
    public double method1976() {
        return this.field2479;
    }
    
    public void method1977(final int field2480) {
        this.field2480 = field2480;
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    @Override
    public float method1890(final Pose class290, final EntitySize class291) {
        return 0.0f;
    }
    
    public void method1978(final boolean b) {
        this.method1980(1, b);
    }
    
    public void method1979(final byte b) {
        this.dataManager.set(Class402.field2470, b);
    }
    
    private void method1980(final int n, final boolean b) {
        final byte byteValue = this.dataManager.get(Class402.field2468);
        if (!b) {
            this.dataManager.set(Class402.field2468, (byte)(byteValue & ~n));
        }
        else {
            this.dataManager.set(Class402.field2468, (byte)(byteValue | n));
        }
    }
    
    public boolean method1981() {
        this.dataManager.get(Class402.field2468).byteValue();
        return false;
    }
    
    public boolean method1982() {
        this.dataManager.get(Class402.field2468).byteValue();
        return false;
    }
    
    public byte method1983() {
        return this.dataManager.get(Class402.field2470);
    }
    
    public void method1984(final LivingEntity class511, final float n) {
        final int method30206 = Class8742.method30206(Class7882.field32369, class511);
        final int method30207 = Class8742.method30206(Class7882.field32370, class511);
        this.method1975(n * 2.0f + this.rand.nextGaussian() * 0.25 + this.world.method6954().method8235() * 0.11f);
        if (method30206 > 0) {
            this.method1975(this.method1976() + method30206 * 0.5 + 0.5);
        }
        if (method30207 > 0) {
            this.method1977(method30207);
        }
        if (Class8742.method30206(Class7882.field32371, class511) > 0) {
            this.setFire(100);
        }
    }
    
    public float method1985() {
        return 0.6f;
    }
    
    public void method1986(final boolean field2421) {
        this.method1980(2, this.noClip = field2421);
    }
    
    public boolean method1987() {
        if (this.world.isRemote) {
            return (this.dataManager.get(Class402.field2468) & 0x2) != 0x0;
        }
        return this.noClip;
    }
    
    public void method1988(final boolean b) {
        this.method1980(4, b);
    }
    
    @Override
    public IPacket<?> method1932() {
        final Entity method1973 = this.method1973();
        return new Class4339(this, (method1973 != null) ? method1973.getEntityId() : 0);
    }
    
    static {
        field2468 = EntityDataManager.method33564(Class402.class, Class7709.field30653);
        field2469 = EntityDataManager.method33564(Class402.class, Class7709.field30667);
        field2470 = EntityDataManager.method33564(Class402.class, Class7709.field30653);
    }
}
