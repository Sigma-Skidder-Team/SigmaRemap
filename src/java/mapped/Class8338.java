package mapped;

import com.google.common.base.Stopwatch;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8338 extends Class8337<Class8921> {
   private static final Logger field35853 = LogManager.getLogger();
   private final Stopwatch field35854 = Stopwatch.createUnstarted();

   public Class8338(Class191 var1, List<Class268> var2, Executor var3, Executor var4, CompletableFuture<Class2341> var5) {
      super(var3, var4, var1, var2, (var1x, var2x, var3x, var4x, var5x) -> {
         AtomicLong var8 = new AtomicLong();
         AtomicLong var9 = new AtomicLong();
         Class7168 var10 = new Class7168(Util.field45723, () -> 0, false);
         Class7168 var11 = new Class7168(Util.field45723, () -> 0, false);
         CompletableFuture var12 = var3x.method777(var1x, var2x, var10, var11, var2xx -> var4x.execute(() -> {
               long var4xx = Util.method38488();
               var2xx.run();
               var8.addAndGet(Util.method38488() - var4xx);
            }), var2xx -> var5x.execute(() -> {
               long var4xx = Util.method38488();
               var2xx.run();
               var9.addAndGet(Util.method38488() - var4xx);
            }));
         return var12.<Class8921>thenApplyAsync(var5xx -> new Class8921(var3x.method969(), var10.method22511(), var11.method22511(), var8, var9), var4);
      }, var5);
      this.field35854.start();
      this.field35846.thenAcceptAsync(this::method29236, var4);
   }

   private void method29236(List<Class8921> var1) {
      this.field35854.stop();
      int var4 = 0;
      field35853.info("Resource reload finished after " + this.field35854.elapsed(TimeUnit.MILLISECONDS) + " ms");

      for (Class8921 var6 : var1) {
         Class7740 var7 = Class8921.method32598(var6);
         Class7740 var8 = Class8921.method32599(var6);
         int var9 = (int)((double)Class8921.method32600(var6).get() / 1000000.0);
         int var10 = (int)((double)Class8921.method32601(var6).get() / 1000000.0);
         int var11 = var9 + var10;
         String var12 = Class8921.method32602(var6);
         field35853.info(var12 + " took approximately " + var11 + " ms (" + var9 + " ms preparing, " + var10 + " ms applying)");
         var4 += var10;
      }

      field35853.info("Total blocking time: " + var4 + " ms");
   }
}
