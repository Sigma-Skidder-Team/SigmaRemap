// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.ForwardingList;

public class Class2262 extends ForwardingList<ItemStack>
{
    private static String[] field13821;
    private final Class2265<ItemStack> field13822;
    
    public Class2262() {
        this.field13822 = Class2265.method8507(Class464.method2346(), ItemStack.field34174);
    }
    
    public List<ItemStack> delegate() {
        return this.field13822;
    }
    
    public Class52 method8504() {
        final Class52 class52 = new Class52();
        final Iterator<ItemStack> iterator = this.delegate().iterator();
        while (iterator.hasNext()) {
            ((AbstractList<Class51>)class52).add(iterator.next().method27627(new Class51()));
        }
        return class52;
    }
    
    public void method8505(final Class52 class52) {
        final List<ItemStack> delegate = this.delegate();
        for (int i = 0; i < delegate.size(); ++i) {
            delegate.set(i, ItemStack.method27619(class52.method346(i)));
        }
    }
    
    public boolean isEmpty() {
        final Iterator<ItemStack> iterator = this.delegate().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27620()) {
                continue;
            }
            return false;
        }
        return true;
    }
}
