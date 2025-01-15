// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class821 extends Class819
{
    private BlockPos field4392;
    private int field4393;
    
    public Class821(final EntityType<? extends Class821> class7499, final World class7500) {
        super(class7499, class7500);
        this.forceSpawn = true;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(0, new Class3538<Object>(this, Class5333.method16476(new ItemStack(Class7739.field31441), Class8644.field36257), Class8520.field35702, class821 -> !this.world.method6703() && !class821.method1823()));
        this.field4114.method22062(0, new Class3538<Object>(this, new ItemStack(Class7739.field31358), Class8520.field35707, class822 -> this.world.method6703() && class822.method1823()));
        this.field4114.method22062(1, new Class3604(this));
        this.field4114.method22062(1, new Class3448<Object>(this, Class827.class, 8.0f, 0.5, 0.5));
        this.field4114.method22062(1, new Class3448<Object>(this, Class771.class, 12.0f, 0.5, 0.5));
        this.field4114.method22062(1, new Class3448<Object>(this, Class775.class, 8.0f, 0.5, 0.5));
        this.field4114.method22062(1, new Class3448<Object>(this, Class843.class, 8.0f, 0.5, 0.5));
        this.field4114.method22062(1, new Class3448<Object>(this, Class773.class, 15.0f, 0.5, 0.5));
        this.field4114.method22062(1, new Class3448<Object>(this, Class769.class, 12.0f, 0.5, 0.5));
        this.field4114.method22062(1, new Class3607(this, 0.5));
        this.field4114.method22062(1, new Class3632(this));
        this.field4114.method22062(2, new Class3606(this, this, 2.0, 0.35));
        this.field4114.method22062(4, new Class3489(this, 0.35));
        this.field4114.method22062(8, new Class3517(this, 0.35));
        this.field4114.method22062(9, new Class3629(this, Class512.class, 3.0f, 1.0f));
        this.field4114.method22062(10, new Class3628(this, Class759.class, 8.0f));
    }
    
    @Nullable
    @Override
    public Class788 method4349(final Class788 class788) {
        return null;
    }
    
    @Override
    public boolean method4830() {
        return false;
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final ItemStack method2715 = class512.method2715(class513);
        if (method2715.method27622() != Class7739.field31552) {
            if (method2715.method27622() != Class7739.field31500) {
                if (this.method1768()) {
                    if (!this.method4824()) {
                        if (!this.method2625()) {
                            if (class513 == Class316.field1877) {
                                class512.method2857(Class8276.field34021);
                            }
                            if (!this.method4825().isEmpty()) {
                                if (!this.world.field10067) {
                                    this.method4822(class512);
                                    this.method4854(class512, this.getDisplayName(), 1);
                                }
                                return true;
                            }
                            return super.method4195(class512, class513);
                        }
                    }
                }
            }
            return super.method4195(class512, class513);
        }
        method2715.method27640(class512, this, class513);
        return true;
    }
    
    @Override
    public void method4839() {
        final Class7954[] array = (Class7954[])Class9352.field40129.get(1);
        final Class7954[] array2 = (Class7954[])Class9352.field40129.get(2);
        if (array != null) {
            if (array2 != null) {
                final Class57 method4825 = this.method4825();
                this.method4840(method4825, array, 5);
                final Class9017 method4826 = array2[this.rand.nextInt(array2.length)].method25804(this, this.rand);
                if (method4826 != null) {
                    method4825.add(method4826);
                }
            }
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("DespawnDelay", this.field4393);
        if (this.field4392 != null) {
            class51.method295("WanderTarget", Class9346.method34646(this.field4392));
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("DespawnDelay", 99)) {
            this.field4393 = class51.method319("DespawnDelay");
        }
        if (class51.method315("WanderTarget")) {
            this.field4392 = Class9346.method34645(class51.method327("WanderTarget"));
        }
        this.method4354(Math.max(0, this.method4351()));
    }
    
    @Override
    public boolean method4168(final double n) {
        return false;
    }
    
    @Override
    public void method4829(final Class9017 class9017) {
        if (class9017.method32300()) {
            this.world.method6886(new Class508(this.world, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), 3 + this.rand.nextInt(4)));
        }
    }
    
    @Override
    public Class7795 method4160() {
        return this.method4824() ? Class8520.field35708 : Class8520.field35700;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35705;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35701;
    }
    
    @Override
    public Class7795 method2686(final ItemStack class8321) {
        return (class8321.method27622() != Class7739.field31358) ? Class8520.field35704 : Class8520.field35703;
    }
    
    @Override
    public Class7795 method4833(final boolean b) {
        return b ? Class8520.field35709 : Class8520.field35706;
    }
    
    @Override
    public Class7795 method4832() {
        return Class8520.field35709;
    }
    
    public void method4841(final int field4393) {
        this.field4393 = field4393;
    }
    
    public int method4842() {
        return this.field4393;
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (!this.world.field10067) {
            this.method4843();
        }
    }
    
    private void method4843() {
        if (this.field4393 > 0) {
            if (!this.method4824()) {
                if (--this.field4393 == 0) {
                    this.method1652();
                }
            }
        }
    }
    
    public void method4844(final BlockPos field4392) {
        this.field4392 = field4392;
    }
    
    @Nullable
    private BlockPos method4845() {
        return this.field4392;
    }
}
