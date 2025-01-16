// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class Class425 extends Entity
{
    private static String[] field2582;
    private static final DataParameter<Integer> field2583;
    private boolean field2584;
    private int field2585;
    private final PlayerEntity field2586;
    private int field2587;
    private int field2588;
    private int field2589;
    private int field2590;
    private float field2591;
    public Entity field2592;
    private Class2064 field2593;
    private final int field2594;
    private final int field2595;
    
    private Class425(final World class1847, final PlayerEntity field2586, final int b, final int b2) {
        super(EntityType.field29059, class1847);
        this.field2593 = Class2064.field11816;
        this.ignoreFrustumCheck = true;
        this.field2586 = field2586;
        this.field2586.field3036 = this;
        this.field2594 = Math.max(0, b);
        this.field2595 = Math.max(0, b2);
    }
    
    public Class425(final World class1847, final PlayerEntity class1848, final double n, final double n2, final double n3) {
        this(class1847, class1848, 0, 0);
        this.setPosition(n, n2, n3);
        this.prevPosX = this.getPosX();
        this.prevPosY = this.getPosY();
        this.prevPosZ = this.getPosZ();
    }
    
    public Class425(final PlayerEntity playerEntity, final World class513, final int n, final int n2) {
        this(class513, playerEntity, n, n2);
        final float field2400 = this.field2586.rotationPitch;
        final float field2401 = this.field2586.rotationYaw;
        final float method35639 = MathHelper.cos(-field2401 * 0.017453292f - 3.1415927f);
        final float method35640 = MathHelper.sin(-field2401 * 0.017453292f - 3.1415927f);
        final float n3 = -MathHelper.cos(-field2400 * 0.017453292f);
        final float method35641 = MathHelper.sin(-field2400 * 0.017453292f);
        this.method1730(this.field2586.getPosX() - method35640 * 0.3, this.field2586.method1944(), this.field2586.getPosZ() - method35639 * 0.3, field2401, field2400);
        final Vec3d class514 = new Vec3d(-method35640, MathHelper.clamp(-(method35641 / n3), -5.0f, 5.0f), -method35639);
        final double method35642 = class514.length();
        final Vec3d method35643 = class514.mul(0.6 / method35642 + 0.5 + this.rand.nextGaussian() * 0.0045, 0.6 / method35642 + 0.5 + this.rand.nextGaussian() * 0.0045, 0.6 / method35642 + 0.5 + this.rand.nextGaussian() * 0.0045);
        this.method1936(method35643);
        this.rotationYaw = (float)(MathHelper.method35693(method35643.x, method35643.z) * 57.2957763671875);
        this.rotationPitch = (float)(MathHelper.method35693(method35643.y, MathHelper.sqrt(Entity.horizontalMag(method35643))) * 57.2957763671875);
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
    }
    
    @Override
    public void method1649() {
        this.method1650().register(Class425.field2583, 0);
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class425.field2583.equals(class8810)) {
            final int intValue = this.method1650().get(Class425.field2583);
            this.field2592 = ((intValue <= 0) ? null : this.world.getEntityByID(intValue - 1));
        }
        super.method1880(class8810);
    }
    
    @Override
    public boolean method1753(final double n) {
        return n < 4096.0;
    }
    
    @Override
    public void method1788(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2586 != null) {
            if (this.world.isRemote || !this.method2072()) {
                if (this.field2584) {
                    ++this.field2585;
                    if (this.field2585 >= 1200) {
                        this.method1652();
                        return;
                    }
                }
                float method21782 = 0.0f;
                final BlockPos class354 = new BlockPos(this);
                final IFluidState method21783 = this.world.getFluidState(class354);
                if (method21783.isTagged(Class7324.field28319)) {
                    method21782 = method21783.getActualHeight(this.world, class354);
                }
                Label_0094: {
                    if (this.field2593 != Class2064.field11816) {
                        if (this.field2593 == Class2064.field11817) {
                            if (this.field2592 != null) {
                                if (!this.field2592.removed) {
                                    this.setPosition(this.field2592.getPosX(), this.field2592.method1942(0.8), this.field2592.getPosZ());
                                }
                                else {
                                    this.field2592 = null;
                                    this.field2593 = Class2064.field11816;
                                }
                            }
                            return;
                        }
                        if (this.field2593 == Class2064.field11818) {
                            final Vec3d method21784 = this.getMotion();
                            double n = this.getPosY() + method21784.y - class354.getY() - method21782;
                            if (Math.abs(n) < 0.01) {
                                n += Math.signum(n) * 0.1;
                            }
                            this.setMotion(method21784.x * 0.9, method21784.y - n * this.rand.nextFloat() * 0.2, method21784.z * 0.9);
                            if (!this.world.isRemote) {
                                if (method21782 > 0.0f) {
                                    this.method2076(class354);
                                }
                            }
                        }
                    }
                    else {
                        if (this.field2592 != null) {
                            this.method1936(Vec3d.ZERO);
                            this.field2593 = Class2064.field11817;
                            return;
                        }
                        if (method21782 > 0.0f) {
                            this.method1936(this.getMotion().mul(0.3, 0.2, 0.3));
                            this.field2593 = Class2064.field11818;
                            return;
                        }
                        if (!this.world.isRemote) {
                            this.method2074();
                        }
                        if (!this.field2584) {
                            if (!this.onGround) {
                                if (!this.collidedHorizontally) {
                                    ++this.field2587;
                                    break Label_0094;
                                }
                            }
                        }
                        this.field2587 = 0;
                        this.method1936(Vec3d.ZERO);
                    }
                }
                if (!method21783.isTagged(Class7324.field28319)) {
                    this.method1936(this.getMotion().add(0.0, -0.03, 0.0));
                }
                this.method1671(Class2160.field12826, this.getMotion());
                this.method2073();
                this.method1936(this.getMotion().scale(0.92));
                this.method1657();
            }
        }
        else {
            this.method1652();
        }
    }
    
    private boolean method2072() {
        final ItemStack method2713 = this.field2586.getHeldItemMainhand();
        final ItemStack method2714 = this.field2586.method2714();
        final boolean b = method2713.getItem() == Items.field31376;
        final boolean b2 = method2714.getItem() == Items.field31376;
        if (!this.field2586.removed) {
            if (this.field2586.method1768()) {
                if (b || b2) {
                    if (this.method1734(this.field2586) <= 1024.0) {
                        return false;
                    }
                }
            }
        }
        this.method1652();
        return true;
    }
    
    private void method2073() {
        final Vec3d method1935 = this.getMotion();
        final float method1936 = MathHelper.sqrt(Entity.horizontalMag(method1935));
        this.rotationYaw = (float)(MathHelper.method35693(method1935.x, method1935.z) * 57.2957763671875);
        this.rotationPitch = (float)(MathHelper.method35693(method1935.y, method1936) * 57.2957763671875);
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
    }
    
    private void method2074() {
        final RayTraceResult method23093 = Class7476.method23093(this, this.getBoundingBox().expand(this.getMotion()).intersect(1.0), class399 -> {
            final boolean b;
            if (!class399.isSpectator()) {
                if (class399.method1749() || class399 instanceof Class427) {
                    if (class399 != this.field2586 || this.field2587 >= 5) {
                        return b;
                    }
                }
            }
            return b;
        }, RayTraceContext.BlockMode.COLLIDER, true);
        if (method23093.getType() != RayTraceResult.Type.MISS) {
            if (method23093.getType() != RayTraceResult.Type.ENTITY) {
                this.field2584 = true;
            }
            else {
                this.field2592 = ((Class7007)method23093).method21452();
                this.method2075();
            }
        }
    }
    
    private void method2075() {
        this.method1650().set(Class425.field2583, this.field2592.getEntityId() + 1);
    }
    
    private void method2076(final BlockPos class354) {
        final Class1849 class355 = (Class1849)this.world;
        int n = 1;
        final BlockPos method1137 = class354.method1137();
        if (this.rand.nextFloat() < 0.25f) {
            if (this.world.method6772(method1137)) {
                ++n;
            }
        }
        if (this.rand.nextFloat() < 0.5f) {
            if (!this.world.method6994(method1137)) {
                --n;
            }
        }
        if (this.field2588 <= 0) {
            if (this.field2590 <= 0) {
                if (this.field2589 <= 0) {
                    this.field2589 = MathHelper.method35658(this.rand, 100, 600);
                    this.field2589 -= this.field2595 * 20 * 5;
                }
                else {
                    this.field2589 -= n;
                    float n2 = 0.15f;
                    if (this.field2589 >= 20) {
                        if (this.field2589 >= 40) {
                            if (this.field2589 < 60) {
                                n2 += (float)((60 - this.field2589) * 0.01);
                            }
                        }
                        else {
                            n2 += (float)((40 - this.field2589) * 0.02);
                        }
                    }
                    else {
                        n2 += (float)((20 - this.field2589) * 0.05);
                    }
                    if (this.rand.nextFloat() < n2) {
                        final float n3 = MathHelper.method35659(this.rand, 0.0f, 360.0f) * 0.017453292f;
                        final float method1138 = MathHelper.method35659(this.rand, 25.0f, 60.0f);
                        final double n4 = this.getPosX() + MathHelper.sin(n3) * method1138 * 0.1f;
                        final double n5 = MathHelper.floor(this.getPosY()) + 1.0f;
                        final double n6 = this.getPosZ() + MathHelper.cos(n3) * method1138 * 0.1f;
                        if (class355.getBlockState(new BlockPos(n4, n5 - 1.0, n6)).method21696() == Blocks.field29173) {
                            class355.method6911(Class8432.field34646, n4, n5, n6, 2 + this.rand.nextInt(2), 0.10000000149011612, 0.0, 0.10000000149011612, 0.0);
                        }
                    }
                    if (this.field2589 <= 0) {
                        this.field2591 = MathHelper.method35659(this.rand, 0.0f, 360.0f);
                        this.field2590 = MathHelper.method35658(this.rand, 20, 80);
                    }
                }
            }
            else {
                this.field2590 -= n;
                if (this.field2590 <= 0) {
                    final Vec3d method1139 = this.getMotion();
                    this.setMotion(method1139.x, -0.4f * MathHelper.method35659(this.rand, 0.6f, 1.0f), method1139.z);
                    this.method1695(Class8520.field35037, 0.25f, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f);
                    final double n7 = this.getPosY() + 0.5;
                    class355.method6911(Class8432.field34601, this.getPosX(), n7, this.getPosZ(), (int)(1.0f + this.method1930() * 20.0f), this.method1930(), 0.0, this.method1930(), 0.20000000298023224);
                    class355.method6911(Class8432.field34622, this.getPosX(), n7, this.getPosZ(), (int)(1.0f + this.method1930() * 20.0f), this.method1930(), 0.0, this.method1930(), 0.20000000298023224);
                    this.field2588 = MathHelper.method35658(this.rand, 20, 40);
                }
                else {
                    this.field2591 += (float)(this.rand.nextGaussian() * 4.0);
                    final float n8 = this.field2591 * 0.017453292f;
                    final float method1140 = MathHelper.sin(n8);
                    final float method1141 = MathHelper.cos(n8);
                    final double n9 = this.getPosX() + method1140 * this.field2590 * 0.1f;
                    final double n10 = MathHelper.floor(this.getPosY()) + 1.0f;
                    final double n11 = this.getPosZ() + method1141 * this.field2590 * 0.1f;
                    if (class355.getBlockState(new BlockPos(n9, n10 - 1.0, n11)).method21696() == Blocks.field29173) {
                        if (this.rand.nextFloat() < 0.15f) {
                            class355.method6911(Class8432.field34601, n9, n10 - 0.10000000149011612, n11, 1, method1140, 0.1, method1141, 0.0);
                        }
                        final float n12 = method1140 * 0.04f;
                        final float n13 = method1141 * 0.04f;
                        class355.method6911(Class8432.field34622, n9, n10, n11, 0, n13, 0.01, -n12, 1.0);
                        class355.method6911(Class8432.field34622, n9, n10, n11, 0, -n13, 0.01, n12, 1.0);
                    }
                }
            }
        }
        else {
            --this.field2588;
            if (this.field2588 > 0) {
                this.method1936(this.getMotion().add(0.0, -0.2 * this.rand.nextFloat() * this.rand.nextFloat(), 0.0));
            }
            else {
                this.field2589 = 0;
                this.field2590 = 0;
            }
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
    }
    
    public int method2077(final ItemStack class8321) {
        if (!this.world.isRemote && this.field2586 != null) {
            int n = 0;
            if (this.field2592 == null) {
                if (this.field2588 > 0) {
                    final List<ItemStack> method34485 = this.world.getServer().method1581().method6402(Class9020.field38116).method34485(new Class9098((Class1849)this.world).method32877(Class6683.field26367, new BlockPos(this)).method32877(Class6683.field26370, class8321).method32873(this.rand).method32876(this.field2594 + this.field2586.method2907()).method32883(Class7104.field27714));
                    Class7770.field31804.method13808((Class513)this.field2586, class8321, this, method34485);
                    for (final ItemStack class8322 : method34485) {
                        final Class427 class8323 = new Class427(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), class8322);
                        final double n2 = this.field2586.getPosX() - this.getPosX();
                        final double n3 = this.field2586.getPosY() - this.getPosY();
                        final double n4 = this.field2586.getPosZ() - this.getPosZ();
                        class8323.setMotion(n2 * 0.1, n3 * 0.1 + Math.sqrt(Math.sqrt(n2 * n2 + n3 * n3 + n4 * n4)) * 0.08, n4 * 0.1);
                        this.world.method6886(class8323);
                        this.field2586.world.method6886(new Class508(this.field2586.world, this.field2586.getPosX(), this.field2586.getPosY() + 0.5, this.field2586.getPosZ() + 0.5, this.rand.nextInt(6) + 1));
                        if (!class8322.getItem().method11742(Class7855.field32272)) {
                            continue;
                        }
                        this.field2586.method2858(Class8276.field34020, 1);
                    }
                    n = 1;
                }
            }
            else {
                this.method2078();
                Class7770.field31804.method13808((Class513)this.field2586, class8321, this, (Collection<ItemStack>)Collections.emptyList());
                this.world.method6761(this, (byte)31);
                n = ((this.field2592 instanceof Class427) ? 3 : 5);
            }
            if (this.field2584) {
                n = 2;
            }
            this.method1652();
            return n;
        }
        return 0;
    }
    
    @Override
    public void method1798(final byte b) {
        if (b == 31) {
            if (this.world.isRemote) {
                if (this.field2592 instanceof PlayerEntity) {
                    if (((PlayerEntity)this.field2592).method2843()) {
                        this.method2078();
                    }
                }
            }
        }
        super.method1798(b);
    }
    
    public void method2078() {
        if (this.field2586 != null) {
            this.field2592.method1936(this.field2592.getMotion().add(new Vec3d(this.field2586.getPosX() - this.getPosX(), this.field2586.getPosY() - this.getPosY(), this.field2586.getPosZ() - this.getPosZ()).scale(0.1)));
        }
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1652() {
        super.method1652();
        if (this.field2586 != null) {
            this.field2586.field3036 = null;
        }
    }
    
    @Nullable
    public PlayerEntity method2079() {
        return this.field2586;
    }
    
    @Override
    public boolean method1855() {
        return false;
    }
    
    @Override
    public IPacket<?> method1932() {
        final PlayerEntity method2079 = this.method2079();
        return new Class4339(this, (method2079 != null) ? method2079.getEntityId() : this.getEntityId());
    }
    
    static {
        field2583 = EntityDataManager.method33564(Class425.class, Class7709.field30654);
    }
}
