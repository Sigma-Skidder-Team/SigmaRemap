// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.annotations.VisibleForTesting;
import java.util.function.BooleanSupplier;
import java.io.IOException;
import java.util.function.Function;
import java.util.Optional;
import java.util.concurrent.Future;
import java.util.concurrent.CompletableFuture;
import java.util.Arrays;
import com.mojang.datafixers.util.Either;
import javax.annotation.Nullable;
import java.util.function.Supplier;
import java.util.concurrent.Executor;
import com.mojang.datafixers.DataFixer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.io.File;
import java.util.List;

public class Class1909 extends AbstractChunkProvider
{
    private static final int field10346;
    private static final List<ChunkStatus> field10347;
    private final Class8730 field10348;
    private final Class6346<?> field10349;
    private final Class1849 field10350;
    private final Thread field10351;
    private final Class1885 field10352;
    private final Class873 field10353;
    public final Class388 field10354;
    private final Class8213 field10355;
    private long field10356;
    private boolean field10357;
    private boolean field10358;
    private final long[] field10359;
    private final ChunkStatus[] field10360;
    private final IChunk[] field10361;
    
    public Class1909(final Class1849 field10350, final File file, final DataFixer dataFixer, final Class1795 class1795, final Executor executor, final Class6346<?> field10351, final int n, final Class6459 class1796, final Supplier<Class8213> supplier) {
        this.field10357 = true;
        this.field10358 = true;
        this.field10359 = new long[4];
        this.field10360 = new ChunkStatus[4];
        this.field10361 = new IChunk[4];
        this.field10350 = field10350;
        this.field10353 = new Class873(this, field10350, null);
        this.field10349 = field10351;
        this.field10351 = Thread.currentThread();
        final File file2 = new File(field10350.method6789().getType().method1272(file), "data");
        file2.mkdirs();
        this.field10355 = new Class8213(file2, dataFixer);
        this.field10354 = new Class388(field10350, file, dataFixer, class1795, executor, this.field10353, this, this.method7438(), class1796, supplier, n);
        this.field10352 = this.field10354.method1315();
        this.field10348 = this.field10354.method1341();
        this.method7426();
    }
    
    public Class1885 method7422() {
        return this.field10352;
    }
    
    @Nullable
    private Class9298 method7423(final long n) {
        return this.field10354.method1317(n);
    }
    
    public int method7424() {
        return this.field10354.method1336();
    }
    
    private void method7425(final long n, final IChunk class1860, final ChunkStatus class1861) {
        for (int i = 3; i > 0; --i) {
            this.field10359[i] = this.field10359[i - 1];
            this.field10360[i] = this.field10360[i - 1];
            this.field10361[i] = this.field10361[i - 1];
        }
        this.field10359[0] = n;
        this.field10360[0] = class1861;
        this.field10361[0] = class1860;
    }
    
    @Nullable
    @Override
    public IChunk getChunk(final int p0, final int p1, final ChunkStatus p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: getfield        mapped/Class1909.field10351:Ljava/lang/Thread;
        //     7: if_acmpne       42
        //    10: aload_0        
        //    11: getfield        mapped/Class1909.field10350:Lmapped/Class1849;
        //    14: invokevirtual   mapped/Class1849.method6796:()Lmapped/Class5028;
        //    17: astore          7
        //    19: aload           7
        //    21: ldc             "getChunk"
        //    23: invokeinterface mapped/Class5028.method15302:(Ljava/lang/String;)V
        //    28: iload_1        
        //    29: iload_2        
        //    30: invokestatic    mapped/Class7859.method25423:(II)J
        //    33: lstore          8
        //    35: iconst_0       
        //    36: istore          10
        //    38: goto            68
        //    41: athrow         
        //    42: aload_0        
        //    43: iload_1        
        //    44: iload_2        
        //    45: aload_3        
        //    46: iload           4
        //    48: invokedynamic   BootstrapMethod #0, get:(Lmapped/Class1909;IILmapped/Class9312;Z)Ljava/util/function/Supplier;
        //    53: aload_0        
        //    54: getfield        mapped/Class1909.field10353:Lmapped/Class873;
        //    57: invokestatic    java/util/concurrent/CompletableFuture.supplyAsync:(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
        //    60: invokevirtual   java/util/concurrent/CompletableFuture.join:()Ljava/lang/Object;
        //    63: checkcast       Lmapped/Class1860;
        //    66: areturn        
        //    67: athrow         
        //    68: iload           10
        //    70: iconst_4       
        //    71: if_icmplt       154
        //    74: aload           7
        //    76: ldc             "getChunkCacheMiss"
        //    78: invokeinterface mapped/Class5028.method15302:(Ljava/lang/String;)V
        //    83: aload_0        
        //    84: iload_1        
        //    85: iload_2        
        //    86: aload_3        
        //    87: iload           4
        //    89: invokespecial   mapped/Class1909.method7428:(IILmapped/Class9312;Z)Ljava/util/concurrent/CompletableFuture;
        //    92: astore          10
        //    94: aload_0        
        //    95: getfield        mapped/Class1909.field10353:Lmapped/Class873;
        //    98: aload           10
        //   100: dup            
        //   101: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   104: pop            
        //   105: invokedynamic   BootstrapMethod #1, getAsBoolean:(Ljava/util/concurrent/CompletableFuture;)Ljava/util/function/BooleanSupplier;
        //   110: invokevirtual   mapped/Class873.method5384:(Ljava/util/function/BooleanSupplier;)V
        //   113: aload           10
        //   115: invokevirtual   java/util/concurrent/CompletableFuture.join:()Ljava/lang/Object;
        //   118: checkcast       Lcom/mojang/datafixers/util/Either;
        //   121: invokedynamic   BootstrapMethod #2, apply:()Ljava/util/function/Function;
        //   126: iload           4
        //   128: invokedynamic   BootstrapMethod #3, apply:(Z)Ljava/util/function/Function;
        //   133: invokevirtual   com/mojang/datafixers/util/Either.map:(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/lang/Object;
        //   136: checkcast       Lmapped/Class1860;
        //   139: astore          11
        //   141: aload_0        
        //   142: lload           8
        //   144: aload           11
        //   146: aload_3        
        //   147: invokespecial   mapped/Class1909.method7425:(JLmapped/Class1860;Lmapped/Class9312;)V
        //   150: aload           11
        //   152: areturn        
        //   153: athrow         
        //   154: lload           8
        //   156: aload_0        
        //   157: getfield        mapped/Class1909.field10359:[J
        //   160: iload           10
        //   162: laload         
        //   163: lcmp           
        //   164: ifeq            174
        //   167: iinc            10, 1
        //   170: goto            68
        //   173: athrow         
        //   174: aload_3        
        //   175: aload_0        
        //   176: getfield        mapped/Class1909.field10360:[Lmapped/Class9312;
        //   179: iload           10
        //   181: aaload         
        //   182: if_acmpeq       189
        //   185: goto            167
        //   188: athrow         
        //   189: aload_0        
        //   190: getfield        mapped/Class1909.field10361:[Lmapped/Class1860;
        //   193: iload           10
        //   195: aaload         
        //   196: astore          11
        //   198: aload           11
        //   200: ifnull          207
        //   203: aload           11
        //   205: areturn        
        //   206: athrow         
        //   207: iload           4
        //   209: ifeq            216
        //   212: goto            167
        //   215: athrow         
        //   216: goto            203
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Could not infer any expression.
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:382)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    @Override
    public Class1862 method7399(final int n, final int n2) {
        if (Thread.currentThread() != this.field10351) {
            return null;
        }
        this.field10350.method6796().method15302("getChunkNow");
        final long method25423 = Class7859.method25423(n, n2);
        for (int i = 0; i < 4; ++i) {
            if (method25423 == this.field10359[i] && this.field10360[i] == ChunkStatus.field39989) {
                final IChunk class1860 = this.field10361[i];
                return (class1860 instanceof Class1862) ? ((Class1862)class1860) : null;
            }
        }
        final Class9298 method25424 = this.method7423(method25423);
        if (method25424 == null) {
            return null;
        }
        final Either either = method25424.method34341(ChunkStatus.field39989).getNow(null);
        if (either != null) {
            final IChunk class1861 = either.left().orElse(null);
            if (class1861 != null) {
                this.method7425(method25423, class1861, ChunkStatus.field39989);
                if (class1861 instanceof Class1862) {
                    return (Class1862)class1861;
                }
            }
            return null;
        }
        return null;
    }
    
    private void method7426() {
        Arrays.fill(this.field10359, Class7859.field32289);
        Arrays.fill(this.field10360, null);
        Arrays.fill(this.field10361, null);
    }
    
    public CompletableFuture<Either<IChunk, Class6797>> method7427(final int n, final int n2, final ChunkStatus class9312, final boolean b) {
        Future<T> future;
        if (Thread.currentThread() != this.field10351) {
            future = (Future<T>)CompletableFuture.supplyAsync(() -> this.method7428(n3, n4, class9313, b2), this.field10353).thenCompose(completableFuture -> completableFuture);
        }
        else {
            future = (Future<T>)this.method7428(n, n2, class9312, b);
            this.field10353.method5384(future::isDone);
        }
        return (CompletableFuture<Either<IChunk, Class6797>>)future;
    }
    
    private CompletableFuture<Either<IChunk, Class6797>> method7428(final int n, final int n2, final ChunkStatus class9312, final boolean b) {
        final Class7859 class9313 = new Class7859(n, n2);
        final long method25422 = class9313.method25422();
        final int n3 = 33 + ChunkStatus.method34441(class9312);
        Class9298 class9314 = this.method7423(method25422);
        if (b) {
            this.field10348.method30130(Class9105.field38572, class9313, n3, class9313);
            if (this.method7429(class9314, n3)) {
                final IProfiler method25423 = this.field10350.method6796();
                method25423.startSection("chunkLoad");
                this.method7432();
                class9314 = this.method7423(method25422);
                method25423.endSection();
                if (this.method7429(class9314, n3)) {
                    throw Class8349.method27859(new IllegalStateException("No chunk holder after ticket has been added"));
                }
            }
        }
        return this.method7429(class9314, n3) ? Class9298.field39872 : class9314.method34354(class9312, this.field10354);
    }
    
    private boolean method7429(final Class9298 class9298, final int n) {
        return class9298 == null || class9298.method34358() > n;
    }
    
    @Override
    public boolean method7401(final int n, final int n2) {
        return !this.method7429(this.method7423(new Class7859(n, n2).method25422()), 33 + ChunkStatus.method34441(ChunkStatus.field39989));
    }
    
    @Override
    public IBlockReader method7400(final int n, final int n2) {
        final Class9298 method7423 = this.method7423(Class7859.method25423(n, n2));
        if (method7423 == null) {
            return null;
        }
        int n3 = Class1909.field10347.size() - 1;
        while (true) {
            final ChunkStatus class9312 = Class1909.field10347.get(n3);
            final Optional left = method7423.method34340(class9312).getNow(Class9298.field39871).left();
            if (left.isPresent()) {
                return (IBlockReader)left.get();
            }
            if (class9312 == ChunkStatus.field39986.method34444()) {
                return null;
            }
            --n3;
        }
    }
    
    public World method7430() {
        return this.field10350;
    }
    
    public boolean method7431() {
        return this.field10353.method1461();
    }
    
    private boolean method7432() {
        final boolean method30127 = this.field10348.method30127(this.field10354);
        final boolean method30128 = this.field10354.method1327();
        if (!method30127 && !method30128) {
            return false;
        }
        this.method7426();
        return true;
    }
    
    @Override
    public boolean method7408(final Entity class399) {
        return this.method7434(Class7859.method25423(MathHelper.floor(class399.getPosX()) >> 4, MathHelper.floor(class399.getPosZ()) >> 4), Class9298::method34343);
    }
    
    @Override
    public boolean method7409(final Class7859 class7859) {
        return this.method7434(class7859.method25422(), Class9298::method34343);
    }
    
    @Override
    public boolean method7410(final BlockPos class354) {
        return this.method7434(Class7859.method25423(class354.getX() >> 4, class354.getZ() >> 4), Class9298::method34342);
    }
    
    public boolean method7433(final Entity class399) {
        return this.method7434(Class7859.method25423(MathHelper.floor(class399.getPosX()) >> 4, MathHelper.floor(class399.getPosZ()) >> 4), Class9298::method34344);
    }
    
    private boolean method7434(final long n, final Function<Class9298, CompletableFuture<Either<Class1862, Class6797>>> function) {
        final Class9298 method7423 = this.method7423(n);
        return method7423 != null && function.apply(method7423).getNow(Class9298.field39873).left().isPresent();
    }
    
    public void method7435(final boolean b) {
        this.method7432();
        this.field10354.method1323(b);
    }
    
    @Override
    public void close() throws IOException {
        this.method7435(true);
        this.field10352.close();
        this.field10354.close();
    }
    
    @Override
    public void method7403(final BooleanSupplier booleanSupplier) {
        this.field10350.method6796().startSection("purge");
        this.field10348.method30122();
        this.method7432();
        this.field10350.method6796().method15300("chunks");
        this.method7436();
        this.field10350.method6796().method15300("unload");
        this.field10354.method1324(booleanSupplier);
        this.field10350.method6796().endSection();
        this.method7426();
    }
    
    private void method7436() {
        final long method6754 = this.field10350.method6754();
        final long n = method6754 - this.field10356;
        this.field10356 = method6754;
        final WorldInfo method6755 = this.field10350.method6764();
        final boolean b = method6755.method29570() == Class9505.field40898;
        final boolean method6756 = this.field10350.method6765().method31216(Class8878.field37318);
        if (!b) {
            this.field10350.method6796().startSection("pollingChunks");
            this.field10350.method6765().method31217(Class8878.field37327);
            this.field10350.method6758();
            final boolean b2 = method6755.method29539() % 400L == 0L;
            this.field10350.method6796().startSection("naturalSpawnCount");
            this.field10348.method30140();
            Class1976.values();
            this.field10350.method6885();
            this.field10350.method6796().endSection();
            this.field10354.method1342().forEach(class355 -> {
                class355.method34343().getNow(Class9298.field39873).left();
                final Optional optional;
                if (!(!optional.isPresent())) {
                    final Class1862 class356 = optional.get();
                    this.field10350.method6796().startSection("broadcast");
                    class355.method34351(class356);
                    this.field10350.method6796().endSection();
                    if (!this.field10354.method1346(class355.method34357())) {
                        class356.method7040(class356.method7041() + n2);
                        if (!(!b3)) {
                            if (this.field10357 || this.field10358) {
                                if (!(!this.field10350.getWorldBorder().method34780(class356.method7019()))) {
                                    this.field10350.method6796().startSection("spawner");
                                    int i = 0;
                                    for (int length = array.length; i < length; ++i) {
                                        final Class1976 class357 = array[i];
                                        if (class357 != Class1976.field10952) {
                                            if (!class357.method7988() || this.field10358) {
                                                if (class357.method7988() || this.field10357) {
                                                    if (!class357.method7989() || b4) {
                                                        if (object2IntMap.getInt((Object)class357) <= class357.method7987() * n3 / Class1909.field10346) {
                                                            Class8532.method28616(class357, this.field10350, class356, class354);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    this.field10350.method6796().endSection();
                                }
                            }
                        }
                        this.field10350.method6864(class356, n4);
                    }
                }
                return;
            });
            this.field10350.method6796().startSection("customSpawners");
            if (method6756) {
                this.field10349.method18870(this.field10350, this.field10357, this.field10358);
            }
            this.field10350.method6796().endSection();
            this.field10350.method6796().endSection();
        }
        this.field10354.method1354();
    }
    
    @Override
    public String method7404() {
        return "ServerChunkCache: " + this.method7439();
    }
    
    @VisibleForTesting
    public int method7437() {
        return this.field10353.method5375();
    }
    
    public Class6346<?> method7438() {
        return this.field10349;
    }
    
    public int method7439() {
        return this.field10354.method1340();
    }
    
    public void method7440(final BlockPos class354) {
        final Class9298 method7423 = this.method7423(Class7859.method25423(class354.getX() >> 4, class354.getZ() >> 4));
        if (method7423 != null) {
            method7423.method34349(class354.getX() & 0xF, class354.getY(), class354.getZ() & 0xF);
        }
    }
    
    @Override
    public void method7420(final Class237 class237, final Class353 class238) {
        this.field10353.execute(() -> {
            this.method7423(class239.method1115().method25422());
            final Class9298 class241;
            if (class241 != null) {
                class241.method34350(class240, class239.method1103());
            }
        });
    }
    
    public <T> void method7441(final Class9105<T> class9105, final Class7859 class9106, final int n, final T t) {
        this.field10348.method30132(class9105, class9106, n, t);
    }
    
    public <T> void method7442(final Class9105<T> class9105, final Class7859 class9106, final int n, final T t) {
        this.field10348.method30133(class9105, class9106, n, t);
    }
    
    @Override
    public void method7407(final Class7859 class7859, final boolean b) {
        this.field10348.method30135(class7859, b);
    }
    
    public void method7443(final Class513 class513) {
        this.field10354.method1350(class513);
    }
    
    public void method7444(final Entity class399) {
        this.field10354.method1353(class399);
    }
    
    public void method7445(final Entity class399) {
        this.field10354.method1352(class399);
    }
    
    public void method7446(final Entity class399, final IPacket<?> class400) {
        this.field10354.method1356(class399, class400);
    }
    
    public void method7447(final Entity class399, final IPacket<?> class400) {
        this.field10354.method1355(class399, class400);
    }
    
    public void method7448(final int n) {
        this.field10354.method1338(n);
    }
    
    @Override
    public void method7406(final boolean field10357, final boolean field10358) {
        this.field10357 = field10357;
        this.field10358 = field10358;
    }
    
    public String method7449(final Class7859 class7859) {
        return this.field10354.method1319(class7859);
    }
    
    public Class8213 method7450() {
        return this.field10355;
    }
    
    public Class1883 method7451() {
        return this.field10354.method1358();
    }
    
    static {
        field10346 = (int)Math.pow(17.0, 2.0);
        field10347 = ChunkStatus.method34437();
    }
}
