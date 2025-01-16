// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.dimension.DimensionType;

import java.util.List;

public class Class756 extends Class754
{
    private static String[] field4068;
    public final Class5799 field4069;
    private final Class7474 field4070;
    private final Class6520 field4071;
    private final List<Class7622> field4072;
    private int field4073;
    public double field4074;
    public double field4075;
    public double field4076;
    public float field4077;
    public float field4078;
    private boolean field4079;
    private boolean field4080;
    private boolean field4081;
    private int field4082;
    private boolean field4083;
    private String field4084;
    public Class6093 field4085;
    public final Class869 field4086;
    public int field4087;
    public int field4088;
    public float field4089;
    public float field4090;
    public float field4091;
    public float field4092;
    private int field4093;
    public float field4094;
    public float field4095;
    public float field4096;
    private boolean field4097;
    private Class316 field4098;
    private boolean field4099;
    private boolean field4100;
    private int field4101;
    private boolean field4102;
    private int field4103;
    private boolean field4104;
    
    public Class756(final Class869 field4086, final Class1848 class1848, final Class5799 field4087, final Class7474 field4088, final Class6520 field4089) {
        super(class1848, field4087.method17373());
        this.field4072 = Lists.newArrayList();
        this.field4073 = 0;
        this.field4100 = true;
        this.field4104 = true;
        this.field4069 = field4087;
        this.field4070 = field4088;
        this.field4071 = field4089;
        this.field4086 = field4086;
        this.dimension = DimensionType.field2223;
        this.field4072.add(new Class7623(this, field4086.method5299()));
        this.field4072.add(new Class7624(this));
    }
    
    @Override
    public boolean method1821() {
        return super.method1821() || (this.field4086.field4684.isSpectator() && this.field4086.field4648.field23455.method1056());
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        return false;
    }
    
    @Override
    public void method2663(final float n) {
    }
    
    @Override
    public boolean method1780(final Entity class399, final boolean b) {
        if (super.method1780(class399, b)) {
            if (class399 instanceof Class428) {
                this.field4086.method5299().method6422(new Class6830(this, (Class428)class399));
            }
            if (class399 instanceof Class423) {
                this.prevRotationYaw = class399.rotationYaw;
                this.rotationYaw = class399.rotationYaw;
                this.method1845(class399.rotationYaw);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void stopRiding() {
        super.stopRiding();
        this.field4099 = false;
    }
    
    @Override
    public float getPitch(final float n) {
        return this.rotationPitch;
    }
    
    @Override
    public float getYaw(final float n) {
        return this.isPassenger() ? super.getYaw(n) : this.rotationYaw;
    }
    
    @Override
    public void method1659() {
        if (this.world.method6971(new BlockPos(this.getPosX(), 0.0, this.getPosZ()))) {
            super.method1659();
            if (!this.isPassenger()) {
                this.method4113();
            }
            else {
                this.field4069.method17292(new Class4356(this.rotationYaw, this.rotationPitch, this.onGround));
                this.field4069.method17292(new Class4254(this.field2968, this.field2970, this.field4085.field24727, this.field4085.field24728));
                final Entity method1915 = this.method1915();
                if (method1915 != this) {
                    if (method1915.method1919()) {
                        this.field4069.method17292(new Class4251(method1915));
                    }
                }
            }
            final Iterator<Class7622> iterator = this.field4072.iterator();
            while (iterator.hasNext()) {
                iterator.next().method23959();
            }
        }
    }
    
    public void method4113() {
        final Class5744 class5744 = new Class5744(this.posX, this.getBoundingBox().minY, this.posZ, this.rotationPitch, this.rotationYaw, this.onGround);
        Class9463.method35173().method35188().method21097(class5744);
        if (!class5744.method16962()) {
            final boolean method1815 = this.method1815();
            if (method1815 != this.field4081) {
                this.field4069.method17292(new Class4336(this, method1815 ? Class287.field1594 : Class287.field1595));
                this.field4081 = method1815;
            }
            final boolean method1816 = this.method1809();
            if (method1816 != this.field4080) {
                this.field4069.method17292(new Class4336(this, method1816 ? Class287.field1591 : Class287.field1592));
                this.field4080 = method1816;
            }
            if (this.method4132()) {
                final double method1817 = class5744.method17034();
                final double method1818 = class5744.method17036();
                final double method1819 = class5744.method17038();
                final float method1820 = class5744.method17040();
                final float field4077 = class5744.method17042() % 360.0f;
                final boolean method1821 = class5744.method17044();
                final double n = method1817 - this.field4074;
                final double n2 = method1818 - this.field4075;
                final double n3 = method1819 - this.field4076;
                final double n4 = field4077 - this.field4077 % 360.0f;
                final double n5 = method1820 - this.field4078;
                ++this.field4082;
                int n6 = 0;
                Label_0366: {
                    if (!class5744.method17032()) {
                        if (n * n + n2 * n2 + n3 * n3 <= 9.0E-4) {
                            if (this.field4082 < 20) {
                                n6 = 0;
                                break Label_0366;
                            }
                        }
                    }
                    n6 = 1;
                }
                int n7 = n6;
                final boolean b = n4 != 0.0 || n5 != 0.0;
                if (!this.isPassenger()) {
                    if (n7 != 0 && b) {
                        this.field4069.method17292(new Class4355(method1817, method1818, method1819, field4077, method1820, method1821));
                    }
                    else if (n7 == 0) {
                        if (!b) {
                            if (this.field4079 != this.onGround || Class9367.field40167 == Class7906.field32452) {
                                this.field4069.method17292(new Class4353(method1821));
                            }
                        }
                        else {
                            this.field4069.method17292(new Class4356(field4077, method1820, method1821));
                        }
                    }
                    else {
                        this.field4069.method17292(new Class4354(method1817, method1818, method1819, method1821));
                    }
                }
                else {
                    final Vec3d method1822 = this.getMotion();
                    this.field4069.method17292(new Class4355(method1822.x, -999.0, method1822.z, field4077, method1820, method1821));
                    n7 = 0;
                }
                if (n7 != 0) {
                    this.field4074 = method1817;
                    this.field4075 = method1818;
                    this.field4076 = method1819;
                    this.field4082 = 0;
                }
                if (b) {
                    this.field4077 = field4077;
                    this.field4078 = method1820;
                }
                this.field4079 = this.onGround;
                this.field4100 = this.field4086.field4648.field23414;
            }
            final Iterator<Runnable> iterator = class5744.method17048().iterator();
            while (iterator.hasNext()) {
                iterator.next().run();
            }
            class5744.method17031();
            Class9463.method35173().method35188().method21097(class5744);
        }
    }
    
    @Override
    public boolean method2821(final boolean b) {
        this.field4069.method17292(new Class4399(b ? Class2003.field11243 : Class2003.field11244, BlockPos.ZERO, Direction.DOWN));
        return this.field3006.method2158(this.field3006.field2743, (b && !this.field3006.method2345().method27620()) ? this.field3006.method2345().method27690() : 1) != ItemStack.field34174;
    }
    
    public void method4114(final String s) {
        this.field4069.method17292(new Class4317(s));
    }
    
    @Override
    public void method2707(final Class316 class316) {
        super.method2707(class316);
        this.field4069.method17292(new Class4380(class316));
    }
    
    @Override
    public void method2842() {
        this.field4069.method17292(new Class4323(Class2218.field13621));
    }
    
    @Override
    public void method2698(final DamageSource class7929, final float n) {
        if (!this.method1849(class7929)) {
            this.method2665(this.method2664() - n);
        }
    }
    
    @Override
    public void method2814() {
        this.field4069.method17292(new Class4389(this.field3009.field16154));
        this.method4115();
    }
    
    public void method4115() {
        this.field3006.method2374(ItemStack.field34174);
        super.method2814();
        this.field4086.method5244(null);
    }
    
    public void method4116(final float n) {
        if (!this.field4083) {
            this.method2665(n);
            this.field4083 = true;
        }
        else {
            final float field2966 = this.method2664() - n;
            if (field2966 > 0.0f) {
                this.field2966 = field2966;
                this.method2665(this.method2664());
                this.hurtResistantTime = 20;
                this.method2698(DamageSource.field32575, field2966);
                this.field2939 = 10;
                this.field2938 = this.field2939;
            }
            else {
                this.method2665(n);
                if (field2966 < 0.0f) {
                    this.hurtResistantTime = 10;
                }
            }
        }
    }
    
    @Override
    public void method2882() {
        this.field4069.method17292(new Class4358(this.field3025));
    }
    
    @Override
    public boolean method2843() {
        return true;
    }
    
    public void method4117() {
        this.field4069.method17292(new Class4336(this, Class287.field1596, MathHelper.method35642(this.method4130() * 100.0f)));
    }
    
    public void method4118() {
        this.field4069.method17292(new Class4336(this, Class287.field1598));
    }
    
    public void method4119(final String field4084) {
        this.field4084 = field4084;
    }
    
    public String method4120() {
        return this.field4084;
    }
    
    public Class7474 method4121() {
        return this.field4070;
    }
    
    public Class6520 method4122() {
        return this.field4071;
    }
    
    public void method4123(final Class3662<?> class3662) {
        if (this.field4071.method19699(class3662)) {
            this.field4071.method19700(class3662);
            this.field4069.method17292(new Class4397(class3662));
        }
    }
    
    @Override
    public int method1925() {
        return this.field4073;
    }
    
    public void method4124(final int field4073) {
        this.field4073 = field4073;
    }
    
    @Override
    public void method2853(final ITextComponent class2250, final boolean b) {
        if (!b) {
            this.field4086.field4647.method3807().method3761(class2250);
        }
        else {
            this.field4086.field4647.method3805(class2250, false);
        }
    }
    
    @Override
    public void pushOutOfBlocks(final double n, final double n2, final double n3) {
        final BlockPos class354 = new BlockPos(n, n2, n3);
        if (this.method4125(class354)) {
            final double n4 = n - class354.getX();
            final double n5 = n3 - class354.getZ();
            Enum enum1 = null;
            double n6 = 9999.0;
            if (!this.method4125(class354.method1145()) && n4 < n6) {
                n6 = n4;
                enum1 = Direction.WEST;
            }
            if (!this.method4125(class354.method1147()) && 1.0 - n4 < n6) {
                n6 = 1.0 - n4;
                enum1 = Direction.EAST;
            }
            if (!this.method4125(class354.method1141()) && n5 < n6) {
                n6 = n5;
                enum1 = Direction.NORTH;
            }
            if (!this.method4125(class354.method1143()) && 1.0 - n5 < n6) {
                enum1 = Direction.SOUTH;
            }
            if (enum1 != null) {
                final Vec3d method1935 = this.getMotion();
                switch (Class9120.field38642[enum1.ordinal()]) {
                    case 1: {
                        this.setMotion(-0.1, method1935.y, method1935.z);
                        break;
                    }
                    case 2: {
                        this.setMotion(0.1, method1935.y, method1935.z);
                        break;
                    }
                    case 3: {
                        this.setMotion(method1935.x, method1935.y, -0.1);
                        break;
                    }
                    case 4: {
                        this.setMotion(method1935.x, method1935.y, 0.1);
                        break;
                    }
                }
            }
        }
    }
    
    private boolean method4125(final BlockPos class354) {
        final AxisAlignedBB method1886 = this.getBoundingBox();
        final Mutable class355 = new Mutable(class354);
        for (int i = MathHelper.floor(method1886.minY); i < MathHelper.ceil(method1886.maxY); ++i) {
            class355.method1294(i);
            if (!this.method2865(class355)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void method1816(final boolean b) {
        super.method1816(b);
        this.field4088 = 0;
    }
    
    public void method4126(final float field3028, final int field3029, final int field3030) {
        this.field3028 = field3028;
        this.field3027 = field3029;
        this.field3026 = field3030;
    }
    
    @Override
    public void sendMessage(final ITextComponent class2250) {
        this.field4086.field4647.method3807().method3761(class2250);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b >= 24 && b <= 28) {
            this.method4124(b - 24);
        }
        else {
            super.method1798(b);
        }
    }
    
    public void method4127(final boolean field4104) {
        this.field4104 = field4104;
    }
    
    public boolean method4128() {
        return this.field4104;
    }
    
    @Override
    public void method1695(final Class7795 class7795, final float n, final float n2) {
        this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), class7795, this.method1922(), n, n2, false);
    }
    
    @Override
    public void method2812(final Class7795 class7795, final Class286 class7796, final float n, final float n2) {
        this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), class7795, class7796, n, n2, false);
    }
    
    @Override
    public boolean method2749() {
        return true;
    }
    
    @Override
    public void method2762(final Class316 field4098) {
        if (!this.method2715(field4098).method27620()) {
            if (!this.method2756()) {
                super.method2762(field4098);
                this.field4097 = true;
                this.field4098 = field4098;
            }
        }
    }
    
    @Override
    public boolean method2756() {
        return this.field4097;
    }
    
    @Override
    public void method2770() {
        super.method2770();
        this.field4097 = false;
    }
    
    @Override
    public Class316 method2757() {
        return this.field4098;
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        super.method1880(class8810);
        if (Class756.field2920.equals(class8810)) {
            final boolean b = (this.dataManager.get(Class756.field2920) & 0x1) > 0;
            final Class316 class8811 = ((this.dataManager.get(Class756.field2920) & 0x2) <= 0) ? Class316.field1877 : Class316.field1878;
            if (b && !this.field4097) {
                this.method2762(class8811);
            }
            else if (!b) {
                if (this.field4097) {
                    this.method2770();
                }
            }
        }
        if (Class756.FLAGS.equals(class8810)) {
            if (this.method2773()) {
                if (!this.field4102) {
                    this.field4086.method5299().method6422(new Class6832(this));
                }
            }
        }
    }
    
    public boolean method4129() {
        final Entity method1920 = this.method1920();
        if (this.isPassenger()) {
            if (method1920 instanceof Class810) {
                if (((Class810)method1920).method4759()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public float method4130() {
        return this.field4094;
    }
    
    @Override
    public void method2827(final Class497 class497) {
        this.field4086.method5244(new Class730(class497));
    }
    
    @Override
    public void method2828(final Class865 class865) {
        this.field4086.method5244(new Class543(class865));
    }
    
    @Override
    public void method2829(final Class500 class500) {
        this.field4086.method5244(new Class542(class500));
    }
    
    @Override
    public void method2830(final Class501 class501) {
        this.field4086.method5244(new Class540(class501));
    }
    
    @Override
    public void method2831(final Class498 class498) {
        this.field4086.method5244(new Class737(class498));
    }
    
    @Override
    public void method2835(final ItemStack class8321, final Class316 class8322) {
        if (class8321.getItem() == Items.field31512) {
            this.field4086.method5244(new Class727(this, class8321, class8322));
        }
    }
    
    @Override
    public void method2839(final Entity class399) {
        this.field4086.field4640.method6476(class399, Class8432.field34603);
    }
    
    @Override
    public void method2840(final Entity class399) {
        this.field4086.field4640.method6476(class399, Class8432.field34614);
    }
    
    @Override
    public boolean method1809() {
        return this.field4085 != null && this.field4085.field24728;
    }
    
    @Override
    public boolean method1814() {
        if (!this.field3025.field27302) {
            if (!this.method1817()) {
                if (this.method1782(Pose.field1668)) {
                    return this.method1809() || (!this.method2783() && !this.method1782(Pose.field1663));
                }
            }
        }
        return false;
    }
    
    public boolean method4131() {
        return this.method1814() || this.method1819();
    }
    
    @Override
    public void method2738() {
        super.method2738();
        if (this.method4132()) {
            this.field2968 = this.field4085.field24721;
            this.field2970 = this.field4085.field24722;
            this.field2967 = this.field4085.field24727;
            this.field4091 = this.field4089;
            this.field4092 = this.field4090;
            this.field4090 += (float)((this.rotationPitch - this.field4090) * 0.5);
            this.field4089 += (float)((this.rotationYaw - this.field4089) * 0.5);
        }
    }
    
    public boolean method4132() {
        return this.field4086.method5303() == this;
    }
    
    @Override
    public void method2736() {
        ++this.field4088;
        if (this.field4087 > 0) {
            --this.field4087;
        }
        this.method4133();
        final boolean field24727 = this.field4085.field24727;
        final boolean field24728 = this.field4085.field24728;
        final boolean method4139 = this.method4139();
        this.field4085.method18176(this.method4131());
        this.field4086.method5319().method32917(this.field4085);
        if (this.method2756()) {
            if (!this.isPassenger()) {
                final Class5728 class5728 = new Class5728(0.2f);
                Class9463.method35173().method35188().method21097(class5728);
                if (!class5728.method16962()) {
                    final Class6093 field24729 = this.field4085;
                    field24729.field24721 *= class5728.method17003();
                    final Class6093 field24730 = this.field4085;
                    field24730.field24722 *= class5728.method17003();
                    this.field4087 = 0;
                }
            }
        }
        boolean b = false;
        if (this.field4101 > 0) {
            --this.field4101;
            b = true;
            this.field4085.field24727 = true;
        }
        if (!this.noClip) {
            this.pushOutOfBlocks(this.getPosX() - this.method1930() * 0.35, this.getPosY() + 0.5, this.getPosZ() + this.method1930() * 0.35);
            this.pushOutOfBlocks(this.getPosX() - this.method1930() * 0.35, this.getPosY() + 0.5, this.getPosZ() - this.method1930() * 0.35);
            this.pushOutOfBlocks(this.getPosX() + this.method1930() * 0.35, this.getPosY() + 0.5, this.getPosZ() - this.method1930() * 0.35);
            this.pushOutOfBlocks(this.getPosX() + this.method1930() * 0.35, this.getPosY() + 0.5, this.getPosZ() + this.method1930() * 0.35);
        }
        final boolean b2 = this.method2877().method33491() > 6.0f || this.field3025.field27303;
        if (this.onGround || this.method1712()) {
            if (!field24728) {
                if (!method4139) {
                    if (this.method4139()) {
                        if (!this.method1815()) {
                            if (b2) {
                                if (!this.method2756()) {
                                    if (!this.method2653(Class9439.field40488)) {
                                        if (this.field4087 <= 0 && !this.field4086.field4648.field23441.method1056()) {
                                            this.field4087 = 7;
                                        }
                                        else {
                                            this.method1816(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!this.method1815()) {
            if (!this.method1706() || this.method1712()) {
                if (this.method4139()) {
                    if (b2) {
                        if (!this.method2756()) {
                            if (!this.method2653(Class9439.field40488)) {
                                if (this.field4086.field4648.field23441.method1056()) {
                                    this.method1816(true);
                                }
                            }
                        }
                    }
                }
            }
        }
        Label_0452: {
            if (this.method1815()) {
                final boolean b3 = !this.field4085.method18178() || !b2;
                boolean b4 = false;
                Label_0834: {
                    if (!b3) {
                        if (!this.collidedHorizontally) {
                            if (!this.method1706() || this.method1712()) {
                                b4 = false;
                                break Label_0834;
                            }
                        }
                    }
                    b4 = true;
                }
                final boolean b5 = b4;
                if (!this.method1817()) {
                    if (b5) {
                        this.method1816(false);
                    }
                }
                else {
                    Label_0889: {
                        if (!this.onGround) {
                            if (!this.field4085.field24728) {
                                if (b3) {
                                    break Label_0889;
                                }
                            }
                        }
                        if (this.method1706()) {
                            break Label_0452;
                        }
                    }
                    this.method1816(false);
                }
            }
        }
        boolean b6 = false;
        if (this.field3025.field27303) {
            if (!this.field4086.field4682.method27335()) {
                if (!field24727) {
                    if (this.field4085.field24727) {
                        if (!b) {
                            if (this.field3011 != 0) {
                                if (!this.method1817()) {
                                    this.field3025.field27302 = !this.field3025.field27302;
                                    b6 = true;
                                    this.method2882();
                                    this.field3011 = 0;
                                }
                            }
                            else {
                                this.field3011 = 7;
                            }
                        }
                    }
                }
            }
            else if (!this.field3025.field27302) {
                this.field3025.field27302 = true;
                b6 = true;
                this.method2882();
            }
        }
        if (this.field4085.field24727) {
            if (!b6) {
                if (!field24727) {
                    if (!this.field3025.field27302) {
                        if (!this.isPassenger()) {
                            if (!this.method2688()) {
                                final ItemStack method4140 = this.method2718(Class2215.field13604);
                                if (method4140.getItem() == Items.field31584) {
                                    if (Class4080.method12285(method4140)) {
                                        if (this.method2868()) {
                                            this.field4069.method17292(new Class4336(this, Class287.field1599));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field4102 = this.method2773();
        if (this.method1706()) {
            if (this.field4085.field24728) {
                this.method2726();
            }
        }
        if (!this.method1720(Class7324.field28319)) {
            if (this.field4103 > 0) {
                this.method1720(Class7324.field28319);
                this.field4103 = MathHelper.method35651(this.field4103 - 10, 0, 600);
            }
        }
        else {
            this.field4103 = MathHelper.method35651(this.field4103 + (this.isSpectator() ? 10 : 1), 0, 600);
        }
        if (this.field3025.field27302) {
            if (this.method4132()) {
                int n = 0;
                if (this.field4085.field24728) {
                    --n;
                }
                if (this.field4085.field24727) {
                    ++n;
                }
                if (n != 0) {
                    this.method1936(this.getMotion().add(0.0, n * this.field3025.method21425() * 3.0f, 0.0));
                }
            }
        }
        if (!this.method4129()) {
            this.field4094 = 0.0f;
        }
        else {
            final Class810 class5729 = (Class810)this.method1920();
            if (this.field4093 < 0) {
                ++this.field4093;
                if (this.field4093 == 0) {
                    this.field4094 = 0.0f;
                }
            }
            if (field24727 && !this.field4085.field24727) {
                this.field4093 = -10;
                class5729.method4758(MathHelper.method35642(this.method4130() * 100.0f));
                this.method4117();
            }
            else if (!field24727 && this.field4085.field24727) {
                this.field4093 = 0;
                this.field4094 = 0.0f;
            }
            else if (field24727) {
                ++this.field4093;
                if (this.field4093 >= 10) {
                    this.field4094 = 0.8f + 2.0f / (this.field4093 - 9) * 0.1f;
                }
                else {
                    this.field4094 = this.field4093 * 0.1f;
                }
            }
        }
        super.method2736();
        if (this.onGround) {
            if (this.field3025.field27302) {
                if (!this.field4086.field4682.method27335()) {
                    this.field3025.field27302 = false;
                    this.method2882();
                }
            }
        }
    }
    
    private void method4133() {
        this.field4096 = this.field4095;
        if (!this.inPortal) {
            if (this.method2653(Class9439.field40482) && this.method2654(Class9439.field40482).method7907() > 60) {
                this.field4095 += 0.006666667f;
                if (this.field4095 > 1.0f) {
                    this.field4095 = 1.0f;
                }
            }
            else {
                if (this.field4095 > 0.0f) {
                    this.field4095 -= 0.05f;
                }
                if (this.field4095 < 0.0f) {
                    this.field4095 = 0.0f;
                }
            }
        }
        else {
            if (this.field4086.field4700 != null) {
                if (!this.field4086.field4700.method2991()) {
                    if (this.field4086.field4700 instanceof Class516) {
                        this.method2814();
                    }
                    this.field4086.method5244(null);
                }
            }
            if (this.field4095 == 0.0f) {
                this.field4086.method5299().method6422(Class6836.method20933(Class8520.field35498, this.rand.nextFloat() * 0.4f + 0.8f));
            }
            this.field4095 += 0.0125f;
            if (this.field4095 >= 1.0f) {
                this.field4095 = 1.0f;
            }
            this.inPortal = false;
        }
        this.method1661();
    }
    
    @Override
    public void method1772() {
        super.method1772();
        this.field4099 = false;
        if (this.method1920() instanceof Class423) {
            ((Class423)this.method1920()).method2066(this.field4085.field24725, this.field4085.field24726, this.field4085.field24723, this.field4085.field24724);
            final boolean field4099 = this.field4099;
            boolean b = false;
            Label_0128: {
                if (!this.field4085.field24725) {
                    if (!this.field4085.field24726) {
                        if (!this.field4085.field24723) {
                            if (!this.field4085.field24724) {
                                b = false;
                                break Label_0128;
                            }
                        }
                    }
                }
                b = true;
            }
            this.field4099 = (field4099 | b);
        }
    }
    
    public boolean method4134() {
        return this.field4099;
    }
    
    @Nullable
    @Override
    public Class1948 method2658(final Class5328 class5328) {
        if (class5328 == Class9439.field40482) {
            this.field4096 = 0.0f;
            this.field4095 = 0.0f;
        }
        return super.method2658(class5328);
    }
    
    @Override
    public void method1671(final Class2160 class2160, final Vec3d class2161) {
        final double method1938 = this.getPosX();
        final double method1939 = this.getPosZ();
        super.method1671(class2160, class2161);
        this.method4136((float)(this.getPosX() - method1938), (float)(this.getPosZ() - method1939));
    }
    
    public boolean method4135() {
        return this.field4100;
    }
    
    public void method4136(final float n, final float n2) {
        if (this.method4137()) {
            final Vec3d method1934 = this.method1934();
            final Vec3d method1935 = method1934.add(n, 0.0, n2);
            Vec3d class5487 = new Vec3d(n, 0.0, n2);
            final float method1936 = this.method2732();
            float n3 = (float)class5487.lengthSquared();
            if (n3 <= 0.001f) {
                final Vec2f method1937 = this.field4085.method18177();
                final float n4 = method1936 * method1937.x;
                final float n5 = method1936 * method1937.y;
                final float method1938 = MathHelper.sin(this.rotationYaw * 0.017453292f);
                final float method1939 = MathHelper.cos(this.rotationYaw * 0.017453292f);
                class5487 = new Vec3d(n4 * method1939 - n5 * method1938, class5487.y, n5 * method1939 + n4 * method1938);
                n3 = (float)class5487.lengthSquared();
                if (n3 <= 0.001f) {
                    return;
                }
            }
            final float method1940 = MathHelper.fastInvSqrt(n3);
            final Vec3d method1941 = class5487.scale(method1940);
            final Vec3d method1942 = this.method1793();
            if ((float)(method1942.x * method1941.x + method1942.z * method1941.z) >= -0.15f) {
                final ISelectionContext method1943 = ISelectionContext.forEntity(this);
                final BlockPos class5488 = new BlockPos(this.getPosX(), this.getBoundingBox().maxY, this.getPosZ());
                if (this.world.getBlockState(class5488).method21728(this.world, class5488, method1943).method24540()) {
                    BlockPos class5489 = class5488.method1137();
                    if (this.world.getBlockState(class5489).method21728(this.world, class5489, method1943).method24540()) {
                        float n6 = 1.2f;
                        if (this.method2653(Class9439.field40481)) {
                            n6 += (this.method2654(Class9439.field40481).method7908() + 1) * 0.75f;
                        }
                        final Vec3d method1944 = method1935.add(method1941.scale(Math.max(method1936 * 7.0f, 1.0f / method1940)));
                        final float method1945 = this.method1930();
                        final AxisAlignedBB method1946 = new AxisAlignedBB(method1934, method1944.add(0.0, this.method1931(), 0.0)).method18495(method1945, 0.0, method1945);
                        final Vec3d method1947 = method1934.add(0.0, 0.5099999904632568, 0.0);
                        final Vec3d method1948 = method1944.add(0.0, 0.5099999904632568, 0.0);
                        final Vec3d method1949 = method1941.crossProduct(new Vec3d(0.0, 1.0, 0.0)).scale(method1945 * 0.5f);
                        final Vec3d method1950 = method1947.subtract(method1949);
                        final Vec3d method1951 = method1948.subtract(method1949);
                        final Vec3d method1952 = method1947.add(method1949);
                        final Vec3d method1953 = method1948.add(method1949);
                        final Iterator<Object> iterator = this.world.method6980(this, method1946, Collections.emptySet()).flatMap(class5492 -> class5492.method24545().stream()).iterator();
                        float n7 = Float.MIN_VALUE;
                        while (iterator.hasNext()) {
                            final AxisAlignedBB class5490 = iterator.next();
                            if (!class5490.method18504(method1950, method1951) && !class5490.method18504(method1952, method1953)) {
                                continue;
                            }
                            n7 = (float)class5490.maxY;
                            final BlockPos class5491 = new BlockPos(class5490.method18517());
                            for (int n8 = 1; n8 < n6; ++n8) {
                                final BlockPos method1954 = class5491.method1138(n8);
                                final VoxelShape method1955;
                                if (!(method1955 = this.world.getBlockState(method1954).method21728(this.world, method1954, method1943)).method24540()) {
                                    n7 = (float)method1955.method24536(Axis.Y) + method1954.getY();
                                    if (n7 - this.getPosY() > n6) {
                                        return;
                                    }
                                }
                                if (n8 > 1) {
                                    class5489 = class5489.method1137();
                                    if (!this.world.getBlockState(class5489).method21728(this.world, class5489, method1943).method24540()) {
                                        return;
                                    }
                                }
                            }
                            break;
                        }
                        if (n7 != Float.MIN_VALUE) {
                            final float n9 = (float)(n7 - this.getPosY());
                            if (n9 > 0.5f) {
                                if (n9 <= n6) {
                                    this.field4101 = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private boolean method4137() {
        if (this.method4135()) {
            if (this.field4101 <= 0) {
                if (this.onGround) {
                    if (!this.method2806()) {
                        if (!this.isPassenger()) {
                            if (this.method4138()) {
                                if (this.method1673() >= 1.0) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private boolean method4138() {
        final Vec2f method18177 = this.field4085.method18177();
        return method18177.x != 0.0f || method18177.y != 0.0f;
    }
    
    private boolean method4139() {
        return this.method1712() ? this.field4085.method18178() : (this.field4085.field24722 >= 0.8);
    }
    
    public float method4140() {
        if (!this.method1720(Class7324.field28319)) {
            return 0.0f;
        }
        if (this.field4103 < 600.0f) {
            return MathHelper.clamp(this.field4103 / 100.0f, 0.0f, 1.0f) * 0.6f + ((this.field4103 >= 100.0f) ? MathHelper.clamp((this.field4103 - 100.0f) / 500.0f, 0.0f, 1.0f) : 0.0f) * 0.39999998f;
        }
        return 1.0f;
    }
    
    @Override
    public boolean method1712() {
        return this.field3022;
    }
    
    @Override
    public boolean method2807() {
        final boolean field3022 = this.field3022;
        final boolean method2807 = super.method2807();
        if (!this.isSpectator()) {
            if (!field3022) {
                if (method2807) {
                    this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field34965, Class286.field1586, 1.0f, 1.0f, false);
                    this.field4086.method5299().method6422(new Class6837(this));
                }
            }
            if (field3022) {
                if (!method2807) {
                    this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field34966, Class286.field1586, 1.0f, 1.0f, false);
                }
            }
            return this.field3022;
        }
        return this.field3022;
    }
}
