package remapped;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class class_3774 extends class_1809 {
   private static String[] field_18433;
   private CompletableFuture<class_4150> field_18434;

   public class_3774(class_7832 var1, class_4639 var2, Executor var3) {
      super(var2);
      this.field_18434 = CompletableFuture.<class_4150>supplyAsync(() -> class_4150.method_19265(var1, var2), var3);
   }

   @Override
   public class_4150 method_8032(class_7832 var1) {
      if (this.field_18434 == null) {
         return class_4150.method_19265(var1, this.field_9206);
      } else {
         class_4150 var4 = this.field_18434.join();
         this.field_18434 = null;
         return var4;
      }
   }

   public CompletableFuture<Void> method_17467() {
      return this.field_18434 != null ? this.field_18434.<Void>thenApply(var0 -> null) : CompletableFuture.<Void>completedFuture((Void)null);
   }

   @Override
   public void method_37054(class_7889 var1, class_7832 var2, class_4639 var3, Executor var4) {
      this.field_18434 = CompletableFuture.<class_4150>supplyAsync(() -> class_4150.method_19265(var2, this.field_9206), class_9665.method_44661());
      this.field_18434.thenRunAsync(() -> var1.method_35682(this.field_9206, this), method_17468(var4));
   }

   private static Executor method_17468(Executor var0) {
      return var1 -> var0.execute(() -> class_3542.method_16474(var1::run));
   }
}
