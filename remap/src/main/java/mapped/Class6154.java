// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.HashSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.Map;
import java.util.List;
import java.util.Random;

public class Class6154
{
    private final boolean field24894;
    private final Class2196 field24895;
    private final Random field24896;
    private final Class1847 field24897;
    private final double field24898;
    private final double field24899;
    private final double field24900;
    private final Entity field24901;
    private final float field24902;
    private Class7929 field24903;
    private final List<BlockPos> field24904;
    private final Map<Class512, Vec3d> field24905;
    
    public Class6154(final Class1847 class1847, final Entity class1848, final double n, final double n2, final double n3, final float n4, final List<BlockPos> list) {
        this(class1847, class1848, n, n2, n3, n4, false, Class2196.field13367, list);
    }
    
    public Class6154(final Class1847 class1847, final Entity class1848, final double n, final double n2, final double n3, final float n4, final boolean b, final Class2196 class1849, final List<BlockPos> list) {
        this(class1847, class1848, n, n2, n3, n4, b, class1849);
        this.field24904.addAll(list);
    }
    
    public Class6154(final Class1847 field24897, final Entity field24898, final double field24899, final double field24900, final double field24901, final float field24902, final boolean field24903, final Class2196 field24904) {
        this.field24896 = new Random();
        this.field24904 = Lists.newArrayList();
        this.field24905 = Maps.newHashMap();
        this.field24897 = field24897;
        this.field24901 = field24898;
        this.field24902 = field24902;
        this.field24898 = field24899;
        this.field24899 = field24900;
        this.field24900 = field24901;
        this.field24894 = field24903;
        this.field24895 = field24904;
        this.field24903 = Class7929.method25702(this);
    }
    
    public static float method18407(final Vec3d class5487, final Entity class5488) {
        final Class6221 method1886 = class5488.method1886();
        final double n = 1.0 / ((method1886.field25076 - method1886.field25073) * 2.0 + 1.0);
        final double n2 = 1.0 / ((method1886.field25077 - method1886.field25074) * 2.0 + 1.0);
        final double n3 = 1.0 / ((method1886.field25078 - method1886.field25075) * 2.0 + 1.0);
        final double n4 = (1.0 - Math.floor(1.0 / n) * n) / 2.0;
        final double n5 = (1.0 - Math.floor(1.0 / n3) * n3) / 2.0;
        if (n >= 0.0) {
            if (n2 >= 0.0) {
                if (n3 >= 0.0) {
                    int n6 = 0;
                    int n7 = 0;
                    for (float n8 = 0.0f; n8 <= 1.0f; n8 += (float)n) {
                        for (float n9 = 0.0f; n9 <= 1.0f; n9 += (float)n2) {
                            for (float n10 = 0.0f; n10 <= 1.0f; n10 += (float)n3) {
                                if (class5488.field2391.method6987(new Class8478(new Vec3d(MathHelper.method35701(n8, method1886.field25073, method1886.field25076) + n4, MathHelper.method35701(n9, method1886.field25074, method1886.field25077), MathHelper.method35701(n10, method1886.field25075, method1886.field25078) + n5), class5487, Class2040.field11633, Class2191.field13325, class5488)).method21449() == Class2165.field12880) {
                                    ++n6;
                                }
                                ++n7;
                            }
                        }
                    }
                    return n6 / (float)n7;
                }
            }
        }
        return 0.0f;
    }
    
    public void method18408() {
        final HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i != 0) {
                        if (i != 15) {
                            if (j != 0) {
                                if (j != 15) {
                                    if (k != 0) {
                                        if (k != 15) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final double n = i / 15.0f * 2.0f - 1.0f;
                    final double n2 = j / 15.0f * 2.0f - 1.0f;
                    final double n3 = k / 15.0f * 2.0f - 1.0f;
                    final double sqrt = Math.sqrt(n * n + n2 * n2 + n3 * n3);
                    final double n4 = n / sqrt;
                    final double n5 = n2 / sqrt;
                    final double n6 = n3 / sqrt;
                    float n7 = this.field24902 * (0.7f + this.field24897.field10062.nextFloat() * 0.6f);
                    double field24898 = this.field24898;
                    double field24899 = this.field24899;
                    double field24900 = this.field24900;
                    while (n7 > 0.0f) {
                        final BlockPos class354 = new BlockPos(field24898, field24899, field24900);
                        final Class7096 method6701 = this.field24897.method6701(class354);
                        final Class7099 method6702 = this.field24897.method6702(class354);
                        if (!method6701.method21706() || !method6702.method21781()) {
                            float n8 = Math.max(method6701.method21696().method11841(), method6702.method21794());
                            if (this.field24901 != null) {
                                n8 = this.field24901.method1856(this, this.field24897, class354, method6701, method6702, n8);
                            }
                            n7 -= (n8 + 0.3f) * 0.3f;
                        }
                        if (n7 > 0.0f) {
                            if (this.field24901 == null || this.field24901.method1857(this, this.field24897, class354, method6701, n7)) {
                                hashSet.add(class354);
                            }
                        }
                        field24898 += n4 * 0.30000001192092896;
                        field24899 += n5 * 0.30000001192092896;
                        field24900 += n6 * 0.30000001192092896;
                        n7 -= 0.22500001f;
                    }
                }
            }
        }
        this.field24904.addAll(hashSet);
        final float n9 = this.field24902 * 2.0f;
        final List<Entity> method6703 = this.field24897.method7127(this.field24901, new Class6221(MathHelper.floor(this.field24898 - n9 - 1.0), MathHelper.floor(this.field24899 - n9 - 1.0), MathHelper.floor(this.field24900 - n9 - 1.0), MathHelper.floor(this.field24898 + n9 + 1.0), MathHelper.floor(this.field24899 + n9 + 1.0), MathHelper.floor(this.field24900 + n9 + 1.0)));
        final Vec3d class355 = new Vec3d(this.field24898, this.field24899, this.field24900);
        for (int l = 0; l < method6703.size(); ++l) {
            final Entity class356 = method6703.get(l);
            if (!class356.method1899()) {
                final double n10 = MathHelper.method35641(class356.method1735(class355)) / n9;
                if (n10 <= 1.0) {
                    final double n11 = class356.method1938() - this.field24898;
                    final double n12 = class356.method1944() - this.field24899;
                    final double n13 = class356.method1945() - this.field24900;
                    final double n14 = MathHelper.method35641(n11 * n11 + n12 * n12 + n13 * n13);
                    if (n14 != 0.0) {
                        final double n15 = n11 / n14;
                        final double n16 = n12 / n14;
                        final double n17 = n13 / n14;
                        final double n18 = (1.0 - n10) * method18407(class355, class356);
                        class356.method1740(this.method18411(), (float)(int)((n18 * n18 + n18) / 2.0 * 7.0 * n9 + 1.0));
                        double method6704 = n18;
                        if (class356 instanceof Class511) {
                            method6704 = Class6269.method18608((Class511)class356, n18);
                        }
                        class356.method1936(class356.method1935().method16744(n15 * method6704, n16 * method6704, n17 * method6704));
                        if (class356 instanceof Class512) {
                            final Class512 class357 = (Class512)class356;
                            if (!class357.method1639()) {
                                if (!class357.method2889() || !class357.field3025.field27302) {
                                    this.field24905.put(class357, new Vec3d(n15 * n18, n16 * n18, n17 * n18));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void method18409(final boolean b) {
        if (this.field24897.field10067) {
            this.field24897.method6708(this.field24898, this.field24899, this.field24900, Class8520.field35218, Class286.field1582, 4.0f, (1.0f + (this.field24897.field10062.nextFloat() - this.field24897.field10062.nextFloat()) * 0.2f) * 0.7f, false);
        }
        final boolean b2 = this.field24895 != Class2196.field13365;
        if (b) {
            if (this.field24902 >= 2.0f && b2) {
                this.field24897.method6709(Class8432.field34618, this.field24898, this.field24899, this.field24900, 1.0, 0.0, 0.0);
            }
            else {
                this.field24897.method6709(Class8432.field34619, this.field24898, this.field24899, this.field24900, 1.0, 0.0, 0.0);
            }
        }
        if (b2) {
            final ObjectArrayList list = new ObjectArrayList();
            Collections.shuffle(this.field24904, this.field24897.field10062);
            for (final BlockPos class354 : this.field24904) {
                final Class7096 method6701 = this.field24897.method6701(class354);
                final Class3833 method6702 = method6701.method21696();
                if (method6701.method21706()) {
                    continue;
                }
                class354.method1153();
                this.field24897.method6796().method15297("explosion_blocks");
                if (method6702.method11872(this)) {
                    if (this.field24897 instanceof Class1849) {
                        final Class9098 method6703 = new Class9098((Class1849)this.field24897).method32873(this.field24897.field10062).method32877(Class6683.field26367, class354).method32877(Class6683.field26370, Class8321.field34174).method32878(Class6683.field26369, method6702.method11802() ? this.field24897.method6727(class354) : null).method32878(Class6683.field26362, this.field24901);
                        if (this.field24895 == Class2196.field13367) {
                            method6703.method32877(Class6683.field26371, this.field24902);
                        }
                        method6701.method21743(method6703).forEach(class357 -> method18410((ObjectArrayList<Pair<Class8321, BlockPos>>)list2, class357, class356));
                    }
                }
                this.field24897.method6688(class354, Class7521.field29147.method11878(), 3);
                method6702.method11842(this.field24897, class354, this);
                this.field24897.method6796().method15299();
            }
            for (final Pair pair : list) {
                Class3833.method11839(this.field24897, (BlockPos)pair.getSecond(), (Class8321)pair.getFirst());
            }
        }
        if (this.field24894) {
            for (final BlockPos class355 : this.field24904) {
                if (this.field24896.nextInt(3) != 0) {
                    continue;
                }
                if (!this.field24897.method6701(class355).method21706()) {
                    continue;
                }
                if (!this.field24897.method6701(class355.method1139()).method21722(this.field24897, class355.method1139())) {
                    continue;
                }
                this.field24897.method6692(class355, Class7521.field29289.method11878());
            }
        }
    }
    
    private static void method18410(final ObjectArrayList<Pair<Class8321, BlockPos>> list, final Class8321 class8321, final BlockPos class8322) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Pair pair = (Pair)list.get(i);
            final Class8321 class8323 = (Class8321)pair.getFirst();
            if (Class427.method2103(class8323, class8321)) {
                list.set(i, (Object)Pair.of((Object)Class427.method2104(class8323, class8321, 16), pair.getSecond()));
                if (class8321.method27620()) {
                    return;
                }
            }
        }
        list.add((Object)Pair.of((Object)class8321, (Object)class8322));
    }
    
    public Class7929 method18411() {
        return this.field24903;
    }
    
    public void method18412(final Class7929 field24903) {
        this.field24903 = field24903;
    }
    
    public Map<Class512, Vec3d> method18413() {
        return this.field24905;
    }
    
    @Nullable
    public Class511 method18414() {
        if (this.field24901 == null) {
            return null;
        }
        if (this.field24901 instanceof Class510) {
            return ((Class510)this.field24901).method2614();
        }
        if (!(this.field24901 instanceof Class511)) {
            return (this.field24901 instanceof Class419) ? ((Class419)this.field24901).field2527 : null;
        }
        return (Class511)this.field24901;
    }
    
    public void method18415() {
        this.field24904.clear();
    }
    
    public List<BlockPos> method18416() {
        return this.field24904;
    }
}
