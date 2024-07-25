package remapped;

public class class_9729 extends class_1859 {
   private static String[] field_49448;
   public float field_49447;
   public String field_49449;

   public class_9729(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, class_590.field_3421, var7, false);
      this.field_49449 = var8;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_49447 = this.field_49447 + (!this.method_32183() ? -0.14F : 0.14F);
      this.field_49447 = Math.min(Math.max(0.0F, this.field_49447), 1.0F);
   }

   @Override
   public void method_32178(float var1) {
      if (this.method_32165() != null) {
         this.method_32130();
         int var4 = this.field_36272.method_2764();
         int var5 = this.method_32132()
            + (
               this.field_36272.method_2773() != class_6206.field_31726
                  ? 0
                  : (this.field_36272.method_2773() != class_6206.field_31722 ? this.method_32109() / 2 : this.method_32109())
            );
         int var6 = this.method_32173()
            + (
               this.field_36272.method_2770() != class_6206.field_31726
                  ? 0
                  : (this.field_36272.method_2770() != class_6206.field_31720 ? this.method_32137() / 2 : this.method_32137())
            );
         int var7 = this.method_32097().method_18547(this.method_32165());
         byte var8 = 18;
         float var9 = this.field_49447 * this.field_49447 * this.field_49447;
         boolean var10 = false;
         if (this.method_32098()) {
            var10 = true;
         }

         if (var10) {
            class_73.method_94(
               (float)this.field_36270,
               (float)this.field_36261,
               (float)(this.field_36270 + this.field_36278),
               (float)(this.field_36261 + this.field_36257),
               class_314.method_1444(-11890462, 1.0F)
            );
         }

         byte var11 = 16;
         byte var12 = 8;
         int var13 = class_1255.field_6929.field_6917;
         if (var10) {
            var13 = class_1255.field_6918.field_6917;
         }

         class_73.method_87(
            class_5320.field_27138,
            (float)(this.field_36270 + var11 + 50),
            (float)(this.field_36261 + var12 + 5),
            this.field_36275,
            class_314.method_1444(var13, var1)
         );
         class_73.method_87(
            class_5320.field_27145,
            (float)(this.field_36270 + var11 + 50),
            (float)(this.field_36261 + var12 + 19),
            this.field_49449,
            class_314.method_1444(var13, var1 * 0.5F)
         );
         super.method_32178(var1);
      }
   }
}
