// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public class Class8123
{
    private static String[] field33461;
    private final int field33462;
    private final Class8123[] field33463;
    private final boolean[] field33464;
    private boolean field33465;
    private boolean field33466;
    private int field33467;
    
    public Class8123(final int field33462) {
        this.field33463 = new Class8123[6];
        this.field33464 = new boolean[6];
        this.field33462 = field33462;
    }
    
    public void method26738(final Direction class179, final Class8123 class180) {
        this.field33463[class179.getIndex()] = class180;
        class180.field33463[class179.getOpposite().getIndex()] = this;
    }
    
    public void method26739() {
        for (int i = 0; i < 6; ++i) {
            this.field33464[i] = (this.field33463[i] != null);
        }
    }
    
    public boolean method26740(final int field33467) {
        if (!this.field33466) {
            this.field33467 = field33467;
            for (int i = 0; i < 6; ++i) {
                if (this.field33463[i] != null) {
                    if (this.field33464[i]) {
                        if (this.field33463[i].field33467 != field33467) {
                            if (this.field33463[i].method26740(field33467)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public boolean method26741() {
        return this.field33462 >= 75;
    }
    
    public int method26742() {
        int n = 0;
        for (int i = 0; i < 6; ++i) {
            if (this.field33464[i]) {
                ++n;
            }
        }
        return n;
    }
}
