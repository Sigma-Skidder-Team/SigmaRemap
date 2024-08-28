package mapped;

import javax.annotation.Nullable;

public class Class810 extends Class798 {
   private static String[] field4337;
   private Screen field4338;

   public void method2209(Screen var1) {
      this.field4338 = var1;
      Minecraft.getInstance().displayGuiScreen(new Class806(this));
   }

   @Nullable
   public Class798 method2210(Screen var1) {
      this.field4338 = var1;
      return new Class816();
   }

   @Override
   public void method1921() {
      Minecraft.getInstance().displayGuiScreen(this.field4338);
   }
}
