package remapped;

public class class_4636 extends class_446 {
   private static String[] field_22649;
   public int field_22650;

   public class_4636(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_32186(var7);
      this.method_32100((var0, var1x) -> MinecraftClient.getInstance().getSoundHandler().play(class_4949.method_22675(SoundEvents.field_1995, 1.0F)));
      this.field_22650 = var8;
   }

   @Override
   public void method_32178(float var1) {
      this.method_32144(class_5320.field_27156);
      FontManager.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)(this.field_36270 + this.field_36278),
         (float)(this.field_36261 + this.field_36257),
         class_314.method_1444(this.field_22650, !this.method_32140() ? 0.25F : (!this.method_32183() ? 0.4F : (!this.method_32185() ? 0.5F : 0.6F)))
      );
      FontManager.method_110(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)(this.field_36270 + this.field_36278),
         (float)(this.field_36261 + this.field_36257),
         2,
         class_314.method_1444(this.field_22650, 0.2F)
      );
      FontManager.method_88(
         class_5320.field_27156,
         (float)(this.method_32132() + this.method_32109() / 2),
         (float)(this.method_32173() + this.method_32137() / 2),
         this.field_36275,
         class_314.method_1444(class_1255.field_6918.field_6917, !this.method_32140() ? 0.5F : 1.0F),
         class_6206.field_31726,
         class_6206.field_31726
      );
      super.method_32178(var1);
   }
}
