package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.Class4321;

public class Class4335 extends Class4333 {
   public Class4345 field21181;
   public int field21182 = 0;

   public Class4335(IconPanel var1, String var2, int var3, int var4, ModuleCategory[] var5) {
      super(var1, var2, var3 - 296, var4 - 346, 592, 692);

      for (Module var9 : Client.getInstance().getModuleManager().getModuleMap().values()) {
         if (var9.method16006()) {
            for (ModuleCategory var13 : var5) {
               if (var9.getAdjustedCategoryBasedOnClientMode().equals(var13)) {
                  this.method13485(var9);
               }
            }
         }
      }

      Class4361 var14;
      this.addToList(var14 = new Class4361(this, "exit", this.method13267() - 47, 18));
      var14.doThis((var1x, var2x) -> {
         if (this.field21181 == null) {
            ((Class4321)this.method13258()).method13417();
         } else {
            this.field21181.method13556();
         }
      });
      this.method13300(false);
   }

   private void method13485(Module var1) {
      int var4 = this.field21182 % 3;
      int var5 = (int)Math.floor((double)((float)this.field21182 / 3.0F));
      short var6 = 170;
      byte var7 = 80;
      this.addToList(new Class4368(this, var1.getName(), 40 + var6 * var4, 72 + var7 * var5, var6, var7, var1));
      this.field21182++;
   }

   public void method13486(Module var1) {
      this.method13222(() -> {
         if (this.field21181 == null) {
            this.addToList(this.field21181 = new Class4345(this, "settings", 5, 70, this.method13267() - 10, this.method13269() - 75, var1));
            this.field21181.method13292(true);
         }
      });
   }

   @Override
   public void draw(float var1) {
      super.draw(var1);
      if (this.field21181 == null) {
         for (IconPanel var5 : this.method13241()) {
            if (var5 instanceof Class4368 && this.field21149.calcPercent() == 1.0F && var5.method13114(this.method13309(), this.method13310())) {
               Class4368 var6 = (Class4368)var5;
               RenderUtil.drawString(ClassicDecryption.regular17, 20.0F, (float)(this.method13269() - 26), var6.field21351.getDescription(), -14540254);
               RenderUtil.method11419(5.0F, (float)(this.method13269() - 27), 12.0F, 24.0F);
               RenderUtil.method11455(5.0F, (float)(this.method13269() - 27), 24.0F, 24.0F, Class4334.field21177);
               RenderUtil.endScissor();
               break;
            }
         }
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.field21181 != null && this.field21181.method13557()) {
         this.method13222(() -> {
            this.method13236(this.field21181);
            this.field21181 = null;
         });
      }
   }
}
