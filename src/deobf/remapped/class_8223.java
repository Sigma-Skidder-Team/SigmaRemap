package remapped;

public class class_8223 extends class_1859 {
   private static String[] field_42211;
   public class_2440 field_42210 = new class_2440(190, 190);

   public class_8223(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, class_3384 var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
      int var12 = (int)(210.0 * Math.sqrt((double)((float)var5 / 242.0F)));
      this.field_42210 = new class_2440(var12, var12);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_42210.method_11119(!this.method_32183() ? class_4043.field_19618 : class_4043.field_19620);
      if (this.method_32183()) {
         SigmaMainClass.method_3328().method_3299().method_30984(class_6763.field_34905);
      }
   }

   @Override
   public void method_32178(float var1) {
      if (this.method_32165() != null) {
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
         float var9 = (float)Math.pow((double)this.field_42210.method_11123(), 3.0);
         class_73.method_88(
            this.method_32097(),
            (float)var5,
            (float)var6,
            this.method_32165(),
            class_314.method_1444(var4, var1 * class_314.method_1407(var4)),
            this.field_36272.method_2773(),
            this.field_36272.method_2770()
         );
         class_73.method_94(
            (float)var5 - (float)(var7 / 2) * var9,
            (float)(var6 + var8),
            (float)var5 + (float)(var7 / 2) * var9,
            (float)(var6 + var8 + 2),
            class_314.method_1444(var4, var1 * class_314.method_1407(var4))
         );
         super.method_32178(var1);
      }
   }
}
