// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Rectangle;

public class Class7301 implements Class7300
{
    @Override
    public Rectangle method22384(final Class527 class527, final int n, final int n2) {
        int x = class527.field3152 - 450;
        int y = 35;
        if (x < 10) {
            x = 10;
        }
        if (n2 <= y + 94) {
            y += 100;
        }
        return new Rectangle(x, y, x + 150 + 150 - x, y + 84 + 10 - y);
    }
    
    @Override
    public boolean method22385() {
        return true;
    }
    
    @Override
    public String[] method22386(final Class573 class573, final int n) {
        if (class573 instanceof Class676) {
            return Class7298.method22387("of.options.shaders.DOWNLOAD");
        }
        if (class573 instanceof Class677) {
            return this.method22391(((Class677)class573).method3739());
        }
        return null;
    }
    
    private String[] method22391(final Class2222 class2222) {
        return Class7298.method22387(class2222.method8416());
    }
}
