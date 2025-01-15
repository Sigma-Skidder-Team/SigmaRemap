// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class3538<T extends Class759> extends Class3446
{
    private static String[] field16577;
    private final T field16578;
    private final Class8321 field16579;
    private final Predicate<? super T> field16580;
    private final Class7795 field16581;
    
    public Class3538(final T field16578, final Class8321 field16579, final Class7795 field16580, final Predicate<? super T> field16581) {
        this.field16578 = field16578;
        this.field16579 = field16579;
        this.field16581 = field16580;
        this.field16580 = field16581;
    }
    
    @Override
    public boolean method11013() {
        return this.field16580.test(this.field16578);
    }
    
    @Override
    public boolean method11017() {
        return this.field16578.method2756();
    }
    
    @Override
    public void method11015() {
        this.field16578.method1803(Class2215.field13600, this.field16579.method27641());
        this.field16578.method2762(Class316.field1877);
    }
    
    @Override
    public void method11018() {
        this.field16578.method1803(Class2215.field13600, Class8321.field34174);
        if (this.field16581 != null) {
            this.field16578.method1695(this.field16581, 1.0f, this.field16578.method2633().nextFloat() * 0.2f + 0.9f);
        }
    }
}
