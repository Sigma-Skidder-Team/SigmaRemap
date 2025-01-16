// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class Class6468 extends Class6469
{
    private final Predicate<Class5760> field25703;
    private final BiConsumer<Class5760, Boolean> field25704;
    
    public Class6468(final String s, final Predicate<Class5760> field25703, final BiConsumer<Class5760, Boolean> field25704) {
        super(s);
        this.field25703 = field25703;
        this.field25704 = field25704;
    }
    
    public void method19358(final Class5760 class5760, final String anObject) {
        this.method19360(class5760, "true".equals(anObject));
    }
    
    public void method19359(final Class5760 class5760) {
        this.method19360(class5760, !this.method19361(class5760));
        class5760.method17121();
    }
    
    private void method19360(final Class5760 class5760, final boolean b) {
        this.field25704.accept(class5760, b);
    }
    
    public boolean method19361(final Class5760 class5760) {
        return this.field25703.test(class5760);
    }
    
    @Override
    public Widget method19362(final Class5760 class5760, final int n, final int n2, final int n3) {
        return new Class657(n, n2, n3, 20, this, this.method19363(class5760), class5761 -> {
            this.method19359(class5760);
            class5761.method3367(this.method19363(class5760));
        });
    }
    
    public String method19363(final Class5760 class5760) {
        return this.method19365() + Class8822.method30773(this.method19361(class5760) ? "options.on" : "options.off", new Object[0]);
    }
}
