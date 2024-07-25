package remapped;

import java.util.Random;

public class class_6218 extends class_5877 {
   private static String[] field_31757;
   public static final class_6720 field_31755 = class_6023.field_30668;
   public static final class_7044 field_31756 = class_6023.field_30707;

   public class_6218(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_1543, Direction.field_818)
            .method_10308(field_31756, Integer.valueOf(1))
            .method_10308(field_31755, Boolean.valueOf(false))
            .method_10308(field_29833, Boolean.valueOf(false))
      );
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (var4.field_3876.allowEdit) {
         var2.method_7513(var3, var1.method_10317(field_31756), 3);
         return class_6910.method_31659(var2.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public int method_26765(class_2522 var1) {
      return var1.<Integer>method_10313(field_31756) * 2;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = super.method_29302(var1);
      return var4.method_10308(field_31755, Boolean.valueOf(this.method_26767(var1.method_21862(), var1.method_21858(), var4)));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return !var4.method_22567() && var2.method_1029() != var1.<Direction>method_10313(field_1543).method_1029()
         ? var1.method_10308(field_31755, Boolean.valueOf(this.method_26767(var4, var5, var1)))
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_26767(class_4924 var1, class_1331 var2, class_2522 var3) {
      return this.method_26770(var1, var2, var3) > 0;
   }

   @Override
   public boolean method_26763(class_2522 var1) {
      return method_26769(var1);
   }

   @Override
   public void method_29280(class_2522 var1, World var2, class_1331 var3, Random var4) {
      if (var1.<Boolean>method_10313(field_29833)) {
         Direction var7 = var1.<Direction>method_10313(field_1543);
         double var8 = (double)var3.method_12173() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         double var10 = (double)var3.method_12165() + 0.4 + (var4.nextDouble() - 0.5) * 0.2;
         double var12 = (double)var3.method_12185() + 0.5 + (var4.nextDouble() - 0.5) * 0.2;
         float var14 = -5.0F;
         if (var4.nextBoolean()) {
            var14 = (float)(var1.<Integer>method_10313(field_31756) * 2 - 1);
         }

         var14 /= 16.0F;
         double var15 = (double)(var14 * (float)var7.method_1041());
         double var17 = (double)(var14 * (float)var7.method_1034());
         var2.method_43361(class_5727.field_28937, var8 + var15, var10, var12 + var17, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_1543, field_31756, field_31755, field_29833);
   }
}
