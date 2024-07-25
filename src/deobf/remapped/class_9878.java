package remapped;

import com.google.common.base.Stopwatch;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9878 extends class_6535<class_6396> {
   private static final Logger field_49939 = LogManager.getLogger();
   private final Stopwatch field_49938 = Stopwatch.createUnstarted();

   public class_9878(class_7832 var1, List<class_2231> var2, Executor var3, Executor var4, CompletableFuture<class_3256> var5) {
      super(
         var3,
         var4,
         var1,
         var2,
         (var1x, var2x, var3x, var4x, var5x) -> {
            AtomicLong var8 = new AtomicLong();
            AtomicLong var9 = new AtomicLong();
            class_4929 var10 = new class_4929(Util.nanoTimeSupplier, () -> 0, false);
            class_4929 var11 = new class_4929(Util.nanoTimeSupplier, () -> 0, false);
            CompletableFuture var12 = var3x.method_10277(var1x, var2x, var10, var11, var2xx -> var4x.execute(() -> {
                  long var4xx = Util.getMeasuringTimeNano();
                  var2xx.run();
                  var8.addAndGet(Util.getMeasuringTimeNano() - var4xx);
               }), var2xx -> var5x.execute(() -> {
                  long var4xx = Util.getMeasuringTimeNano();
                  var2xx.run();
                  var9.addAndGet(Util.getMeasuringTimeNano() - var4xx);
               }));
            return var12.<class_6396>thenApplyAsync(
               var5xx -> new class_6396(var3x.method_10276(), var10.method_13811(), var11.method_13811(), var8, var9, null), var4
            );
         },
         var5
      );
      this.field_49938.start();
      this.field_33240.thenAcceptAsync(this::method_45520, var4);
   }

   private void method_45520(List<class_6396> var1) {
      this.field_49938.stop();
      int var4 = 0;
      field_49939.info("Resource reload finished after " + this.field_49938.elapsed(TimeUnit.MILLISECONDS) + " ms");

      for (class_6396 var6 : var1) {
         class_2578 var7 = class_6396.method_29198(var6);
         class_2578 var8 = class_6396.method_29201(var6);
         int var9 = (int)((double)class_6396.method_29196(var6).get() / 1000000.0);
         int var10 = (int)((double)class_6396.method_29200(var6).get() / 1000000.0);
         int var11 = var9 + var10;
         String var12 = class_6396.method_29199(var6);
         field_49939.info(var12 + " took approximately " + var11 + " ms (" + var9 + " ms preparing, " + var10 + " ms applying)");
         var4 += var10;
      }

      field_49939.info("Total blocking time: " + var4 + " ms");
   }
}
