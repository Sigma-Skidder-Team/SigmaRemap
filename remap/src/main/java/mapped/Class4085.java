// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public abstract class Class4085 extends Class3820
{
    public static final Predicate<ItemStack> field18189;
    public static final Predicate<ItemStack> field18190;
    
    public Class4085(final Class8959 class8959) {
        super(class8959);
    }
    
    public Predicate<ItemStack> method12289() {
        return this.method12290();
    }
    
    public abstract Predicate<ItemStack> method12290();
    
    public static ItemStack method12291(final Class511 class511, final Predicate<ItemStack> predicate) {
        if (!predicate.test(class511.method2715(Class316.field1878))) {
            return predicate.test(class511.method2715(Class316.field1877)) ? class511.method2715(Class316.field1877) : ItemStack.field34174;
        }
        return class511.method2715(Class316.field1878);
    }
    
    @Override
    public int method11734() {
        return 1;
    }
    
    static {
        field18189 = (class8321 -> class8321.method27622().method11742(Class7855.field32276));
        field18190 = Class4085.field18189.or(class8322 -> class8322.method27622() == Class7739.field31532);
    }
}
