// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;

import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class Class775 extends Class772
{
    private static final Predicate<Class2113> field4168;
    private boolean field4169;
    
    public Class775(final EntityType<? extends Class775> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3471(this));
        this.field4114.method22062(2, new Class3469(this, this));
        this.field4114.method22062(3, new Class3459(this, this, 10.0f));
        this.field4114.method22062(4, new Class3577(this, this));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[] { Class776.class }).method11100((Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, PlayerEntity.class, true));
        this.field4115.method22062(3, new Class3555<Object>(this, Class819.class, true));
        this.field4115.method22062(3, new Class3555<Object>(this, Class786.class, true));
        this.field4115.method22062(4, new Class3556(this));
        this.field4114.method22062(8, new Class3514(this, 0.6));
        this.field4114.method22062(9, new Class3628(this, PlayerEntity.class, 3.0f, 1.0f));
        this.field4114.method22062(10, new Class3628(this, Class759.class, 8.0f));
    }
    
    @Override
    public void method4172() {
        if (!this.method4214()) {
            final Class7746 method4150 = this.method4150();
            if (method4150 instanceof Class7747) {
                ((Class7747)method4150).method24747(((Class1849)this.world).method6928(new BlockPos(this)));
            }
        }
        super.method4172();
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.3499999940395355);
        this.method2710(Class8107.field33406).method23941(12.0);
        this.method2710(Class8107.field33405).method23941(24.0);
        this.method2710(Class8107.field33410).method23941(5.0);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        if (this.field4169) {
            class51.putBoolean("Johnny", true);
        }
    }
    
    @Override
    public Class259 method4264() {
        if (!this.method4216()) {
            return this.method4296() ? Class259.field1240 : Class259.field1234;
        }
        return Class259.field1235;
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("Johnny", 99)) {
            this.field4169 = class51.getBoolean("Johnny");
        }
    }
    
    @Override
    public Class7795 method4260() {
        return Class8520.field35696;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final CompoundNBT class1855) {
        final Class5496 method4188 = super.method4188(class1851, class1852, class1853, class1854, class1855);
        ((Class7747)this.method4150()).method24747(true);
        this.method4184(class1852);
        this.method4187(class1852);
        return method4188;
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        if (this.method4292() == null) {
            this.method1803(Class2215.field13600, new ItemStack(Items.field31276));
        }
    }
    
    @Override
    public boolean method1826(final Entity class399) {
        return super.method1826(class399) || (class399 instanceof LivingEntity && ((LivingEntity)class399).method2712() == Class6363.field25463 && this.getTeam() == null && class399.getTeam() == null);
    }
    
    @Override
    public void method1872(final ITextComponent class2250) {
        super.method1872(class2250);
        if (!this.field4169) {
            if (class2250 != null) {
                if (class2250.getString().equals("Johnny")) {
                    this.field4169 = true;
                }
            }
        }
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35695;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35697;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35698;
    }
    
    @Override
    public void method4263(final int n, final boolean b) {
        final ItemStack class8321 = new ItemStack(Items.field31276);
        final Class8792 method4292 = this.method4292();
        int i = 1;
        if (n > method4292.method30665(Class2113.field12292)) {
            i = 2;
        }
        if (this.rand.nextFloat() <= method4292.method30666()) {
            final HashMap hashMap = Maps.newHashMap();
            hashMap.put(Class7882.field32358, i);
            Class8742.method30198(hashMap, class8321);
        }
        this.method1803(Class2215.field13600, class8321);
    }
    
    static {
        field4168 = (class2113 -> class2113 == Class2113.field12292 || class2113 == Class2113.field12293);
    }
}
