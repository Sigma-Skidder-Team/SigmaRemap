package remapped;

import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5360 extends class_3232 {
   private static final Logger field_27353 = LogManager.getLogger();
   private final class_2654 field_27355;
   private final class_4663 field_27354;
   public volatile class_6007 field_27356;
   private final ClientWorld field_27352;

   public class_5360(ClientWorld var1, int var2) {
      this.field_27352 = var1;
      this.field_27355 = new class_8526(var1, new class_2034(0, 0));
      this.field_27354 = new class_4663(this, true, var1.method_22572().method_40229());
      this.field_27356 = new class_6007(this, method_24466(var2), null);
   }

   @Override
   public class_4663 method_14813() {
      return this.field_27354;
   }

   private static boolean method_24470(class_2654 var0, int var1, int var2) {
      if (var0 == null) {
         return false;
      } else {
         class_2034 var5 = var0.method_27352();
         return var5.field_10328 == var1 && var5.field_10327 == var2;
      }
   }

   public void method_24471(int var1, int var2) {
      if (class_6007.method_27425(this.field_27356, var1, var2)) {
         int var5 = this.field_27356.method_27420(var1, var2);
         class_2654 var6 = this.field_27356.method_27416(var5);
         if (method_24470(var6, var1, var2)) {
            if (class_7860.field_40024.method_22501()) {
               class_7860.method_35568(class_7860.field_40024, var6);
            }

            var6.method_11981(false);
            this.field_27356.method_27421(var5, var6, (class_2654)null);
         }
      }
   }

   @Nullable
   public class_2654 method_24468(int var1, int var2, class_7335 var3, boolean var4) {
      if (class_6007.method_27425(this.field_27356, var1, var2)) {
         class_2654 var7 = this.field_27356.method_27416(this.field_27356.method_27420(var1, var2));
         if (method_24470(var7, var1, var2)) {
            return var7;
         }
      }

      return !var4 ? null : this.field_27355;
   }

   @Override
   public class_6163 method_23027() {
      return this.field_27352;
   }

   @Nullable
   public class_2654 method_24465(int var1, int var2, class_546 var3, class_8248 var4, CompoundNBT var5, int var6, boolean var7) {
      if (!class_6007.method_27425(this.field_27356, var1, var2)) {
         field_27353.warn("Ignoring chunk since it's not in the view range: {}, {}", var1, var2);
         return null;
      } else {
         int var10 = this.field_27356.method_27420(var1, var2);
         Object var11 = this.field_27356.field_30586.get(var10);
         if (!var7 && method_24470((class_2654)var11, var1, var2)) {
            boolean var12 = false;
            if (var11 instanceof class_6907) {
               class_6907 var13 = (class_6907)var11;
               Object var14 = var4.method_37745("ChunkDataOF");
               if (var14 instanceof class_6215) {
                  class_6215 var15 = (class_6215)var14;
                  var13.method_31650(var15);
                  class_1315.field_7257.set(var15);
                  var12 = true;
               }
            }

            ((class_2654)var11).method_11984(var3, var4, var5, var6);
            if (var12) {
               class_1315.field_7257.set((class_6215)null);
            }
         } else {
            if (var3 == null) {
               field_27353.warn("Ignoring chunk since we don't have complete data: {}, {}", var1, var2);
               return null;
            }

            if (var11 != null) {
               ((class_2654)var11).method_11981(false);
            }

            var11 = new class_6907(this.field_27352, new class_2034(var1, var2), var3);
            ((class_2654)var11).method_11984(var3, var4, var5, var6);
            this.field_27356.method_27423(var10, (class_2654)var11);
         }

         class_1315[] var16 = ((class_2654)var11).method_27349();
         class_4663 var17 = this.method_14813();
         var17.method_21563(new class_2034(var1, var2), true);

         for (int var18 = 0; var18 < var16.length; var18++) {
            class_1315 var19 = var16[var18];
            var17.method_34830(class_6979.method_31893(var1, var18, var2), class_1315.method_6003(var19));
         }

         this.field_27352.method_760(var1, var2);
         if (class_7860.field_39925.method_22501()) {
            class_7860.method_35568(class_7860.field_39925, var11);
         }

         ((class_2654)var11).method_11981(true);
         return (class_2654)var11;
      }
   }

   public void method_24472(BooleanSupplier var1) {
   }

   public void method_24464(int var1, int var2) {
      class_6007.method_27422(this.field_27356, var1);
      class_6007.method_27417(this.field_27356, var2);
   }

   public void method_24473(int var1) {
      int var4 = class_6007.method_27418(this.field_27356);
      int var5 = method_24466(var1);
      if (var4 != var5) {
         class_6007 var6 = new class_6007(this, var5, null);
         class_6007.method_27422(var6, class_6007.method_27414(this.field_27356));
         class_6007.method_27417(var6, class_6007.method_27415(this.field_27356));

         for (int var7 = 0; var7 < this.field_27356.field_30586.length(); var7++) {
            class_2654 var8 = this.field_27356.field_30586.get(var7);
            if (var8 != null) {
               class_2034 var9 = var8.method_27352();
               if (class_6007.method_27425(var6, var9.field_10328, var9.field_10327)) {
                  var6.method_27423(var6.method_27420(var9.field_10328, var9.field_10327), var8);
               }
            }
         }

         this.field_27356 = var6;
      }
   }

   private static int method_24466(int var0) {
      return Math.max(2, var0) + 3;
   }

   @Override
   public String method_14814() {
      return "Client Chunk Cache: " + this.field_27356.field_30586.length() + ", " + this.method_24467();
   }

   public int method_24467() {
      return class_6007.method_27413(this.field_27356);
   }

   @Override
   public void method_23026(class_2957 var1, class_6979 var2) {
      MinecraftClient.getInstance().worldRenderer.method_20070(var2.method_31930(), var2.method_31918(), var2.method_31900());
   }

   @Override
   public boolean method_14815(BlockPos var1) {
      return this.method_14816(var1.method_12173() >> 4, var1.method_12185() >> 4);
   }

   @Override
   public boolean method_14823(class_2034 var1) {
      return this.method_14816(var1.field_10328, var1.field_10327);
   }

   @Override
   public boolean method_14824(Entity var1) {
      return this.method_14816(class_9299.method_42847(var1.getPosX()) >> 4, class_9299.method_42847(var1.getPosZ()) >> 4);
   }
}
