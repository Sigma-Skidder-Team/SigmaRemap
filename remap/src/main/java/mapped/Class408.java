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

public class Class408 extends Entity implements Class407
{
    private static final DataParameter<ItemStack> field2500;
    private double field2501;
    private double field2502;
    private double field2503;
    private int field2504;
    private boolean field2505;
    
    public Class408(final EntityType<? extends Class408> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class408(final World class1847, final double n, final double n2, final double n3) {
        this(EntityType.field28982, class1847);
        this.field2504 = 0;
        this.setPosition(n, n2, n3);
    }
    
    public void method2008(final ItemStack class8321) {
        if (class8321.getItem() != Items.field31449 || class8321.method27656()) {
            this.method1650().set(Class408.field2500, Util.method27851((T)class8321.method27641(), class8322 -> class8322.method27691(1)));
        }
    }
    
    private ItemStack method2009() {
        return this.method1650().get(Class408.field2500);
    }
    
    @Override
    public ItemStack method2005() {
        final ItemStack method2009 = this.method2009();
        return method2009.method27620() ? new ItemStack(Items.field31449) : method2009;
    }
    
    @Override
    public void method1649() {
        this.method1650().register(Class408.field2500, ItemStack.EMPTY);
    }
    
    @Override
    public boolean method1753(final double n) {
        double v = this.getBoundingBox().getAverageEdgeLength() * 4.0;
        if (Double.isNaN(v)) {
            v = 4.0;
        }
        final double n2 = v * 64.0;
        return n < n2 * n2;
    }
    
    public void method2010(final BlockPos class354) {
        final double field2501 = class354.getX();
        final int method1075 = class354.getY();
        final double field2502 = class354.getZ();
        final double n = field2501 - this.getPosX();
        final double n2 = field2502 - this.getPosZ();
        final float method1076 = MathHelper.sqrt(n * n + n2 * n2);
        if (method1076 <= 12.0f) {
            this.field2501 = field2501;
            this.field2502 = method1075;
            this.field2503 = field2502;
        }
        else {
            this.field2501 = this.getPosX() + n / method1076 * 12.0;
            this.field2503 = this.getPosZ() + n2 / method1076 * 12.0;
            this.field2502 = this.getPosY() + 8.0;
        }
        this.field2504 = 0;
        this.field2505 = (this.rand.nextInt(5) > 0);
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
        Vec3d method1935 = this.getMotion();
        final double n = this.getPosX() + method1935.x;
        final double n2 = this.getPosY() + method1935.y;
        final double n3 = this.getPosZ() + method1935.z;
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
        if (!this.world.isRemote) {
            final double n4 = this.field2501 - n;
            final double n5 = this.field2503 - n3;
            final float n6 = (float)Math.sqrt(n4 * n4 + n5 * n5);
            final float n7 = (float) MathHelper.method35693(n5, n4);
            double method1937 = MathHelper.lerp(0.0025, method1936, n6);
            double field22771 = method1935.y;
            if (n6 < 1.0f) {
                method1937 *= 0.8;
                field22771 *= 0.8;
            }
            method1935 = new Vec3d(Math.cos(n7) * method1937, field22771 + (((this.getPosY() >= this.field2502) ? -1 : 1) - field22771) * 0.014999999664723873, Math.sin(n7) * method1937);
            this.method1936(method1935);
        }
        if (!this.method1706()) {
            this.world.addParticle(Class8432.field34637, n - method1935.x * 0.25 + this.rand.nextDouble() * 0.6 - 0.3, n2 - method1935.y * 0.25 - 0.5, n3 - method1935.z * 0.25 + this.rand.nextDouble() * 0.6 - 0.3, method1935.x, method1935.y, method1935.z);
        }
        else {
            for (int i = 0; i < 4; ++i) {
                this.world.addParticle(Class8432.field34601, n - method1935.x * 0.25, n2 - method1935.y * 0.25, n3 - method1935.z * 0.25, method1935.x, method1935.y, method1935.z);
            }
        }
        if (this.world.isRemote) {
            this.method1948(n, n2, n3);
        }
        else {
            this.setPosition(n, n2, n3);
            ++this.field2504;
            if (this.field2504 > 80) {
                if (!this.world.isRemote) {
                    this.method1695(Class8520.field35160, 1.0f, 1.0f);
                    this.method1652();
                    if (!this.field2505) {
                        this.world.method6955(2003, new BlockPos(this), 0);
                    }
                    else {
                        this.world.method6886(new Class427(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), this.method2005()));
                    }
                }
            }
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        final ItemStack method2009 = this.method2009();
        if (!method2009.method27620()) {
            class51.put("Item", method2009.method27627(new CompoundNBT()));
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        this.method2008(ItemStack.method27619(class51.getCompound("Item")));
    }
    
    @Override
    public float method1726() {
        return 1.0f;
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
    
    static {
        field2500 = EntityDataManager.method33564(Class408.class, Class7709.field30659);
    }
}
