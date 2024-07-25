package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_6936 extends class_8598 {
   private boolean field_35654;
   private boolean field_35655;
   private int field_35657;
   private int field_35653;

   public class_6936(class_6331 var1) {
      super(var1);
   }

   @Override
   public void method_39514() {
      super.method_39514();
      this.field_35653++;
      long var3 = this.field_44037.method_29546();
      long var5 = var3 / 24000L + 1L;
      if (!this.field_35654 && this.field_35653 > 20) {
         this.field_35654 = true;
         this.field_44036.field_47794.method_4156(new class_2161(class_2161.field_10781, 0.0F));
      }

      this.field_35655 = var3 > 120500L;
      if (this.field_35655) {
         this.field_35657++;
      }

      if (var3 % 24000L != 500L) {
         if (var5 != 1L) {
            if (var5 == 5L && var3 % 24000L == 22000L) {
               this.field_44036.method_26286(new TranslationTextComponent("demo.day.warning"), Util.NIL_UUID);
            }
         } else if (var3 != 100L) {
            if (var3 != 175L) {
               if (var3 == 250L) {
                  this.field_44036.field_47794.method_4156(new class_2161(class_2161.field_10781, 103.0F));
               }
            } else {
               this.field_44036.field_47794.method_4156(new class_2161(class_2161.field_10781, 102.0F));
            }
         } else {
            this.field_44036.field_47794.method_4156(new class_2161(class_2161.field_10781, 101.0F));
         }
      } else if (var5 <= 6L) {
         if (var5 != 6L) {
            this.field_44036.method_26286(new TranslationTextComponent("demo.day." + var5), Util.NIL_UUID);
         } else {
            this.field_44036.field_47794.method_4156(new class_2161(class_2161.field_10781, 104.0F));
         }
      }
   }

   private void method_31733() {
      if (this.field_35657 > 100) {
         this.field_44036.method_26286(new TranslationTextComponent("demo.reminder"), Util.NIL_UUID);
         this.field_35657 = 0;
      }
   }

   @Override
   public void method_39523(class_1331 var1, class_7500 var2, class_240 var3, int var4) {
      if (!this.field_35655) {
         super.method_39523(var1, var2, var3, var4);
      } else {
         this.method_31733();
      }
   }

   @Override
   public class_6910 method_39520(class_9359 var1, class_6486 var2, class_6098 var3, class_2584 var4) {
      if (!this.field_35655) {
         return super.method_39520(var1, var2, var3, var4);
      } else {
         this.method_31733();
         return class_6910.field_35521;
      }
   }

   @Override
   public class_6910 method_39528(class_9359 var1, class_6486 var2, class_6098 var3, class_2584 var4, class_9529 var5) {
      if (!this.field_35655) {
         return super.method_39528(var1, var2, var3, var4, var5);
      } else {
         this.method_31733();
         return class_6910.field_35521;
      }
   }
}
