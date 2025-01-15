// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;

public class Class2361 extends RuntimeException
{
    private final Collection<Class9336> field14149;
    
    public Class2361(final Class9336 class9336, final Collection<Class9336> field14149) {
        super(String.format("Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", class9336.method34591(), class9336.method34592(), class9336.method34593()));
        this.field14149 = field14149;
    }
    
    public Collection<Class9336> method9498() {
        return this.field14149;
    }
    
    public Class2361(final Class9336 class9336, final Collection<Class9336> field14149, final int i, final int j, final int k, final int l) {
        super(String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", "" + class9336.method34591(), class9336.method34592(), class9336.method34593(), i, j, k, l));
        this.field14149 = field14149;
    }
}
