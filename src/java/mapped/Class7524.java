// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Color;
import java.awt.RenderingHints;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.awt.FontMetrics;
import java.awt.Font;
import java.util.Map;

public class Class7524 implements Class7523
{
    private static final Class6448 field29858;
    private Class8535[] field29859;
    private Map field29860;
    private boolean field29861;
    private int field29862;
    private int field29863;
    public Class7776 field29864;
    private int field29865;
    private int field29866;
    private Font field29867;
    private FontMetrics field29868;
    private final int field29869;
    
    public Class7524(final Font field29867, final boolean field29868, final char[] array, final int field29869) {
        this.field29859 = new Class8535[256];
        this.field29860 = new HashMap();
        this.field29862 = 0;
        this.field29863 = 0;
        this.field29865 = 512;
        this.field29866 = 512;
        Class5474.method16716();
        this.field29867 = field29867;
        this.field29862 = field29867.getSize();
        this.field29861 = field29868;
        this.field29869 = field29869;
        if (field29869 > 0) {
            this.field29865 = 1024;
            this.field29866 = 1024;
        }
        this.method23537(array);
    }
    
    public Class7524(final Font font, final boolean b, final char[] array) {
        this(font, b, array, 0);
    }
    
    public Class7524(final Font font, final boolean b) {
        this(font, b, null);
    }
    
    public Class7524(final Font font, final int n) {
        this(font, true, null, n);
    }
    
    private BufferedImage method23535(final char c) {
        final Graphics2D graphics2D = (Graphics2D)new BufferedImage(1, 1, 2).getGraphics();
        if (this.field29861) {
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        graphics2D.setFont(this.field29867);
        this.field29868 = graphics2D.getFontMetrics();
        int charWidth = this.field29868.charWidth(c);
        if (charWidth <= 0) {
            charWidth = 1;
        }
        int n = this.field29868.getHeight();
        if (n <= 0) {
            n = this.field29862;
        }
        final BufferedImage bufferedImage = new BufferedImage(charWidth + this.field29869 * 2, n + this.field29869 * 2, 2);
        final Graphics2D graphics2D2 = (Graphics2D)bufferedImage.getGraphics();
        if (this.field29861) {
            graphics2D2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        graphics2D2.setFont(this.field29867);
        graphics2D2.setColor(Color.WHITE);
        graphics2D2.drawString(String.valueOf(c), this.field29869, this.field29869 + this.field29868.getAscent());
        if (this.field29869 <= 0) {
            return bufferedImage;
        }
        return Class6804.method20827(bufferedImage, this.field29869);
    }
    
    private int method23536(final char ch) {
        final Graphics2D graphics2D = (Graphics2D)new BufferedImage(1, 1, 2).getGraphics();
        if (this.field29861) {
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        graphics2D.setFont(this.field29867);
        this.field29868 = graphics2D.getFontMetrics();
        int charWidth = this.field29868.charWidth(ch);
        if (charWidth <= 0) {
            charWidth = 1;
        }
        return charWidth;
    }
    
    private void method23537(final char[] array) {
        if (array != null && array.length > 0) {
            this.field29865 *= 2;
        }
        try {
            if (this.method23535('\0').getHeight() > 60) {
                this.field29865 *= 2;
                this.field29866 *= 2;
            }
            final BufferedImage bufferedImage = new BufferedImage(this.field29865, this.field29866, 2);
            final Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
            graphics2D.setColor(new Color(255, 255, 255, 1));
            graphics2D.fillRect(0, 0, this.field29865, this.field29866);
            int n = 0;
            int field35822 = 0;
            int field35823 = 0;
            for (int n2 = (array != null) ? array.length : 0, i = 0; i < 256 + n2; ++i) {
                final char value = (i < 256) ? ((char)i) : array[i - 256];
                final BufferedImage method23535 = this.method23535(value);
                final Class8535 class8535 = new Class8535(this);
                class8535.field35819 = method23535.getWidth();
                class8535.field35821 = method23535.getHeight();
                if (this.field29869 > 0) {
                    class8535.field35820 = this.method23536(value);
                }
                else {
                    class8535.field35820 = class8535.field35819;
                }
                if (field35822 + class8535.field35819 >= this.field29865) {
                    field35822 = 0;
                    field35823 += n;
                    n = 0;
                }
                class8535.field35822 = field35822;
                class8535.field35823 = field35823;
                if (class8535.field35821 > this.field29863) {
                    this.field29863 = class8535.field35821;
                }
                if (class8535.field35821 > n) {
                    n = class8535.field35821 + 1;
                }
                graphics2D.drawImage(method23535, field35822, field35823, null);
                field35822 += class8535.field35819 + 1;
                if (i < 256) {
                    this.field29859[i] = class8535;
                }
                else {
                    this.field29860.put(new Character(value), class8535);
                }
            }
            this.field29864 = Class9399.method34928(this.field29867.toString(), bufferedImage);
        }
        catch (final IOException ex) {
            System.err.println("Failed to create font.");
            ex.printStackTrace();
        }
    }
    
    private void method23538(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        final float n9 = n3 - n;
        final float n10 = n4 - n2;
        final float n11 = n5 / this.field29865;
        final float n12 = n6 / this.field29866;
        final float n13 = n7 - n5;
        final float n14 = n8 - n6;
        final float n15 = n13 / this.field29865;
        final float n16 = n14 / this.field29866;
        Class7524.field29858.method19254(n11, n12);
        Class7524.field29858.method19255(n, n2);
        Class7524.field29858.method19254(n11, n12 + n16);
        Class7524.field29858.method19255(n, n2 + n10);
        Class7524.field29858.method19254(n11 + n15, n12 + n16);
        Class7524.field29858.method19255(n + n9, n2 + n10);
        Class7524.field29858.method19254(n11 + n15, n12);
        Class7524.field29858.method19255(n + n9, n2);
    }
    
    @Override
    public int method23505(final String s) {
        int n = 0;
        if (s != null) {
            for (int i = 0; i < s.length(); ++i) {
                final char char1 = s.charAt(i);
                Class8535 class8535;
                if (char1 >= '\u0100') {
                    class8535 = this.field29860.get(new Character(char1));
                }
                else {
                    class8535 = this.field29859[char1];
                }
                if (class8535 != null) {
                    n += class8535.field35820;
                }
            }
            return n;
        }
        return 0;
    }
    
    public int method23539() {
        return this.field29863;
    }
    
    @Override
    public int method23506(final String s) {
        return this.field29863;
    }
    
    @Override
    public int method23521() {
        return this.field29863;
    }
    
    @Override
    public void method23501(final float n, final float n2, final String s, final Class2427 class2427) {
        this.method23499(n, n2, s, class2427, 0, s.length() - 1);
    }
    
    @Override
    public void method23499(float n, float n2, final String s, final Class2427 class2427, final int n3, final int n4) {
        class2427.method9766();
        this.field29864.method24916();
        if (this.field29869 > 0) {
            n2 -= this.field29869 / 2 - 1;
            n -= this.field29869 - 1;
        }
        Class7524.field29858.method19251(7);
        int n5 = 0;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            Class8535 class2428;
            if (char1 >= '\u0100') {
                class2428 = this.field29860.get(new Character(char1));
            }
            else {
                class2428 = this.field29859[char1];
            }
            if (class2428 != null) {
                if (i >= n3 || i <= n4) {
                    this.method23538(n + n5, n2, n + n5 + class2428.field35819, n2 + class2428.field35821, (float)class2428.field35822, (float)class2428.field35823, (float)(class2428.field35822 + class2428.field35819), (float)(class2428.field35823 + class2428.field35821));
                }
                n5 += class2428.field35820;
            }
        }
        Class7524.field29858.method19253();
    }
    
    @Override
    public void method23500(final float n, final float n2, final String s) {
        this.method23501(n, n2, s, Class2427.field14355);
    }
    
    static {
        field29858 = Class7840.method25330();
    }
}
