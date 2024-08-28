package com.mentalfrostbyte.jello.resource;

import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import mapped.Color;
import mapped.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ClientResource implements Class7427 {
    private static final SGL field31933 = Renderer.get();
    private final int field31944;
    public Texture field31939;
    private final Class8246[] field31934 = new Class8246[256];
    private final Map field31935 = new HashMap();
    private final boolean field31936;
    private int field31937 = 0;
    private int field31938 = 0;
    private int field31940 = 512;
    private int field31941 = 512;
    private final Font field31942;
    private FontMetrics field31943;

    public ClientResource(Font var1, boolean var2, char[] var3, int var4) {
        Class8748.method31562();
        this.field31942 = var1;
        this.field31937 = var1.getSize();
        this.field31936 = var2;
        this.field31944 = var4;
        if (var4 > 0) {
            this.field31940 = 1024;
            this.field31941 = 1024;
        }

        this.method23950(var3);
    }

    public ClientResource(Font var1, boolean var2, char[] var3) {
        this(var1, var2, var3, 0);
    }

    public ClientResource(Font var1, boolean var2) {
        this(var1, var2, null);
    }

    public ClientResource(Font var1, int var2) {
        this(var1, true, null, var2);
    }

    private BufferedImage method23948(char var1) {
        BufferedImage var4 = new BufferedImage(1, 1, 2);
        Graphics2D var5 = (Graphics2D) var4.getGraphics();
        if (this.field31936) {
            var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        var5.setFont(this.field31942);
        this.field31943 = var5.getFontMetrics();
        int var6 = this.field31943.charWidth(var1);
        if (var6 <= 0) {
            var6 = 1;
        }

        int var7 = this.field31943.getHeight();
        if (var7 <= 0) {
            var7 = this.field31937;
        }

        BufferedImage var8 = new BufferedImage(var6 + this.field31944 * 2, var7 + this.field31944 * 2, 2);
        Graphics2D var9 = (Graphics2D) var8.getGraphics();
        if (this.field31936) {
            var9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        var9.setFont(this.field31942);
        var9.setColor(java.awt.Color.WHITE);
        int var10 = this.field31944;
        int var11 = this.field31944;
        var9.drawString(String.valueOf(var1), var10, var11 + this.field31943.getAscent());
        return this.field31944 <= 0 ? var8 : ImageUtil.method35033(var8, this.field31944);
    }

    private int method23949(char var1) {
        BufferedImage var4 = new BufferedImage(1, 1, 2);
        Graphics2D var5 = (Graphics2D) var4.getGraphics();
        if (this.field31936) {
            var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        var5.setFont(this.field31942);
        this.field31943 = var5.getFontMetrics();
        int var6 = this.field31943.charWidth(var1);
        if (var6 <= 0) {
            var6 = 1;
        }

        return var6;
    }

    private void method23950(char[] var1) {
        if (var1 != null && var1.length > 0) {
            this.field31940 *= 2;
        }

        try {
            BufferedImage var4 = this.method23948('\u0000');
            if (var4.getHeight() > 60) {
                this.field31940 *= 2;
                this.field31941 *= 2;
            }

            BufferedImage var5 = new BufferedImage(this.field31940, this.field31941, 2);
            Graphics2D var6 = (Graphics2D) var5.getGraphics();
            var6.setColor(new java.awt.Color(255, 255, 255, 1));
            var6.fillRect(0, 0, this.field31940, this.field31941);
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = var1 != null ? var1.length : 0;

            for (int var11 = 0; var11 < 256 + var10; var11++) {
                char var12 = var11 < 256 ? (char) var11 : var1[var11 - 256];
                BufferedImage var13 = this.method23948(var12);
                Class8246 var14 = new Class8246(this);
                var14.field35434 = var13.getWidth();
                var14.field35436 = var13.getHeight();
                if (this.field31944 > 0) {
                    var14.field35435 = this.method23949(var12);
                } else {
                    var14.field35435 = var14.field35434;
                }

                if (var8 + var14.field35434 >= this.field31940) {
                    var8 = 0;
                    var9 += var7;
                    var7 = 0;
                }

                var14.field35437 = var8;
                var14.field35438 = var9;
                if (var14.field35436 > this.field31938) {
                    this.field31938 = var14.field35436;
                }

                if (var14.field35436 > var7) {
                    var7 = var14.field35436 + 1;
                }

                var6.drawImage(var13, var8, var9, null);
                var8 += var14.field35434 + 1;
                if (var11 < 256) {
                    this.field31934[var11] = var14;
                } else {
                    this.field31935.put(new Character(var12), var14);
                }

                Object var16 = null;
            }

            this.field31939 = TextureUtil.method32933(this.field31942.toString(), var5);
        } catch (IOException var15) {
            System.err.println("Failed to create font.");
            var15.printStackTrace();
        }
    }

    private void method23951(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
        float var11 = var3 - var1;
        float var12 = var4 - var2;
        float var13 = var5 / (float) this.field31940;
        float var14 = var6 / (float) this.field31941;
        float var15 = var7 - var5;
        float var16 = var8 - var6;
        float var17 = var15 / (float) this.field31940;
        float var18 = var16 / (float) this.field31941;
        field31933.method18398(var13, var14);
        field31933.method18401(var1, var2);
        field31933.method18398(var13, var14 + var18);
        field31933.method18401(var1, var2 + var12);
        field31933.method18398(var13 + var17, var14 + var18);
        field31933.method18401(var1 + var11, var2 + var12);
        field31933.method18398(var13 + var17, var14);
        field31933.method18401(var1 + var11, var2);
    }

    @Override
    public int method23942(String var1) {
        int var4 = 0;
        Class8246 var5 = null;
        char var6 = '\u0000';
        if (var1 != null) {
            for (int var7 = 0; var7 < var1.length(); var7++) {
                var6 = var1.charAt(var7);
                if (var6 >= 256) {
                    var5 = (Class8246) this.field31935.get(new Character(var6));
                } else {
                    var5 = this.field31934[var6];
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
        return this.field31938;
    }

    @Override
    public int method23941(String var1) {
        return this.field31938;
    }

    @Override
    public int method23943() {
        return this.field31938;
    }

    @Override
    public void method23937(float var1, float var2, String var3, Color var4) {
        this.method23938(var1, var2, var3, var4, 0, var3.length() - 1);
    }

    @Override
    public void method23938(float var1, float var2, String var3, Color var4, int var5, int var6) {
        var4.method10392();
        this.field31939.bind();
        Class8246 var9 = null;
        if (this.field31944 > 0) {
            var2 -= (float) (this.field31944 / 2 - 1);
            var1 -= (float) (this.field31944 - 1);
        }

        field31933.method18369(7);
        int var10 = 0;

        for (int var11 = 0; var11 < var3.length(); var11++) {
            char var12 = var3.charAt(var11);
            if (var12 >= 256) {
                var9 = (Class8246) this.field31935.get(new Character(var12));
            } else {
                var9 = this.field31934[var12];
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

        field31933.method18382();
    }

    @Override
    public void method23936(float var1, float var2, String var3) {
        this.method23937(var1, var2, var3, Color.field16442);
    }
}
