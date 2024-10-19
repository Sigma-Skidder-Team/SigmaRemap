package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ServerSelectionList;
import net.minecraft.util.Util;

public class Class1159 extends ServerSelectionList.Entry {
   private final Minecraft field6310 = Minecraft.getInstance();

   @Override
   public void render(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      int var13 = var3 + var6 / 2 - 4;
      this.field6310
         .fontRenderer
         .func_243248_b(
            var1,
            ServerSelectionList.getfield_214358_b(),
            (float)(this.field6310.currentScreen.width / 2 - this.field6310.fontRenderer.method38821(ServerSelectionList.getfield_214358_b()) / 2),
            (float)var13,
            16777215
         );
      String var14;
      switch ((int)(Util.milliTime() / 300L % 4L)) {
         case 0:
         default:
            var14 = "O o o";
            break;
         case 1:
         case 3:
            var14 = "o O o";
            break;
         case 2:
            var14 = "o o O";
      }

      this.field6310
         .fontRenderer
         .method38801(
            var1, var14, (float)(this.field6310.currentScreen.width / 2 - this.field6310.fontRenderer.getStringWidth(var14) / 2), (float)(var13 + 9), 8421504
         );
   }
}
