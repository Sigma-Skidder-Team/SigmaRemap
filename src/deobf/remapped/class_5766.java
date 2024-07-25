package remapped;

import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5766 extends Screen {
   private String field_29144 = "";
   private int field_29146 = -1;
   public class_1863 field_29142;
   private String field_29145 = "";
   private class_1027 field_29143;

   public class_5766(String var1) {
      super(class_7542.field_38486);
      this.field_29145 = var1;
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_29146 = this.field_943.field_9614.method_13991().method_18683().size();
      this.field_29142 = new class_7927(this, this.field_948, 4, this.field_940 - 12, this.field_941 - 4, 12, new TranslationTextComponent("chat.editBox"));
      this.field_29142.method_8255(256);
      this.field_29142.method_8258(false);
      this.field_29142.method_8281(this.field_29145);
      this.field_29142.method_8277(this::method_26069);
      this.field_942.add(this.field_29142);
      this.field_29143 = new class_1027(this.field_943, this, this.field_29142, this.field_948, false, false, 1, 10, true, -805306368);
      this.field_29143.method_4526();
      this.method_41178(this.field_29142);
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_29142.method_8246();
      this.method_1164(var1, var2, var3);
      this.method_26070(var6);
      this.field_29143.method_4526();
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
      this.field_943.field_9614.method_13991().method_18691();
   }

   @Override
   public void method_5312() {
      this.field_29142.method_8279();
   }

   private void method_26069(String var1) {
      String var4 = this.field_29142.method_8246();
      this.field_29143.method_4552(!var4.equals(this.field_29145));
      this.field_29143.method_4526();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!this.field_29143.method_4541(var1, var2, var3)) {
         if (!super.method_26946(var1, var2, var3)) {
            if (var1 != 256) {
               if (var1 == 257 || var1 == 335) {
                  String var6 = this.field_29142.method_8246().trim();
                  if (!var6.isEmpty()) {
                     this.method_1171(var6);
                  }

                  this.field_943.method_8609((Screen)null);
                  return true;
               } else if (var1 == 265) {
                  this.method_26071(-1);
                  return true;
               } else if (var1 == 264) {
                  this.method_26071(1);
                  return true;
               } else if (var1 == 266) {
                  this.field_943.field_9614.method_13991().method_18687((double)(this.field_943.field_9614.method_13991().method_18681() - 1));
                  return true;
               } else if (var1 != 267) {
                  return false;
               } else {
                  this.field_943.field_9614.method_13991().method_18687((double)(-this.field_943.field_9614.method_13991().method_18681() + 1));
                  return true;
               }
            } else {
               this.field_943.method_8609((Screen)null);
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      if (var5 > 1.0) {
         var5 = 1.0;
      }

      if (var5 < -1.0) {
         var5 = -1.0;
      }

      if (!this.field_29143.method_4532(var5)) {
         if (!method_1190()) {
            var5 *= 7.0;
         }

         this.field_943.field_9614.method_13991().method_18687(var5);
         return true;
      } else {
         return true;
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (!this.field_29143.method_4549((double)((int)var1), (double)((int)var3), var5)) {
         if (var5 == 0) {
            class_4049 var8 = this.field_943.field_9614.method_13991();
            if (var8.method_18696(var1, var3)) {
               return true;
            }

            Style var9 = var8.method_18680(var1, var3);
            if (var9 != null && this.method_1187(var9)) {
               return true;
            }
         }

         return !this.field_29142.method_26940(var1, var3, var5) ? super.method_26940(var1, var3, var5) : true;
      } else {
         return true;
      }
   }

   @Override
   public void method_1157(String var1, boolean var2) {
      if (!var2) {
         this.field_29142.method_8268(var1);
      } else {
         this.field_29142.method_8281(var1);
      }
   }

   public void method_26071(int var1) {
      int var4 = this.field_29146 + var1;
      int var5 = this.field_943.field_9614.method_13991().method_18683().size();
      var4 = class_9299.method_42829(var4, 0, var5);
      if (var4 != this.field_29146) {
         if (var4 != var5) {
            if (this.field_29146 == var5) {
               this.field_29144 = this.field_29142.method_8246();
            }

            this.field_29142.method_8281(this.field_943.field_9614.method_13991().method_18683().get(var4));
            this.field_29143.method_4552(false);
            this.field_29146 = var4;
         } else {
            this.field_29146 = var5;
            this.field_29142.method_8281(this.field_29144);
         }
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_41180(this.field_29142);
      this.field_29142.method_8273(true);
      method_9774(var1, 2, this.field_940 - 14, this.field_941 - 2, this.field_940 - 2, this.field_943.gameOptions.method_40881(Integer.MIN_VALUE));
      this.field_29142.method_6767(var1, var2, var3, var4);
      this.field_29143.method_4547(var1, var2, var3);
      Style var7 = this.field_943.field_9614.method_13991().method_18680((double)var2, (double)var3);
      if (var7 != null && var7.getHoverEvent() != null) {
         this.method_1180(var1, var7, var2, var3);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_1161() {
      return false;
   }

   private void method_26070(String var1) {
      this.field_29142.method_8281(var1);
   }
}
