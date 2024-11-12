package org.newdawn.slick;

import com.mentalfrostbyte.jello.util.ImageUtil;
import org.newdawn.slick.util.BufferedImageUtil;
import org.newdawn.slick.opengl.GLUtils;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TrueTypeFont implements Font {
    private static final SGL GL = Renderer.get();
    private final int field31944;
    public Texture fontTexture;
    private final IntObject[] charArray = new IntObject[256];
    private final Map customChars = new HashMap();
    private final boolean antiAlias;
    private int fontSize = 0;
    private int fontHeight = 0;
    private int textureWidth = 512;
    private int textureHeight = 512;
    private final java.awt.Font font;
    private FontMetrics fontMetrics;

    public TrueTypeFont(java.awt.Font font, boolean antiAlias, char[] additionalChars, int var4) {
        GLUtils.checkGLContext();
        this.font = font;
        this.fontSize = font.getSize();
        this.antiAlias = antiAlias;
        this.field31944 = var4;
        if (var4 > 0) {
            this.textureWidth = 1024;
            this.textureHeight = 1024;
        }

        this.createSet(additionalChars);
    }

    public TrueTypeFont(java.awt.Font var1, boolean var2, char[] var3) {
        this(var1, var2, var3, 0);
    }

    public TrueTypeFont(java.awt.Font var1, boolean var2) {
        this(var1, var2, null);
    }

    public TrueTypeFont(java.awt.Font var1, int var2) {
        this(var1, true, null, var2);
    }

    private BufferedImage getFontImage(char ch) {
        BufferedImage var4 = new BufferedImage(1, 1, 2);
        Graphics2D var5 = (Graphics2D) var4.getGraphics();
        if (this.antiAlias) {
            var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        var5.setFont(this.font);
        this.fontMetrics = var5.getFontMetrics();
        int charwidth = this.fontMetrics.charWidth(ch);
        if (charwidth <= 0) {
            charwidth = 1;
        }

        int charheight = this.fontMetrics.getHeight();
        if (charheight <= 0) {
            charheight = this.fontSize;
        }

        BufferedImage var8 = new BufferedImage(charwidth + this.field31944 * 2, charheight + this.field31944 * 2, 2);
        Graphics2D var9 = (Graphics2D) var8.getGraphics();
        if (this.antiAlias) {
            var9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        var9.setFont(this.font);
        var9.setColor(java.awt.Color.WHITE);
        int var10 = this.field31944;
        int var11 = this.field31944;
        var9.drawString(String.valueOf(ch), var10, var11 + this.fontMetrics.getAscent());
        return this.field31944 <= 0 ? var8 : ImageUtil.method35033(var8, this.field31944);
    }

    private int method23949(char var1) {
        BufferedImage var4 = new BufferedImage(1, 1, 2);
        Graphics2D var5 = (Graphics2D) var4.getGraphics();
        if (this.antiAlias) {
            var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        var5.setFont(this.font);
        this.fontMetrics = var5.getFontMetrics();
        int var6 = this.fontMetrics.charWidth(var1);
        if (var6 <= 0) {
            var6 = 1;
        }

        return var6;
    }

    private void createSet(char[] customCharsArray) {
        if	(customCharsArray != null && customCharsArray.length > 0) {
            textureWidth *= 2;
        }

        try {
            BufferedImage var4 = this.getFontImage('\u0000');
            if (var4.getHeight() > 60) {
                this.textureWidth *= 2;
                this.textureHeight *= 2;
            }

            BufferedImage var5 = new BufferedImage(this.textureWidth, this.textureHeight, 2);
            Graphics2D g = (Graphics2D) var5.getGraphics();
            g.setColor(new java.awt.Color(255, 255, 255, 1));
            g.fillRect(0, 0, this.textureWidth, this.textureHeight);
            int rowHeight = 0;
            int positionX = 0;
            int positionY = 0;
            int customCharsLength = customCharsArray != null ? customCharsArray.length : 0;

            for (int i = 0; i < 256 + customCharsLength; i++) {
                char ch = i < 256 ? (char) i : customCharsArray[i - 256];
                BufferedImage fontImage = this.getFontImage(ch);
                IntObject newIntObject = new IntObject();
                newIntObject.width = fontImage.getWidth();
                newIntObject.height = fontImage.getHeight();
                if (this.field31944 > 0) {
                    newIntObject.field35435 = this.method23949(ch);
                } else {
                    newIntObject.field35435 = newIntObject.width;
                }

                if (positionX + newIntObject.width >= this.textureWidth) {
                    positionX = 0;
                    positionY += rowHeight;
                    rowHeight = 0;
                }

                newIntObject.storedX = positionX;
                newIntObject.storedY = positionY;
                if (newIntObject.height > this.fontHeight) {
                    this.fontHeight = newIntObject.height;
                }

                if (newIntObject.height > rowHeight) {
                    rowHeight = newIntObject.height + 1;
                }

                g.drawImage(fontImage, positionX, positionY, null);
                positionX += newIntObject.width + 1;
                if (i < 256) {
                    this.charArray[i] = newIntObject;
                } else {
                    this.customChars.put(new Character(ch), newIntObject);
                }

                fontImage = null;
            }

            this.fontTexture = BufferedImageUtil.getTexture(this.font.toString(), var5);
        } catch (IOException var15) {
            System.err.println("Failed to create font.");
            var15.printStackTrace();
        }
    }

    private void drawQuad(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
        float var11 = var3 - var1;
        float var12 = var4 - var2;
        float var13 = var5 / (float) this.textureWidth;
        float var14 = var6 / (float) this.textureHeight;
        float var15 = var7 - var5;
        float var16 = var8 - var6;
        float var17 = var15 / (float) this.textureWidth;
        float var18 = var16 / (float) this.textureHeight;
        GL.glTexCoord2f(var13, var14);
        GL.glVertex2f(var1, var2);
        GL.glTexCoord2f(var13, var14 + var18);
        GL.glVertex2f(var1, var2 + var12);
        GL.glTexCoord2f(var13 + var17, var14 + var18);
        GL.glVertex2f(var1 + var11, var2 + var12);
        GL.glTexCoord2f(var13 + var17, var14);
        GL.glVertex2f(var1 + var11, var2);
    }

    @Override
    public int getWidth(String whatchars) {
        int totalwidth = 0;
        IntObject intObject = null;
        char currentChar = '\u0000';
        if (whatchars != null) {
            for (int i = 0; i < whatchars.length(); i++) {
                currentChar = whatchars.charAt(i);
                if (currentChar >= 256) {
                    intObject = (IntObject) this.customChars.get(new Character(currentChar));
                } else {
                    intObject = this.charArray[currentChar];
                }

                if (intObject != null) {
                    totalwidth += intObject.field35435;
                }
            }

            return totalwidth;
        } else {
            return 0;
        }
    }

    /**
     * Get the font's height
     *
     * @return The height of the font
     */
    public int getHeight() { //getHeight
        return this.fontHeight;
    }

    /**
     * Get the height of a String
     *
     * @return The height of a given string
     */
    @Override
    public int getHeight(String var1) { //getHeight
        return this.fontHeight;
    }

    @Override
    public int getLineHeight() {
        return this.fontHeight;
    }

    @Override
    public void drawString(float var1, float var2, String var3, Color var4) {
        this.drawString(var1, var2, var3, var4, 0, var3.length() - 1);
    }

    @Override
    public void drawString(float x, float y, String whatchars, Color color, int startIndex, int endIndex) {
        color.bind();
        this.fontTexture.bind();
        IntObject intObject = null;
        if (this.field31944 > 0) {
            y -= (float) (this.field31944 / 2 - 1);
            x -= (float) (this.field31944 - 1);
        }

        GL.glBegin(7);
        int totalwidth = 0;

        for (int i = 0; i < whatchars.length(); i++) {
            char charCurrent = whatchars.charAt(i);
            if (charCurrent >= 256) {
                intObject = (IntObject) this.customChars.get(new Character(charCurrent));
            } else {
                intObject = this.charArray[charCurrent];
            }

            if (intObject != null) {
                if (i >= startIndex || i <= endIndex) {
                    this.drawQuad(
                            x + (float) totalwidth,
                            y,
                            x + (float) totalwidth + (float) intObject.width,
                            y + (float) intObject.height,
                            (float) intObject.storedX,
                            (float) intObject.storedY,
                            (float) (intObject.storedX + intObject.width),
                            (float) (intObject.storedY + intObject.height)
                    );
                }

                totalwidth += intObject.field35435;
            }
        }

        GL.glEnd();
    }

    @Override
    public void drawString(float var1, float var2, String var3) {
        this.drawString(var1, var2, var3, Color.white);
    }

    public class IntObject {
       public int width;
       public int field35435;
       public int height;
       public int storedX;
       public int storedY;
    }
}
