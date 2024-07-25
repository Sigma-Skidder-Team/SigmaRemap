package remapped;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2087 extends class_4663 implements AutoCloseable {
   private static final Logger field_10498 = LogManager.getLogger();
   private final class_2696<Runnable> field_10496;
   private final ObjectList<Pair<class_6380, Runnable>> field_10502 = new ObjectArrayList();
   private final class_916 field_10501;
   private final class_8816<class_1069<Runnable>> field_10500;
   private volatile int field_10495 = 5;
   private final AtomicBoolean field_10499 = new AtomicBoolean();

   public class_2087(class_5002 var1, class_916 var2, boolean var3, class_2696<Runnable> var4, class_8816<class_1069<Runnable>> var5) {
      super(var1, true, var3);
      this.field_10501 = var2;
      this.field_10500 = var5;
      this.field_10496 = var4;
   }

   @Override
   public void close() {
   }

   @Override
   public int method_21571(int var1, boolean var2, boolean var3) {
      throw (UnsupportedOperationException) Util.method_44658(new UnsupportedOperationException("Ran authomatically on a different thread!"));
   }

   @Override
   public void method_21569(BlockPos var1, int var2) {
      throw (UnsupportedOperationException) Util.method_44658(new UnsupportedOperationException("Ran authomatically on a different thread!"));
   }

   @Override
   public void method_21566(BlockPos var1) {
      BlockPos var4 = var1.method_6072();
      this.method_9763(
         var1.getX() >> 4,
         var1.getZ() >> 4,
         class_6380.field_32590,
         Util.method_44687(() -> super.method_21566(var4), () -> "checkBlock " + var4)
      );
   }

   public void method_9759(class_2034 var1) {
      this.method_9758(var1.field_10328, var1.field_10327, () -> 0, class_6380.field_32589, Util.method_44687(() -> {
         super.method_21561(var1, false);
         super.method_21563(var1, false);

         for (int var4 = -1; var4 < 17; var4++) {
            super.method_21568(class_2957.field_14440, class_6979.method_31922(var1, var4), (class_1201)null, true);
            super.method_21568(class_2957.field_14437, class_6979.method_31922(var1, var4), (class_1201)null, true);
         }

         for (int var5 = 0; var5 < 16; var5++) {
            super.method_34830(class_6979.method_31922(var1, var5), true);
         }
      }, () -> "updateChunkStatus " + var1 + " " + true));
   }

   @Override
   public void method_34830(class_6979 var1, boolean var2) {
      this.method_9758(
         var1.method_31930(),
         var1.method_31900(),
         () -> 0,
         class_6380.field_32589,
         Util.method_44687(() -> super.method_34830(var1, var2), () -> "updateSectionStatus " + var1 + " " + var2)
      );
   }

   @Override
   public void method_21563(class_2034 var1, boolean var2) {
      this.method_9763(
         var1.field_10328,
         var1.field_10327,
         class_6380.field_32589,
         Util.method_44687(() -> super.method_21563(var1, var2), () -> "enableLight " + var1 + " " + var2)
      );
   }

   @Override
   public void method_21568(class_2957 var1, class_6979 var2, class_1201 var3, boolean var4) {
      this.method_9758(
         var2.method_31930(),
         var2.method_31900(),
         () -> 0,
         class_6380.field_32589,
         Util.method_44687(() -> super.method_21568(var1, var2, var3, var4), () -> "queueData " + var2)
      );
   }

   private void method_9763(int var1, int var2, class_6380 var3, Runnable var4) {
      this.method_9758(var1, var2, this.field_10501.method_4010(class_2034.method_9540(var1, var2)), var3, var4);
   }

   private void method_9758(int var1, int var2, IntSupplier var3, class_6380 var4, Runnable var5) {
      this.field_10500.method_40495(class_6025.method_27494(() -> {
         this.field_10502.add(Pair.of(var4, var5));
         if (this.field_10502.size() >= this.field_10495) {
            this.method_9761();
         }
      }, class_2034.method_9540(var1, var2), var3));
   }

   @Override
   public void method_21561(class_2034 var1, boolean var2) {
      this.method_9758(
         var1.field_10328,
         var1.field_10327,
         () -> 0,
         class_6380.field_32589,
         Util.method_44687(() -> super.method_21561(var1, var2), () -> "retainData " + var1)
      );
   }

   public CompletableFuture<class_5990> method_9762(class_5990 var1, boolean var2) {
      class_2034 var5 = var1.method_27352();
      var1.method_27362(false);
      this.method_9763(var5.field_10328, var5.field_10327, class_6380.field_32589, Util.method_44687(() -> {
         class_1315[] var6 = var1.method_27349();

         for (int var7 = 0; var7 < 16; var7++) {
            class_1315 var8 = var6[var7];
            if (!class_1315.method_6003(var8)) {
               super.method_34830(class_6979.method_31922(var5, var7), false);
            }
         }

         super.method_21563(var5, true);
         if (!var2) {
            var1.method_27360().forEach(var2xx -> super.method_21569(var2xx, var1.method_28263(var2xx)));
         }

         this.field_10501.method_4009(var5);
      }, () -> "lightChunk " + var5 + " " + var2));
      return CompletableFuture.<class_5990>supplyAsync(() -> {
         var1.method_27362(true);
         super.method_21561(var5, false);
         return var1;
      }, var2x -> this.method_9763(var5.field_10328, var5.field_10327, class_6380.field_32590, var2x));
   }

   public void method_9760() {
      if ((!this.field_10502.isEmpty() || super.method_21570()) && this.field_10499.compareAndSet(false, true)) {
         this.field_10496.method_40495(() -> {
            this.method_9761();
            this.field_10499.set(false);
         });
      }
   }

   private void method_9761() {
      int var3 = Math.min(this.field_10502.size(), this.field_10495);
      ObjectListIterator var4 = this.field_10502.iterator();

      int var5;
      for (var5 = 0; var4.hasNext() && var5 < var3; var5++) {
         Pair var6 = (Pair)var4.next();
         if (var6.getFirst() == class_6380.field_32589) {
            ((Runnable)var6.getSecond()).run();
         }
      }

      var4.back(var5);
      super.method_21571(Integer.MAX_VALUE, true, true);

      for (int var8 = 0; var4.hasNext() && var8 < var3; var8++) {
         Pair var7 = (Pair)var4.next();
         if (var7.getFirst() == class_6380.field_32590) {
            ((Runnable)var7.getSecond()).run();
         }

         var4.remove();
      }
   }

   public void method_9764(int var1) {
      this.field_10495 = var1;
   }
}
