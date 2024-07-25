package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.lwjgl.glfw.GLFW;

public class class_765 extends class_4232 {
   private static class_1013[] field_4131;
   private class_2825 field_4130;
   private int field_4142;
   private Screen field_4136;
   private GameOptions field_4133;
   private GameOptions field_4133;

   private static class_1013[] field_4141 = new class_1013[]{
      class_1013.field_5207,
      class_1013.field_5250,
      class_1013.field_5267,
      class_1013.field_5277,
      class_1013.field_5260,
      class_1013.field_5272,
      class_1013.field_5251,
      class_1013.field_5231,
      class_1013.field_5192,
      class_1013.field_5195,
      class_1013.field_5282,
      class_1013.field_5311
   };
   private class_5180 field_4138;
   private static final ITextComponent field_4129 = new TranslationTextComponent("options.graphics.fabulous").mergeStyle(TextFormatting.ITALIC);
   private static final ITextComponent field_4143 = new TranslationTextComponent("options.graphics.warning.message", field_4129, field_4129);
   private static final ITextComponent field_4139 = new TranslationTextComponent("options.graphics.warning.title").mergeStyle(TextFormatting.RED);
   private static final ITextComponent field_4137 = new TranslationTextComponent("options.graphics.warning.accept");
   private static final ITextComponent field_4134 = new TranslationTextComponent("options.graphics.warning.cancel");
   private static final ITextComponent field_4132 = new StringTextComponent("\n");
   private class_6809 field_4144 = new class_6809(this, new class_3403());
   private List<class_7114> field_4146 = this.field_950;
   private class_7114 field_4135;
   private GameOptions field_4145 = MinecraftClient.getInstance().gameOptions;

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      int var8 = this.field_4145.field_45484;
      if (!super.method_26940(var1, var3, var5)) {
         return false;
      } else {
         if (this.field_4145.field_45484 != var8) {
            this.field_943.method_32777();
         }

         if (this.field_4138.method_23758()) {
            ArrayList var9 = Lists.newArrayList(new ITextProperties[]{field_4143, field_4132});
            String var10 = this.field_4138.method_23749();
            if (var10 != null) {
               var9.add(field_4132);
               var9.add(new TranslationTextComponent("options.graphics.warning.renderer", var10).mergeStyle(TextFormatting.GRAY));
            }

            String var11 = this.field_4138.method_23747();
            if (var11 != null) {
               var9.add(field_4132);
               var9.add(new TranslationTextComponent("options.graphics.warning.vendor", var11).mergeStyle(TextFormatting.GRAY));
            }

            String var12 = this.field_4138.method_23760();
            if (var12 != null) {
               var9.add(field_4132);
               var9.add(new TranslationTextComponent("options.graphics.warning.version", var12).mergeStyle(TextFormatting.GRAY));
            }

            this.field_943.method_8609(new class_8889(field_4139, var9, ImmutableList.of(new class_3337(field_4137, var1x -> {
               this.field_4145.field_45397 = class_4615.field_22433;
               MinecraftClient.getInstance().worldRenderer.method_19998();
               this.field_4138.method_23750();
               this.field_943.method_8609(this);
            }), new class_3337(field_4134, var1x -> {
               this.field_4138.method_23748();
               this.field_943.method_8609(this);
            }))));
         }

         return true;
      }
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      return super.method_26941(var1, var3, var5);
   }

   public class_765(Screen var1, GameOptions var2) {
      super(new TranslationTextComponent("options.videoTitle"));
      this.field_4136 = var1;
      this.field_4133 = var2;
      this.field_4138 = this.field_4136.field_943.method_8538();
      this.field_4138.method_23759();
      if (this.field_4133.field_45397 == class_4615.field_22433) {
         this.field_4138.method_23750();
      }
   }

   @Override
   public void method_1163() {
      this.field_4146.clear();

      for (int var3 = 0; var3 < field_4141.length; var3++) {
         class_1013 var4 = field_4141[var3];
         if (var4 != null) {
            int var5 = this.field_941 / 2 - 155 + var3 % 2 * 160;
            int var6 = this.field_940 / 6 + 21 * (var3 / 2) - 12;
            class_7114 var7 = this.<class_7114>method_1186(var4.method_4482(this.field_943.gameOptions, var5, var6, 150));
            if (var4 == class_1013.field_5251) {
               this.field_4135 = var7;
            }
         }
      }

      int var8 = this.field_940 / 6 + 21 * (field_4141.length / 2) - 12;
      int var12 = 0;
      var12 = this.field_941 / 2 - 155 + 0;
      this.<class_4583>method_1186(new class_4583(231, var12, var8, class_3458.method_15912("of.options.shaders")));
      var12 = this.field_941 / 2 - 155 + 160;
      this.<class_4583>method_1186(new class_4583(202, var12, var8, class_3458.method_15912("of.options.quality")));
      var8 += 21;
      var12 = this.field_941 / 2 - 155 + 0;
      this.<class_4583>method_1186(new class_4583(201, var12, var8, class_3458.method_15912("of.options.details")));
      var12 = this.field_941 / 2 - 155 + 160;
      this.<class_4583>method_1186(new class_4583(212, var12, var8, class_3458.method_15912("of.options.performance")));
      var8 += 21;
      var12 = this.field_941 / 2 - 155 + 0;
      this.<class_4583>method_1186(new class_4583(211, var12, var8, class_3458.method_15912("of.options.animations")));
      var12 = this.field_941 / 2 - 155 + 160;
      this.<class_4583>method_1186(new class_4583(222, var12, var8, class_3458.method_15912("of.options.other")));
      var8 += 21;
      this.<class_5932>method_1186(new class_5932(200, this.field_941 / 2 - 100, this.field_940 / 6 + 168 + 11, class_6956.method_31803("gui.done")));
   }

   @Override
   public void method_19728(class_7114 var1) {
      if (var1 == this.field_4135) {
         this.method_3450();
      }

      this.method_3449();
      if (var1 instanceof class_5932) {
         class_5932 var4 = (class_5932)var1;
         this.method_3451(var4, 1);
      }
   }

   private void method_3449() {
      if (this.field_4138.method_23758()) {
         ArrayList var3 = Lists.newArrayList(new ITextProperties[]{field_4143, field_4132});
         String var4 = this.field_4138.method_23749();
         if (var4 != null) {
            var3.add(field_4132);
            var3.add(new TranslationTextComponent("options.graphics.warning.renderer", var4).mergeStyle(TextFormatting.GRAY));
         }

         String var5 = this.field_4138.method_23747();
         if (var5 != null) {
            var3.add(field_4132);
            var3.add(new TranslationTextComponent("options.graphics.warning.vendor", var5).mergeStyle(TextFormatting.GRAY));
         }

         String var6 = this.field_4138.method_23760();
         if (var6 != null) {
            var3.add(field_4132);
            var3.add(new TranslationTextComponent("options.graphics.warning.version", var6).mergeStyle(TextFormatting.GRAY));
         }

         this.field_943.method_8609(new class_8889(field_4139, var3, ImmutableList.of(new class_3337(field_4137, var1 -> {
            this.field_4133.field_45397 = class_4615.field_22433;
            MinecraftClient.getInstance().worldRenderer.method_19998();
            this.field_4138.method_23750();
            this.field_943.method_8609(this);
         }), new class_3337(field_4134, var1 -> {
            this.field_4138.method_23748();
            this.field_943.method_8609(this);
         }))));
      }
   }

   @Override
   public void method_19729(class_7114 var1) {
      if (var1 == this.field_4135) {
         class_1013.field_5251.method_18455(this.field_4133, -1);
         this.method_3450();
      }
   }

   private void method_3450() {
      this.field_943.method_32777();
      Window var3 = this.field_943.method_8552();
      int var4 = class_2148.method_10029(this.field_4135);
      int var5 = class_2148.method_10030(this.field_4135);
      int var6 = this.field_4135.field_36670 + (var4 - var5);
      int var7 = this.field_4135.field_36674 + var5 / 2;
      GLFW.glfwSetCursorPos(var3.method_43181(), (double)var6 * var3.method_43189(), (double)var7 * var3.method_43189());
   }

   private void method_3451(class_5932 var1, int var2) {
      if (var1.field_36675) {
         if (var1.field_30159 == 200) {
            this.field_943.gameOptions.method_40873();
            this.field_943.method_8609(this.field_4136);
         }

         if (var1.field_30159 == 201) {
            this.field_943.gameOptions.method_40873();
            class_9135 var5 = new class_9135(this, this.field_4133);
            this.field_943.method_8609(var5);
         }

         if (var1.field_30159 == 202) {
            this.field_943.gameOptions.method_40873();
            class_2908 var6 = new class_2908(this, this.field_4133);
            this.field_943.method_8609(var6);
         }

         if (var1.field_30159 == 211) {
            this.field_943.gameOptions.method_40873();
            class_587 var7 = new class_587(this, this.field_4133);
            this.field_943.method_8609(var7);
         }

         if (var1.field_30159 == 212) {
            this.field_943.gameOptions.method_40873();
            class_3646 var8 = new class_3646(this, this.field_4133);
            this.field_943.method_8609(var8);
         }

         if (var1.field_30159 == 222) {
            this.field_943.gameOptions.method_40873();
            class_8767 var9 = new class_8767(this, this.field_4133);
            this.field_943.method_8609(var9);
         }

         if (var1.field_30159 == 231) {
            if (class_3111.method_14248() || class_3111.method_14252()) {
               class_3111.method_14428(class_3458.method_15912("of.message.shaders.aa1"), class_3458.method_15912("of.message.shaders.aa2"));
               return;
            }

            if (class_3111.method_14423()) {
               class_3111.method_14428(class_3458.method_15912("of.message.shaders.af1"), class_3458.method_15912("of.message.shaders.af2"));
               return;
            }

            if (class_3111.method_14355()) {
               class_3111.method_14428(class_3458.method_15912("of.message.shaders.gf1"), class_3458.method_15912("of.message.shaders.gf2"));
               return;
            }

            this.field_943.gameOptions.method_40873();
            class_1789 var10 = new class_1789(this, this.field_4133);
            this.field_943.method_8609(var10);
         }
      }
   }

   @Override
   public void method_1162() {
      this.field_943.gameOptions.method_40873();
      super.method_1162();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_943.textRenderer, this.field_947, this.field_941 / 2, 15, 16777215);
      String var7 = class_3111.method_14314();
      String var8 = "HD_U";
      if (var8.equals("HD")) {
         var7 = "OptiFine HD G5";
      }

      if (var8.equals("HD_U")) {
         var7 = "OptiFine HD G5 Ultra";
      }

      if (var8.equals("L")) {
         var7 = "OptiFine G5 Light";
      }

      method_9770(var1, this.field_943.textRenderer, var7, 2, this.field_940 - 10, 8421504);
      String var9 = "Minecraft 1.16.4";
      int var10 = this.field_943.textRenderer.method_45395(var9);
      method_9770(var1, this.field_943.textRenderer, var9, this.field_941 - var10 - 2, this.field_940 - 10, 8421504);
      super.method_6767(var1, var2, var3, var4);
      this.field_4144.method_31255(var1, var2, var3, this.field_4146);
   }

   public static String method_3448(class_5766 var0) {
      return var0.field_29142.method_8246();
   }
}
