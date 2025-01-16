// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public class Class8108
{
    private static String[] field33416;
    private final Class5799 field33417;
    private int field33418;
    private Consumer<CompoundNBT> field33419;
    
    public Class8108(final Class5799 field33417) {
        this.field33418 = -1;
        this.field33417 = field33417;
    }
    
    public boolean method26645(final int n, final CompoundNBT class51) {
        if (this.field33418 == n && this.field33419 != null) {
            this.field33419.accept(class51);
            this.field33419 = null;
            return true;
        }
        return false;
    }
    
    private int method26646(final Consumer<CompoundNBT> field33419) {
        this.field33419 = field33419;
        return ++this.field33418;
    }
    
    public void method26647(final int n, final Consumer<CompoundNBT> consumer) {
        this.field33417.method17292(new Class4261(this.method26646(consumer), n));
    }
    
    public void method26648(final BlockPos class354, final Consumer<CompoundNBT> consumer) {
        this.field33417.method17292(new Class4275(this.method26646(consumer), class354));
    }
}
