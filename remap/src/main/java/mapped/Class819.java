// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.HashSet;
import com.google.common.collect.Sets;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import javax.annotation.Nullable;

public abstract class Class819 extends Class788 implements Class820, Class822
{
    private static final DataParameter<Integer> field4388;
    private PlayerEntity field4389;
    public Class57 field4390;
    private final Class443 field4391;
    
    public Class819(final EntityType<? extends Class819> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4391 = new Class443(8);
    }
    
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final CompoundNBT class1855) {
        if (class1854 == null) {
            class1854 = new Class5497();
            ((Class5497)class1854).method16801(false);
        }
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    public int method4819() {
        return this.dataManager.get(Class819.field4388);
    }
    
    public void method4820(final int i) {
        this.dataManager.set(Class819.field4388, i);
    }
    
    @Override
    public int method4821() {
        return 0;
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return this.method2625() ? 0.81f : 1.62f;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class819.field4388, 0);
    }
    
    @Override
    public void method4822(final PlayerEntity field4389) {
        this.field4389 = field4389;
    }
    
    @Nullable
    @Override
    public PlayerEntity method4823() {
        return this.field4389;
    }
    
    public boolean method4824() {
        return this.field4389 != null;
    }
    
    @Override
    public Class57 method4825() {
        if (this.field4390 == null) {
            this.field4390 = new Class57();
            this.method4839();
        }
        return this.field4390;
    }
    
    @Override
    public void method4826(final Class57 class57) {
    }
    
    @Override
    public void method4827(final int n) {
    }
    
    @Override
    public void method4828(final Class9017 class9017) {
        class9017.method32289();
        this.field4107 = -this.method4155();
        this.method4829(class9017);
        if (this.field4389 instanceof Class513) {
            Class7770.field31793.method13757((Class513)this.field4389, this, class9017.method32283());
        }
    }
    
    public abstract void method4829(final Class9017 p0);
    
    @Override
    public boolean method4830() {
        return true;
    }
    
    @Override
    public void method4831(final ItemStack class8321) {
        if (!this.world.isRemote) {
            if (this.field4107 > -this.method4155() + 20) {
                this.field4107 = -this.method4155();
                this.method1695(this.method4833(!class8321.method27620()), this.method2720(), this.method2721());
            }
        }
    }
    
    @Override
    public Class7795 method4832() {
        return Class8520.field35681;
    }
    
    public Class7795 method4833(final boolean b) {
        return b ? Class8520.field35681 : Class8520.field35679;
    }
    
    public void method4834() {
        this.method1695(Class8520.field35676, this.method2720(), this.method2721());
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        final Class57 method4825 = this.method4825();
        if (!method4825.isEmpty()) {
            class51.put("Offers", method4825.method362());
        }
        final ListNBT class52 = new ListNBT();
        for (int i = 0; i < this.field4391.method2239(); ++i) {
            final ItemStack method4826 = this.field4391.method2157(i);
            if (!method4826.method27620()) {
                ((AbstractList<CompoundNBT>)class52).add(method4826.method27627(new CompoundNBT()));
            }
        }
        class51.put("Inventory", class52);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("Offers", 10)) {
            this.field4390 = new Class57(class51.getCompound("Offers"));
        }
        final ListNBT method328 = class51.getList("Inventory", 10);
        for (int i = 0; i < method328.size(); ++i) {
            final ItemStack method329 = ItemStack.method27619(method328.method346(i));
            if (!method329.method27620()) {
                this.field4391.method2258(method329);
            }
        }
    }
    
    @Nullable
    @Override
    public Entity method1854(final DimensionType class383) {
        this.method4835();
        return super.method1854(class383);
    }
    
    public void method4835() {
        this.method4822(null);
    }
    
    @Override
    public void method2673(final DamageSource class7929) {
        super.method2673(class7929);
        this.method4835();
    }
    
    public void method4836(final IParticleData IParticleData) {
        for (int i = 0; i < 5; ++i) {
            this.world.method6709(IParticleData, this.method1940(1.0), this.method1943() + 1.0, this.method1947(1.0), this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02);
        }
    }
    
    @Override
    public boolean method4204(final PlayerEntity playerEntity) {
        return false;
    }
    
    public Class443 method4837() {
        return this.field4391;
    }
    
    @Override
    public boolean method1893(final int n, final ItemStack class8321) {
        if (super.method1893(n, class8321)) {
            return true;
        }
        final int n2 = n - 300;
        if (n2 >= 0 && n2 < this.field4391.method2239()) {
            this.field4391.method2160(n2, class8321);
            return true;
        }
        return false;
    }
    
    @Override
    public World method4838() {
        return this.world;
    }
    
    public abstract void method4839();
    
    public void method4840(final Class57 class57, final Class7954[] array, final int n) {
        final HashSet hashSet = Sets.newHashSet();
        if (array.length <= n) {
            for (int i = 0; i < array.length; ++i) {
                hashSet.add(i);
            }
        }
        else {
            while (hashSet.size() < n) {
                hashSet.add(this.rand.nextInt(array.length));
            }
        }
        final Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            final Class9017 method25804 = array[(int)iterator.next()].method25804(this, this.rand);
            if (method25804 == null) {
                continue;
            }
            class57.add(method25804);
        }
    }
    
    static {
        field4388 = EntityDataManager.method33564(Class819.class, Class7709.field30654);
    }
}
