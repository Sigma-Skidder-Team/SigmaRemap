package remapped;

import java.util.Random;

public abstract class class_691 extends class_6414 {
   public static final class_4190 field_3797 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   public static final class_4190 field_3796 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   public static final class_4092 field_3798 = new class_4092(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

   public class_691(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.method_3119(var1) <= 0 ? field_3796 : field_3797;
   }

   public int method_3118() {
      return 20;
   }

   @Override
   public boolean method_29278() {
      return true;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2 == class_240.field_802 && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_1331 var6 = var3.method_6100();
      return method_29273(var2, var6) || method_29266(var2, var6, class_240.field_817);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      int var7 = this.method_3119(var1);
      if (var7 > 0) {
         this.method_3123(var2, var3, var1, var7);
      }
   }

   @Override
   public void method_10784(class_2522 var1, class_6486 var2, class_1331 var3, class_8145 var4) {
      if (!var2.field_33055) {
         int var7 = this.method_3119(var1);
         if (var7 == 0) {
            this.method_3123(var2, var3, var1, var7);
         }
      }
   }

   public void method_3123(class_6486 var1, class_1331 var2, class_2522 var3, int var4) {
      int var7 = this.method_3122(var1, var2);
      boolean var8 = var4 > 0;
      boolean var9 = var7 > 0;
      if (var4 != var7) {
         class_2522 var10 = this.method_3116(var3, var7);
         var1.method_7513(var2, var10, 2);
         this.method_3121(var1, var2);
         var1.method_29567(var2, var3, var10);
      }

      if (!var9 && var8) {
         this.method_3120(var1, var2);
      } else if (var9 && !var8) {
         this.method_3117(var1, var2);
      }

      if (var9) {
         var1.method_43367().method_14011(new class_1331(var2), this, this.method_3118());
      }
   }

   public abstract void method_3117(class_9379 var1, class_1331 var2);

   public abstract void method_3120(class_9379 var1, class_1331 var2);

   @Override
   public void method_10761(class_2522 var1, class_6486 var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var5 && !var1.method_8350(var4.method_8360())) {
         if (this.method_3119(var1) > 0) {
            this.method_3121(var2, var3);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   public void method_3121(class_6486 var1, class_1331 var2) {
      var1.method_29563(var2, this);
      var1.method_29563(var2.method_6100(), this);
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, class_1331 var3, class_240 var4) {
      return this.method_3119(var1);
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, class_1331 var3, class_240 var4) {
      return var4 != class_240.field_817 ? 0 : this.method_3119(var1);
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public class_718 method_10780(class_2522 var1) {
      return class_718.field_3916;
   }

   public abstract int method_3122(class_6486 var1, class_1331 var2);

   public abstract int method_3119(class_2522 var1);

   public abstract class_2522 method_3116(class_2522 var1, int var2);
}
