// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.function.Predicate;
import com.google.common.collect.ImmutableList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.INameable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class464 implements Class446, INameable
{
    public final Class2265<ItemStack> field2739;
    public final Class2265<ItemStack> field2740;
    public final Class2265<ItemStack> field2741;
    private final List<Class2265<ItemStack>> field2742;
    public int field2743;
    public final PlayerEntity field2744;
    private ItemStack field2745;
    private int field2746;
    
    public Class464(final PlayerEntity field2744) {
        this.field2739 = Class2265.method8507(36, ItemStack.field34174);
        this.field2740 = Class2265.method8507(4, ItemStack.field34174);
        this.field2741 = Class2265.method8507(1, ItemStack.field34174);
        this.field2742 = (List<Class2265<ItemStack>>)ImmutableList.of((Object)this.field2739, (Object)this.field2740, (Object)this.field2741);
        this.field2745 = ItemStack.field34174;
        this.field2744 = field2744;
    }
    
    public ItemStack method2345() {
        return method2352(this.field2743) ? this.field2739.get(this.field2743) : ItemStack.field34174;
    }
    
    public static int method2346() {
        return 9;
    }
    
    private boolean method2347(final ItemStack class8321, final ItemStack class8322) {
        if (!class8321.method27620()) {
            if (this.method2348(class8321, class8322)) {
                if (class8321.method27629()) {
                    if (class8321.method27690() < class8321.method27628()) {
                        if (class8321.method27690() < this.method2254()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private boolean method2348(final ItemStack class8321, final ItemStack class8322) {
        return class8321.getItem() == class8322.getItem() && ItemStack.method27642(class8321, class8322);
    }
    
    public int method2349() {
        for (int i = 0; i < this.field2739.size(); ++i) {
            if (this.field2739.get(i).method27620()) {
                return i;
            }
        }
        return -1;
    }
    
    public void method2350(final ItemStack class8321) {
        final int method2353 = this.method2353(class8321);
        if (!method2352(method2353)) {
            if (method2353 != -1) {
                this.method2351(method2353);
            }
            else {
                this.field2743 = this.method2355();
                if (!this.field2739.get(this.field2743).method27620()) {
                    final int method2354 = this.method2349();
                    if (method2354 != -1) {
                        this.field2739.set(method2354, this.field2739.get(this.field2743));
                    }
                }
                this.field2739.set(this.field2743, class8321);
            }
        }
        else {
            this.field2743 = method2353;
        }
    }
    
    public void method2351(final int n) {
        this.field2743 = this.method2355();
        final ItemStack class8321 = this.field2739.get(this.field2743);
        this.field2739.set(this.field2743, this.field2739.get(n));
        this.field2739.set(n, class8321);
    }
    
    public static boolean method2352(final int n) {
        return n >= 0 && n < 9;
    }
    
    public int method2353(final ItemStack class8321) {
        for (int i = 0; i < this.field2739.size(); ++i) {
            if (!this.field2739.get(i).method27620() && this.method2348(class8321, this.field2739.get(i))) {
                return i;
            }
        }
        return -1;
    }
    
    public int method2354(final ItemStack class8321) {
        for (int i = 0; i < this.field2739.size(); ++i) {
            final ItemStack class8322 = this.field2739.get(i);
            if (!this.field2739.get(i).method27620()) {
                if (this.method2348(class8321, this.field2739.get(i))) {
                    if (!this.field2739.get(i).method27631()) {
                        if (!class8322.method27675()) {
                            if (!class8322.method27667()) {
                                return i;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
    
    public int method2355() {
        for (int i = 0; i < 9; ++i) {
            final int n = (this.field2743 + i) % 9;
            if (this.field2739.get(n).method27620()) {
                return n;
            }
        }
        for (int j = 0; j < 9; ++j) {
            final int n2 = (this.field2743 + j) % 9;
            if (!this.field2739.get(n2).method27675()) {
                return n2;
            }
        }
        return this.field2743;
    }
    
    public void method2356(double n) {
        if (n > 0.0) {
            n = 1.0;
        }
        if (n < 0.0) {
            n = -1.0;
        }
        this.field2743 -= (int)n;
        while (this.field2743 < 0) {
            this.field2743 += 9;
        }
        while (this.field2743 >= 9) {
            this.field2743 -= 9;
        }
    }
    
    public int method2357(final Predicate<ItemStack> predicate, final int n) {
        int n2 = 0;
        for (int i = 0; i < this.method2239(); ++i) {
            final ItemStack method2157 = this.method2157(i);
            if (!method2157.method27620()) {
                if (predicate.test(method2157)) {
                    final int n3 = (n > 0) ? Math.min(n - n2, method2157.method27690()) : method2157.method27690();
                    n2 += n3;
                    if (n != 0) {
                        method2157.method27693(n3);
                        if (method2157.method27620()) {
                            this.method2160(i, ItemStack.field34174);
                        }
                        if (n > 0) {
                            if (n2 >= n) {
                                return n2;
                            }
                        }
                    }
                }
            }
        }
        if (!this.field2745.method27620()) {
            if (predicate.test(this.field2745)) {
                final int n4 = (n > 0) ? Math.min(n - n2, this.field2745.method27690()) : this.field2745.method27690();
                n2 += n4;
                if (n != 0) {
                    this.field2745.method27693(n4);
                    if (this.field2745.method27620()) {
                        this.field2745 = ItemStack.field34174;
                    }
                    if (n > 0) {
                        if (n2 >= n) {
                            return n2;
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    private int method2358(final ItemStack class8321) {
        int n = this.method2360(class8321);
        if (n == -1) {
            n = this.method2349();
        }
        return (n != -1) ? this.method2359(n, class8321) : class8321.method27690();
    }
    
    private int method2359(final int n, final ItemStack class8321) {
        final Item method27622 = class8321.getItem();
        final int method27623 = class8321.method27690();
        ItemStack method27624 = this.method2157(n);
        if (method27624.method27620()) {
            method27624 = new ItemStack(method27622, 0);
            if (class8321.method27656()) {
                method27624.method27663(class8321.method27657().method333());
            }
            this.method2160(n, method27624);
        }
        int n2;
        if ((n2 = method27623) > method27624.method27628() - method27624.method27690()) {
            n2 = method27624.method27628() - method27624.method27690();
        }
        if (n2 > this.method2254() - method27624.method27690()) {
            n2 = this.method2254() - method27624.method27690();
        }
        if (n2 != 0) {
            final int n3 = method27623 - n2;
            method27624.method27692(n2);
            method27624.method27689(5);
            return n3;
        }
        return method27623;
    }
    
    public int method2360(final ItemStack class8321) {
        if (this.method2347(this.method2157(this.field2743), class8321)) {
            return this.field2743;
        }
        if (!this.method2347(this.method2157(40), class8321)) {
            for (int i = 0; i < this.field2739.size(); ++i) {
                if (this.method2347(this.field2739.get(i), class8321)) {
                    return i;
                }
            }
            return -1;
        }
        return 40;
    }
    
    public void method2361() {
        for (final Class2265 class2265 : this.field2742) {
            for (int i = 0; i < class2265.size(); ++i) {
                if (!((ItemStack)class2265.get(i)).method27620()) {
                    ((ItemStack)class2265.get(i)).method27650(this.field2744.world, this.field2744, i, this.field2743 == i);
                }
            }
        }
    }
    
    public boolean method2362(final ItemStack class8321) {
        return this.method2363(-1, class8321);
    }
    
    public boolean method2363(int method2349, final ItemStack class8321) {
        if (class8321.method27620()) {
            return false;
        }
        try {
            if (class8321.method27631()) {
                if (method2349 == -1) {
                    method2349 = this.method2349();
                }
                if (method2349 >= 0) {
                    this.field2739.set(method2349, class8321.method27641());
                    this.field2739.get(method2349).method27689(5);
                    class8321.method27691(0);
                    return true;
                }
                if (this.field2744.field3025.field27304) {
                    class8321.method27691(0);
                    return true;
                }
                return false;
            }
            else {
                int method2350;
                do {
                    method2350 = class8321.method27690();
                    if (method2349 == -1) {
                        class8321.method27691(this.method2358(class8321));
                    }
                    else {
                        class8321.method27691(this.method2359(method2349, class8321));
                    }
                } while (!class8321.method27620() && class8321.method27690() < method2350);
                if (class8321.method27690() == method2350 && this.field2744.field3025.field27304) {
                    class8321.method27691(0);
                    return true;
                }
                return class8321.method27690() < method2350;
            }
        }
        catch (final Throwable t) {
            final Class7689 method2351 = Class7689.method24421(t, "Adding item to inventory");
            final Class5204 method2352 = method2351.method24418("Item being added");
            method2352.method16297("Item ID", Item.method11696(class8321.getItem()));
            method2352.method16297("Item data", class8321.method27632());
            method2352.method16296("Item name", () -> class8322.method27664().getString());
            throw new Class2365(method2351);
        }
    }
    
    public void method2364(final World class1847, final ItemStack class1848) {
        if (!class1847.isRemote) {
            while (!class1848.method27620()) {
                int n = this.method2360(class1848);
                if (n == -1) {
                    n = this.method2349();
                }
                if (n == -1) {
                    this.field2744.method2822(class1848, false);
                    break;
                }
                if (!this.method2363(n, class1848.method27621(class1848.method27628() - this.method2157(n).method27690()))) {
                    continue;
                }
                ((Class513)this.field2744).field3039.method17469(new Class4272(-2, n, this.method2157(n)));
            }
        }
    }
    
    @Override
    public ItemStack method2158(int n, final int n2) {
        List list = null;
        for (final Class2265 class2265 : this.field2742) {
            if (n < class2265.size()) {
                list = class2265;
                break;
            }
            n -= class2265.size();
        }
        return (list != null && !((ItemStack)list.get(n)).method27620()) ? Class8508.method28422(list, n, n2) : ItemStack.field34174;
    }
    
    public void method2365(final ItemStack class8321) {
        for (final Class2265 class8322 : this.field2742) {
            for (int i = 0; i < class8322.size(); ++i) {
                if (class8322.get(i) == class8321) {
                    class8322.set(i, ItemStack.field34174);
                    break;
                }
            }
        }
    }
    
    @Override
    public ItemStack method2159(int n) {
        Class2265 class2265 = null;
        for (final Class2265 class2266 : this.field2742) {
            if (n < class2266.size()) {
                class2265 = class2266;
                break;
            }
            n -= class2266.size();
        }
        if (class2265 != null && !((ItemStack)class2265.get(n)).method27620()) {
            final ItemStack class2267 = (ItemStack)class2265.get(n);
            class2265.set(n, ItemStack.field34174);
            return class2267;
        }
        return ItemStack.field34174;
    }
    
    @Override
    public void method2160(int n, final ItemStack class8321) {
        Class2265<ItemStack> class8322 = null;
        for (final Class2265 class8323 : this.field2742) {
            if (n < class8323.size()) {
                class8322 = class8323;
                break;
            }
            n -= class8323.size();
        }
        if (class8322 != null) {
            class8322.set(n, class8321);
        }
    }
    
    public float method2366(final BlockState class7096) {
        return this.field2739.get(this.field2743).method27624(class7096);
    }
    
    public Class52 method2367(final Class52 class52) {
        for (int i = 0; i < this.field2739.size(); ++i) {
            if (!this.field2739.get(i).method27620()) {
                final Class51 e = new Class51();
                e.method296("Slot", (byte)i);
                this.field2739.get(i).method27627(e);
                ((AbstractList<Class51>)class52).add(e);
            }
        }
        for (int j = 0; j < this.field2740.size(); ++j) {
            if (!this.field2740.get(j).method27620()) {
                final Class51 e2 = new Class51();
                e2.method296("Slot", (byte)(j + 100));
                this.field2740.get(j).method27627(e2);
                ((AbstractList<Class51>)class52).add(e2);
            }
        }
        for (int k = 0; k < this.field2741.size(); ++k) {
            if (!this.field2741.get(k).method27620()) {
                final Class51 e3 = new Class51();
                e3.method296("Slot", (byte)(k + 150));
                this.field2741.get(k).method27627(e3);
                ((AbstractList<Class51>)class52).add(e3);
            }
        }
        return class52;
    }
    
    public void method2368(final Class52 class52) {
        this.field2739.clear();
        this.field2740.clear();
        this.field2741.clear();
        for (int i = 0; i < class52.size(); ++i) {
            final Class51 method346 = class52.method346(i);
            final int n = method346.method317("Slot") & 0xFF;
            final ItemStack method347 = ItemStack.method27619(method346);
            if (!method347.method27620()) {
                if (n >= 0 && n < this.field2739.size()) {
                    this.field2739.set(n, method347);
                }
                else if (n >= 100 && n < this.field2740.size() + 100) {
                    this.field2740.set(n - 100, method347);
                }
                else if (n >= 150) {
                    if (n < this.field2741.size() + 150) {
                        this.field2741.set(n - 150, method347);
                    }
                }
            }
        }
    }
    
    @Override
    public int method2239() {
        return this.field2739.size() + this.field2740.size() + this.field2741.size();
    }
    
    @Override
    public boolean method2156() {
        final Iterator<Object> iterator = this.field2739.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27620()) {
                continue;
            }
            return false;
        }
        final Iterator<Object> iterator2 = this.field2740.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().method27620()) {
                continue;
            }
            return false;
        }
        final Iterator<Object> iterator3 = this.field2741.iterator();
        while (iterator3.hasNext()) {
            if (iterator3.next().method27620()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public ItemStack method2157(int n) {
        List list = null;
        for (final Class2265 class2265 : this.field2742) {
            if (n < class2265.size()) {
                list = class2265;
                break;
            }
            n -= class2265.size();
        }
        return (ItemStack)((list != null) ? list.get(n) : ItemStack.field34174);
    }
    
    @Override
    public ITextComponent getName() {
        return new Class2259("container.inventory", new Object[0]);
    }
    
    public boolean method2369(final BlockState class7096) {
        return this.method2157(this.field2743).method27639(class7096);
    }
    
    public ItemStack method2370(final int n) {
        return this.field2740.get(n);
    }
    
    public void method2371(float n) {
        if (n > 0.0f) {
            n /= 4.0f;
            if (n < 1.0f) {
                n = 1.0f;
            }
            for (int i = 0; i < this.field2740.size(); ++i) {
                final ItemStack class8321 = this.field2740.get(i);
                if (class8321.getItem() instanceof Class4055) {
                    class8321.method27636((int)n, this.field2744, class8322 -> class8322.method2794(Class2215.method8406(Class295.field1682, n2)));
                }
            }
        }
    }
    
    public void method2372() {
        for (final List list : this.field2742) {
            for (int i = 0; i < list.size(); ++i) {
                final ItemStack class8321 = (ItemStack)list.get(i);
                if (!class8321.method27620()) {
                    this.field2744.method2823(class8321, true, false);
                    list.set(i, ItemStack.field34174);
                }
            }
        }
    }
    
    @Override
    public void method2161() {
        ++this.field2746;
    }
    
    public int method2373() {
        return this.field2746;
    }
    
    public void method2374(final ItemStack field2745) {
        this.field2745 = field2745;
    }
    
    public ItemStack method2375() {
        return this.field2745;
    }
    
    @Override
    public boolean method2162(final PlayerEntity playerEntity) {
        return !this.field2744.removed && playerEntity.method1734(this.field2744) <= 64.0;
    }
    
    public boolean method2376(final ItemStack class8321) {
        final Iterator<Class2265<ItemStack>> iterator = this.field2742.iterator();
        while (iterator.hasNext()) {
            for (final ItemStack class8322 : iterator.next()) {
                if (!class8322.method27620() && class8322.method27647(class8321)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean method2377(final Class7909<Item> class7909) {
        final Iterator<Class2265<ItemStack>> iterator = this.field2742.iterator();
        while (iterator.hasNext()) {
            for (final ItemStack class7910 : iterator.next()) {
                if (!class7910.method27620() && class7909.method25618(class7910.getItem())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void method2378(final Class464 class464) {
        for (int i = 0; i < this.method2239(); ++i) {
            this.method2160(i, class464.method2157(i));
        }
        this.field2743 = class464.field2743;
    }
    
    @Override
    public void method2164() {
        final Iterator<Class2265<ItemStack>> iterator = this.field2742.iterator();
        while (iterator.hasNext()) {
            iterator.next().clear();
        }
    }
    
    public void method2379(final Class5024 class5024) {
        final Iterator<Object> iterator = this.field2739.iterator();
        while (iterator.hasNext()) {
            class5024.method15242(iterator.next());
        }
    }
}
