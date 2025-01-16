// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class Class1863 extends Chunk
{
    private static String[] field10164;
    private Class9489 field10165;
    
    public Class1863(final World class1847, final ChunkPos class1848, final Class1873 class1849) {
        super(class1847, class1848, class1849);
    }
    
    public Class9489 method7086() {
        return this.field10165;
    }
    
    public void method7087(final Class9489 field10165) {
        this.field10165 = field10165;
    }
    
    public static Class9489 method7088(final Chunk class1862) {
        Class7383[] array = null;
        final Class8199 method7011 = class1862.method7011();
        if (method7011 != null) {
            final int n = (method7011.method27159() >> 4) + 1;
            array = new Class7383[n];
            final Class8199[] method7012 = class1862.method7014();
            for (int i = 0; i < n; ++i) {
                final Class8199 class1863 = method7012[i];
                if (class1863 != null) {
                    array[i] = new Class7383(class1863.method27166(), class1863.method27167(), class1863.method27168());
                }
            }
        }
        return new Class9489(array);
    }
}
