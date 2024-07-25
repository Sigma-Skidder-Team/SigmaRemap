package remapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_9741 {
   private final Predicate<class_9115>[][][] field_49500;
   private final int field_49497;
   private final int field_49501;
   private final int field_49499;

   public class_9741(Predicate<class_9115>[][][] var1) {
      this.field_49500 = var1;
      this.field_49497 = var1.length;
      if (this.field_49497 <= 0) {
         this.field_49501 = 0;
         this.field_49499 = 0;
      } else {
         this.field_49501 = var1[0].length;
         if (this.field_49501 <= 0) {
            this.field_49499 = 0;
         } else {
            this.field_49499 = var1[0][0].length;
         }
      }
   }

   public int method_44982() {
      return this.field_49497;
   }

   public int method_44986() {
      return this.field_49501;
   }

   public int method_44984() {
      return this.field_49499;
   }

   @Nullable
   private class_6953 method_44983(class_1331 var1, Direction var2, Direction var3, LoadingCache<class_1331, class_9115> var4) {
      for (int var7 = 0; var7 < this.field_49499; var7++) {
         for (int var8 = 0; var8 < this.field_49501; var8++) {
            for (int var9 = 0; var9 < this.field_49497; var9++) {
               if (!this.field_49500[var9][var8][var7].test((class_9115)var4.getUnchecked(method_44979(var1, var2, var3, var7, var8, var9)))) {
                  return null;
               }
            }
         }
      }

      return new class_6953(var1, var2, var3, var4, this.field_49499, this.field_49501, this.field_49497);
   }

   @Nullable
   public class_6953 method_44981(class_4924 var1, class_1331 var2) {
      LoadingCache var5 = method_44980(var1, false);
      int var6 = Math.max(Math.max(this.field_49499, this.field_49501), this.field_49497);

      for (class_1331 var8 : class_1331.method_6076(var2, var2.method_6104(var6 - 1, var6 - 1, var6 - 1))) {
         for (Direction var12 : Direction.values()) {
            for (Direction var16 : Direction.values()) {
               if (var16 != var12 && var16 != var12.method_1046()) {
                  class_6953 var17 = this.method_44983(var8, var12, var16, var5);
                  if (var17 != null) {
                     return var17;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache<class_1331, class_9115> method_44980(class_4924 var0, boolean var1) {
      return CacheBuilder.newBuilder().build(new class_9237(var0, var1));
   }

   public static class_1331 method_44979(class_1331 var0, Direction var1, Direction var2, int var3, int var4, int var5) {
      if (var1 != var2 && var1 != var2.method_1046()) {
         class_2700 var8 = new class_2700(var1.method_1041(), var1.method_1054(), var1.method_1034());
         class_2700 var9 = new class_2700(var2.method_1041(), var2.method_1054(), var2.method_1034());
         class_2700 var10 = var8.method_12166(var9);
         return var0.method_6104(
            var9.method_12173() * -var4 + var10.method_12173() * var3 + var8.method_12173() * var5,
            var9.method_12165() * -var4 + var10.method_12165() * var3 + var8.method_12165() * var5,
            var9.method_12185() * -var4 + var10.method_12185() * var3 + var8.method_12185() * var5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }
}
