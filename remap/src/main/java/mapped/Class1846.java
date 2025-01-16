// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;
import org.apache.logging.log4j.LogManager;
import com.google.common.base.Charsets;
import java.util.Base64;
import org.lwjgl.stb.STBImageResize;
import org.lwjgl.stb.STBImageWrite;

import java.nio.channels.Channels;
import java.io.ByteArrayOutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Path;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.stb.STBTTFontinfo;
import java.io.File;
import java.nio.IntBuffer;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import java.nio.ByteBuffer;
import org.apache.commons.io.IOUtils;
import java.nio.Buffer;
import java.io.IOException;
import java.io.InputStream;
import org.lwjgl.system.MemoryUtil;
import java.nio.file.StandardOpenOption;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public final class Class1846 implements AutoCloseable
{
    private static final Logger field10040;
    private static final Set<StandardOpenOption> field10041;
    private final Class2235 field10042;
    private final int field10043;
    private final int field10044;
    private final boolean field10045;
    private long field10046;
    private final long field10047;
    
    public Class1846(final int n, final int n2, final boolean b) {
        this(Class2235.field13729, n, n2, b);
    }
    
    public Class1846(final Class2235 field10042, final int field10043, final int field10044, final boolean b) {
        this.field10042 = field10042;
        this.field10043 = field10043;
        this.field10044 = field10044;
        this.field10047 = field10043 * (long)field10044 * field10042.method8430();
        this.field10045 = false;
        if (!b) {
            this.field10046 = MemoryUtil.nmemAlloc(this.field10047);
        }
        else {
            this.field10046 = MemoryUtil.nmemCalloc(1L, this.field10047);
        }
        this.method6643();
        Class8203.method27172(this);
    }
    
    private Class1846(final Class2235 field10042, final int field10043, final int field10044, final boolean field10045, final long field10046) {
        this.field10042 = field10042;
        this.field10043 = field10043;
        this.field10044 = field10044;
        this.field10045 = field10045;
        this.field10046 = field10046;
        this.field10047 = field10043 * field10044 * field10042.method8430();
    }
    
    @Override
    public String toString() {
        return "NativeImage[" + this.field10042 + " " + this.field10043 + "x" + this.field10044 + "@" + this.field10046 + (this.field10045 ? "S" : "N") + "]";
    }
    
    public static Class1846 method6637(final InputStream inputStream) throws IOException {
        return method6638(Class2235.field13729, inputStream);
    }
    
    public static Class1846 method6638(final Class2235 class2235, final InputStream inputStream) throws IOException {
        ByteBuffer method32108 = null;
        Class1846 method32109;
        try {
            method32108 = Class8995.method32108(inputStream);
            method32108.rewind();
            method32109 = method6640(class2235, method32108);
        }
        finally {
            MemoryUtil.memFree((Buffer)method32108);
            IOUtils.closeQuietly(inputStream);
        }
        return method32109;
    }
    
    public static Class1846 method6639(final ByteBuffer byteBuffer) throws IOException {
        return method6640(Class2235.field13729, byteBuffer);
    }
    
    public static Class1846 method6640(final Class2235 obj, final ByteBuffer byteBuffer) throws IOException {
        if (obj != null && !obj.method8438()) {
            throw new UnsupportedOperationException("Don't know how to read format " + obj);
        }
        if (MemoryUtil.memAddress(byteBuffer) == 0L) {
            throw new IllegalArgumentException("Invalid buffer");
        }
        Class1846 class1846;
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            final IntBuffer mallocInt = stackPush.mallocInt(1);
            final IntBuffer mallocInt2 = stackPush.mallocInt(1);
            final IntBuffer mallocInt3 = stackPush.mallocInt(1);
            final ByteBuffer stbi_load_from_memory = STBImage.stbi_load_from_memory(byteBuffer, mallocInt, mallocInt2, mallocInt3, (obj == null) ? 0 : Class2235.method8440(obj));
            if (stbi_load_from_memory == null) {
                throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }
            class1846 = new Class1846((obj == null) ? Class2235.method8441(mallocInt3.get(0)) : obj, mallocInt.get(0), mallocInt2.get(0), true, MemoryUtil.memAddress(stbi_load_from_memory));
            Class8203.method27172(class1846);
            return class1846;
        }
        return class1846;
    }
    
    public static void method6641(final boolean b) {
        Class8726.method29989(Class8726::method29985);
        if (!b) {
            Class8933.method31613(3553, 10242, 10497);
            Class8933.method31613(3553, 10243, 10497);
        }
        else {
            Class8933.method31613(3553, 10242, 33071);
            Class8933.method31613(3553, 10243, 33071);
        }
    }
    
    public static void method6642(final boolean b, final boolean b2) {
        Class8726.method29989(Class8726::method29985);
        if (!b) {
            final int method28838 = Config.method28838();
            Class8933.method31613(3553, 10241, b2 ? method28838 : 9728);
            Class8933.method31613(3553, 10240, 9728);
        }
        else {
            Class8933.method31613(3553, 10241, b2 ? 9987 : 9729);
            Class8933.method31613(3553, 10240, 9729);
        }
    }
    
    private void method6643() {
        if (this.field10046 != 0L) {
            return;
        }
        throw new IllegalStateException("Image is not allocated.");
    }
    
    @Override
    public void close() {
        if (this.field10046 != 0L) {
            if (!this.field10045) {
                MemoryUtil.nmemFree(this.field10046);
            }
            else {
                STBImage.nstbi_image_free(this.field10046);
            }
            Class8203.method27173(this);
        }
        this.field10046 = 0L;
    }
    
    public int method6644() {
        return this.field10043;
    }
    
    public int method6645() {
        return this.field10044;
    }
    
    public Class2235 method6646() {
        return this.field10042;
    }
    
    public int method6647(final int i, final int j) {
        if (this.field10042 == Class2235.field13729) {
            if (i >= 0) {
                if (j >= 0) {
                    if (i < this.field10043) {
                        if (j < this.field10044) {
                            this.method6643();
                            return MemoryUtil.memGetInt(this.field10046 + (i + j * this.field10043) * 4);
                        }
                    }
                }
            }
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", i, j, this.field10043, this.field10044));
        }
        throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.field10042));
    }
    
    public void method6648(final int i, final int j, final int n) {
        if (this.field10042 == Class2235.field13729) {
            if (i >= 0) {
                if (j >= 0) {
                    if (i < this.field10043) {
                        if (j < this.field10044) {
                            this.method6643();
                            MemoryUtil.memPutInt(this.field10046 + (i + j * this.field10043) * 4, n);
                            return;
                        }
                    }
                }
            }
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", i, j, this.field10043, this.field10044));
        }
        throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.field10042));
    }
    
    public byte method6649(final int i, final int j) {
        if (this.field10042.method8436()) {
            if (i >= 0) {
                if (j >= 0) {
                    if (i < this.field10043) {
                        if (j < this.field10044) {
                            return MemoryUtil.memGetByte(this.field10046 + ((i + j * this.field10043) * this.field10042.method8430() + this.field10042.method8437() / 8));
                        }
                    }
                }
            }
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", i, j, this.field10043, this.field10044));
        }
        throw new IllegalArgumentException(String.format("no luminance or alpha in %s", this.field10042));
    }
    
    public void method6650(final int n, final int n2, final int n3) {
        if (this.field10042 == Class2235.field13729) {
            final int method6647 = this.method6647(n, n2);
            final float n4 = method6669(n3) / 255.0f;
            final float n5 = method6672(n3) / 255.0f;
            final float n6 = method6671(n3) / 255.0f;
            final float n7 = method6670(n3) / 255.0f;
            final float n8 = method6669(method6647) / 255.0f;
            final float n9 = method6672(method6647) / 255.0f;
            final float n10 = method6671(method6647) / 255.0f;
            final float n11 = method6670(method6647) / 255.0f;
            final float n12 = 1.0f - n4;
            float n13 = n4 * n4 + n8 * n12;
            float n14 = n5 * n4 + n9 * n12;
            float n15 = n6 * n4 + n10 * n12;
            float n16 = n7 * n4 + n11 * n12;
            if (n13 > 1.0f) {
                n13 = 1.0f;
            }
            if (n14 > 1.0f) {
                n14 = 1.0f;
            }
            if (n15 > 1.0f) {
                n15 = 1.0f;
            }
            if (n16 > 1.0f) {
                n16 = 1.0f;
            }
            this.method6648(n, n2, method6673((int)(n13 * 255.0f), (int)(n14 * 255.0f), (int)(n15 * 255.0f), (int)(n16 * 255.0f)));
            return;
        }
        throw new UnsupportedOperationException("Can only call blendPixel with RGBA format");
    }
    
    @Deprecated
    public int[] method6651() {
        if (this.field10042 == Class2235.field13729) {
            this.method6643();
            final int[] array = new int[this.method6644() * this.method6645()];
            for (int i = 0; i < this.method6645(); ++i) {
                for (int j = 0; j < this.method6644(); ++j) {
                    final int method6647 = this.method6647(j, i);
                    array[j + i * this.method6644()] = (method6669(method6647) << 24 | method6670(method6647) << 16 | method6671(method6647) << 8 | method6672(method6647));
                }
            }
            return array;
        }
        throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
    }
    
    public void method6652(final int n, final int n2, final int n3, final boolean b) {
        this.method6653(n, n2, n3, 0, 0, this.field10043, this.field10044, false, b);
    }
    
    public void method6653(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final boolean b2) {
        this.method6654(n, n2, n3, n4, n5, n6, n7, false, false, b, b2);
    }
    
    public void method6654(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        if (Class8726.method29985()) {
            this.method6655(n, n2, n3, n4, n5, n6, n7, b, b2, b3, b4);
        }
        else {
            Class8726.method29991(() -> this.method6655(n, n2, n3, n4, n5, n6, n7, b, b2, b3, b4));
        }
    }
    
    private void method6655(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        Class8726.method29989(Class8726::method29985);
        this.method6643();
        method6642(b, b3);
        method6641(b2);
        if (n6 != this.method6644()) {
            Class8933.method31659(3314, this.method6644());
        }
        else {
            Class8933.method31659(3314, 0);
        }
        Class8933.method31659(3316, n4);
        Class8933.method31659(3315, n5);
        this.field10042.method8432();
        Class8933.method31619(3553, n, n2, n3, n6, n7, this.field10042.method8433(), 5121, this.field10046);
        if (b4) {
            this.close();
        }
    }
    
    public void method6656(final int n, final boolean b) {
        Class8726.method29989(Class8726::method29984);
        this.method6643();
        this.field10042.method8431();
        Class8933.method31620(3553, n, this.field10042.method8433(), 5121, this.field10046);
        if (b) {
            if (this.field10042.method8434()) {
                for (int i = 0; i < this.method6645(); ++i) {
                    for (int j = 0; j < this.method6644(); ++j) {
                        this.method6648(j, i, this.method6647(j, i) | 255 << this.field10042.method8435());
                    }
                }
            }
        }
    }
    
    public void method6657(final File file) throws IOException {
        this.method6659(file.toPath());
    }
    
    public void method6658(final STBTTFontinfo stbttFontinfo, final int n, final int i, final int j, final float n2, final float n3, final float n4, final float n5, final int k, final int l) {
        if (k >= 0) {
            if (k + i <= this.method6644()) {
                if (l >= 0) {
                    if (l + j <= this.method6645()) {
                        if (this.field10042.method8430() == 1) {
                            STBTruetype.nstbtt_MakeGlyphBitmapSubpixel(stbttFontinfo.address(), this.field10046 + k + l * this.method6644(), i, j, this.method6644(), n2, n3, n4, n5, n);
                            return;
                        }
                        throw new IllegalArgumentException("Can only write fonts into 1-component images.");
                    }
                }
            }
        }
        throw new IllegalArgumentException(String.format("Out of bounds: start: (%s, %s) (size: %sx%s); size: %sx%s", k, l, i, j, this.method6644(), this.method6645()));
    }
    
    public void method6659(final Path path) throws IOException {
        if (!this.field10042.method8438()) {
            throw new UnsupportedOperationException("Don't know how to write format " + this.field10042);
        }
        this.method6643();
        try (final SeekableByteChannel byteChannel = Files.newByteChannel(path, Class1846.field10041, (FileAttribute<?>[])new FileAttribute[0])) {
            if (!this.method6661(byteChannel)) {
                throw new IOException("Could not write image to the PNG file \"" + path.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
            }
        }
    }
    
    public byte[] method6660() throws IOException {
        byte[] byteArray;
        try (final ByteArrayOutputStream out = new ByteArrayOutputStream();
             final WritableByteChannel channel = Channels.newChannel(out)) {
            if (!this.method6661(channel)) {
                throw new IOException("Could not write image to byte array: " + STBImage.stbi_failure_reason());
            }
            byteArray = out.toByteArray();
        }
        return byteArray;
    }
    
    private boolean method6661(final WritableByteChannel writableByteChannel) throws IOException {
        final Class9091 class9091 = new Class9091(writableByteChannel, null);
        boolean b;
        try {
            final int min = Math.min(this.method6645(), Integer.MAX_VALUE / this.method6644() / this.field10042.method8430());
            if (min < this.method6645()) {
                Class1846.field10040.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", (Object)this.method6645(), (Object)min);
            }
            if (STBImageWrite.nstbi_write_png_to_func(class9091.address(), 0L, this.method6644(), min, this.field10042.method8430(), this.field10046, 0) == 0) {
                return false;
            }
            class9091.method32842();
            b = true;
        }
        finally {
            class9091.free();
        }
        return b;
    }
    
    public void method6662(final Class1846 class1846) {
        if (class1846.method6646() == this.field10042) {
            final int method8430 = this.field10042.method8430();
            this.method6643();
            class1846.method6643();
            if (this.field10043 != class1846.field10043) {
                final int min = Math.min(this.method6644(), class1846.method6644());
                for (int min2 = Math.min(this.method6645(), class1846.method6645()), i = 0; i < min2; ++i) {
                    MemoryUtil.memCopy(class1846.field10046 + i * class1846.method6644() * method8430, this.field10046 + i * this.method6644() * method8430, min * (long)method8430);
                }
            }
            else {
                MemoryUtil.memCopy(class1846.field10046, this.field10046, Math.min(this.field10047, class1846.field10047));
            }
            return;
        }
        throw new UnsupportedOperationException("Image formats don't match.");
    }
    
    public void method6663(final int n, final int n2, final int n3, final int n4, final int n5) {
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n; j < n + n3; ++j) {
                this.method6648(j, i, n5);
            }
        }
    }
    
    public void method6664(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final boolean b2) {
        for (int i = 0; i < n6; ++i) {
            for (int j = 0; j < n5; ++j) {
                this.method6648(n + n3 + (b ? (n5 - 1 - j) : j), n2 + n4 + (b2 ? (n6 - 1 - i) : i), this.method6647(n + j, n2 + i));
            }
        }
    }
    
    public void method6665() {
        this.method6643();
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            final int method8430 = this.field10042.method8430();
            final int n = this.method6644() * method8430;
            final long nmalloc = stackPush.nmalloc(n);
            for (int i = 0; i < this.method6645() / 2; ++i) {
                final int n2 = i * this.method6644() * method8430;
                final int n3 = (this.method6645() - 1 - i) * this.method6644() * method8430;
                MemoryUtil.memCopy(this.field10046 + n2, nmalloc, (long)n);
                MemoryUtil.memCopy(this.field10046 + n3, this.field10046 + n2, (long)n);
                MemoryUtil.memCopy(nmalloc, this.field10046 + n3, (long)n);
            }
        }
    }
    
    public void method6666(final int n, final int n2, final int n3, final int n4, final Class1846 class1846) {
        this.method6643();
        if (class1846.method6646() == this.field10042) {
            final int method8430 = this.field10042.method8430();
            STBImageResize.nstbir_resize_uint8(this.field10046 + (n + n2 * this.method6644()) * method8430, n3, n4, this.method6644() * method8430, class1846.field10046, class1846.method6644(), class1846.method6645(), 0, method8430);
            return;
        }
        throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
    }
    
    public void method6667() {
        Class7308.method22414(this.field10046);
    }
    
    public static Class1846 method6668(final String s) throws IOException {
        final byte[] decode = Base64.getDecoder().decode(s.replaceAll("\n", "").getBytes(Charsets.UTF_8));
        Class1846 method6639;
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            final ByteBuffer malloc = stackPush.malloc(decode.length);
            malloc.put(decode);
            malloc.rewind();
            method6639 = method6639(malloc);
        }
        return method6639;
    }
    
    public static int method6669(final int n) {
        return n >> 24 & 0xFF;
    }
    
    public static int method6670(final int n) {
        return n >> 0 & 0xFF;
    }
    
    public static int method6671(final int n) {
        return n >> 8 & 0xFF;
    }
    
    public static int method6672(final int n) {
        return n >> 16 & 0xFF;
    }
    
    public static int method6673(final int n, final int n2, final int n3, final int n4) {
        return (n & 0xFF) << 24 | (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | (n4 & 0xFF) << 0;
    }
    
    public IntBuffer method6674() {
        if (this.field10042 == Class2235.field13729) {
            this.method6643();
            return MemoryUtil.memIntBuffer(this.field10046, (int)this.field10047);
        }
        throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.field10042));
    }
    
    public void method6675(final int n) {
        if (this.field10042 == Class2235.field13729) {
            this.method6643();
            MemoryUtil.memSet(this.field10046, n, this.field10047);
            return;
        }
        throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.field10042));
    }
    
    public long method6676() {
        return this.field10047;
    }
    
    static {
        field10040 = LogManager.getLogger();
        field10041 = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
