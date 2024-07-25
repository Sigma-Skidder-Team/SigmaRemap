package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent$class_47;

public class class_7696 extends Screen {
   private int field_39072;
   private final ITextComponent field_39074;
   private final boolean field_39073;
   private ITextComponent field_39070;

   public class_7696(ITextComponent var1, boolean var2) {
      super(new TranslationTextComponent(!var2 ? "deathScreen.title" : "deathScreen.title.hardcore"));
      this.field_39074 = var1;
      this.field_39073 = var2;
   }

   @Override
   public void method_1163() {
      this.field_39072 = 0;
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            this.field_940 / 4 + 72,
            200,
            20,
            !this.field_39073 ? new TranslationTextComponent("deathScreen.respawn") : new TranslationTextComponent("deathScreen.spectate"),
            var1 -> {
               this.field_943.field_9632.method_3205();
               this.field_943.method_8609((Screen)null);
            }
         )
      );
      class_9521 var3 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            this.field_940 / 4 + 96,
            200,
            20,
            new TranslationTextComponent("deathScreen.titleScreen"),
            var1 -> {
               if (!this.field_39073) {
                  class_9640 var4 = new class_9640(
                     this::method_34869,
                     new TranslationTextComponent("deathScreen.quit.confirm"),
                     StringTextComponent.EMPTY,
                     new TranslationTextComponent("deathScreen.titleScreen"),
                     new TranslationTextComponent("deathScreen.respawn")
                  );
                  this.field_943.method_8609(var4);
                  var4.method_44506(20);
               } else {
                  this.method_34868();
               }
            }
         )
      );
      if (!this.field_39073 && this.field_943.method_8502() == null) {
         var3.field_36675 = false;
      }

      for (class_7114 var5 : this.field_950) {
         var5.field_36675 = false;
      }

      this.field_39070 = new TranslationTextComponent("deathScreen.score")
         .appendString(": ")
         .append(new StringTextComponent(Integer.toString(this.field_943.field_9632.method_3227())).mergeStyle(TextFormatting.YELLOW));
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   private void method_34869(boolean var1) {
      if (!var1) {
         this.field_943.field_9632.method_3205();
         this.field_943.method_8609((Screen)null);
      } else {
         this.method_34868();
      }
   }

   private void method_34868() {
      if (this.field_943.field_9601 != null) {
         this.field_943.field_9601.method_29519();
      }

      this.field_943.method_8500(new class_6476(new TranslationTextComponent("menu.savingLevel")));
      this.field_943.method_8609(new class_1876());
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_9772(var1, 0, 0, this.field_941, this.field_940, 1615855616, -1602211792);
      class_3542.method_16438();
      class_3542.method_16403(2.0F, 2.0F, 2.0F);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2 / 2, 30, 16777215);
      class_3542.method_16489();
      if (this.field_39074 != null) {
         method_9788(var1, this.field_948, this.field_39074, this.field_941 / 2, 85, 16777215);
      }

      method_9788(var1, this.field_948, this.field_39070, this.field_941 / 2, 100, 16777215);
      if (this.field_39074 != null && var3 > 85 && var3 < 94) {
         Style var7 = this.method_34870(var2);
         this.method_1180(var1, var7, var2, var3);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   @Nullable
   private Style method_34870(int var1) {
      if (this.field_39074 == null) {
         return null;
      } else {
         int var4 = this.field_943.textRenderer.method_45379(this.field_39074);
         int var5 = this.field_941 / 2 - var4 / 2;
         int var6 = this.field_941 / 2 + var4 / 2;
         return var1 >= var5 && var1 <= var6 ? this.field_943.textRenderer.method_45381().func_238357_a_(this.field_39074, var1 - var5) : null;
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.field_39074 != null && var3 > 85.0 && var3 < 94.0) {
         Style var8 = this.method_34870((int)var1);
         if (var8 != null && var8.getClickEvent() != null && var8.getClickEvent().getAction() == ClickEvent$class_47.OPEN_URL) {
            this.method_1187(var8);
            return false;
         }
      }

      return super.method_26940(var1, var3, var5);
   }

   @Override
   public boolean method_1161() {
      return false;
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_39072++;
      if (this.field_39072 == 20) {
         for (class_7114 var4 : this.field_950) {
            var4.field_36675 = true;
         }
      }
   }
}
