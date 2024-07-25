package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_340 extends class_2208<class_4034> {
   private static final Identifier field_1282 = new Identifier("textures/gui/container/beacon.png");
   private static final ITextComponent field_1276 = new TranslationTextComponent("block.minecraft.beacon.primary");
   private static final ITextComponent field_1278 = new TranslationTextComponent("block.minecraft.beacon.secondary");
   private class_5618 field_1279;
   private boolean field_1275;
   private class_1425 field_1280;
   private class_1425 field_1281;

   public class_340(class_4034 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field_10981 = 230;
      this.field_10973 = 219;
      var1.method_18888(new class_6067(this, var1));
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_1279 = this.<class_5618>method_1186(new class_5618(this, this.field_10984 + 164, this.field_10962 + 107));
      this.<class_8562>method_1186(new class_8562(this, this.field_10984 + 190, this.field_10962 + 107));
      this.field_1275 = true;
      this.field_1279.field_36675 = false;
   }

   @Override
   public void method_5312() {
      super.method_5312();
      int var3 = this.field_10956.method_18563();
      if (this.field_1275 && var3 >= 0) {
         this.field_1275 = false;

         for (int var4 = 0; var4 <= 2; var4++) {
            int var5 = class_1100.field_6316[var4].length;
            int var6 = var5 * 22 + (var5 - 1) * 2;

            for (int var7 = 0; var7 < var5; var7++) {
               class_1425 var8 = class_1100.field_6316[var4][var7];
               class_6848 var9 = new class_6848(this, this.field_10984 + 76 + var7 * 24 - var6 / 2, this.field_10962 + 22 + var4 * 25, var8, true);
               this.<class_6848>method_1186(var9);
               if (var4 < var3) {
                  if (var8 == this.field_1280) {
                     var9.method_6183(true);
                  }
               } else {
                  var9.field_36675 = false;
               }
            }
         }

         byte var10 = 3;
         int var11 = class_1100.field_6316[3].length + 1;
         int var12 = var11 * 22 + (var11 - 1) * 2;

         for (int var13 = 0; var13 < var11 - 1; var13++) {
            class_1425 var15 = class_1100.field_6316[3][var13];
            class_6848 var16 = new class_6848(this, this.field_10984 + 167 + var13 * 24 - var12 / 2, this.field_10962 + 47, var15, false);
            this.<class_6848>method_1186(var16);
            if (3 < var3) {
               if (var15 == this.field_1281) {
                  var16.method_6183(true);
               }
            } else {
               var16.field_36675 = false;
            }
         }

         if (this.field_1280 != null) {
            class_6848 var14 = new class_6848(this, this.field_10984 + 167 + (var11 - 1) * 24 - var12 / 2, this.field_10962 + 47, this.field_1280, false);
            this.<class_6848>method_1186(var14);
            if (3 < var3) {
               if (this.field_1280 == this.field_1281) {
                  var14.method_6183(true);
               }
            } else {
               var14.field_36675 = false;
            }
         }
      }

      this.field_1279.field_36675 = this.field_10956.method_18564() && this.field_1280 != null;
   }

   @Override
   public void method_10221(class_7966 var1, int var2, int var3) {
      method_9788(var1, this.field_948, field_1276, 62, 10, 14737632);
      method_9788(var1, this.field_948, field_1278, 169, 10, 14737632);

      for (class_7114 var7 : this.field_950) {
         if (var7.method_32703()) {
            var7.method_32705(var1, var2 - this.field_10984, var3 - this.field_10962);
            break;
         }
      }
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.getTextureManager().bindTexture(field_1282);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      this.field_945.field_44875 = 100.0F;
      this.field_945.method_40274(new ItemStack(class_4897.field_25231), var7 + 20, var8 + 109);
      this.field_945.method_40274(new ItemStack(class_4897.field_24997), var7 + 41, var8 + 109);
      this.field_945.method_40274(new ItemStack(class_4897.field_24481), var7 + 41 + 22, var8 + 109);
      this.field_945.method_40274(new ItemStack(class_4897.field_25108), var7 + 42 + 44, var8 + 109);
      this.field_945.method_40274(new ItemStack(class_4897.field_25021), var7 + 42 + 66, var8 + 109);
      this.field_945.field_44875 = 0.0F;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }
}
