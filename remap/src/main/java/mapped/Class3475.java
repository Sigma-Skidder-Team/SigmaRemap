// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.IBlockReader;

import java.util.EnumSet;

public class Class3475 extends Class3446
{
    private static String[] field16375;
    private final IBlockReader field16376;
    private final Class759 field16377;
    private LivingEntity field16378;
    private int field16379;
    
    public Class3475(final Class759 field16377) {
        this.field16377 = field16377;
        this.field16376 = field16377.world;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        final LivingEntity method4152 = this.field16377.method4152();
        if (method4152 != null) {
            this.field16378 = method4152;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return this.field16378.isAlive() && this.field16377.method1734(this.field16378) <= 225.0 && (!this.field16377.method4150().method24731() || this.method11013());
    }
    
    @Override
    public void method11018() {
        this.field16378 = null;
        this.field16377.method4150().method24733();
    }
    
    @Override
    public void method11016() {
        this.field16377.method4147().method24667(this.field16378, 30.0f, 30.0f);
        final double n = this.field16377.method1930() * 2.0f * this.field16377.method1930() * 2.0f;
        final double method1733 = this.field16377.method1733(this.field16378.getPosX(), this.field16378.getPosY(), this.field16378.getPosZ());
        double n2 = 0.8;
        if (method1733 > n && method1733 < 16.0) {
            n2 = 1.33;
        }
        else if (method1733 < 225.0) {
            n2 = 0.6;
        }
        this.field16377.method4150().method24725(this.field16378, n2);
        this.field16379 = Math.max(this.field16379 - 1, 0);
        if (method1733 <= n) {
            if (this.field16379 <= 0) {
                this.field16379 = 20;
                this.field16377.method2734(this.field16378);
            }
        }
    }
}
