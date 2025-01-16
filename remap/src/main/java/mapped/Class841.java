// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;

public class Class841 extends Class785 implements Class762
{
    private static final UUID field4479;
    private static final Class7919 field4480;
    public static final DataParameter<Direction> field4481;
    public static final DataParameter<Optional<BlockPos>> field4482;
    public static final DataParameter<Byte> field4483;
    public static final DataParameter<Byte> field4484;
    private float field4485;
    private float field4486;
    private BlockPos field4487;
    private int field4488;
    
    public Class841(final EntityType<? extends Class841> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2952 = 180.0f;
        this.field2951 = 180.0f;
        this.field4487 = null;
        this.field4108 = 5;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        this.field2951 = 180.0f;
        this.field2952 = 180.0f;
        this.rotationYaw = 180.0f;
        this.prevRotationYaw = 180.0f;
        this.field2953 = 180.0f;
        this.field2954 = 180.0f;
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3628(this, Class512.class, 8.0f));
        this.field4114.method22062(4, new Class3458(this));
        this.field4114.method22062(7, new Class3455(this, null));
        this.field4114.method22062(8, new Class3503(this));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[0]).method11100((Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3568(this, this));
        this.field4115.method22062(3, new Class3563(this));
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1583;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35548;
    }
    
    @Override
    public void method4156() {
        if (!this.method5017()) {
            super.method4156();
        }
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35554;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return this.method5017() ? Class8520.field35556 : Class8520.field35555;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class841.field4481, Direction.DOWN);
        this.dataManager.register(Class841.field4482, Optional.empty());
        this.dataManager.register(Class841.field4483, (Byte)0);
        this.dataManager.register(Class841.field4484, (Byte)16);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(30.0);
    }
    
    @Override
    public Class7232 method4146() {
        return new Class7233(this, this);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.dataManager.set(Class841.field4481, Direction.byIndex(class51.method317("AttachFace")));
        this.dataManager.set(Class841.field4483, class51.method317("Peek"));
        this.dataManager.set(Class841.field4484, class51.method317("Color"));
        if (!class51.method315("APX")) {
            this.dataManager.set(Class841.field4482, Optional.empty());
        }
        else {
            this.dataManager.set(Class841.field4482, Optional.of(new BlockPos(class51.method319("APX"), class51.method319("APY"), class51.method319("APZ"))));
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method296("AttachFace", (byte)this.dataManager.get(Class841.field4481).getIndex());
        class51.method296("Peek", this.dataManager.get(Class841.field4483));
        class51.method296("Color", this.dataManager.get(Class841.field4484));
        final BlockPos method5019 = this.method5019();
        if (method5019 != null) {
            class51.method298("APX", method5019.getX());
            class51.method298("APY", method5019.getY());
            class51.method298("APZ", method5019.getZ());
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        BlockPos class354 = this.dataManager.get(Class841.field4482).orElse(null);
        if (class354 == null) {
            if (!this.world.isRemote) {
                class354 = new BlockPos(this);
                this.dataManager.set(Class841.field4482, Optional.of(class354));
            }
        }
        if (!this.isPassenger()) {
            if (!this.world.isRemote) {
                final BlockState method6701 = this.world.getBlockState(class354);
                if (!method6701.method21706()) {
                    if (method6701.getBlock() != Class7521.field29264) {
                        if (method6701.getBlock() != Class7521.field29247) {
                            this.method5016();
                        }
                        else {
                            final Direction class355 = method6701.get((IProperty<Direction>)Class3835.field17415);
                            if (!this.world.method6961(class354.method1149(class355))) {
                                this.method5016();
                            }
                            else {
                                class354 = class354.method1149(class355);
                                this.dataManager.set(Class841.field4482, Optional.of(class354));
                            }
                        }
                    }
                    else {
                        final Direction class356 = method6701.get((IProperty<Direction>)Class3836.field17415);
                        if (!this.world.method6961(class354.method1149(class356))) {
                            this.method5016();
                        }
                        else {
                            class354 = class354.method1149(class356);
                            this.dataManager.set(Class841.field4482, Optional.of(class354));
                        }
                    }
                }
                if (!this.world.method6732(class354.method1149(this.method5018()), this)) {
                    int n = 0;
                    for (final Direction class357 : Direction.values()) {
                        if (this.world.method6732(class354.method1149(class357), this)) {
                            this.dataManager.set(Class841.field4481, class357);
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        this.method5016();
                    }
                }
                if (this.world.method6732(class354.method1149(this.method5018().getOpposite()), this)) {
                    this.method5016();
                }
            }
        }
        else {
            class354 = null;
            final float field2399 = this.method1920().rotationYaw;
            this.rotationYaw = field2399;
            this.field2951 = field2399;
            this.field2952 = field2399;
            this.field4488 = 0;
        }
        final float n2 = this.method5021() * 0.01f;
        this.field4485 = this.field4486;
        if (this.field4486 <= n2) {
            if (this.field4486 < n2) {
                this.field4486 = MathHelper.clamp(this.field4486 + 0.05f, 0.0f, n2);
            }
        }
        else {
            this.field4486 = MathHelper.clamp(this.field4486 - 0.05f, n2, 1.0f);
        }
        if (class354 != null) {
            if (this.world.isRemote) {
                if (this.field4488 > 0 && this.field4487 != null) {
                    --this.field4488;
                }
                else {
                    this.field4487 = class354;
                }
            }
            this.method1731(class354.getX() + 0.5, class354.getY(), class354.getZ() + 0.5);
            final double n3 = 0.5 - MathHelper.sin((0.5f + this.field4486) * 3.1415927f) * 0.5;
            final double n4 = 0.5 - MathHelper.sin((0.5f + this.field4485) * 3.1415927f) * 0.5;
            final Direction method6702 = this.method5018().getOpposite();
            this.method1889(new AxisAlignedBB(this.getPosX() - 0.5, this.getPosY(), this.getPosZ() - 0.5, this.getPosX() + 0.5, this.getPosY() + 1.0, this.getPosZ() + 0.5).method18494(method6702.getXOffset() * n3, method6702.getYOffset() * n3, method6702.getZOffset() * n3));
            final double n5 = n3 - n4;
            if (n5 > 0.0) {
                final List<Entity> method6703 = this.world.method7127(this, this.getBoundingBox());
                if (!method6703.isEmpty()) {
                    for (final Entity class358 : method6703) {
                        if (class358 instanceof Class841) {
                            continue;
                        }
                        if (class358.noClip) {
                            continue;
                        }
                        class358.method1671(Class2160.field12830, new Vec3d(n5 * method6702.getXOffset(), n5 * method6702.getYOffset(), n5 * method6702.getZOffset()));
                    }
                }
            }
        }
    }
    
    @Override
    public void method1671(final Class2160 class2160, final Vec3d class2161) {
        if (class2160 != Class2160.field12829) {
            super.method1671(class2160, class2161);
        }
        else {
            this.method5016();
        }
    }
    
    @Override
    public void setPosition(final double n, final double n2, final double n3) {
        super.setPosition(n, n2, n3);
        if (this.dataManager != null) {
            if (this.ticksExisted != 0) {
                final Optional<BlockPos> obj = this.dataManager.get(Class841.field4482);
                final Optional<BlockPos> of = Optional.of(new BlockPos(n, n2, n3));
                if (!of.equals(obj)) {
                    this.dataManager.set(Class841.field4482, of);
                    this.dataManager.set(Class841.field4483, (Byte)0);
                    this.isAirBorne = true;
                }
            }
        }
    }
    
    public boolean method5016() {
        if (!this.method4214() && this.method1768()) {
            final BlockPos class354 = new BlockPos(this);
            for (int i = 0; i < 5; ++i) {
                final BlockPos method1134 = class354.add(8 - this.rand.nextInt(17), 8 - this.rand.nextInt(17), 8 - this.rand.nextInt(17));
                if (method1134.getY() > 0) {
                    if (this.world.method6961(method1134)) {
                        if (this.world.getWorldBorder().contains(method1134)) {
                            if (this.world.method6978(this, new AxisAlignedBB(method1134))) {
                                int n = 0;
                                for (final Direction class355 : Direction.values()) {
                                    if (this.world.method6732(method1134.method1149(class355), this)) {
                                        this.dataManager.set(Class841.field4481, class355);
                                        n = 1;
                                        break;
                                    }
                                }
                                if (n != 0) {
                                    this.method1695(Class8520.field35559, 1.0f, 1.0f);
                                    this.dataManager.set(Class841.field4482, Optional.of(method1134));
                                    this.dataManager.set(Class841.field4483, (Byte)0);
                                    this.method4153(null);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void method2736() {
        super.method2736();
        this.method1936(Vec3d.ZERO);
        this.field2952 = 180.0f;
        this.field2951 = 180.0f;
        this.rotationYaw = 180.0f;
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class841.field4482.equals(class8810)) {
            if (this.world.isRemote) {
                if (!this.isPassenger()) {
                    final BlockPos method5019 = this.method5019();
                    if (method5019 != null) {
                        if (this.field4487 != null) {
                            this.field4488 = 6;
                        }
                        else {
                            this.field4487 = method5019;
                        }
                        this.method1731(method5019.getX() + 0.5, method5019.getY(), method5019.getZ() + 0.5);
                    }
                }
            }
        }
        super.method1880(class8810);
    }
    
    @Override
    public void method1788(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
        this.field2971 = 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (this.method5017() && class7929.method25713() instanceof Class402) {
            return false;
        }
        if (!super.attackEntityFrom(class7929, n)) {
            return false;
        }
        if (this.method2664() < this.method2701() * 0.5) {
            if (this.rand.nextInt(4) == 0) {
                this.method5016();
            }
        }
        return true;
    }
    
    private boolean method5017() {
        return this.method5021() == 0;
    }
    
    @Nullable
    @Override
    public AxisAlignedBB method1702() {
        return this.method1768() ? this.getBoundingBox() : null;
    }
    
    public Direction method5018() {
        return this.dataManager.get(Class841.field4481);
    }
    
    @Nullable
    public BlockPos method5019() {
        return this.dataManager.get(Class841.field4482).orElse(null);
    }
    
    public void method5020(final BlockPos value) {
        this.dataManager.set(Class841.field4482, Optional.ofNullable(value));
    }
    
    public int method5021() {
        return this.dataManager.get(Class841.field4483);
    }
    
    public void method5022(final int n) {
        if (!this.world.isRemote) {
            this.method2710(Class8107.field33413).method23947(Class841.field4480);
            if (n != 0) {
                this.method1695(Class8520.field35557, 1.0f, 1.0f);
            }
            else {
                this.method2710(Class8107.field33413).method23946(Class841.field4480);
                this.method1695(Class8520.field35553, 1.0f, 1.0f);
            }
        }
        this.dataManager.set(Class841.field4483, (byte)n);
    }
    
    public float method5023(final float n) {
        return MathHelper.method35700(n, this.field4485, this.field4486);
    }
    
    public int method5024() {
        return this.field4488;
    }
    
    public BlockPos method5025() {
        return this.field4487;
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return 0.5f;
    }
    
    @Override
    public int method4173() {
        return 180;
    }
    
    @Override
    public int method4174() {
        return 180;
    }
    
    @Override
    public void method1737(final Entity class399) {
    }
    
    @Override
    public float method1790() {
        return 0.0f;
    }
    
    public boolean method5026() {
        return this.field4487 != null && this.method5019() != null;
    }
    
    @Nullable
    public Class181 method5027() {
        final Byte b = this.dataManager.get(Class841.field4484);
        return (b != 16 && b <= 15) ? Class181.method819(b) : null;
    }
    
    static {
        field4479 = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
        field4480 = new Class7919(Class841.field4479, "Covered armor bonus", 20.0, Class2157.field12809).method25640(false);
        field4481 = EntityDataManager.method33564(Class841.class, Class7709.field30666);
        field4482 = EntityDataManager.method33564(Class841.class, Class7709.field30665);
        field4483 = EntityDataManager.method33564(Class841.class, Class7709.field30653);
        field4484 = EntityDataManager.method33564(Class841.class, Class7709.field30653);
    }
}
