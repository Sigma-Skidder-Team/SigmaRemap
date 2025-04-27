// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;

public class Class1786 extends Class1785
{
    private static final ResourceLocation field9903;
    
    public Class1786(final Class1663 class1663) {
        super(class1663, new ResourceLocation("textures/atlas/paintings.png"), "painting");
    }
    
    @Override
    public Stream<ResourceLocation> method6439() {
        return Stream.concat(Registry.field227.method507().stream(), Stream.of(Class1786.field9903));
    }
    
    public TextureAtlasSprite method6444(final Class8539 class8539) {
        return this.method6440(Registry.field227.getKey(class8539));
    }
    
    public TextureAtlasSprite method6445() {
        return this.method6440(Class1786.field9903);
    }
    
    static {
        field9903 = new ResourceLocation("back");
    }
}
