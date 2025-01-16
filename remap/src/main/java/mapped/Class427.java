// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.UUID;

public class Class427 extends Entity
{
    private static final DataParameter<ItemStack> field2613;
    private int field2614;
    private int field2615;
    private int field2616;
    private UUID field2617;
    private UUID field2618;
    public final float field2619;
    
    public Class427(final EntityType<? extends Class427> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2616 = 5;
        this.field2619 = (float)(Math.random() * 3.141592653589793 * 2.0);
    }
    
    public Class427(final World class1847, final double n, final double n2, final double n3) {
        this(EntityType.field28992, class1847);
        this.setPosition(n, n2, n3);
        this.rotationYaw = this.rand.nextFloat() * 360.0f;
        this.setMotion(this.rand.nextDouble() * 0.2 - 0.1, 0.2, this.rand.nextDouble() * 0.2 - 0.1);
    }
    
    public Class427(final World class1847, final double n, final double n2, final double n3, final ItemStack class1848) {
        this(class1847, n, n2, n3);
        this.method2108(class1848);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1649() {
        this.method1650().register(Class427.field2613, ItemStack.field34174);
    }
    
    @Override
    public void method1659() {
        if (!this.method2107().method27620()) {
            super.method1659();
            if (this.field2615 > 0) {
                if (this.field2615 != 32767) {
                    --this.field2615;
                }
            }
            this.prevPosX = this.getPosX();
            this.prevPosY = this.getPosY();
            this.prevPosZ = this.getPosZ();
            final Vec3d method1935 = this.getMotion();
            if (!this.method1720(Class7324.field28319)) {
                if (!this.method1698()) {
                    this.method1936(this.getMotion().add(0.0, -0.04, 0.0));
                }
            }
            else {
                this.method2099();
            }
            if (!this.world.isRemote) {
                if (this.noClip = !this.world.method6977(this)) {
                    this.pushOutOfBlocks(this.getPosX(), (this.getBoundingBox().minY + this.getBoundingBox().maxY) / 2.0, this.getPosZ());
                }
            }
            else {
                this.noClip = false;
            }
            Label_0234: {
                if (this.onGround) {
                    if (Entity.horizontalMag(this.getMotion()) <= 9.999999747378752E-6) {
                        if ((this.ticksExisted + this.getEntityId()) % 4 != 0) {
                            break Label_0234;
                        }
                    }
                }
                this.method1671(Class2160.field12826, this.getMotion());
                float n = 0.98f;
                if (this.onGround) {
                    n = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).method21696().method11865() * 0.98f;
                }
                this.method1936(this.getMotion().mul(n, 0.98, n));
                if (this.onGround) {
                    this.method1936(this.getMotion().mul(1.0, -0.5, 1.0));
                }
            }
            boolean b = false;
            Label_0441: {
                if (MathHelper.floor(this.prevPosX) == MathHelper.floor(this.getPosX())) {
                    if (MathHelper.floor(this.prevPosY) == MathHelper.floor(this.getPosY())) {
                        if (MathHelper.floor(this.prevPosZ) == MathHelper.floor(this.getPosZ())) {
                            b = false;
                            break Label_0441;
                        }
                    }
                }
                b = true;
            }
            if (this.ticksExisted % (b ? 2 : 40) == 0) {
                if (this.world.getFluidState(new BlockPos(this)).isTagged(Class7324.field28320)) {
                    this.setMotion((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f, 0.20000000298023224, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f);
                    this.method1695(Class8520.field35214, 0.4f, 2.0f + this.rand.nextFloat() * 0.4f);
                }
                if (!this.world.isRemote) {
                    if (this.method2101()) {
                        this.method2100();
                    }
                }
            }
            if (this.field2614 != -32768) {
                ++this.field2614;
            }
            this.isAirBorne |= this.method1715();
            if (!this.world.isRemote) {
                if (this.getMotion().subtract(method1935).lengthSquared() > 0.01) {
                    this.isAirBorne = true;
                }
            }
            if (!this.world.isRemote) {
                if (this.field2614 >= 6000) {
                    this.method1652();
                }
            }
        }
        else {
            this.method1652();
        }
    }
    
    private void method2099() {
        final Vec3d method1935 = this.getMotion();
        this.setMotion(method1935.x * 0.9900000095367432, method1935.y + ((method1935.y >= 0.05999999865889549) ? 0.0f : 5.0E-4f), method1935.z * 0.9900000095367432);
    }
    
    private void method2100() {
        if (this.method2101()) {
            for (final Class427 class427 : this.world.method6739((Class<? extends Class427>)Class427.class, this.getBoundingBox().grow(0.5, 0.0, 0.5), class428 -> class428 != this && class428.method2101())) {
                if (!class427.method2101()) {
                    continue;
                }
                this.method2102(class427);
                if (!this.removed) {
                    continue;
                }
                break;
            }
        }
    }
    
    private boolean method2101() {
        final ItemStack method2107 = this.method2107();
        if (this.method1768()) {
            if (this.field2615 != 32767) {
                if (this.field2614 != -32768) {
                    if (this.field2614 < 6000) {
                        if (method2107.method27690() < method2107.method27628()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private void method2102(final Class427 class427) {
        final ItemStack method2107 = this.method2107();
        final ItemStack method2108 = class427.method2107();
        if (Objects.equals(this.method2109(), class427.method2109())) {
            if (method2103(method2107, method2108)) {
                if (method2108.method27690() >= method2107.method27690()) {
                    method2106(class427, method2108, this, method2107);
                }
                else {
                    method2106(this, method2107, class427, method2108);
                }
            }
        }
    }
    
    public static boolean method2103(final ItemStack class8321, final ItemStack class8322) {
        return class8322.getItem() == class8321.getItem() && class8322.method27690() + class8321.method27690() <= class8322.method27628() && !(class8322.method27656() ^ class8321.method27656()) && (!class8322.method27656() || class8322.method27657().equals(class8321.method27657()));
    }
    
    public static ItemStack method2104(final ItemStack class8321, final ItemStack class8322, final int b) {
        final int min = Math.min(Math.min(class8321.method27628(), b) - class8321.method27690(), class8322.method27690());
        final ItemStack method27641 = class8321.method27641();
        method27641.method27692(min);
        class8322.method27693(min);
        return method27641;
    }
    
    private static void method2105(final Class427 class427, final ItemStack class428, final ItemStack class429) {
        class427.method2108(method2104(class428, class429, 64));
    }
    
    private static void method2106(final Class427 class427, final ItemStack class428, final Class427 class429, final ItemStack class430) {
        method2105(class427, class428, class430);
        class427.field2615 = Math.max(class427.field2615, class429.field2615);
        class427.field2614 = Math.min(class427.field2614, class429.field2614);
        if (class430.method27620()) {
            class429.method1652();
        }
    }
    
    @Override
    public void method1703(final int n) {
        this.attackEntityFrom(DamageSource.field32562, (float)n);
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (!this.method1849(class7929)) {
            if (!this.method2107().method27620()) {
                if (this.method2107().getItem() == Items.field31530) {
                    if (class7929.method25707()) {
                        return false;
                    }
                }
            }
            this.method1739();
            this.field2616 -= (int)n;
            if (this.field2616 <= 0) {
                this.method1652();
            }
            return false;
        }
        return false;
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method297("Health", (short)this.field2616);
        class51.method297("Age", (short)this.field2614);
        class51.method297("PickupDelay", (short)this.field2615);
        if (this.method2111() != null) {
            class51.method295("Thrower", Class9346.method34643(this.method2111()));
        }
        if (this.method2109() != null) {
            class51.method295("Owner", Class9346.method34643(this.method2109()));
        }
        if (!this.method2107().method27620()) {
            class51.method295("Item", this.method2107().method27627(new Class51()));
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2616 = class51.method318("Health");
        this.field2614 = class51.method318("Age");
        if (class51.method315("PickupDelay")) {
            this.field2615 = class51.method318("PickupDelay");
        }
        if (class51.method316("Owner", 10)) {
            this.field2618 = Class9346.method34644(class51.method327("Owner"));
        }
        if (class51.method316("Thrower", 10)) {
            this.field2617 = Class9346.method34644(class51.method327("Thrower"));
        }
        this.method2108(ItemStack.method27619(class51.method327("Item")));
        if (this.method2107().method27620()) {
            this.method1652();
        }
    }
    
    @Override
    public void method1736(final PlayerEntity playerEntity) {
        if (!this.world.isRemote) {
            final ItemStack method2107 = this.method2107();
            final Item method2108 = method2107.getItem();
            final int method2109 = method2107.method27690();
            if (this.field2615 == 0) {
                if (this.field2618 == null || this.field2618.equals(playerEntity.method1865())) {
                    if (playerEntity.field3006.method2362(method2107)) {
                        playerEntity.method2746(this, method2109);
                        if (method2107.method27620()) {
                            this.method1652();
                            method2107.method27691(method2109);
                        }
                        playerEntity.method2860(Class8276.field33983.method8449(method2108), method2109);
                    }
                }
            }
        }
    }
    
    @Override
    public ITextComponent getName() {
        final ITextComponent method1873 = this.getCustomName();
        return (method1873 == null) ? new Class2259(this.method2107().method27649(), new Object[0]) : method1873;
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    @Nullable
    @Override
    public Entity method1854(final DimensionType class383) {
        final Entity method1854 = super.method1854(class383);
        if (!this.world.isRemote) {
            if (method1854 instanceof Class427) {
                ((Class427)method1854).method2100();
            }
        }
        return method1854;
    }
    
    public ItemStack method2107() {
        return this.method1650().get(Class427.field2613);
    }
    
    public void method2108(final ItemStack class8321) {
        this.method1650().set(Class427.field2613, class8321);
    }
    
    @Nullable
    public UUID method2109() {
        return this.field2618;
    }
    
    public void method2110(final UUID field2618) {
        this.field2618 = field2618;
    }
    
    @Nullable
    public UUID method2111() {
        return this.field2617;
    }
    
    public void method2112(final UUID field2617) {
        this.field2617 = field2617;
    }
    
    public int method2113() {
        return this.field2614;
    }
    
    public void method2114() {
        this.field2615 = 10;
    }
    
    public void method2115() {
        this.field2615 = 0;
    }
    
    public void method2116() {
        this.field2615 = 32767;
    }
    
    public void method2117(final int field2615) {
        this.field2615 = field2615;
    }
    
    public boolean method2118() {
        return this.field2615 > 0;
    }
    
    public void method2119() {
        this.field2614 = -6000;
    }
    
    public void method2120() {
        this.method2116();
        this.field2614 = 5999;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
    
    static {
        field2613 = EntityDataManager.method33564(Class427.class, Class7709.field30659);
    }
}
