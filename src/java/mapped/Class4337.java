package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class4307;

public class Class4337 extends Class4305 {
   public final Class4254 field21186;
   public final Class4254 field21187;
   public final Class4254 field21188;
   public final Class4254 field21189;
   public final Class4254 field21190;
   public final Class4254 field21191;
   public final Class4254 field21192;

   public Class4337(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      int var9 = 0;
      this.method13230(this.field21186 = new Class4254(this, "Singleplayer", this.method13497(var9++), this.method13496(), 114, 140, ClassicDecryption.singlePlayer));
      this.method13230(this.field21191 = new Class4254(this, "Multiplayer", this.method13497(var9++), this.method13496(), 114, 140, ClassicDecryption.multiplayer));
      this.method13230(this.field21189 = new Class4254(this, "Options", this.method13497(var9++), this.method13496(), 114, 140, ClassicDecryption.options));
      this.method13230(this.field21188 = new Class4254(this, "Language", this.method13497(var9++), this.method13496(), 114, 140, ClassicDecryption.language));
      this.method13230(
         this.field21190 = new Class4254(this, "Accounts", this.method13497(var9++), this.method13496() + 140 + 10, 114, 140, ClassicDecryption.accounts)
      );
      this.method13230(this.field21192 = new Class4254(this, "Agora", this.method13497(var9++), this.method13496() + 140 + 10, 114, 140, ClassicDecryption.agora));
      this.method13230(this.field21187 = new Class4254(this, "Exit", this.method13497(var9++), this.method13496() + 140 + 10, 114, 140, ClassicDecryption.exit));
      this.field21186.method13251((var1x, var2x) -> this.method13493(new Class1341(Minecraft.getInstance().currentScreen)));
      this.field21191.method13251((var1x, var2x) -> this.method13493(new Class1317(Minecraft.getInstance().currentScreen)));
      this.field21189.method13251((var1x, var2x) -> this.method13493(new Class1129(Minecraft.getInstance().currentScreen, Minecraft.getInstance().gameSettings)));
      this.field21190.method13251((var1x, var2x) -> this.method13494(new Class4317()));
      this.field21188
         .method13251(
            (var1x, var2x) -> this.method13493(
                  new Class1136(Minecraft.getInstance().currentScreen, Minecraft.getInstance().gameSettings, Minecraft.getInstance().getLanguageManager())
               )
         );
      this.field21187.method13251((var0, var1x) -> Minecraft.getInstance().shutdown());
   }

   public void method13493(Screen var1) {
      Minecraft.getInstance().displayGuiScreen(var1);
      this.method13495();
   }

   public void method13494(Class4307 var1) {
      Client.getInstance().getGuiManager().method33482(var1);
      this.method13495();
   }

   public void method13495() {
      Minecraft.getInstance().getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(Sounds.field27176, 1.0F));
   }

   private int method13496() {
      return 150;
   }

   private int method13497(int var1) {
      byte var4 = 122;
      short var5 = 140;
      byte var6 = 4;
      byte var7 = -6;
      int var8 = 122 * var6 + var6 * var7;
      if (var1 < var6) {
         return this.method13267() / 2 - var8 / 2 + var1 * 122 + var1 * var7 - 12;
      } else {
         var1 -= var6;
         var6 = 3;
         var7 = 6;
         var8 = 122 * var6 + var6 * var7;
         return this.method13267() / 2 - var8 / 2 + var1 * 122 + var1 * var7 - 12;
      }
   }

   @Override
   public void method13027(float var1) {
      this.method13225();
      Class3192.method11455((float)(this.field20895 + (this.method13267() - 300) / 2), (float)(this.field20896 + 30), 300.0F, 97.0F, ClassicDecryption.big);
      super.method13027(var1);
   }
}
