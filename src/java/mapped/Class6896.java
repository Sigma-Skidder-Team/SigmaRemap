// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.awt.Paint;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class Class6896 implements Class6894
{
    private Color field27036;
    private Color field27037;
    private int field27038;
    private float field27039;
    private boolean field27040;
    
    public Class6896() {
        this.field27036 = Color.cyan;
        this.field27037 = Color.blue;
        this.field27038 = 0;
        this.field27039 = 1.0f;
    }
    
    public Class6896(final Color field27036, final Color field27037, final float field27038) {
        this.field27036 = Color.cyan;
        this.field27037 = Color.blue;
        this.field27038 = 0;
        this.field27039 = 1.0f;
        this.field27036 = field27036;
        this.field27037 = field27037;
        this.field27039 = field27038;
    }
    
    @Override
    public void method21195(final BufferedImage bufferedImage, final Graphics2D graphics2D, final Class7522 class7522, final Class8274 class7523) {
        final int method23522 = class7522.method23522();
        final float n = method23522 * this.field27039;
        final float y1 = -class7523.method27509() + class7522.method23523() + this.field27038 + method23522 / 2 - n / 2.0f;
        graphics2D.setPaint(new GradientPaint(0.0f, y1, this.field27036, 0.0f, y1 + n, this.field27037, this.field27040));
        graphics2D.fill(class7523.method27505());
    }
    
    public Color method21214() {
        return this.field27036;
    }
    
    public void method21215(final Color field27036) {
        this.field27036 = field27036;
    }
    
    public Color method21216() {
        return this.field27037;
    }
    
    public void method21217(final Color field27037) {
        this.field27037 = field27037;
    }
    
    public int method21218() {
        return this.field27038;
    }
    
    public void method21219(final int field27038) {
        this.field27038 = field27038;
    }
    
    public float method21220() {
        return this.field27039;
    }
    
    public void method21221(final float field27039) {
        this.field27039 = field27039;
    }
    
    public boolean method21222() {
        return this.field27040;
    }
    
    public void method21223(final boolean field27040) {
        this.field27040 = field27040;
    }
    
    @Override
    public String toString() {
        return "Gradient";
    }
    
    @Override
    public List method21204() {
        final ArrayList list = new ArrayList();
        list.add(Class7340.method22544("Top color", this.field27036));
        list.add(Class7340.method22544("Bottom color", this.field27037));
        list.add(Class7340.method22545("Offset", this.field27038, "This setting allows you to move the gradient up or down. The gradient is normally centered on the glyph."));
        list.add(Class7340.method22546("Scale", this.field27039, 0.0f, 1.0f, "This setting allows you to change the height of the gradient by apercentage. The gradient is normally the height of most glyphs in the font."));
        list.add(Class7340.method22547("Cyclic", this.field27040, "If this setting is checked, the gradient will repeat."));
        return list;
    }
    
    @Override
    public void method21205(final List list) {
        for (final Class5484 class5484 : list) {
            if (!class5484.method16731().equals("Top color")) {
                if (!class5484.method16731().equals("Bottom color")) {
                    if (!class5484.method16731().equals("Offset")) {
                        if (!class5484.method16731().equals("Scale")) {
                            if (!class5484.method16731().equals("Cyclic")) {
                                continue;
                            }
                            this.field27040 = (boolean)class5484.method16728();
                        }
                        else {
                            this.field27039 = (float)class5484.method16728();
                        }
                    }
                    else {
                        this.field27038 = (int)class5484.method16728();
                    }
                }
                else {
                    this.field27037 = (Color)class5484.method16728();
                }
            }
            else {
                this.field27036 = (Color)class5484.method16728();
            }
        }
    }
}
