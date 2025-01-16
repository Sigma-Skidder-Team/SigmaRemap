// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Map;

public class Class508 extends Entity
{
    public int field2897;
    public int field2898;
    public int field2899;
    private int field2900;
    private int field2901;
    private PlayerEntity field2902;
    private int field2903;
    
    public Class508(final World class1847, final double n, final double n2, final double n3, final int field2901) {
        this(EntityType.field28981, class1847);
        this.setPosition(n, n2, n3);
        this.rotationYaw = (float)(this.rand.nextDouble() * 360.0);
        this.setMotion((this.rand.nextDouble() * 0.20000000298023224 - 0.10000000149011612) * 2.0, this.rand.nextDouble() * 0.2 * 2.0, (this.rand.nextDouble() * 0.20000000298023224 - 0.10000000149011612) * 2.0);
        this.field2901 = field2901;
    }
    
    public Class508(final EntityType<? extends Class508> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2900 = 5;
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1649() {
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2899 > 0) {
            --this.field2899;
        }
        this.prevPosX = this.getPosX();
        this.prevPosY = this.getPosY();
        this.prevPosZ = this.getPosZ();
        if (!this.method1720(Class7324.field28319)) {
            if (!this.method1698()) {
                this.method1936(this.getMotion().add(0.0, -0.03, 0.0));
            }
        }
        else {
            this.method2604();
        }
        if (this.world.getFluidState(new BlockPos(this)).isTagged(Class7324.field28320)) {
            this.setMotion((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f, 0.20000000298023224, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f);
            this.method1695(Class8520.field35214, 0.4f, 2.0f + this.rand.nextFloat() * 0.4f);
        }
        if (!this.world.method6976(this.getBoundingBox())) {
            this.pushOutOfBlocks(this.getPosX(), (this.getBoundingBox().minY + this.getBoundingBox().maxY) / 2.0, this.getPosZ());
        }
        if (this.field2903 < this.field2897 - 20 + this.getEntityId() % 100) {
            if (this.field2902 == null || this.field2902.method1734(this) > 64.0) {
                this.field2902 = this.world.method7131(this, 8.0);
            }
            this.field2903 = this.field2897;
        }
        if (this.field2902 != null) {
            if (this.field2902.isSpectator()) {
                this.field2902 = null;
            }
        }
        if (this.field2902 != null) {
            final Vec3d class5487 = new Vec3d(this.field2902.getPosX() - this.getPosX(), this.field2902.getPosY() + this.field2902.method1892() / 2.0 - this.getPosY(), this.field2902.getPosZ() - this.getPosZ());
            final double method16753 = class5487.lengthSquared();
            if (method16753 < 64.0) {
                final double n = 1.0 - Math.sqrt(method16753) / 8.0;
                this.method1936(this.getMotion().add(class5487.normalize().scale(n * n * 0.1)));
            }
        }
        this.method1671(Class2160.field12826, this.getMotion());
        float n2 = 0.98f;
        if (this.onGround) {
            n2 = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).method21696().method11865() * 0.98f;
        }
        this.method1936(this.getMotion().mul(n2, 0.98, n2));
        if (this.onGround) {
            this.method1936(this.getMotion().mul(1.0, -0.9, 1.0));
        }
        ++this.field2897;
        ++this.field2898;
        if (this.field2898 >= 6000) {
            this.method1652();
        }
    }
    
    private void method2604() {
        final Vec3d method1935 = this.getMotion();
        this.setMotion(method1935.x * 0.9900000095367432, Math.min(method1935.y + 5.000000237487257E-4, 0.05999999865889549), method1935.z * 0.9900000095367432);
    }
    
    @Override
    public void method1717() {
    }
    
    @Override
    public void method1703(final int n) {
        this.attackEntityFrom(DamageSource.field32562, (float)n);
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (!this.method1849(class7929)) {
            this.method1739();
            this.field2900 -= (int)n;
            if (this.field2900 <= 0) {
                this.method1652();
            }
            return false;
        }
        return false;
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        class51.putShort("Health", (short)this.field2900);
        class51.putShort("Age", (short)this.field2898);
        class51.putShort("Value", (short)this.field2901);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        this.field2900 = class51.getShort("Health");
        this.field2898 = class51.getShort("Age");
        this.field2901 = class51.getShort("Value");
    }
    
    @Override
    public void method1736(final PlayerEntity playerEntity) {
        if (!this.world.isRemote) {
            if (this.field2899 == 0) {
                if (playerEntity.field3014 == 0) {
                    playerEntity.field3014 = 2;
                    playerEntity.method2746(this, 1);
                    final Map.Entry<Class2215, ItemStack> method30222 = Class8742.method30222(Class7882.field32382, playerEntity);
                    if (method30222 != null) {
                        final ItemStack class513 = method30222.getValue();
                        if (!class513.method27620()) {
                            if (class513.method27631()) {
                                final int min = Math.min(this.method2606(this.field2901), class513.method27632());
                                this.field2901 -= this.method2605(min);
                                class513.method27633(class513.method27632() - min);
                            }
                        }
                    }
                    if (this.field2901 > 0) {
                        playerEntity.method2871(this.field2901);
                    }
                    this.method1652();
                }
            }
        }
    }
    
    private int method2605(final int n) {
        return n / 2;
    }
    
    private int method2606(final int n) {
        return n * 2;
    }
    
    public int method2607() {
        return this.field2901;
    }
    
    public int method2608() {
        if (this.field2901 >= 2477) {
            return 10;
        }
        if (this.field2901 >= 1237) {
            return 9;
        }
        if (this.field2901 >= 617) {
            return 8;
        }
        if (this.field2901 >= 307) {
            return 7;
        }
        if (this.field2901 >= 149) {
            return 6;
        }
        if (this.field2901 >= 73) {
            return 5;
        }
        if (this.field2901 >= 37) {
            return 4;
        }
        if (this.field2901 >= 17) {
            return 3;
        }
        if (this.field2901 < 7) {
            return (this.field2901 >= 3) ? 1 : 0;
        }
        return 2;
    }
    
    public static int method2609(final int n) {
        if (n >= 2477) {
            return 2477;
        }
        if (n >= 1237) {
            return 1237;
        }
        if (n >= 617) {
            return 617;
        }
        if (n >= 307) {
            return 307;
        }
        if (n >= 149) {
            return 149;
        }
        if (n >= 73) {
            return 73;
        }
        if (n >= 37) {
            return 37;
        }
        if (n >= 17) {
            return 17;
        }
        if (n < 7) {
            return (n < 3) ? 1 : 3;
        }
        return 7;
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4375(this);
    }
}
