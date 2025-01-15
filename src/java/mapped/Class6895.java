// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class Class6895 implements Class6894
{
    private Color field27035;
    
    public Class6895() {
        this.field27035 = Color.white;
    }
    
    public Class6895(final Color field27035) {
        this.field27035 = Color.white;
        this.field27035 = field27035;
    }
    
    @Override
    public void method21195(final BufferedImage bufferedImage, final Graphics2D graphics2D, final Class7522 class7522, final Class8274 class7523) {
        graphics2D.setColor(this.field27035);
        graphics2D.fill(class7523.method27505());
    }
    
    public Color method21212() {
        return this.field27035;
    }
    
    public void method21213(final Color field27035) {
        if (field27035 != null) {
            this.field27035 = field27035;
            return;
        }
        throw new IllegalArgumentException("color cannot be null.");
    }
    
    @Override
    public String toString() {
        return "Color";
    }
    
    @Override
    public List method21204() {
        final ArrayList list = new ArrayList();
        list.add(Class7340.method22544("Color", this.field27035));
        return list;
    }
    
    @Override
    public void method21205(final List list) {
        for (final Class5484 class5484 : list) {
            if (!class5484.method16731().equals("Color")) {
                continue;
            }
            this.method21213((Color)class5484.method16728());
        }
    }
}
