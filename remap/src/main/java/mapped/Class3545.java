// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public abstract class Class3545 extends Class3446
{
    public final Class759 field16602;
    public final boolean field16603;
    private final boolean field16604;
    private int field16605;
    private int field16606;
    private int field16607;
    public LivingEntity field16608;
    public int field16609;
    
    public Class3545(final Class759 class759, final boolean b) {
        this(class759, b, false);
    }
    
    public Class3545(final Class759 field16602, final boolean field16603, final boolean field16604) {
        this.field16609 = 60;
        this.field16602 = field16602;
        this.field16603 = field16603;
        this.field16604 = field16604;
    }
    
    @Override
    public boolean method11017() {
        LivingEntity class511 = this.field16602.method4152();
        if (class511 == null) {
            class511 = this.field16608;
        }
        if (class511 == null) {
            return false;
        }
        if (!class511.method1768()) {
            return false;
        }
        final Team method1825 = this.field16602.getTeam();
        final Team method1826 = class511.getTeam();
        if (method1825 != null && method1826 == method1825) {
            return false;
        }
        final double method1827 = this.method11096();
        if (this.field16602.method1734(class511) > method1827 * method1827) {
            return false;
        }
        if (this.field16603) {
            if (!this.field16602.method4151().method34143(class511)) {
                if (++this.field16607 > this.field16609) {
                    return false;
                }
            }
            else {
                this.field16607 = 0;
            }
        }
        if (class511 instanceof Class512 && ((Class512)class511).field3025.field27301) {
            return false;
        }
        this.field16602.method4153(class511);
        return true;
    }
    
    public double method11096() {
        final Class7619 method2710 = this.field16602.method2710(Class8107.field33406);
        return (method2710 != null) ? method2710.method23950() : 16.0;
    }
    
    @Override
    public void method11015() {
        this.field16605 = 0;
        this.field16606 = 0;
        this.field16607 = 0;
    }
    
    @Override
    public void method11018() {
        this.field16602.method4153(null);
        this.field16608 = null;
    }
    
    public boolean method11097(final LivingEntity class511, final Class7843 class512) {
        if (class511 == null) {
            return false;
        }
        if (!class512.method25344(this.field16602, class511)) {
            return false;
        }
        if (this.field16602.method4197(new BlockPos(class511))) {
            if (this.field16604) {
                if (--this.field16606 <= 0) {
                    this.field16605 = 0;
                }
                if (this.field16605 == 0) {
                    this.field16605 = (this.method11098(class511) ? 1 : 2);
                }
                if (this.field16605 == 2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean method11098(final LivingEntity class511) {
        this.field16606 = 10 + this.field16602.method2633().nextInt(5);
        final Class9468 method24722 = this.field16602.method4150().method24722(class511, 0);
        if (method24722 == null) {
            return false;
        }
        final Class6772 method24723 = method24722.method35216();
        if (method24723 != null) {
            final int n = method24723.field26589 - MathHelper.floor(class511.getPosX());
            final int n2 = method24723.field26591 - MathHelper.floor(class511.getPosZ());
            return n * n + n2 * n2 <= 2.25;
        }
        return false;
    }
    
    public Class3545 method11099(final int field16609) {
        this.field16609 = field16609;
        return this;
    }
}
