package remapped;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1863 extends class_7114 implements class_1463, class_5888 {
   private final class_9854 field_9461;
   private String field_9449 = "";
   private int field_9459 = 32;
   private int field_9445;
   private boolean field_9456 = true;
   private boolean field_9452 = true;
   private boolean field_9458 = true;
   private boolean field_9453;
   private int field_9447;
   private int field_9454;
   private int field_9446;
   private int field_9457 = 14737632;
   private int field_9460 = 7368816;
   private String field_9455;
   private Consumer<String> field_9450;
   private Predicate<String> field_9448 = Objects::nonNull;
   private BiFunction<String, Integer, class_7107> field_9451 = (var0, var1x) -> class_7107.method_32662(var0, Style.EMPTY);

   public class_1863(class_9854 var1, int var2, int var3, int var4, int var5, ITextComponent var6) {
      this(var1, var2, var3, var4, var5, (class_1863)null, var6);
   }

   public class_1863(class_9854 var1, int var2, int var3, int var4, int var5, class_1863 var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var7);
      this.field_9461 = var1;
      if (var6 != null) {
         this.method_8281(var6.method_8246());
      }
   }

   public void method_8277(Consumer<String> var1) {
      this.field_9450 = var1;
   }

   public void method_8262(BiFunction<String, Integer, class_7107> var1) {
      this.field_9451 = var1;
   }

   public void method_8279() {
      this.field_9445++;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      ITextComponent var3 = this.method_32685();
      return new TranslationTextComponent("gui.narrate.editBox", var3, this.field_9449);
   }

   public void method_8281(String var1) {
      if (this.field_9448.test(var1)) {
         if (var1.length() <= this.field_9459) {
            this.field_9449 = var1;
         } else {
            this.field_9449 = var1.substring(0, this.field_9459);
         }

         this.method_8278();
         this.method_8248(this.field_9454);
         this.method_8261(var1);
      }
   }

   public String method_8246() {
      return this.field_9449;
   }

   public String method_8280() {
      int var3 = this.field_9454 >= this.field_9446 ? this.field_9446 : this.field_9454;
      int var4 = this.field_9454 >= this.field_9446 ? this.field_9454 : this.field_9446;
      return this.field_9449.substring(var3, var4);
   }

   public void method_8254(Predicate<String> var1) {
      this.field_9448 = var1;
   }

   public void method_8268(String var1) {
      int var4 = this.field_9454 >= this.field_9446 ? this.field_9446 : this.field_9454;
      int var5 = this.field_9454 >= this.field_9446 ? this.field_9454 : this.field_9446;
      int var6 = this.field_9459 - this.field_9449.length() - (var4 - var5);
      String var7 = class_7665.method_34677(var1);
      int var8 = var7.length();
      if (var6 < var8) {
         var7 = var7.substring(0, var6);
         var8 = var6;
      }

      String var9 = new StringBuilder(this.field_9449).replace(var4, var5, var7).toString();
      if (this.field_9448.test(var9)) {
         this.field_9449 = var9;
         this.method_8266(var4 + var8);
         this.method_8248(this.field_9454);
         this.method_8261(this.field_9449);
      }
   }

   private void method_8261(String var1) {
      if (this.field_9450 != null) {
         this.field_9450.accept(var1);
      }

      this.field_36676 = class_9665.method_44650() + 500L;
   }

   private void method_8285(int var1) {
      if (!class_266.method_1185()) {
         this.method_8282(var1);
      } else {
         this.method_8272(var1);
      }
   }

   public void method_8272(int var1) {
      if (!this.field_9449.isEmpty()) {
         if (this.field_9446 == this.field_9454) {
            this.method_8282(this.method_8259(var1) - this.field_9454);
         } else {
            this.method_8268("");
         }
      }
   }

   public void method_8282(int var1) {
      if (!this.field_9449.isEmpty()) {
         if (this.field_9446 == this.field_9454) {
            int var4 = this.method_8263(var1);
            int var5 = Math.min(var4, this.field_9454);
            int var6 = Math.max(var4, this.field_9454);
            if (var5 != var6) {
               String var7 = new StringBuilder(this.field_9449).delete(var5, var6).toString();
               if (this.field_9448.test(var7)) {
                  this.field_9449 = var7;
                  this.method_8284(var5);
               }
            }
         } else {
            this.method_8268("");
         }
      }
   }

   public int method_8259(int var1) {
      return this.method_8286(var1, this.method_8283());
   }

   private int method_8286(int var1, int var2) {
      return this.method_8257(var1, var2, true);
   }

   private int method_8257(int var1, int var2, boolean var3) {
      int var6 = var2;
      boolean var7 = var1 < 0;
      int var8 = Math.abs(var1);

      for (int var9 = 0; var9 < var8; var9++) {
         if (!var7) {
            int var10 = this.field_9449.length();
            var6 = this.field_9449.indexOf(32, var6);
            if (var6 != -1) {
               while (var3 && var6 < var10 && this.field_9449.charAt(var6) == ' ') {
                  var6++;
               }
            } else {
               var6 = var10;
            }
         } else {
            while (var3 && var6 > 0 && this.field_9449.charAt(var6 - 1) == ' ') {
               var6--;
            }

            while (var6 > 0 && this.field_9449.charAt(var6 - 1) != ' ') {
               var6--;
            }
         }
      }

      return var6;
   }

   public void method_8260(int var1) {
      this.method_8284(this.method_8263(var1));
   }

   private int method_8263(int var1) {
      return class_9665.method_44662(this.field_9449, this.field_9454, var1);
   }

   public void method_8284(int var1) {
      this.method_8266(var1);
      if (!this.field_9453) {
         this.method_8248(this.field_9454);
      }

      this.method_8261(this.field_9449);
   }

   public void method_8266(int var1) {
      this.field_9454 = class_9299.method_42829(var1, 0, this.field_9449.length());
   }

   public void method_8253() {
      this.method_8284(0);
   }

   public void method_8278() {
      this.method_8284(this.field_9449.length());
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!this.method_8275()) {
         return false;
      } else {
         this.field_9453 = class_266.method_1190();
         if (class_266.method_1174(var1)) {
            this.method_8278();
            this.method_8248(0);
            return true;
         } else if (class_266.method_1182(var1)) {
            MinecraftClient.getInstance().field_9600.method_38891(this.method_8280());
            return true;
         } else if (class_266.method_1173(var1)) {
            if (this.field_9458) {
               this.method_8268(MinecraftClient.getInstance().field_9600.method_38883());
            }

            return true;
         } else if (class_266.method_1166(var1)) {
            MinecraftClient.getInstance().field_9600.method_38891(this.method_8280());
            if (this.field_9458) {
               this.method_8268("");
            }

            return true;
         } else {
            switch (var1) {
               case 259:
                  if (this.field_9458) {
                     this.field_9453 = false;
                     this.method_8285(-1);
                     this.field_9453 = class_266.method_1190();
                  }

                  return true;
               case 260:
               case 264:
               case 265:
               case 266:
               case 267:
               default:
                  return false;
               case 261:
                  if (this.field_9458) {
                     this.field_9453 = false;
                     this.method_8285(1);
                     this.field_9453 = class_266.method_1190();
                  }

                  return true;
               case 262:
                  if (class_266.method_1185()) {
                     this.method_8284(this.method_8259(1));
                  } else {
                     this.method_8260(1);
                  }

                  return true;
               case 263:
                  if (class_266.method_1185()) {
                     this.method_8284(this.method_8259(-1));
                  } else {
                     this.method_8260(-1);
                  }

                  return true;
               case 268:
                  this.method_8253();
                  return true;
               case 269:
                  this.method_8278();
                  return true;
            }
         }
      }
   }

   public boolean method_8275() {
      return this.method_8274() && this.method_32691() && this.method_8252();
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      if (this.method_8275()) {
         if (!class_7665.method_34675(var1)) {
            return false;
         } else {
            if (this.field_9458) {
               this.method_8268(Character.toString(var1));
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (!this.method_8274()) {
         return false;
      } else {
         boolean var8 = var1 >= (double)this.field_36670
            && var1 < (double)(this.field_36670 + this.field_36671)
            && var3 >= (double)this.field_36674
            && var3 < (double)(this.field_36674 + this.field_36681);
         if (this.field_9452) {
            this.method_8273(var8);
         }

         if (this.method_32691() && var8 && var5 == 0) {
            int var9 = class_9299.method_42847(var1) - this.field_36670;
            if (this.field_9456) {
               var9 -= 4;
            }

            String var10 = this.field_9461.method_45394(this.field_9449.substring(this.field_9447), this.method_8267());
            this.method_8284(this.field_9461.method_45394(var10, var9).length() + this.field_9447);
            return true;
         } else {
            return false;
         }
      }
   }

   public void method_8273(boolean var1) {
      super.method_32698(var1);
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      if (this.method_8274()) {
         if (this.method_8256()) {
            int var7 = !this.method_32691() ? -6250336 : -1;
            method_9774(
               var1, this.field_36670 - 1, this.field_36674 - 1, this.field_36670 + this.field_36671 + 1, this.field_36674 + this.field_36681 + 1, var7
            );
            method_9774(var1, this.field_36670, this.field_36674, this.field_36670 + this.field_36671, this.field_36674 + this.field_36681, -16777216);
         }

         int var19 = !this.field_9458 ? this.field_9460 : this.field_9457;
         int var8 = this.field_9454 - this.field_9447;
         int var9 = this.field_9446 - this.field_9447;
         String var10 = this.field_9461.method_45394(this.field_9449.substring(this.field_9447), this.method_8267());
         boolean var11 = var8 >= 0 && var8 <= var10.length();
         boolean var12 = this.method_32691() && this.field_9445 / 6 % 2 == 0 && var11;
         int var13 = !this.field_9456 ? this.field_36670 : this.field_36670 + 4;
         int var14 = !this.field_9456 ? this.field_36674 : this.field_36674 + (this.field_36681 - 8) / 2;
         int var15 = var13;
         if (var9 > var10.length()) {
            var9 = var10.length();
         }

         if (!var10.isEmpty()) {
            String var16 = !var11 ? var10 : var10.substring(0, var8);
            var15 = this.field_9461.method_45402(var1, this.field_9451.apply(var16, this.field_9447), (float)var13, (float)var14, var19);
         }

         boolean var20 = this.field_9454 < this.field_9449.length() || this.field_9449.length() >= this.method_8247();
         int var17 = var15;
         if (var11) {
            if (var20) {
               var17 = var15 - 1;
               var15--;
            }
         } else {
            var17 = var8 <= 0 ? var13 : var13 + this.field_36671;
         }

         if (!var10.isEmpty() && var11 && var8 < var10.length()) {
            this.field_9461.method_45402(var1, this.field_9451.apply(var10.substring(var8), this.field_9454), (float)var15, (float)var14, var19);
         }

         if (!var20 && this.field_9455 != null) {
            this.field_9461.method_45390(var1, this.field_9455, (float)(var17 - 1), (float)var14, -8355712);
         }

         if (var12) {
            if (!var20) {
               this.field_9461.method_45390(var1, "_", (float)var17, (float)var14, var19);
            } else {
               class_2089.method_9774(var1, var17, var14 - 1, var17 + 1, var14 + 1 + 9, -3092272);
            }
         }

         if (var9 != var8) {
            int var18 = var13 + this.field_9461.method_45395(var10.substring(0, var9));
            this.method_8271(var17, var14 - 1, var18 - 1, var14 + 1 + 9);
         }
      }
   }

   private void method_8271(int var1, int var2, int var3, int var4) {
      if (var1 < var3) {
         int var7 = var1;
         var1 = var3;
         var3 = var7;
      }

      if (var2 < var4) {
         int var9 = var2;
         var2 = var4;
         var4 = var9;
      }

      if (var3 > this.field_36670 + this.field_36671) {
         var3 = this.field_36670 + this.field_36671;
      }

      if (var1 > this.field_36670 + this.field_36671) {
         var1 = this.field_36670 + this.field_36671;
      }

      class_8042 var10 = class_8042.method_36499();
      class_9633 var8 = var10.method_36501();
      class_3542.method_16480(0.0F, 0.0F, 255.0F, 255.0F);
      class_3542.method_16354();
      class_3542.method_16466();
      class_3542.method_16407(class_2603.field_12871);
      var8.method_44471(7, class_7985.field_40915);
      var8.method_35761((double)var1, (double)var4, 0.0).method_35735();
      var8.method_35761((double)var3, (double)var4, 0.0).method_35735();
      var8.method_35761((double)var3, (double)var2, 0.0).method_35735();
      var8.method_35761((double)var1, (double)var2, 0.0).method_35735();
      var10.method_36500();
      class_3542.method_16409();
      class_3542.method_16432();
   }

   public void method_8255(int var1) {
      this.field_9459 = var1;
      if (this.field_9449.length() > var1) {
         this.field_9449 = this.field_9449.substring(0, var1);
         this.method_8261(this.field_9449);
      }
   }

   private int method_8247() {
      return this.field_9459;
   }

   public int method_8283() {
      return this.field_9454;
   }

   private boolean method_8256() {
      return this.field_9456;
   }

   public void method_8258(boolean var1) {
      this.field_9456 = var1;
   }

   public void method_8250(int var1) {
      this.field_9457 = var1;
   }

   public void method_8249(int var1) {
      this.field_9460 = var1;
   }

   @Override
   public boolean method_26942(boolean var1) {
      return this.field_36677 && this.field_9458 ? super.method_26942(var1) : false;
   }

   @Override
   public boolean method_26937(double var1, double var3) {
      return this.field_36677
         && var1 >= (double)this.field_36670
         && var1 < (double)(this.field_36670 + this.field_36671)
         && var3 >= (double)this.field_36674
         && var3 < (double)(this.field_36674 + this.field_36681);
   }

   @Override
   public void method_32690(boolean var1) {
      if (var1) {
         this.field_9445 = 0;
      }
   }

   private boolean method_8252() {
      return this.field_9458;
   }

   public void method_8265(boolean var1) {
      this.field_9458 = var1;
   }

   public int method_8267() {
      return !this.method_8256() ? this.field_36671 : this.field_36671 - 8;
   }

   public void method_8248(int var1) {
      int var4 = this.field_9449.length();
      this.field_9446 = class_9299.method_42829(var1, 0, var4);
      if (this.field_9461 != null) {
         if (this.field_9447 > var4) {
            this.field_9447 = var4;
         }

         int var5 = this.method_8267();
         String var6 = this.field_9461.method_45394(this.field_9449.substring(this.field_9447), var5);
         int var7 = var6.length() + this.field_9447;
         if (this.field_9446 == this.field_9447) {
            this.field_9447 = this.field_9447 - this.field_9461.method_45384(this.field_9449, var5, true).length();
         }

         if (this.field_9446 <= var7) {
            if (this.field_9446 <= this.field_9447) {
               this.field_9447 = this.field_9447 - (this.field_9447 - this.field_9446);
            }
         } else {
            this.field_9447 = this.field_9447 + (this.field_9446 - var7);
         }

         this.field_9447 = class_9299.method_42829(this.field_9447, 0, var4);
      }
   }

   public void method_8269(boolean var1) {
      this.field_9452 = var1;
   }

   public boolean method_8274() {
      return this.field_36677;
   }

   public void method_8270(boolean var1) {
      this.field_36677 = var1;
   }

   public void method_8251(String var1) {
      this.field_9455 = var1;
   }

   public int method_8276(int var1) {
      return var1 <= this.field_9449.length() ? this.field_36670 + this.field_9461.method_45395(this.field_9449.substring(0, var1)) : this.field_36670;
   }

   public void method_8264(int var1) {
      this.field_36670 = var1;
   }
}
