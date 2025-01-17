// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.TrueTypeFont;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Class4824 extends Class4817
{
    private List<Class4868> field20638;
    private boolean field20639;
    private boolean field20640;
    private float field20641;
    private int field20642;
    private int field20643;
    private static TrueTypeFont field20496;
    private static int field20644;
    private boolean field20645;
    private static final String field20646 = "\n";
    
    public Class4824(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4);
        this.field20638 = new ArrayList<Class4868>();
        this.field20641 = 1.0f;
        this.field20642 = 0;
        this.field20643 = 14;
        this.method14311(this.field20645 = false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    public void method14450(final Class8592 class8592) {
        final boolean b = this.field20645 == class8592.field36094 && this.field20642 != 0;
        final boolean b2 = this.method14392() + this.method14278() >= this.method14396().method14278() - Class4824.field20644;
        if (b) {
            this.field20643 -= 7;
        }
        final int n = this.method14396().method14278() - this.method14278();
        this.method14396().method14239(new Class4923(this.method14396(), "message" + this.field20642, 0, this.field20643, this.method14276(), class8592.method29096() + Class4824.field20644, class8592));
        this.field20643 += class8592.method29096();
        ++this.field20642;
        this.field20645 = class8592.field36094;
        if (class8592.field36094 || b2) {
            this.method14451(n, class8592.method29096(), b);
        }
    }
    
    public void method14451(final int n, final int n2, final boolean b) {
        this.method14392();
        int n3 = n + n2;
        if (b) {
            n3 -= 7;
        }
        new Thread(() -> {
            final float n8;
            final Object o = new Date().getTime() + (int)n8;
            final Object o2 = this.field20642 + 0;
            int n9 = 0;
            if (this.field20642 == 1) {
                n9 += 30;
            }
            while (n4 >= new Date().getTime() && n5 == this.field20642) {
                this.method14391((int)(n7 + n9 * Class7791.method25030((float)Math.sqrt(1.0f - (n4 - new Date().getTime()) / n6), 0.0f, 1.0f, 1.0f)));
            }
        }).start();
    }
    
    @Override
    public void method14205(final float n) {
        super.method14205(n);
    }
    
    static {
        Class4824.field20496 = ClientFonts.JelloLight18;
        Class4824.field20644 = 14;
    }
}
