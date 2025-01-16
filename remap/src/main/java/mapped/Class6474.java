// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.BiFunction;
import java.util.function.BiConsumer;

public class Class6474 extends Class6469
{
    public BiConsumer<Class5760, Integer> field25829;
    public BiFunction<Class5760, Class6474, String> field25830;
    
    public Class6474(final String s, final BiConsumer<Class5760, Integer> field25829, final BiFunction<Class5760, Class6474, String> field25830) {
        super(s);
        this.field25829 = field25829;
        this.field25830 = field25830;
    }
    
    public void method19485(final Class5760 class5760, final int i) {
        this.field25829.accept(class5760, i);
        class5760.method17121();
    }
    
    @Override
    public Widget method19362(final Class5760 class5760, final int n, final int n2, final int n3) {
        return new Class657(n, n2, n3, 20, this, this.method19486(class5760), class5761 -> {
            this.method19485(class5760, 1);
            class5761.method3367(this.method19486(class5760));
        });
    }
    
    public String method19486(final Class5760 class5760) {
        return this.field25830.apply(class5760, this);
    }
}
