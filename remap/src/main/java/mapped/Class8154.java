// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.EXTFramebufferObject;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import java.awt.Rectangle;
import java.math.BigDecimal;
import java.nio.IntBuffer;
import java.util.Stack;

public class Class8154
{
    private static String[] field33580;
    private static final boolean field33581 = false;
    private static final Minecraft field33582;
    public static boolean field33583;
    private static Stack<IntBuffer> field33584;
    private static float field33585;
    private static float field33586;
    private static float field33587;
    
    public static void method26861(final int n, final int n2) {
    }
    
    public static float method26862(final float f, final int newScale) {
        return new BigDecimal(Float.toString(f)).setScale(newScale, 4).floatValue();
    }
    
    public static Rectangle method26863(final Rectangle rectangle, final float n, final float n2) {
        final float n3 = (float)rectangle.x;
        final float n4 = (float)rectangle.y;
        final float n5 = (float)rectangle.width;
        final float n6 = (float)rectangle.height;
        final int round = Math.round(n5 * n);
        final int round2 = Math.round(n6 * n2);
        return new Rectangle(Math.round(n3 + (n5 - round) / 4.0f), Math.round(n4 + (n6 - round2) / 6.0f), round, round2);
    }
    
    public static Rectangle method26864(final Class4803 class4803) {
        return new Rectangle(class4803.method14272(), class4803.method14274(), class4803.method14276(), class4803.method14278());
    }
    
    public static void method26865(final Class4803 class4803) {
        method26871(class4803.method14272(), class4803.method14274(), class4803.method14276() + class4803.method14272(), class4803.method14278() + class4803.method14274(), true);
    }
    
    public static float[] method26866(final int n, final int n2) {
        final FloatBuffer floatBuffer = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloatv(2982, floatBuffer);
        final float n3 = floatBuffer.get(0) * n + floatBuffer.get(4) * n2 + floatBuffer.get(8) * 0.0f + floatBuffer.get(12);
        final float n4 = floatBuffer.get(1) * n + floatBuffer.get(5) * n2 + floatBuffer.get(9) * 0.0f + floatBuffer.get(13);
        final float n5 = floatBuffer.get(3) * n + floatBuffer.get(7) * n2 + floatBuffer.get(11) * 0.0f + floatBuffer.get(15);
        return new float[] { (float)Math.round(n3 / n5 * method26867()), (float)Math.round(n4 / n5 * method26867()) };
    }
    
    public static float method26867() {
        return (float)Class8154.field33582.field4632.method7700();
    }
    
    public static void method26868(final float n, final float n2, final float n3, final float n4) {
        method26871((int)n, (int)n2, (int)n3, (int)n4, true);
    }
    
    public static void method26869(final float n, final float n2, final float n3, final float n4) {
        method26871((int)n, (int)n2, (int)n + (int)n3, (int)n2 + (int)n4, true);
    }
    
    public static void method26870(final int n, final int n2, final int n3, final int n4) {
        method26871(n, n2, n3, n4, false);
    }
    
    public static void method26871(int n, int n2, int n3, int n4, final boolean b) {
        if (!b) {
            n *= (int)Class9000.field37993;
            n2 *= (int)Class9000.field37993;
            n3 *= (int)Class9000.field37993;
            n4 *= (int)Class9000.field37993;
        }
        else {
            final float[] method26866 = method26866(n, n2);
            n = (int)method26866[0];
            n2 = (int)method26866[1];
            final float[] method26867 = method26866(n3, n4);
            n3 = (int)method26867[0];
            n4 = (int)method26867[1];
        }
        if (GL11.glIsEnabled(3089)) {
            final IntBuffer intBuffer = BufferUtils.createIntBuffer(16);
            GL11.glGetIntegerv(3088, intBuffer);
            Class8154.field33584.push(intBuffer);
            final int value = intBuffer.get(0);
            final int n5 = Minecraft.method5277().field4632.method7693() - intBuffer.get(1) - intBuffer.get(3);
            final int n6 = value + intBuffer.get(2);
            final int n7 = n5 + intBuffer.get(3);
            if (n < value) {
                n = value;
            }
            if (n2 < n5) {
                n2 = n5;
            }
            if (n3 > n6) {
                n3 = n6;
            }
            if (n4 > n7) {
                n4 = n7;
            }
            if (n2 > n4) {
                n4 = n2;
            }
            if (n > n3) {
                n3 = n;
            }
        }
        final int n8 = n;
        final int n9 = Minecraft.method5277().field4632.method7693() - n4;
        final int n10 = n3 - n;
        final int n11 = n4 - n2;
        GL11.glEnable(3089);
        if (n10 >= 0 && n11 >= 0) {
            GL11.glScissor(n8, n9, n10, n11);
        }
    }
    
    public static void method26872() {
        if (Class8154.field33584.isEmpty()) {
            GL11.glDisable(3089);
        }
        else {
            final IntBuffer intBuffer = Class8154.field33584.pop();
            GL11.glScissor(intBuffer.get(0), intBuffer.get(1), intBuffer.get(2), intBuffer.get(3));
        }
    }
    
    public static void method26873(final float field33585, final float field33586, final float field33587) {
        GL11.glScalef(Class8154.field33585 = field33585, Class8154.field33586 = field33586, Class8154.field33587 = field33587);
    }
    
    public static void method26874(final float n, final float n2, final float n3, final float n4, final int n5) {
        method26876(n, n2, n + n3, n2 + n4, n5);
    }
    
    public static void method26875(final double n, final double n2, final double n3, final double n4, final int n5) {
        method26876((float)n, (float)n2, (float)n3, (float)n4, n5);
    }
    
    public static void method26876(float n, float n2, float n3, float n4, final int n5) {
        if (n < n3) {
            final int n6 = (int)n;
            n = n3;
            n3 = (float)n6;
        }
        if (n2 < n4) {
            final int n7 = (int)n2;
            n2 = n4;
            n4 = (float)n7;
        }
        final float n8 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n10 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n11 = (n5 & 0xFF) / 255.0f;
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
        RenderSystem.method30068(n9, n10, n11, n8);
        method22695.begin(7, DefaultVertexFormats.field39614);
        method22695.pos(n, n4, 0.0).endVertex();
        method22695.pos(n3, n4, 0.0).endVertex();
        method22695.pos(n3, n2, 0.0).endVertex();
        method22695.pos(n, n2, 0.0).endVertex();
        method22694.draw();
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public static void method26877(float n, float n2, float n3, float n4, final Class6153 class6153) {
        if (n < n3) {
            final int n5 = (int)n;
            n = n3;
            n3 = (float)n5;
        }
        if (n2 < n4) {
            final int n6 = (int)n2;
            n2 = n4;
            n4 = (float)n6;
        }
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
        class6153.method18395(true);
        class6153.method18399((int)n - (int)n3, (int)n2 - (int)n4);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public static void method26878(final float n, final float n2, final float n3, final float n4, final int n5) {
        method26879(n, n2, n3, n4, 1, n5);
    }
    
    public static void method26879(final float n, final float n2, final float n3, final float n4, final int n5, final int n6) {
        method26876(n, n4 - n5, n3 - n5, n4, n6);
        method26876(n, n2, n3 - n5, n2 + n5, n6);
        method26876(n, n2 + n5, n + n5, n4 - n5, n6);
        method26876(n3 - n5, n2, n3, n4, n6);
    }
    
    public static void method26880(final double n, final double n2, final double n3, final double n4, final double n5, final int n6, final int n7) {
        method26875(n + n5, n2 + n5, n3 - n5, n4 - n5, n6);
        method26875(n + n5, n2, n3 - n5, n2 + n5, n7);
        method26875(n, n2, n + n5, n4, n7);
        method26875(n3 - n5, n2, n3, n4, n7);
        method26875(n + n5, n4 - n5, n3 - n5, n4, n7);
    }
    
    public static void method26881(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final float n7 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n8 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n10 = (n5 & 0xFF) / 255.0f;
        final float n11 = (n6 >> 24 & 0xFF) / 255.0f;
        final float n12 = (n6 >> 16 & 0xFF) / 255.0f;
        final float n13 = (n6 >> 8 & 0xFF) / 255.0f;
        final float n14 = (n6 & 0xFF) / 255.0f;
        RenderSystem.disableTexture();
        RenderSystem.enableBlend();
        RenderSystem.disableAlphaTest();
        RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
        RenderSystem.shadeModel(7425);
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        method22695.begin(7, DefaultVertexFormats.POSITION_COLOR);
        method22695.pos(n3, n2, 0.0).color(n8, n9, n10, n7).endVertex();
        method22695.pos(n, n2, 0.0).color(n8, n9, n10, n7).endVertex();
        method22695.pos(n, n4, 0.0).color(n12, n13, n14, n11).endVertex();
        method22695.pos(n3, n4, 0.0).color(n12, n13, n14, n11).endVertex();
        method22694.draw();
        RenderSystem.shadeModel(7424);
        RenderSystem.disableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableTexture();
    }
    
    public static void method26882(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final float n9 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n10 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n11 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n12 = (n5 & 0xFF) / 255.0f;
        final float n13 = (n6 >> 24 & 0xFF) / 255.0f;
        final float n14 = (n6 >> 16 & 0xFF) / 255.0f;
        final float n15 = (n6 >> 8 & 0xFF) / 255.0f;
        final float n16 = (n6 & 0xFF) / 255.0f;
        final float n17 = (n7 >> 24 & 0xFF) / 255.0f;
        final float n18 = (n7 >> 16 & 0xFF) / 255.0f;
        final float n19 = (n7 >> 8 & 0xFF) / 255.0f;
        final float n20 = (n7 & 0xFF) / 255.0f;
        final float n21 = (n8 >> 24 & 0xFF) / 255.0f;
        final float n22 = (n8 >> 16 & 0xFF) / 255.0f;
        final float n23 = (n8 >> 8 & 0xFF) / 255.0f;
        final float n24 = (n8 & 0xFF) / 255.0f;
        RenderSystem.disableTexture();
        RenderSystem.enableBlend();
        RenderSystem.disableAlphaTest();
        RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
        RenderSystem.shadeModel(7425);
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        method22695.begin(7, DefaultVertexFormats.POSITION_COLOR);
        method22695.pos(n3, n2, 0.0).color(n14, n15, n16, n13).endVertex();
        method22695.pos(n, n2, 0.0).color(n10, n11, n12, n9).endVertex();
        method22695.pos(n, n4, 0.0).color(n22, n23, n24, n21).endVertex();
        method22695.pos(n3, n4, 0.0).color(n18, n19, n20, n17).endVertex();
        method22694.draw();
        RenderSystem.shadeModel(7424);
        RenderSystem.disableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableTexture();
    }
    
    public static void method26883(final float n, final float n2, final float n3, final float n4, final int n5, final float n6) {
        RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glLineWidth(n6);
        final float n7 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n8 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n10 = (n5 & 0xFF) / 255.0f;
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.method30016(770, 771, 1, 0);
        RenderSystem.method30068(n8, n9, n10, n7);
        GL11.glEnable(2848);
        method22695.begin(1, DefaultVertexFormats.POSITION_COLOR);
        method22695.pos(n, n2, 0.0);
        method22695.pos(n3, n4, 0.0);
        method22694.draw();
        GL11.glDisable(2848);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public static void method26884(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final int n7) {
        RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        final float n8 = (n7 >> 24 & 0xFF) / 255.0f;
        final float n9 = (n7 >> 16 & 0xFF) / 255.0f;
        final float n10 = (n7 >> 8 & 0xFF) / 255.0f;
        final float n11 = (n7 & 0xFF) / 255.0f;
        Tessellator.getInstance().getBuffer();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.method30016(770, 771, 1, 0);
        RenderSystem.method30068(n9, n10, n11, n8);
        GL11.glBegin(6);
        GL11.glVertex2f(n, n2);
        GL11.glVertex2f(n5, n6);
        GL11.glVertex2f(n3, n4);
        GL11.glVertex2f(n, n2);
        GL11.glEnd();
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public static void method26885(final float n, final float n2, final float n3, final int n4, final int n5) {
        RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        Tessellator.getInstance().getBuffer();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.method30016(770, 771, 1, 0);
        GL11.glColor4fv(Class6430.method19139(n4));
        GL11.glEnable(2881);
        GL11.glBegin(4);
        GL11.glVertex2f(n + n3 / 2.0f, n2 + n3 / 2.0f);
        GL11.glVertex2f(n + n3 / 2.0f, n2 - n3 / 2.0f);
        GL11.glVertex2f(n - n3 / 2.0f, n2);
        GL11.glEnd();
        GL11.glLineWidth(2.0f);
        GL11.glColor4fv(Class6430.method19139(n5));
        GL11.glBegin(3);
        GL11.glVertex2f(n + n3 / 2.0f, n2 + n3 / 2.0f);
        GL11.glVertex2f(n + n3 / 2.0f, n2 - n3 / 2.0f);
        GL11.glEnd();
        GL11.glBegin(3);
        GL11.glVertex2f(n - n3 / 2.0f, n2);
        GL11.glVertex2f(n + n3 / 2.0f, n2 - n3 / 2.0f);
        GL11.glEnd();
        GL11.glBegin(3);
        GL11.glVertex2f(n + n3 / 2.0f, n2 + n3 / 2.0f);
        GL11.glVertex2f(n - n3 / 2.0f, n2);
        GL11.glEnd();
        GL11.glDisable(2881);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public static void method26886(final float n, final float n2, final float n3, final int n4) {
        method26895(n, n2, 0.0f, 360.0f, n3 - 1.0f, n4);
    }
    
    public static void method26887(final float n, final float n2, final float n3, final float n4, final int n5) {
        method26896(n, n2, 0.0f, 360.0f, n3 - 1.0f, n4 - 1.0f, n5);
    }
    
    public static void method26888(final float n, final float n2, final float n3, final int n4) {
        RenderSystem.method30068(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        final float n5 = (n4 >> 24 & 0xFF) / 255.0f;
        final float n6 = (n4 >> 16 & 0xFF) / 255.0f;
        final float n7 = (n4 >> 8 & 0xFF) / 255.0f;
        final float n8 = (n4 & 0xFF) / 255.0f;
        Tessellator.getInstance().getBuffer();
        RenderSystem.disableTexture();
        RenderSystem.method30016(770, 771, 1, 0);
        RenderSystem.method30068(n6, n7, n8, n5);
        GL11.glEnable(2832);
        GL11.glEnable(3042);
        GL11.glPointSize(n3 * Class9000.field37993);
        GL11.glBegin(0);
        GL11.glVertex2f(n, n2);
        GL11.glEnd();
        GL11.glDisable(2832);
        GL11.glDisable(3042);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public static void method26889(final Class7524 class7524, final float n, final float n2, final String s, final int n3) {
        method26891(class7524, n, n2, s, n3, Class2056.field11734, Class2056.field11735, false);
    }
    
    public static void method26890(final Class7524 class7524, final float n, final float n2, final String s, final int n3, final Class2056 class7525, final Class2056 class7526) {
        method26891(class7524, n, n2, s, n3, class7525, class7526, false);
    }
    
    public static void method26891(Class7524 class7524, final float n, final float n2, final String s, final int n3, final Class2056 class7525, final Class2056 class7526, final boolean b) {
        RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        int n4 = 0;
        int n5 = 0;
        switch (Class9090.field38496[class7525.ordinal()]) {
            case 1: {
                n4 = -class7524.method23505(s) / 2;
                break;
            }
            case 2: {
                n4 = -class7524.method23505(s);
                break;
            }
        }
        switch (Class9090.field38496[class7526.ordinal()]) {
            case 1: {
                n5 = -class7524.method23506(s) / 2;
                break;
            }
            case 3: {
                n5 = -class7524.method23506(s);
                break;
            }
        }
        final float n6 = (n3 >> 24 & 0xFF) / 255.0f;
        final float n7 = (n3 >> 16 & 0xFF) / 255.0f;
        final float n8 = (n3 >> 8 & 0xFF) / 255.0f;
        final float n9 = (n3 & 0xFF) / 255.0f;
        GL11.glPushMatrix();
        boolean b2 = false;
        if (Class9000.field37993 == 2.0) {
            if (class7524 == Class9400.field40313) {
                class7524 = Class9400.field40315;
            }
            else if (class7524 == Class9400.field40314) {
                class7524 = Class9400.field40316;
            }
            else if (class7524 == Class9400.field40310) {
                class7524 = Class9400.field40318;
            }
            else if (class7524 == Class9400.field40311) {
                class7524 = Class9400.field40317;
            }
            else if (class7524 == Class9400.field40312) {
                class7524 = Class9400.field40319;
            }
            else if (class7524 == Class9400.field40320) {
                class7524 = Class9400.field40321;
            }
            else if (class7524 == Class9400.field40323) {
                class7524 = Class9400.field40325;
            }
            else if (class7524 == Class9400.field40324) {
                class7524 = Class9400.field40326;
            }
            else {
                b2 = true;
            }
            if (!b2) {
                final float[] method26866 = method26866((int)n, (int)n2);
                final int n10 = (int)method26866[0];
                final int n11 = (int)method26866[1];
                GL11.glTranslatef(n, n2, 0.0f);
                GL11.glScalef(1.0f / Class9000.field37993, 1.0f / Class9000.field37993, 1.0f / Class9000.field37993);
                GL11.glTranslatef(-n, -n2, 0.0f);
                n4 *= (int)Class9000.field37993;
                n5 *= (int)Class9000.field37993;
            }
        }
        RenderSystem.enableBlend();
        GL11.glBlendFunc(770, 771);
        if (b) {
            class7524.method23501((float)Math.round(n + n4), (float)(Math.round(n2 + n5) + 2), s, new Class2427(0.0f, 0.0f, 0.0f, 0.35f));
        }
        if (s != null) {
            class7524.method23501((float)Math.round(n + n4), (float)Math.round(n2 + n5), s, new Class2427(n7, n8, n9, n6));
        }
        RenderSystem.disableBlend();
        GL11.glPopMatrix();
    }
    
    public static void method26892(final Class7522 class7522, final float n, final float n2, final String s, final int n3) {
        method26894(class7522, n, n2, s, n3, Class2056.field11734, Class2056.field11735, false);
    }
    
    public static void method26893(final Class7522 class7522, final float n, final float n2, final String s, final int n3, final Class2056 class7523, final Class2056 class7524) {
        method26894(class7522, n, n2, s, n3, class7523, class7524, false);
    }
    
    public static void method26894(final Class7522 class7522, final float n, final float n2, final String s, final int n3, final Class2056 class7523, final Class2056 class7524, final boolean b) {
        RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        int n4 = 0;
        int n5 = 0;
        switch (Class9090.field38496[class7523.ordinal()]) {
            case 1: {
                n4 = -class7522.method23505(s) / 2;
                break;
            }
            case 2: {
                n4 = -class7522.method23505(s);
                break;
            }
        }
        switch (Class9090.field38496[class7524.ordinal()]) {
            case 1: {
                n5 = -class7522.method23506(s) / 2;
                break;
            }
            case 3: {
                n5 = -class7522.method23506(s);
                break;
            }
        }
        final float n6 = (n3 >> 24 & 0xFF) / 255.0f;
        final float n7 = (n3 >> 16 & 0xFF) / 255.0f;
        final float n8 = (n3 >> 8 & 0xFF) / 255.0f;
        final float n9 = (n3 & 0xFF) / 255.0f;
        RenderSystem.enableBlend();
        GL11.glBlendFunc(770, 771);
        Class7777.method24930();
        class7522.method23501((float)Math.round(n + n4), (float)Math.round(n2 + n5), s, new Class2427(n7, n8, n9, n6));
        RenderSystem.disableBlend();
    }
    
    public static void method26895(final float n, final float n2, final float n3, final float n4, final float n5, final int n6) {
        method26896(n, n2, n3, n4, n5, n5, n6);
    }
    
    public static void method26896(final float n, final float n2, float n3, float n4, final float n5, final float n6, final int n7) {
        RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        if (n3 > n4) {
            final float n8 = n4;
            n4 = n3;
            n3 = n8;
        }
        final float n9 = (n7 >> 24 & 0xFF) / 255.0f;
        final float n10 = (n7 >> 16 & 0xFF) / 255.0f;
        final float n11 = (n7 >> 8 & 0xFF) / 255.0f;
        final float n12 = (n7 & 0xFF) / 255.0f;
        Tessellator.getInstance().getBuffer();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.method30016(770, 771, 1, 0);
        RenderSystem.method30068(n10, n11, n12, n9);
        if (n9 > 0.5f) {
            GL11.glEnable(2848);
            GL11.glLineWidth(2.0f);
            GL11.glBegin(3);
            for (float n13 = n4; n13 >= n3; n13 -= 4.0f) {
                GL11.glVertex2f(n + (float)Math.cos(n13 * 3.141592653589793 / 180.0) * (n5 * 1.001f), n2 + (float)Math.sin(n13 * 3.141592653589793 / 180.0) * (n6 * 1.001f));
            }
            GL11.glEnd();
            GL11.glDisable(2848);
        }
        GL11.glBegin(6);
        for (float n14 = n4; n14 >= n3; n14 -= 4.0f) {
            GL11.glVertex2f(n + (float)Math.cos(n14 * 3.141592653589793 / 180.0) * n5, n2 + (float)Math.sin(n14 * 3.141592653589793 / 180.0) * n6);
        }
        GL11.glEnd();
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public static void method26897(final float n, final float n2, final float[] array, final float[] array2, final int n3) {
        RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        final float n4 = (n3 >> 24 & 0xFF) / 255.0f;
        final float n5 = (n3 >> 16 & 0xFF) / 255.0f;
        final float n6 = (n3 >> 8 & 0xFF) / 255.0f;
        final float n7 = (n3 & 0xFF) / 255.0f;
        Tessellator.getInstance().getBuffer();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.method30016(770, 771, 1, 0);
        RenderSystem.method30068(n5, n6, n7, n4);
        GL11.glBegin(6);
        for (int i = array.length - 1; i >= 0; --i) {
            GL11.glVertex2f(n + array[i], n2 + array2[i]);
        }
        GL11.glEnd();
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public static void method26898(final float n, final float n2, final float n3, final float n4, final Class7776 class7776, final int n5) {
        method26902(n, n2, n3, n4, class7776, n5, 0.0f, 0.0f, (float)class7776.method24918(), (float)class7776.method24917(), true);
        method26902(n, n2, n3, n4, class7776, n5, 0.0f, 0.0f, (float)class7776.method24918(), (float)class7776.method24917(), false);
    }
    
    public static void method26899(final float n, final float n2, final float n3, final float n4, final Class7776 class7776, final int n5) {
        method26902(n, n2, n3, n4, class7776, n5, 0.0f, 0.0f, (float)class7776.method24918(), (float)class7776.method24917(), true);
    }
    
    public static void method26900(final float n, final float n2, final float n3, final float n4, final Class7776 class7776, final int n5, final boolean b) {
        method26902(n, n2, n3, n4, class7776, n5, 0.0f, 0.0f, (float)class7776.method24918(), (float)class7776.method24917(), b);
    }
    
    public static void method26901(final float n, final float n2, final float n3, final float n4, final Class7776 class7776, final int n5, final float n6, final float n7, final float n8, final float n9) {
        method26902(n, n2, n3, n4, class7776, n5, n6, n7, n8, n9, true);
    }
    
    public static void method26902(float a, float a2, float a3, float a4, final Class7776 class7776, final int n, final float n2, final float n3, final float n4, final float n5, final boolean b) {
        if (class7776 != null) {
            RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
            GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
            a = (float)Math.round(a);
            a3 = (float)Math.round(a3);
            a2 = (float)Math.round(a2);
            a4 = (float)Math.round(a4);
            final float n6 = (n >> 24 & 0xFF) / 255.0f;
            final float n7 = (n >> 16 & 0xFF) / 255.0f;
            final float n8 = (n >> 8 & 0xFF) / 255.0f;
            final float n9 = (n & 0xFF) / 255.0f;
            RenderSystem.enableBlend();
            RenderSystem.disableTexture();
            RenderSystem.method30016(770, 771, 1, 0);
            RenderSystem.method30068(n7, n8, n9, n6);
            GL11.glEnable(3042);
            GL11.glEnable(3553);
            class7776.method24916();
            final float n10 = a3 / class7776.method24922() / (a3 / class7776.method24918());
            final float n11 = a4 / class7776.method24921() / (a4 / class7776.method24917());
            final float n12 = n4 / class7776.method24918() * n10;
            final float n13 = n5 / class7776.method24917() * n11;
            final float n14 = n2 / class7776.method24918() * n10;
            final float n15 = n3 / class7776.method24917() * n11;
            if (!b) {
                GL11.glTexParameteri(3553, 10240, 9729);
            }
            else {
                GL11.glTexParameteri(3553, 10240, 9728);
            }
            GL11.glBegin(7);
            GL11.glTexCoord2f(n14, n15);
            GL11.glVertex2f(a, a2);
            GL11.glTexCoord2f(n14, n15 + n13);
            GL11.glVertex2f(a, a2 + a4);
            GL11.glTexCoord2f(n14 + n12, n15 + n13);
            GL11.glVertex2f(a + a3, a2 + a4);
            GL11.glTexCoord2f(n14 + n12, n15);
            GL11.glVertex2f(a + a3, a2);
            GL11.glEnd();
            GL11.glDisable(3553);
            GL11.glDisable(3042);
            RenderSystem.enableTexture();
            RenderSystem.disableBlend();
        }
    }
    
    public static void method26903(float a, float a2, float a3, float a4, final ByteBuffer byteBuffer, final int n, final float n2, final float n3, final float n4, final float n5, final boolean b, final boolean b2) {
        if (byteBuffer != null) {
            RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
            GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
            a = (float)Math.round(a);
            a3 = (float)Math.round(a3);
            a2 = (float)Math.round(a2);
            a4 = (float)Math.round(a4);
            final float n6 = (n >> 24 & 0xFF) / 255.0f;
            final float n7 = (n >> 16 & 0xFF) / 255.0f;
            final float n8 = (n >> 8 & 0xFF) / 255.0f;
            final float n9 = (n & 0xFF) / 255.0f;
            RenderSystem.enableBlend();
            RenderSystem.disableTexture();
            RenderSystem.method30016(770, 771, 1, 0);
            RenderSystem.method30068(n7, n8, n9, n6);
            GL11.glEnable(3042);
            GL11.glEnable(3553);
            GL11.glPixelStorei(3312, 0);
            GL11.glPixelStorei(3313, 0);
            GL11.glPixelStorei(3314, 0);
            GL11.glPixelStorei(3315, 0);
            GL11.glPixelStorei(3316, 0);
            GL11.glPixelStorei(3317, 4);
            GL11.glTexParameteri(3553, 10240, 9728);
            GL11.glGenTextures();
            GL11.glTexImage2D(3553, 0, 6407, (int)n4, (int)n5, 0, 6407, 5121, byteBuffer);
            final float n10 = n4 / n4 * 1.0f;
            final float n11 = n5 / n5 * 1.0f;
            final float n12 = n2 / n4 * 1.0f;
            final float n13 = n3 / n5 * 1.0f;
            GL11.glBegin(7);
            GL11.glTexCoord2f(n12 + (b ? n10 : 0.0f), n13 + (b2 ? n11 : 0.0f));
            GL11.glVertex2f(a, a2);
            GL11.glTexCoord2f(n12 + (b ? n10 : 0.0f), n13 + (b2 ? 0.0f : n11));
            GL11.glVertex2f(a, a2 + a4);
            GL11.glTexCoord2f(n12 + (b ? 0.0f : n10), n13 + (b2 ? 0.0f : n11));
            GL11.glVertex2f(a + a3, a2 + a4);
            GL11.glTexCoord2f(n12 + (b ? 0.0f : n10), n13 + (b2 ? n11 : 0.0f));
            GL11.glVertex2f(a + a3, a2);
            GL11.glEnd();
            GL11.glDisable(3553);
            GL11.glDisable(3042);
            RenderSystem.enableTexture();
            RenderSystem.disableBlend();
        }
    }
    
    public static void method26904(final float n, final float n2, final float n3, final float n4, final Class7776 class7776, final float n5) {
        method26899(n, n2, n3, n4, class7776, Class6430.method19118(Class265.field1278.field1292, n5));
    }
    
    public static void method26905(final float n, final float n2, final float n3, final float n4, final Class7776 class7776) {
        method26899(n, n2, n3, n4, class7776, -1);
    }
    
    public static void method26906(final float n, final float n2, final float n3, final float n4, final Class7776 class7776, final float n5, final float n6, final float n7, final float n8) {
        GL11.glPushMatrix();
        GL11.glTranslatef(n + n3 / 2.0f, n2 + n4 / 2.0f, 0.0f);
        GL11.glRotatef(n5, n6, n7, n8);
        GL11.glTranslatef(-n - n3 / 2.0f, -n2 - n4 / 2.0f, 0.0f);
        method26905(n, n2, n3, n4, class7776);
        GL11.glPopMatrix();
    }
    
    public static void method26907(float a, float a2, float a3, float a4, final int n, final float n2, final float n3, final float n4, final float n5) {
        RenderSystem.method30068(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        a = (float)Math.round(a);
        a3 = (float)Math.round(a3);
        a2 = (float)Math.round(a2);
        a4 = (float)Math.round(a4);
        final float n6 = (n >> 24 & 0xFF) / 255.0f;
        final float n7 = (n >> 16 & 0xFF) / 255.0f;
        final float n8 = (n >> 8 & 0xFF) / 255.0f;
        final float n9 = (n & 0xFF) / 255.0f;
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.method30016(770, 771, 1, 0);
        RenderSystem.method30068(n7, n8, n9, n6);
        GL11.glEnable(3042);
        GL11.glEnable(3553);
        GL11.glPixelStorei(3312, 0);
        GL11.glPixelStorei(3313, 0);
        GL11.glPixelStorei(3314, 0);
        GL11.glPixelStorei(3315, 0);
        GL11.glPixelStorei(3316, 0);
        GL11.glPixelStorei(3317, 4);
        GL11.glGenTextures();
        final float n10 = n4 / n4 * 1.0f;
        final float n11 = n5 / n5 * 1.0f;
        final float n12 = n2 / n4 * 1.0f;
        final float n13 = n3 / n5 * 1.0f;
        GL11.glBegin(7);
        GL11.glTexCoord2f(n12, n13);
        GL11.glVertex2f(a, a2);
        GL11.glTexCoord2f(n12, n13 + n11);
        GL11.glVertex2f(a, a2 + a4);
        GL11.glTexCoord2f(n12 + n10, n13 + n11);
        GL11.glVertex2f(a + a3, a2 + a4);
        GL11.glTexCoord2f(n12 + n10, n13);
        GL11.glVertex2f(a + a3, a2);
        GL11.glEnd();
        GL11.glDisable(3553);
        GL11.glDisable(3042);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
    
    public static void method26908(final float n, final float n2, final float n3, final int n4) {
        final float n5 = System.nanoTime() / 5000000.0f % 360.0f;
        for (int i = 0; i < 360; i += (int)51.42857f) {
            method26886(n + (float)Math.cos((i + n5) * 3.141592653589793 / 180.0) * n3, n2 + (float)Math.sin((i + n5) * 3.141592653589793 / 180.0) * n3, n3 / 4.0f, n4);
        }
    }
    
    public static void method26909(final Class7644 class7644, final int n) {
        if (class7644 != null) {
            GL11.glColor4f((n >> 16 & 0xFF) / 255.0f, (n >> 8 & 0xFF) / 255.0f, (n & 0xFF) / 255.0f, (n >> 24 & 0xFF) / 255.0f);
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glLineWidth(1.8f * Class9000.field37993);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(2848);
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30366);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30366);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30366);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30366);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30363);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30363);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30366);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30366);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30366);
            GL11.glEnd();
            GL11.glBegin(7);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30366);
            GL11.glEnd();
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
        }
    }
    
    public static void method26910(final Class7644 class7644, final int n, final float n2) {
        if (class7644 != null) {
            GL11.glColor4f((n >> 16 & 0xFF) / 255.0f, (n >> 8 & 0xFF) / 255.0f, (n & 0xFF) / 255.0f, (n >> 24 & 0xFF) / 255.0f);
            GL11.glPointSize(n2);
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glLineWidth(1.8f * Class9000.field37993);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(2848);
            GL11.glBegin(0);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30366);
            GL11.glEnd();
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
        }
    }
    
    public static void method26911(final Class7644 class7644, final int n) {
        method26912(class7644, 2.8f, n);
    }
    
    public static void method26912(final Class7644 class7644, final float n, final int n2) {
        if (class7644 != null) {
            GL11.glColor4f((n2 >> 16 & 0xFF) / 255.0f, (n2 >> 8 & 0xFF) / 255.0f, (n2 & 0xFF) / 255.0f, (n2 >> 24 & 0xFF) / 255.0f);
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glLineWidth(n);
            GL11.glEnable(2848);
            GL11.glEnable(3042);
            GL11.glBegin(3);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glEnd();
            GL11.glBegin(3);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glEnd();
            GL11.glBegin(1);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30363);
            GL11.glVertex3d(class7644.field30364, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30364, class7644.field30365, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30362, class7644.field30366);
            GL11.glVertex3d(class7644.field30361, class7644.field30365, class7644.field30366);
            GL11.glEnd();
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
        }
    }
    
    public static void method26913(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        GL11.glAlphaFunc(519, 0.0f);
        final int method19118 = Class6430.method19118(Class265.field1278.field1292, n6);
        method26899(n - n5, n2 - n5, n5, n5, Class7853.field32173, method19118);
        method26899(n + n3, n2 - n5, n5, n5, Class7853.field32174, method19118);
        method26899(n - n5, n2 + n4, n5, n5, Class7853.field32175, method19118);
        method26899(n + n3, n2 + n4, n5, n5, Class7853.field32176, method19118);
        method26900(n - n5, n2, n5, n4, Class7853.field32169, method19118, false);
        method26900(n + n3, n2, n5, n4, Class7853.field32170, method19118, false);
        method26900(n, n2 - n5, n3, n5, Class7853.field32171, method19118, false);
        method26900(n, n2 + n4, n3, n5, Class7853.field32172, method19118, false);
    }
    
    public static void method26914(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final int method19118 = Class6430.method19118(Class265.field1278.field1292, n6);
        method26900(n, n2, n5, n4, Class7853.field32170, method19118, false);
        method26900(n + n3 - n5, n2, n5, n4, Class7853.field32169, method19118, false);
        method26900(n, n2, n3, n5, Class7853.field32172, method19118, false);
        method26900(n, n2 + n4 - n5, n3, n5, Class7853.field32171, method19118, false);
    }
    
    public static void method26915(final int n, final int n2, final int n3, final int n4, final int n5) {
        method26916(n, n2, n3, n4, n5, n, n2);
    }
    
    public static void method26916(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n8 = 36;
        final int n9 = 10;
        final int n10 = n8 - n9;
        method26876((float)(n + n9), (float)(n2 + n9), (float)(n + n3 - n9), (float)(n2 + n4 - n9), n5);
        method26899((float)(n - n10), (float)(n2 - n10), (float)n8, (float)n8, Class7853.field32195, n5);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(n + n3 - n8 / 2), (float)(n2 + n8 / 2), 0.0f);
        GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n - n3 - n8 / 2), (float)(-n2 - n8 / 2), 0.0f);
        method26899((float)(n + n3 - n10), (float)(n2 - n10), (float)n8, (float)n8, Class7853.field32195, n5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(n + n3 - n8 / 2), (float)(n2 + n4 + n8 / 2), 0.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n - n3 - n8 / 2), (float)(-n2 - n4 - n8 / 2), 0.0f);
        method26899((float)(n + n3 - n10), (float)(n2 + n9 + n4), (float)n8, (float)n8, Class7853.field32195, n5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(n - n8 / 2), (float)(n2 + n4 + n8 / 2), 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n - n8 / 2), (float)(-n2 - n4 - n8 / 2), 0.0f);
        method26899((float)(n + n9), (float)(n2 + n9 + n4), (float)n8, (float)n8, Class7853.field32195, n5);
        GL11.glPopMatrix();
        method26870(n6 - n8, n7 + n9, n6 - n10 + n8, n7 - n9 + n4);
        for (int i = 0; i < n4; i += n8) {
            method26899((float)(n - n10), (float)(n2 + n9 + i), (float)n8, (float)n8, Class7853.field32194, n5);
        }
        method26872();
        method26870(n6, n7 - n10, n6 + n3 - n9, n7 + n9);
        for (int j = 0; j < n3; j += n8) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(n + n8 / 2), (float)(n2 + n8 / 2), 0.0f);
            GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-n - n8 / 2), (float)(-n2 - n8 / 2), 0.0f);
            method26899((float)(n - n10), (float)(n2 - n9 - j), (float)n8, (float)n8, Class7853.field32194, n5);
            GL11.glPopMatrix();
        }
        method26872();
        method26870(n6 + n3 - n9, n7 - n10, n + n3 + n10, n7 + n4 - n9);
        for (int k = 0; k < n4; k += n8) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(n + n8 / 2), (float)(n2 + n8 / 2), 0.0f);
            GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-n - n8 / 2), (float)(-n2 - n8 / 2), 0.0f);
            method26899((float)(n - n3 + n9), (float)(n2 - n9 - k), (float)n8, (float)n8, Class7853.field32194, n5);
            GL11.glPopMatrix();
        }
        method26872();
        method26870(n6 - n9, n7 - n10 + n4 - n8, n6 + n3 - n9, n7 + n4 + n9 * 2);
        for (int l = 0; l < n3; l += n8) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(n + n8 / 2), (float)(n2 + n8 / 2), 0.0f);
            GL11.glRotatef(270.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-n - n8 / 2), (float)(-n2 - n8 / 2), 0.0f);
            method26899((float)(n - n4 + n9), (float)(n2 + n9 + l), (float)n8, (float)n8, Class7853.field32194, n5);
            GL11.glPopMatrix();
        }
        method26872();
    }
    
    public static void method26917(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = 36;
        final int n7 = 10;
        final int n8 = n6 - n7;
        method26876((float)(n + n7), (float)(n2 + n7), (float)(n + n3 - n7), (float)(n2 + n4 - n7), n5);
        method26899((float)(n - n8), (float)(n2 - n8), (float)n6, (float)n6, Class7853.field32195, n5);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(n + n3 - n6 / 2), (float)(n2 + n6 / 2), 0.0f);
        GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n - n3 - n6 / 2), (float)(-n2 - n6 / 2), 0.0f);
        method26899((float)(n + n3 - n8), (float)(n2 - n8), (float)n6, (float)n6, Class7853.field32195, n5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(n + n3 - n6 / 2), (float)(n2 + n4 + n6 / 2), 0.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n - n3 - n6 / 2), (float)(-n2 - n4 - n6 / 2), 0.0f);
        method26899((float)(n + n3 - n8), (float)(n2 + n7 + n4), (float)n6, (float)n6, Class7853.field32195, n5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(n - n6 / 2), (float)(n2 + n4 + n6 / 2), 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n - n6 / 2), (float)(-n2 - n4 - n6 / 2), 0.0f);
        method26899((float)(n + n7), (float)(n2 + n7 + n4), (float)n6, (float)n6, Class7853.field32195, n5);
        GL11.glPopMatrix();
        method26871(n - n6, n2 + n7, n - n8 + n6, n2 - n7 + n4, true);
        for (int i = 0; i < n4; i += n6) {
            method26899((float)(n - n8), n2 + n7 + i - 0.4f, (float)n6, n6 + 0.4f, Class7853.field32194, n5);
        }
        method26872();
        method26871(n, n2 - n8, n + n3 - n7, n2 + n7, true);
        for (int j = 0; j < n3; j += n6) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(n + n6 / 2), (float)(n2 + n6 / 2), 0.0f);
            GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-n - n6 / 2), (float)(-n2 - n6 / 2), 0.0f);
            method26899((float)(n - n8), n2 - n7 - j - 0.4f, (float)n6, n6 + 0.4f, Class7853.field32194, n5);
            GL11.glPopMatrix();
        }
        method26872();
        method26871(n + n3 - n7, n2 - n8, n + n3 + n8, n2 + n4 - n7, true);
        for (int k = 0; k < n4; k += n6) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(n + n6 / 2), (float)(n2 + n6 / 2), 0.0f);
            GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-n - n6 / 2), (float)(-n2 - n6 / 2), 0.0f);
            method26899((float)(n - n3 + n7), n2 - n7 - k - 0.4f, (float)n6, n6 + 0.4f, Class7853.field32194, n5);
            GL11.glPopMatrix();
        }
        method26872();
        method26871(n - n7, n2 - n8 + n4 - n6, n + n3 - n7, n2 + n4 + n7 * 2, true);
        for (int l = 0; l < n3; l += n6) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(n + n6 / 2), (float)(n2 + n6 / 2), 0.0f);
            GL11.glRotatef(270.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-n - n6 / 2), (float)(-n2 - n6 / 2), 0.0f);
            method26899((float)(n - n4 + n7), n2 + n7 + l - 0.4f, (float)n6, n6 + 0.4f, Class7853.field32194, n5);
            GL11.glPopMatrix();
        }
        method26872();
    }
    
    public static void method26918() {
        final Class6153 method5234 = Minecraft.method5277().method5234();
        if (method5234 != null) {
            if (method5234.field24891 > -1) {
                method26919(method5234);
                method5234.field24891 = -1;
            }
        }
    }
    
    public static void method26919(final Class6153 class6153) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT(class6153.field24891);
        final int glGenRenderbuffersEXT = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT(36161, glGenRenderbuffersEXT);
        EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, Minecraft.method5277().field4632.method7692(), Minecraft.method5277().field4632.method7693());
        EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, glGenRenderbuffersEXT);
        EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, glGenRenderbuffersEXT);
    }
    
    public static void method26920(final float n, final float n2, final float n3) {
        method26926();
        method26888(n, n2, n3 * 2.0f, -1);
        method26927(Class2225.field13694);
    }
    
    public static void method26921(final float n, final float n2, final float n3, final float n4, final float n5) {
        method26926();
        method26922(n, n2, n3, n4, n5, -1);
        method26927(Class2225.field13694);
    }
    
    public static void method26922(final float n, final float n2, final float n3, final float n4, final float n5, final int n6) {
        method26886(n + n5, n2 + n5, n5, n6);
        method26886(n - n5 + n3, n2 + n5, n5, n6);
        method26886(n + n5, n2 - n5 + n4, n5, n6);
        method26886(n - n5 + n3, n2 - n5 + n4, n5, n6);
        method26876(n, n2 + n5, n + n3, n2 + n4 - n5, n6);
        method26876(n + n5, n2, n + n3 - n5, n2 + n4, n6);
    }
    
    public static void method26923(final float n, final float n2, final float n3, final float n4, final float n5, final int n6) {
        method26876(n, n2 + n5, n + n3, n2 + n4 - n5, n6);
        method26876(n + n5, n2, n + n3 - n5, n2 + n5, n6);
        method26876(n + n5, n2 + n4 - n5, n + n3 - n5, n2 + n4, n6);
        final float n7 = n5 * Class9000.field37993;
        method26868(n, n2, n + n5, n2 + n5);
        method26886(n + n5, n2 + n5, n5, n6);
        method26872();
        method26868(n + n3 - n5, n2, n + n3, n2 + n5);
        method26886(n - n5 + n3, n2 + n5, n5, n6);
        method26872();
        method26868(n, n2 + n4 - n5, n + n5, n2 + n4);
        method26886(n + n5, n2 - n5 + n4, n5, n6);
        method26872();
        method26868(n + n3 - n5, n2 + n4 - n5, n + n3, n2 + n4);
        method26886(n - n5 + n3, n2 - n5 + n4, n5, n6);
        method26872();
    }
    
    public static void method26924(final float n, final float n2, final float n3, final float n4, final float n5, final int n6) {
        method26876(n, n2 + n5, n + n3, n2 + n4 - n5, n6);
        method26876(n + n5, n2, n + n3 - n5, n2 + n4, n6);
        GL11.glGetFloatv(2982, BufferUtils.createFloatBuffer(16));
        final float n7 = 1.0f;
        method26888(n + n5, n2 + n5, n5 * 2.0f * n7, n6);
        method26888(n - n5 + n3, n2 + n5, n5 * 2.0f * n7, n6);
        method26888(n + n5, n2 - n5 + n4, n5 * 2.0f * n7, n6);
        method26888(n - n5 + n3, n2 - n5 + n4, n5 * 2.0f * n7, n6);
    }
    
    public static void method26925(final float n, final float n2, final float n3, final float n4, final float n5, final int n6) {
        method26876(n, n2 + n5, n + n3, n2 + n4 - n5, n6);
        method26876(n + n5, n2, n + n3 - n5, n2 + n5, n6);
        method26876(n + n5, n2 + n4 - n5, n + n3 - n5, n2 + n4, n6);
        method26868(n, n2, n + n5, n2 + n5);
        method26888(n + n5, n2 + n5, n5 * 2.0f, n6);
        method26872();
        method26868(n + n3 - n5, n2, n + n3, n2 + n5);
        method26888(n - n5 + n3, n2 + n5, n5 * 2.0f, n6);
        method26872();
        method26868(n, n2 + n4 - n5, n + n5, n2 + n4);
        method26888(n + n5, n2 - n5 + n4, n5 * 2.0f, n6);
        method26872();
        method26868(n + n3 - n5, n2 + n4 - n5, n + n3, n2 + n4);
        method26888(n - n5 + n3, n2 - n5 + n4, n5 * 2.0f, n6);
        method26872();
    }
    
    public static void method26926() {
        GL11.glPushMatrix();
        method26918();
        GL11.glEnable(2960);
        GL11.glColorMask(false, false, false, false);
        GL11.glDepthMask(false);
        GL11.glStencilFunc(512, 1, 1);
        GL11.glStencilOp(7681, 7680, 7680);
        GL11.glStencilMask(1);
        GL11.glClear(1024);
        Class8154.field33583 = true;
    }
    
    public static void method26927(final Class2225 class2225) {
        GL11.glColorMask(true, true, true, true);
        GL11.glDepthMask(true);
        GL11.glStencilMask(0);
        GL11.glStencilFunc((class2225 != Class2225.field13694) ? 517 : 514, 1, 1);
    }
    
    public static void method26928() {
        GL11.glStencilMask(-1);
        GL11.glDisable(2960);
        GL11.glPopMatrix();
        Class8154.field33583 = false;
    }
    
    public static void method26929(ItemStack class8321, final int n, final int n2, final int n3, final int n4) {
        if (class8321 != null) {
            final Class1663 method5290 = Class8154.field33582.method5290();
            Class8154.field33582.method5290();
            method5290.method5849(Class1663.field9428);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)n, (float)n2, 0.0f);
            GL11.glScalef(n3 / 16.0f, n4 / 16.0f, 0.0f);
            final ItemRenderer method5291 = Class8154.field33582.getItemRenderer();
            if (class8321.field34176 == 0) {
                class8321 = new ItemStack(class8321.getItem());
            }
            Block.method11776(class8321.getItem());
            RenderSystem.method30108();
            RenderSystem.method30003();
            RenderSystem.method30002();
            RenderSystem.enableBlend();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDepthFunc(519);
            method5291.method6538(class8321, 0, 0);
            GL11.glDepthFunc(515);
            RenderSystem.method30029();
            RenderSystem.method30060();
            GL11.glAlphaFunc(519, 0.0f);
            RenderSystem.method30084(33986, 240.0f, 240.0f);
            GL11.glDisable(2929);
            Class7777.method24931();
            final Class1663 method5292 = Class8154.field33582.method5290();
            Class8154.field33582.method5290();
            method5292.method5849(Class1663.field9428);
            RenderSystem.method30109();
        }
    }
    
    public static Color method26930(int n, int n2, final Color color) {
        n *= (int)Class9000.field37993;
        n2 *= (int)Class9000.field37993;
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(3);
        GL11.glPixelStorei(3317, 1);
        GL11.glReadPixels(n, Minecraft.method5277().field4632.method7693() - n2, 1, 1, 6407, 5120, allocateDirect);
        return new Color(allocateDirect.get(0) * 2, allocateDirect.get(1) * 2, allocateDirect.get(2) * 2, 1);
    }
    
    public static double[] method26931(final double n, final double n2, final double n3) {
        final FloatBuffer floatBuffer = BufferUtils.createFloatBuffer(3);
        final IntBuffer intBuffer = BufferUtils.createIntBuffer(16);
        final FloatBuffer floatBuffer2 = BufferUtils.createFloatBuffer(16);
        final FloatBuffer floatBuffer3 = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloatv(2982, floatBuffer2);
        GL11.glGetFloatv(2983, floatBuffer3);
        GL11.glGetIntegerv(2978, intBuffer);
        if (!Class6430.method19167((float)n, (float)n2, (float)n3, floatBuffer2, floatBuffer3, intBuffer, floatBuffer)) {
            return null;
        }
        return new double[] { floatBuffer.get(0) / Class9000.field37993, (Class8154.field33582.field4667.field24887 - floatBuffer.get(1)) / Class9000.field37993, floatBuffer.get(2) };
    }
    
    static {
        field33582 = Minecraft.method5277();
        Class8154.field33583 = false;
        Class8154.field33584 = new Stack<IntBuffer>();
        Class8154.field33585 = 1.0f;
        Class8154.field33586 = 1.0f;
        Class8154.field33587 = 1.0f;
    }
}
