package com.mentalfrostbyte.jello.util;

import lol.*;
import org.lwjgl.opengl.GL11;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteBuffer;

public class TextureUtil {

    public static Texture method32933(String var0, BufferedImage var1) throws IOException {
        return method32935(var0, var1, 3553, 6408, 9729, 9729);
    }

    public static Texture method32935(String var0, BufferedImage var1, int var2, int var3, int var4, int var5) {
        Class6958 var8 = new Class6958();
        int var9 = 0;
        int var10 = InternalTextureLoader.method35789();
        TextureImpl var11 = new TextureImpl(var0, var2, var10);
        Renderer.get().method18381(3553);
        Renderer.get().method18370(var2, var10);
        var11.method36182(var1.getWidth());
        var11.method36181(var1.getHeight());
        if (!var1.getColorModel().hasAlpha()) {
            var9 = 6407;
        } else {
            var9 = 6408;
        }

        ByteBuffer var13 = var8.method21470(var1, false, false, null);
        var11.method36183(var8.method21459());
        var11.method36184(var8.method21458());
        var11.method36178(var8.method21455() == 32);
        if (var2 == 3553) {
            Renderer.get().method18404(var2, 10241, var4);
            Renderer.get().method18404(var2, 10240, var5);
            if (!Renderer.get().method18416()) {
                Renderer.get().method18404(3553, 10242, 10496);
                Renderer.get().method18404(3553, 10243, 10496);
            } else {
                Renderer.get().method18404(3553, 10242, 34627);
                Renderer.get().method18404(3553, 10243, 34627);
            }
        }

        GL11.glPixelStorei(3312, 0);
        GL11.glPixelStorei(3313, 0);
        GL11.glPixelStorei(3314, 0);
        GL11.glPixelStorei(3315, 0);
        GL11.glPixelStorei(3316, 0);
        GL11.glPixelStorei(3317, 4);
        Renderer.get().method18414(var2, 0, var3, var11.getTextureWidth(), var11.getTextureHeight(), 0, var9, 5121, var13);
        return var11;
    }
}
