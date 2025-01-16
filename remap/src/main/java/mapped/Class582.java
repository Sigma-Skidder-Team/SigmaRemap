// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Set;
import java.util.Iterator;

public abstract class Class582 extends Class581
{
    private Iterator<Item> field3479;
    private Set<Item> field3480;
    private Class6601 field3481;
    private Item field3482;
    private float field3483;
    
    @Override
    public boolean method3432() {
        final boolean b = !this.method3448();
        this.method3449(b);
        return b;
    }
    
    public abstract boolean method3448();
    
    public abstract void method3449(final boolean p0);
    
    @Override
    public boolean method3421() {
        return this.method3450();
    }
    
    public abstract boolean method3450();
    
    @Override
    public void method3422(final boolean b) {
        this.method3451(b);
        if (!b) {
            this.field3475.method34157();
        }
        this.method3441();
    }
    
    public abstract void method3451(final boolean p0);
    
    @Override
    public void method3417() {
        this.field3469.method3690(152, 182, 28, 18, Class582.field3462);
    }
    
    @Override
    public String method3429() {
        return Class8822.method30773(this.field3469.method3692() ? this.method3452() : "gui.recipebook.toggleRecipes.all", new Object[0]);
    }
    
    public abstract String method3452();
    
    @Override
    public void method3423(final Class6601 class6601) {
        super.method3423(class6601);
        if (class6601 != null) {
            if (class6601.field26174 < this.field3470.method10940()) {
                this.field3481 = null;
            }
        }
    }
    
    @Override
    public void method3439(final Class3662<?> class3662, final List<Class6601> list) {
        final ItemStack method11292 = class3662.method11292();
        this.field3466.method25525(class3662);
        this.field3466.method25521(Class120.method619(method11292), list.get(2).field26175, list.get(2).field26176);
        final Class2265 method11293 = class3662.method11294();
        this.field3481 = list.get(1);
        if (this.field3480 == null) {
            this.field3480 = this.method3453();
        }
        this.field3479 = this.field3480.iterator();
        this.field3482 = null;
        final Iterator iterator = method11293.iterator();
        for (int i = 0; i < 2; ++i) {
            if (!iterator.hasNext()) {
                return;
            }
            final Class120 class3663 = (Class120)iterator.next();
            if (!class3663.method616()) {
                final Class6601 class3664 = list.get(i);
                this.field3466.method25521(class3663, class3664.field26175, class3664.field26176);
            }
        }
    }
    
    public abstract Set<Item> method3453();
    
    @Override
    public void method3431(final int n, final int n2, final boolean b, final float n3) {
        super.method3431(n, n2, b, n3);
        if (this.field3481 != null) {
            if (!Screen.method3046()) {
                this.field3483 += n3;
            }
            final int n4 = this.field3481.field26175 + n;
            final int n5 = this.field3481.field26176 + n2;
            Class565.method3293(n4, n5, n4 + 16, n5 + 16, 822018048);
            this.field3471.getItemRenderer().method6541(this.field3471.field4684, this.method3454().method11741(), n4, n5);
            Class8726.method30009(516);
            Class565.method3293(n4, n5, n4 + 16, n5 + 16, 822083583);
            Class8726.method30009(515);
        }
    }
    
    private Item method3454() {
        if (this.field3482 == null || this.field3483 > 30.0f) {
            this.field3483 = 0.0f;
            if (this.field3479 == null || !this.field3479.hasNext()) {
                if (this.field3480 == null) {
                    this.field3480 = this.method3453();
                }
                this.field3479 = this.field3480.iterator();
            }
            this.field3482 = this.field3479.next();
        }
        return this.field3482;
    }
}
