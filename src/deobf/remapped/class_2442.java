package remapped;

public class class_2442 extends class_4314 {
   private static String[] field_12133;
   public static final class_7044 field_12134 = class_6023.field_30758;
   public static final class_6720 field_12135 = class_6023.field_30739;
   public static final class_4190 field_12132 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public class_2442(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_12134, Integer.valueOf(0)).method_10308(field_12135, Boolean.valueOf(false)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_12132;
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, class_1331 var3, class_240 var4) {
      return var1.<Integer>method_10313(field_12134);
   }

   public static void method_11129(class_2522 var0, class_6486 var1, class_1331 var2) {
      if (var1.method_22572().method_40229()) {
         int var5 = var1.method_25266(class_2957.field_14437, var2) - var1.method_22557();
         float var6 = var1.method_29553(1.0F);
         boolean var7 = var0.<Boolean>method_10313(field_12135);
         if (!var7) {
            if (var5 > 0) {
               float var8 = !(var6 < (float) Math.PI) ? (float) (Math.PI * 2) : 0.0F;
               var6 += (var8 - var6) * 0.2F;
               var5 = Math.round((float)var5 * class_9299.method_42840(var6));
            }
         } else {
            var5 = 15 - var5;
         }

         var5 = class_9299.method_42829(var5, 0, 15);
         if (var0.<Integer>method_10313(field_12134) != var5) {
            var1.method_7513(var2, var0.method_10308(field_12134, Integer.valueOf(var5)), 3);
         }
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var4.method_3181()) {
         return super.method_10777(var1, var2, var3, var4, var5, var6);
      } else if (!var2.field_33055) {
         class_2522 var9 = var1.method_10317(field_12135);
         var2.method_7513(var3, var9, 4);
         method_11129(var9, var2, var3);
         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_5910();
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_12134, field_12135);
   }
}
