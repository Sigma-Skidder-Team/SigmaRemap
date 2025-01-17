// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Color;
import slick2d.Renderer;

public class Class8384
{
    public static SGL field34364;
    public Class5831 field34365;
    public int field34366;
    
    public Class8384(final Class5831 field34365) {
        this.field34366 = -1;
        this.field34365 = field34365;
    }
    
    public void method27940(final Class8519 class8519) {
        if (this.field34366 == -1) {
            this.field34366 = Class8384.field34364.method19283(1);
            Class8384.field34364.method19276(this.field34366, 4864);
            method27941(class8519, this.field34365);
            Class8384.field34364.method19275();
        }
        Class8384.field34364.method19260(this.field34366);
        Class7777.method24930();
    }
    
    public static void method27941(final Class8519 class8519, final Class5831 class8520) {
        for (int i = 0; i < class8520.method17529(); ++i) {
            final Class7567 method17530 = class8520.method17530(i);
            if (method17530.method23757().method27588()) {
                if (method17530.method23757().method27583("fill")) {
                    class8519.method28474(method17530.method23757().method27585("fill"));
                    class8519.method28480(class8520.method17530(i).method23756());
                    class8519.method28513(true);
                    class8519.method28479(class8520.method17530(i).method23756());
                    class8519.method28513(false);
                }
                final String method17531 = method17530.method23757().method27586("fill");
                if (class8520.method17524(method17531) != null) {
                    System.out.println("PATTERN");
                }
                if (class8520.method17525(method17531) != null) {
                    final Class5202 method17532 = class8520.method17525(method17531);
                    final Class2400 method17533 = class8520.method17530(i).method23756();
                    Class8375 class8521;
                    if (!method17532.method16269()) {
                        class8521 = new Class8374(method17533, class8520.method17530(i).method23754(), method17532);
                    }
                    else {
                        class8521 = new Class8376(method17533, class8520.method17530(i).method23754(), method17532);
                    }
                    Color.field14355.bind();
                    Class6044.method17977(method17533, method17532.method16275(), class8521);
                }
            }
            if (method17530.method23757().method27589()) {
                if (method17530.method23757().method27583("stroke")) {
                    class8519.method28474(method17530.method23757().method27585("stroke"));
                    class8519.method28510(method17530.method23757().method27587("stroke-width"));
                    class8519.method28513(true);
                    class8519.method28479(class8520.method17530(i).method23756());
                    class8519.method28513(false);
                    class8519.method28512();
                }
            }
        }
    }
    
    static {
        Class8384.field34364 = Renderer.get();
    }
}
