package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1237 extends Class1236 {
   private final double field6585;
   private final double field6586;
   public final Class1343 field6587;

   public Class1237(Class1343 var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      super(var2, var3, var4, 20, StringTextComponent.EMPTY, 0.0);
      this.field6587 = var1;
      this.field6585 = (double)var6;
      this.field6586 = (double)var7;
      this.field6584 = (double)((MathHelper.method37777((float)var5, var6, var7) - var6) / (var7 - var6));
      this.method5813();
   }

   @Override
   public void method5812() {
      if (Class1343.method6456(this.field6587).active) {
         Class1343.method6457(this.field6587, (int) MathHelper.method37822(MathHelper.method37778(this.field6584, 0.0, 1.0), this.field6585, this.field6586));
      }
   }

   @Override
   public void method5813() {
      this.setMessage(
         new TranslationTextComponent("mco.configure.world.spawnProtection")
            .appendString(": ")
            .append(
               (ITextComponent)(Class1343.method6458(this.field6587) != 0
                  ? new StringTextComponent(String.valueOf(Class1343.method6458(this.field6587)))
                  : new TranslationTextComponent("mco.configure.world.off"))
            )
      );
   }

   @Override
   public void method5732(double var1, double var3) {
   }

   @Override
   public void method5733(double var1, double var3) {
   }
}
