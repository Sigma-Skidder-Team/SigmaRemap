package remapped;

import java.util.Arrays;
import net.sourceforge.jaad.aac.AACException;

public class class_2568 implements class_3471, class_9109 {
   public static final int field_12710 = 0;
   public static final int field_12714 = 1;
   public static final int field_12717 = 0;
   public static final int field_12719 = 1;
   private final int field_12703;
   private class_6954 field_12704;
   private int[] field_12709;
   private int field_12716;
   private boolean field_12708;
   private class_9426 field_12711;
   public boolean field_12707;
   public boolean field_12701;
   private class_9214 field_12712;
   private class_9214 field_12706;
   private int field_12718;
   private int field_12705;
   private int[] field_12700;
   private int field_12702;
   private int[] field_12713;

   public class_2568(int var1) {
      this.field_12703 = var1;
      this.field_12709 = new int[2];
      this.field_12704 = class_6954.field_35755;
      this.field_12700 = new int[8];
      this.field_12707 = false;
      this.field_12701 = false;
   }

   public void method_11657(class_7390 var1, class_6616 var2, boolean var3) throws AACException {
      class_8965 var6 = var2.method_30420();
      if (var6.equals(class_8965.field_45918)) {
         throw new class_5060("invalid sample frequency");
      } else {
         var1.method_33663();
         this.field_12704 = class_6954.method_31801(var1.method_33662(2));
         this.field_12709[0] = this.field_12709[1];
         this.field_12709[1] = var1.method_33655();
         this.field_12705 = 1;
         this.field_12700[0] = 1;
         if (!this.field_12704.equals(class_6954.field_35756)) {
            this.field_12716 = var1.method_33662(6);
            this.field_12718 = 1;
            this.field_12713 = field_46648[var6.method_41129()];
            this.field_12702 = field_46646[var6.method_41129()];
            this.field_12708 = var1.method_33660();
            if (this.field_12708) {
               this.method_11672(var1, var2.method_30415(), var6, var3);
            }
         } else {
            this.field_12716 = var1.method_33662(4);

            for (int var7 = 0; var7 < 7; var7++) {
               if (!var1.method_33660()) {
                  this.field_12705++;
                  this.field_12700[this.field_12705 - 1] = 1;
               } else {
                  this.field_12700[this.field_12705 - 1]++;
               }
            }

            this.field_12718 = 8;
            this.field_12713 = field_46642[var6.method_41129()];
            this.field_12702 = field_46637[var6.method_41129()];
            this.field_12708 = false;
         }
      }
   }

   private void method_11672(class_7390 var1, class_8296 var2, class_8965 var3, boolean var4) throws AACException {
      switch (var2) {
         case field_42513:
            if (this.field_12711 == null) {
               this.field_12711 = new class_9426();
            }

            this.field_12711.method_43625(var1, this.field_12716, var3);
            break;
         case field_42522:
            if (this.field_12707 = var1.method_33660()) {
               if (this.field_12712 == null) {
                  this.field_12712 = new class_9214(this.field_12703);
               }

               this.field_12712.method_42556(var1, this, var2);
            }

            if (var4 && (this.field_12701 = var1.method_33660())) {
               if (this.field_12706 == null) {
                  this.field_12706 = new class_9214(this.field_12703);
               }

               this.field_12706.method_42556(var1, this, var2);
            }
            break;
         case field_42503:
            if (!var4 && (this.field_12707 = var1.method_33660())) {
               if (this.field_12712 == null) {
                  this.field_12712 = new class_9214(this.field_12703);
               }

               this.field_12712.method_42556(var1, this, var2);
            }
            break;
         default:
            throw new class_5060("unexpected profile for LTP: " + var2);
      }
   }

   public int method_11671() {
      return this.field_12716;
   }

   public int method_11659() {
      return this.field_12702;
   }

   public int[] method_11674() {
      return this.field_12713;
   }

   public int method_11660() {
      return this.field_12713[this.field_12702];
   }

   public int method_11661() {
      return this.field_12718;
   }

   public int method_11670() {
      return this.field_12705;
   }

   public int method_11665(int var1) {
      return this.field_12700[var1];
   }

   public class_6954 method_11669() {
      return this.field_12704;
   }

   public boolean method_11676() {
      return this.field_12704.equals(class_6954.field_35756);
   }

   public int method_11677(int var1) {
      return this.field_12709[var1];
   }

   public boolean method_11675() {
      return this.field_12708;
   }

   public class_9426 method_11668() {
      return this.field_12711;
   }

   public boolean method_11658() {
      return this.field_12707;
   }

   public class_9214 method_11664() {
      return this.field_12712;
   }

   public boolean method_11666() {
      return this.field_12701;
   }

   public class_9214 method_11663() {
      return this.field_12706;
   }

   public void method_11673(int var1) {
      if (this.field_12708) {
         this.field_12711.method_43626(var1);
      }

      if (this.field_12707) {
         this.field_12712.method_42554(var1);
      }

      if (this.field_12701) {
         this.field_12706.method_42554(var1);
      }
   }

   public void method_11667(class_2568 var1) {
      this.field_12704 = var1.field_12704;
      this.field_12709[0] = this.field_12709[1];
      this.field_12709[1] = var1.field_12709[1];
      this.field_12716 = var1.field_12716;
      this.field_12708 = var1.field_12708;
      if (this.field_12708) {
         this.field_12711 = var1.field_12711;
      }

      this.field_12707 = var1.field_12707;
      if (this.field_12707) {
         this.field_12712.method_42558(var1.field_12712);
         this.field_12706.method_42558(var1.field_12706);
      }

      this.field_12718 = var1.field_12718;
      this.field_12705 = var1.field_12705;
      this.field_12700 = Arrays.copyOf(var1.field_12700, var1.field_12700.length);
      this.field_12702 = var1.field_12702;
      this.field_12713 = Arrays.copyOf(var1.field_12713, var1.field_12713.length);
   }
}
