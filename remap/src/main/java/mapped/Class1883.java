// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Random;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.Predicate;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import com.mojang.datafixers.DataFixer;
import java.io.File;
import it.unimi.dsi.fastutil.longs.LongSet;

public class Class1883 extends Class1882<Class364>
{
    private static String[] field10249;
    private final Class1900 field10250;
    private final LongSet field10251;
    
    public Class1883(final File file, final DataFixer dataFixer) {
        super(file, Class364::new, Class364::new, dataFixer, Class1959.field10684);
        this.field10251 = (LongSet)new LongOpenHashSet();
        this.field10250 = new Class1900(this);
    }
    
    public void method7196(final BlockPos class354, final Class8912 class355) {
        this.method7182(Class353.method1089(class354).method1117()).method1175(class354, class355);
    }
    
    public void method7197(final BlockPos class354) {
        this.method7182(Class353.method1089(class354).method1117()).method1177(class354);
    }
    
    public long method7198(final Predicate<Class8912> predicate, final BlockPos class354, final int n, final Class2045 class355) {
        return this.method7200(predicate, class354, n, class355).count();
    }
    
    public Stream<Class377> method7199(final Predicate<Class8912> predicate, final BlockPos class354, final int x, final Class2045 class355) {
        return Class7859.method25437(new Class7859(class354), Math.floorDiv(x, 16)).flatMap(class357 -> this.method7201(predicate2, class357, class356));
    }
    
    public Stream<Class377> method7200(final Predicate<Class8912> predicate, final BlockPos class354, final int n, final Class2045 class355) {
        return this.method7199(predicate, class354, n, class355).filter(class357 -> class357.method1259().method1083(class356) <= n2);
    }
    
    public Stream<Class377> method7201(final Predicate<Class8912> predicate, final Class7859 class7859, final Class2045 class7860) {
        return IntStream.range(0, 16).boxed().flatMap(n -> this.method7202(predicate2, Class353.method1090(class7861, n).method1117(), class7862));
    }
    
    private Stream<Class377> method7202(final Predicate<Class8912> predicate, final long n, final Class2045 class2045) {
        return this.method7180(n).map(class2047 -> class2047.method1174(predicate2, class2046)).orElseGet(Stream::empty);
    }
    
    public Stream<BlockPos> method7203(final Predicate<Class8912> predicate, final Predicate<BlockPos> predicate2, final BlockPos class354, final int n, final Class2045 class355) {
        return this.method7200(predicate, class354, n, class355).map((Function<? super Class377, ? extends BlockPos>)Class377::method1259).filter(predicate2);
    }
    
    public Optional<BlockPos> method7204(final Predicate<Class8912> predicate, final Predicate<BlockPos> predicate2, final BlockPos class354, final int n, final Class2045 class355) {
        return this.method7203(predicate, predicate2, class354, n, class355).findFirst();
    }
    
    public Optional<BlockPos> method7205(final Predicate<Class8912> predicate, final Predicate<BlockPos> predicate2, final BlockPos class354, final int n, final Class2045 class355) {
        return this.method7200(predicate, class354, n, class355).map((Function<? super Class377, ? extends BlockPos>)Class377::method1259).sorted(Comparator.comparingDouble(class357 -> class357.method1083(class356))).filter(predicate2).findFirst();
    }
    
    public Optional<BlockPos> method7206(final Predicate<Class8912> predicate, final Predicate<BlockPos> predicate2, final BlockPos class354, final int n) {
        return this.method7200(predicate, class354, n, Class2045.field11650).filter(class355 -> predicate3.test(class355.method1259())).findFirst().map(class356 -> {
            class356.method1255();
            return class356.method1259();
        });
    }
    
    public Optional<BlockPos> method7207(final Predicate<Class8912> predicate, final Predicate<BlockPos> predicate2, final Class2045 class2045, final BlockPos class2046, final int n, final Random rnd) {
        final List<? super Class377> list = this.method7200(predicate, class2046, n, class2045).collect((Collector<? super Class377, ?, List<? super Class377>>)Collectors.toList());
        Collections.shuffle(list, rnd);
        return (Optional<BlockPos>)list.stream().filter(class2047 -> predicate3.test(class2047.method1259())).findFirst().map((Function<? super Object, ?>)Class377::method1259);
    }
    
    public boolean method7208(final BlockPos class354) {
        return this.method7182(Class353.method1089(class354).method1117()).method1178(class354);
    }
    
    public boolean method7209(final BlockPos class354, final Predicate<Class8912> predicate) {
        return this.method7180(Class353.method1089(class354).method1117()).map(class356 -> class356.method1179(class355, predicate2)).orElse(false);
    }
    
    public Optional<Class8912> method7210(final BlockPos class354) {
        return this.method7182(Class353.method1089(class354).method1117()).method1180(class354);
    }
    
    public int method7211(final Class353 class353) {
        this.field10250.method7374();
        return this.field10250.method7302(class353.method1117());
    }
    
    private boolean method7212(final long n) {
        final Optional<Class364> method7179 = this.method7179(n);
        return method7179 != null && method7179.map(class364 -> class364.method1174(Class8912.field37458, Class2045.field11651).count() > 0L).orElse(false);
    }
    
    @Override
    public void method7178(final BooleanSupplier booleanSupplier) {
        super.method7178(booleanSupplier);
        this.field10250.method7374();
    }
    
    @Override
    public void method7189(final long n) {
        super.method7189(n);
        this.field10250.method7346(n, this.field10250.method7345(n), false);
    }
    
    @Override
    public void method7188(final long n) {
        this.field10250.method7346(n, this.field10250.method7345(n), false);
    }
    
    public void method7213(final Class7859 class7859, final Class8199 class7860) {
        Class8349.method27855(this.method7180(Class353.method1090(class7859, class7860.method27159() >> 4).method1117()), class7861 -> class7861.method1181(biConsumer -> {
            if (!(!method7214(class7862))) {
                this.method7215(class7862, class7863, biConsumer);
            }
        }), () -> {
            if (!(!method7214(class7864))) {
                this.method7215(class7864, class7865, (Class364)this.method7182(class7865.method1117())::method1175);
            }
        });
    }
    
    private static boolean method7214(final Class8199 class8199) {
        return Class8912.method31402().anyMatch(class8199::method27165);
    }
    
    private void method7215(final Class8199 class8199, final Class353 class8200, final BiConsumer<BlockPos, Class8912> biConsumer) {
        class8200.method1118().forEach(class8202 -> Class8912.method31401(class8201.method27148(Class353.method1096(class8202.getX()), Class353.method1096(class8202.getY()), Class353.method1096(class8202.getZ()))).ifPresent(class8204 -> biConsumer2.accept(class8203, class8204)));
    }
    
    public void method7216(final Class1852 class1852, final BlockPos class1853, final int x) {
        Class353.method1120(new Class7859(class1853), Math.floorDiv(x, 16)).map(class1854 -> Pair.of((Object)class1854, (Object)this.method7180(class1854.method1117()))).filter(pair -> !((Optional)pair.getSecond()).map(Class364::method1183).orElse(false)).map(pair2 -> ((Class353)pair2.getFirst()).method1115()).filter(class1855 -> this.field10251.add(class1855.method25422())).forEach(class1857 -> class1856.method6966(class1857.field32290, class1857.field32291, Class9312.field39977));
    }
}
