package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class4271 extends Class4247 {
   public static final Class6387 field20697 = new Class6387(1250067, -15329770).method19410(ClientColors.DEEP_TEAL.getColor).method19414(Class2218.field14492);
   public List<Integer> field20698 = new ArrayList<Integer>();
   public List<Integer> field20699 = new ArrayList<Integer>();
   public boolean field20700;
   public boolean field20701;
   private float field20702;

   public Class4271(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String var7, List<Integer> var8) {
      super(var1, var2, var3, var4, var5, var6, field20697, var7, false);
      this.field20698 = var8;
      this.method13107();
   }

   private void method13107() {
      this.method13241().clear();
      this.field20913 = ResourceRegistry.JelloLightFont18;
      Class4240 var3;
      this.method13230(var3 = new Class4240(this, "dropdownButton", 0, 0, this.method13269(), this.method13269(), this.field20914));
      var3.method13261((var1, var2) -> {
         var1.method13264(0);
         var1.method13266(0);
         var1.method13268(this.method13267());
         var1.method13270(this.method13269());
      });
      var3.method13251((var1, var2) -> this.method13113(!this.method13112()));
      int var4 = this.field20897;
      int var5 = 0;

      for (int var7 : this.field20698) {
         Class4295 var8;
         this.method13230(
            var8 = new Class4295(this, var7 + "item", var5 % (this.field20897 / 50) * 50, this.field20898 + var5 / (this.field20897 / 50) * 50, 50, 50, var7)
         );
         var8.method13176(this.field20699.contains(this.field20698.indexOf(var7)));
         var8.method13251((var1, var2) -> this.method13037());
         var5++;
      }
   }

   private int method13108() {
      return (int)((float)(50 * (this.field20698.size() / (this.field20897 / 50)) + 1 + 50) * this.field20702 * this.field20702);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (!this.method13114(var1, var2) && this.method13112()) {
         this.field20701 = true;
      }

      if (this.field20701) {
         float var5 = 0.14F;
         this.field20702 = this.field20702 + (!this.method13112() ? 0.014F + 0.28F * (1.0F - this.field20702) : -0.014F - 0.14F * this.field20702);
         if (!(this.field20702 >= 1.0F)) {
            if (this.field20702 <= 0.0F) {
               this.field20702 = 0.0F;
               this.field20701 = false;
               this.field20700 = false;
            }
         } else {
            this.field20702 = 1.0F;
            this.field20701 = false;
            this.field20700 = true;
         }
      }
   }

   @Override
   public void method13027(float var1) {
      RenderUtil.method11426(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)(this.method13263() + this.method13267()),
         (float)(this.method13265() + this.method13269() + this.method13108()),
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      RenderUtil.method11463(
         (float)this.method13263(), (float)this.method13265(), (float)this.method13267(), (float)(this.method13269() + this.method13108()), 6.0F, var1 * 0.21F
      );
      if (this.method13303() != null) {
         RenderUtil.method11415(this);
         RenderUtil.method11439(
            this.method13305(),
            (float)(this.method13263() + 10),
            (float)(this.method13265() + (this.method13269() - this.method13305().method23952()) / 2 + 1),
            this.field20912,
            Class5628.method17688(this.field20914.method19405(), var1 * 0.7F)
         );
         RenderUtil.method11422();
      }

      RenderUtil.method11420(
         this.method13271(), this.method13272(), this.method13271() + this.method13267(), this.method13272() + this.method13269() + this.method13108()
      );
      GL11.glPushMatrix();
      if (this.field20702 > 0.0F) {
         super.method13027(var1);
      }

      GL11.glPopMatrix();
      RenderUtil.method11422();
      RenderUtil.method11428(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)(this.method13263() + this.method13267()),
         (float)(this.method13265() + this.method13269() + this.method13108()),
         Class5628.method17688(this.field20914.method19407(), var1 * 0.08F)
      );
      int var4 = this.method13267() - (int)((float)this.method13269() / 2.0F + 0.5F);
      int var5 = (int)((float)this.method13269() / 2.0F + 0.5F) + 1;
      int var6 = (int)((float)this.method13269() / 6.0F + 0.5F);
      GL11.glTranslatef((float)(this.method13263() + var4), (float)(this.method13265() + var5), 0.0F);
      GL11.glRotatef(90.0F * this.field20702, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.method13263() - var4), (float)(-this.method13265() - var5), 0.0F);
      RenderUtil.method11439(
         this.field20913,
         (float)(this.method13263() + var4 - 6),
         (float)(this.method13265() + var5 - 14),
         ">",
         Class5628.method17688(this.field20914.method19405(), var1 * 0.7F * (!this.method13114(this.method13309(), this.method13310()) ? 0.5F : 1.0F))
      );
   }

   public List<Integer> method13109() {
      return this.field20698;
   }

   public void method13110(Integer var1, int var2) {
      this.method13109().add(var2, var1);
      this.method13107();
   }

   public void method13111(Integer var1) {
      this.method13110(var1, this.field20698.size());
   }

   public boolean method13112() {
      return this.field20700;
   }

   public void method13113(boolean var1) {
      if (var1 != this.field20700) {
         this.field20701 = true;
      }
   }

   @Override
   public boolean method13114(int var1, int var2) {
      var1 -= this.method13271();
      var2 -= this.method13272();
      return var1 >= 0 && var1 <= this.method13267() && var2 >= 0 && var2 <= this.method13269() + this.method13108();
   }
}
