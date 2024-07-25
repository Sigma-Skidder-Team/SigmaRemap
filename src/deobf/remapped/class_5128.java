package remapped;

public class class_5128 extends class_6414 {
   private static String[] field_26458;
   public static final class_7360<class_617> field_26460 = class_6023.field_30738;
   public static final class_6720 field_26457 = class_6023.field_30696;
   public static final class_7044 field_26459 = class_6023.field_30735;

   public class_5128(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_26460, class_617.field_3517)
            .method_10308(field_26459, Integer.valueOf(0))
            .method_10308(field_26457, Boolean.valueOf(false))
      );
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_26460, class_617.method_2882(var1.method_21862().method_28262(var1.method_21858().method_6100())));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2 != class_240.field_802 ? super.method_10763(var1, var2, var3, var4, var5, var6) : var1.method_10308(field_26460, class_617.method_2882(var3));
   }

   @Override
   public void method_10801(class_2522 var1, class_6486 var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      boolean var9 = var2.method_29576(var3);
      if (var9 != var1.<Boolean>method_10313(field_26457)) {
         if (var9) {
            this.method_23517(var2, var3);
         }

         var2.method_7513(var3, var1.method_10308(field_26457, Boolean.valueOf(var9)), 3);
      }
   }

   private void method_23517(class_6486 var1, class_1331 var2) {
      if (var1.method_28262(var2.method_6081()).method_8345()) {
         var1.method_29521(var2, this, 0, 0);
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         var1 = var1.method_10317(field_26459);
         var2.method_7513(var3, var1, 3);
         this.method_23517(var2, var3);
         var4.method_3209(class_6234.field_31876);
         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Override
   public void method_10791(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4) {
      if (!var2.field_33055) {
         this.method_23517(var2, var3);
         var4.method_3209(class_6234.field_31886);
      }
   }

   @Override
   public boolean method_10800(class_2522 var1, class_6486 var2, class_1331 var3, int var4, int var5) {
      int var8 = var1.<Integer>method_10313(field_26459);
      float var9 = (float)Math.pow(2.0, (double)(var8 - 12) / 12.0);
      var2.method_43359((class_704)null, var3, var1.<class_617>method_10313(field_26460).method_2881(), class_562.field_3333, 3.0F, var9);
      var2.method_43361(
         class_3090.field_15374,
         (double)var3.method_12173() + 0.5,
         (double)var3.method_12165() + 1.2,
         (double)var3.method_12185() + 0.5,
         (double)var8 / 24.0,
         0.0,
         0.0
      );
      return true;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_26460, field_26457, field_26459);
   }
}
