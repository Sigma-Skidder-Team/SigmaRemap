package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Class4276 extends Class4247 {
   private List<Class4240> field20723 = new ArrayList<Class4240>();
   private final Date field20724;
   private boolean field20725 = false;
   private Date field20726;
   public Class1998 field20727;
   public Class4281 field20728;
   public Class4281 field20729;
   public Class4356 field20730;
   private final List<Class9073> field20731 = new ArrayList<Class9073>();

   public Class4276(Class4305 var1, String var2, int var3, int var4, Class1998 var5) {
      super(var1, var2, var3 - 107, var4 + 10, 214, 170, Class6387.field27961, "", false);
      this.field20727 = var5;
      if (this.field20896 + this.field20898 <= Minecraft.getInstance().mainWindow.getHeight()) {
         this.field20896 += 10;
      } else {
         this.field20896 = this.field20896 - (this.field20898 + 27);
         this.field20725 = true;
      }

      this.field20724 = new Date();
      this.method13292(true);
      this.method13300(false);
      Class4274 var8;
      this.method13230(
         var8 = new Class4274(
            this,
            "addButton",
            this.field20897 - 66,
            this.field20898 - 60,
            ResourceRegistry.JelloLightFont25.method23942("Add"),
            50,
            Class6387.field27961,
            "Add",
            ResourceRegistry.JelloLightFont25
         )
      );
      var8.method13251((var1x, var2x) -> this.method13132(this.field20729.method13303(), this.method13130(), this.field20730.field21296));
      this.method13230(this.field20729 = new Class4281(this, "Name", 20, 7, this.field20897 - 40, 60, Class4281.field20741, "My waypoint", "My waypoint"));
      this.field20729.method13148();
      this.field20729.method13156(false);
      this.method13230(this.field20730 = new Class4356(this, "badgeSelect", 0, 86));
      this.method13230(
         this.field20728 = new Class4281(
            this,
            "Cords",
            20,
            this.field20898 - 44,
            this.field20897 - 100,
            20,
            Class4281.field20741,
            var5.getX() + " " + var5.getZ(),
            var5.getX() + " " + var5.getZ()
         )
      );
      this.field20728.method13156(false);
      this.field20728.method13306(ResourceRegistry.JelloLightFont18);
   }

   public Class1998 method13130() {
      if (this.field20728.method13303() != null && this.field20728.method13303().contains(" ")) {
         String[] var3 = this.field20728.method13303().split(" ");
         if (var3.length == 2 && var3[0].matches("-?\\d+") && var3[1].matches("-?\\d+")) {
            int var4 = Integer.valueOf(var3[0]);
            int var5 = Integer.valueOf(var3[1]);
            return new Class1998(var4, 0, var5);
         }
      }

      return this.field20727;
   }

   @Override
   public void method13027(float var1) {
      var1 = Animation.method25321(this.field20724, this.field20726, 250.0F, 120.0F);
      float var4 = Class9747.method38214(var1, 0.0F, 1.0F, 1.0F);
      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      this.method13284((int)((float)this.field20897 * 0.2F * (1.0F - var4)) * (!this.field20725 ? 1 : -1));
      super.method13224();
      byte var5 = 10;
      int var6 = Class5628.method17688(-723724, Class9782.method38557(var1, 0.0F, 1.0F, 1.0F));
      RenderUtil.method11463(
         (float)(this.field20895 + var5 / 2),
         (float)(this.field20896 + var5 / 2),
         (float)(this.field20897 - var5),
         (float)(this.field20898 - var5),
         35.0F,
         var1
      );
      RenderUtil.method11426(
         (float)(this.field20895 + var5 / 2),
         (float)(this.field20896 + var5 / 2),
         (float)(this.field20895 - var5 / 2 + this.field20897),
         (float)(this.field20896 - var5 / 2 + this.field20898),
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, var1 * 0.25F)
      );
      RenderUtil.method11475((float)this.field20895, (float)this.field20896, (float)this.field20897, (float)this.field20898, (float)var5, var6);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.field20895, (float)this.field20896, 0.0F);
      GL11.glRotatef(!this.field20725 ? -90.0F : 90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.field20895), (float)(-this.field20896), 0.0F);
      RenderUtil.method11449(
         (float)(this.field20895 + (!this.field20725 ? 0 : this.field20898)),
         (float)this.field20896 + (float)((this.field20897 - 47) / 2) * (!this.field20725 ? 1.0F : -1.58F),
         18.0F,
         47.0F,
         ResourcesDecrypter.selectPNG,
         var6
      );
      GL11.glPopMatrix();
      RenderUtil.method11426(
         (float)(this.field20895 + 25),
         (float)(this.field20896 + 68),
         (float)(this.field20895 + this.field20897 - 25),
         (float)(this.field20896 + 69),
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.05F * var1)
      );
      super.method13027(var1);
   }

   public final void method13131(Class9073 var1) {
      this.field20731.add(var1);
   }

   public final void method13132(String var1, Class1998 var2, int var3) {
      for (Class9073 var7 : this.field20731) {
         var7.method33814(this, var1, var2, var3);
      }
   }
}
