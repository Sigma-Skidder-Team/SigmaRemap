package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.gui.screens.SigmaClassicAltManager;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.gui.Screen;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.LanguageScreen;
import net.minecraft.client.gui.screen.OptionsScreen;
import net.minecraft.client.gui.screen.WorldSelectionScreen;
import net.minecraft.util.SoundEvents;

public class Class4337 extends CustomGuiScreen {
   public final Class4254 field21186;
   public final Class4254 field21187;
   public final Class4254 field21188;
   public final Class4254 field21189;
   public final Class4254 field21190;
   public final Class4254 field21191;
   public final Class4254 field21192;

   public Class4337(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      int var9 = 0;
      this.addToList(this.field21186 = new Class4254(this, "Singleplayer", this.method13497(var9++), this.method13496(), 114, 140, ResourceList.singlePlayer));
      this.addToList(this.field21191 = new Class4254(this, "Multiplayer", this.method13497(var9++), this.method13496(), 114, 140, ResourceList.multiplayer));
      this.addToList(this.field21189 = new Class4254(this, "Options", this.method13497(var9++), this.method13496(), 114, 140, ResourceList.options));
      this.addToList(this.field21188 = new Class4254(this, "Language", this.method13497(var9++), this.method13496(), 114, 140, ResourceList.language));
      this.addToList(
         this.field21190 = new Class4254(this, "Accounts", this.method13497(var9++), this.method13496() + 140 + 10, 114, 140, ResourceList.accounts)
      );
      this.addToList(this.field21192 = new Class4254(this, "Agora", this.method13497(var9++), this.method13496() + 140 + 10, 114, 140, ResourceList.agora));
      this.addToList(this.field21187 = new Class4254(this, "Exit", this.method13497(var9++), this.method13496() + 140 + 10, 114, 140, ResourceList.exit));
      this.field21186.doThis((var1x, var2x) -> this.method13493(new WorldSelectionScreen(Minecraft.getInstance().currentScreen)));
      this.field21191.doThis((var1x, var2x) -> this.method13493(new JelloPortalScreen(Minecraft.getInstance().currentScreen)));
      this.field21189.doThis((var1x, var2x) -> this.method13493(new OptionsScreen(Minecraft.getInstance().currentScreen, Minecraft.getInstance().gameSettings)));
      this.field21190.doThis((var1x, var2x) -> this.method13494(new SigmaClassicAltManager()));
      this.field21188
         .doThis(
            (var1x, var2x) -> this.method13493(
                  new LanguageScreen(Minecraft.getInstance().currentScreen, Minecraft.getInstance().gameSettings, Minecraft.getInstance().getLanguageManager())
               )
         );
      this.field21187.doThis((var0, var1x) -> Minecraft.getInstance().shutdown());
   }

   public void method13493(net.minecraft.client.gui.screen.Screen var1) {
      Minecraft.getInstance().displayGuiScreen(var1);
      this.method13495();
   }

   public void method13494(Screen var1) {
      Client.getInstance().getGuiManager().method33482(var1);
      this.method13495();
   }

   public void method13495() {
      Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(SoundEvents.field27176, 1.0F));
   }

   private int method13496() {
      return 150;
   }

   private int method13497(int var1) {
      int var6 = 4;
      int var7 = -6;
      int var8 = 122 * var6 + var6 * var7;
      if (var1 < var6) {
         return this.getWidthA() / 2 - var8 / 2 + var1 * 122 + var1 * var7 - 12;
      } else {
         var1 -= var6;
         var6 = 3;
         var7 = 6;
         var8 = 122 * var6 + var6 * var7;
         return this.getWidthA() / 2 - var8 / 2 + var1 * 122 + var1 * var7 - 12;
      }
   }

   @Override
   public void draw(float var1) {
      this.method13225();
      RenderUtil.method11455((float)(this.xA + (this.getWidthA() - 300) / 2), (float)(this.yA + 30), 300.0F, 97.0F, ResourceList.big);
      super.draw(var1);
   }
}
