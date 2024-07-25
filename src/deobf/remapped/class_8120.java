package remapped;

public class class_8120 extends class_7934 {
   private static String[] field_41611;

   public class_8120(class_6867 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean method_35889(ItemStack var1) {
      return method_36947(var1);
   }

   @Override
   public int method_35897() {
      return 1;
   }

   @Override
   public ItemStack method_35892(PlayerEntity var1, ItemStack var2) {
      class_6004 var5 = class_9541.method_43990(var2);
      if (var1 instanceof class_9359) {
         class_8807.field_45068.method_12763((class_9359)var1, var5);
      }

      super.method_35892(var1, var2);
      return var2;
   }

   public static boolean method_36947(ItemStack var0) {
      class_2451 var3 = var0.method_27960();
      return var3 == class_4897.field_25157 || var3 == class_4897.field_25226 || var3 == class_4897.field_24444 || var3 == class_4897.field_24812;
   }
}
