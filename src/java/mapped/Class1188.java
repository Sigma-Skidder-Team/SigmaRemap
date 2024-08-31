package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;

public class Class1188 extends Class1186 {
   private final KeyBinding field6413;
   private final ITextComponent field6414;
   private final Button field6415;
   private final Button field6416;
   public final Class1295 field6417;

   public Class1188(Class1295 var1, KeyBinding var2, ITextComponent var3) {
      this.field6417 = var1;
      this.field6413 = var2;
      this.field6414 = var3;
      this.field6415 = new Class1216(this, 0, 0, 75, 20, var3, var2x -> Class1295.method6127(this.field6417).field6199 = var2, var1, var2, var3);
      this.field6416 = new Class1246(this, 0, 0, 50, 20, new TranslationTextComponent("controls.reset"), var2x -> {
         this.field6417.field6782.gameSettings.method37142(var2, var2.getDefault());
         KeyBinding.resetKeyBindingArrayAndHash();
      }, var1, var3);
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      boolean var13 = Class1295.method6127(this.field6417).field6199 == this.field6413;
      this.field6417
         .field6782
         .fontRenderer
         .func_243248_b(var1, this.field6414, (float)(var4 + 90 - Class1295.method6128(this.field6417)), (float)(var3 + var6 / 2 - 4), 16777215);
      this.field6416.field6477 = var4 + 190;
      this.field6416.field6478 = var3;
      this.field6416.active = !this.field6413.isDefault();
      this.field6416.render(var1, var7, var8, var10);
      this.field6415.field6477 = var4 + 105;
      this.field6415.field6478 = var3;
      this.field6415.setMessage(this.field6413.func_238171_j_());
      boolean var14 = false;
      if (!this.field6413.isInvalid()) {
         for (KeyBinding var18 : this.field6417.field6782.gameSettings.field44658) {
            if (var18 != this.field6413 && this.field6413.conflicts(var18)) {
               var14 = true;
               break;
            }
         }
      }

      if (!var13) {
         if (var14) {
            this.field6415.setMessage(this.field6415.method5745().deepCopy().mergeStyle(TextFormatting.RED));
         }
      } else {
         this.field6415
            .setMessage(
               new StringTextComponent("> ")
                  .append(this.field6415.method5745().deepCopy().mergeStyle(TextFormatting.YELLOW))
                  .appendString(" <")
                  .mergeStyle(TextFormatting.YELLOW)
            );
      }

      this.field6415.render(var1, var7, var8, var10);
   }

   @Override
   public List<? extends Class1152> method2468() {
      return ImmutableList.of(this.field6415, this.field6416);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      return !this.field6415.method1958(var1, var3, var5) ? this.field6416.method1958(var1, var3, var5) : true;
   }

   @Override
   public boolean method2565(double var1, double var3, int var5) {
      return this.field6415.method2565(var1, var3, var5) || this.field6416.method2565(var1, var3, var5);
   }
}
