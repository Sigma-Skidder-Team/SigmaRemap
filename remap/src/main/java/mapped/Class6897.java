// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;
import java.awt.image.ConvolveOp;
import java.awt.RenderingHints;
import java.awt.image.Kernel;
import java.util.Iterator;
import java.awt.Composite;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class Class6897 implements Class6894
{
    public static final int field27041 = 16;
    public static final float[][] field27042;
    private Color field27043;
    private float field27044;
    private float field27045;
    private float field27046;
    private int field27047;
    private int field27048;
    
    public Class6897() {
        this.field27043 = Color.black;
        this.field27044 = 0.6f;
        this.field27045 = 2.0f;
        this.field27046 = 2.0f;
        this.field27047 = 0;
        this.field27048 = 1;
    }
    
    public Class6897(final Color field27043, final int n, final int n2, final float field27044) {
        this.field27043 = Color.black;
        this.field27044 = 0.6f;
        this.field27045 = 2.0f;
        this.field27046 = 2.0f;
        this.field27047 = 0;
        this.field27048 = 1;
        this.field27043 = field27043;
        this.field27045 = (float)n;
        this.field27046 = (float)n2;
        this.field27044 = field27044;
    }
    
    @Override
    public void method21195(final BufferedImage bufferedImage, Graphics2D graphics2D, final Class7522 class7522, final Class8274 class7523) {
        graphics2D = (Graphics2D)graphics2D.create();
        graphics2D.translate(this.field27045, this.field27046);
        graphics2D.setColor(new Color(this.field27043.getRed(), this.field27043.getGreen(), this.field27043.getBlue(), Math.round(this.field27044 * 255.0f)));
        graphics2D.fill(class7523.method27505());
        for (final Class6898 class7524 : class7522.method23530()) {
            if (!(class7524 instanceof Class6892)) {
                continue;
            }
            final Composite composite = graphics2D.getComposite();
            graphics2D.setComposite(AlphaComposite.Src);
            graphics2D.setStroke(((Class6892)class7524).method21201());
            graphics2D.draw(class7523.method27505());
            graphics2D.setComposite(composite);
            break;
        }
        graphics2D.dispose();
        if (this.field27047 > 1) {
            if (this.field27047 < 16) {
                if (this.field27048 > 0) {
                    this.method21224(bufferedImage);
                }
            }
        }
    }
    
    private void method21224(final BufferedImage bufferedImage) {
        final float[] array = Class6897.field27042[this.field27047 - 1];
        final Kernel kernel = new Kernel(array.length, 1, array);
        final Kernel kernel2 = new Kernel(1, array.length, array);
        final RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
        final ConvolveOp convolveOp = new ConvolveOp(kernel, 1, renderingHints);
        final ConvolveOp convolveOp2 = new ConvolveOp(kernel2, 1, renderingHints);
        final BufferedImage method22543 = Class7340.method22543();
        for (int i = 0; i < this.field27048; ++i) {
            convolveOp.filter(bufferedImage, method22543);
            convolveOp2.filter(method22543, bufferedImage);
        }
    }
    
    public Color method21225() {
        return this.field27043;
    }
    
    public void method21226(final Color field27043) {
        this.field27043 = field27043;
    }
    
    public float method21227() {
        return this.field27045;
    }
    
    public void method21228(final float field27045) {
        this.field27045 = field27045;
    }
    
    public float method21229() {
        return this.field27046;
    }
    
    public void method21230(final float field27046) {
        this.field27046 = field27046;
    }
    
    public int method21231() {
        return this.field27047;
    }
    
    public void method21232(final int field27047) {
        this.field27047 = field27047;
    }
    
    public int method21233() {
        return this.field27048;
    }
    
    public void method21234(final int field27048) {
        this.field27048 = field27048;
    }
    
    public float method21235() {
        return this.field27044;
    }
    
    public void method21236(final float field27044) {
        this.field27044 = field27044;
    }
    
    @Override
    public String toString() {
        return "Shadow";
    }
    
    @Override
    public List method21204() {
        final ArrayList list = new ArrayList();
        list.add(Class7340.method22544("Color", this.field27043));
        list.add(Class7340.method22546("Opacity", this.field27044, 0.0f, 1.0f, "This setting sets the translucency of the shadow."));
        list.add(Class7340.method22546("X distance", this.field27045, Float.MIN_VALUE, Float.MAX_VALUE, "This setting is the amount of pixels to offset the shadow on the x axis. The glyphs will need padding so the shadow doesn't get clipped."));
        list.add(Class7340.method22546("Y distance", this.field27046, Float.MIN_VALUE, Float.MAX_VALUE, "This setting is the amount of pixels to offset the shadow on the y axis. The glyphs will need padding so the shadow doesn't get clipped."));
        final ArrayList list2 = new ArrayList();
        list2.add(new String[] { "None", "0" });
        for (int i = 2; i < 16; ++i) {
            list2.add(new String[] { String.valueOf(i) });
        }
        list.add(Class7340.method22548("Blur kernel size", String.valueOf(this.field27047), (String[][])list2.toArray(new String[list2.size()][]), "This setting controls how many neighboring pixels are used to blur the shadow. Set to \"None\" for no blur."));
        list.add(Class7340.method22545("Blur passes", this.field27048, "The setting is the number of times to apply a blur to the shadow. Set to \"0\" for no blur."));
        return list;
    }
    
    @Override
    public void method21205(final List list) {
        for (final Class5484 class5484 : list) {
            if (!class5484.method16731().equals("Color")) {
                if (!class5484.method16731().equals("Opacity")) {
                    if (!class5484.method16731().equals("X distance")) {
                        if (!class5484.method16731().equals("Y distance")) {
                            if (!class5484.method16731().equals("Blur kernel size")) {
                                if (!class5484.method16731().equals("Blur passes")) {
                                    continue;
                                }
                                this.field27048 = (int)class5484.method16728();
                            }
                            else {
                                this.field27047 = Integer.parseInt((String)class5484.method16728());
                            }
                        }
                        else {
                            this.field27046 = (float)class5484.method16728();
                        }
                    }
                    else {
                        this.field27045 = (float)class5484.method16728();
                    }
                }
                else {
                    this.field27044 = (float)class5484.method16728();
                }
            }
            else {
                this.field27043 = (Color)class5484.method16728();
            }
        }
    }
    
    private static float[][] method21237(final int n) {
        final float[][] method21238 = method21238(n);
        final float[][] array = new float[method21238.length][];
        for (int i = 0; i < array.length; ++i) {
            float n2 = 0.0f;
            array[i] = new float[method21238[i].length];
            for (int j = 0; j < method21238[i].length; ++j) {
                n2 += method21238[i][j];
            }
            final float n3 = 1.0f / n2;
            for (int k = 0; k < method21238[i].length; ++k) {
                array[i][k] = n3 * method21238[i][k];
            }
        }
        return array;
    }
    
    private static float[][] method21238(int n) {
        if (n < 2) {
            n = 2;
        }
        final float[][] array = new float[n][];
        array[0] = new float[1];
        array[1] = new float[2];
        array[0][0] = 1.0f;
        array[1][0] = 1.0f;
        array[1][1] = 1.0f;
        for (int i = 2; i < n; ++i) {
            (array[i] = new float[i + 1])[0] = 1.0f;
            array[i][i] = 1.0f;
            for (int j = 1; j < array[i].length - 1; ++j) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }
        return array;
    }
    
    static {
        field27042 = method21237(16);
    }
}
