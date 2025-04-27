// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

public class Class798 extends Class789 implements Class797
{
    private static final DataParameter<Byte> field4259;
    private static final DataParameter<Integer> field4260;
    private UUID field4261;
    private float field4262;
    private float field4263;
    private int field4264;
    private int field4265;
    private int field4266;
    private int field4267;
    private int field4268;
    private int field4269;
    private BlockPos field4270;
    private BlockPos field4271;
    private Class3622 field4272;
    private Class3620 field4273;
    private Class3623 field4274;
    private int field4275;
    
    public Class798(final EntityType<? extends Class798> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4268 = 0;
        this.field4269 = 0;
        this.field4270 = null;
        this.field4271 = null;
        this.field4110 = new Class6574(this, 20, true);
        this.field4109 = new Class7729(this, this);
        this.method4145(Class257.field1211, -1.0f);
        this.method4145(Class257.field1226, -1.0f);
        this.method4145(Class257.field1209, -1.0f);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class798.field4259, (Byte)0);
        this.dataManager.register(Class798.field4260, 0);
    }
    
    @Override
    public float method4228(final BlockPos class354, final Class1852 class355) {
        return class355.getBlockState(class354).method21706() ? 10.0f : 0.0f;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3580(this, this, 1.399999976158142, true));
        this.field4114.method22062(1, new Class3619(this, null));
        this.field4114.method22062(2, new Class3587(this, 1.0));
        this.field4114.method22062(3, new Class3472(this, 1.25, Ingredient.method620(Class7855.field32270), false));
        this.field4272 = new Class3622(this);
        this.field4114.method22062(4, this.field4272);
        this.field4114.method22062(5, new Class3456(this, 1.25));
        this.field4114.method22062(5, new Class3621(this, null));
        this.field4273 = new Class3620(this);
        this.field4114.method22062(5, this.field4273);
        this.field4274 = new Class3623(this);
        this.field4114.method22062(6, this.field4274);
        this.field4114.method22062(7, new Class3618(this, null));
        this.field4114.method22062(8, new Class3513(this));
        this.field4114.method22062(9, new Class3490(this));
        this.field4115.method22062(1, new Class3552(this, this).method11100(new Class[0]));
        this.field4115.method22062(2, new Class3559(this));
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        if (this.method4523()) {
            class51.put("HivePos", Class9346.method34646(this.method4524()));
        }
        if (this.method4510()) {
            class51.put("FlowerPos", Class9346.method34646(this.method4509()));
        }
        class51.putBoolean("HasNectar", this.method4529());
        class51.putBoolean("HasStung", this.method4531());
        class51.putInt("TicksSincePollination", this.field4265);
        class51.putInt("CannotEnterHiveTicks", this.field4266);
        class51.putInt("CropsGrownSincePollination", this.field4267);
        class51.putInt("Anger", this.method4520());
        if (this.field4261 == null) {
            class51.putString("HurtBy", "");
        }
        else {
            class51.putString("HurtBy", this.field4261.toString());
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        this.field4271 = null;
        if (class51.contains("HivePos")) {
            this.field4271 = Class9346.method34645(class51.getCompound("HivePos"));
        }
        this.field4270 = null;
        if (class51.contains("FlowerPos")) {
            this.field4270 = Class9346.method34645(class51.getCompound("FlowerPos"));
        }
        super.method1760(class51);
        this.method4530(class51.getBoolean("HasNectar"));
        this.method4532(class51.getBoolean("HasStung"));
        this.method4521(class51.getInt("Anger"));
        this.field4265 = class51.getInt("TicksSincePollination");
        this.field4266 = class51.getInt("CannotEnterHiveTicks");
        this.field4267 = class51.getInt("CropsGrownSincePollination");
        final String method323 = class51.getString("HurtBy");
        if (!method323.isEmpty()) {
            this.field4261 = UUID.fromString(method323);
            final PlayerEntity method324 = this.world.method7143(this.field4261);
            this.method2636(method324);
            if (method324 != null) {
                this.field2956 = method324;
                this.field2957 = this.method2635();
            }
        }
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        final boolean method1740 = class399.attackEntityFrom(DamageSource.method25692(this), (float)(int)this.method2710(Class8107.field33410).method23950());
        if (method1740) {
            this.method1900(this, class399);
            if (class399 instanceof LivingEntity) {
                ((LivingEntity)class399).method2705(((LivingEntity)class399).method2704() + 1);
                int n = 0;
                if (this.world.method6954() != Class2113.field12292) {
                    if (this.world.method6954() == Class2113.field12293) {
                        n = 18;
                    }
                }
                else {
                    n = 10;
                }
                if (n > 0) {
                    ((LivingEntity)class399).method2655(new Class1948(Class9439.field40492, n * 20, 0));
                }
            }
            this.method4532(true);
            this.method4153(null);
            this.method1695(Class8520.field35018, 1.0f, 1.0f);
        }
        return method1740;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.method4529()) {
            if (this.method4525() < 10) {
                if (this.rand.nextFloat() < 0.05f) {
                    for (int i = 0; i < this.rand.nextInt(2) + 1; ++i) {
                        this.method4507(this.world, this.getPosX() - 0.30000001192092896, this.getPosX() + 0.30000001192092896, this.getPosZ() - 0.30000001192092896, this.getPosZ() + 0.30000001192092896, this.method1942(0.5), Class8432.field34658);
                    }
                }
            }
        }
        this.method4516();
    }
    
    private void method4507(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final IParticleData class1848) {
        class1847.method6709(class1848, MathHelper.lerp(class1847.rand.nextDouble(), n, n2), n5, MathHelper.lerp(class1847.rand.nextDouble(), n3, n4), 0.0, 0.0, 0.0);
    }
    
    private void method4508(final BlockPos class354) {
        final Vec3d class355 = new Vec3d(class354);
        int n = 0;
        final BlockPos class356 = new BlockPos(this);
        final int n2 = (int)class355.y - class356.getY();
        if (n2 <= 2) {
            if (n2 < -2) {
                n = -4;
            }
        }
        else {
            n = 4;
        }
        int n3 = 6;
        int n4 = 8;
        final int method1086 = class356.manhattanDistance(class354);
        if (method1086 < 15) {
            n3 = method1086 / 2;
            n4 = method1086 / 2;
        }
        final Vec3d method1087 = Class7775.method24907(this, n3, n4, n, class355, 0.3141592741012573);
        if (method1087 != null) {
            this.field4113.method24713(0.5f);
            this.field4113.method24724(method1087.x, method1087.y, method1087.z, 1.0);
        }
    }
    
    @Nullable
    public BlockPos method4509() {
        return this.field4270;
    }
    
    public boolean method4510() {
        return this.field4270 != null;
    }
    
    public void method4511(final BlockPos field4270) {
        this.field4270 = field4270;
    }
    
    private boolean method4512() {
        return this.field4265 > 3600;
    }
    
    private boolean method4513() {
        if (this.field4266 <= 0) {
            if (!Class3622.method11160(this.field4272)) {
                if (!this.method4531()) {
                    if (!this.method4512()) {
                        if (!this.world.method6771()) {
                            if (!this.world.method6704()) {
                                if (!this.method4529()) {
                                    final boolean b = false;
                                    return b && !this.method4518();
                                }
                            }
                        }
                    }
                    final boolean b = true;
                    return b && !this.method4518();
                }
            }
        }
        return false;
    }
    
    public void method4514(final int field4266) {
        this.field4266 = field4266;
    }
    
    public float method4515(final float n) {
        return MathHelper.method35700(n, this.field4263, this.field4262);
    }
    
    private void method4516() {
        this.field4263 = this.field4262;
        if (!this.method4533()) {
            this.field4262 = Math.max(0.0f, this.field4262 - 0.24f);
        }
        else {
            this.field4262 = Math.min(1.0f, this.field4262 + 0.2f);
        }
    }
    
    @Override
    public void method2636(final LivingEntity class511) {
        super.method2636(class511);
        if (class511 != null) {
            this.field4261 = class511.method1865();
        }
    }
    
    @Override
    public void method4172() {
        final boolean method4531 = this.method4531();
        if (!this.method1711()) {
            this.field4275 = 0;
        }
        else {
            ++this.field4275;
        }
        if (this.field4275 > 20) {
            this.attackEntityFrom(DamageSource.field32569, 1.0f);
        }
        if (method4531) {
            ++this.field4264;
            if (this.field4264 % 5 == 0) {
                if (this.rand.nextInt(MathHelper.method35651(1200 - this.field4264, 1, 1200)) == 0) {
                    this.attackEntityFrom(DamageSource.field32575, this.method2664());
                }
            }
        }
        if (this.method4519()) {
            final int method4532 = this.method4520();
            this.method4521(method4532 - 1);
            final LivingEntity method4533 = this.method4152();
            if (method4532 == 0) {
                if (method4533 != null) {
                    this.method4541(method4533);
                }
            }
        }
        if (!this.method4529()) {
            ++this.field4265;
        }
    }
    
    public void method4517() {
        this.field4265 = 0;
    }
    
    private boolean method4518() {
        if (this.field4271 != null) {
            final TileEntity method6727 = this.world.getTileEntity(this.field4271);
            return method6727 instanceof Class438 && ((Class438)method6727).method2215();
        }
        return false;
    }
    
    public boolean method4519() {
        return this.method4520() > 0;
    }
    
    private int method4520() {
        return this.dataManager.get(Class798.field4260);
    }
    
    private void method4521(final int i) {
        this.dataManager.set(Class798.field4260, i);
    }
    
    private boolean method4522(final BlockPos class354) {
        final TileEntity method6727 = this.world.getTileEntity(class354);
        return method6727 instanceof Class438 && !((Class438)method6727).method2217();
    }
    
    public boolean method4523() {
        return this.field4271 != null;
    }
    
    @Nullable
    public BlockPos method4524() {
        return this.field4271;
    }
    
    @Override
    public void method4171() {
        super.method4171();
        Class9324.method34541(this);
    }
    
    private int method4525() {
        return this.field4267;
    }
    
    private void method4526() {
        this.field4267 = 0;
    }
    
    private void method4527() {
        ++this.field4267;
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (!this.world.isRemote) {
            if (this.field4266 > 0) {
                --this.field4266;
            }
            if (this.field4268 > 0) {
                --this.field4268;
            }
            if (this.field4269 > 0) {
                --this.field4269;
            }
            boolean b = false;
            Label_0133: {
                if (this.method4519()) {
                    if (!this.method4531()) {
                        if (this.method4152() != null) {
                            if (this.method4152().method1734(this) < 4.0) {
                                b = true;
                                break Label_0133;
                            }
                        }
                    }
                }
                b = false;
            }
            this.method4534(b);
            if (this.ticksExisted % 20 == 0) {
                if (!this.method4528()) {
                    this.field4271 = null;
                }
            }
        }
    }
    
    private boolean method4528() {
        if (this.method4523()) {
            final TileEntity method6727 = this.world.getTileEntity(this.field4271);
            return method6727 != null && method6727.getType() == Class5412.field22573;
        }
        return false;
    }
    
    public boolean method4529() {
        return this.method4537(8);
    }
    
    private void method4530(final boolean b) {
        if (b) {
            this.method4517();
        }
        this.method4536(8, b);
    }
    
    public boolean method4531() {
        return this.method4537(4);
    }
    
    private void method4532(final boolean b) {
        this.method4536(4, b);
    }
    
    private boolean method4533() {
        return this.method4537(2);
    }
    
    private void method4534(final boolean b) {
        this.method4536(2, b);
    }
    
    private boolean method4535(final BlockPos class354) {
        return !this.method4542(class354, 48);
    }
    
    private void method4536(final int n, final boolean b) {
        if (!b) {
            this.dataManager.set(Class798.field4259, (byte)(this.dataManager.get(Class798.field4259) & ~n));
        }
        else {
            this.dataManager.set(Class798.field4259, (byte)(this.dataManager.get(Class798.field4259) | n));
        }
    }
    
    private boolean method4537(final int n) {
        return (this.dataManager.get(Class798.field4259) & n) != 0x0;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2711().method20873(Class8107.field33409);
        this.method2710(Class8107.field33405).method23941(10.0);
        this.method2710(Class8107.field33409).method23941(0.6000000238418579);
        this.method2710(Class8107.field33408).method23941(0.30000001192092896);
        this.method2711().method20873(Class8107.field33410).method23941(2.0);
        this.method2710(Class8107.field33406).method23941(48.0);
    }
    
    @Override
    public Class7746 method4143(final World class1847) {
        final Class7751 class1848 = new Class7751(this, this, class1847);
        class1848.method24750(false);
        class1848.method24741(false);
        class1848.method24751(true);
        return class1848;
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return class8321.getItem().method11742(Class7855.field32270);
    }
    
    private boolean method4538(final BlockPos class354) {
        return this.world.method6731(class354) && this.world.getBlockState(class354).method21696().method11785(Class7188.field27913);
    }
    
    @Override
    public void method1691(final BlockPos class354, final Class7096 class355) {
    }
    
    @Override
    public Class7795 method4160() {
        return null;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35015;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35014;
    }
    
    @Override
    public float method2720() {
        return 0.4f;
    }
    
    public Class798 method4539(final Class788 class788) {
        return EntityType.field28961.method23371(this.world);
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return (class291.field34098 * 0.5f);
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public void method1701(final double n, final boolean b, final Class7096 class7096, final BlockPos class7097) {
    }
    
    @Override
    public boolean method1694() {
        return true;
    }
    
    public void method4540() {
        this.method4530(false);
        this.method4526();
    }
    
    public boolean method4541(final Entity class399) {
        this.method4521(400 + this.rand.nextInt(400));
        if (class399 instanceof LivingEntity) {
            this.method2636((LivingEntity)class399);
        }
        return true;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (!this.method1849(class7929)) {
            final Entity method25714 = class7929.method25714();
            if (!this.world.isRemote) {
                if (method25714 instanceof PlayerEntity) {
                    if (!((PlayerEntity)method25714).method2889()) {
                        if (this.method2747(method25714)) {
                            if (!this.method4214()) {
                                Class3622.method11161(this.field4272);
                                this.method4541(method25714);
                            }
                        }
                    }
                }
            }
            return super.attackEntityFrom(class7929, n);
        }
        return false;
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25462;
    }
    
    @Override
    public void method2727(final Class7909<Fluid> class7909) {
        this.method1936(this.getMotion().add(0.0, 0.01, 0.0));
    }
    
    private boolean method4542(final BlockPos class354, final int n) {
        return class354.withinDistance(new BlockPos(this), n);
    }
    
    static {
        field4259 = EntityDataManager.method33564(Class798.class, Class7709.field30653);
        field4260 = EntityDataManager.method33564(Class798.class, Class7709.field30654);
    }
}
