package remapped;

import java.util.ArrayList;

public class class_4509 implements class_4893, class_1338 {
   private static String[] field_22044;
   private ArrayList field_22045 = new ArrayList();
   private class_5693 field_22039 = new class_5693(this, null);
   private class_1574 field_22038;
   private int field_22041;
   private class_6647[][] field_22042;
   private boolean field_22048;
   private class_2443 field_22043;
   private class_6647 field_22046;
   private class_2205 field_22040;
   private int field_22047;
   private int field_22036;
   private int field_22037;

   public class_4509(class_1574 var1, int var2, boolean var3) {
      this(var1, var2, var3, new class_4740());
   }

   public class_4509(class_1574 var1, int var2, boolean var3, class_2443 var4) {
      this.field_22043 = var4;
      this.field_22038 = var1;
      this.field_22041 = var2;
      this.field_22048 = var3;
      this.field_22042 = new class_6647[var1.method_7110()][var1.method_7108()];

      for (int var7 = 0; var7 < var1.method_7110(); var7++) {
         for (int var8 = 0; var8 < var1.method_7108(); var8++) {
            this.field_22042[var7][var8] = new class_6647(this, var7, var8);
         }
      }
   }

   public class_533 郝Ꮺಽ湗ꪕᙽ(class_2205 var1, int var2, int var3, int var4, int var5) {
      this.field_22046 = null;
      this.field_22040 = var1;
      this.field_22047 = var4;
      this.field_22036 = var5;
      this.field_22037 = 0;
      if (this.field_22038.method_7106(this, var4, var5)) {
         return null;
      } else {
         for (int var8 = 0; var8 < this.field_22038.method_7110(); var8++) {
            for (int var9 = 0; var9 < this.field_22038.method_7108(); var9++) {
               this.field_22042[var8][var9].method_30542();
            }
         }

         class_6647.method_30539(this.field_22042[var2][var3], 0.0F);
         class_6647.method_30529(this.field_22042[var2][var3], 0);
         this.field_22045.clear();
         this.field_22039.method_25754();
         this.method_20953(this.field_22042[var2][var3]);
         class_6647.method_30530(this.field_22042[var4][var5], null);
         int var17 = 0;

         while (var17 < this.field_22041 && this.field_22039.method_25753() != 0) {
            int var18 = var2;
            int var10 = var3;
            if (this.field_22046 != null) {
               var18 = class_6647.method_30540(this.field_22046);
               var10 = class_6647.method_30532(this.field_22046);
            }

            this.field_22046 = this.method_20958();
            this.field_22037 = class_6647.method_30533(this.field_22046);
            if (this.field_22046 == this.field_22042[var4][var5] && this.method_20962(var1, var18, var10, var4, var5)) {
               break;
            }

            this.method_20956(this.field_22046);
            this.method_20957(this.field_22046);

            for (int var11 = -1; var11 < 2; var11++) {
               for (int var12 = -1; var12 < 2; var12++) {
                  if ((var11 != 0 || var12 != 0) && (this.field_22048 || var11 == 0 || var12 == 0)) {
                     int var13 = var11 + class_6647.method_30540(this.field_22046);
                     int var14 = var12 + class_6647.method_30532(this.field_22046);
                     if (this.method_20962(var1, class_6647.method_30540(this.field_22046), class_6647.method_30532(this.field_22046), var13, var14)) {
                        float var15 = class_6647.method_30527(this.field_22046)
                           + this.method_20963(var1, class_6647.method_30540(this.field_22046), class_6647.method_30532(this.field_22046), var13, var14);
                        class_6647 var16 = this.field_22042[var13][var14];
                        this.field_22038.method_7109(var13, var14);
                        if (var15 < class_6647.method_30527(var16)) {
                           if (this.method_20961(var16)) {
                              this.method_20956(var16);
                           }

                           if (this.method_20960(var16)) {
                              this.method_20955(var16);
                           }
                        }

                        if (!this.method_20961(var16) && !this.method_20960(var16)) {
                           class_6647.method_30539(var16, var15);
                           class_6647.method_30528(var16, this.method_20959(var1, var13, var14, var4, var5));
                           var17 = Math.max(var17, var16.method_30541(this.field_22046));
                           this.method_20953(var16);
                        }
                     }
                  }
               }
            }
         }

         if (class_6647.method_30534(this.field_22042[var4][var5]) == null) {
            return null;
         } else {
            class_533 var19 = new class_533();

            for (class_6647 var20 = this.field_22042[var4][var5]; var20 != this.field_22042[var2][var3]; var20 = class_6647.method_30534(var20)) {
               var19.method_2592(class_6647.method_30540(var20), class_6647.method_30532(var20));
            }

            var19.method_2592(var2, var3);
            return var19;
         }
      }
   }

   public int method_20965() {
      return this.field_22046 != null ? class_6647.method_30540(this.field_22046) : -1;
   }

   public int method_20964() {
      return this.field_22046 != null ? class_6647.method_30532(this.field_22046) : -1;
   }

   public class_6647 method_20958() {
      return (class_6647)this.field_22039.method_25756();
   }

   public void method_20953(class_6647 var1) {
      var1.method_30531(true);
      this.field_22039.method_25755(var1);
   }

   public boolean method_20961(class_6647 var1) {
      return var1.method_30535();
   }

   public void method_20956(class_6647 var1) {
      var1.method_30531(false);
      this.field_22039.method_25750(var1);
   }

   public void method_20957(class_6647 var1) {
      var1.method_30538(true);
      this.field_22045.add(var1);
   }

   public boolean method_20960(class_6647 var1) {
      return var1.method_30537();
   }

   public void method_20955(class_6647 var1) {
      var1.method_30538(false);
      this.field_22045.remove(var1);
   }

   public boolean method_20962(class_2205 var1, int var2, int var3, int var4, int var5) {
      boolean var8 = var4 < 0 || var5 < 0 || var4 >= this.field_22038.method_7110() || var5 >= this.field_22038.method_7108();
      if (!var8 && (var2 != var4 || var3 != var5)) {
         this.field_22040 = var1;
         this.field_22047 = var2;
         this.field_22036 = var3;
         var8 = this.field_22038.method_7106(this, var4, var5);
      }

      return !var8;
   }

   public float method_20963(class_2205 var1, int var2, int var3, int var4, int var5) {
      this.field_22040 = var1;
      this.field_22047 = var2;
      this.field_22036 = var3;
      return this.field_22038.method_7107(this, var4, var5);
   }

   public float method_20959(class_2205 var1, int var2, int var3, int var4, int var5) {
      return this.field_22043.method_11130(this.field_22038, var1, var2, var3, var4, var5);
   }

   @Override
   public class_2205 method_6178() {
      return this.field_22040;
   }

   @Override
   public int method_6180() {
      return this.field_22037;
   }

   @Override
   public int method_6179() {
      return this.field_22047;
   }

   @Override
   public int method_6181() {
      return this.field_22036;
   }
}
