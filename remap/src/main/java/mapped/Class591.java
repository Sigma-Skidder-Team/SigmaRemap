// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.item.ItemStack;

public class Class591<C extends Class446> extends Class590<C>
{
    private static String[] field3494;
    private boolean field3495;
    
    public Class591(final Class3426<C> class3426) {
        super(class3426);
    }
    
    @Override
    public void method3461(final Class3662<C> class3662, final boolean b) {
        this.field3495 = this.field3493.method10936(class3662);
        final int method15251 = this.field3491.method15251(class3662, null);
        if (this.field3495) {
            final ItemStack method15252 = this.field3493.method10878(0).method20053();
            if (method15252.method27620() || method15251 <= method15252.method27690()) {
                return;
            }
        }
        final int method15253 = this.method3462(b, method15251, this.field3495);
        final IntArrayList list = new IntArrayList();
        if (this.field3491.method15250(class3662, (IntList)list, method15253)) {
            if (!this.field3495) {
                this.method3460(this.field3493.method10937());
                this.method3460(0);
            }
            this.method3466(method15253, (IntList)list);
        }
    }
    
    @Override
    public void method3459() {
        this.method3460(this.field3493.method10937());
        super.method3459();
    }
    
    public void method3466(final int b, final IntList list) {
        final IntListIterator iterator = list.iterator();
        final Class6601 method10878 = this.field3493.method10878(0);
        final ItemStack method10879 = Class5024.method15253(((Iterator<Integer>)iterator).next());
        if (!method10879.method27620()) {
            int min = Math.min(method10879.method27628(), b);
            if (this.field3495) {
                min -= method10878.method20053().method27690();
            }
            for (int i = 0; i < min; ++i) {
                this.method3463(method10878, method10879);
            }
        }
    }
}
