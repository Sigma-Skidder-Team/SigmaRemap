// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class432 extends Class428
{
    private int field2644;
    
    public Class432(final EntityType<? extends Class432> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2644 = -1;
    }
    
    public Class432(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29005, class1847, n, n2, n3);
        this.field2644 = -1;
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12027;
    }
    
    @Override
    public BlockState method2141() {
        return Blocks.TNT.getDefaultState();
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2644 <= 0) {
            if (this.field2644 == 0) {
                this.method2152(Entity.horizontalMag(this.getMotion()));
            }
        }
        else {
            --this.field2644;
            this.world.addParticle(Class8432.field34639, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), 0.0, 0.0, 0.0);
        }
        if (this.collidedHorizontally) {
            final double method1680 = Entity.horizontalMag(this.getMotion());
            if (method1680 >= 0.009999999776482582) {
                this.method2152(method1680);
            }
        }
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        final Entity method25713 = class7929.method25713();
        if (method25713 instanceof Class402) {
            final Class402 class7930 = (Class402)method25713;
            if (class7930.method1804()) {
                this.method2152(class7930.getMotion().lengthSquared());
            }
        }
        return super.attackEntityFrom(class7929, n);
    }
    
    @Override
    public void method2123(final DamageSource class7929) {
        final double method1680 = Entity.horizontalMag(this.getMotion());
        if (!class7929.method25719()) {
            if (!class7929.method25707()) {
                if (method1680 < 0.009999999776482582) {
                    super.method2123(class7929);
                    if (class7929.method25707()) {
                        return;
                    }
                    if (!this.world.method6765().method31216(Class8878.field37321)) {
                        return;
                    }
                    this.method1764(Blocks.TNT);
                    return;
                }
            }
        }
        if (this.field2644 < 0) {
            this.method2153();
            this.field2644 = this.rand.nextInt(20) + this.rand.nextInt(20);
        }
    }
    
    public void method2152(final double a) {
        if (!this.world.isRemote) {
            double sqrt = Math.sqrt(a);
            if (sqrt > 5.0) {
                sqrt = 5.0;
            }
            this.world.createExplosion(this, this.getPosX(), this.getPosY(), this.getPosZ(), (float)(4.0 + this.rand.nextDouble() * 1.5 * sqrt), Explosion.Mode.field13366);
            this.method1652();
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        if (n >= 3.0f) {
            final float n3 = n / 10.0f;
            this.method2152(n3 * n3);
        }
        return super.method1705(n, n2);
    }
    
    @Override
    public void method2126(final int n, final int n2, final int n3, final boolean b) {
        if (b) {
            if (this.field2644 < 0) {
                this.method2153();
            }
        }
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 10) {
            super.method1798(b);
        }
        else {
            this.method2153();
        }
    }
    
    public void method2153() {
        this.field2644 = 80;
        if (!this.world.isRemote) {
            this.world.method6761(this, (byte)10);
            if (!this.method1696()) {
                this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35632, Class286.field1582, 1.0f, 1.0f);
            }
        }
    }
    
    public int method2154() {
        return this.field2644;
    }
    
    public boolean method2155() {
        return this.field2644 > -1;
    }
    
    @Override
    public float method1856(final Explosion explosion, final IBlockReader class6155, final BlockPos class6156, final BlockState class6157, final IFluidState class6158, final float n) {
        return (this.method2155() && (class6157.method21755(Class7188.field27906) || class6155.getBlockState(class6156.method1137()).method21755(Class7188.field27906))) ? 0.0f : super.method1856(explosion, class6155, class6156, class6157, class6158, n);
    }
    
    @Override
    public boolean method1857(final Explosion explosion, final IBlockReader class6155, final BlockPos class6156, final BlockState class6157, final float n) {
        return (!this.method2155() || (!class6157.method21755(Class7188.field27906) && !class6155.getBlockState(class6156.method1137()).method21755(Class7188.field27906))) && super.method1857(explosion, class6155, class6156, class6157, n);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("TNTFuse", 99)) {
            this.field2644 = class51.getInt("TNTFuse");
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("TNTFuse", this.field2644);
    }
}
