package remapped;

public class class_8402 extends class_6220 implements class_6375 {
   private static String[] field_42987;
   public float field_42986;
   public boolean field_42985 = false;

   public class_8402(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, class_3384 var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public class_8402(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public class_8402(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class_8402(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_42985 = this.method_32183();
      this.field_42986 = this.field_42986 + (!this.field_42985 ? -1.0F * this.Ꮀ붛疂䕦堧樽() : this.Ꮀ붛疂䕦堧樽());
      this.field_42986 = Math.min(Math.max(1.0F, this.field_42986), this.韤쟗㥇䬹呓殢());
   }

   @Override
   public void method_32178(float var1) {
      float var4 = !this.method_32140() ? 0.3F : (!this.field_42985 ? (!this.method_32185() ? Math.max(var1 * this.field_31774, 0.0F) : 1.5F) : 0.0F);
      int var5 = (int)((float)this.method_32109() * this.field_42986);
      int var6 = (int)((float)this.method_32137() * this.field_42986);
      int var7 = this.method_32132() - (var5 - this.method_32109()) / 2;
      int var8 = this.method_32173() - (var6 - this.method_32137()) / 2;
      class_73.method_149(
         this.method_32155() + var7 - this.field_36270,
         this.method_32093() + var8 - this.field_36261,
         this.method_32155() + var7 - this.field_36270 + var5,
         this.method_32093() + var8 - this.field_36261 + var6
      );
      class_73.method_94(
         (float)var7,
         (float)var8,
         (float)(var7 + var5),
         (float)(var8 + var6),
         class_314.method_1444(class_314.method_1442(this.field_36272.method_2764(), this.field_36272.method_2768(), 1.0F - var4), var1)
      );
      if (this.method_32165() != null) {
         class_73.method_88(
            this.method_32097(),
            (float)(var7 + var5 / 2),
            (float)(var8 + var6 / 2),
            this.method_32165(),
            class_314.method_1444(this.field_36272.method_2774(), var1),
            this.field_36272.method_2773(),
            this.field_36272.method_2770()
         );
      }

      class_73.method_141();
      super.method_32182(var1);
   }

   public float 韤쟗㥇䬹呓殢() {
      return 1.3F;
   }

   public float Ꮀ붛疂䕦堧樽() {
      return 0.05F;
   }
}
