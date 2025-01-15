// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class771 extends Class770
{
    private static String[] field4164;
    private Class802 field4165;
    
    public Class771(final EntityType<? extends Class771> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4108 = 10;
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3512(this, null));
        this.field4114.method22062(2, new Class3448<Object>(this, Class512.class, 8.0f, 0.6, 1.0));
        this.field4114.method22062(4, new Class3533(this, null));
        this.field4114.method22062(5, new Class3532(this, null));
        this.field4114.method22062(6, new Class3534(this));
        this.field4114.method22062(8, new Class3514(this, 0.6));
        this.field4114.method22062(9, new Class3628(this, Class512.class, 3.0f, 1.0f));
        this.field4114.method22062(10, new Class3628(this, Class759.class, 8.0f));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[] { Class776.class }).method11100((Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, Class512.class, true).method11099(300));
        this.field4115.method22062(3, new Class3555<Object>(this, Class819.class, false).method11099(300));
        this.field4115.method22062(3, new Class3555<Object>(this, Class786.class, false));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.5);
        this.method2710(Class8107.field33406).method23941(12.0);
        this.method2710(Class8107.field33405).method23941(24.0);
    }
    
    @Override
    public void method1649() {
        super.method1649();
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
    }
    
    @Override
    public Class7795 method4260() {
        return Class8520.field35178;
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
    }
    
    @Override
    public void method4172() {
        super.method4172();
    }
    
    @Override
    public boolean method1826(final Entity class399) {
        if (class399 == null) {
            return false;
        }
        if (class399 == this) {
            return true;
        }
        if (super.method1826(class399)) {
            return true;
        }
        if (!(class399 instanceof Class843)) {
            return class399 instanceof LivingEntity && ((LivingEntity)class399).method2712() == Class6363.field25463 && this.getTeam() == null && class399.getTeam() == null;
        }
        return this.method1826(((Class843)class399).method5036());
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35176;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35179;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35181;
    }
    
    private void method4270(final Class802 field4165) {
        this.field4165 = field4165;
    }
    
    @Nullable
    private Class802 method4271() {
        return this.field4165;
    }
    
    @Override
    public Class7795 method4262() {
        return Class8520.field35177;
    }
    
    @Override
    public void method4263(final int n, final boolean b) {
    }
}
