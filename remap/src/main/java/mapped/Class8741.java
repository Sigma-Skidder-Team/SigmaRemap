// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;

public class Class8741
{
    private static String[] field36719;
    public final Vector3f field36720;
    public final float field36721;
    public final float field36722;
    
    public Class8741(final float n, final float n2, final float n3, final float n4, final float n5) {
        this(new Vector3f(n, n2, n3), n4, n5);
    }
    
    public Class8741 method30194(final float n, final float n2) {
        return new Class8741(this.field36720, n, n2);
    }
    
    public Class8741(final Vector3f field36720, final float field36721, final float field36722) {
        this.field36720 = field36720;
        this.field36721 = field36721;
        this.field36722 = field36722;
    }
}
