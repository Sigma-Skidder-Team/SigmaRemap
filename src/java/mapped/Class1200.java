package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;

public abstract class Class1200 extends Class1197 {
   public Class1200(int var1, int var2, int var3, int var4, ITextComponent var5) {
      super(var1, var2, var3, var4, var5);
   }

   public abstract void method5759();

   @Override
   public void method5732(double var1, double var3) {
      this.method5759();
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (!this.field6482 || !this.field6483) {
         return false;
      } else if (var1 != 257 && var1 != 32 && var1 != 335) {
         return false;
      } else {
         this.method5739(Minecraft.getInstance().getSoundHandler());
         this.method5759();
         return true;
      }
   }
}
