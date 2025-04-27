// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.*;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Predicate;
import java.util.Optional;
import java.util.UUID;

public class Class850 extends Class763
{
    private static final UUID field4518;
    private static final Class7919 field4519;
    private static final DataParameter<Optional<BlockState>> field4520;
    private static final DataParameter<Boolean> field4521;
    private static final DataParameter<Boolean> field4522;
    private static final Predicate<LivingEntity> field4523;
    private int field4524;
    private int field4525;
    
    public Class850(final EntityType<? extends Class850> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4524 = Integer.MIN_VALUE;
        this.stepHeight = 1.0f;
        this.method4145(Class257.field1211, -1.0f);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3447(this));
        this.field4114.method22062(2, new Class3574(this, 1.0, false));
        this.field4114.method22062(7, new Class3517(this, 1.0, 0.0f));
        this.field4114.method22062(8, new Class3628(this, PlayerEntity.class, 8.0f));
        this.field4114.method22062(8, new Class3503(this));
        this.field4114.method22062(10, new Class3494(this));
        this.field4114.method22062(11, new Class3454(this));
        this.field4115.method22062(1, new Class3557(this));
        this.field4115.method22062(2, new Class3547(this, new Class[0]));
        this.field4115.method22062(3, new Class3555<Object>(this, Class842.class, 10, true, false, Class850.field4523));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(40.0);
        this.method2710(Class8107.field33408).method23941(0.30000001192092896);
        this.method2710(Class8107.field33410).method23941(7.0);
        this.method2710(Class8107.field33406).method23941(64.0);
    }
    
    @Override
    public void method4153(final LivingEntity class511) {
        super.method4153(class511);
        final Class7619 method2710 = this.method2710(Class8107.field33408);
        if (class511 != null) {
            this.field4525 = this.ticksExisted;
            this.dataManager.set(Class850.field4521, true);
            if (!method2710.method23944(Class850.field4519)) {
                method2710.method23946(Class850.field4519);
            }
        }
        else {
            this.field4525 = 0;
            this.dataManager.set(Class850.field4521, false);
            this.dataManager.set(Class850.field4522, false);
            method2710.method23947(Class850.field4519);
        }
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class850.field4520, Optional.empty());
        this.dataManager.register(Class850.field4521, false);
        this.dataManager.register(Class850.field4522, false);
    }
    
    public void method5074() {
        if (this.ticksExisted >= this.field4524 + 400) {
            this.field4524 = this.ticksExisted;
            if (!this.method1696()) {
                this.world.method6708(this.getPosX(), this.method1944(), this.getPosZ(), Class8520.field35166, this.method1922(), 2.5f, 1.0f, false);
            }
        }
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class850.field4521.equals(class8810)) {
            if (this.method5082()) {
                if (this.world.isRemote) {
                    this.method5074();
                }
            }
        }
        super.method1880(class8810);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        final BlockState method5080 = this.method5080();
        if (method5080 != null) {
            class51.put("carriedBlockState", Class9346.method34649(method5080));
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        BlockState method34647 = null;
        if (class51.contains("carriedBlockState", 10)) {
            method34647 = Class9346.method34647(class51.getCompound("carriedBlockState"));
            if (method34647.method21706()) {
                method34647 = null;
            }
        }
        this.method5079(method34647);
    }
    
    private boolean method5075(final PlayerEntity playerEntity) {
        if (playerEntity.inventory.field2740.get(3).getItem() != Blocks.field29342.method11704()) {
            final Vec3d method16738 = playerEntity.method1741(1.0f).normalize();
            final Vec3d class513 = new Vec3d(this.getPosX() - playerEntity.getPosX(), this.method1944() - playerEntity.method1944(), this.getPosZ() - playerEntity.getPosZ());
            return method16738.dotProduct(class513.normalize()) > 1.0 - 0.025 / class513.length() && playerEntity.method2747(this);
        }
        return false;
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return 2.55f;
    }
    
    @Override
    public void method2736() {
        if (this.world.isRemote) {
            for (int i = 0; i < 2; ++i) {
                this.world.method6709(Class8432.field34637, this.method1940(0.5), this.method1943() - 0.25, this.method1947(0.5), (this.rand.nextDouble() - 0.5) * 2.0, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5) * 2.0);
            }
        }
        this.field2967 = false;
        super.method2736();
    }
    
    @Override
    public void method4172() {
        if (this.method1710()) {
            this.attackEntityFrom(DamageSource.field32569, 1.0f);
        }
        if (this.world.method6703()) {
            if (this.ticksExisted >= this.field4525 + 600) {
                final float method1726 = this.method1726();
                if (method1726 > 0.5f) {
                    if (this.world.method6994(new BlockPos(this))) {
                        if (this.rand.nextFloat() * 30.0f < (method1726 - 0.4f) * 2.0f) {
                            this.method4153(null);
                            this.method5076();
                        }
                    }
                }
            }
        }
        super.method4172();
    }
    
    public boolean method5076() {
        return !this.world.isRemote() && this.isAlive() && this.method5078(this.getPosX() + (this.rand.nextDouble() - 0.5) * 64.0, this.getPosY() + (this.rand.nextInt(64) - 32), this.getPosZ() + (this.rand.nextDouble() - 0.5) * 64.0);
    }
    
    private boolean method5077(final Entity class399) {
        final Vec3d method16738 = new Vec3d(this.getPosX() - class399.getPosX(), this.method1942(0.5) - class399.method1944(), this.getPosZ() - class399.getPosZ()).normalize();
        return this.method5078(this.getPosX() + (this.rand.nextDouble() - 0.5) * 8.0 - method16738.x * 16.0, this.getPosY() + (this.rand.nextInt(16) - 8) - method16738.y * 16.0, this.getPosZ() + (this.rand.nextDouble() - 0.5) * 8.0 - method16738.z * 16.0);
    }
    
    private boolean method5078(final double n, final double n2, final double n3) {
        final Mutable class385 = new Mutable(n, n2, n3);
        while (class385.getY() > 0 && !this.world.getBlockState(class385).method21697().method26440()) {
            class385.method1290(Direction.DOWN);
        }
        final BlockState method6701 = this.world.getBlockState(class385);
        final boolean method6702 = method6701.getMaterial().method26440();
        final boolean method6703 = method6701.getFluidState().isTagged(Class7324.field28319);
        if (method6702 && !method6703) {
            final boolean method6704 = this.method2775(n, n2, n3, true);
            if (method6704) {
                this.world.method6706(null, this.prevPosX, this.prevPosY, this.prevPosZ, Class8520.field35167, this.method1922(), 1.0f, 1.0f);
                this.method1695(Class8520.field35167, 1.0f, 1.0f);
            }
            return method6704;
        }
        return false;
    }
    
    @Override
    public Class7795 method4160() {
        return this.method5081() ? Class8520.field35165 : Class8520.field35162;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35164;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35163;
    }
    
    @Override
    public void method2678(final DamageSource class7929, final int n, final boolean b) {
        super.method2678(class7929, n, b);
        final BlockState method5080 = this.method5080();
        if (method5080 != null) {
            this.method1764(method5080.getBlock());
        }
    }
    
    public void method5079(final BlockState value) {
        this.dataManager.set(Class850.field4520, Optional.ofNullable(value));
    }
    
    @Nullable
    public BlockState method5080() {
        return this.dataManager.get(Class850.field4520).orElse(null);
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (this.method1849(class7929)) {
            return false;
        }
        if (!(class7929 instanceof Class7931) && class7929 != DamageSource.field32581) {
            final boolean method1740 = super.attackEntityFrom(class7929, n);
            if (!this.world.isRemote()) {
                if (class7929.method25709()) {
                    if (this.rand.nextInt(10) != 0) {
                        this.method5076();
                    }
                }
            }
            return method1740;
        }
        for (int i = 0; i < 64; ++i) {
            if (this.method5076()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean method5081() {
        return this.dataManager.get(Class850.field4521);
    }
    
    public boolean method5082() {
        return this.dataManager.get(Class850.field4522);
    }
    
    public void method5083() {
        this.dataManager.set(Class850.field4522, true);
    }
    
    static {
        field4518 = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
        field4519 = new Class7919(Class850.field4518, "Attacking speed boost", 0.15000000596046448, Class2157.field12809).method25640(false);
        field4520 = EntityDataManager.method33564(Class850.class, Class7709.field30660);
        field4521 = EntityDataManager.method33564(Class850.class, Class7709.field30661);
        field4522 = EntityDataManager.method33564(Class850.class, Class7709.field30661);
        field4523 = (class511 -> class511 instanceof Class842 && ((Class842)class511).method5033());
    }
}
