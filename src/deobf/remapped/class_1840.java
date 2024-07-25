package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1840 extends class_266 {
   public static final class_4639 field_9330 = new class_4639("textures/gui/social_interactions.png");
   private static final ITextComponent field_9319 = new TranslationTextComponent("gui.socialInteractions.tab_all");
   private static final ITextComponent field_9327 = new TranslationTextComponent("gui.socialInteractions.tab_hidden");
   private static final ITextComponent field_9323 = new TranslationTextComponent("gui.socialInteractions.tab_blocked");
   private static final ITextComponent field_9340 = field_9319.copyRaw().mergeStyle(TextFormatting.UNDERLINE);
   private static final ITextComponent field_9331 = field_9327.copyRaw().mergeStyle(TextFormatting.UNDERLINE);
   private static final ITextComponent field_9341 = field_9323.copyRaw().mergeStyle(TextFormatting.UNDERLINE);
   private static final ITextComponent field_9329 = new TranslationTextComponent("gui.socialInteractions.search_hint")
      .mergeStyle(TextFormatting.ITALIC)
      .mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field_9332 = new TranslationTextComponent("gui.socialInteractions.search_empty").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field_9339 = new TranslationTextComponent("gui.socialInteractions.empty_hidden").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field_9333 = new TranslationTextComponent("gui.socialInteractions.empty_blocked").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field_9328 = new TranslationTextComponent("gui.socialInteractions.blocking_hint");
   private class_2989 field_9335;
   private class_1863 field_9324;
   private String field_9322 = "";
   private class_5011 field_9342 = class_5011.field_25921;
   private class_9521 field_9321;
   private class_9521 field_9338;
   private class_9521 field_9337;
   private class_9521 field_9320;
   private ITextComponent field_9318;
   private int field_9334;
   private boolean field_9325;
   private Runnable field_9336;

   public class_1840() {
      super(new TranslationTextComponent("gui.socialInteractions.title"));
      this.method_8132(MinecraftClient.getInstance());
   }

   private int method_8136() {
      return Math.max(52, this.field_940 - 128 - 16);
   }

   private int method_8131() {
      return this.method_8136() / 16;
   }

   private int method_8135() {
      return 80 + this.method_8131() * 16 - 8;
   }

   private int method_8127() {
      return (this.field_941 - 238) / 2;
   }

   @Override
   public String method_1165() {
      return super.method_1165() + ". " + this.field_9318.getString();
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_9324.method_8279();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      if (!this.field_9325) {
         this.field_9335 = new class_2989(this, this.field_943, this.field_941, this.field_940, 88, this.method_8135(), 36);
      } else {
         this.field_9335.method_36216(this.field_941, this.field_940, 88, this.method_8135());
      }

      int var3 = this.field_9335.method_36195() / 3;
      int var4 = this.field_9335.method_36229();
      int var5 = this.field_9335.method_36198();
      int var6 = this.field_948.method_45379(field_9328) + 40;
      int var7 = 64 + 16 * this.method_8131();
      int var8 = (this.field_941 - var6) / 2;
      this.field_9321 = this.<class_9521>method_1186(new class_9521(var4, 45, var3, 20, field_9319, var1 -> this.method_8129(class_5011.field_25921)));
      this.field_9338 = this.<class_9521>method_1186(
         new class_9521((var4 + var5 - var3) / 2 + 1, 45, var3, 20, field_9327, var1 -> this.method_8129(class_5011.field_25920))
      );
      this.field_9337 = this.<class_9521>method_1186(
         new class_9521(var5 - var3 + 1, 45, var3, 20, field_9323, var1 -> this.method_8129(class_5011.field_25922))
      );
      this.field_9320 = this.<class_9521>method_1186(
         new class_9521(var8, var7, var6, 20, field_9328, var1 -> this.field_943.method_8609(new class_260(var1x -> {
               if (var1x) {
                  Util.getOperatingSystem().method_37581("https://aka.ms/javablocking");
               }

               this.field_943.method_8609(this);
            }, "https://aka.ms/javablocking", true)))
      );
      String var9 = this.field_9324 == null ? "" : this.field_9324.method_8246();
      this.field_9324 = new class_6173(this, this.field_948, this.method_8127() + 28, 78, 196, 16, field_9329);
      this.field_9324.method_8255(16);
      this.field_9324.method_8258(false);
      this.field_9324.method_8270(true);
      this.field_9324.method_8250(16777215);
      this.field_9324.method_8281(var9);
      this.field_9324.method_8277(this::method_8138);
      this.field_942.add(this.field_9324);
      this.field_942.add(this.field_9335);
      this.field_9325 = true;
      this.method_8129(this.field_9342);
   }

   private void method_8129(class_5011 var1) {
      this.field_9342 = var1;
      this.field_9321.method_32687(field_9319);
      this.field_9338.method_32687(field_9327);
      this.field_9337.method_32687(field_9323);
      Object var4;
      switch (var1) {
         case field_25921:
            this.field_9321.method_32687(field_9340);
            var4 = this.field_943.field_9632.field_30532.method_4803();
            break;
         case field_25920:
            this.field_9338.method_32687(field_9331);
            var4 = this.field_943.method_8586().method_42334();
            break;
         case field_25922:
            this.field_9337.method_32687(field_9341);
            class_9186 var5 = this.field_943.method_8586();
            var4 = this.field_943.field_9632.field_30532.method_4803().stream().filter(var5::method_42336).collect(Collectors.toSet());
            break;
         default:
            var4 = ImmutableList.of();
      }

      this.field_9342 = var1;
      this.field_9335.method_13681((Collection<UUID>)var4, this.field_9335.method_36228());
      if (!this.field_9324.method_8246().isEmpty() && this.field_9335.method_13678() && !this.field_9324.method_32691()) {
         class_7542.field_38482.method_34341(field_9332.getString());
      } else if (var4.isEmpty()) {
         if (var1 == class_5011.field_25920) {
            class_7542.field_38482.method_34341(field_9339.getString());
         } else if (var1 == class_5011.field_25922) {
            class_7542.field_38482.method_34341(field_9333.getString());
         }
      }
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public void method_1183(class_7966 var1) {
      int var4 = this.method_8127() + 3;
      super.method_1183(var1);
      this.field_943.method_8577().method_35674(field_9330);
      this.method_9781(var1, var4, 64, 1, 1, 236, 8);
      int var5 = this.method_8131();

      for (int var6 = 0; var6 < var5; var6++) {
         this.method_9781(var1, var4, 72 + 16 * var6, 1, 10, 236, 16);
      }

      this.method_9781(var1, var4, 72 + 16 * var5, 1, 27, 236, 8);
      this.method_9781(var1, var4 + 10, 76, 243, 1, 12, 12);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_8132(this.field_943);
      this.method_1183(var1);
      if (this.field_9318 != null) {
         method_9771(var1, this.field_943.textRenderer, this.field_9318, this.method_8127() + 8, 35, -1);
      }

      if (!this.field_9335.method_13678()) {
         this.field_9335.method_6767(var1, var2, var3, var4);
      } else if (!this.field_9324.method_8246().isEmpty()) {
         method_9788(var1, this.field_943.textRenderer, field_9332, this.field_941 / 2, (78 + this.method_8135()) / 2, -1);
      } else {
         switch (this.field_9342) {
            case field_25920:
               method_9788(var1, this.field_943.textRenderer, field_9339, this.field_941 / 2, (78 + this.method_8135()) / 2, -1);
               break;
            case field_25922:
               method_9788(var1, this.field_943.textRenderer, field_9333, this.field_941 / 2, (78 + this.method_8135()) / 2, -1);
         }
      }

      if (!this.field_9324.method_32691() && this.field_9324.method_8246().isEmpty()) {
         method_9771(var1, this.field_943.textRenderer, field_9329, this.field_9324.field_36670, this.field_9324.field_36674, -1);
      } else {
         this.field_9324.method_6767(var1, var2, var3, var4);
      }

      this.field_9320.field_36677 = this.field_9342 == class_5011.field_25922;
      super.method_6767(var1, var2, var3, var4);
      if (this.field_9336 != null) {
         this.field_9336.run();
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.field_9324.method_32691()) {
         this.field_9324.method_26940(var1, var3, var5);
      }

      return super.method_26940(var1, var3, var5) || this.field_9335.method_26940(var1, var3, var5);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!this.field_9324.method_32691() && this.field_943.field_9577.field_45421.method_27062(var1, var2)) {
         this.field_943.method_8609((class_266)null);
         return true;
      } else {
         return super.method_26946(var1, var2, var3);
      }
   }

   @Override
   public boolean method_1161() {
      return false;
   }

   private void method_8138(String var1) {
      var1 = var1.toLowerCase(Locale.ROOT);
      if (!var1.equals(this.field_9322)) {
         this.field_9335.method_13680(var1);
         this.field_9322 = var1;
         this.method_8129(this.field_9342);
      }
   }

   private void method_8132(MinecraftClient var1) {
      int var4 = var1.method_8614().method_4798().size();
      if (this.field_9334 != var4) {
         String var5 = "";
         class_2560 var6 = var1.method_8530();
         if (!var1.method_8566()) {
            if (var6 != null) {
               var5 = var6.field_12670;
            }
         } else {
            var5 = var1.method_8515().method_1748();
         }

         if (var4 <= 1) {
            this.field_9318 = new TranslationTextComponent("gui.socialInteractions.server_label.single", var5, var4);
         } else {
            this.field_9318 = new TranslationTextComponent("gui.socialInteractions.server_label.multiple", var5, var4);
         }

         this.field_9334 = var4;
      }
   }

   public void method_8133(class_753 var1) {
      this.field_9335.method_13682(var1, this.field_9342);
   }

   public void method_8134(UUID var1) {
      this.field_9335.method_13679(var1);
   }

   public void method_8128(Runnable var1) {
      this.field_9336 = var1;
   }
}
