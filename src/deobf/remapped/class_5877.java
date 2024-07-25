package remapped;

import java.util.Random;

public abstract class class_5877 extends class_380 {
   public static final class_4190 field_29834 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final class_6720 field_29833 = class_6023.field_30696;

   public class_5877(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_29834;
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      return method_29273(var2, var3.method_6100());
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (!this.method_26767(var2, var3, var1)) {
         boolean var7 = var1.<Boolean>method_10313(field_29833);
         boolean var8 = this.method_26772(var2, var3, var1);
         if (var7 && !var8) {
            var2.method_7513(var3, var1.method_10308(field_29833, Boolean.valueOf(false)), 2);
         } else if (!var7) {
            var2.method_7513(var3, var1.method_10308(field_29833, Boolean.valueOf(true)), 2);
            if (!var8) {
               var2.method_28968().method_14012(var3, this, this.method_26765(var1), class_1716.field_8857);
            }
         }
      }
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, class_1331 var3, Direction var4) {
      return var1.method_8327(var2, var3, var4);
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, class_1331 var3, Direction var4) {
      if (var1.<Boolean>method_10313(field_29833)) {
         return var1.method_10313(field_1543) != var4 ? 0 : this.method_26771(var2, var3, var1);
      } else {
         return 0;
      }
   }

   @Override
   public void method_10801(class_2522 var1, World var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      if (!var1.method_8309(var2, var3)) {
         class_3757 var9 = !this.method_10802() ? null : var2.method_28260(var3);
         method_29296(var1, var2, var3, var9);
         var2.method_7508(var3, false);

         for (Direction var13 : Direction.values()) {
            var2.method_29563(var3.method_6098(var13), this);
         }
      } else {
         this.method_26774(var2, var3, var1);
      }
   }

   public void method_26774(World var1, class_1331 var2, class_2522 var3) {
      if (!this.method_26767(var1, var2, var3)) {
         boolean var6 = var3.<Boolean>method_10313(field_29833);
         boolean var7 = this.method_26772(var1, var2, var3);
         if (var6 != var7 && !var1.method_43367().method_14010(var2, this)) {
            class_1716 var8 = class_1716.field_8862;
            if (!this.method_26768(var1, var2, var3)) {
               if (var6) {
                  var8 = class_1716.field_8857;
               }
            } else {
               var8 = class_1716.field_8855;
            }

            var1.method_43367().method_14012(var2, this, this.method_26765(var3), var8);
         }
      }
   }

   public boolean method_26767(class_4924 var1, class_1331 var2, class_2522 var3) {
      return false;
   }

   public boolean method_26772(World var1, class_1331 var2, class_2522 var3) {
      return this.method_26773(var1, var2, var3) > 0;
   }

   public int method_26773(World var1, class_1331 var2, class_2522 var3) {
      Direction var6 = var3.<Direction>method_10313(field_1543);
      class_1331 var7 = var2.method_6098(var6);
      int var8 = var1.method_29577(var7, var6);
      if (var8 < 15) {
         class_2522 var9 = var1.method_28262(var7);
         return Math.max(var8, !var9.method_8350(class_4783.field_23349) ? 0 : var9.<Integer>method_10313(class_9301.field_47514));
      } else {
         return var8;
      }
   }

   public int method_26770(class_4924 var1, class_1331 var2, class_2522 var3) {
      Direction var6 = var3.<Direction>method_10313(field_1543);
      Direction var7 = var6.method_1042();
      Direction var8 = var6.method_1053();
      return Math.max(this.method_26766(var1, var2.method_6098(var7), var7), this.method_26766(var1, var2.method_6098(var8), var8));
   }

   public int method_26766(class_4924 var1, class_1331 var2, Direction var3) {
      class_2522 var6 = var1.method_28262(var2);
      if (!this.method_26763(var6)) {
         return 0;
      } else if (!var6.method_8350(class_4783.field_23658)) {
         return !var6.method_8350(class_4783.field_23349) ? var1.method_22551(var2, var3) : var6.<Integer>method_10313(class_9301.field_47514);
      } else {
         return 15;
      }
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_1543, var1.method_21863().method_1046());
   }

   @Override
   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, ItemStack var5) {
      if (this.method_26772(var1, var2, var3)) {
         var1.method_43367().method_14011(var2, this, 1);
      }
   }

   @Override
   public void method_10760(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      this.method_26764(var2, var3, var1);
   }

   @Override
   public void method_10761(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var5 && !var1.method_8350(var4.method_8360())) {
         super.method_10761(var1, var2, var3, var4, var5);
         this.method_26764(var2, var3, var1);
      }
   }

   public void method_26764(World var1, class_1331 var2, class_2522 var3) {
      Direction var6 = var3.<Direction>method_10313(field_1543);
      class_1331 var7 = var2.method_6098(var6.method_1046());
      var1.method_29520(var7, this, var2);
      var1.method_29526(var7, this, var6);
   }

   public boolean method_26763(class_2522 var1) {
      return var1.method_8355();
   }

   public int method_26771(class_6163 var1, class_1331 var2, class_2522 var3) {
      return 15;
   }

   public static boolean method_26769(class_2522 var0) {
      return var0.method_8360() instanceof class_5877;
   }

   public boolean method_26768(class_6163 var1, class_1331 var2, class_2522 var3) {
      Direction var6 = var3.<Direction>method_10313(field_1543).method_1046();
      class_2522 var7 = var1.method_28262(var2.method_6098(var6));
      return method_26769(var7) && var7.<Direction>method_10313(field_1543) != var6;
   }

   public abstract int method_26765(class_2522 var1);
}
