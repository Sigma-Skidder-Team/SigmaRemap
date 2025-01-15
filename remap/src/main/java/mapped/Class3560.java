// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class3560<T extends Class511> extends Class3555<T>
{
    private static String[] field16647;
    private final Class794 field16648;
    
    public Class3560(final Class794 field16648, final Class<T> clazz, final boolean b, final Predicate<Class511> predicate) {
        super(field16648, clazz, 10, b, false, predicate);
        this.field16648 = field16648;
    }
    
    @Override
    public boolean method11013() {
        return !this.field16648.method4480() && super.method11013();
    }
    
    @Override
    public boolean method11017() {
        return (this.field16637 == null) ? super.method11017() : this.field16637.method25344(this.field16602, this.field16636);
    }
}
