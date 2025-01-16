// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Iterator;

public class Class424 extends Entity
{
    private BlockState field2573;
    public int field2574;
    public boolean field2575;
    private boolean field2576;
    private boolean field2577;
    private int field2578;
    private float field2579;
    public CompoundNBT field2580;
    public static final DataParameter<BlockPos> field2581;
    
    public Class424(final EntityType<? extends Class424> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2573 = Class7521.field29175.getDefaultState();
        this.field2575 = true;
        this.field2578 = 40;
        this.field2579 = 2.0f;
    }
    
    public Class424(final World class1847, final double field2392, final double field2393, final double field2394, final BlockState field2395) {
        this(EntityType.field28983, class1847);
        this.field2573 = field2395;
        this.preventEntitySpawning = true;
        this.setPosition(field2392, field2393 + (1.0f - this.method1931()) / 2.0f, field2394);
        this.method1936(Vec3d.ZERO);
        this.prevPosX = field2392;
        this.prevPosY = field2393;
        this.prevPosZ = field2394;
        this.method2067(new BlockPos(this));
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    public void method2067(final BlockPos class354) {
        this.dataManager.set(Class424.field2581, class354);
    }
    
    public BlockPos method2068() {
        return this.dataManager.get(Class424.field2581);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1649() {
        this.dataManager.register(Class424.field2581, BlockPos.ZERO);
    }
    
    @Override
    public boolean method1749() {
        return !this.removed;
    }
    
    @Override
    public void method1659() {
        if (!this.field2573.method21706()) {
            final Block method21696 = this.field2573.getBlock();
            if (this.field2574++ == 0) {
                final BlockPos class354 = new BlockPos(this);
                if (this.world.getBlockState(class354).method21696() != method21696) {
                    if (!this.world.isRemote) {
                        this.method1652();
                        return;
                    }
                }
                else {
                    this.world.method6690(class354, false);
                }
            }
            if (!this.method1698()) {
                this.method1936(this.getMotion().add(0.0, -0.04, 0.0));
            }
            this.method1671(Class2160.field12826, this.getMotion());
            Label_0060: {
                if (!this.world.isRemote) {
                    BlockPos method21697 = new BlockPos(this);
                    final boolean b = this.field2573.getBlock() instanceof Class3988;
                    boolean b2 = b && this.world.getFluidState(method21697).isTagged(Class7324.field28319);
                    final double method21698 = this.getMotion().lengthSquared();
                    if (b) {
                        if (method21698 > 1.0) {
                            final BlockRayTraceResult method21699 = this.world.rayTraceBlocks(new RayTraceContext(new Vec3d(this.prevPosX, this.prevPosY, this.prevPosZ), this.method1934(), RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.SOURCE_ONLY, this));
                            if (method21699.getType() != RayTraceResult.Type.MISS) {
                                if (this.world.getFluidState(method21699.getPos()).isTagged(Class7324.field28319)) {
                                    method21697 = method21699.getPos();
                                    b2 = true;
                                }
                            }
                        }
                    }
                    if (!this.onGround && !b2) {
                        if (!this.world.isRemote) {
                            Label_0461: {
                                if (this.field2574 > 100) {
                                    if (method21697.getY() < 1) {
                                        break Label_0461;
                                    }
                                    if (method21697.getY() > 256) {
                                        break Label_0461;
                                    }
                                }
                                if (this.field2574 <= 600) {
                                    break Label_0060;
                                }
                            }
                            if (this.field2575) {
                                if (this.world.method6765().method31216(Class8878.field37321)) {
                                    this.method1764(method21696);
                                }
                            }
                            this.method1652();
                        }
                    }
                    else {
                        final BlockState method21700 = this.world.getBlockState(method21697);
                        this.method1936(this.getMotion().mul(0.7, -0.5, 0.7));
                        if (method21700.getBlock() != Class7521.field29264) {
                            this.method1652();
                            if (this.field2576) {
                                if (method21696 instanceof Class3986) {
                                    ((Class3986)method21696).method12133(this.world, method21697);
                                }
                            }
                            else {
                                final boolean method21701 = method21700.method21750(new Class7073(this.world, method21697, Direction.DOWN, ItemStack.field34174, Direction.UP));
                                final boolean b3 = Class3986.method12131(this.world.getBlockState(method21697.method1139())) && (!b || !b2);
                                final boolean b4 = this.field2573.method21752(this.world, method21697) && !b3;
                                if (method21701 && b4) {
                                    if (this.field2573.method21771((IProperty<Comparable>)Class8970.field37747)) {
                                        if (this.world.getFluidState(method21697).getFluid() == Class7558.field29976) {
                                            this.field2573 = ((StateHolder<O, BlockState>)this.field2573).with((IProperty<Comparable>)Class8970.field37747, true);
                                        }
                                    }
                                    if (!this.world.setBlockState(method21697, this.field2573, 3)) {
                                        if (this.field2575) {
                                            if (this.world.method6765().method31216(Class8878.field37321)) {
                                                this.method1764(method21696);
                                            }
                                        }
                                    }
                                    else {
                                        if (method21696 instanceof Class3986) {
                                            ((Class3986)method21696).method12132(this.world, method21697, this.field2573, method21700);
                                        }
                                        if (this.field2580 != null) {
                                            if (method21696 instanceof Class3840) {
                                                final TileEntity method21702 = this.world.getTileEntity(method21697);
                                                if (method21702 != null) {
                                                    final CompoundNBT method21703 = method21702.method2180(new CompoundNBT());
                                                    for (final String anObject : this.field2580.keySet()) {
                                                        final INBT method21704 = this.field2580.get(anObject);
                                                        if ("x".equals(anObject)) {
                                                            continue;
                                                        }
                                                        if ("y".equals(anObject)) {
                                                            continue;
                                                        }
                                                        if ("z".equals(anObject)) {
                                                            continue;
                                                        }
                                                        method21703.put(anObject, method21704.copy());
                                                    }
                                                    method21702.method2179(method21703);
                                                    method21702.method2161();
                                                }
                                            }
                                        }
                                    }
                                }
                                else if (this.field2575) {
                                    if (this.world.method6765().method31216(Class8878.field37321)) {
                                        this.method1764(method21696);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.method1936(this.getMotion().scale(0.98));
        }
        else {
            this.method1652();
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        if (this.field2577) {
            final int method35649 = MathHelper.ceil(n - 1.0f);
            if (method35649 > 0) {
                final ArrayList arrayList = Lists.newArrayList((Iterable)this.world.method7127(this, this.getBoundingBox()));
                final boolean method35650 = this.field2573.method21755(Class7188.field27905);
                final DamageSource class7929 = method35650 ? DamageSource.field32578 : DamageSource.field32579;
                final Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    ((Entity)iterator.next()).attackEntityFrom(class7929, (float)Math.min(MathHelper.method35642(method35649 * this.field2579), this.field2578));
                }
                if (method35650) {
                    if (this.rand.nextFloat() < 0.05000000074505806 + method35649 * 0.05) {
                        final BlockState method35651 = Class3990.method12139(this.field2573);
                        if (method35651 != null) {
                            this.field2573 = method35651;
                        }
                        else {
                            this.field2576 = true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        class51.put("BlockState", Class9346.method34649(this.field2573));
        class51.putInt("Time", this.field2574);
        class51.putBoolean("DropItem", this.field2575);
        class51.putBoolean("HurtEntities", this.field2577);
        class51.putFloat("FallHurtAmount", this.field2579);
        class51.putInt("FallHurtMax", this.field2578);
        if (this.field2580 != null) {
            class51.put("TileEntityData", this.field2580);
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        this.field2573 = Class9346.method34647(class51.getCompound("BlockState"));
        this.field2574 = class51.getInt("Time");
        if (!class51.contains("HurtEntities", 99)) {
            if (this.field2573.method21755(Class7188.field27905)) {
                this.field2577 = true;
            }
        }
        else {
            this.field2577 = class51.getBoolean("HurtEntities");
            this.field2579 = class51.getFloat("FallHurtAmount");
            this.field2578 = class51.getInt("FallHurtMax");
        }
        if (class51.contains("DropItem", 99)) {
            this.field2575 = class51.getBoolean("DropItem");
        }
        if (class51.contains("TileEntityData", 10)) {
            this.field2580 = class51.getCompound("TileEntityData");
        }
        if (this.field2573.method21706()) {
            this.field2573 = Class7521.field29175.getDefaultState();
        }
    }
    
    public World method2069() {
        return this.world;
    }
    
    public void method2070(final boolean field2577) {
        this.field2577 = field2577;
    }
    
    @Override
    public boolean method1863() {
        return false;
    }
    
    @Override
    public void method1862(final CrashReportCategory class5204) {
        super.method1862(class5204);
        class5204.addDetail("Immitating BlockState", this.field2573.toString());
    }
    
    public BlockState method2071() {
        return this.field2573;
    }
    
    @Override
    public boolean method1905() {
        return true;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this, Block.method11774(this.method2071()));
    }
    
    static {
        field2581 = EntityDataManager.method33564(Class424.class, Class7709.field30664);
    }
}
