// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Class443 implements Class446, Class472
{
    private static String[] field2678;
    private final int field2679;
    private final Class2265<ItemStack> field2680;
    private List<Class807> field2681;
    
    public Class443(final int field2679) {
        this.field2679 = field2679;
        this.field2680 = Class2265.method8507(field2679, ItemStack.field34174);
    }
    
    public Class443(final ItemStack... array) {
        this.field2679 = array.length;
        this.field2680 = Class2265.method8508(ItemStack.field34174, array);
    }
    
    public void method2255(final Class807 class807) {
        if (this.field2681 == null) {
            this.field2681 = Lists.newArrayList();
        }
        this.field2681.add(class807);
    }
    
    public void method2256(final Class807 class807) {
        this.field2681.remove(class807);
    }
    
    @Override
    public ItemStack method2157(final int n) {
        return (n >= 0 && n < this.field2680.size()) ? this.field2680.get(n) : ItemStack.field34174;
    }
    
    @Override
    public ItemStack method2158(final int n, final int n2) {
        final ItemStack method28422 = Class8508.method28422(this.field2680, n, n2);
        if (!method28422.method27620()) {
            this.method2161();
        }
        return method28422;
    }
    
    public ItemStack method2257(final Item obj, final int n) {
        final ItemStack class8321 = new ItemStack(obj, 0);
        for (int i = this.field2679 - 1; i >= 0; --i) {
            final ItemStack method2157 = this.method2157(i);
            if (method2157.getItem().equals(obj)) {
                class8321.method27692(method2157.method27621(n - class8321.method27690()).method27690());
                if (class8321.method27690() == n) {
                    break;
                }
            }
        }
        if (!class8321.method27620()) {
            this.method2161();
        }
        return class8321;
    }
    
    public ItemStack method2258(final ItemStack class8321) {
        final ItemStack method27641 = class8321.method27641();
        this.method2261(method27641);
        if (!method27641.method27620()) {
            this.method2260(method27641);
            return method27641.method27620() ? ItemStack.field34174 : method27641;
        }
        return ItemStack.field34174;
    }
    
    @Override
    public ItemStack method2159(final int n) {
        final ItemStack class8321 = this.field2680.get(n);
        if (!class8321.method27620()) {
            this.field2680.set(n, ItemStack.field34174);
            return class8321;
        }
        return ItemStack.field34174;
    }
    
    @Override
    public void method2160(final int n, final ItemStack class8321) {
        this.field2680.set(n, class8321);
        if (!class8321.method27620()) {
            if (class8321.method27690() > this.method2254()) {
                class8321.method27691(this.method2254());
            }
        }
        this.method2161();
    }
    
    @Override
    public int method2239() {
        return this.field2679;
    }
    
    @Override
    public boolean method2156() {
        final Iterator<Object> iterator = this.field2680.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27620()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void method2161() {
        if (this.field2681 != null) {
            final Iterator<Class807> iterator = this.field2681.iterator();
            while (iterator.hasNext()) {
                iterator.next().method4733(this);
            }
        }
    }
    
    @Override
    public boolean method2162(final PlayerEntity playerEntity) {
        return true;
    }
    
    @Override
    public void method2164() {
        this.field2680.clear();
        this.method2161();
    }
    
    @Override
    public void method2259(final Class5024 class5024) {
        final Iterator<Object> iterator = this.field2680.iterator();
        while (iterator.hasNext()) {
            class5024.method15243(iterator.next());
        }
    }
    
    @Override
    public String toString() {
        return this.field2680.stream().filter(class8321 -> !class8321.method27620()).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()).toString();
    }
    
    private void method2260(final ItemStack class8321) {
        for (int i = 0; i < this.field2679; ++i) {
            if (this.method2157(i).method27620()) {
                this.method2160(i, class8321.method27641());
                class8321.method27691(0);
                return;
            }
        }
    }
    
    private void method2261(final ItemStack class8321) {
        for (int i = 0; i < this.field2679; ++i) {
            final ItemStack method2157 = this.method2157(i);
            if (ItemStack.method27645(method2157, class8321)) {
                this.method2262(class8321, method2157);
                if (class8321.method27620()) {
                    return;
                }
            }
        }
    }
    
    private void method2262(final ItemStack class8321, final ItemStack class8322) {
        final int min = Math.min(class8321.method27690(), Math.min(this.method2254(), class8322.method27628()) - class8322.method27690());
        if (min > 0) {
            class8322.method27692(min);
            class8321.method27693(min);
            this.method2161();
        }
    }
}
