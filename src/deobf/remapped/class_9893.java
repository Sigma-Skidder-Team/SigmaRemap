package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_9893 extends class_7958 implements class_3471 {
   private static final int field_50160 = 0;
   private static final int field_50166 = 1;
   private static final int field_50161 = 2;
   private static final int field_50168 = 11;
   private static final int field_50165 = 13;
   private static final int field_50164 = 14;
   private final boolean field_50162;
   private class_9718 field_50167;

   public class_9893(boolean var1) {
      this.field_50162 = var1;
   }

   public void method_45573(class_7390 var1, class_7958 var2, class_8965 var3, boolean var4, boolean var5) throws AACException {
      int var8 = var1.method_33662(4);
      if (var8 == 15) {
         var8 += var1.method_33662(8) - 1;
      }

      var8 *= 8;
      int var9 = var8;
      int var10 = var1.method_33665();

      while (var8 > 0) {
         var8 = this.method_45571(var1, var8, var2, var3, var4, var5);
      }

      int var11 = var1.method_33665() - var10;
      int var12 = var9 - var11;
      if (var12 <= 0) {
         if (var12 < 0) {
            throw new class_5060("FIL element overread: " + var12);
         }
      } else {
         var1.method_33652(var11);
      }
   }

   private int method_45571(class_7390 var1, int var2, class_7958 var3, class_8965 var4, boolean var5, boolean var6) throws AACException {
      int var9 = var1.method_33662(4);
      int var10 = var2 - 4;
      switch (var9) {
         case 11:
            var10 = this.method_45570(var1, var10);
            break;
         case 13:
         case 14:
            if (var5) {
               if (!(var3 instanceof class_3976) && !(var3 instanceof class_4444) && !(var3 instanceof class_7569)) {
                  throw new class_5060("SBR applied on unexpected element: " + var3);
               }

               var3.method_36005(var1, var4, var10, var3 instanceof class_4444, var9 == 14, this.field_50162, var6);
               var10 = 0;
               break;
            } else {
               var1.method_33652(var10);
               var10 = 0;
            }
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 12:
         default:
            var1.method_33652(var10);
            var10 = 0;
      }

      return var10;
   }

   private int method_45570(class_7390 var1, int var2) throws AACException {
      if (this.field_50167 == null) {
         this.field_50167 = new class_9718();
      }

      int var5 = var2;
      int var6 = 1;
      if (class_9718.method_44910(this.field_50167, var1.method_33660())) {
         class_9718.method_44896(this.field_50167, var1.method_33662(4));
         class_9718.method_44899(this.field_50167, var1.method_33662(4));
      }

      if (class_9718.method_44907(this.field_50167, var1.method_33660())) {
         var5 = var2 - this.method_45572(var1);
      }

      if (class_9718.method_44906(this.field_50167, var1.method_33660())) {
         class_9718.method_44900(this.field_50167, var1.method_33662(4));
         class_9718.method_44905(this.field_50167, var1.method_33662(4));
         var5 -= 8;
         var6 += class_9718.method_44909(this.field_50167);
         class_9718.method_44902(this.field_50167, new int[var6]);

         for (int var7 = 0; var7 < var6; var7++) {
            class_9718.method_44903(this.field_50167)[var7] = var1.method_33662(8);
            var5 -= 8;
         }
      }

      if (class_9718.method_44897(this.field_50167, var1.method_33660())) {
         class_9718.method_44908(this.field_50167, var1.method_33662(7));
         class_9718.method_44911(this.field_50167, var1.method_33662(1));
         var5 -= 8;
      }

      class_9718.method_44904(this.field_50167, new boolean[var6]);
      class_9718.method_44894(this.field_50167, new int[var6]);

      for (int var8 = 0; var8 < var6; var8++) {
         class_9718.method_44895(this.field_50167)[var8] = var1.method_33660();
         class_9718.method_44912(this.field_50167)[var8] = var1.method_33662(7);
         var5 -= 8;
      }

      return var5;
   }

   private int method_45572(class_7390 var1) throws AACException {
      int var4 = 0;

      do {
         for (int var5 = 0; var5 < 7; var5++) {
            class_9718.method_44898(this.field_50167)[var4] = var1.method_33660();
            var4++;
         }
      } while (var4 < 57 && var1.method_33660());

      return var4 / 7 * 8;
   }
}
