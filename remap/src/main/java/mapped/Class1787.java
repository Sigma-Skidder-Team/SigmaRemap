// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;

public class Class1787 extends Class1785
{
    public Class1787(final Class1663 class1663) {
        super(class1663, new ResourceLocation("textures/atlas/mob_effects.png"), "mob_effect");
    }
    
    @Override
    public Stream<ResourceLocation> method6439() {
        return Registry.field207.method507().stream();
    }
    
    public Class1912 method6446(final Class5328 class5328) {
        return this.method6440(Registry.field207.getKey(class5328));
    }
}
