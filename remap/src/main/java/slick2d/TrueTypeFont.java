// 
// Decompiled by Procyon v0.6.0
// 

package slick2d;

import mapped.*;

import java.io.IOException;
import java.awt.RenderingHints;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.awt.FontMetrics;
import java.util.Map;

public class TrueTypeFont implements Font
{
    private static final SGL GL;
    private IntObject[] charArray = new IntObject[256];
    private Map customChars = new HashMap();
    private boolean antiAlias;
    private int fontSize = 0;
    private int fontHeight = 0;
    public Texture fontTexture;
    private int textureWidth = 512;
    private int textureHeight = 512;
    private java.awt.Font font;
    private FontMetrics fontMetrics;
    private final int field29869;
    
    public TrueTypeFont(final java.awt.Font font, final boolean antiAlias, final char[] characterArray, final int field29869) {
        this.fontHeight = 0;
        this.textureWidth = 512;
        this.textureHeight = 512;
        GLUtils.checkGLContext();
        this.font = font;
        this.fontSize = font.getSize();
        this.antiAlias = antiAlias;
        this.field29869 = field29869;
        if (field29869 > 0) {
            this.textureWidth = 1024;
            this.textureHeight = 1024;
        }
        this.createSet(characterArray);
    }
    
    public TrueTypeFont(final java.awt.Font font, final boolean antiAlias, final char[] array) {
        this(font, antiAlias, array, 0);
    }
    
    public TrueTypeFont(final java.awt.Font font, final boolean antiAlias) {
        this(font, antiAlias, null);
    }
    
    public TrueTypeFont(final java.awt.Font font, final int n) {
        this(font, true, null, n);
    }
    
    private java.awt.image.BufferedImage getFontImage(final char c) {
        final Graphics2D graphics2D = (Graphics2D)new java.awt.image.BufferedImage(1, 1, 2).getGraphics();
        if (this.antiAlias) {
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        graphics2D.setFont(this.font);
        this.fontMetrics = graphics2D.getFontMetrics();
        int charWidth = this.fontMetrics.charWidth(c);
        if (charWidth <= 0) {
            charWidth = 1;
        }
        int n = this.fontMetrics.getHeight();
        if (n <= 0) {
            n = this.fontSize;
        }
        final java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage(charWidth + this.field29869 * 2, n + this.field29869 * 2, 2);
        final Graphics2D graphics2D2 = (Graphics2D)bufferedImage.getGraphics();
        if (this.antiAlias) {
            graphics2D2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        graphics2D2.setFont(this.font);
        graphics2D2.setColor(java.awt.Color.WHITE);
        graphics2D2.drawString(String.valueOf(c), this.field29869, this.field29869 + this.fontMetrics.getAscent());
        if (this.field29869 <= 0) {
            return bufferedImage;
        }
        return BufferedImage.method20827(bufferedImage, this.field29869);
    }
    
    private int method23536(final char ch) {
        final Graphics2D graphics2D = (Graphics2D)new java.awt.image.BufferedImage(1, 1, 2).getGraphics();
        if (this.antiAlias) {
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        graphics2D.setFont(this.font);
        this.fontMetrics = graphics2D.getFontMetrics();
        int charWidth = this.fontMetrics.charWidth(ch);
        if (charWidth <= 0) {
            charWidth = 1;
        }
        return charWidth;
    }
    
    private void createSet(final char[] array) {
        if (array != null && array.length > 0) {
            this.textureWidth *= 2;
        }
        try {
            if (this.getFontImage('\0').getHeight() > 60) {
                this.textureWidth *= 2;
                this.textureHeight *= 2;
            }
            final java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage(this.textureWidth, this.textureHeight, 2);
            final Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
            graphics2D.setColor(new java.awt.Color(255, 255, 255, 1));
            graphics2D.fillRect(0, 0, this.textureWidth, this.textureHeight);
            int n = 0;
            int field35822 = 0;
            int field35823 = 0;
            for (int n2 = (array != null) ? array.length : 0, i = 0; i < 256 + n2; ++i) {
                final char value = (i < 256) ? ((char)i) : array[i - 256];
                final java.awt.image.BufferedImage method23535 = this.getFontImage(value);
                final IntObject class8535 = new IntObject();
                class8535.width = method23535.getWidth();
                class8535.storedX = method23535.getHeight();
                if (this.field29869 > 0) {
                    class8535.height = this.method23536(value);
                }
                else {
                    class8535.height = class8535.width;
                }
                if (field35822 + class8535.width >= this.textureWidth) {
                    field35822 = 0;
                    field35823 += n;
                    n = 0;
                }
                class8535.storedY = field35822;
                class8535.field35823 = field35823;
                if (class8535.storedX > this.fontHeight) {
                    this.fontHeight = class8535.storedX;
                }
                if (class8535.storedX > n) {
                    n = class8535.storedX + 1;
                }
                graphics2D.drawImage(method23535, field35822, field35823, null);
                field35822 += class8535.width + 1;
                if (i < 256) {
                    this.charArray[i] = class8535;
                }
                else {
                    this.customChars.put(new Character(value), class8535);
                }
            }
            this.fontTexture = BufferedImageUtil.getTexture(this.font.toString(), bufferedImage);
        }
        catch (final IOException ex) {
            System.err.println("Failed to create font.");
            ex.printStackTrace();
        }
    }
    
    private void drawQuad(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        final float n9 = n3 - n;
        final float n10 = n4 - n2;
        final float n11 = n5 / this.textureWidth;
        final float n12 = n6 / this.textureHeight;
        final float n13 = n7 - n5;
        final float n14 = n8 - n6;
        final float n15 = n13 / this.textureWidth;
        final float n16 = n14 / this.textureHeight;
        TrueTypeFont.GL.glTexCoord2f(n11, n12);
        TrueTypeFont.GL.glVertex2f(n, n2);
        TrueTypeFont.GL.glTexCoord2f(n11, n12 + n16);
        TrueTypeFont.GL.glVertex2f(n, n2 + n10);
        TrueTypeFont.GL.glTexCoord2f(n11 + n15, n12 + n16);
        TrueTypeFont.GL.glVertex2f(n + n9, n2 + n10);
        TrueTypeFont.GL.glTexCoord2f(n11 + n15, n12);
        TrueTypeFont.GL.glVertex2f(n + n9, n2);
    }
    
    @Override
    public int getWidth(final String whatchars) {
        int totalwidth = 0;
        IntObject intObject = null;
        int currentChar = 0;
        for (int i = 0; i < whatchars.length(); i++) {
            currentChar = whatchars.charAt(i);
            if (currentChar < 256) {
                intObject = charArray[currentChar];
            } else {
                intObject = (IntObject)customChars.get( new Character( (char) currentChar ) );
            }

            if( intObject != null )
                totalwidth += intObject.height;
        }
        return totalwidth;
    }
    
    public int getHeight() {
        return this.fontHeight;
    }
    
    @Override
    public int getHeight(final String str) {
        return this.fontHeight;
    }
    
    @Override
    public int getLineHeight() {
        return this.fontHeight;
    }
    
    @Override
    public void drawString(final float x, final float y, final String text, final Color color) {
        this.drawString(x, y, text, color, 0, text.length() - 1);
    }
    
    @Override
    public void drawString(float x, float y, final String text, final Color color, final int startIndex, final int endIndex) {
        color.bind();
        this.fontTexture.bind();
        if (this.field29869 > 0) {
            y -= this.field29869 / 2 - 1;
            x -= this.field29869 - 1;
        }
        TrueTypeFont.GL.glBegin(7);
        int totalwidth = 0;
        for (int i = 0; i < text.length(); ++i) {
            final char char1 = text.charAt(i);
            IntObject intObject;
            if (char1 >= '\u0100') {
                intObject = (IntObject) this.customChars.get(char1);
            }
            else {
                intObject = this.charArray[char1];
            }
            if (intObject != null) {
                if (i >= startIndex || i <= endIndex) {
                    this.drawQuad(x + totalwidth, y, x + totalwidth + intObject.width, y + intObject.storedX, (float)intObject.storedY, (float)intObject.field35823, (float)(intObject.storedY + intObject.width), (float)(intObject.field35823 + intObject.storedX));
                }
                totalwidth += intObject.height;
            }
        }
        TrueTypeFont.GL.method19253();
    }
    
    @Override
    public void drawString(final float x, final float y, final String text) {
        this.drawString(x, y, text, Color.field14355);
    }
    
    static {
        GL = Renderer.get();
    }

    private class IntObject
    {
        public int width;
        public int height;
        public int storedX;
        public int storedY;
        public int field35823;
    }
}
