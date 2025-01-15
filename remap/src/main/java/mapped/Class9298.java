// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.concurrent.CompletionStage;
import java.util.Optional;
import javax.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import com.mojang.datafixers.util.Either;
import net.minecraft.util.math.MathHelper;

public class Class9298
{
    private static String[] field39870;
    public static final Either<Class1860, Class6797> field39871;
    public static final CompletableFuture<Either<Class1860, Class6797>> field39872;
    public static final Either<Class1862, Class6797> field39873;
    private static final CompletableFuture<Either<Class1862, Class6797>> field39874;
    private static final List<Class9312> field39875;
    private static final Class2152[] field39876;
    private final AtomicReferenceArray<CompletableFuture<Either<Class1860, Class6797>>> field39877;
    private volatile CompletableFuture<Either<Class1862, Class6797>> field39878;
    private volatile CompletableFuture<Either<Class1862, Class6797>> field39879;
    private volatile CompletableFuture<Either<Class1862, Class6797>> field39880;
    private CompletableFuture<Class1860> field39881;
    private int field39882;
    private int field39883;
    private int field39884;
    private final Class7859 field39885;
    private final short[] field39886;
    private int field39887;
    private int field39888;
    private int field39889;
    private int field39890;
    private int field39891;
    private final Class1886 field39892;
    private final Class1911 field39893;
    private final Class389 field39894;
    private boolean field39895;
    
    public Class9298(final Class7859 field39885, final int n, final Class1886 field39886, final Class1911 field39887, final Class389 field39888) {
        this.field39877 = new AtomicReferenceArray<CompletableFuture<Either<Class1860, Class6797>>>(Class9298.field39875.size());
        this.field39878 = Class9298.field39874;
        this.field39879 = Class9298.field39874;
        this.field39880 = Class9298.field39874;
        this.field39881 = CompletableFuture.completedFuture((Class1860)null);
        this.field39886 = new short[64];
        this.field39885 = field39885;
        this.field39892 = field39886;
        this.field39893 = field39887;
        this.field39894 = field39888;
        this.field39882 = Class388.field2249 + 1;
        this.field39883 = this.field39882;
        this.field39884 = this.field39882;
        this.method34361(n);
    }
    
    public CompletableFuture<Either<Class1860, Class6797>> method34340(final Class9312 class9312) {
        final CompletableFuture completableFuture = this.field39877.get(class9312.method34442());
        return (completableFuture != null) ? completableFuture : Class9298.field39872;
    }
    
    public CompletableFuture<Either<Class1860, Class6797>> method34341(final Class9312 class9312) {
        return method34363(this.field39883).method34451(class9312) ? this.method34340(class9312) : Class9298.field39872;
    }
    
    public CompletableFuture<Either<Class1862, Class6797>> method34342() {
        return this.field39879;
    }
    
    public CompletableFuture<Either<Class1862, Class6797>> method34343() {
        return this.field39880;
    }
    
    public CompletableFuture<Either<Class1862, Class6797>> method34344() {
        return this.field39878;
    }
    
    @Nullable
    public Class1862 method34345() {
        final Either either = this.method34342().getNow(null);
        return (either != null) ? either.left().orElse(null) : null;
    }
    
    @Nullable
    public Class9312 method34346() {
        for (int i = Class9298.field39875.size() - 1; i >= 0; --i) {
            final Class9312 class9312 = Class9298.field39875.get(i);
            if (this.method34340(class9312).getNow(Class9298.field39871).left().isPresent()) {
                return class9312;
            }
        }
        return null;
    }
    
    @Nullable
    public Class1860 method34347() {
        for (int i = Class9298.field39875.size() - 1; i >= 0; --i) {
            final CompletableFuture<Either<Class1860, Class6797>> method34340 = this.method34340(Class9298.field39875.get(i));
            if (!method34340.isCompletedExceptionally()) {
                final Optional left = method34340.getNow(Class9298.field39871).left();
                if (left.isPresent()) {
                    return (Class1860)left.get();
                }
            }
        }
        return null;
    }
    
    public CompletableFuture<Class1860> method34348() {
        return this.field39881;
    }
    
    public void method34349(final int n, final int n2, final int n3) {
        if (this.method34345() != null) {
            this.field39888 |= 1 << (n2 >> 4);
            if (this.field39887 < 64) {
                final short n4 = (short)(n << 12 | n3 << 8 | n2);
                for (int i = 0; i < this.field39887; ++i) {
                    if (this.field39886[i] == n4) {
                        return;
                    }
                }
                this.field39886[this.field39887++] = n4;
            }
        }
    }
    
    public void method34350(final Class237 class237, final int n) {
        final Class1862 method34345 = this.method34345();
        if (method34345 != null) {
            method34345.method7025(true);
            if (class237 != Class237.field911) {
                this.field39890 |= 1 << n + 1;
            }
            else {
                this.field39891 |= 1 << n + 1;
            }
        }
    }
    
    public void method34351(final Class1862 class1862) {
        if (this.field39887 == 0) {
            if (this.field39891 == 0) {
                if (this.field39890 == 0) {
                    return;
                }
            }
        }
        final Class1847 method7065 = class1862.method7065();
        if (this.field39887 == 64) {
            this.field39889 = -1;
        }
        if (this.field39891 != 0 || this.field39890 != 0) {
            this.method34353(new Class4349(class1862.method7019(), this.field39892, this.field39891 & ~this.field39889, this.field39890 & ~this.field39889), true);
            final int n = this.field39891 & this.field39889;
            final int n2 = this.field39890 & this.field39889;
            if (n != 0 || n2 != 0) {
                this.method34353(new Class4349(class1862.method7019(), this.field39892, n, n2), false);
            }
            this.field39891 = 0;
            this.field39890 = 0;
            this.field39889 &= ~(this.field39891 & this.field39890);
        }
        if (this.field39887 != 1) {
            if (this.field39887 != 64) {
                if (this.field39887 != 0) {
                    this.method34353(new Class4312(this.field39887, this.field39886, class1862), false);
                    for (int i = 0; i < this.field39887; ++i) {
                        final BlockPos class1863 = new BlockPos((this.field39886[i] >> 12 & 0xF) + this.field39885.field32290 * 16, this.field39886[i] & 0xFF, (this.field39886[i] >> 8 & 0xF) + this.field39885.field32291 * 16);
                        if (method7065.method6701(class1863).method21696().method11802()) {
                            this.method34352(method7065, class1863);
                        }
                    }
                }
            }
            else {
                this.method34353(new Class4298(class1862, this.field39888), false);
            }
        }
        else {
            final BlockPos class1864 = new BlockPos((this.field39886[0] >> 12 & 0xF) + this.field39885.field32290 * 16, this.field39886[0] & 0xFF, (this.field39886[0] >> 8 & 0xF) + this.field39885.field32291 * 16);
            this.method34353(new Class4271(method7065, class1864), false);
            if (method7065.method6701(class1864).method21696().method11802()) {
                this.method34352(method7065, class1864);
            }
        }
        this.field39887 = 0;
        this.field39888 = 0;
    }
    
    private void method34352(final Class1847 class1847, final BlockPos class1848) {
        final Class436 method6727 = class1847.method6727(class1848);
        if (method6727 != null) {
            final Class4357 method6728 = method6727.method2195();
            if (method6728 != null) {
                this.method34353(method6728, false);
            }
        }
    }
    
    private void method34353(final Class4252<?> class4252, final boolean b) {
        this.field39894.method1351(this.field39885, b).forEach(class4254 -> class4254.field3039.method17469(class4253));
    }
    
    public CompletableFuture<Either<Class1860, Class6797>> method34354(final Class9312 class9312, final Class388 class9313) {
        final int method34442 = class9312.method34442();
        final CompletableFuture completableFuture = this.field39877.get(method34442);
        if (completableFuture != null) {
            final Either either = (Either)completableFuture.getNow(null);
            if (either == null || either.left().isPresent()) {
                return completableFuture;
            }
        }
        if (!method34363(this.field39883).method34451(class9312)) {
            return (completableFuture != null) ? completableFuture : Class9298.field39872;
        }
        final CompletableFuture<Either<Class1860, Class6797>> method34443 = class9313.method1328(this, class9312);
        this.method34355(method34443);
        this.field39877.set(method34442, method34443);
        return method34443;
    }
    
    private void method34355(final CompletableFuture<? extends Either<? extends Class1860, Class6797>> other) {
        this.field39881 = this.field39881.thenCombine((CompletionStage<?>)other, (p0, either) -> either.map(class1860 -> class1860, p1 -> class1861));
    }
    
    public Class2152 method34356() {
        return method34364(this.field39883);
    }
    
    public Class7859 method34357() {
        return this.field39885;
    }
    
    public int method34358() {
        return this.field39883;
    }
    
    public int method34359() {
        return this.field39884;
    }
    
    private void method34360(final int field39884) {
        this.field39884 = field39884;
    }
    
    public void method34361(final int field39883) {
        this.field39883 = field39883;
    }
    
    public void method34362(final Class388 class388) {
        final Class9312 method34363 = method34363(this.field39882);
        final Class9312 method34364 = method34363(this.field39883);
        final boolean b = this.field39882 <= Class388.field2249;
        final boolean b2 = this.field39883 <= Class388.field2249;
        final Class2152 method34365 = method34364(this.field39882);
        final Class2152 method34366 = method34364(this.field39883);
        if (b) {
            final Either right = Either.right((Object)new Class6800(this));
            for (int i = b2 ? (method34364.method34442() + 1) : 0; i <= method34363.method34442(); ++i) {
                final CompletableFuture completableFuture = this.field39877.get(i);
                if (completableFuture == null) {
                    this.field39877.set(i, CompletableFuture.completedFuture(right));
                }
                else {
                    completableFuture.complete(right);
                }
            }
        }
        final boolean method34367 = method34365.method8321(Class2152.field12787);
        final boolean method34368 = method34366.method8321(Class2152.field12787);
        this.field39895 |= method34368;
        if (!method34367) {
            if (method34368) {
                this.method34355(this.field39878 = class388.method1335(this));
            }
        }
        if (method34367) {
            if (!method34368) {
                final CompletableFuture<Either<Class1862, Class6797>> field39878 = this.field39878;
                this.field39878 = Class9298.field39874;
                this.method34355((CompletableFuture<? extends Either<? extends Class1860, Class6797>>)field39878.thenApply(either -> either.ifLeft((Consumer)class389::method1359)));
            }
        }
        final boolean method34369 = method34365.method8321(Class2152.field12788);
        final boolean method34370 = method34366.method8321(Class2152.field12788);
        if (!method34369) {
            if (method34370) {
                this.method34355(this.field39879 = class388.method1334(this));
            }
        }
        if (method34369) {
            if (!method34370) {
                this.field39879.complete(Class9298.field39873);
                this.field39879 = Class9298.field39874;
            }
        }
        final boolean method34371 = method34365.method8321(Class2152.field12789);
        final boolean method34372 = method34366.method8321(Class2152.field12789);
        if (!method34371) {
            if (method34372) {
                if (this.field39880 != Class9298.field39874) {
                    throw Class8349.method27859(new IllegalStateException());
                }
                this.method34355(this.field39880 = class388.method1321(this.field39885));
            }
        }
        if (method34371) {
            if (!method34372) {
                this.field39880.complete(Class9298.field39873);
                this.field39880 = Class9298.field39874;
            }
        }
        this.field39893.method7468(this.field39885, this::method34359, this.field39883, this::method34360);
        this.field39882 = this.field39883;
    }
    
    public static Class9312 method34363(final int n) {
        return (n >= 33) ? Class9312.method34439(n - 33) : Class9312.field39989;
    }
    
    public static Class2152 method34364(final int n) {
        return Class9298.field39876[MathHelper.method35651(33 - n + 1, 0, Class9298.field39876.length - 1)];
    }
    
    public boolean method34365() {
        return this.field39895;
    }
    
    public void method34366() {
        this.field39895 = method34364(this.field39883).method8321(Class2152.field12787);
    }
    
    public void method34367(final Class1866 class1866) {
        for (int i = 0; i < this.field39877.length(); ++i) {
            final CompletableFuture completableFuture = this.field39877.get(i);
            if (completableFuture != null) {
                final Optional left = ((Either)completableFuture.getNow(Class9298.field39871)).left();
                if (left.isPresent()) {
                    if (left.get() instanceof Class1865) {
                        this.field39877.set(i, CompletableFuture.completedFuture(Either.left((Object)class1866)));
                    }
                }
            }
        }
        this.method34355((CompletableFuture<? extends Either<? extends Class1860, Class6797>>)CompletableFuture.completedFuture(Either.left((Object)class1866.method7114())));
    }
    
    static {
        field39871 = Either.right((Object)Class6797.field26732);
        field39872 = CompletableFuture.completedFuture(Class9298.field39871);
        field39873 = Either.right((Object)Class6797.field26732);
        field39874 = CompletableFuture.completedFuture(Class9298.field39873);
        field39875 = Class9312.method34437();
        field39876 = Class2152.values();
    }
}
