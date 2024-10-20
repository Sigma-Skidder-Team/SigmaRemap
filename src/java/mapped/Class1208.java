package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.CreateWorldScreen;
import net.minecraft.client.gui.screen.WorldOptionsScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;

public class Class1208 extends Button {
   private static String[] field6518;
   public final CreateWorldScreen field6519;
   public final WorldOptionsScreen field6520;

   public Class1208(WorldOptionsScreen var1, int var2, int var3, int var4, int var5, ITextComponent var6, IPressable var7, CreateWorldScreen var8) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6520 = var1;
      this.field6519 = var8;
   }

   @Override
   public ITextComponent method5745() {
      return DialogTexts.method22238(super.method5745(), WorldOptionsScreen.method5801(this.field6520).method26261() && !this.field6519.field7076);
   }
}
