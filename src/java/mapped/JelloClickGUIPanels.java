package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class JelloClickGUIPanels extends Class4304 {
   public final ModuleCategory category;
   public ModListViewPanel modListView;
   public float field21195;
   public int field21197;
   public int yP;
   private int field21199;
   private final List<Class9476> field21200 = new ArrayList<>();

   public JelloClickGUIPanels(IconPanel var1, String var2, int var3, int var4, ModuleCategory category) {
      super(var1, var2, var3, var4, 200, 350, true);
      this.setWidth(200);
      this.setHeight(350);
      this.field20886 = true;
      this.category = category;
      this.method13505();
   }

   public void method13504() {
      this.method13222(() -> {
         this.method13236(this.modListView);
         this.addToList(this.modListView = new ModListViewPanel(this, "modListView", 0, 60, this.getWidth(), this.getHeight() - 60, this.category));
      });
   }

   private void method13505() {
      this.addToList(this.modListView = new ModListViewPanel(this, "modListView", 0, 60, this.getWidth(), this.getHeight() - 60, this.category));
      this.modListView.method13261(new Class6666());
      this.modListView.method13261((var0, var1) -> {
         var0.setY(60);
         var0.setHeight(var1.getHeight() - 60);
      });
   }

   @Override
   public void method13028(int var1, int var2) {
      if (!(this.field21195 >= 1.0F)) {
         this.method13215(false);
         this.field20909 = false;
      } else {
         this.field21197 = this.getX();
         this.yP = this.getY();
         this.method13215(true);
      }

      int wh = (int)(200.0F + 140.0F * (1.0F - this.field21195));
      int hi = (int)(320.0F + 320.0F * 0.1F * (1.0F - this.field21195));
      int y = this.yP;
      int x = (int)((float)this.field21197 - ((float)wh - 200.0F) / 2.0F + 0.5F);
      if (this.field21195 < 1.0F) {
         if (x < 0) {
            x = 0;
         }

         if (x + wh > this.iconPanel.getWidth()) {
            x = this.iconPanel.getWidth() - wh;
         }

         if (y + hi > this.iconPanel.getHeight()) {
            y = this.iconPanel.getHeight() - hi;
         }
      }

      this.setWidth(wh);
      this.setHeight(hi);
      this.setX(x);
      this.setY(y);
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      super.method13224();
      super.method13225();
      int var4 = (int)(1.0F + 10.0F * (1.0F - this.field21195));
      RenderUtil.drawRoundedRect(
         (float)(this.getX() + (var4 - 1)),
         (float)(this.getY() + (var4 - 1)),
         (float)(this.getWidth() - (var4 - 1) * 2),
         (float)(this.getHeight() - (var4 - 1) * 2),
         (float)this.field21199 + (1.0F - this.field21195) * (float)var4,
         var1
      );
      RenderUtil.drawRect(
         (float)this.getX(),
         (float)this.getY(),
         (float)(this.getX() + this.getWidth()),
         (float)(this.getY() + 60),
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, Math.min(1.0F, var1 * 0.9F * this.field21195))
      );
      RenderUtil.method11424(
         (float)this.getX(),
         (float)this.getY() + 60.0F * this.field21195,
         (float)this.getWidth(),
         (float)this.getHeight() - 60.0F * this.field21195,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
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
         (float)(this.getX() + 20),
         (float)(this.getY() + 30),
         categoryName,
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1 * 0.5F * this.field21195),
         Class2218.field14488,
         Class2218.field14492
      );
      GL11.glPushMatrix();
      super.draw(var1 * var1);
      GL11.glPopMatrix();
      if (this.modListView.method13513() > 0) {
         RenderUtil.method11449(
            (float)this.getX(),
            (float)(this.getY() + 60),
            (float)this.getWidth(),
            18.0F,
            ResourcesDecrypter.shadowBottomPNG,
            ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * this.field21195 * 0.5F)
         );
      }
   }

   public ModuleCategory getCategory() {
      return this.category;
   }

   public final void method13507(Class9476 var1) {
      this.field21200.add(var1);
   }

   public final void showSettingGUI(Module module) {
      for (Class9476 var5 : this.field21200) {
         var5.showSettingGUI(module);
      }
   }
}
