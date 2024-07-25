package remapped;

public class class_5915 extends class_1859 {
   private static String[] field_30017;
   private class_2026 field_30018 = SigmaMainClass.getInstance().method_3300();
   public float field_30016 = -1.0F;

   public class_5915(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_32184((var1x, var2x) -> {
         int var5x = (int)this.field_30018.method_9466();
         int var6x = this.field_30018.method_9483();
         this.field_30016 = Math.min((float)var5x / (float)var6x, 1.0F);
      });
      this.method_32136((var1x, var2x) -> {
         if (this.method_32183() && this.method_32098()) {
            int var5x = (int)Math.min((double)((int)(this.field_30016 * (float)this.field_30018.method_9483())), this.field_30018.method_9484());
            this.field_30018.method_9479((double)var5x);
         }
      });
   }

   @Override
   public void method_32178(float var1) {
      int var4 = (int)this.field_30018.method_9466();
      double var5 = this.field_30018.method_9484();
      int var7 = this.field_30018.method_9483();
      float var8 = Math.max(0.0F, Math.min((float)var4 / (float)var7, 1.0F));
      float var9 = Math.max(0.0F, Math.min((float)var5 / (float)var7, 1.0F));
      if (this.method_32185() && this.method_32183() && var5 != 0.0) {
         int var10 = this.method_32189() - this.method_32155();
         this.field_30016 = Math.min(Math.max((float)var10 / (float)this.method_32109(), 0.0F), var9);
         var8 = this.field_30016;
      }

      if (var4 == 0 && !this.field_30018.method_9486()) {
         class_73.method_103(
            (float)this.method_32132(),
            (float)this.method_32173(),
            (float)this.method_32109(),
            (float)this.method_32137(),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.43F * var1)
         );
      } else {
         class_73.method_103(
            (float)this.method_32132(),
            (float)this.method_32173(),
            (float)this.method_32109(),
            (float)this.method_32137(),
            class_314.method_1444(class_1255.field_6920.field_6917, 0.075F)
         );
         class_73.method_103(
            (float)this.method_32132() + (float)this.method_32109() * var9,
            (float)this.method_32173(),
            (float)this.method_32109() * (1.0F - var9),
            (float)this.method_32137(),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.43F * var1)
         );
         class_73.method_103(
            (float)this.method_32132(),
            (float)this.method_32173(),
            (float)this.method_32109() * var8,
            (float)this.method_32137(),
            class_314.method_1444(class_1255.field_6918.field_6917, var1 * var1)
         );
         if (var8 != 0.0F) {
            class_73.method_96((float)this.method_32132() + (float)this.method_32109() * var8, (float)this.method_32173(), 5.0F, 5.0F, NotificationIcons.field_11018);
         }
      }
   }
}
