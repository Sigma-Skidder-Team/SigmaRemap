// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.Collection;

public class Class765 extends Class763 implements Class766
{
    private static final DataParameter<Integer> field4135;
    private static final DataParameter<Boolean> field4136;
    private static final DataParameter<Boolean> field4137;
    private int field4138;
    private int field4139;
    private int field4140;
    private int field4141;
    private int field4142;
    
    public Class765(final EntityType<? extends Class765> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4140 = 30;
        this.field4141 = 3;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3490(this));
        this.field4114.method22062(2, new Class3498(this));
        this.field4114.method22062(3, new Class3448<Object>(this, Class817.class, 6.0f, 1.0, 1.2));
        this.field4114.method22062(3, new Class3448<Object>(this, Class800.class, 6.0f, 1.0, 1.2));
        this.field4114.method22062(4, new Class3574(this, 1.0, false));
        this.field4114.method22062(5, new Class3517(this, 0.8));
        this.field4114.method22062(6, new Class3628(this, PlayerEntity.class, 8.0f));
        this.field4114.method22062(6, new Class3503(this));
        this.field4115.method22062(1, new Class3555<Object>(this, PlayerEntity.class, true));
        this.field4115.method22062(2, new Class3547(this, (Class<?>[])new Class[0]));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.25);
    }
    
    @Override
    public int method1858() {
        return (this.method4152() != null) ? (3 + (int)(this.method2664() - 1.0f)) : 3;
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        final boolean method1705 = super.method1705(n, n2);
        this.field4139 += (int)(n * 1.5f);
        if (this.field4139 > this.field4140 - 5) {
            this.field4139 = this.field4140 - 5;
        }
        return method1705;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class765.field4135, -1);
        this.dataManager.register(Class765.field4136, false);
        this.dataManager.register(Class765.field4137, false);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        if (this.dataManager.get(Class765.field4136)) {
            class51.method312("powered", true);
        }
        class51.method297("Fuse", (short)this.field4140);
        class51.method296("ExplosionRadius", (byte)this.field4141);
        class51.method312("ignited", this.method4239());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.dataManager.set(Class765.field4136, class51.method329("powered"));
        if (class51.method316("Fuse", 99)) {
            this.field4140 = class51.method318("Fuse");
        }
        if (class51.method316("ExplosionRadius", 99)) {
            this.field4141 = class51.method317("ExplosionRadius");
        }
        if (class51.method329("ignited")) {
            this.method4240();
        }
    }
    
    @Override
    public void method1659() {
        if (this.method1768()) {
            this.field4138 = this.field4139;
            if (this.method4239()) {
                this.method4236(1);
            }
            final int method4235 = this.method4235();
            if (method4235 > 0) {
                if (this.field4139 == 0) {
                    this.method1695(Class8520.field35102, 1.0f, 0.5f);
                }
            }
            this.field4139 += method4235;
            if (this.field4139 < 0) {
                this.field4139 = 0;
            }
            if (this.field4139 >= this.field4140) {
                this.field4139 = this.field4140;
                this.method4237();
            }
        }
        super.method1659();
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35101;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35100;
    }
    
    @Override
    public void method2678(final DamageSource class7929, final int n, final boolean b) {
        super.method2678(class7929, n, b);
        final Entity method25714 = class7929.method25714();
        if (method25714 != this) {
            if (method25714 instanceof Class765) {
                final Class765 class7930 = (Class765)method25714;
                if (class7930.method4241()) {
                    class7930.method4242();
                    this.method1764(Items.field31527);
                }
            }
        }
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        return true;
    }
    
    @Override
    public boolean method4233() {
        return this.dataManager.get(Class765.field4136);
    }
    
    public float method4234(final float n) {
        return MathHelper.method35700(n, (float)this.field4138, (float)this.field4139) / (this.field4140 - 2);
    }
    
    public int method4235() {
        return this.dataManager.get(Class765.field4135);
    }
    
    public void method4236(final int i) {
        this.dataManager.set(Class765.field4135, i);
    }
    
    @Override
    public void onStruckByLightning(final LightningBoltEntity class422) {
        super.onStruckByLightning(class422);
        this.dataManager.set(Class765.field4136, true);
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (method2715.getItem() != Items.field31277) {
            return super.method4195(playerEntity, class513);
        }
        this.world.method6706(playerEntity, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35201, this.method1922(), 1.0f, this.rand.nextFloat() * 0.4f + 0.8f);
        if (!this.world.isRemote) {
            this.method4240();
            method2715.method27636(1, playerEntity, class515 -> class515.method2795(class514));
        }
        return true;
    }
    
    private void method4237() {
        if (!this.world.isRemote) {
            final Explosion.Mode mode = this.world.method6765().method31216(Class8878.field37316) ? Explosion.Mode.field13367 : Explosion.Mode.field13365;
            final float n = this.method4233() ? 2.0f : 1.0f;
            this.field2958 = true;
            this.world.createExplosion(this, this.getPosX(), this.getPosY(), this.getPosZ(), this.field4141 * n, mode);
            this.method1652();
            this.method4238();
        }
    }
    
    private void method4238() {
        final Collection<Class1948> method2651 = this.method2651();
        if (!method2651.isEmpty()) {
            final Class426 class426 = new Class426(this.world, this.getPosX(), this.getPosY(), this.getPosZ());
            class426.method2081(2.5f);
            class426.method2094(-0.5f);
            class426.method2096(10);
            class426.method2093(class426.method2092() / 2);
            class426.method2095(-class426.method2082() / class426.method2092());
            final Iterator iterator = method2651.iterator();
            while (iterator.hasNext()) {
                class426.method2085(new Class1948((Class1948)iterator.next()));
            }
            this.world.method6886(class426);
        }
    }
    
    public boolean method4239() {
        return this.dataManager.get(Class765.field4137);
    }
    
    public void method4240() {
        this.dataManager.set(Class765.field4137, true);
    }
    
    public boolean method4241() {
        return this.method4233() && this.field4142 < 1;
    }
    
    public void method4242() {
        ++this.field4142;
    }
    
    static {
        field4135 = EntityDataManager.method33564(Class765.class, Class7709.field30654);
        field4136 = EntityDataManager.method33564(Class765.class, Class7709.field30661);
        field4137 = EntityDataManager.method33564(Class765.class, Class7709.field30661);
    }
}
