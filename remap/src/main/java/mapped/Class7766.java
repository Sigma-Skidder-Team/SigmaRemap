// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.newdawn.slick.SlickException;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.opengl.renderer.Renderer;
import slick2d.Texture;

public class Class7766 extends Class7764
{
    public static SGL field31755;
    private static Class7764 field31756;
    private Class7764[][] field31757;
    private int field31758;
    private int field31759;
    private int field31760;
    private int field31761;
    
    public static final int method24864() {
        final IntBuffer intBuffer = BufferUtils.createIntBuffer(16);
        Class7766.field31755.glGetInteger(3379, intBuffer);
        return intBuffer.get(0);
    }
    
    private Class7766() {
        this.field31739 = true;
    }
    
    public Class7766(final String s) throws SlickException {
        this(s, 2);
    }
    
    public Class7766(final String s, final int n) throws SlickException {
        this.method24866(s, n, method24864());
    }
    
    public Class7766(final String s, final int n, final int n2) throws SlickException {
        this.method24866(s, n, n2);
    }
    
    public Class7766(final Class5337 class5337, final ByteBuffer byteBuffer, final int n) {
        this.method24867(class5337, byteBuffer, n, method24864());
    }
    
    public Class7766(final Class5337 class5337, final ByteBuffer byteBuffer, final int n, final int n2) {
        this.method24867(class5337, byteBuffer, n, n2);
    }
    
    public Class7764 method24865(final int n, final int n2) {
        return this.field31757[n][n2];
    }
    
    private void method24866(final String str, final int n, final int n2) throws SlickException {
        try {
            final Class5337 method28387 = Class8495.method28387(str);
            this.method24867(method28387, method28387.method16492(Class8834.method30851(str), false, null), n, n2);
        }
        catch (final IOException ex) {
            throw new Class2324("Failed to load: " + str, ex);
        }
    }
    
    private void method24867(final Class5337 class5337, final ByteBuffer byteBuffer, final int n, final int n2) {
        final int method16483 = class5337.method16483();
        final int method16484 = class5337.method16482();
        final int method16485 = class5337.method16484();
        this.field31730 = method16485;
        this.field31760 = method16485;
        final int method16486 = class5337.method16481();
        this.field31731 = method16486;
        this.field31761 = method16486;
        if (method16483 <= n2 && method16484 <= n2) {
            this.field31757 = new Class7764[1][1];
            this.field31757[0][0] = new Class7764(new Class5343(this, class5337, method16484, byteBuffer, method16483), n);
            this.field31758 = 1;
            this.field31759 = 1;
            this.field31739 = true;
            return;
        }
        this.field31758 = (this.field31760 - 1) / n2 + 1;
        this.field31759 = (this.field31761 - 1) / n2 + 1;
        this.field31757 = new Class7764[this.field31758][this.field31759];
        final int n3 = class5337.method16480() / 8;
        for (int i = 0; i < this.field31758; ++i) {
            for (int j = 0; j < this.field31759; ++j) {
                final int min = Math.min(this.field31760 - i * n2, n2);
                final int min2 = Math.min(this.field31761 - j * n2, n2);
                final ByteBuffer byteBuffer2 = BufferUtils.createByteBuffer(n2 * n2 * n3);
                final int n4 = i * n2 * n3;
                final byte[] array = new byte[n2 * n3];
                for (int k = 0; k < n2; ++k) {
                    byteBuffer.position();
                    byteBuffer.get(array, 0, n2 * n3);
                    byteBuffer2.put(array);
                }
                byteBuffer2.flip();
                this.field31757[i][j] = new Class7764(new Class5344(this, class5337, min2, min, byteBuffer2, n2, n2), n);
            }
        }
        this.field31739 = true;
    }
    
    @Override
    public void method24811() {
        throw new Class2362("Can't bind big images yet");
    }
    
    @Override
    public Class7764 method24845() {
        throw new Class2362("Can't copy big images yet");
    }
    
    @Override
    public void method24774() {
        this.method24775(0.0f, 0.0f);
    }
    
    @Override
    public void method24776(final float n, final float n2, final Color color) {
        this.method24778(n, n2, (float)this.field31730, (float)this.field31731, color);
    }
    
    @Override
    public void method24822(final float n, final float n2, final float n3, final Color color) {
        this.method24778(n, n2, this.field31730 * n3, this.field31731 * n3, color);
    }
    
    @Override
    public void method24778(final float n, final float n2, final float n3, final float n4, final Color color) {
        final float n5 = n3 / this.field31760;
        final float n6 = n4 / this.field31761;
        Class7766.field31755.glTranslatef(n, n2, 0.0f);
        Class7766.field31755.glScalef(n5, n6, 1.0f);
        float n7 = 0.0f;
        for (int i = 0; i < this.field31758; ++i) {
            float n8 = 0.0f;
            for (int j = 0; j < this.field31759; ++j) {
                final Class7764 class2428 = this.field31757[i][j];
                class2428.method24778(n7, n8, (float)class2428.method24843(), (float)class2428.method24844(), color);
                n8 += class2428.method24844();
                if (j == this.field31759 - 1) {
                    n7 += class2428.method24843();
                }
            }
        }
        Class7766.field31755.glScalef(1.0f / n5, 1.0f / n6, 1.0f);
        Class7766.field31755.glTranslatef(-n, -n2, 0.0f);
    }
    
    @Override
    public void method24838(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        this.method24836((int)n5, (int)n6, (int)(n7 - n5), (int)(n8 - n6)).method24777(n, n2, (float)(int)(n3 - n), (float)(int)(n4 - n2));
    }
    
    @Override
    public void method24837(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.method24838(n, n2, (float)(int)(n5 - n3), (float)(int)(n6 - n4), n3, n4, n5, n6);
    }
    
    @Override
    public void method24777(final float n, final float n2, final float n3, final float n4) {
        this.method24778(n, n2, n3, n4, Color.white);
    }
    
    @Override
    public void method24821(final float n, final float n2, final float n3) {
        this.method24822(n, n2, n3, Color.white);
    }
    
    @Override
    public void method24775(final float n, final float n2) {
        this.method24776(n, n2, Color.white);
    }
    
    @Override
    public void method24816(final float n, final float n2, final float n3, final float n4) {
        final float n5 = n3 / this.field31760;
        final float n6 = n4 / this.field31761;
        float n7 = 0.0f;
        for (int i = 0; i < this.field31758; ++i) {
            float n8 = 0.0f;
            for (int j = 0; j < this.field31759; ++j) {
                final Class7764 field31756 = this.field31757[i][j];
                if (Class7766.field31756 == null || field31756.method24852() != Class7766.field31756.method24852()) {
                    if (Class7766.field31756 != null) {
                        Class7766.field31756.method24850();
                    }
                    (Class7766.field31756 = field31756).method24851();
                }
                field31756.method24816(n7 + n, n8 + n2, (float)field31756.method24843(), (float)field31756.method24844());
                n8 += field31756.method24844();
                if (j == this.field31759 - 1) {
                    n7 += field31756.method24843();
                }
            }
        }
    }
    
    @Override
    public void method24825(final float n, final float n2, final float n3, final float n4) {
        final float n5 = n3 / this.field31760;
        final float n6 = n4 / this.field31761;
        Class7766.field31755.glTranslatef(n, n2, 0.0f);
        Class7766.field31755.glScalef(n5, n6, 1.0f);
        float n7 = 0.0f;
        for (int i = 0; i < this.field31758; ++i) {
            float n8 = 0.0f;
            for (int j = 0; j < this.field31759; ++j) {
                final Class7764 class7764 = this.field31757[i][j];
                class7764.method24825(n7, n8, (float)class7764.method24843(), (float)class7764.method24844());
                n8 += class7764.method24844();
                if (j == this.field31759 - 1) {
                    n7 += class7764.method24843();
                }
            }
        }
        Class7766.field31755.glScalef(1.0f / n5, 1.0f / n6, 1.0f);
        Class7766.field31755.glTranslatef(-n, -n2, 0.0f);
    }
    
    @Override
    public void method24830(final float n, final float n2) {
        this.method24825(n, n2, (float)this.field31730, (float)this.field31731);
    }
    
    @Override
    public void method24850() {
        if (Class7766.field31756 != null) {
            Class7766.field31756.method24850();
        }
        Class7766.field31756 = null;
    }
    
    @Override
    public void method24851() {
    }
    
    @Override
    public void method24848() {
        throw new Class2362("Doesn't make sense for tiled operations");
    }
    
    @Override
    public Color method24855(final int n, final int n2) {
        throw new Class2362("Can't use big images as buffers");
    }
    
    @Override
    public Class7764 method24849(final boolean b, final boolean b2) {
        final Class7766 class7766 = new Class7766();
        class7766.field31757 = this.field31757;
        class7766.field31758 = this.field31758;
        class7766.field31759 = this.field31759;
        class7766.field31730 = this.field31730;
        class7766.field31731 = this.field31731;
        class7766.field31760 = this.field31760;
        class7766.field31761 = this.field31761;
        if (b) {
            final Class7764[][] field31757 = class7766.field31757;
            class7766.field31757 = new Class7764[this.field31758][this.field31759];
            for (int i = 0; i < this.field31758; ++i) {
                for (int j = 0; j < this.field31759; ++j) {
                    class7766.field31757[i][j] = field31757[this.field31758 - 1 - i][j].method24849(true, false);
                }
            }
        }
        if (b2) {
            final Class7764[][] field31758 = class7766.field31757;
            class7766.field31757 = new Class7764[this.field31758][this.field31759];
            for (int k = 0; k < this.field31758; ++k) {
                for (int l = 0; l < this.field31759; ++l) {
                    class7766.field31757[k][l] = field31758[k][this.field31759 - 1 - l].method24849(false, true);
                }
            }
        }
        return class7766;
    }
    
    public Class8519 method24868() throws SlickException {
        throw new Class2362("Can't use big images as offscreen buffers");
    }
    
    @Override
    public Class7764 method24846(final float n) {
        return this.method24847((int)(n * this.field31730), (int)(n * this.field31731));
    }
    
    @Override
    public Class7764 method24847(final int field31730, final int field31731) {
        final Class7766 class7766 = new Class7766();
        class7766.field31757 = this.field31757;
        class7766.field31758 = this.field31758;
        class7766.field31759 = this.field31759;
        class7766.field31730 = field31730;
        class7766.field31731 = field31731;
        class7766.field31760 = this.field31760;
        class7766.field31761 = this.field31761;
        return class7766;
    }
    
    @Override
    public Class7764 method24836(final int n, final int n2, final int n3, final int n4) {
        final Class7766 class7766 = new Class7766();
        class7766.field31730 = n3;
        class7766.field31731 = n4;
        class7766.field31760 = n3;
        class7766.field31761 = n4;
        class7766.field31757 = new Class7764[this.field31758][this.field31759];
        float b = 0.0f;
        final int a = n + n3;
        final int a2 = n2 + n4;
        int n5 = 0;
        for (int i = 0; i < this.field31758; ++i) {
            float b2 = 0.0f;
            int b3 = 0;
            int n6 = 0;
            for (int j = 0; j < this.field31759; ++j) {
                final Class7764 class7767 = this.field31757[i][j];
                final int b4 = (int)(b + class7767.method24843());
                final int b5 = (int)(b2 + class7767.method24844());
                final int n7 = (int)Math.max((float)n, b);
                final int n8 = (int)Math.max((float)n2, b2);
                final int min = Math.min(a, b4);
                final int min2 = Math.min(a2, b5);
                final int n9 = min - n7;
                final int n10 = min2 - n8;
                if (n9 > 0) {
                    if (n10 > 0) {
                        final Class7764 method24836 = class7767.method24836((int)(n7 - b), (int)(n8 - b2), min - n7, min2 - n8);
                        n6 = 1;
                        class7766.field31757[n5][b3] = method24836;
                        ++b3;
                        class7766.field31759 = Math.max(class7766.field31759, b3);
                    }
                }
                b2 += class7767.method24844();
                if (j == this.field31759 - 1) {
                    b += class7767.method24843();
                }
            }
            if (n6 != 0) {
                ++n5;
                final Class7766 class7768 = class7766;
                ++class7768.field31758;
            }
        }
        return class7766;
    }
    
    @Override
    public Texture method24852() {
        throw new Class2362("Can't use big images as offscreen buffers");
    }
    
    @Override
    public void method24814() {
        throw new Class2362("Can't use big images as offscreen buffers");
    }
    
    @Override
    public void method24812() {
        throw new Class2362("Can't use big images as offscreen buffers");
    }
    
    @Override
    public void method24853(final Texture class7776) {
        throw new Class2362("Can't use big images as offscreen buffers");
    }
    
    public Class7764 method24859(final int n, final int n2) {
        return this.field31757[n][n2];
    }
    
    public int method24869() {
        return this.field31758;
    }
    
    public int method24870() {
        return this.field31759;
    }
    
    @Override
    public String toString() {
        return "[BIG IMAGE]";
    }
    
    @Override
    public void method24857() throws SlickException {
        for (int i = 0; i < this.field31758; ++i) {
            for (int j = 0; j < this.field31759; ++j) {
                this.field31757[i][j].method24857();
            }
        }
    }
    
    @Override
    public void method24839(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final Color color) {
        this.method24836((int)n5, (int)n6, (int)(n7 - n5), (int)(n8 - n6)).method24778(n, n2, (float)(int)(n3 - n), (float)(int)(n4 - n2), color);
    }
    
    @Override
    public void method24815(final float n, final float n2) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void method24841(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final Color color) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void method24840(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void method24829(final float n, final float n2, final float n3, final float n4, final Color color) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void method24823(final float n, final float n2, final float n3, final float n4) {
        throw new UnsupportedOperationException();
    }
    
    static {
        Class7766.field31755 = Renderer.get();
    }
}
