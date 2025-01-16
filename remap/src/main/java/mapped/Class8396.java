// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

public class Class8396
{
    private static String[] field34418;
    public final float field34419;
    public final float field34420;
    public final float field34421;
    
    public Class8396(final float n, final float n2, final float n3) {
        this.field34419 = ((!Float.isInfinite(n) && !Float.isNaN(n)) ? (n % 360.0f) : 0.0f);
        this.field34420 = ((!Float.isInfinite(n2) && !Float.isNaN(n2)) ? (n2 % 360.0f) : 0.0f);
        this.field34421 = ((!Float.isInfinite(n3) && !Float.isNaN(n3)) ? (n3 % 360.0f) : 0.0f);
    }
    
    public Class8396(final ListNBT class52) {
        this(class52.method352(0), class52.method352(1), class52.method352(2));
    }
    
    public ListNBT method27996() {
        final ListNBT class52 = new ListNBT();
        ((AbstractList<FloatNBT>)class52).add(FloatNBT.method281(this.field34419));
        ((AbstractList<FloatNBT>)class52).add(FloatNBT.method281(this.field34420));
        ((AbstractList<FloatNBT>)class52).add(FloatNBT.method281(this.field34421));
        return class52;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class8396) {
            final Class8396 class8396 = (Class8396)o;
            if (this.field34419 == class8396.field34419) {
                if (this.field34420 == class8396.field34420) {
                    if (this.field34421 == class8396.field34421) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public float method27997() {
        return this.field34419;
    }
    
    public float method27998() {
        return this.field34420;
    }
    
    public float method27999() {
        return this.field34421;
    }
}
