package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1220 extends Button implements Class1219 {
   public final RealmsMainScreen field6548;

   public Class1220(RealmsMainScreen var1) {
      super(var1.width / 2 + 47, 6, 22, 22, StringTextComponent.EMPTY, null);
      this.field6548 = var1;
      this.field6513 = var1x -> RealmsMainScreen.method2119(this.field6548, var1x);
   }

   @Override
   public void tick() {
      this.setMessage(new TranslationTextComponent(RealmsMainScreen.method2117(this.field6548) != 0 ? "mco.invites.pending" : "mco.invites.nopending"));
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      RealmsMainScreen.method2118(this.field6548, var1, var2, var3, this.field6477, this.field6478, this.method5737(), this.active);
   }
}
