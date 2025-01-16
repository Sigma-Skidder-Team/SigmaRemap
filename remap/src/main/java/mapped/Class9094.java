// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util2.Direction;

public class Class9094
{
    private static String[] field38512;
    public final Class8741[] field38513;
    public final Vector3f field38514;
    
    public Class9094(final Class8741[] field38513, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final boolean b, final Direction class179) {
        this.field38513 = field38513;
        final float n7 = 0.0f / n5;
        final float n8 = 0.0f / n6;
        field38513[0] = field38513[0].method30194(n3 / n5 - n7, n2 / n6 + n8);
        field38513[1] = field38513[1].method30194(n / n5 + n7, n2 / n6 + n8);
        field38513[2] = field38513[2].method30194(n / n5 + n7, n4 / n6 - n8);
        field38513[3] = field38513[3].method30194(n3 / n5 - n7, n4 / n6 - n8);
        if (b) {
            for (int length = field38513.length, i = 0; i < length / 2; ++i) {
                final Class8741 class180 = field38513[i];
                field38513[i] = field38513[length - 1 - i];
                field38513[length - 1 - i] = class180;
            }
        }
        this.field38514 = class179.toVector3f();
        if (b) {
            this.field38514.mul(-1.0f, 1.0f, 1.0f);
        }
    }
}
