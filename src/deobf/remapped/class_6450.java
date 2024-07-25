package remapped;

public class class_6450 extends class_446 {
   private static String[] field_32898;
   public class_7274 field_32897;
   private int field_32895 = -2434342;
   private int field_32896 = -6505234;

   public class_6450(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_7274 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_32897 = var7;
   }

   @Override
   public void method_32178(float var1) {
      int var4 = this.field_36270 + 20;
      int var5 = this.field_36261 + 5;
      int var6 = this.field_32897.method_33249();
      int var7 = this.field_36257 - 10 - class_6430.method_29376();
      int var8 = class_314.method_1444(this.field_32895, var1);
      int var9 = class_314.method_1444(class_1255.field_6929.field_6917, var1);
      if (this.field_32897.field_37242) {
         var8 = class_314.method_1444(-15038729, var1);
         var4 += 402 - var6;
         var9 = class_314.method_1444(class_1255.field_6918.field_6917, var1);
      }

      class_73.method_139((float)var4, (float)var5, (float)var6, (float)var7, 9.0F, var8);
      int var10 = 0;

      for (String var14 : this.field_32897.field_37243) {
         class_73.method_87(class_5320.field_27139, (float)(var4 + 10), (float)(var5 + 5 + var10 * class_5320.field_27139.method_15654()), var14, var9);
         var10++;
      }

      super.method_32178(var1);
   }
}
