package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.network.play.server.SUpdateBossInfoPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import java.util.Map;
import java.util.UUID;

public class Class1267 extends AbstractGui {
   private static final ResourceLocation field6708 = new ResourceLocation("textures/gui/bars.png");
   private final Minecraft field6709;
   private final Map<UUID, Class3626> field6710 = Maps.newLinkedHashMap();

   public Class1267(Minecraft var1) {
      this.field6709 = var1;
   }

   public void method5953(MatrixStack var1) {
      if (!this.field6710.isEmpty()) {
         int var4 = this.field6709.getMainWindow().getScaledWidth();
         byte var5 = 12;

         for (Class3626 var7 : this.field6710.values()) {
            int var8 = var4 / 2 - 91;
            RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
            this.field6709.getTextureManager().bindTexture(field6708);
            this.method5954(var1, var8, var5, var7);
            ITextComponent var9 = var7.method12290();
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

   private void method5954(MatrixStack var1, int var2, int var3, Class3625 var4) {
      this.method5696(var1, var2, var3, 0, var4.method12292().ordinal() * 5 * 2, 182, 5);
      if (var4.method12293() != Class2300.field15703) {
         this.method5696(var1, var2, var3, 0, 80 + (var4.method12293().ordinal() - 1) * 5 * 2, 182, 5);
      }

      int var7 = (int)(var4.method12291() * 183.0F);
      if (var7 > 0) {
         this.method5696(var1, var2, var3, 0, var4.method12292().ordinal() * 5 * 2 + 5, var7, 5);
         if (var4.method12293() != Class2300.field15703) {
            this.method5696(var1, var2, var3, 0, 80 + (var4.method12293().ordinal() - 1) * 5 * 2 + 5, var7, 5);
         }
      }
   }

   public void method5955(SUpdateBossInfoPacket var1) {
      if (var1.method17206() != Class2151.field14064) {
         if (var1.method17206() != Class2151.field14065) {
            if (this.field6710.get(var1.method17205()) != null) {
               this.field6710.get(var1.method17205()).method12297(var1);
            }
         } else {
            this.field6710.remove(var1.method17205());
         }
      } else {
         this.field6710.put(var1.method17205(), new Class3626(var1));
      }
   }

   public void method5956() {
      this.field6710.clear();
   }

   public boolean shouldPlayEndBossMusic() {
      if (!this.field6710.isEmpty()) {
         for (Class3625 var4 : this.field6710.values()) {
            if (var4.method12295()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method5958() {
      if (!this.field6710.isEmpty()) {
         for (Class3625 var4 : this.field6710.values()) {
            if (var4.method12294()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method5959() {
      if (!this.field6710.isEmpty()) {
         for (Class3625 var4 : this.field6710.values()) {
            if (var4.method12296()) {
               return true;
            }
         }
      }

      return false;
   }
}
