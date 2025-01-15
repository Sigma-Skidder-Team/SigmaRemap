// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Set;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.function.Function;
import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.EnumSet;

public class Class9312
{
    private static final EnumSet<Class2020> field39974;
    private static final EnumSet<Class2020> field39975;
    private static final Class9405 field39976;
    public static final Class9312 field39977;
    public static final Class9312 field39978;
    public static final Class9312 field39979;
    public static final Class9312 field39980;
    public static final Class9312 field39981;
    public static final Class9312 field39982;
    public static final Class9312 field39983;
    public static final Class9312 field39984;
    public static final Class9312 field39985;
    public static final Class9312 field39986;
    public static final Class9312 field39987;
    public static final Class9312 field39988;
    public static final Class9312 field39989;
    private static final List<Class9312> field39990;
    private static final IntList field39991;
    private final String field39992;
    private final int field39993;
    private final Class9312 field39994;
    private final Class7943 field39995;
    private final Class9405 field39996;
    private final int field39997;
    private final Class260 field39998;
    private final EnumSet<Class2020> field39999;
    
    private static CompletableFuture<Either<Class1860, Class6797>> method34433(final Class9312 class9312, final Class1885 class9313, final Class1860 class9314) {
        final boolean method34438 = method34438(class9312, class9314);
        if (!class9314.method7027().method34451(class9312)) {
            ((Class1865)class9314).method7098(class9312);
        }
        return (CompletableFuture<Either<Class1860, Class6797>>)class9313.method7260(class9314, method34438).thenApply((Function<? super Class1860, ?>)Either::left);
    }
    
    private static Class9312 method34434(final String s, final Class9312 class9312, final int n, final EnumSet<Class2020> set, final Class260 class9313, final Class7942 class9314) {
        return method34435(s, class9312, n, set, class9313, class9314);
    }
    
    private static Class9312 method34435(final String s, final Class9312 class9312, final int n, final EnumSet<Class2020> set, final Class260 class9313, final Class7943 class9314) {
        return method34436(s, class9312, n, set, class9313, class9314, Class9312.field39976);
    }
    
    private static Class9312 method34436(final String s, final Class9312 class9312, final int n, final EnumSet<Class2020> set, final Class260 class9313, final Class7943 class9314, final Class9405 class9315) {
        return Class90.method511(Class90.field229, s, new Class9312(s, class9312, n, set, class9313, class9314, class9315));
    }
    
    public static List<Class9312> method34437() {
        final ArrayList arrayList = Lists.newArrayList();
        Class9312 class9312;
        for (class9312 = Class9312.field39989; class9312.method34444() != class9312; class9312 = class9312.method34444()) {
            arrayList.add(class9312);
        }
        arrayList.add(class9312);
        Collections.reverse(arrayList);
        return arrayList;
    }
    
    private static boolean method34438(final Class9312 class9312, final Class1860 class9313) {
        return class9313.method7027().method34451(class9312) && class9313.method7043();
    }
    
    public static Class9312 method34439(final int n) {
        if (n < Class9312.field39990.size()) {
            return (n >= 0) ? Class9312.field39990.get(n) : Class9312.field39989;
        }
        return Class9312.field39977;
    }
    
    public static int method34440() {
        return Class9312.field39990.size();
    }
    
    public static int method34441(final Class9312 class9312) {
        return Class9312.field39991.getInt(class9312.method34442());
    }
    
    public Class9312(final String field39992, final Class9312 class9312, final int field39993, final EnumSet<Class2020> field39994, final Class260 field39995, final Class7943 field39996, final Class9405 field39997) {
        this.field39992 = field39992;
        this.field39994 = ((class9312 != null) ? class9312 : this);
        this.field39995 = field39996;
        this.field39996 = field39997;
        this.field39997 = field39993;
        this.field39998 = field39995;
        this.field39999 = field39994;
        this.field39993 = ((class9312 != null) ? (class9312.method34442() + 1) : 0);
    }
    
    public int method34442() {
        return this.field39993;
    }
    
    public String method34443() {
        return this.field39992;
    }
    
    public Class9312 method34444() {
        return this.field39994;
    }
    
    public CompletableFuture<Either<Class1860, Class6797>> method34445(final Class1849 class1849, final Class6346<?> class1850, final Class1795 class1851, final Class1885 class1852, final Function<Class1860, CompletableFuture<Either<Class1860, Class6797>>> function, final List<Class1860> list) {
        return this.field39995.method25764(this, class1849, class1850, class1851, class1852, function, list, list.get(list.size() / 2));
    }
    
    public CompletableFuture<Either<Class1860, Class6797>> method34446(final Class1849 class1849, final Class1795 class1850, final Class1885 class1851, final Function<Class1860, CompletableFuture<Either<Class1860, Class6797>>> function, final Class1860 class1852) {
        return this.field39996.method34981(this, class1849, class1850, class1851, function, class1852);
    }
    
    public int method34447() {
        return this.field39997;
    }
    
    public Class260 method34448() {
        return this.field39998;
    }
    
    public static Class9312 method34449(final String s) {
        return Class90.field229.method505(Class1932.method7795(s));
    }
    
    public EnumSet<Class2020> method34450() {
        return this.field39999;
    }
    
    public boolean method34451(final Class9312 class9312) {
        return this.method34442() >= class9312.method34442();
    }
    
    @Override
    public String toString() {
        return Class90.field229.method503(this).toString();
    }
    
    static {
        field39974 = EnumSet.of(Class2020.field11523, Class2020.field11521);
        field39975 = EnumSet.of(Class2020.field11524, Class2020.field11522, Class2020.field11525, Class2020.field11526);
        field39976 = ((class9312, class9313, class9314, class9315, function, class9316) -> {
            if (class9316 instanceof Class1865) {
                if (!class9316.method7027().method34451(class9312)) {
                    ((Class1865)class9316).method7098(class9312);
                }
            }
            return CompletableFuture.completedFuture(Either.left((Object)class9316));
        });
        field39977 = method34434("empty", null, -1, Class9312.field39974, Class260.field1243, (class1849, class1850, list, class1851) -> {});
        field39978 = method34435("structure_starts", Class9312.field39977, 0, Class9312.field39974, Class260.field1243, (class9312, class9313, class9314, class9315, class9316, function, list, class9317) -> {
            if (!class9317.method7027().method34451(class9312)) {
                if (class9313.method6764().method29565()) {
                    class9314.method18881(class9313.method6797().method16809(class9314.method18879()), class9317, class9314, class9315);
                }
                if (class9317 instanceof Class1865) {
                    ((Class1865)class9317).method7098(class9312);
                }
            }
            return CompletableFuture.completedFuture(Either.left((Object)class9317));
        });
        field39979 = method34434("structure_references", Class9312.field39978, 8, Class9312.field39974, Class260.field1243, (class1849, class1850, list, class1851) -> class1850.method18882(new Class1878(class1849, list), class1851));
        field39980 = method34434("biomes", Class9312.field39979, 0, Class9312.field39974, Class260.field1243, (class1849, class1850, list, class1851) -> class1850.method18871(class1851));
        field39981 = method34434("noise", Class9312.field39980, 8, Class9312.field39974, Class260.field1243, (class1849, class1850, list, class1851) -> class1850.method18861(new Class1878(class1849, list), class1851));
        field39982 = method34434("surface", Class9312.field39981, 0, Class9312.field39974, Class260.field1243, (class1849, class1850, list, class1851) -> class1850.method18859(new Class1878(class1849, list), class1851));
        field39983 = method34434("carvers", Class9312.field39982, 0, Class9312.field39974, Class260.field1243, (class1849, class1850, list, class1851) -> class1850.method18873(class1849.method6797().method16809(class1850.method18879()), class1851, Class2126.field12400));
        field39984 = method34434("liquid_carvers", Class9312.field39983, 0, Class9312.field39975, Class260.field1243, (class1849, class1850, list, class1851) -> class1850.method18873(class1849.method6797().method16809(class1850.method18879()), class1851, Class2126.field12401));
        field39985 = method34435("features", Class9312.field39984, 8, Class9312.field39975, Class260.field1243, (class9312, class9313, class9314, class9315, class9316, function, list, class9317) -> {
            final Class1865 class9318 = (Class1865)class9317;
            class9318.method7106(class9316);
            if (!class9317.method7027().method34451(class9312)) {
                Class9548.method35711(class9317, EnumSet.of(Class2020.field11525, Class2020.field11526, Class2020.field11524, Class2020.field11522));
                class9314.method18875(new Class1878(class9313, list));
                class9318.method7098(class9312);
            }
            return CompletableFuture.completedFuture(Either.left((Object)class9317));
        });
        field39986 = method34436("light", Class9312.field39985, 1, Class9312.field39975, Class260.field1243, (class9312, class9313, class9314, class9315, class9316, function, list, class9317) -> method34433(class9312, class9316, class9317), (class9312, class9313, class9314, class9315, function, class9316) -> method34433(class9312, class9315, class9316));
        field39987 = method34434("spawn", Class9312.field39986, 0, Class9312.field39975, Class260.field1243, (class1849, class1850, list, class1851) -> class1850.method18868(new Class1878(class1849, list)));
        field39988 = method34434("heightmaps", Class9312.field39987, 0, Class9312.field39975, Class260.field1243, (class1849, class1850, list, class1851) -> {});
        field39989 = method34436("full", Class9312.field39988, 0, Class9312.field39975, Class260.field1244, (class9312, class9313, class9314, class9315, class9316, function, list, class9317) -> function.apply(class9317), (class9312, class9313, class9314, class9315, function, class9316) -> function.apply(class9316));
        field39990 = (List)ImmutableList.of((Object)Class9312.field39989, (Object)Class9312.field39985, (Object)Class9312.field39984, (Object)Class9312.field39978, (Object)Class9312.field39978, (Object)Class9312.field39978, (Object)Class9312.field39978, (Object)Class9312.field39978, (Object)Class9312.field39978, (Object)Class9312.field39978, (Object)Class9312.field39978);
        field39991 = Class8349.method27851((IntList)new IntArrayList(method34437().size()), list -> {
            for (int i = method34437().size() - 1; i >= 0; --i) {
                int n = 0;
                while (n + 1 < Class9312.field39990.size() && i <= Class9312.field39990.get(n + 1).method34442()) {
                    ++n;
                }
                list.add(0, n);
            }
        });
    }
}
