// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.awt.Rectangle;

public class Class7298 implements Class7300
{
    @Override
    public Rectangle method22384(final Screen class527, final int n, final int n2) {
        final int x = class527.width / 2 - 150;
        int y = class527.height / 6 - 7;
        if (n2 <= y + 98) {
            y += 105;
        }
        return new Rectangle(x, y, x + 150 + 150 - x, y + 84 + 10 - y);
    }
    
    @Override
    public boolean method22385() {
        return false;
    }
    
    @Override
    public String[] method22386(final Widget class573, final int n) {
        if (class573 instanceof Class659) {
            return method22387(((Class659)class573).method3709().method19366());
        }
        return null;
    }
    
    public static String[] method22387(final String str) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < 10; ++i) {
            final String method13877 = Class4647.method13877(str + ".tooltip." + (i + 1), null);
            if (method13877 == null) {
                break;
            }
            list.add(method13877);
        }
        if (list.size() > 0) {
            return (String[])list.toArray(new String[list.size()]);
        }
        return null;
    }
}
