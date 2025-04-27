// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class Class838 extends Class833
{
    private static final DataParameter<Integer> field4455;
    private int field4456;
    private int field4457;
    private static final Predicate<LivingEntity> field4458;
    
    public Class838(final EntityType<? extends Class838> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class838.field4455, 0);
    }
    
    public int method4988() {
        return this.dataManager.get(Class838.field4455);
    }
    
    public void method4989(final int i) {
        this.dataManager.set(Class838.field4455, i);
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class838.field4455.equals(class8810)) {
            this.method1881();
        }
        super.method1880(class8810);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("PuffState", this.method4988());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4989(class51.getInt("PuffState"));
    }
    
    @Override
    public ItemStack method4956() {
        return new ItemStack(Items.field31359);
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(1, new Class3627(this));
    }
    
    @Override
    public void method1659() {
        if (!this.world.isRemote) {
            if (this.isAlive()) {
                if (this.method2749()) {
                    if (this.field4456 <= 0) {
                        if (this.method4988() != 0) {
                            if (this.field4457 > 60 && this.method4988() == 2) {
                                this.method1695(Class8520.field35500, this.method2720(), this.method2721());
                                this.method4989(1);
                            }
                            else if (this.field4457 > 100) {
                                if (this.method4988() == 1) {
                                    this.method1695(Class8520.field35500, this.method2720(), this.method2721());
                                    this.method4989(0);
                                }
                            }
                            ++this.field4457;
                        }
                    }
                    else {
                        if (this.method4988() != 0) {
                            if (this.field4456 > 40) {
                                if (this.method4988() == 1) {
                                    this.method1695(Class8520.field35501, this.method2720(), this.method2721());
                                    this.method4989(2);
                                }
                            }
                        }
                        else {
                            this.method1695(Class8520.field35501, this.method2720(), this.method2721());
                            this.method4989(1);
                        }
                        ++this.field4456;
                    }
                }
            }
        }
        super.method1659();
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (this.isAlive()) {
            if (this.method4988() > 0) {
                for (final Class759 class759 : this.world.method6739((Class<? extends Class759>)Class759.class, this.getBoundingBox().intersect(0.3), (Predicate<? super Class759>)Class838.field4458)) {
                    if (!class759.isAlive()) {
                        continue;
                    }
                    this.method4990(class759);
                }
            }
        }
    }
    
    private void method4990(final Class759 class759) {
        final int method4988 = this.method4988();
        if (class759.attackEntityFrom(DamageSource.method25693(this), (float)(1 + method4988))) {
            class759.method2655(new Class1948(Class9439.field40492, 60 * method4988, 0));
            this.method1695(Class8520.field35505, 1.0f, 1.0f);
        }
    }
    
    @Override
    public void method1736(final PlayerEntity playerEntity) {
        final int method4988 = this.method4988();
        if (playerEntity instanceof Class513) {
            if (method4988 > 0) {
                if (playerEntity.attackEntityFrom(DamageSource.method25693(this), (float)(1 + method4988))) {
                    ((Class513) playerEntity).field3039.method17469(new Class4306(9, 0.0f));
                    playerEntity.method2655(new Class1948(Class9439.field40492, 60 * method4988, 0));
                }
            }
        }
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35499;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35502;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35504;
    }
    
    @Override
    public Class7795 method4958() {
        return Class8520.field35503;
    }
    
    @Override
    public EntitySize method1933(final Pose class290) {
        return super.method1933(class290).method27561(method4991(this.method4988()));
    }
    
    private static float method4991(final int n) {
        switch (n) {
            case 0: {
                return 0.5f;
            }
            case 1: {
                return 0.7f;
            }
            default: {
                return 1.0f;
            }
        }
    }
    
    static {
        field4455 = EntityDataManager.method33564(Class838.class, Class7709.field30654);
        field4458 = (class511 -> {
            if (class511 != null) {
                if (class511 instanceof PlayerEntity && (class511.isSpectator() || ((PlayerEntity)class511).method2889())) {
                    return false;
                }
                else {
                    return class511.method2712() != Class6363.field25464;
                }
            }
            else {
                return false;
            }
        });
    }
}
