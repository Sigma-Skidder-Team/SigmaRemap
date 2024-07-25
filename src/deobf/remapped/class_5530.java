package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5530 extends class_7807<class_5530> {
   private final class_1893 field_28199;
   private final List<class_5888> field_28198;
   private final UUID field_28196;
   private final String field_28191;
   private final Supplier<class_4639> field_28185;
   private boolean field_28195;
   private class_9521 field_28204;
   private class_9521 field_28197;
   private final List<class_7107> field_28202;
   private final List<class_7107> field_28201;
   private float field_28194;
   private static final ITextComponent field_28192 = new TranslationTextComponent("gui.socialInteractions.status_hidden").mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field_28188 = new TranslationTextComponent("gui.socialInteractions.status_blocked").mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field_28190 = new TranslationTextComponent("gui.socialInteractions.status_offline").mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field_28200 = new TranslationTextComponent("gui.socialInteractions.status_hidden_offline")
      .mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field_28205 = new TranslationTextComponent("gui.socialInteractions.status_blocked_offline")
      .mergeStyle(TextFormatting.ITALIC);
   public static final int field_28187 = class_8496.method_39154(190, 0, 0, 0);
   public static final int field_28193 = class_8496.method_39154(255, 74, 74, 74);
   public static final int field_28203 = class_8496.method_39154(255, 48, 48, 48);
   public static final int field_28189 = class_8496.method_39154(255, 255, 255, 255);
   public static final int field_28184 = class_8496.method_39154(140, 255, 255, 255);

   public class_5530(class_1893 var1, class_1840 var2, UUID var3, String var4, Supplier<class_4639> var5) {
      this.field_28199 = var1;
      this.field_28196 = var3;
      this.field_28191 = var4;
      this.field_28185 = var5;
      this.field_28202 = var1.field_9668.method_45391(new TranslationTextComponent("gui.socialInteractions.tooltip.hide", var4), 150);
      this.field_28201 = var1.field_9668.method_45391(new TranslationTextComponent("gui.socialInteractions.tooltip.show", var4), 150);
      class_9186 var8 = var1.method_8586();
      if (!var1.field_9632.method_3247().getId().equals(var3) && !var8.method_42336(var3)) {
         this.field_28204 = new class_3629(this, 0, 0, 20, 20, 0, 38, 20, class_1840.field_9330, 256, 256, var4x -> {
            var8.method_42338(var3);
            this.method_25112(true, new TranslationTextComponent("gui.socialInteractions.hidden_in_chat", var4));
         }, (var3x, var4x, var5x, var6) -> {
            this.field_28194 = this.field_28194 + var1.method_8491();
            if (this.field_28194 >= 10.0F) {
               var2.method_8128(() -> method_25116(var2, var4x, this.field_28202, var5x, var6));
            }
         }, new TranslationTextComponent("gui.socialInteractions.hide"));
         this.field_28197 = new class_1526(this, 0, 0, 20, 20, 20, 38, 20, class_1840.field_9330, 256, 256, var4x -> {
            var8.method_42340(var3);
            this.method_25112(false, new TranslationTextComponent("gui.socialInteractions.shown_in_chat", var4));
         }, (var3x, var4x, var5x, var6) -> {
            this.field_28194 = this.field_28194 + var1.method_8491();
            if (this.field_28194 >= 10.0F) {
               var2.method_8128(() -> method_25116(var2, var4x, this.field_28201, var5x, var6));
            }
         }, new TranslationTextComponent("gui.socialInteractions.show"));
         this.field_28197.field_36677 = var8.method_42339(var3);
         this.field_28204.field_36677 = !this.field_28197.field_36677;
         this.field_28198 = ImmutableList.of(this.field_28204, this.field_28197);
      } else {
         this.field_28198 = ImmutableList.of();
      }
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      int var13 = var4 + 4;
      int var14 = var3 + (var6 - 24) / 2;
      int var15 = var13 + 24 + 4;
      ITextComponent var16 = this.method_25109();
      int var17;
      if (var16 != StringTextComponent.EMPTY) {
         class_2089.method_9774(var1, var4, var3, var4 + var5, var3 + var6, field_28203);
         var17 = var3 + (var6 - 18) / 2;
         this.field_28199.field_9668.method_45378(var1, var16, (float)var15, (float)(var17 + 12), field_28184);
      } else {
         class_2089.method_9774(var1, var4, var3, var4 + var5, var3 + var6, field_28193);
         var17 = var3 + (var6 - 9) / 2;
      }

      this.field_28199.method_8577().method_35674(this.field_28185.get());
      class_2089.method_9780(var1, var13, var14, 24, 24, 8.0F, 8.0F, 8, 8, 64, 64);
      class_3542.method_16488();
      class_2089.method_9780(var1, var13, var14, 24, 24, 40.0F, 8.0F, 8, 8, 64, 64);
      class_3542.method_16448();
      this.field_28199.field_9668.method_45385(var1, this.field_28191, (float)var15, (float)var17, field_28189);
      if (this.field_28195) {
         class_2089.method_9774(var1, var13, var14, var13 + 24, var14 + 24, field_28187);
      }

      if (this.field_28204 != null && this.field_28197 != null) {
         float var18 = this.field_28194;
         this.field_28204.field_36670 = var4 + (var5 - this.field_28204.method_32699() - 4);
         this.field_28204.field_36674 = var3 + (var6 - this.field_28204.method_32695()) / 2;
         this.field_28204.method_6767(var1, var7, var8, var10);
         this.field_28197.field_36670 = var4 + (var5 - this.field_28197.method_32699() - 4);
         this.field_28197.field_36674 = var3 + (var6 - this.field_28197.method_32695()) / 2;
         this.field_28197.method_6767(var1, var7, var8, var10);
         if (var18 == this.field_28194) {
            this.field_28194 = 0.0F;
         }
      }
   }

   @Override
   public List<? extends class_5888> method_41183() {
      return this.field_28198;
   }

   public String method_25111() {
      return this.field_28191;
   }

   public UUID method_25113() {
      return this.field_28196;
   }

   public void method_25115(boolean var1) {
      this.field_28195 = var1;
   }

   private void method_25112(boolean var1, ITextComponent var2) {
      this.field_28197.field_36677 = var1;
      this.field_28204.field_36677 = !var1;
      this.field_28199.field_9614.method_13991().method_18676(var2);
      class_7542.field_38482.method_34341(var2.getString());
   }

   private IFormattableTextComponent method_25114(IFormattableTextComponent var1) {
      ITextComponent var4 = this.method_25109();
      return var4 != StringTextComponent.EMPTY
         ? new StringTextComponent(this.field_28191).appendString(", ").append(var4).appendString(", ").append(var1)
         : new StringTextComponent(this.field_28191).appendString(", ").append(var1);
   }

   private ITextComponent method_25109() {
      boolean var3 = this.field_28199.method_8586().method_42339(this.field_28196);
      boolean var4 = this.field_28199.method_8586().method_42336(this.field_28196);
      if (var4 && this.field_28195) {
         return field_28205;
      } else if (var3 && this.field_28195) {
         return field_28200;
      } else if (!var4) {
         if (!var3) {
            return !this.field_28195 ? StringTextComponent.EMPTY : field_28190;
         } else {
            return field_28192;
         }
      } else {
         return field_28188;
      }
   }

   private static void method_25116(class_1840 var0, class_7966 var1, List<class_7107> var2, int var3, int var4) {
      var0.method_1175(var1, var2, var3, var4);
      var0.method_8128((Runnable)null);
   }
}
