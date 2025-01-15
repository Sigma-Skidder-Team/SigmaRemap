// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Stroke;
import java.awt.Color;

public class Class6892 implements Class6894
{
    private float field27029;
    private Color field27030;
    private int field27031;
    private Stroke field27032;
    
    public Class6892() {
        this.field27029 = 2.0f;
        this.field27030 = Color.black;
        this.field27031 = 2;
    }
    
    public Class6892(final int n, final Color field27030) {
        this.field27029 = 2.0f;
        this.field27030 = Color.black;
        this.field27031 = 2;
        this.field27029 = (float)n;
        this.field27030 = field27030;
    }
    
    @Override
    public void method21195(final BufferedImage bufferedImage, Graphics2D graphics2D, final Class7522 class7522, final Class8274 class7523) {
        graphics2D = (Graphics2D)graphics2D.create();
        if (this.field27032 == null) {
            graphics2D.setStroke(this.method21201());
        }
        else {
            graphics2D.setStroke(this.field27032);
        }
        graphics2D.setColor(this.field27030);
        graphics2D.draw(class7523.method27505());
        graphics2D.dispose();
    }
    
    public float method21196() {
        return this.field27029;
    }
    
    public void method21197(final int n) {
        this.field27029 = (float)n;
    }
    
    public Color method21198() {
        return this.field27030;
    }
    
    public void method21199(final Color field27030) {
        this.field27030 = field27030;
    }
    
    public int method21200() {
        return this.field27031;
    }
    
    public Stroke method21201() {
        if (this.field27032 != null) {
            return this.field27032;
        }
        return new BasicStroke(this.field27029, 2, this.field27031);
    }
    
    public void method21202(final Stroke field27032) {
        this.field27032 = field27032;
    }
    
    public void method21203(final int field27031) {
        this.field27031 = field27031;
    }
    
    @Override
    public String toString() {
        return "Outline";
    }
    
    @Override
    public List method21204() {
        final ArrayList list = new ArrayList();
        list.add(Class7340.method22544("Color", this.field27030));
        list.add(Class7340.method22546("Width", this.field27029, 0.1f, 999.0f, "This setting controls the width of the outline. The glyphs will need padding so the outline doesn't get clipped."));
        list.add(Class7340.method22548("Join", String.valueOf(this.field27031), new String[][] { { "Bevel", "2" }, { "Miter", "0" }, { "Round", "1" } }, "This setting defines how the corners of the outline are drawn. This is usually only noticeable at large outline widths."));
        return list;
    }
    
    @Override
    public void method21205(final List list) {
        for (final Class5484 class5484 : list) {
            if (!class5484.method16731().equals("Color")) {
                if (!class5484.method16731().equals("Width")) {
                    if (!class5484.method16731().equals("Join")) {
                        continue;
                    }
                    this.field27031 = Integer.parseInt((String)class5484.method16728());
                }
                else {
                    this.field27029 = (float)class5484.method16728();
                }
            }
            else {
                this.field27030 = (Color)class5484.method16728();
            }
        }
    }
}
