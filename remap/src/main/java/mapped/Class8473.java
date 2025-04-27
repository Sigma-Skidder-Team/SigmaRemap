// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8473
{
    private static String[] field34784;
    private final Class9241[] field34785;
    
    public Class8473(final Class9241[] field34785) {
        this.field34785 = field34785;
    }
    
    public void method28280() {
        for (int i = 0; i < this.field34785.length; ++i) {
            this.field34785[i].method34072();
        }
    }
    
    public boolean method28281(final Class5108 class5108) {
        for (int i = 0; i < this.field34785.length; ++i) {
            if (!this.field34785[i].method34071(class5108)) {
                return false;
            }
        }
        return true;
    }
}
