package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5603 extends class_266 {
   private static final Identifier field_28419 = new Identifier("textures/gui/container/gamemode_switcher.png");
   private static final int field_28417 = class_531.values().length * 30 - 5;
   private static final ITextComponent field_28420 = new TranslationTextComponent(
      "debug.gamemodes.select_next", new TranslationTextComponent("debug.gamemodes.press_f4").mergeStyle(TextFormatting.AQUA)
   );
   private final Optional<class_531> field_28418;
   private Optional<class_531> field_28415 = Optional.<class_531>empty();
   private int field_28416;
   private int field_28422;
   private boolean field_28421;
   private final List<class_3401> field_28423 = Lists.newArrayList();

   public class_5603() {
      super(class_7542.field_38486);
      this.field_28418 = class_531.method_2581(this.method_25423());
   }

   private class_4666 method_25423() {
      class_4666 var3 = MinecraftClient.getInstance().field_9647.method_42158();
      class_4666 var4 = MinecraftClient.getInstance().field_9647.method_42132();
      if (var4 == class_4666.field_22762) {
         if (var3 != class_4666.field_22761) {
            var4 = class_4666.field_22761;
         } else {
            var4 = class_4666.field_22764;
         }
      }

      return var4;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_28415 = !this.field_28418.isPresent() ? class_531.method_2581(this.field_943.field_9647.method_42158()) : this.field_28418;

      for (int var3 = 0; var3 < class_531.field_3230.length; var3++) {
         class_531 var4 = class_531.field_3230[var3];
         this.field_28423.add(new class_3401(this, var4, this.field_941 / 2 - field_28417 / 2 + var3 * 30, this.field_940 / 2 - 30));
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (!this.method_25425()) {
         var1.method_36063();
         class_3542.method_16488();
         this.field_943.method_8577().method_35674(field_28419);
         int var7 = this.field_941 / 2 - 62;
         int var8 = this.field_940 / 2 - 30 - 27;
         method_9778(var1, var7, var8, 0.0F, 0.0F, 125, 75, 128, 128);
         var1.method_36064();
         super.method_6767(var1, var2, var3, var4);
         this.field_28415
            .ifPresent(var2x -> method_9788(var1, this.field_948, class_531.method_2582(var2x), this.field_941 / 2, this.field_940 / 2 - 30 - 20, -1));
         method_9788(var1, this.field_948, field_28420, this.field_941 / 2, this.field_940 / 2 + 5, 16777215);
         if (!this.field_28421) {
            this.field_28416 = var2;
            this.field_28422 = var3;
            this.field_28421 = true;
         }

         boolean var9 = this.field_28416 == var2 && this.field_28422 == var3;

         for (class_3401 var11 : this.field_28423) {
            var11.method_6767(var1, var2, var3, var4);
            this.field_28415.ifPresent(var1x -> var11.method_15712(var1x == class_3401.method_15713(var11)));
            if (!var9 && var11.method_32703()) {
               this.field_28415 = Optional.<class_531>of(class_3401.method_15713(var11));
            }
         }
      }
   }

   private void method_25426() {
      method_25424(this.field_943, this.field_28415);
   }

   private static void method_25424(MinecraftClient var0, Optional<class_531> var1) {
      if (var0.field_9647 != null && var0.field_9632 != null && var1.isPresent()) {
         Optional var4 = class_531.method_2581(var0.field_9647.method_42158());
         class_531 var5 = (class_531)var1.get();
         if (var4.isPresent() && var0.field_9632.method_37163(2) && var5 != var4.get()) {
            var0.field_9632.method_27307(class_531.method_2586(var5));
         }
      }
   }

   private boolean method_25425() {
      if (class_9732.method_44934(this.field_943.method_8552().method_43181(), 292)) {
         return false;
      } else {
         this.method_25426();
         this.field_943.method_8609((class_266)null);
         return true;
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 == 293 && this.field_28415.isPresent()) {
         this.field_28421 = false;
         this.field_28415 = class_531.method_2580(this.field_28415.get());
         return true;
      } else {
         return super.method_26946(var1, var2, var3);
      }
   }

   @Override
   public boolean method_1161() {
      return false;
   }
}
