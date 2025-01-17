// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;

public class Class4805 extends Class4803
{
    public Class9572 field20522;
    
    public Class4805(final Class4803 class4803, final String s, final Class4405 class4804) {
        super(class4803, s);
        this.field20522 = new Class9572(370, 150, Class2186.field12965);
        this.method14277(this.method14267().method14276());
        int n = 0;
        if (class4804.method13269("deprecated")) {
            GL11.glTexEnvi(8960, 8704, 260);
        }
        final String method13268 = class4804.method13268("title");
        final Class88 method13269 = class4804.method13263("changes");
        this.addVisualThing(new Class4834(this, "title", 0, n, 0, 0, Class6523.field25964, method13268, ClientFonts.JelloMedium40));
        n += 55;
        for (int i = 0; i < method13269.method462(); ++i) {
            this.addVisualThing(new Class4834(this, "change" + i, 0, n, 0, 0, new Class6523(0, 0, 0, Class6430.method19118(Class265.field1278.field1292, 0.8f)), " - " + method13269.method459(i), ClientFonts.JelloLight20));
            n += 22;
        }
        n += 75;
        this.method14279(n);
    }
    
    @Override
    public void method14205(float n) {
        this.method14294((int)((1.0f - Class8862.method31033(this.field20522.method35858(), 0.17, 1.0, 0.51, 1.0)) * 100.0f));
        this.method14228();
        n *= this.field20522.method35858();
        super.method14205(n);
    }
}
