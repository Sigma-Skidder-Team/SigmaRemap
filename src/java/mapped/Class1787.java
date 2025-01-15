// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;

public class Class1787 extends Class1785
{
    public Class1787(final Class1663 class1663) {
        super(class1663, new Class1932("textures/atlas/mob_effects.png"), "mob_effect");
    }
    
    @Override
    public Stream<Class1932> method6439() {
        return Class90.field207.method507().stream();
    }
    
    public Class1912 method6446(final Class5328 class5328) {
        return this.method6440(Class90.field207.method503(class5328));
    }
}
