package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class Class7229 implements Class7222 {
   private static String[] field31069;
   private final GameProfile field31070;
   private final ResourceLocation field31071;
   private final StringTextComponent field31072;

   public Class7229(GameProfile var1) {
      this.field31070 = var1;
      Minecraft var4 = Minecraft.getInstance();
      Map var5 = var4.getSkinManager().method38347(var1);
      if (!var5.containsKey(Type.SKIN)) {
         this.field31071 = Class7209.method22637(PlayerEntity.method2960(var1));
      } else {
         this.field31071 = var4.getSkinManager().method38344((MinecraftProfileTexture)var5.get(Type.SKIN), Type.SKIN);
      }

      this.field31072 = new StringTextComponent(var1.getName());
   }

   @Override
   public void method22697(Class8036 var1) {
      Minecraft.getInstance().getConnection().sendPacket(new CSpectatePacket(this.field31070.getId()));
   }

   @Override
   public ITextComponent method22698() {
      return this.field31072;
   }

   @Override
   public void method22699(MatrixStack var1, float var2, int var3) {
      Minecraft.getInstance().getTextureManager().bindTexture(this.field31071);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, (float)var3 / 255.0F);
      AbstractGui.method5698(var1, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
      AbstractGui.method5698(var1, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
   }

   @Override
   public boolean method22700() {
      return true;
   }
}
