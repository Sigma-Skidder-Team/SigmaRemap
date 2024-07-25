package remapped;

public class class_4293 extends class_2255<class_7932> {
   public static final class_2843 field_20829 = new class_2843(class_8359.field_42824, new Identifier("entity/enchanting_table_book"));
   private final class_8197 field_20828 = new class_8197();

   public class_4293(class_3569 var1) {
      super(var1);
   }

   public void method_19940(class_7932 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      var3.method_36063();
      var3.method_36065(0.5, 0.75, 0.5);
      float var9 = (float)var1.field_40571 + var2;
      var3.method_36065(0.0, (double)(0.1F + class_9299.method_42818(var9 * 0.1F) * 0.01F), 0.0);
      float var10 = var1.field_40570 - var1.field_40567;

      while (var10 >= (float) Math.PI) {
         var10 -= (float) (Math.PI * 2);
      }

      while (var10 < (float) -Math.PI) {
         var10 += (float) (Math.PI * 2);
      }

      float var11 = var1.field_40567 + var10 * var2;
      var3.method_36060(class_2426.field_12074.method_11062(-var11));
      var3.method_36060(class_2426.field_12076.method_11074(80.0F));
      float var12 = class_9299.method_42795(var2, var1.field_40574, var1.field_40575);
      float var13 = class_9299.method_42823(var12 + 0.25F) * 1.6F - 0.3F;
      float var14 = class_9299.method_42823(var12 + 0.75F) * 1.6F - 0.3F;
      float var15 = class_9299.method_42795(var2, var1.field_40573, var1.field_40572);
      this.field_20828.method_37551(var9, class_9299.method_42828(var13, 0.0F, 1.0F), class_9299.method_42828(var14, 0.0F, 1.0F), var15);
      class_7907 var16 = field_20829.method_12943(var4, class_3581::method_16734);
      this.field_20828.method_37552(var3, var16, var5, var6, 1.0F, 1.0F, 1.0F, 1.0F);
      var3.method_36064();
   }
}
