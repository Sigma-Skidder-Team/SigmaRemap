// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import javax.annotation.concurrent.Immutable;

@Immutable
public class Class9115
{
    public static final Class9115 field38616;
    private final String field38617;
    
    public Class9115(final String field38617) {
        this.field38617 = field38617;
    }
    
    public boolean method32976(final ItemStack class8321) {
        if (!this.field38617.isEmpty()) {
            if (!class8321.method27620()) {
                if (class8321.method27667()) {
                    if (this.field38617.equals(class8321.method27664().getString())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public void method32977(final CompoundNBT class51) {
        if (!this.field38617.isEmpty()) {
            class51.putString("Lock", this.field38617);
        }
    }
    
    public static Class9115 method32978(final CompoundNBT class51) {
        return class51.contains("Lock", 8) ? new Class9115(class51.getString("Lock")) : Class9115.field38616;
    }
    
    static {
        field38616 = new Class9115("");
    }
}
