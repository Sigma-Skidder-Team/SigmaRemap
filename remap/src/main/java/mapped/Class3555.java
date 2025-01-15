// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;
import java.util.function.Predicate;

public class Class3555<T extends Class511> extends Class3545
{
    private static String[] field16633;
    public final Class<T> field16634;
    public final int field16635;
    public Class511 field16636;
    public Class7843 field16637;
    
    public Class3555(final Class759 class759, final Class<T> clazz, final boolean b) {
        this(class759, clazz, b, false);
    }
    
    public Class3555(final Class759 class759, final Class<T> clazz, final boolean b, final boolean b2) {
        this(class759, clazz, 10, b, b2, null);
    }
    
    public Class3555(final Class759 class759, final Class<T> field16634, final int field16635, final boolean b, final boolean b2, final Predicate<Class511> predicate) {
        super(class759, b, b2);
        this.field16634 = field16634;
        this.field16635 = field16635;
        this.method11019(EnumSet.of(Class2139.field12583));
        this.field16637 = new Class7843().method25337(this.method11096()).method25343(predicate);
    }
    
    @Override
    public boolean method11013() {
        if (this.field16635 > 0 && this.field16602.method2633().nextInt(this.field16635) != 0) {
            return false;
        }
        this.method11104();
        return this.field16636 != null;
    }
    
    public AxisAlignedBB method11103(final double n) {
        return this.field16602.method1886().method18495(n, 4.0, n);
    }
    
    public void method11104() {
        if (this.field16634 != Class512.class && this.field16634 != Class513.class) {
            this.field16636 = this.field16602.field2391.method7139((Class<? extends Class511>)this.field16634, this.field16637, (Class511)this.field16602, this.field16602.getPosX(), this.field16602.method1944(), this.field16602.getPosZ(), this.method11103(this.method11096()));
        }
        else {
            this.field16636 = this.field16602.field2391.method7136(this.field16637, this.field16602, this.field16602.getPosX(), this.field16602.method1944(), this.field16602.getPosZ());
        }
    }
    
    @Override
    public void method11015() {
        this.field16602.method4153(this.field16636);
        super.method11015();
    }
}
