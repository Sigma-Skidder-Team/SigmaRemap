package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.vector.Vector3i;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Class4276 extends Class4247 {
   private List<ButtonPanel> field20723 = new ArrayList<ButtonPanel>();
   private final Date field20724;
   private boolean field20725 = false;
   private Date field20726;
   public Vector3i field20727;
   public UIInput field20728;
   public UIInput field20729;
   public Class4356 field20730;
   private final List<Class9073> field20731 = new ArrayList<Class9073>();

   public Class4276(IconPanel var1, String var2, int var3, int var4, Vector3i var5) {
      super(var1, var2, var3 - 107, var4 + 10, 214, 170, ColorHelper.field27961, "", false);
      this.field20727 = var5;
      if (this.yA + this.heightA <= Minecraft.getInstance().mainWindow.getHeight()) {
         this.yA += 10;
      } else {
         this.yA = this.yA - (this.heightA + 27);
         this.field20725 = true;
      }

      this.field20724 = new Date();
      this.method13292(true);
      this.method13300(false);
      UIButton var8;
      this.addToList(
         var8 = new UIButton(
            this,
            "addButton",
            this.widthA - 66,
            this.heightA - 60,
            ResourceRegistry.JelloLightFont25.method23942("Add"),
            50,
            ColorHelper.field27961,
            "Add",
            ResourceRegistry.JelloLightFont25
         )
      );
      var8.doThis((var1x, var2x) -> this.method13132(this.field20729.method13303(), this.method13130(), this.field20730.field21296));
      this.addToList(this.field20729 = new UIInput(this, "Name", 20, 7, this.widthA - 40, 60, UIInput.field20741, "My waypoint", "My waypoint"));
      this.field20729.method13148();
      this.field20729.method13156(false);
      this.addToList(this.field20730 = new Class4356(this, "badgeSelect", 0, 86));
      this.addToList(
         this.field20728 = new UIInput(
            this,
            "Cords",
            20,
            this.heightA - 44,
            this.widthA - 100,
            20,
            UIInput.field20741,
            var5.getX() + " " + var5.getZ(),
            var5.getX() + " " + var5.getZ()
         )
      );
      this.field20728.method13156(false);
      this.field20728.setFont(ResourceRegistry.JelloLightFont18);
   }

   public Vector3i method13130() {
      if (this.field20728.method13303() != null && this.field20728.method13303().contains(" ")) {
         String[] var3 = this.field20728.method13303().split(" ");
         if (var3.length == 2 && var3[0].matches("-?\\d+") && var3[1].matches("-?\\d+")) {
            int var4 = Integer.valueOf(var3[0]);
            int var5 = Integer.valueOf(var3[1]);
            return new Vector3i(var4, 0, var5);
         }
      }

      return this.field20727;
   }

   @Override
   public void draw(float var1) {
      var1 = Animation.method25321(this.field20724, this.field20726, 250.0F, 120.0F);
      float var4 = EasingFunctions.easeOutBack(var1, 0.0F, 1.0F, 1.0F);
      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      this.method13284((int)((float)this.widthA * 0.2F * (1.0F - var4)) * (!this.field20725 ? 1 : -1));
      super.method13224();
      byte var5 = 10;
      int var6 = ColorUtils.applyAlpha(-723724, QuadraticEasing.easeOutQuad(var1, 0.0F, 1.0F, 1.0F));
      RenderUtil.drawRoundedRect(
         (float)(this.xA + var5 / 2),
         (float)(this.yA + var5 / 2),
         (float)(this.widthA - var5),
         (float)(this.heightA - var5),
         35.0F,
         var1
      );
      RenderUtil.drawRect(
         (float)(this.xA + var5 / 2),
         (float)(this.yA + var5 / 2),
         (float)(this.xA - var5 / 2 + this.widthA),
         (float)(this.yA - var5 / 2 + this.heightA),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1 * 0.25F)
      );
      RenderUtil.drawRect((float)this.xA, (float)this.yA, (float)this.widthA, (float)this.heightA, (float)var5, var6);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.xA, (float)this.yA, 0.0F);
      GL11.glRotatef(!this.field20725 ? -90.0F : 90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.xA), (float)(-this.yA), 0.0F);
      RenderUtil.drawImage(
         (float)(this.xA + (!this.field20725 ? 0 : this.heightA)),
         (float)this.yA + (float)((this.widthA - 47) / 2) * (!this.field20725 ? 1.0F : -1.58F),
         18.0F,
         47.0F,
         ResourcesDecrypter.selectPNG,
         var6
      );
      GL11.glPopMatrix();
      RenderUtil.drawRect(
         (float)(this.xA + 25),
         (float)(this.yA + 68),
         (float)(this.xA + this.widthA - 25),
         (float)(this.yA + 69),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.05F * var1)
      );
      super.draw(var1);
   }

   public final void method13131(Class9073 var1) {
      this.field20731.add(var1);
   }

   public final void method13132(String var1, Vector3i var2, int var3) {
      for (Class9073 var7 : this.field20731) {
         var7.method33814(this, var1, var2, var3);
      }
   }
}
