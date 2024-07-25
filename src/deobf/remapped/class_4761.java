package remapped;

public class class_4761 extends class_9790 {
   private static String[] field_23045;
   private class_2654 field_23047;
   public MinecraftClient field_23046 = MinecraftClient.getInstance();

   @Override
   public int method_45194(class_1455 var1, int var2, int var3, int var4) {
      if (this.field_23046.thePlayer == null) {
         return 0;
      } else {
         class_2522 var7 = this.field_23046.field_9601.method_28262(new class_1331(var2, var3, var4));
         return var7 != null ? class_7494.method_34081(var7.method_8360()) << 4 | class_7494.method_34075(var7) : 0;
      }
   }

   public class_2654 method_21955(World var1, int var2, int var3) {
      return this.field_23047 != null && this.field_23047.method_27352().field_10328 == var2 && this.field_23047.method_27352().field_10327 == var3
         ? this.field_23047
         : (this.field_23047 = var1.method_29554(var2, var3));
   }
}
