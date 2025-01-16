// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

import com.google.common.collect.Lists;
import java.util.Arrays;

public class TextureAtlasSprite implements AutoCloseable
{
    private final Class1774 field10366;
    private final Class9336 field10367;
    private final Class8637 field10368;
    public final Class1846[] field10369;
    private final int[] field10370;
    private final int[] field10371;
    private final Class393 field10372;
    private final int field10373;
    private final int field10374;
    private final float field10375;
    private final float field10376;
    private final float field10377;
    private final float field10378;
    private int field10379;
    private int field10380;
    private int field10381;
    public float field10382;
    public float field10383;
    public int field10384;
    public int field10385;
    public int field10386;
    public TextureAtlasSprite field10387;
    public boolean field10388;
    public static final String field10389 = ".sprite_single";
    public int field10390;
    public TextureAtlasSprite field10391;
    public TextureAtlasSprite field10392;
    public boolean field10393;
    public TextureAtlasSprite field10394;
    public boolean field10395;
    private int field10396;
    private boolean field10397;
    private boolean field10398;
    private boolean field10399;
    private boolean field10400;
    private Class6582 field10401;
    
    public TextureAtlasSprite(final ResourceLocation class1932) {
        this.field10381 = -1;
        this.field10386 = -1;
        this.field10387 = null;
        this.field10388 = false;
        this.field10390 = 0;
        this.field10391 = null;
        this.field10392 = null;
        this.field10393 = false;
        this.field10394 = null;
        this.field10395 = false;
        this.field10396 = -1;
        this.field10397 = false;
        this.field10366 = null;
        this.field10367 = new Class9336(class1932, 0, 0, null);
        this.field10368 = null;
        this.field10369 = null;
        this.field10370 = null;
        this.field10371 = null;
        this.field10372 = null;
        this.field10373 = 0;
        this.field10374 = 0;
        this.field10375 = 0.0f;
        this.field10376 = 0.0f;
        this.field10377 = 0.0f;
        this.field10378 = 0.0f;
    }
    
    private TextureAtlasSprite(final TextureAtlasSprite class1912) {
        this.field10381 = -1;
        this.field10386 = -1;
        this.field10387 = null;
        this.field10388 = false;
        this.field10390 = 0;
        this.field10391 = null;
        this.field10392 = null;
        this.field10393 = false;
        this.field10394 = null;
        this.field10395 = false;
        this.field10396 = -1;
        this.field10397 = false;
        this.field10366 = class1912.field10366;
        final Class9336 field10367 = class1912.field10367;
        final ResourceLocation method34591 = field10367.method34591();
        this.field10367 = new Class9336(new ResourceLocation(method34591.method7798(), method34591.method7797() + ".sprite_single"), field10367.method34592(), field10367.method34593(), field10367.method34596());
        this.field10368 = class1912.field10368;
        this.field10369 = class1912.field10369;
        this.field10370 = class1912.field10370;
        this.field10371 = class1912.field10371;
        this.field10372 = class1912.field10372;
        this.field10373 = 0;
        this.field10374 = 0;
        this.field10375 = 0.0f;
        this.field10376 = 1.0f;
        this.field10377 = 0.0f;
        this.field10378 = 1.0f;
        this.field10379 = class1912.field10379;
        this.field10380 = class1912.field10380;
        this.field10381 = class1912.field10381;
        this.field10382 = class1912.field10382;
        this.field10383 = class1912.field10383;
        this.field10384 = class1912.field10384;
        this.field10385 = class1912.field10385;
        this.field10388 = true;
        this.field10390 = class1912.field10390;
        this.field10396 = class1912.field10396;
        this.field10397 = class1912.field10397;
    }
    
    public TextureAtlasSprite(final Class1774 field10366, final Class9336 class9336, final int n, final int field10367, final int field10368, final int field10369, final int field10370, Class1846 class9337) {
        this.field10381 = -1;
        this.field10386 = -1;
        this.field10387 = null;
        this.field10388 = false;
        this.field10390 = 0;
        this.field10391 = null;
        this.field10392 = null;
        this.field10393 = false;
        this.field10394 = null;
        this.field10395 = false;
        this.field10396 = -1;
        this.field10397 = false;
        this.field10366 = field10366;
        Class8637 method34599 = Class9336.method34599(class9336);
        final int method34600 = Class9336.method34600(class9336);
        final int method34601 = Class9336.method34601(class9336);
        this.field10373 = field10369;
        this.field10374 = field10370;
        this.field10375 = field10369 / (float)field10367;
        this.field10376 = (field10369 + method34600) / (float)field10367;
        this.field10377 = field10370 / (float)field10368;
        this.field10378 = (field10370 + method34601) / (float)field10368;
        if (Class9336.method34602(class9336) > 1.0) {
            final Class1846 method34602 = Class8969.method31837(class9337, (int)Math.round(class9337.method6644() * Class9336.method34602(class9336)));
            if (method34602 != class9337) {
                class9337.close();
                class9337 = method34602;
            }
        }
        if (!this.field10393 && !class9336.method34591().method7797().endsWith("_leaves")) {
            this.method7518(class9337);
        }
        final int n2 = class9337.method6644() / method34599.method29305(method34600);
        final int n3 = class9337.method6645() / method34599.method29304(method34601);
        if (method34599.method29306() > 0) {
            final int n4 = method34599.method29312().stream().max(Integer::compareTo).get() + 1;
            this.field10370 = new int[n4];
            this.field10371 = new int[n4];
            Arrays.fill(this.field10370, -1);
            Arrays.fill(this.field10371, -1);
            for (final int intValue : method34599.method29312()) {
                if (intValue >= n2 * n3) {
                    throw new RuntimeException("invalid frameindex " + intValue);
                }
                final int n5 = intValue / n2;
                this.field10370[intValue] = intValue % n2;
                this.field10371[intValue] = n5;
            }
        }
        else {
            final ArrayList arrayList = Lists.newArrayList();
            final int n6 = n2 * n3;
            this.field10370 = new int[n6];
            this.field10371 = new int[n6];
            for (int i = 0; i < n3; ++i) {
                for (int j = 0; j < n2; ++j) {
                    final int n7 = i * n2 + j;
                    this.field10370[n7] = j;
                    this.field10371[n7] = i;
                    arrayList.add(new Class7272(n7, -1));
                }
            }
            method34599 = new Class8637(arrayList, method34600, method34601, method34599.method29307(), method34599.method29308());
        }
        this.field10367 = new Class9336(Class9336.method34603(class9336), method34600, method34601, method34599);
        this.field10368 = method34599;
        try {
            try {
                this.field10369 = Class8767.method30398(class9337, n);
            }
            catch (final Throwable t) {
                final CrashReport method34603 = CrashReport.makeCrashReport(t, "Generating mipmaps for frame");
                method34603.makeCategory("Frame being iterated").addDetail("First frame", () -> {
                    final StringBuilder sb = new StringBuilder();
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(class9338.method6644()).append("x").append(class9338.method6645());
                    return sb.toString();
                });
                throw new ReportedException(method34603);
            }
        }
        catch (final Throwable t2) {
            final CrashReport method34604 = CrashReport.makeCrashReport(t2, "Applying mipmap");
            final CrashReportCategory method34605 = method34604.makeCategory("Sprite being mipmapped");
            method34605.addDetail("Sprite name", () -> this.method7503().toString());
            method34605.addDetail("Sprite size", () -> this.method7495() + " x " + this.method7496());
            method34605.addDetail("Sprite frames", () -> this.method7505() + " frames");
            method34605.addDetail("Mipmap levels", n);
            throw new ReportedException(method34604);
        }
        if (method34599.method29308()) {
            this.field10372 = new Class393(this, class9336, n, null);
        }
        else {
            this.field10372 = null;
        }
        this.field10390 = n;
        this.field10382 = Math.min(this.field10375, this.field10376);
        this.field10383 = Math.min(this.field10377, this.field10378);
        this.field10384 = field10367;
        this.field10385 = field10368;
    }
    
    private void method7493(final int n) {
        this.method7494(this.field10370[n] * Class9336.method34600(this.field10367), this.field10371[n] * Class9336.method34601(this.field10367), this.field10369);
    }
    
    private void method7494(final int n, final int n2, final Class1846[] array) {
        final boolean b = false;
        final boolean field10388 = this.field10388;
        for (int i = 0; i < array.length; ++i) {
            if (this.method7495() >> i <= 0) {
                break;
            }
            if (this.method7496() >> i <= 0) {
                break;
            }
            array[i].method6654(i, this.field10373 >> i, this.field10374 >> i, n >> i, n2 >> i, Class9336.method34600(this.field10367) >> i, Class9336.method34601(this.field10367) >> i, b, field10388, array.length > 1, false);
        }
        if (this.field10387 != null) {
            this.field10387.method7494(n, n2, array);
        }
    }
    
    public int method7495() {
        return Class9336.method34600(this.field10367);
    }
    
    public int method7496() {
        return Class9336.method34601(this.field10367);
    }
    
    public float method7497() {
        return this.field10375;
    }
    
    public float method7498() {
        return this.field10376;
    }
    
    public float method7499(final double n) {
        return this.field10375 + (this.field10376 - this.field10375) * (float)n / 16.0f;
    }
    
    public float method7500() {
        return this.field10377;
    }
    
    public float method7501() {
        return this.field10378;
    }
    
    public float method7502(final double n) {
        return this.field10377 + (this.field10378 - this.field10377) * (float)n / 16.0f;
    }
    
    public ResourceLocation method7503() {
        return Class9336.method34603(this.field10367);
    }
    
    public Class1774 method7504() {
        return this.field10366;
    }
    
    public int method7505() {
        return this.field10370.length;
    }
    
    @Override
    public void close() {
        for (final Class1846 class1846 : this.field10369) {
            if (class1846 != null) {
                class1846.close();
            }
        }
        if (this.field10372 != null) {
            this.field10372.close();
        }
        if (this.field10387 == null) {}
        if (this.field10391 != null) {
            this.field10391.close();
        }
        if (this.field10392 != null) {
            this.field10392.close();
        }
    }
    
    @Override
    public String toString() {
        return "TextureAtlasSprite{name='" + Class9336.method34603(this.field10367) + '\'' + ", frameCount=" + this.field10370.length + ", x=" + this.field10373 + ", y=" + this.field10374 + ", height=" + Class9336.method34601(this.field10367) + ", width=" + Class9336.method34600(this.field10367) + ", u0=" + this.field10375 + ", u1=" + this.field10376 + ", v0=" + this.field10377 + ", v1=" + this.field10378 + '}';
    }
    
    public boolean method7506(final int n, final int n2, final int n3) {
        return (this.field10369[0].method6647(n2 + this.field10370[n] * Class9336.method34600(this.field10367), n3 + this.field10371[n] * Class9336.method34601(this.field10367)) >> 24 & 0xFF) == 0x0;
    }
    
    public void method7507() {
        this.method7493(0);
    }
    
    private float method7508() {
        return Math.max(Class9336.method34601(this.field10367) / (this.field10378 - this.field10377), Class9336.method34600(this.field10367) / (this.field10376 - this.field10375));
    }
    
    public float method7509() {
        return 4.0f / this.method7508();
    }
    
    public void method7510() {
        if (this.field10368 != null) {
            this.field10397 = (!Class7663.method24283() || Class7663.method24287(this));
            if (this.field10368.method29306() <= 1) {
                this.field10397 = false;
            }
            ++this.field10380;
            if (this.field10380 < this.field10368.method29310(this.field10379)) {
                if (this.field10372 != null) {
                    if (!this.field10397) {
                        return;
                    }
                    if (RenderSystem.method29984()) {
                        Class393.method1433(this.field10372);
                    }
                    else {
                        RenderSystem.method29991(() -> Class393.method1433(this.field10372));
                    }
                }
            }
            else {
                final int method29311 = this.field10368.method29311(this.field10379);
                this.field10379 = (this.field10379 + 1) % ((this.field10368.method29306() != 0) ? this.field10368.method29306() : this.method7505());
                this.field10380 = 0;
                final int method29312 = this.field10368.method29311(this.field10379);
                if (!this.field10397) {
                    return;
                }
                if (method29311 != method29312) {
                    if (method29312 >= 0) {
                        if (method29312 < this.method7505()) {
                            this.method7493(method29312);
                        }
                    }
                }
            }
        }
    }
    
    public boolean method7511() {
        return this.field10368.method29306() > 1;
    }
    
    public Class4150 method7512(final Class4150 class4150) {
        return new Class4151(class4150, this);
    }
    
    public int method7513() {
        return this.field10381;
    }
    
    public void method7514(final Class8891 class8891) {
        if (this.field10381 < 0) {
            if (this.field10366 != null) {
                final TextureAtlasSprite method6345 = this.field10366.method6345(this.method7503());
                if (method6345 != null) {
                    this.field10381 = method6345.method7513();
                }
            }
            if (this.field10381 < 0) {
                this.field10381 = class8891.method31287();
            }
        }
    }
    
    public int method7515() {
        return this.field10396;
    }
    
    public void method7516(final int field10396) {
        this.field10396 = field10396;
        if (this.field10387 != null) {
            this.field10387.method7516(field10396);
        }
        if (this.field10391 != null) {
            this.field10391.method7516(field10396);
        }
        if (this.field10392 != null) {
            this.field10392.method7516(field10396);
        }
    }
    
    public boolean method7517() {
        return this.field10397;
    }
    
    private void method7518(final Class1846 class1846) {
        final int[] array = new int[class1846.method6644() * class1846.method6645()];
        class1846.method6674().get(array);
        this.method7519(array);
        class1846.method6674().put(array);
    }
    
    private void method7519(final int[] array) {
        if (array != null) {
            long n = 0L;
            long n2 = 0L;
            long n3 = 0L;
            long n4 = 0L;
            for (int i = 0; i < array.length; ++i) {
                final int n5 = array[i];
                if ((n5 >> 24 & 0xFF) >= 16) {
                    final int n6 = n5 >> 16 & 0xFF;
                    final int n7 = n5 >> 8 & 0xFF;
                    final int n8 = n5 & 0xFF;
                    n += n6;
                    n2 += n7;
                    n3 += n8;
                    ++n4;
                }
            }
            if (n4 > 0L) {
                final int n9 = (int)(n / n4) << 16 | (int)(n2 / n4) << 8 | (int)(n3 / n4);
                for (int j = 0; j < array.length; ++j) {
                    if ((array[j] >> 24 & 0xFF) <= 16) {
                        array[j] = n9;
                    }
                }
            }
        }
    }
    
    public double method7520(final float n) {
        return (n - this.field10375) / (this.field10376 - this.field10375) * 16.0f;
    }
    
    public double method7521(final float n) {
        return (n - this.field10377) / (this.field10378 - this.field10377) * 16.0f;
    }
    
    public void method7522() {
        if (this.field10386 < 0) {
            Class8995.method32105(this.field10386 = Class8995.method32101(), this.field10390, this.method7495(), this.method7496());
            Class8969.method31834();
        }
        Class8969.method31835(this.field10386);
    }
    
    public void method7523() {
        if (this.field10386 >= 0) {
            Class8995.method32102(this.field10386);
            this.field10386 = -1;
        }
    }
    
    public float method7524(float n) {
        n -= this.field10382;
        n *= this.field10384 / (float)this.method7495();
        return n;
    }
    
    public float method7525(float n) {
        n -= this.field10383;
        n *= this.field10385 / (float)this.method7496();
        return n;
    }
    
    public Class1846[] method7526() {
        return this.field10369;
    }
    
    public Class8637 method7527() {
        return this.field10368;
    }
    
    public int method7528() {
        return this.field10373;
    }
    
    public int method7529() {
        return this.field10374;
    }
    
    public float method7530(final float n) {
        return (n - this.field10375) / (this.field10376 - this.field10375) * 16.0f;
    }
    
    public float method7531(final float n) {
        return (n - this.field10377) / (this.field10378 - this.field10377) * 16.0f;
    }
    
    public TextureAtlasSprite method7532() {
        final TextureAtlasSprite class1912 = new TextureAtlasSprite(this);
        class1912.field10388 = true;
        return class1912;
    }
    
    public TextureAtlasSprite method7533(final String str, final int n) {
        final ResourceLocation class1932 = new ResourceLocation(this.method7503().method7798(), this.method7503().method7797() + str);
        final ResourceLocation method6336 = this.field10366.method6336(class1932);
        TextureAtlasSprite class1933 = null;
        if (this.field10401.method19934(method6336)) {
            try (final Class1671 method6337 = this.field10401.method19933(method6336)) {
                final Class8736 class1934 = new Class8736(method6336.toString(), this.field10401.method19933(method6336).method5887());
                Class8637 field36232 = method6337.method5888((Class5092<Class8637>)Class8637.field36231);
                if (field36232 == null) {
                    field36232 = Class8637.field36232;
                }
                final Pair<Integer, Integer> method6338 = field36232.method29301(class1934.field36713, class1934.field36714);
                final Class9336 class1935 = new Class9336(class1932, (int)method6338.getFirst(), (int)method6338.getSecond(), field36232);
                Class1846 method6339 = Class1846.method6637(method6337.method5887());
                if (method6339.method6644() != this.method7495()) {
                    final Class1846 method6340 = Class8969.method31837(method6339, this.method7495());
                    if (method6340 != method6339) {
                        method6339.close();
                        method6339 = method6340;
                    }
                }
                class1933 = new TextureAtlasSprite(this.field10366, class1935, this.field10390, this.field10384, this.field10385, this.field10373, this.field10374, method6339);
            }
            catch (final IOException ex) {}
        }
        if (class1933 == null) {
            final Class1846 class1936 = new Class1846(this.method7495(), this.method7496(), false);
            class1936.method6663(0, 0, class1936.method6644(), class1936.method6645(), Class8969.method31849(n));
            class1933 = new TextureAtlasSprite(this.field10366, new Class9336(class1932, this.method7495(), this.method7496(), Class8637.field36232), this.field10390, this.field10384, this.field10385, this.field10373, this.field10374, class1936);
        }
        class1933.field10393 = true;
        return class1933;
    }
    
    public boolean method7534() {
        return this.field10398;
    }
    
    private void method7535(final boolean field10398) {
        this.field10398 = field10398;
        this.field10400 = false;
        this.field10399 = false;
        if (this.field10387 != null) {
            this.field10387.method7523();
            this.field10387 = null;
        }
        if (this.field10391 != null) {
            this.field10391.close();
            this.field10391 = null;
        }
        if (this.field10392 != null) {
            this.field10392.close();
            this.field10392 = null;
        }
        this.field10400 = Config.method28928();
        this.field10399 = Config.method28955();
        if (this.field10400) {
            if (!this.field10388) {
                this.field10387 = this.method7532();
            }
        }
        if (this.field10399) {
            if (!this.field10388) {
                if (this.field10391 == null) {
                    if (Class9216.field39313) {
                        this.field10391 = this.method7533("_n", -8421377);
                    }
                }
                if (this.field10392 == null) {
                    if (Class9216.field39314) {
                        this.field10392 = this.method7533("_s", 0);
                    }
                }
            }
        }
    }
    
    public void method7536(final Class6582 field10401) {
        this.field10401 = field10401;
        this.method7514(this.field10366.method6361());
        this.method7535(this.field10366.method6360());
    }
    
    public int method7537(final int n, final int n2, final int n3) {
        return this.field10369[0].method6647(n2 + this.field10370[n] * this.method7495(), n3 + this.field10371[n] * this.method7496());
    }
}
