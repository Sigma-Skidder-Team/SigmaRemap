package remapped;

import javax.annotation.Nullable;

public class class_3064 extends class_2830 {
   private static String[] field_15064;
   public static final class_7360<class_7422> field_15063 = class_6023.field_30754;

   public class_3064(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_15063, class_7422.field_37876));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      class_7422 var9 = var1.<class_7422>method_10313(field_15063);
      if (var2.method_1029() != class_9249.field_47216
         || var9 == class_7422.field_37876 != (var2 == Direction.field_817)
         || var3.method_8350(this) && var3.<class_7422>method_10313(field_15063) != var9) {
         return var9 == class_7422.field_37876 && var2 == Direction.field_802 && !var1.method_8309(var4, var5)
            ? class_4783.field_23184.method_29260()
            : super.method_10763(var1, var2, var3, var4, var5, var6);
      } else {
         return class_4783.field_23184.method_29260();
      }
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      BlockPos var4 = var1.method_21858();
      return var4.method_12165() < 255 && var1.method_21862().method_28262(var4.method_6081()).method_8374(var1) ? super.method_29302(var1) : null;
   }

   @Override
   public void method_29257(World var1, BlockPos var2, class_2522 var3, class_5834 var4, ItemStack var5) {
      var1.method_7513(var2.method_6081(), this.method_29260().method_10308(field_15063, class_7422.field_37874), 3);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      if (var1.<class_7422>method_10313(field_15063) != class_7422.field_37874) {
         return super.method_10787(var1, var2, var3);
      } else {
         class_2522 var6 = var2.method_28262(var3.method_6100());
         return var6.method_8350(this) && var6.<class_7422>method_10313(field_15063) == class_7422.field_37876;
      }
   }

   public void method_14009(class_9379 var1, BlockPos var2, int var3) {
      var1.method_7513(var2, this.method_29260().method_10308(field_15063, class_7422.field_37876), var3);
      var1.method_7513(var2.method_6081(), this.method_29260().method_10308(field_15063, class_7422.field_37874), var3);
   }

   @Override
   public void method_29265(World var1, BlockPos var2, class_2522 var3, PlayerEntity var4) {
      if (!var1.field_33055) {
         if (!var4.method_3186()) {
            method_29295(var3, var1, var2, (class_3757)null, var4, var4.method_26446());
         } else {
            method_14008(var1, var2, var3, var4);
         }
      }

      super.method_29265(var1, var2, var3, var4);
   }

   @Override
   public void method_29298(World var1, PlayerEntity var2, BlockPos var3, class_2522 var4, class_3757 var5, ItemStack var6) {
      super.method_29298(var1, var2, var3, class_4783.field_23184.method_29260(), var5, var6);
   }

   public static void method_14008(World var0, BlockPos var1, class_2522 var2, PlayerEntity var3) {
      class_7422 var6 = var2.<class_7422>method_10313(field_15063);
      if (var6 == class_7422.field_37874) {
         BlockPos var7 = var1.method_6100();
         class_2522 var8 = var0.method_28262(var7);
         if (var8.method_8360() == var2.method_8360() && var8.<class_7422>method_10313(field_15063) == class_7422.field_37876) {
            var0.method_7513(var7, class_4783.field_23184.method_29260(), 35);
            var0.method_43365(var3, 2001, var7, class_6414.method_29285(var8));
         }
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_15063);
   }

   @Override
   public class_7971 method_10772() {
      return class_7971.field_40824;
   }

   @Override
   public long method_10759(class_2522 var1, BlockPos var2) {
      return class_9299.method_42839(
         var2.method_12173(), var2.method_6101(var1.method_10313(field_15063) != class_7422.field_37876 ? 1 : 0).method_12165(), var2.method_12185()
      );
   }
}
