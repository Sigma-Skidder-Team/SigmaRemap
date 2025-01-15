// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;
import java.util.Locale;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.CompletableFuture;
import java.net.Proxy;
import java.util.Map;
import java.io.File;
import com.google.common.util.concurrent.ListeningExecutorService;
import org.apache.logging.log4j.Logger;

public class Class7676
{
    private static final Logger field30474;
    public static final ListeningExecutorService field30475;
    
    public static CompletableFuture<?> method24364(final File p0, final String p1, final Map<String, String> p2, final int p3, final Class732 p4, final Proxy p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_1        
        //     3: aload           5
        //     5: aload_2        
        //     6: aload_0        
        //     7: iload_3        
        //     8: invokedynamic   BootstrapMethod #0, get:(Lmapped/Class732;Ljava/lang/String;Ljava/net/Proxy;Ljava/util/Map;Ljava/io/File;I)Ljava/util/function/Supplier;
        //    13: getstatic       mapped/Class7676.field30475:Lcom/google/common/util/concurrent/ListeningExecutorService;
        //    16: invokestatic    java/util/concurrent/CompletableFuture.supplyAsync:(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
        //    19: areturn        
        //    Signature:
        //  (Ljava/io/File;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;ILmapped/Class732;Ljava/net/Proxy;)Ljava/util/concurrent/CompletableFuture<*>;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
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
    
    public static int method24365() {
        try (final ServerSocket serverSocket = new ServerSocket(0)) {
            return serverSocket.getLocalPort();
        }
        catch (final IOException ex) {
            return 25564;
        }
    }
    
    static {
        field30474 = LogManager.getLogger();
        field30475 = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Class7676.field30474)).setNameFormat("Downloader %d").build()));
    }
}
