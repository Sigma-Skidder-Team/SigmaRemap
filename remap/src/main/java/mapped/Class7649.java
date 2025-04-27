// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.Texture;

import java.io.BufferedInputStream;
import java.lang.ref.SoftReference;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.nio.IntBuffer;
import java.util.HashMap;

public class Class7649
{
    public static SGL field30374;
    private static final Class7649 field30375;
    private final HashMap field30376;
    private final HashMap field30377;
    private int field30378;
    private boolean field30379;
    private boolean field30380;
    
    public static Class7649 method24214() {
        return Class7649.field30375;
    }
    
    private Class7649() {
        this.field30376 = new HashMap();
        this.field30377 = new HashMap();
        this.field30378 = 6408;
    }
    
    public void method24215(final boolean field30380) {
        this.field30380 = field30380;
    }
    
    public void method24216(final boolean field30379) {
        this.field30379 = field30379;
    }
    
    public boolean method24217() {
        return this.field30379;
    }
    
    public void method24218(final String s) {
        this.field30376.remove(s);
        this.field30377.remove(s);
    }
    
    public void method24219() {
        this.field30376.clear();
        this.field30377.clear();
    }
    
    public void method24220() {
        this.field30378 = 32859;
    }
    
    public static int method24221() {
        final IntBuffer method24233 = method24233(1);
        Class7649.field30374.glGenTextures(method24233);
        return method24233.get(0);
    }
    
    public Texture method24222(final File file, final boolean b, final int n) throws IOException {
        return this.method24227(new FileInputStream(file), file.getAbsolutePath(), b, n, null);
    }
    
    public Texture method24223(final File file, final boolean b, final int n, final int[] array) throws IOException {
        return this.method24227(new FileInputStream(file), file.getAbsolutePath(), b, n, array);
    }
    
    public Texture method24224(final String s, final boolean b, final int n) throws IOException {
        return this.method24227(Class8834.method30851(s), s, b, n, null);
    }
    
    public Texture method24225(final String s, final boolean b, final int n, final int[] array) throws IOException {
        return this.method24227(Class8834.method30851(s), s, b, n, array);
    }
    
    public Texture method24226(final InputStream inputStream, final String s, final boolean b, final int n) throws IOException {
        return this.method24227(inputStream, s, b, n, null);
    }
    
    public Class7777 method24227(final InputStream inputStream, final String s, final boolean b, final int n, final int[] array) throws IOException {
        HashMap hashMap = this.field30376;
        if (n == 9728) {
            hashMap = this.field30377;
        }
        String string = s;
        if (array != null) {
            string = string + ":" + array[0] + ":" + array[1] + ":" + array[2];
        }
        final String string2 = string + ":" + b;
        if (this.field30380) {
            final Class7777 class7777 = hashMap.get(string2);
            if (class7777 != null) {
                return class7777;
            }
        }
        else {
            final SoftReference softReference = hashMap.get(string2);
            if (softReference != null) {
                final Class7777 class7778 = (Class7777)softReference.get();
                if (class7778 != null) {
                    return class7778;
                }
                hashMap.remove(string2);
            }
        }
        try {
            Class7649.field30374.glGetError();
        }
        catch (final NullPointerException ex) {
            throw new RuntimeException("Image based resources must be loaded as part of init() or the game loop. They cannot be loaded before initialisation.");
        }
        final Class7777 method24228 = this.method24228(inputStream, s, 3553, n, n, b, array);
        method24228.method24928(string2);
        if (this.field30380) {
            hashMap.put(string2, method24228);
        }
        else {
            hashMap.put(string2, new SoftReference(method24228));
        }
        return method24228;
    }
    
    private Class7777 method24228(final InputStream in, final String s, final int n, final int n2, final int n3, final boolean b, final int[] array) throws IOException {
        final Class5337 method28387 = Class8495.method28387(s);
        final ByteBuffer method28388 = method28387.method16492(new BufferedInputStream(in), b, array);
        final int method28389 = method24221();
        final Class7777 class7777 = new Class7777(s, n, method28389);
        Class7649.field30374.glBindTexture(n, method28389);
        final int method28390 = method28387.method16484();
        final int method28391 = method28387.method16481();
        final boolean b2 = method28387.method16480() == 32;
        class7777.method24935(method28387.method16483());
        class7777.method24934(method28387.method16482());
        class7777.getTextureWidth();
        class7777.getTextureHeight();
        final IntBuffer intBuffer = BufferUtils.createIntBuffer(16);
        Class7649.field30374.glGetInteger(3379, intBuffer);
        intBuffer.get(0);
        final int n4 = b2 ? 6408 : 6407;
        final int n5 = b2 ? 4 : 3;
        class7777.method24933(method28390);
        class7777.method24932(method28391);
        class7777.method24929(b2);
        if (this.field30380) {
            class7777.method24940(n4, n5, n3, n2, method28388);
        }
        final SGL field30374 = Class7649.field30374;
        final SGL field30375 = Class7649.field30374;
        field30374.glTexParameteri(n, 10241, n3);
        final SGL field30376 = Class7649.field30374;
        final SGL field30377 = Class7649.field30374;
        field30376.glTexParameteri(n, 10240, n2);
        Class7649.field30374.glTexImage2D(n, 0, this.field30378, method24232(method28390), method24232(method28391), 0, n4, 5121, method28388);
        return class7777;
    }
    
    public Texture method24229(final int n, final int n2) throws IOException {
        return this.method24230(n, n2, 9728);
    }
    
    public Texture method24230(final int n, final int n2, final int n3) throws IOException {
        return this.method24231(new Class5342(n, n2), n3);
    }
    
    public Texture method24231(final Class5336 obj, final int n) throws IOException {
        final int n2 = 3553;
        final ByteBuffer method16485 = obj.method16485();
        final int method16486 = method24221();
        final Class7777 class7777 = new Class7777("generated:" + obj, n2, method16486);
        Class7649.field30374.glBindTexture(n2, method16486);
        final int method16487 = obj.method16484();
        final int method16488 = obj.method16481();
        final boolean b = obj.method16480() == 32;
        class7777.method24935(obj.method16483());
        class7777.method24934(obj.method16482());
        final int method16489 = class7777.getTextureWidth();
        final int method16490 = class7777.getTextureHeight();
        final int n3 = b ? 6408 : 6407;
        final int n4 = b ? 4 : 3;
        class7777.method24933(method16487);
        class7777.method24932(method16488);
        class7777.method24929(b);
        final IntBuffer intBuffer = BufferUtils.createIntBuffer(16);
        Class7649.field30374.glGetInteger(3379, intBuffer);
        final int value = intBuffer.get(0);
        if (method16489 <= value && method16490 <= value) {
            if (this.field30380) {
                class7777.method24940(n3, n4, n, n, method16485);
            }
            Class7649.field30374.glTexParameteri(n2, 10241, n);
            Class7649.field30374.glTexParameteri(n2, 10240, n);
            Class7649.field30374.glTexImage2D(n2, 0, this.field30378, method24232(method16487), method24232(method16488), 0, n3, 5121, method16485);
            return class7777;
        }
        throw new IOException("Attempt to allocate a texture to big for the current hardware");
    }
    
    public static int method24232(final int n) {
        int i;
        for (i = 2; i < n; i *= 2) {}
        return i;
    }
    
    public static IntBuffer method24233(final int n) {
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4 * n);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asIntBuffer();
    }
    
    public void method24234() {
        final Iterator iterator = this.field30376.values().iterator();
        while (iterator.hasNext()) {
            ((Class7777)iterator.next()).method24941();
        }
        final Iterator iterator2 = this.field30377.values().iterator();
        while (iterator2.hasNext()) {
            ((Class7777)iterator2.next()).method24941();
        }
    }
    
    public int method24235(final Class7777 class7777, final int n, final int n2, final int n3, final int n4, final ByteBuffer byteBuffer) {
        final int n5 = 3553;
        final int method24221 = method24221();
        Class7649.field30374.glBindTexture(n5, method24221);
        Class7649.field30374.glTexParameteri(n5, 10241, n3);
        Class7649.field30374.glTexParameteri(n5, 10240, n4);
        Class7649.field30374.glTexImage2D(n5, 0, this.field30378, class7777.getTextureWidth(), class7777.getTextureHeight(), 0, n, 5121, byteBuffer);
        return method24221;
    }
    
    static {
        Class7649.field30374 = Renderer.get();
        field30375 = new Class7649();
    }
}
