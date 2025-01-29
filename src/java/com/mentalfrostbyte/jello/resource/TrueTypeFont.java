package com.mentalfrostbyte.jello.resource;

import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import lol.*;
import org.newdawn.slick.Font;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.GLUtils;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TrueTypeFont implements Font {
    private static final SGL field31933 = Renderer.get();
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

    public TrueTypeFont(java.awt.Font var1, boolean antiAlias, char[] additionalChars, int var4) {
        GLUtils.checkGLContext();
        this.font = var1;
        this.fontSize = var1.getSize();
        this.antiAlias = antiAlias;
        this.field31944 = var4;
        if (var4 > 0) {
            this.textureWidth = 1024;
            this.textureHeight = 1024;
        }

        this.method23950(additionalChars);
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

    private BufferedImage method23948(char var1) {
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

        int var7 = this.fontMetrics.getHeight();
        if (var7 <= 0) {
            var7 = this.fontSize;
        }

        BufferedImage var8 = new BufferedImage(var6 + this.field31944 * 2, var7 + this.field31944 * 2, 2);
        Graphics2D var9 = (Graphics2D) var8.getGraphics();
        if (this.antiAlias) {
            var9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        var9.setFont(this.font);
        var9.setColor(java.awt.Color.WHITE);
        int var10 = this.field31944;
        int var11 = this.field31944;
        var9.drawString(String.valueOf(var1), var10, var11 + this.fontMetrics.getAscent());
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

    private void method23950(char[] var1) {
        if (var1 != null && var1.length > 0) {
            this.textureWidth *= 2;
        }

        try {
            BufferedImage var4 = this.method23948('\u0000');
            if (var4.getHeight() > 60) {
                this.textureWidth *= 2;
                this.textureHeight *= 2;
            }

            BufferedImage var5 = new BufferedImage(this.textureWidth, this.textureHeight, 2);
            Graphics2D var6 = (Graphics2D) var5.getGraphics();
            var6.setColor(new java.awt.Color(255, 255, 255, 1));
            var6.fillRect(0, 0, this.textureWidth, this.textureHeight);
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = var1 != null ? var1.length : 0;

            for (int var11 = 0; var11 < 256 + var10; var11++) {
                char var12 = var11 < 256 ? (char) var11 : var1[var11 - 256];
                BufferedImage var13 = this.method23948(var12);
                IntObject var14 = new IntObject(this);
                var14.field35434 = var13.getWidth();
                var14.field35436 = var13.getHeight();
                if (this.field31944 > 0) {
                    var14.field35435 = this.method23949(var12);
                } else {
                    var14.field35435 = var14.field35434;
                }

                if (var8 + var14.field35434 >= this.textureWidth) {
                    var8 = 0;
                    var9 += var7;
                    var7 = 0;
                }

                var14.field35437 = var8;
                var14.field35438 = var9;
                if (var14.field35436 > this.fontHeight) {
                    this.fontHeight = var14.field35436;
                }

                if (var14.field35436 > var7) {
                    var7 = var14.field35436 + 1;
                }

                var6.drawImage(var13, var8, var9, null);
                var8 += var14.field35434 + 1;
                if (var11 < 256) {
                    this.charArray[var11] = var14;
                } else {
                    this.customChars.put(new Character(var12), var14);
                }

                Object var16 = null;
            }

            this.fontTexture = TextureUtil.method32933(this.font.toString(), var5);
        } catch (IOException var15) {
            System.err.println("Failed to create font.");
            var15.printStackTrace();
        }
    }

    private void method23951(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
        float var11 = var3 - var1;
        float var12 = var4 - var2;
        float var13 = var5 / (float) this.textureWidth;
        float var14 = var6 / (float) this.textureHeight;
        float var15 = var7 - var5;
        float var16 = var8 - var6;
        float var17 = var15 / (float) this.textureWidth;
        float var18 = var16 / (float) this.textureHeight;
        field31933.glTexCoord2f(var13, var14);
        field31933.glVertex2f(var1, var2);
        field31933.glTexCoord2f(var13, var14 + var18);
        field31933.glVertex2f(var1, var2 + var12);
        field31933.glTexCoord2f(var13 + var17, var14 + var18);
        field31933.glVertex2f(var1 + var11, var2 + var12);
        field31933.glTexCoord2f(var13 + var17, var14);
        field31933.glVertex2f(var1 + var11, var2);
    }

    @Override
    public int getWidth(String var1) {
        int var4 = 0;
        IntObject var5 = null;
        char var6 = '\u0000';
        if (var1 != null) {
            for (int var7 = 0; var7 < var1.length(); var7++) {
                var6 = var1.charAt(var7);
                if (var6 >= 256) {
                    var5 = (IntObject) this.customChars.get(new Character(var6));
                } else {
                    var5 = this.charArray[var6];
                }

                if (var5 != null) {
                    var4 += var5.field35435;
                }
            }

            return var4;
        } else {
            return 0;
        }
    }

    public int method23952() {
        return this.fontHeight;
    }

    @Override
    public int getHeight(String var1) {
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
    public void drawString(float var1, float var2, String var3, Color var4, int var5, int var6) {
        var4.method10392();
        this.fontTexture.bind();
        IntObject var9 = null;
        if (this.field31944 > 0) {
            var2 -= (float) (this.field31944 / 2 - 1);
            var1 -= (float) (this.field31944 - 1);
        }

        field31933.glBegin(7);
        int var10 = 0;

        for (int var11 = 0; var11 < var3.length(); var11++) {
            char var12 = var3.charAt(var11);
            if (var12 >= 256) {
                var9 = (IntObject) this.customChars.get(new Character(var12));
            } else {
                var9 = this.charArray[var12];
            }

            if (var9 != null) {
                if (var11 >= var5 || var11 <= var6) {
                    this.method23951(
                            var1 + (float) var10,
                            var2,
                            var1 + (float) var10 + (float) var9.field35434,
                            var2 + (float) var9.field35436,
                            (float) var9.field35437,
                            (float) var9.field35438,
                            (float) (var9.field35437 + var9.field35434),
                            (float) (var9.field35438 + var9.field35436)
                    );
                }

                var10 += var9.field35435;
            }
        }

        field31933.glEnd();
    }

    @Override
    public void drawString(float var1, float var2, String var3) {
        this.drawString(var1, var2, var3, Color.field16442);
    }
}
