package mapped;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.ClientBossInfo;
import net.minecraft.network.play.server.SUpdateBossInfoPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;

import java.util.Map;
import java.util.UUID;

public class Class1267 extends AbstractGui {
   private static final ResourceLocation field6708 = new ResourceLocation("textures/gui/bars.png");
   private final Minecraft field6709;
   private final Map<UUID, ClientBossInfo> field6710 = Maps.newLinkedHashMap();

   public Class1267(Minecraft var1) {
      this.field6709 = var1;
   }

   public void method5953(MatrixStack var1) {
      if (!this.field6710.isEmpty()) {
         int var4 = this.field6709.getMainWindow().getScaledWidth();
         int var5 = 12;

         for (ClientBossInfo var7 : this.field6710.values()) {
            int var8 = var4 / 2 - 91;
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.field6709.getTextureManager().bindTexture(field6708);
            this.method5954(var1, var8, var5, var7);
            ITextComponent var9 = var7.getName();
            int var10 = this.field6709.fontRenderer.method38821(var9);
            int var11 = var4 / 2 - var10 / 2;
            int var12 = var5 - 9;
            this.field6709.fontRenderer.method38803(var1, var9, (float)var11, (float)var12, 16777215);
            var5 += 19;
            if (var5 >= this.field6709.getMainWindow().getScaledHeight() / 3) {
               break;
            }
         }
      }
   }

   private void method5954(MatrixStack var1, int var2, int var3, BossInfo var4) {
      this.blit(var1, var2, var3, 0, var4.getColor().ordinal() * 5 * 2, 182, 5);
      if (var4.getOverlay() != BossInfo.Overlay.PROGRESS) {
         this.blit(var1, var2, var3, 0, 80 + (var4.getOverlay().ordinal() - 1) * 5 * 2, 182, 5);
      }

      int var7 = (int)(var4.getPercent() * 183.0F);
      if (var7 > 0) {
         this.blit(var1, var2, var3, 0, var4.getColor().ordinal() * 5 * 2 + 5, var7, 5);
         if (var4.getOverlay() != BossInfo.Overlay.PROGRESS) {
            this.blit(var1, var2, var3, 0, 80 + (var4.getOverlay().ordinal() - 1) * 5 * 2 + 5, var7, 5);
         }
      }
   }

   public void method5955(SUpdateBossInfoPacket var1) {
      if (var1.getOperation() != SUpdateBossInfoPacket.Operation.ADD) {
         if (var1.getOperation() != SUpdateBossInfoPacket.Operation.REMOVE) {
            if (this.field6710.get(var1.getUniqueID()) != null) {
               this.field6710.get(var1.getUniqueID()).updateFromPacket(var1);
            }
         } else {
            this.field6710.remove(var1.getUniqueID());
         }
      } else {
         this.field6710.put(var1.getUniqueID(), new ClientBossInfo(var1));
      }
   }

   public void method5956() {
      this.field6710.clear();
   }

   public boolean shouldPlayEndBossMusic() {
      if (!this.field6710.isEmpty()) {
         for (BossInfo var4 : this.field6710.values()) {
            if (var4.shouldPlayEndBossMusic()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method5958() {
      if (!this.field6710.isEmpty()) {
         for (BossInfo var4 : this.field6710.values()) {
            if (var4.shouldDarkenSky()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method5959() {
      if (!this.field6710.isEmpty()) {
         for (BossInfo var4 : this.field6710.values()) {
            if (var4.shouldCreateFog()) {
               return true;
            }
         }
      }

      return false;
   }
}
