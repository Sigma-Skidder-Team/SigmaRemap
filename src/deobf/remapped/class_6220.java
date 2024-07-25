package remapped;

public class class_6220 extends class_1859 {
   private static String[] field_31776;
   public float field_31774;
   private int field_31775 = 0;
   public int field_31777 = 0;

   public class_6220(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   public class_6220(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
   }

   public class_6220(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public class_6220(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, class_3384 var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_31774 = this.field_31774 + (!this.method_32183() ? -0.1F : 0.1F);
      this.field_31774 = Math.min(Math.max(0.0F, this.field_31774), 1.0F);
   }

   @Override
   public void method_32178(float var1) {
      float var4 = !this.method_32140() ? 0.3F : (!this.method_1535() ? (!this.method_32185() ? Math.max(var1 * this.field_31774, 0.0F) : 1.5F) : 0.0F);
      int var5 = class_314.method_1444(
         class_314.method_1442(this.field_36272.method_2764(), this.field_36272.method_2768(), 1.0F - var4),
         (float)(this.field_36272.method_2764() >> 24 & 0xFF) / 255.0F * var1
      );
      int var6 = var5 >> 24 & 0xFF;
      int var7 = var5 >> 16 & 0xFF;
      int var8 = var5 >> 8 & 0xFF;
      int var9 = var5 & 0xFF;
      if (this.field_31777 <= 0) {
         class_73.method_94(
            (float)this.method_32132(),
            (float)this.method_32173(),
            (float)(this.method_32132() + this.method_32109()),
            (float)(this.method_32173() + this.method_32137()),
            var5
         );
      } else {
         class_73.method_139(
            (float)this.method_32132(), (float)this.method_32173(), (float)this.method_32109(), (float)this.method_32137(), (float)this.field_31777, var5
         );
      }

      int var10 = this.method_32132()
         + (
            this.field_36272.method_2773() != class_6206.field_31726
               ? 0
               : (this.field_36272.method_2773() != class_6206.field_31722 ? this.method_32109() / 2 : this.method_32109())
         );
      int var11 = this.method_32173()
         + (
            this.field_36272.method_2770() != class_6206.field_31726
               ? 0
               : (this.field_36272.method_2770() != class_6206.field_31720 ? this.method_32137() / 2 : this.method_32137())
         );
      if (this.method_32165() != null) {
         class_73.method_88(
            this.method_32097(),
            (float)(this.field_31775 + var10),
            (float)var11,
            this.method_32165(),
            class_314.method_1444(this.field_36272.method_2774(), var1),
            this.field_36272.method_2773(),
            this.field_36272.method_2770()
         );
      }

      super.method_32178(var1);
   }

   public void method_28444(int var1) {
      this.field_31775 = var1;
   }

   public int method_28443() {
      return this.field_31775;
   }
}
