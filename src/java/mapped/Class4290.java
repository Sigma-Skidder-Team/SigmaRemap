package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

import java.util.ArrayList;
import java.util.List;

public class Class4290 extends Class4278 {
   private static String[] field20786;
   public float field20787 = 0.0F;
   public Class2059 field20788 = Class2059.field13418;
   public final int field20789 = 0;
   public final List<Class4240> field20790 = new ArrayList<Class4240>();
   private Texture field20791;

   public Class4290(Class4305 var1, String var2) {
      super(var1, var2, 0, Minecraft.getInstance().mainWindow.method8044() - 70, Minecraft.getInstance().mainWindow.method8043(), 110, false);
      this.method13292(true);
      this.method13300(false);
   }

   public float method13159() {
      return 1.0F - this.field20787;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      int var5 = 20;
      if (this.field20788 == Class2059.field13418
         && Math.abs(Minecraft.getInstance().mainWindow.method8044() - var2) < var5
         && !this.field20892.method13239(((Class4308)this.field20892).field20940)) {
         this.field20788 = Class2059.field13416;
      }

      float var6 = 0.05F;
      this.field20787 = this.field20787 + (this.field20788 != Class2059.field13416 ? (this.field20788 != Class2059.field13417 ? 0.0F : -var6) : var6);
      if (!(this.field20787 >= 1.0F)) {
         if (this.field20787 <= 0.0F) {
            this.field20787 = 0.0F;
            this.field20788 = Class2059.field13418;
         }
      } else {
         this.field20787 = 1.0F;
         this.field20788 = Class2059.field13418;
      }

      if (Minecraft.getInstance().mainWindow.method8044() - var2 > this.method13269()) {
         this.field20788 = Class2059.field13417;
      }

      float var7 = Class9747.method38214(this.field20787, 0.0F, 1.0F, 1.0F);
      if (this.field20788 == Class2059.field13417) {
         var7 = Class9747.method38212(this.field20787, 0.0F, 1.0F, 1.0F);
      }

      this.method13266(Minecraft.getInstance().mainWindow.method8044() - (int)((float)this.method13269() * var7));
   }

   @Override
   public void method13027(float var1) {
      int var4 = 20;
      if (!((double)var1 < 0.6)) {
         RenderUtil.method11465(
            this.field20895 + var4,
            this.field20896 + var4,
            this.field20897 - var4 * 2,
            this.field20898 - var4 * 2,
            Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.9F * var1)
         );
         super.method13027(var1);
      }
   }
}
