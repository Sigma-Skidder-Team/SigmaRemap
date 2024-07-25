package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_1254 extends class_5920<class_7666> {
   private static String[] field_6906;
   private long field_6907;
   private long field_6910;
   private int field_6909;
   private Optional<class_1331> field_6908 = Optional.<class_1331>empty();

   public class_1254() {
      super(ImmutableMap.of(class_6044.field_30874, class_561.field_3318, class_6044.field_30889, class_561.field_3318));
   }

   public boolean method_5652(class_6331 var1, class_7666 var2) {
      if (var2.field_41697 % 10 == 0 && (this.field_6910 == 0L || this.field_6910 + 160L <= (long)var2.field_41697)) {
         if (var2.method_2017().method_31504(class_4897.field_24640) > 0) {
            this.field_6908 = this.method_5649(var1, var2);
            return this.field_6908.isPresent();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean method_5651(class_6331 var1, class_7666 var2, long var3) {
      return this.field_6909 < 80 && this.field_6908.isPresent();
   }

   private Optional<class_1331> method_5649(class_6331 var1, class_7666 var2) {
      class_2921 var5 = new class_2921();
      Optional var6 = Optional.empty();
      int var7 = 0;

      for (int var8 = -1; var8 <= 1; var8++) {
         for (int var9 = -1; var9 <= 1; var9++) {
            for (int var10 = -1; var10 <= 1; var10++) {
               var5.method_13360(var2.method_37075(), var8, var9, var10);
               if (this.method_5648(var5, var1)) {
                  if (var1.field_33033.nextInt(++var7) == 0) {
                     var6 = Optional.<class_1331>of(var5.method_6072());
                  }
               }
            }
         }
      }

      return var6;
   }

   private boolean method_5648(class_1331 var1, class_6331 var2) {
      class_2522 var5 = var2.method_28262(var1);
      class_6414 var6 = var5.method_8360();
      return var6 instanceof class_8557 && !((class_8557)var6).method_39383(var5);
   }

   public void method_5646(class_6331 var1, class_7666 var2, long var3) {
      this.method_5650(var2);
      var2.method_37349(class_6943.field_35707, new class_6098(class_4897.field_24640));
      this.field_6907 = var3;
      this.field_6909 = 0;
   }

   private void method_5650(class_7666 var1) {
      this.field_6908.ifPresent(var1x -> {
         class_2933 var4 = new class_2933(var1x);
         var1.method_26525().method_5105(class_6044.field_30874, var4);
         var1.method_26525().method_5105(class_6044.field_30889, new class_6651(var4, 0.5F, 1));
      });
   }

   public void method_5647(class_6331 var1, class_7666 var2, long var3) {
      var2.method_37349(class_6943.field_35707, class_6098.field_31203);
      this.field_6910 = (long)var2.field_41697;
   }

   public void method_5645(class_6331 var1, class_7666 var2, long var3) {
      class_1331 var7 = this.field_6908.get();
      if (var3 >= this.field_6907 && var7.method_12170(var2.method_37245(), 1.0)) {
         class_6098 var8 = class_6098.field_31203;
         class_4657 var9 = var2.method_2017();
         int var10 = var9.method_31505();

         for (int var11 = 0; var11 < var10; var11++) {
            class_6098 var12 = var9.method_31498(var11);
            if (var12.method_27960() == class_4897.field_24640) {
               var8 = var12;
               break;
            }
         }

         if (!var8.method_28022() && class_8579.method_39459(var8, var1, var7)) {
            var1.method_43364(2005, var7, 0);
            this.field_6908 = this.method_5649(var1, var2);
            this.method_5650(var2);
            this.field_6907 = var3 + 40L;
         }

         this.field_6909++;
      }
   }
}
