package remapped;

import java.util.Arrays;
import net.sourceforge.jaad.aac.AACException;

public class class_4444 extends class_7958 implements class_3471 {
   private class_4836 field_21665;
   private boolean[] field_21669 = new boolean[128];
   private boolean field_21664;
   public class_9143 field_21666;
   public class_9143 field_21667;

   public class_4444(int var1) {
      this.field_21666 = new class_9143(var1);
      this.field_21667 = new class_9143(var1);
   }

   public void method_20611(class_7390 var1, class_6616 var2) throws AACException {
      class_8296 var5 = var2.method_30415();
      class_8965 var6 = var2.method_30420();
      if (var6.equals(class_8965.field_45918)) {
         throw new class_5060("invalid sample frequency");
      } else {
         this.method_36003(var1);
         this.field_21664 = var1.method_33660();
         class_2568 var7 = this.field_21666.method_42072();
         if (!this.field_21664) {
            this.field_21665 = class_4836.field_24135;
            Arrays.fill(this.field_21669, false);
         } else {
            var7.method_11657(var1, var2, this.field_21664);
            this.field_21667.method_42072().method_11667(var7);
            this.field_21665 = class_4836.method_22257(var1.method_33662(2));
            if (!this.field_21665.equals(class_4836.field_24136)) {
               if (!this.field_21665.equals(class_4836.field_24132)) {
                  if (!this.field_21665.equals(class_4836.field_24135)) {
                     throw new class_5060("reserved MS mask type used");
                  }

                  Arrays.fill(this.field_21669, false);
               } else {
                  Arrays.fill(this.field_21669, true);
               }
            } else {
               int var8 = var7.method_11671();
               int var9 = var7.method_11670();

               for (int var10 = 0; var10 < var9 * var8; var10++) {
                  this.field_21669[var10] = var1.method_33660();
               }
            }
         }

         if (var5.method_38276() && var7.method_11658() && (var7.field_12701 = var1.method_33660())) {
            var7.method_11663().method_42556(var1, var7, var5);
         }

         this.field_21666.method_42062(var1, this.field_21664, var2);
         this.field_21667.method_42062(var1, this.field_21664, var2);
      }
   }

   public class_9143 method_20608() {
      return this.field_21666;
   }

   public class_9143 method_20607() {
      return this.field_21667;
   }

   public class_4836 method_20609() {
      return this.field_21665;
   }

   public boolean method_20606(int var1) {
      return this.field_21669[var1];
   }

   public boolean method_20610() {
      return !this.field_21665.equals(class_4836.field_24135);
   }

   public boolean method_20612() {
      return this.field_21664;
   }
}
