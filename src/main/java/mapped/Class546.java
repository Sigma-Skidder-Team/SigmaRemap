// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;

public class Class546 extends Class527
{
    private final Class2250 field3290;
    private final List<String> field3291;
    public String field3292;
    public String field3293;
    private int field3294;
    public final BooleanConsumer field3295;
    
    public Class546(final BooleanConsumer booleanConsumer, final Class2250 class2250, final Class2250 class2251) {
        this(booleanConsumer, class2250, class2251, Class8822.method30773("gui.yes", new Object[0]), Class8822.method30773("gui.no", new Object[0]));
    }
    
    public Class546(final BooleanConsumer field3295, final Class2250 class2250, final Class2250 field3296, final String field3297, final String field3298) {
        super(class2250);
        this.field3291 = Lists.newArrayList();
        this.field3295 = field3295;
        this.field3290 = field3296;
        this.field3292 = field3297;
        this.field3293 = field3298;
    }
    
    @Override
    public String method3027() {
        return super.method3027() + ". " + this.field3290.getString();
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 / 6 + 96, 150, 20, this.field3292, class654 -> this.field3295.accept(true)));
        this.method3029(new Class654(this.field3152 / 2 - 155 + 160, this.field3153 / 6 + 96, 150, 20, this.field3293, class654 -> this.field3295.accept(false)));
        this.field3291.clear();
        this.field3291.addAll(this.field3156.method6626(this.field3290.method8461(), this.field3152 - 50));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.method8461(), this.field3152 / 2, 70, 16777215);
        int n4 = 90;
        final Iterator<String> iterator = this.field3291.iterator();
        while (iterator.hasNext()) {
            this.method3295(this.field3156, iterator.next(), this.field3152 / 2, n4, 16777215);
            n4 += 9;
        }
        super.method2975(n, n2, n3);
    }
    
    public void method3209(final int field3294) {
        this.field3294 = field3294;
        final Iterator<Class573> iterator = this.field3154.iterator();
        while (iterator.hasNext()) {
            iterator.next().field3431 = false;
        }
    }
    
    @Override
    public void method2992() {
        super.method2992();
        final int field3294 = this.field3294 - 1;
        this.field3294 = field3294;
        if (field3294 == 0) {
            final Iterator<Class573> iterator = this.field3154.iterator();
            while (iterator.hasNext()) {
                iterator.next().field3431 = true;
            }
        }
    }
    
    @Override
    public boolean method2989() {
        return false;
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method2972(n, n2, n3);
        }
        this.field3295.accept(false);
        return true;
    }
}
