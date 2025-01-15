// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.Hash$Strategy;
import java.util.function.Function;
import java.util.Optional;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;

public final class Class6333 extends Class6332
{
    private static final ObjectOpenCustomHashSet<Class6333> field25346;
    private final Class6304 field25347;
    private final int field25348;
    private final Optional<Class6332> field25349;
    private final boolean field25350;
    
    private Class6333(final String s, final Class9272 class9272, final int n, final int n2, final boolean b, final boolean b2, final Class6304 field25347) {
        super(s, class9272, n, n2, b, b2, () -> Class6304.method18669(class9273).forEach(Class6322::method18709), () -> Class6304.method18669(class9274).forEach(Class6322::method18710));
        this.field25347 = field25347;
        this.field25349 = ((Class6304.method18667(field25347) != Class2017.field11498) ? Optional.empty() : Class6304.method18668(field25347).method18842().map((Function<? super Class1932, ? extends Class6332>)Class6332::method18783));
        this.field25350 = (Class6304.method18667(field25347) == Class2017.field11497);
        this.field25348 = Class7827.method25283(super.hashCode(), field25347);
    }
    
    private static Class6333 method18826(final String s, final Class9272 class9272, final int n, final int n2, final boolean b, final boolean b2, final Class6304 class9273) {
        return (Class6333)Class6333.field25346.addOrGet((Object)new Class6333(s, class9272, n, n2, b, b2, class9273));
    }
    
    @Override
    public Optional<Class6332> method18799() {
        return this.field25349;
    }
    
    @Override
    public boolean method18800() {
        return this.field25350;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o;
    }
    
    @Override
    public int hashCode() {
        return this.field25348;
    }
    
    @Override
    public String toString() {
        return "" + this.field25274 + ", " + Class6304.method18668(this.field25347).method18842();
    }
    
    static {
        field25346 = new ObjectOpenCustomHashSet((Hash$Strategy)Class1997.field11184);
    }
}
