package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_1657 extends class_5920<MobEntity> {
   private static String[] field_8598;
   private int field_8600;
   private class_3998 field_8601;
   private BlockPos field_8597;
   private float field_8599;

   public class_1657() {
      this(150, 250);
   }

   public class_1657(int var1, int var2) {
      super(
         ImmutableMap.of(
            class_6044.field_30909, class_561.field_3319, class_6044.field_30888, class_561.field_3318, class_6044.field_30889, class_561.field_3320
         ),
         var1,
         var2
      );
   }

   public boolean method_7389(class_6331 var1, MobEntity var2) {
      if (this.field_8600 <= 0) {
         class_1150 var5 = var2.method_26525();
         class_6651 var6 = var5.<class_6651>method_5138(class_6044.field_30889).get();
         boolean var7 = this.method_7387(var2, var6);
         if (!var7 && this.method_7390(var2, var6, var1.method_29546())) {
            this.field_8597 = var6.method_30562().method_35462();
            return true;
         } else {
            var5.method_5127(class_6044.field_30889);
            if (var7) {
               var5.method_5127(class_6044.field_30909);
            }

            return false;
         }
      } else {
         this.field_8600--;
         return false;
      }
   }

   public boolean method_7388(class_6331 var1, MobEntity var2, long var3) {
      if (this.field_8601 != null && this.field_8597 != null) {
         Optional var7 = var2.method_26525().<class_6651>method_5138(class_6044.field_30889);
         class_1249 var8 = var2.method_26927();
         return !var8.method_5591() && var7.isPresent() && !this.method_7387(var2, (class_6651)var7.get());
      } else {
         return false;
      }
   }

   public void method_7386(class_6331 var1, MobEntity var2, long var3) {
      if (var2.method_26525().method_5117(class_6044.field_30889)
         && !this.method_7387(var2, var2.method_26525().<class_6651>method_5138(class_6044.field_30889).get())
         && var2.method_26927().method_5597()) {
         this.field_8600 = var1.method_43360().nextInt(40);
      }

      var2.method_26927().method_5620();
      var2.method_26525().method_5127(class_6044.field_30889);
      var2.method_26525().method_5127(class_6044.field_30888);
      this.field_8601 = null;
   }

   public void method_7385(class_6331 var1, MobEntity var2, long var3) {
      var2.method_26525().method_5105(class_6044.field_30888, this.field_8601);
      var2.method_26927().method_5607(this.field_8601, (double)this.field_8599);
   }

   public void method_7384(class_6331 var1, MobEntity var2, long var3) {
      class_3998 var7 = var2.method_26927().method_5594();
      class_1150 var8 = var2.method_26525();
      if (this.field_8601 != var7) {
         this.field_8601 = var7;
         var8.method_5105(class_6044.field_30888, var7);
      }

      if (var7 != null && this.field_8597 != null) {
         class_6651 var9 = var8.<class_6651>method_5138(class_6044.field_30889).get();
         if (var9.method_30562().method_35462().method_12180(this.field_8597) > 4.0 && this.method_7390(var2, var9, var1.method_29546())) {
            this.field_8597 = var9.method_30562().method_35462();
            this.method_7385(var1, var2, var3);
         }
      }
   }

   private boolean method_7390(MobEntity var1, class_6651 var2, long var3) {
      BlockPos var7 = var2.method_30562().method_35462();
      this.field_8601 = var1.method_26927().method_5615(var7, 0);
      this.field_8599 = var2.method_30559();
      class_1150 var8 = var1.method_26525();
      if (!this.method_7387(var1, var2)) {
         boolean var9 = this.field_8601 != null && this.field_8601.method_18433();
         if (!var9) {
            if (!var8.method_5117(class_6044.field_30909)) {
               var8.method_5105(class_6044.field_30909, var3);
            }
         } else {
            var8.method_5127(class_6044.field_30909);
         }

         if (this.field_8601 != null) {
            return true;
         }

         class_1343 var10 = class_3425.method_15837((class_4612)var1, 10, 7, class_1343.method_6200(var7));
         if (var10 != null) {
            this.field_8601 = var1.method_26927().method_5614(var10.field_7336, var10.field_7333, var10.field_7334, 0);
            return this.field_8601 != null;
         }
      } else {
         var8.method_5127(class_6044.field_30909);
      }

      return false;
   }

   private boolean method_7387(MobEntity var1, class_6651 var2) {
      return var2.method_30562().method_35462().method_12176(var1.method_37075()) <= var2.method_30560();
   }
}
