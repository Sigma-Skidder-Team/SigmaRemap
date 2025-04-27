// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.EnumSet;

public class Class3599 extends Class3446
{
    private static String[] field16762;
    private final Class849 field16763;
    private int field16764;
    private int field16765;
    private int field16766;
    
    public Class3599(final Class849 field16763) {
        this.field16763 = field16763;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        final LivingEntity method4152 = this.field16763.method4152();
        if (method4152 != null) {
            if (method4152.isAlive()) {
                if (this.field16763.method2646(method4152)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16764 = 0;
    }
    
    @Override
    public void method11018() {
        Class849.method5073(this.field16763, false);
        this.field16766 = 0;
    }
    
    @Override
    public void method11016() {
        --this.field16765;
        final LivingEntity method4152 = this.field16763.method4152();
        if (method4152 != null) {
            final boolean method4153 = this.field16763.method4151().method34143(method4152);
            if (!method4153) {
                ++this.field16766;
            }
            else {
                this.field16766 = 0;
            }
            final double method4154 = this.field16763.method1734(method4152);
            if (method4154 >= 4.0) {
                if (method4154 < this.method11128() * this.method11128() && method4153) {
                    final double n = method4152.getPosX() - this.field16763.getPosX();
                    final double n2 = method4152.method1942(0.5) - this.field16763.method1942(0.5);
                    final double n3 = method4152.getPosZ() - this.field16763.getPosZ();
                    if (this.field16765 <= 0) {
                        ++this.field16764;
                        if (this.field16764 != 1) {
                            if (this.field16764 > 4) {
                                this.field16765 = 100;
                                this.field16764 = 0;
                                Class849.method5073(this.field16763, false);
                            }
                            else {
                                this.field16765 = 6;
                            }
                        }
                        else {
                            this.field16765 = 60;
                            Class849.method5073(this.field16763, true);
                        }
                        if (this.field16764 > 1) {
                            final float n4 = MathHelper.method35640(MathHelper.sqrt(method4154)) * 0.5f;
                            this.field16763.world.method6839(null, 1018, new BlockPos(this.field16763), 0);
                            for (int i = 0; i < 1; ++i) {
                                final Class418 class418 = new Class418(this.field16763.world, this.field16763, n + this.field16763.method2633().nextGaussian() * n4, n2, n3 + this.field16763.method2633().nextGaussian() * n4);
                                class418.setPosition(class418.getPosX(), this.field16763.method1942(0.5) + 0.5, class418.getPosZ());
                                this.field16763.world.method6886(class418);
                            }
                        }
                    }
                    this.field16763.method4147().method24667(method4152, 10.0f, 10.0f);
                }
                else if (this.field16766 < 5) {
                    this.field16763.method4148().method19907(method4152.getPosX(), method4152.getPosY(), method4152.getPosZ(), 1.0);
                }
            }
            else {
                if (!method4153) {
                    return;
                }
                if (this.field16765 <= 0) {
                    this.field16765 = 20;
                    this.field16763.method2734(method4152);
                }
                this.field16763.method4148().method19907(method4152.getPosX(), method4152.getPosY(), method4152.getPosZ(), 1.0);
            }
            super.method11016();
        }
    }
    
    private double method11128() {
        return this.field16763.method2710(Class8107.field33406).method23950();
    }
}
