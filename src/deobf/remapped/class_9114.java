package remapped;

public class class_9114 extends class_2830 {
   private static String[] field_46655;
   public static final class_4190 field_46656 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   public class_9114(class_3073 var1) {
      super(var1);
   }

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      super.method_10784(var1, var2, var3, var4);
      if (var2 instanceof class_6331 && var4 instanceof BoatEntity) {
         var2.method_7511(new BlockPos(var3), true, var4);
      }
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_46656;
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, BlockPos var3) {
      class_4774 var6 = var2.method_28258(var3);
      class_4774 var7 = var2.method_28258(var3.method_6081());
      return (var6.method_22005() == class_8532.field_43674 || var1.method_8362() == class_5371.field_27392) && var7.method_22005() == class_8532.field_43673;
   }
}
