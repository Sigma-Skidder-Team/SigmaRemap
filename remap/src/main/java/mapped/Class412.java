// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import javax.annotation.Nullable;

public class Class412 extends Class409
{
    private static String[] field2509;
    private Class511 field2510;
    
    public Class412(final Class7499<? extends Class412> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class412(final Class1847 class1847, final Class511 field2510) {
        super(Class7499.field29037, field2510, class1847);
        this.field2510 = field2510;
    }
    
    public Class412(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field29037, n, n2, n3, class1847);
    }
    
    @Override
    public Class3820 method2013() {
        return Class7739.field31436;
    }
    
    @Override
    public void method2016(final Class7006 class7006) {
        final Class511 method2019 = this.method2019();
        if (class7006.method21449() == Class2165.field12882) {
            final Entity method2020 = ((Class7007)class7006).method21452();
            if (method2020 == this.field2510) {
                return;
            }
            method2020.method1740(Class7929.method25699(this, method2019), 0.0f);
        }
        if (class7006.method21449() == Class2165.field12881) {
            final BlockPos method2021 = ((Class7005)class7006).method21447();
            final Class436 method2022 = this.field2391.method6727(method2021);
            if (method2022 instanceof Class488) {
                final Class488 class7007 = (Class488)method2022;
                if (method2019 == null) {
                    class7007.method2437(this);
                    return;
                }
                if (method2019 instanceof Class513) {
                    Class7770.field31778.method13813((Class513)method2019, this.field2391.method6701(method2021));
                }
                class7007.method2437(method2019);
                this.method1652();
                return;
            }
        }
        for (int i = 0; i < 32; ++i) {
            this.field2391.method6709(Class8432.field34637, this.getPosX(), this.getPosY() + this.field2423.nextDouble() * 2.0, this.getPosZ(), this.field2423.nextGaussian(), 0.0, this.field2423.nextGaussian());
        }
        if (!this.field2391.field10067) {
            if (!(method2019 instanceof Class513)) {
                if (method2019 != null) {
                    method2019.method1878(this.getPosX(), this.getPosY(), this.getPosZ());
                    method2019.field2414 = 0.0f;
                }
            }
            else {
                final Class513 class7008 = (Class513)method2019;
                if (class7008.field3039.method17369().method11187()) {
                    if (class7008.field2391 == this.field2391) {
                        if (!class7008.method2783()) {
                            if (this.field2423.nextFloat() < 0.05f) {
                                if (this.field2391.method6765().method31216(Class8878.field37318)) {
                                    final Class842 class7009 = Class7499.field28978.method23371(this.field2391);
                                    class7009.method5034(true);
                                    class7009.method1730(method2019.getPosX(), method2019.getPosY(), method2019.getPosZ(), method2019.field2399, method2019.field2400);
                                    this.field2391.method6886(class7009);
                                }
                            }
                            if (method2019.method1805()) {
                                method2019.method1784();
                            }
                            method2019.method1878(this.getPosX(), this.getPosY(), this.getPosZ());
                            method2019.field2414 = 0.0f;
                            method2019.method1740(Class7929.field32572, 5.0f);
                        }
                    }
                }
            }
            this.method1652();
        }
    }
    
    @Override
    public void method1659() {
        final Class511 method2019 = this.method2019();
        if (method2019 != null) {
            if (method2019 instanceof Class512) {
                if (!method2019.method1768()) {
                    this.method1652();
                    return;
                }
            }
        }
        super.method1659();
    }
    
    @Nullable
    @Override
    public Entity method1854(final Class383 class383) {
        if (this.field2517.field2452 != class383) {
            this.field2517 = null;
        }
        return super.method1854(class383);
    }
}
