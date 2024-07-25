package remapped;

public class class_7400 extends class_1859 {
   public float field_37767 = 0.0F;
   private final int field_37774 = 10;
   private final int field_37772 = 60;
   public int field_37769;
   public int field_37768;
   public int field_37770;
   public int field_37773;
   private class_4042 field_37775;

   public class_7400(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, class_590.field_3421, var7, false);
      this.field_36258 = class_5320.field_27152;
   }

   @Override
   public void method_32145(int var1, int var2) {
      this.field_37769 = var1;
      this.field_37768 = var2;
   }

   @Override
   public void method_32178(float var1) {
      this.field_37775 = SigmaMainClass.getInstance().getAccountManager().method_23081();
      String var4 = "Log in";
      class_8343 var5 = NotificationIcons.field_11054;
      if (this.field_37775 != null) {
         var4 = this.field_37775.field_19615;
      }

      this.method_32142(this.field_36258.method_18547(var4) + 50 + 60);
      this.method_32175(MinecraftClient.getInstance().window.method_43166() - this.field_36278 - 20);
      boolean var6 = this.field_37769 >= this.field_36270 && this.field_37768 <= this.field_36261 + this.method_32137();
      this.field_37767 = Math.max(0.0F, Math.min(1.0F, this.field_37767 + (!var6 ? -0.1F : 0.1F)));
      class_73.method_128(
         (float)this.field_36270, (float)this.field_36261, (float)this.method_32109(), (float)this.method_32137(), 20.0F, this.field_37767 * 0.2F * var1
      );
      class_73.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)(this.field_36270 + this.method_32109()),
         (float)(this.field_36261 + this.method_32137()),
         class_314.method_1444(class_1255.field_6914.field_6917, (0.2F * this.field_37767 + (!this.method_32185() ? 0.0F : 0.2F)) * var1)
      );
      float var7 = (float)(this.field_36270 + this.field_36278 - 60 - 10);
      float var8 = (float)(this.field_36261 + 10);
      class_73.method_99(
         (float)(this.field_36270 + this.field_36278 - 60 - 10),
         (float)(this.field_36261 + 10),
         60.0F,
         60.0F,
         var5,
         class_314.method_1444(class_1255.field_6918.field_6917, (0.5F + 0.5F * this.field_37767) * var1)
      );
      class_73.method_87(
         this.field_36258,
         (float)(this.field_36270 + this.field_36278 - 90 - this.field_36258.method_18547(var4)),
         (float)(this.field_36261 + 27),
         var4,
         class_314.method_1444(class_1255.field_6918.field_6917, (0.5F + 0.5F * this.field_37767) * var1)
      );
      super.method_32178(var1);
   }
}
