package net.minecraft.client.gui.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.*;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.Util;
import net.minecraft.util.text.TranslationTextComponent;

public class ControlsScreen extends Class1135 {
   public KeyBinding field6199;
   public long field6200;
   private Class1295 field6201;
   private Button field6202;

   public ControlsScreen(Screen var1, GameSettings var2) {
      super(var1, var2, new TranslationTextComponent("controls.title"));
   }

   @Override
   public void init() {
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155,
            18,
            150,
            20,
            new TranslationTextComponent("options.mouse_settings"),
            var1 -> this.mc.displayGuiScreen(new Class1143(this, this.field6193))
         )
      );
      this.<Widget>addButton(AbstractOption.field25351.createWidget(this.field6193, this.width / 2 - 155 + 160, 18, 150));
      this.field6201 = new Class1295(this, this.mc);
      this.children.add(this.field6201);
      this.field6202 = this.<Button>addButton(
         new Button(this.width / 2 - 155, this.height - 29, 150, 20, new TranslationTextComponent("controls.resetAll"), var1 -> {
            for (KeyBinding var7 : this.field6193.field44658) {
               var7.bind(var7.getDefault());
            }

            KeyBinding.resetKeyBindingArrayAndHash();
         })
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 155 + 160, this.height - 29, 150, 20, DialogTexts.field30658, var1 -> this.mc.displayGuiScreen(this.field6192))
      );
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.field6199 == null) {
         return super.mouseClicked(var1, var3, var5);
      } else {
         this.field6193.method37142(this.field6199, InputMappingsType.MOUSE.method8197(var5));
         this.field6199 = null;
         KeyBinding.resetKeyBindingArrayAndHash();
         return true;
      }
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (this.field6199 == null) {
         return super.keyPressed(var1, var2, var3);
      } else {
         if (var1 != 256) {
            this.field6193.method37142(this.field6199, InputMappings.method38637(var1, var2));
         } else {
            this.field6193.method37142(this.field6199, InputMappings.INPUT_INVALID);
         }

         this.field6199 = null;
         this.field6200 = Util.milliTime();
         KeyBinding.resetKeyBindingArrayAndHash();
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field6201.render(var1, var2, var3, var4);
      drawCenteredString(var1, this.font, this.title, this.width / 2, 8, 16777215);
      boolean var7 = false;

      for (KeyBinding var11 : this.field6193.field44658) {
         if (!var11.isDefault()) {
            var7 = true;
            break;
         }
      }

      this.field6202.active = var7;
      super.render(var1, var2, var3, var4);
   }
}
