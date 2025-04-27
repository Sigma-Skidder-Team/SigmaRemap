// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class669 extends Class654
{
    public final int field3702;
    public final /* synthetic */ Class746 field3703;
    
    public Class669(final Class746 field3703, final int n, final int n2, final int field3704, final Class6887 class6887) {
        this.field3703 = field3703;
        super(n, n2, 89, 20, "", class6887);
        this.field3702 = field3704;
        this.field3432 = false;
    }
    
    public int method3733() {
        return this.field3702;
    }
    
    @Override
    public void method3362(final int n, final int n2) {
        if (this.field3430) {
            if (this.field3703.field3077.method10931().size() > this.field3702 + Class746.method4068(this.field3703)) {
                if (n >= this.field3426 + 20) {
                    if (n < this.field3426 + 50 && n > this.field3426 + 30) {
                        final ItemStack method32282 = this.field3703.field3077.method10931().get(this.field3702 + Class746.method4068(this.field3703)).method32282();
                        if (!method32282.method27620()) {
                            Class746.method4070(this.field3703, method32282, n, n2);
                        }
                    }
                    else if (n > this.field3426 + 65) {
                        Class746.method4071(this.field3703, this.field3703.field3077.method10931().get(this.field3702 + Class746.method4068(this.field3703)).method32283(), n, n2);
                    }
                }
                else {
                    Class746.method4069(this.field3703, this.field3703.field3077.method10931().get(this.field3702 + Class746.method4068(this.field3703)).method32281(), n, n2);
                }
            }
        }
    }
}
