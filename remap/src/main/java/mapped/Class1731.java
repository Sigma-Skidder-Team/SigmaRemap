// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.List;
import com.mojang.datafixers.util.Pair;
import java.util.Map;

public class Class1731 implements Class1727
{
    private static final Map<String, Pair<Class180, ResourceLocation>> field9670;
    private static final List<String> field9671;
    private static final Set<String> field9672;
    private static final Set<String> field9673;
    public static final ResourceLocation field9674;
    public static final ResourceLocation field9675;
    public static final ResourceLocation field9676;
    private final Class1727 field9677;
    
    public Class1731(final Class1727 field9677) {
        this.field9677 = field9677;
    }
    
    @Override
    public InputStream method6096(final String s) throws IOException {
        return this.field9677.method6096(s);
    }
    
    @Override
    public boolean method6099(final Class346 class346, final ResourceLocation class347) {
        if (!"minecraft".equals(class347.method7798())) {
            return this.field9677.method6099(class346, class347);
        }
        final String method7797 = class347.method7797();
        if ("textures/misc/enchanted_item_glint.png".equals(method7797)) {
            return false;
        }
        if ("textures/entity/iron_golem/iron_golem.png".equals(method7797)) {
            return this.field9677.method6099(class346, Class1731.field9676);
        }
        if ("textures/entity/conduit/wind.png".equals(method7797) || "textures/entity/conduit/wind_vertical.png".equals(method7797)) {
            return false;
        }
        if (Class1731.field9672.contains(method7797)) {
            return this.field9677.method6099(class346, Class1731.field9674) && this.field9677.method6099(class346, class347);
        }
        if (Class1731.field9673.contains(method7797)) {
            return this.field9677.method6099(class346, Class1731.field9675) && this.field9677.method6099(class346, class347);
        }
        final Pair pair = Class1731.field9670.get(method7797);
        return (pair != null && this.field9677.method6099(class346, (ResourceLocation)pair.getSecond())) || this.field9677.method6099(class346, class347);
    }
    
    @Override
    public InputStream method6097(final Class346 class346, final ResourceLocation class347) throws IOException {
        if (!"minecraft".equals(class347.method7798())) {
            return this.field9677.method6097(class346, class347);
        }
        final String method7797 = class347.method7797();
        if ("textures/entity/iron_golem/iron_golem.png".equals(method7797)) {
            return this.field9677.method6097(class346, Class1731.field9676);
        }
        if (Class1731.field9672.contains(method7797)) {
            final InputStream method7798 = method6116(this.field9677.method6097(class346, Class1731.field9674), this.field9677.method6097(class346, class347), 64, 2, 2, 12, 22);
            if (method7798 != null) {
                return method7798;
            }
        }
        else if (Class1731.field9673.contains(method7797)) {
            final InputStream method7799 = method6116(this.field9677.method6097(class346, Class1731.field9675), this.field9677.method6097(class346, class347), 64, 0, 0, 42, 41);
            if (method7799 != null) {
                return method7799;
            }
        }
        else {
            if ("textures/entity/enderdragon/dragon.png".equals(method7797) || "textures/entity/enderdragon/dragon_exploding.png".equals(method7797)) {
                ByteArrayInputStream byteArrayInputStream;
                try (final Class1846 method7800 = Class1846.method6637(this.field9677.method6097(class346, class347))) {
                    for (int n = method7800.method6644() / 256, i = 88 * n; i < 200 * n; ++i) {
                        for (int j = 56 * n; j < 112 * n; ++j) {
                            method7800.method6648(j, i, 0);
                        }
                    }
                    byteArrayInputStream = new ByteArrayInputStream(method7800.method6660());
                }
                return byteArrayInputStream;
            }
            if ("textures/entity/conduit/closed_eye.png".equals(method7797) || "textures/entity/conduit/open_eye.png".equals(method7797)) {
                return method6117(this.field9677.method6097(class346, class347));
            }
            final Pair pair = Class1731.field9670.get(method7797);
            if (pair != null) {
                final Class180 class348 = (Class180)pair.getFirst();
                final InputStream method7801 = this.field9677.method6097(class346, (ResourceLocation)pair.getSecond());
                if (class348 == Class180.field530) {
                    return method6120(method7801);
                }
                if (class348 == Class180.field531) {
                    return method6118(method7801);
                }
                if (class348 == Class180.field532) {
                    return method6119(method7801);
                }
            }
        }
        return this.field9677.method6097(class346, class347);
    }
    
    @Nullable
    public static InputStream method6116(final InputStream inputStream, final InputStream inputStream2, final int n, final int n2, final int n3, final int n4, final int n5) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (final Class1846 method6637 = Class1846.method6637(inputStream2);
             final Class1846 method6638 = Class1846.method6637(inputStream)) {
            final int method6639 = method6638.method6644();
            final int method6640 = method6638.method6645();
            if (method6639 != method6637.method6644() || method6640 != method6637.method6645()) {
                return null;
            }
            try (final Class1846 class1846 = new Class1846(method6639, method6640, true)) {
                for (int n6 = method6639 / n, i = n3 * n6; i < n5 * n6; ++i) {
                    for (int j = n2 * n6; j < n4 * n6; ++j) {
                        final int method6641 = Class1846.method6670(method6637.method6647(j, i));
                        final int method6642 = method6638.method6647(j, i);
                        class1846.method6648(j, i, Class1846.method6673(method6641, Class1846.method6672(method6642), Class1846.method6671(method6642), Class1846.method6670(method6642)));
                    }
                }
                byteArrayInputStream = new ByteArrayInputStream(class1846.method6660());
            }
        }
        return byteArrayInputStream;
    }
    
    public static InputStream method6117(final InputStream inputStream) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (final Class1846 method6637 = Class1846.method6637(inputStream)) {
            final int method6638 = method6637.method6644();
            final int method6639 = method6637.method6645();
            try (final Class1846 class1846 = new Class1846(2 * method6638, 2 * method6639, true)) {
                method6121(method6637, class1846, 0, 0, 0, 0, method6638, method6639, 1, false, false);
                byteArrayInputStream = new ByteArrayInputStream(class1846.method6660());
            }
        }
        return byteArrayInputStream;
    }
    
    public static InputStream method6118(final InputStream inputStream) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (final Class1846 method6637 = Class1846.method6637(inputStream)) {
            final int method6638 = method6637.method6644();
            final int method6639 = method6637.method6645();
            try (final Class1846 class1846 = new Class1846(method6638 / 2, method6639, true)) {
                final int n = method6639 / 64;
                method6121(method6637, class1846, 29, 0, 29, 0, 15, 14, n, false, true);
                method6121(method6637, class1846, 59, 0, 14, 0, 15, 14, n, false, true);
                method6121(method6637, class1846, 29, 14, 43, 14, 15, 5, n, true, true);
                method6121(method6637, class1846, 44, 14, 29, 14, 14, 5, n, true, true);
                method6121(method6637, class1846, 58, 14, 14, 14, 15, 5, n, true, true);
                method6121(method6637, class1846, 29, 19, 29, 19, 15, 14, n, false, true);
                method6121(method6637, class1846, 59, 19, 14, 19, 15, 14, n, false, true);
                method6121(method6637, class1846, 29, 33, 43, 33, 15, 10, n, true, true);
                method6121(method6637, class1846, 44, 33, 29, 33, 14, 10, n, true, true);
                method6121(method6637, class1846, 58, 33, 14, 33, 15, 10, n, true, true);
                method6121(method6637, class1846, 2, 0, 2, 0, 1, 1, n, false, true);
                method6121(method6637, class1846, 4, 0, 1, 0, 1, 1, n, false, true);
                method6121(method6637, class1846, 2, 1, 3, 1, 1, 4, n, true, true);
                method6121(method6637, class1846, 3, 1, 2, 1, 1, 4, n, true, true);
                method6121(method6637, class1846, 4, 1, 1, 1, 1, 4, n, true, true);
                byteArrayInputStream = new ByteArrayInputStream(class1846.method6660());
            }
        }
        return byteArrayInputStream;
    }
    
    public static InputStream method6119(final InputStream inputStream) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (final Class1846 method6637 = Class1846.method6637(inputStream)) {
            final int method6638 = method6637.method6644();
            final int method6639 = method6637.method6645();
            try (final Class1846 class1846 = new Class1846(method6638 / 2, method6639, true)) {
                final int n = method6639 / 64;
                method6121(method6637, class1846, 14, 0, 29, 0, 15, 14, n, false, true);
                method6121(method6637, class1846, 44, 0, 14, 0, 15, 14, n, false, true);
                method6121(method6637, class1846, 0, 14, 0, 14, 14, 5, n, true, true);
                method6121(method6637, class1846, 14, 14, 43, 14, 15, 5, n, true, true);
                method6121(method6637, class1846, 73, 14, 14, 14, 15, 5, n, true, true);
                method6121(method6637, class1846, 14, 19, 29, 19, 15, 14, n, false, true);
                method6121(method6637, class1846, 44, 19, 14, 19, 15, 14, n, false, true);
                method6121(method6637, class1846, 0, 33, 0, 33, 14, 10, n, true, true);
                method6121(method6637, class1846, 14, 33, 43, 33, 15, 10, n, true, true);
                method6121(method6637, class1846, 73, 33, 14, 33, 15, 10, n, true, true);
                method6121(method6637, class1846, 1, 0, 2, 0, 1, 1, n, false, true);
                method6121(method6637, class1846, 3, 0, 1, 0, 1, 1, n, false, true);
                method6121(method6637, class1846, 0, 1, 0, 1, 1, 4, n, true, true);
                method6121(method6637, class1846, 1, 1, 3, 1, 1, 4, n, true, true);
                method6121(method6637, class1846, 5, 1, 1, 1, 1, 4, n, true, true);
                byteArrayInputStream = new ByteArrayInputStream(class1846.method6660());
            }
        }
        return byteArrayInputStream;
    }
    
    public static InputStream method6120(final InputStream inputStream) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        try (final Class1846 method6637 = Class1846.method6637(inputStream)) {
            final int method6638 = method6637.method6644();
            final int method6639 = method6637.method6645();
            try (final Class1846 class1846 = new Class1846(method6638, method6639, true)) {
                final int n = method6639 / 64;
                method6121(method6637, class1846, 14, 0, 28, 0, 14, 14, n, false, true);
                method6121(method6637, class1846, 28, 0, 14, 0, 14, 14, n, false, true);
                method6121(method6637, class1846, 0, 14, 0, 14, 14, 5, n, true, true);
                method6121(method6637, class1846, 14, 14, 42, 14, 14, 5, n, true, true);
                method6121(method6637, class1846, 28, 14, 28, 14, 14, 5, n, true, true);
                method6121(method6637, class1846, 42, 14, 14, 14, 14, 5, n, true, true);
                method6121(method6637, class1846, 14, 19, 28, 19, 14, 14, n, false, true);
                method6121(method6637, class1846, 28, 19, 14, 19, 14, 14, n, false, true);
                method6121(method6637, class1846, 0, 33, 0, 33, 14, 10, n, true, true);
                method6121(method6637, class1846, 14, 33, 42, 33, 14, 10, n, true, true);
                method6121(method6637, class1846, 28, 33, 28, 33, 14, 10, n, true, true);
                method6121(method6637, class1846, 42, 33, 14, 33, 14, 10, n, true, true);
                method6121(method6637, class1846, 1, 0, 3, 0, 2, 1, n, false, true);
                method6121(method6637, class1846, 3, 0, 1, 0, 2, 1, n, false, true);
                method6121(method6637, class1846, 0, 1, 0, 1, 1, 4, n, true, true);
                method6121(method6637, class1846, 1, 1, 4, 1, 2, 4, n, true, true);
                method6121(method6637, class1846, 3, 1, 3, 1, 1, 4, n, true, true);
                method6121(method6637, class1846, 4, 1, 1, 1, 2, 4, n, true, true);
                byteArrayInputStream = new ByteArrayInputStream(class1846.method6660());
            }
        }
        return byteArrayInputStream;
    }
    
    @Override
    public Collection<ResourceLocation> method6098(final Class346 class346, final String s, final String s2, final int n, final Predicate<String> predicate) {
        return this.field9677.method6098(class346, s, s2, n, predicate);
    }
    
    @Override
    public Set<String> method6100(final Class346 class346) {
        return this.field9677.method6100(class346);
    }
    
    @Nullable
    @Override
    public <T> T method6101(final Class5092<T> class5092) throws IOException {
        return this.field9677.method6101(class5092);
    }
    
    @Override
    public String method6102() {
        return this.field9677.method6102();
    }
    
    @Override
    public void close() throws IOException {
        this.field9677.close();
    }
    
    private static void method6121(final Class1846 class1846, final Class1846 class1847, int n, int n2, int n3, int n4, int n5, int n6, final int n7, final boolean b, final boolean b2) {
        n6 *= n7;
        n5 *= n7;
        n3 *= n7;
        n4 *= n7;
        n *= n7;
        n2 *= n7;
        for (int i = 0; i < n6; ++i) {
            for (int j = 0; j < n5; ++j) {
                class1847.method6648(n3 + j, n4 + i, class1846.method6647(n + (b ? (n5 - 1 - j) : j), n2 + (b2 ? (n6 - 1 - i) : i)));
            }
        }
    }
    
    static {
        field9670 = Util.method27851(Maps.newHashMap(), hashMap -> {
            new Pair(Class180.field531, new ResourceLocation("textures/entity/chest/normal_double.png"));
            final Pair value;
            final Object key;
            hashMap.put(key, value);
            new Pair(Class180.field532, new ResourceLocation("textures/entity/chest/normal_double.png"));
            final Pair value2;
            final Object key2;
            hashMap.put(key2, value2);
            new Pair(Class180.field530, new ResourceLocation("textures/entity/chest/normal.png"));
            final Pair value3;
            final Object key3;
            hashMap.put(key3, value3);
            new Pair(Class180.field531, new ResourceLocation("textures/entity/chest/trapped_double.png"));
            final Pair value4;
            final Object key4;
            hashMap.put(key4, value4);
            new Pair(Class180.field532, new ResourceLocation("textures/entity/chest/trapped_double.png"));
            final Pair value5;
            final Object key5;
            hashMap.put(key5, value5);
            new Pair(Class180.field530, new ResourceLocation("textures/entity/chest/trapped.png"));
            final Pair value6;
            final Object key6;
            hashMap.put(key6, value6);
            new Pair(Class180.field531, new ResourceLocation("textures/entity/chest/christmas_double.png"));
            final Pair value7;
            final Object key7;
            hashMap.put(key7, value7);
            new Pair(Class180.field532, new ResourceLocation("textures/entity/chest/christmas_double.png"));
            final Pair value8;
            final Object key8;
            hashMap.put(key8, value8);
            new Pair(Class180.field530, new ResourceLocation("textures/entity/chest/christmas.png"));
            final Pair value9;
            final Object key9;
            hashMap.put(key9, value9);
            new Pair(Class180.field530, new ResourceLocation("textures/entity/chest/ender.png"));
            final Pair value10;
            final Object key10;
            hashMap.put(key10, value10);
        });
        field9671 = Lists.newArrayList((Object[])new String[] { "base", "border", "bricks", "circle", "creeper", "cross", "curly_border", "diagonal_left", "diagonal_right", "diagonal_up_left", "diagonal_up_right", "flower", "globe", "gradient", "gradient_up", "half_horizontal", "half_horizontal_bottom", "half_vertical", "half_vertical_right", "mojang", "rhombus", "skull", "small_stripes", "square_bottom_left", "square_bottom_right", "square_top_left", "square_top_right", "straight_cross", "stripe_bottom", "stripe_center", "stripe_downleft", "stripe_downright", "stripe_left", "stripe_middle", "stripe_right", "stripe_top", "triangle_bottom", "triangle_top", "triangles_bottom", "triangles_top" });
        field9672 = Class1731.field9671.stream().map(str -> "textures/entity/shield/" + str + ".png").collect((Collector<? super Object, ?, Set<String>>)Collectors.toSet());
        field9673 = Class1731.field9671.stream().map(str2 -> "textures/entity/banner/" + str2 + ".png").collect((Collector<? super Object, ?, Set<String>>)Collectors.toSet());
        field9674 = new ResourceLocation("textures/entity/shield_base.png");
        field9675 = new ResourceLocation("textures/entity/banner_base.png");
        field9676 = new ResourceLocation("textures/entity/iron_golem.png");
    }
}
