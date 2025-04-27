// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public class Class6473 extends Class6470
{
    public Class6473(final Class1925 class1925) {
        this(class1925, class1925.method7701());
    }
    
    private Class6473(final Class1925 class1925, final Class7646 class1926) {
        super("options.fullscreen.resolution", -1.0, (class1926 == null) ? -1.0 : ((double)(class1926.method24212() - 1)), 1.0f, p2 -> {
            if (class1927 != null) {
                return Double.valueOf(class1929.method7681().map(class1931 -> Double.valueOf(class1930.method24207(class1931))).orElse(-1.0));
            }
            else {
                return Double.valueOf(-1.0);
            }
        }, (p2, n) -> {
            if (class1932 != null) {
                if (n != -1.0) {
                    class1933.method7682(Optional.of(class1932.method24211(n.intValue())));
                }
                else {
                    class1933.method7682(Optional.empty());
                }
            }
        }, (class1935, class1936) -> {
            if (class1934 != null) {
                class1936.method19476(class1935);
                class1936.method19365();
                final double n2;
                String s;
                if (n2 != -1.0) {
                    s = class1934.method24211((int)n2).toString();
                }
                else {
                    final String str;
                    s = str + Class8822.method30773("options.fullscreen.current");
                }
                return s;
            }
            else {
                return Class8822.method30773("options.fullscreen.unavailable");
            }
        });
    }
}
