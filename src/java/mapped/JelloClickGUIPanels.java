package mapped;

import com.mentalfrostbyte.jello.gui.AnimatedIconPanel;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class JelloClickGUIPanels extends AnimatedIconPanel {
   public final ModuleCategory category;
   public Class4341 field21194;
   public float field21195;
   public int field21197;
   public int field21198;
   private int field21199;
   private final List<Class9476> field21200 = new ArrayList<>();

   public JelloClickGUIPanels(CustomGuiScreen var1, String var2, int var3, int var4, ModuleCategory category) {
      super(var1, var2, var3, var4, 200, 350, true);
      this.setWidthA(200);
      this.setHeightA(350);
      this.field20886 = true;
      this.category = category;
      this.method13505();
   }

   public void method13504() {
      this.method13222(() -> {
         this.method13236(this.field21194);
         this.addToList(this.field21194 = new Class4341(this, "modListView", 0, 60, this.getWidthA(), this.getHeightA() - 60, this.category));
      });
   }

   private void method13505() {
      this.addToList(this.field21194 = new Class4341(this, "modListView", 0, 60, this.getWidthA(), this.getHeightA() - 60, this.category));
      this.field21194.setSize(new Class6666());
      this.field21194.setSize((var0, var1) -> {
         var0.setYA(60);
         var0.setHeightA(var1.getHeightA() - 60);
      });
   }

   @Override
   public void method13028(int var1, int var2) {
      if (!(this.field21195 >= 1.0F)) {
         this.method13215(false);
         this.field20909 = false;
      } else {
         this.field21197 = this.getXA();
         this.field21198 = this.getYA();
         this.method13215(true);
      }

      float var5 = 200.0F;
      float var6 = 320.0F;
      float var7 = 0.7F;
      float var8 = 0.1F;
      int var9 = (int)(200.0F + 140.0F * (1.0F - this.field21195));
      int var10 = (int)(320.0F + 320.0F * 0.1F * (1.0F - this.field21195));
      int var11 = this.field21198;
      int var12 = (int)((float)this.field21197 - ((float)var9 - 200.0F) / 2.0F + 0.5F);
      if (this.field21195 < 1.0F) {
         if (var12 < 0) {
            var12 = 0;
         }

         if (var12 + var9 > this.icoPanel.getWidthA()) {
            var12 = this.icoPanel.getWidthA() - var9;
         }

         if (var11 + var10 > this.icoPanel.getHeightA()) {
            var11 = this.icoPanel.getHeightA() - var10;
         }
      }

      this.setWidthA(var9);
      this.setHeightA(var10);
      this.setXA(var12);
      this.setYA(var11);
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      super.method13224();
      super.method13225();
      int var4 = (int)(1.0F + 10.0F * (1.0F - this.field21195));
      RenderUtil.drawRoundedRect(
         (float)(this.getXA() + (var4 - 1)),
         (float)(this.getYA() + (var4 - 1)),
         (float)(this.getWidthA() - (var4 - 1) * 2),
         (float)(this.getHeightA() - (var4 - 1) * 2),
         (float)this.field21199 + (1.0F - this.field21195) * (float)var4,
         var1
      );
      RenderUtil.drawRect(
         (float)this.getXA(),
         (float)this.getYA(),
         (float)(this.getXA() + this.getWidthA()),
         (float)(this.getYA() + 60),
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, Math.min(1.0F, var1 * 0.9F * this.field21195))
      );
      RenderUtil.renderBackgroundBox(
         (float)this.getXA(),
         (float)this.getYA() + 60.0F * this.field21195,
         (float)this.getWidthA(),
         (float)this.getHeightA() - 60.0F * this.field21195,
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, var1)
      );
      if (!(this.field21195 > 0.8F)) {
         if (this.field21195 < 0.2F) {
            this.field21199 = 30;
         }
      } else {
         this.field21199 = 20;
      }

      String categoryName = this.getCategory().getName();
      RenderUtil.method11440(
         ResourceRegistry.JelloLightFont25,
         (float)(this.getXA() + 20),
         (float)(this.getYA() + 30),
         categoryName,
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.color, var1 * 0.5F * this.field21195),
         Class2218.field14488,
         Class2218.field14492
      );
      GL11.glPushMatrix();
      super.draw(var1 * var1);
      GL11.glPopMatrix();
      if (this.field21194.method13513() > 0) {
         RenderUtil.drawImage(
            (float)this.getXA(),
            (float)(this.getYA() + 60),
            (float)this.getWidthA(),
            18.0F,
            ResourceList.shadowBottomPNG,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, var1 * this.field21195 * 0.5F)
         );
      }
   }

   public ModuleCategory getCategory() {
      return this.category;
   }

   public final void method13507(Class9476 var1) {
      this.field21200.add(var1);
   }

   public final void method13508(Module var1) {
      for (Class9476 var5 : this.field21200) {
         var5.method36568(var1);
      }
   }
}
