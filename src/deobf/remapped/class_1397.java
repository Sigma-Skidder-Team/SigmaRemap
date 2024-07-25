package remapped;

import java.util.concurrent.CompletableFuture;

public class class_1397 implements class_6895 {
   private static String[] field_7612;

   public class_1397(class_1325 var1) {
      this.field_7611 = var1;
   }

   @Override
   public <T> CompletableFuture<T> method_31587(T var1) {
      return CompletableFuture.<T>completedFuture((T)var1);
   }
}
