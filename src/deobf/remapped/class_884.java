package remapped;

import jaco.mp3.resources.DecoderException;

public class class_884 implements class_7734 {
   private static String[] field_4544;
   public class_8212 field_4550;
   public class_1915 field_4547;
   public class_2948 field_4552;
   public class_2948 field_4546;
   public class_9401 field_4545;
   public int field_4549;
   public int field_4548;
   public int field_4553;
   public class_4420[] field_4551;
   public class_4546 field_4554 = null;

   public class_884() {
      this.field_4554 = new class_4546();
   }

   public void method_3802(class_8212 var1, class_1915 var2, class_2948 var3, class_2948 var4, class_9401 var5, int var6) {
      this.field_4550 = var1;
      this.field_4547 = var2;
      this.field_4552 = var3;
      this.field_4546 = var4;
      this.field_4545 = var5;
      this.field_4549 = var6;
   }

   @Override
   public void method_35005() throws DecoderException {
      this.field_4553 = this.field_4547.method_8703();
      this.field_4551 = new class_4420[32];
      this.field_4548 = this.field_4547.method_8685();
      this.method_3800();
      this.method_3799();
      this.method_3803();
      if (this.field_4554 != null || this.field_4547.method_8684()) {
         this.method_3804();
         this.method_3798();
      }
   }

   public void method_3800() {
      if (this.field_4548 != 3) {
         if (this.field_4548 != 1) {
            for (int var3 = 0; var3 < this.field_4553; var3++) {
               this.field_4551[var3] = new class_2592(var3);
            }
         } else {
            int var4;
            for (var4 = 0; var4 < this.field_4547.method_8690(); var4++) {
               this.field_4551[var4] = new class_2592(var4);
            }

            while (var4 < this.field_4553) {
               this.field_4551[var4] = new class_7428(var4);
               var4++;
            }
         }
      } else {
         for (int var5 = 0; var5 < this.field_4553; var5++) {
            this.field_4551[var5] = new class_6364(var5);
         }
      }
   }

   public void method_3799() throws DecoderException {
      for (int var3 = 0; var3 < this.field_4553; var3++) {
         this.field_4551[var3].method_20555(this.field_4550, this.field_4547, this.field_4554);
      }
   }

   public void method_3803() {
   }

   public void method_3804() {
      for (int var3 = 0; var3 < this.field_4553; var3++) {
         this.field_4551[var3].method_20558(this.field_4550, this.field_4547);
      }
   }

   public void method_3798() {
      boolean var3 = false;
      boolean var4 = false;
      int var5 = this.field_4547.method_8685();

      do {
         for (int var6 = 0; var6 < this.field_4553; var6++) {
            var3 = this.field_4551[var6].method_20556(this.field_4550);
         }

         do {
            for (int var7 = 0; var7 < this.field_4553; var7++) {
               var4 = this.field_4551[var7].method_20554(this.field_4549, this.field_4552, this.field_4546);
            }

            this.field_4552.method_13495(this.field_4545);
            if (this.field_4549 == 0 && var5 != 3) {
               this.field_4546.method_13495(this.field_4545);
            }
         } while (!var4);
      } while (!var3);
   }
}
