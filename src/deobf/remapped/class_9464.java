package remapped;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class class_9464 extends class_5877 implements class_724 {
   private static String[] field_48279;
   public static final class_7360<class_9607> field_48280 = class_6023.field_30683;

   public class_9464(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_1543, Direction.field_818)
            .method_10308(field_29833, Boolean.valueOf(false))
            .method_10308(field_48280, class_9607.field_48961)
      );
   }

   @Override
   public int method_26765(class_2522 var1) {
      return 2;
   }

   @Override
   public int method_26771(class_6163 var1, BlockPos var2, class_2522 var3) {
      class_3757 var6 = var1.method_28260(var2);
      return !(var6 instanceof class_892) ? 0 : ((class_892)var6).method_3847();
   }

   private int method_43737(World var1, BlockPos var2, class_2522 var3) {
      return var3.method_10313(field_48280) != class_9607.field_48960
         ? this.method_26773(var1, var2, var3)
         : Math.max(this.method_26773(var1, var2, var3) - this.method_26770(var1, var2, var3), 0);
   }

   @Override
   public boolean method_26772(World var1, BlockPos var2, class_2522 var3) {
      int var6 = this.method_26773(var1, var2, var3);
      if (var6 != 0) {
         int var7 = this.method_26770(var1, var2, var3);
         return var6 > var7 ? true : var6 == var7 && var3.<class_9607>method_10313(field_48280) == class_9607.field_48961;
      } else {
         return false;
      }
   }

   @Override
   public int method_26773(World var1, BlockPos var2, class_2522 var3) {
      int var6 = super.method_26773(var1, var2, var3);
      Direction var7 = var3.<Direction>method_10313(field_1543);
      BlockPos var8 = var2.method_6098(var7);
      class_2522 var9 = var1.method_28262(var8);
      if (!var9.method_8344()) {
         if (var6 < 15 && var9.method_8356(var1, var8)) {
            var8 = var8.method_6098(var7);
            var9 = var1.method_28262(var8);
            class_7451 var10 = this.method_43739(var1, var7, var8);
            int var11 = Math.max(
               var10 != null ? var10.method_33909() : Integer.MIN_VALUE, !var9.method_8344() ? Integer.MIN_VALUE : var9.method_8328(var1, var8)
            );
            if (var11 != Integer.MIN_VALUE) {
               var6 = var11;
            }
         }
      } else {
         var6 = var9.method_8328(var1, var8);
      }

      return var6;
   }

   @Nullable
   private class_7451 method_43739(World var1, Direction var2, BlockPos var3) {
      List var6 = var1.<class_7451>method_25869(
         class_7451.class,
         new Box(
            (double)var3.method_12173(),
            (double)var3.method_12165(),
            (double)var3.method_12185(),
            (double)(var3.method_12173() + 1),
            (double)(var3.method_12165() + 1),
            (double)(var3.method_12185() + 1)
         ),
         var1x -> var1x != null && var1x.method_37365() == var2
      );
      return var6.size() != 1 ? null : (class_7451)var6.get(0);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, class_704 var4, Hand var5, class_9529 var6) {
      if (var4.playerAbilities.allowEdit) {
         var1 = var1.method_10317(field_48280);
         float var9 = var1.method_10313(field_48280) != class_9607.field_48960 ? 0.5F : 0.55F;
         var2.method_43359(var4, var3, class_463.field_2263, class_562.field_3322, 0.3F, var9);
         var2.method_7513(var3, var1, 2);
         this.method_43738(var2, var3, var1);
         return class_6910.method_31659(var2.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public void method_26774(World var1, BlockPos var2, class_2522 var3) {
      if (!var1.method_43367().method_14010(var2, this)) {
         int var6 = this.method_43737(var1, var2, var3);
         class_3757 var7 = var1.method_28260(var2);
         int var8 = !(var7 instanceof class_892) ? 0 : ((class_892)var7).method_3847();
         if (var6 != var8 || var3.<Boolean>method_10313(field_29833) != this.method_26772(var1, var2, var3)) {
            class_1716 var9 = !this.method_26768(var1, var2, var3) ? class_1716.field_8861 : class_1716.field_8862;
            var1.method_43367().method_14012(var2, this, 2, var9);
         }
      }
   }

   private void method_43738(World var1, BlockPos var2, class_2522 var3) {
      int var6 = this.method_43737(var1, var2, var3);
      class_3757 var7 = var1.method_28260(var2);
      int var8 = 0;
      if (var7 instanceof class_892) {
         class_892 var9 = (class_892)var7;
         var8 = var9.method_3847();
         var9.method_3846(var6);
      }

      if (var8 != var6 || var3.<class_9607>method_10313(field_48280) == class_9607.field_48961) {
         boolean var11 = this.method_26772(var1, var2, var3);
         boolean var10 = var3.<Boolean>method_10313(field_29833);
         if (var10 && !var11) {
            var1.method_7513(var2, var3.method_10308(field_29833, Boolean.valueOf(false)), 2);
         } else if (!var10 && var11) {
            var1.method_7513(var2, var3.method_10308(field_29833, Boolean.valueOf(true)), 2);
         }

         this.method_26764(var1, var2, var3);
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      this.method_43738(var2, var3, var1);
   }

   @Override
   public boolean method_10800(class_2522 var1, World var2, BlockPos var3, int var4, int var5) {
      super.method_10800(var1, var2, var3, var4, var5);
      class_3757 var8 = var2.method_28260(var3);
      return var8 != null && var8.method_17408(var4, var5);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_892();
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_1543, field_48280, field_29833);
   }
}
