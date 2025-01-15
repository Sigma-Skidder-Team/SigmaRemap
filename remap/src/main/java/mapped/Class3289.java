// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import org.lwjgl.BufferUtils;
import java.io.IOException;
import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;

public class Class3289 extends Class3167
{
    public ByteBuffer field15832;
    public BufferedImage field15833;
    private int field15834;
    private int field15835;
    private static float field15836;
    private int field15837;
    private int field15838;
    private int field15839;
    private int field15840;
    private int field15841;
    private Class354 field15842;
    private int field15843;
    public List<Class6824> field15844;
    private double field15845;
    private double field15846;
    
    public Class3289() {
        super(Class8013.field32991, "MiniMap", "Shows a mini map");
        this.field15832 = null;
        this.field15833 = null;
        this.field15834 = 95;
        this.field15837 = 150;
        this.field15838 = 150;
        this.field15839 = 10;
        this.field15840 = 260;
        this.field15841 = 1;
        this.field15843 = 10;
        this.field15844 = new ArrayList<Class6824>();
        this.method9915(false);
    }
    
    @Class6753
    public void method10404(final Class5732 class5732) {
        this.field15844.clear();
    }
    
    @Override
    public void method9897() {
        this.field15844.clear();
    }
    
    @Class6753
    private void method10405(final Class5743 class5743) {
        if (this.method9906()) {
            if (Class3289.field15514.field4684 != null) {
                if (Class3289.field15514.field4683 != null) {
                    ++this.field15835;
                    if (Class3289.field15836 < Class3289.field15514.field4684.field2396) {
                        if (Class3289.field15514.field4684.field2404) {
                            Class3289.field15836 += 0.5f;
                        }
                    }
                    if (Class3289.field15836 > Class3289.field15514.field4684.field2396) {
                        if (Class3289.field15514.field4684.field2404) {
                            Class3289.field15836 -= 0.5f;
                        }
                    }
                    if (this.field15835 >= 1) {
                        final ArrayList list = new ArrayList();
                        for (int i = -this.field15843 / 2; i < this.field15843 / 2; ++i) {
                            for (int j = -this.field15843 / 2; j < this.field15843 / 2; ++j) {
                                list.add(Class3289.field15514.field4683.method6686(Class3289.field15514.field4684.field2441 + i, Class3289.field15514.field4684.field2443 + j));
                            }
                        }
                        final Iterator<Class6824> iterator = this.field15844.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().field26810.method7019().method25436(new Class7859(Class3289.field15514.field4684.field2441, Class3289.field15514.field4684.field2443)) <= 7) {
                                continue;
                            }
                            iterator.remove();
                        }
                        for (final Class1862 class5744 : list) {
                            if (class5744 == null) {
                                return;
                            }
                            int n = 0;
                            final Iterator<Class6824> iterator3 = this.field15844.iterator();
                            while (iterator3.hasNext()) {
                                if (!iterator3.next().method20914(class5744)) {
                                    continue;
                                }
                                n = 1;
                                break;
                            }
                            if (n == 0) {
                                this.field15844.add(new Class6824(class5744));
                                break;
                            }
                        }
                        final Iterator<Class6824> iterator4 = this.field15844.iterator();
                        while (iterator4.hasNext()) {
                            iterator4.next().method20912();
                        }
                        this.field15845 = (Class3289.field15514.field4684.field2395 - Class3289.field15514.field4684.field2441 * 16) / 16.0;
                        this.field15846 = (Class3289.field15514.field4684.field2397 - Class3289.field15514.field4684.field2443 * 16) / 16.0;
                        this.field15832 = this.method10407(this.field15834);
                        this.field15842 = Class3289.field15514.field4684.method1894();
                        this.field15835 = 0;
                    }
                }
            }
        }
    }
    
    @Class6753
    @Class6757
    private void method10406(final Class5740 class5740) throws IOException {
        if (this.method9906()) {
            if (Class3289.field15514.field4684 != null) {
                if (Class3289.field15514.field4683 != null) {
                    if (this.field15832 == null) {
                        return;
                    }
                    if (Class869.method5277().field4648.field23466) {
                        return;
                    }
                    if (!Class869.method5277().field4648.field23464) {
                        final ByteBuffer field15832 = this.field15832;
                        this.field15840 = class5740.method17028();
                        if (field15832 != null) {
                            final String s = "^";
                            final Class7524 field15833 = Class9400.field40323;
                            final float n = 1.5f;
                            Class8154.method26874((float)this.field15839, (float)this.field15840, (float)this.field15838, (float)this.field15837, -7687425);
                            GL11.glPushMatrix();
                            final float n2 = (float)(this.field15838 / this.field15843);
                            final float n3 = (float)(n2 * n * this.field15846);
                            final float n4 = (float)(-n2 * n * this.field15845);
                            GL11.glTranslatef((float)(this.field15839 + this.field15838 / 2), (float)(this.field15840 + this.field15837 / 2), 0.0f);
                            GL11.glRotatef(90.0f - Class3289.field15514.field4684.field2399, 0.0f, 0.0f, 1.0f);
                            GL11.glTranslatef((float)(-this.field15838 / 2), (float)(-this.field15837 / 2), 0.0f);
                            final float n5 = this.field15838 * n;
                            final float n6 = this.field15837 * n;
                            Class8154.method26870(this.field15839, this.field15840, this.field15839 + this.field15838, this.field15840 + this.field15837);
                            Class8154.method26905(0.0f, 0.0f, 0.0f, 0.0f, Class7853.field32188);
                            final float n7 = -n5 / 2.0f + this.field15838 / 2 + n3;
                            final float n8 = -n6 / 2.0f + this.field15837 / 2 + n4;
                            Class8154.method26905(0.0f, 0.0f, 0.0f, 0.0f, Class7853.field32193);
                            Class8154.method26903(n7, n8, n5, n6, field15832, Class265.field1278.field1292, 0.0f, 0.0f, (float)(this.field15843 * 16), (float)(this.field15843 * 16), true, false);
                            Class8154.method26872();
                            GL11.glPopMatrix();
                            Class8154.method26889(field15833, (float)(this.field15839 + this.field15838 / 2 - 4), (float)(this.field15840 + this.field15837 / 2 - 8), s, Class265.field1278.field1292);
                            Class8154.method26889(field15833, (float)(this.field15839 + this.field15838 / 2 - 4), (float)(this.field15840 + this.field15837 / 2 - 6), s, 1879048192);
                            Class8154.method26914((float)this.field15839, (float)this.field15840, (float)this.field15838, (float)this.field15837, 23.0f, 0.75f);
                            Class8154.method26913((float)this.field15839, (float)this.field15840, (float)this.field15838, (float)this.field15837, 8.0f, 0.7f);
                        }
                        class5740.method17030(this.field15837 + 10);
                    }
                }
            }
        }
    }
    
    public ByteBuffer method10407(final int n) {
        final ArrayList list = new ArrayList();
        for (int i = -this.field15843 / 2; i < this.field15843 / 2; ++i) {
            for (int j = -this.field15843 / 2; j < this.field15843 / 2; ++j) {
                list.add(Class3289.field15514.field4683.method6686(Class3289.field15514.field4684.field2441 + i, Class3289.field15514.field4684.field2443 + j));
            }
        }
        final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(this.field15843 * 16 * this.field15843 * 16 * 3);
        int n2 = 0;
        int position = byteBuffer.position();
        for (final Class1862 class1862 : list) {
            ByteBuffer byteBuffer2 = BufferUtils.createByteBuffer(768);
            method10408(byteBuffer2);
            Class6824 class1863 = null;
            for (final Class6824 class1864 : this.field15844) {
                if (!class1864.method20914(class1862)) {
                    continue;
                }
                class1863 = class1864;
                break;
            }
            if (class1863 != null) {
                if (class1863.field26811 != null) {
                    byteBuffer2 = class1863.field26811;
                }
            }
            int position2 = byteBuffer.position();
            final int position3 = byteBuffer.position();
            for (int k = 0; k < 16; ++k) {
                for (int l = 0; l < 16; ++l) {
                    byteBuffer.put(byteBuffer2.get());
                    byteBuffer.put(byteBuffer2.get());
                    byteBuffer.put(byteBuffer2.get());
                }
                position2 += 16 * this.field15843 * 3;
                if (position2 < byteBuffer.limit()) {
                    byteBuffer.position();
                }
            }
            position += 48;
            if (position3 + 48 < byteBuffer.limit()) {
                byteBuffer.position();
            }
            if (n2 != position / (48 * this.field15843)) {
                n2 = position / (48 * this.field15843);
                if (256 * this.field15843 * 3 * n2 < byteBuffer.limit()) {
                    byteBuffer.position();
                }
            }
            byteBuffer2.position();
        }
        byteBuffer.position();
        byteBuffer.flip();
        return byteBuffer;
    }
    
    public static ByteBuffer method10408(final ByteBuffer byteBuffer) {
        final int n = -7687425;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                byteBuffer.put((byte)(n >> 16 & 0xFF));
                byteBuffer.put((byte)(n >> 8 & 0xFF));
                byteBuffer.put((byte)(n & 0xFF));
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }
    
    public static int method10409(Class354 method1139) {
        final float n = 1.0f;
        if (Class3289.field15514.field4683.method6701(method1139).method21696() == Class7521.field29147) {
            method1139 = method1139.method1139();
        }
        int n2 = Class3289.field15514.field4683.method6701(method1139).method21697().method26446().field37084;
        final Class8059 method1140 = Class3289.field15514.field4683.method6701(method1139.method1137()).method21697();
        if (method1140 != Class8059.field33164) {
            if (method1140 == Class8059.field33163) {
                n2 = method1140.method26446().field37084;
            }
        }
        else {
            n2 = -1;
        }
        int rgba = new Color((n2 & 0xFF0000) >> 16, (n2 & 0xFF00) >> 8, n2 & 0xFF).getRGB();
        final Class8059 method1141 = Class3289.field15514.field4683.method6701(method1139.method1141()).method21697();
        final Class8059 method1142 = Class3289.field15514.field4683.method6701(method1139.method1143()).method21697();
        if (method1141 != Class8059.field33153 && method1141 != Class8059.field33164) {
            if (method1142 == Class8059.field33153 || method1142 == Class8059.field33164) {
                rgba = Class6430.method19109(new Color(rgba, true), Color.WHITE, 0.6f).getRGB();
            }
        }
        else {
            rgba = Class6430.method19109(new Color(rgba, true), Color.BLACK, 0.6f).getRGB();
        }
        int rgb;
        if (rgba != -16777216) {
            rgb = Class6430.method19109(new Color(rgba, true), Color.BLACK, n).getRGB();
        }
        else {
            rgb = -7687425;
        }
        return rgb;
    }
    
    static {
        Class3289.field15836 = 64.0f;
    }
}
