// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.Random;

public class Class848 extends Class763
{
    private static String[] field4512;
    private Class3529 field4513;
    
    public Class848(final EntityType<? extends Class848> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        this.field4513 = new Class3529(this);
        this.field4114.method22062(1, new Class3490(this));
        this.field4114.method22062(3, this.field4513);
        this.field4114.method22062(4, new Class3574(this, 1.0, false));
        this.field4114.method22062(5, new Class3521(this));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[0]).method11100((Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, Class512.class, true));
    }
    
    @Override
    public double method1776() {
        return 0.1;
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return 0.1f;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(8.0);
        this.method2710(Class8107.field33408).method23941(0.25);
        this.method2710(Class8107.field33410).method23941(1.0);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35560;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35562;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35561;
    }
    
    @Override
    public void method1691(final BlockPos class354, final Class7096 class355) {
        this.method1695(Class8520.field35563, 0.15f, 1.0f);
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (!this.method1849(class7929)) {
            if (class7929 instanceof Class7930 || class7929 == DamageSource.field32576) {
                if (this.field4513 != null) {
                    this.field4513.method11081();
                }
            }
            return super.attackEntityFrom(class7929, n);
        }
        return false;
    }
    
    @Override
    public void method1659() {
        this.field2951 = this.rotationYaw;
        super.method1659();
    }
    
    @Override
    public void method1846(final float field2399) {
        super.method1846(this.rotationYaw = field2399);
    }
    
    @Override
    public float method4228(final BlockPos class354, final Class1852 class355) {
        return Class3979.method12123(class355.method6701(class354.method1139())) ? 10.0f : super.method4228(class354, class355);
    }
    
    public static boolean method5070(final EntityType<Class848> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return Class763.method4231(class7499, class7500, class7501, class7502, random) && class7500.method7132(class7502.getX() + 0.5, class7502.getY() + 0.5, class7502.getZ() + 0.5, 5.0, true) == null;
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25462;
    }
}
