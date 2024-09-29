package mapped;

import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.TextureUtil;
import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.network.play.server.SPlayerListItemPacket;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.io.IOException;
import java.util.UUID;

public class Class4298 extends Class4278 {
   public static ColorHelper field20821 = new ColorHelper(
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      Class2218.field14488,
      Class2218.field14492
   );
   public String field20822 = null;
   private AbstractClientPlayerEntity field20823;
   private Minecraft field20824 = Minecraft.getInstance();
   private static ClientWorld field20825;
   public Account account;
   private DynamicTexture field20827;
   private Class1118 field20828;

   public Class4298(IconPanel var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, field20821, false);
      this.field20822 = var7;
   }

   public IProfiler method13180() {
      Class7991 var3 = new Class7991(this);
      return new Class7168(() -> 0L, var3, false);
   }

   @Override
   public void draw(float var1) {
      if (this.account != null) {
         GL11.glEnable(2929);
         Class7516.method24498();
         RenderSystem.disableDepthTest();
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(this.xA + this.widthA / 2), (float)(this.yA - this.heightA / 4), -200.0F);
         GL11.glColor3f(1.0F, 1.0F, 1.0F);
         RenderSystem.method27883(180.0F, 1.0F, 0.0F, 0.0F);
         RenderSystem.method27883(180.0F, 0.0F, 0.0F, 1.0F);
         float var4 = (float)(this.field20824.mainWindow.getHeight() - this.method13310() - this.field20824.mainWindow.getHeight() / 2);
         float var5 = (float)(this.field20824.mainWindow.getWidth() - this.method13309() - this.field20824.mainWindow.getWidth() / 2);
         float var6 = (float)Math.atan((double)(var4 / (float)(this.field20824.mainWindow.getHeight() / 2))) * 20.0F;
         float var7 = (float)Math.atan((double)(var5 / (float)(this.field20824.mainWindow.getWidth() / 2))) * 20.0F;
         RenderSystem.method27883(-var6, 1.0F, 0.0F, 0.0F);
         RenderSystem.method27883(-var7, 0.0F, 1.0F, 0.0F);
         UUID var8 = UUID.fromString(this.account.getKnownUUID().equals("steve") ? "123e4567-e89b-12d3-a456-556642440000" : this.account.getKnownUUID());
         if (field20825 == null) {
            Class6606 var9 = new Class6606(Difficulty.NORMAL, false, false);
            field20825 = new ClientWorld(this.field20824.getConnection(), var9, World.OVERWORLD, DimensionType.OVERWORLD_TYPE, 1, this::method13180, null, false, 0L);
         }

         GameProfile var20 = new GameProfile(var8, this.account.getKnownName());
         if (this.field20828 == null || !this.field20828.getDisplayName().getString().equals(this.account.getKnownName())) {
            this.field20828 = new Class1118(field20825, new GameProfile(var8, this.account.getKnownName()));
            this.field20828.field6096 = new Class6589(new SPlayerListItemPacket.AddPlayerData(var20, 0, GameType.field11103, this.field20828.getDisplayName()));
         }

         this.field20828.setUniqueId(var8);
         float var10 = (float)(System.currentTimeMillis() % 1750L) / 278.52115F;
         var10 = (float)Math.sin((double)var10);
         float var11 = (float)(System.currentTimeMillis() % 14000L) / 2228.1692F;
         var11 = (float)Math.sin((double)var11);
         float var12 = (float)(System.currentTimeMillis() % 30000L) / 4774.648F;
         var12 = (float)Math.sin((double)var12);
         new PlayerModel(0.0F, false);
         new PlayerRenderer(this.field20824.getRenderManager());
         Class7735 var15 = Minecraft.getInstance().getRenderTypeBuffers().method26536();
         new MatrixStack();
         RenderSystem.pushMatrix();
         this.field20824.getRenderManager().method32215(false);
         Class7516.method24503();
         RenderSystem.method27820();
         RenderSystem.enableDepthTest();
         GL11.glLightModelfv(2899, new float[]{0.7F, 0.7F, 0.7F, 1.0F});
         if (this.field20824.getRenderManager().info == null) {
            this.field20824.getRenderManager().info = new ActiveRenderInfo();
         }

         this.field20828.field4960 = var10 * 0.5F;
         InventoryScreen.drawEntityOnScreen(0, 390, 160, 0.0F, 0.0F, this.field20828);
         this.field20824.getRenderManager().method32215(true);
         RenderSystem.popMatrix();
         RenderSystem.popMatrix();
         Class7516.method24499();
         RenderSystem.method27868();
         RenderSystem.method27860(33985);
         RenderSystem.disableTexture();
         RenderSystem.method27860(33984);
         GL11.glDisable(2929);
         if (this.account.method34228() != null) {
            Object var17 = null;

            try {
               var17 = TextureUtil.method32933("sf", this.account.method34228());
            } catch (IOException var19) {
               var19.printStackTrace();
            }
         }
      }
   }

   public void method13181(Account var1) {
      this.account = var1;
      this.field20827 = null;
   }
}
