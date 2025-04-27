// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.UUID;

public class Class507 extends Entity
{
    private int field2891;
    private boolean field2892;
    private int field2893;
    private boolean field2894;
    private LivingEntity field2895;
    private UUID field2896;
    
    public Class507(final EntityType<? extends Class507> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2893 = 22;
    }
    
    public Class507(final World class1847, final double n, final double n2, final double n3, final float n4, final int field2891, final LivingEntity class1848) {
        this(EntityType.field28979, class1847);
        this.field2891 = field2891;
        this.method2600(class1848);
        this.rotationYaw = n4 * 57.295776f;
        this.setPosition(n, n2, n3);
    }
    
    @Override
    public void method1649() {
    }
    
    public void method2600(final LivingEntity field2895) {
        this.field2895 = field2895;
        this.field2896 = ((field2895 != null) ? field2895.getUniqueID() : null);
    }
    
    @Nullable
    public LivingEntity method2601() {
        if (this.field2895 == null) {
            if (this.field2896 != null) {
                if (this.world instanceof Class1849) {
                    final Entity method6914 = ((Class1849)this.world).method6914(this.field2896);
                    if (method6914 instanceof LivingEntity) {
                        this.field2895 = (LivingEntity)method6914;
                    }
                }
            }
        }
        return this.field2895;
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        this.field2891 = class51.getInt("Warmup");
        if (class51.hasUniqueId("OwnerUUID")) {
            this.field2896 = class51.getUniqueId("OwnerUUID");
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        class51.putInt("Warmup", this.field2891);
        if (this.field2896 != null) {
            class51.putUniqueId("OwnerUUID", this.field2896);
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.world.isRemote) {
            if (--this.field2891 < 0) {
                if (this.field2891 == -8) {
                    final Iterator<LivingEntity> iterator = this.world.method7128((Class<? extends LivingEntity>) LivingEntity.class, this.getBoundingBox().grow(0.2, 0.0, 0.2)).iterator();
                    while (iterator.hasNext()) {
                        this.method2602(iterator.next());
                    }
                }
                if (!this.field2892) {
                    this.world.method6761(this, (byte)4);
                    this.field2892 = true;
                }
                if (--this.field2893 < 0) {
                    this.method1652();
                }
            }
        }
        else if (this.field2894) {
            --this.field2893;
            if (this.field2893 == 14) {
                for (int i = 0; i < 12; ++i) {
                    this.world.method6709(Class8432.field34603, this.getPosX() + (this.rand.nextDouble() * 2.0 - 1.0) * this.method1930() * 0.5, this.getPosY() + 0.05 + this.rand.nextDouble() + 1.0, this.getPosZ() + (this.rand.nextDouble() * 2.0 - 1.0) * this.method1930() * 0.5, (this.rand.nextDouble() * 2.0 - 1.0) * 0.3, 0.3 + this.rand.nextDouble() * 0.3, (this.rand.nextDouble() * 2.0 - 1.0) * 0.3);
                }
            }
        }
    }
    
    private void method2602(final LivingEntity class511) {
        final LivingEntity method2601 = this.method2601();
        if (class511.isAlive()) {
            if (!class511.method1850()) {
                if (class511 != method2601) {
                    if (method2601 != null) {
                        if (method2601.method1826(class511)) {
                            return;
                        }
                        class511.attackEntityFrom(DamageSource.method25700(this, method2601), 6.0f);
                    }
                    else {
                        class511.attackEntityFrom(DamageSource.field32576, 6.0f);
                    }
                }
            }
        }
    }
    
    @Override
    public void method1798(final byte b) {
        super.method1798(b);
        if (b == 4) {
            this.field2894 = true;
            if (!this.method1696()) {
                this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35180, this.method1922(), 1.0f, this.rand.nextFloat() * 0.2f + 0.85f, false);
            }
        }
    }
    
    public float method2603(final float n) {
        if (this.field2894) {
            final int n2 = this.field2893 - 2;
            return (n2 > 0) ? (1.0f - (n2 - n) / 20.0f) : 1.0f;
        }
        return 0.0f;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
}
