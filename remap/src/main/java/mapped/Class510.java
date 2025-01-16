// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.*;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class510 extends Entity
{
    private static final DataParameter<Integer> field2915;
    private LivingEntity field2916;
    private int field2917;
    
    public Class510(final EntityType<? extends Class510> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2917 = 80;
        this.preventEntitySpawning = true;
    }
    
    public Class510(final World class1847, final double field2392, final double field2393, final double field2394, final LivingEntity field2395) {
        this(EntityType.field29016, class1847);
        this.setPosition(field2392, field2393, field2394);
        final double n = class1847.rand.nextDouble() * 6.2831854820251465;
        this.setMotion(-Math.sin(n) * 0.02, 0.20000000298023224, -Math.cos(n) * 0.02);
        this.method2615(80);
        this.prevPosX = field2392;
        this.prevPosY = field2393;
        this.prevPosZ = field2394;
        this.field2916 = field2395;
    }
    
    @Override
    public void method1649() {
        this.dataManager.register(Class510.field2915, 80);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public boolean method1749() {
        return !this.removed;
    }
    
    @Override
    public void method1659() {
        if (!this.method1698()) {
            this.method1936(this.getMotion().add(0.0, -0.04, 0.0));
        }
        this.method1671(Class2160.field12826, this.getMotion());
        this.method1936(this.getMotion().scale(0.98));
        if (this.onGround) {
            this.method1936(this.getMotion().mul(0.7, -0.5, 0.7));
        }
        --this.field2917;
        if (this.field2917 > 0) {
            this.method1715();
            if (this.world.isRemote) {
                this.world.method6709(Class8432.field34639, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), 0.0, 0.0, 0.0);
            }
        }
        else {
            this.method1652();
            if (!this.world.isRemote) {
                this.method2613();
            }
        }
    }
    
    private void method2613() {
        this.world.createExplosion(this, this.getPosX(), this.method1942(0.0625), this.getPosZ(), 4.0f, Class2196.field13366);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method297("Fuse", (short)this.method2617());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.method2615(class51.method318("Fuse"));
    }
    
    @Nullable
    public LivingEntity method2614() {
        return this.field2916;
    }
    
    @Override
    public float method1890(final Pose class290, final EntitySize class291) {
        return 0.0f;
    }
    
    public void method2615(final int n) {
        this.dataManager.set(Class510.field2915, n);
        this.field2917 = n;
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class510.field2915.equals(class8810)) {
            this.field2917 = this.method2616();
        }
    }
    
    public int method2616() {
        return this.dataManager.get(Class510.field2915);
    }
    
    public int method2617() {
        return this.field2917;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
    
    static {
        field2915 = EntityDataManager.method33564(Class510.class, Class7709.field30654);
    }
}
