// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

public class Class9257
{
    private final List<Class647> field39697;
    private Class647 field39698;
    private final Class564 field39699;
    private Minecraft field39700;
    private final List<Class586> field39701;
    private List<Class9586> field39702;
    private Class645 field39703;
    private Class645 field39704;
    private int field39705;
    private int field39706;
    private Class6521 field39707;
    private IRecipe<?> field39708;
    private Class9586 field39709;
    
    public Class9257() {
        this.field39697 = Lists.newArrayListWithCapacity(20);
        this.field39699 = new Class564();
        this.field39701 = Lists.newArrayList();
        for (int i = 0; i < 20; ++i) {
            this.field39697.add(new Class647());
        }
    }
    
    public void method34148(final Minecraft field39700, final int n, final int n2) {
        this.field39700 = field39700;
        this.field39707 = field39700.player.method4122();
        for (int i = 0; i < this.field39697.size(); ++i) {
            this.field39697.get(i).method3700(n + 11 + 25 * (i % 5), n2 + 31 + 25 * (i / 5));
        }
        (this.field39703 = new Class645(n + 93, n2 + 137, 12, 17, false)).method3690(1, 208, 13, 18, Class581.field3462);
        (this.field39704 = new Class645(n + 38, n2 + 137, 12, 17, true)).method3690(1, 208, 13, 18, Class581.field3462);
    }
    
    public void method34149(final Class581 class581) {
        this.field39701.remove(class581);
        this.field39701.add(class581);
    }
    
    public void method34150(final List<Class9586> field39702, final boolean b) {
        this.field39702 = field39702;
        this.field39705 = (int)Math.ceil(field39702.size() / 20.0);
        if (this.field39705 <= this.field39706 || b) {
            this.field39706 = 0;
        }
        this.method34151();
    }
    
    private void method34151() {
        final int n = 20 * this.field39706;
        for (int i = 0; i < this.field39697.size(); ++i) {
            final Class647 class647 = this.field39697.get(i);
            if (n + i >= this.field39702.size()) {
                class647.field3432 = false;
            }
            else {
                class647.method3698(this.field39702.get(n + i), this);
                class647.field3432 = true;
            }
        }
        this.method34152();
    }
    
    private void method34152() {
        this.field39703.field3432 = (this.field39705 > 1 && this.field39706 < this.field39705 - 1);
        this.field39704.field3432 = (this.field39705 > 1 && this.field39706 > 0);
    }
    
    public void method34153(final int n, final int n2, final int n3, final int n4, final float n5) {
        if (this.field39705 > 1) {
            final String string = this.field39706 + 1 + "/" + this.field39705;
            this.field39700.fontRenderer.method6610(string, (float)(n - this.field39700.fontRenderer.getStringWidth(string) / 2 + 73), (float)(n2 + 141), -1);
        }
        this.field39698 = null;
        for (final Class647 field39698 : this.field39697) {
            field39698.render(n3, n4, n5);
            if (!field39698.field3432) {
                continue;
            }
            if (!field39698.method3360()) {
                continue;
            }
            this.field39698 = field39698;
        }
        this.field39704.render(n3, n4, n5);
        this.field39703.render(n3, n4, n5);
        this.field39699.render(n3, n4, n5);
    }
    
    public void method34154(final int n, final int n2) {
        if (this.field39700.field4700 != null) {
            if (this.field39698 != null) {
                if (!this.field39699.method3286()) {
                    this.field39700.field4700.renderTooltip(this.field39698.method3704(this.field39700.field4700), n, n2);
                }
            }
        }
    }
    
    @Nullable
    public IRecipe<?> method34155() {
        return this.field39708;
    }
    
    @Nullable
    public Class9586 method34156() {
        return this.field39709;
    }
    
    public void method34157() {
        this.field39699.method3285(false);
    }
    
    public boolean method34158(final double n, final double n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this.field39708 = null;
        this.field39709 = null;
        if (this.field39699.method3286()) {
            if (!this.field39699.mouseClicked(n, n2, n3)) {
                this.field39699.method3285(false);
            }
            else {
                this.field39708 = this.field39699.method3283();
                this.field39709 = this.field39699.method3282();
            }
            return true;
        }
        if (this.field39703.mouseClicked(n, n2, n3)) {
            ++this.field39706;
            this.method34151();
            return true;
        }
        if (!this.field39704.mouseClicked(n, n2, n3)) {
            for (final Class647 class647 : this.field39697) {
                if (!class647.mouseClicked(n, n2, n3)) {
                    continue;
                }
                if (n3 != 0) {
                    if (n3 == 1) {
                        if (!this.field39699.method3286()) {
                            if (!class647.method3702()) {
                                this.field39699.method3280(this.field39700, class647.method3699(), class647.field3426, class647.field3427, n4 + n6 / 2, n5 + 13 + n7 / 2, (float)class647.method3364());
                            }
                        }
                    }
                }
                else {
                    this.field39708 = class647.method3703();
                    this.field39709 = class647.method3699();
                }
                return true;
            }
            return false;
        }
        --this.field39706;
        this.method34151();
        return true;
    }
    
    public void method34159(final List<IRecipe<?>> list) {
        final Iterator<Class586> iterator = this.field39701.iterator();
        while (iterator.hasNext()) {
            iterator.next().method3438(list);
        }
    }
    
    public Minecraft method34160() {
        return this.field39700;
    }
    
    public Class6521 method34161() {
        return this.field39707;
    }
}
