package remapped;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class class_6298 implements AutoCloseable {
   private static String[] field_32181;
   private static final CompletableFuture<class_3256> field_32184 = CompletableFuture.<class_3256>completedFuture(class_3256.field_16155);
   private final class_550 field_32188 = new class_9483(class_3168.field_15843);
   private final class_465 field_32179;
   private final class_5023 field_32186 = new class_5023();
   private final class_4428 field_32180 = new class_4428();
   private final class_264 field_32182 = new class_264();
   private final class_1040 field_32187 = new class_1040(this.field_32182);
   private final class_8873 field_32185 = new class_8873(this.field_32182);
   private final class_8229 field_32183;

   public class_6298(class_9019 var1, int var2) {
      this.field_32179 = new class_465(var1);
      this.field_32183 = new class_8229(var2, this.field_32179.method_2229());
      this.field_32188.method_2649(this.field_32180);
      this.field_32188.method_2649(this.field_32182);
      this.field_32188.method_2649(this.field_32186);
      this.field_32188.method_2649(this.field_32187);
      this.field_32188.method_2649(this.field_32183);
      this.field_32188.method_2649(this.field_32185);
   }

   public class_8229 method_28751() {
      return this.field_32183;
   }

   public class_264 method_28749() {
      return this.field_32182;
   }

   public class_1040 method_28750() {
      return this.field_32187;
   }

   public class_6437 method_28753() {
      return this.field_32180.method_20577();
   }

   public class_5023 method_28746() {
      return this.field_32186;
   }

   public class_465 method_28745() {
      return this.field_32179;
   }

   public class_8873 method_28744() {
      return this.field_32185;
   }

   public class_7832 method_28743() {
      return this.field_32188;
   }

   public static CompletableFuture<class_6298> method_28747(List<class_8169> var0, class_9019 var1, int var2, Executor var3, Executor var4) {
      class_6298 var7 = new class_6298(var1, var2);
      CompletableFuture var8 = var7.field_32188.method_2648(var3, var4, var0, field_32184);
      return var8.whenComplete((var1x, var2x) -> {
         if (var2x != null) {
            var7.close();
         }
      }).<class_6298>thenApply(var1x -> var7);
   }

   public void method_28748() {
      this.field_32180.method_20577().method_29395();
   }

   @Override
   public void close() {
      this.field_32188.close();
   }
}
