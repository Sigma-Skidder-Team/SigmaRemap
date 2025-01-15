// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;

public class Class7768<C extends Class5470, T extends Class1868>
{
    public static final Class7768<Class5472, Class1872> field31768;
    public static final Class7768<Class5471, Class1869> field31769;
    public static final Class7768<Class5469, Class1871> field31770;
    public static final Class7768<Class5473, Class1870> field31771;
    private final Function<C, T> field31772;
    private final Function<Class8660, C> field31773;
    
    private static <C extends Class5470, T extends Class1868> Class7768<C, T> method24874(final String s, final Function<C, T> function, final Function<Class8660, C> function2) {
        return Class90.method511(Class90.field223, s, new Class7768<C, T>(function, function2));
    }
    
    private Class7768(final Function<C, T> field31772, final Function<Class8660, C> field31773) {
        this.field31772 = field31772;
        this.field31773 = field31773;
    }
    
    public T method24875(final C c) {
        return this.field31772.apply(c);
    }
    
    public C method24876(final Class8660 class8660) {
        return this.field31773.apply(class8660);
    }
    
    static {
        field31768 = method24874("checkerboard", Class1872::new, Class5472::new);
        field31769 = method24874("fixed", Class1869::new, Class5471::new);
        field31770 = method24874("vanilla_layered", Class1871::new, Class5469::new);
        field31771 = method24874("the_end", Class1870::new, Class5473::new);
    }
}
