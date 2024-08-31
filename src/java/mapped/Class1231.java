package mapped;

import net.minecraft.client.AbstractOption;
import net.minecraft.client.Minecraft;

public class Class1231 extends Class1232 implements Class1230 {
   private static String[] field6578;
   private AbstractOption field6579 = null;

   public Class1231(int var1, int var2, int var3, Class5807 var4) {
      super(Minecraft.getInstance().gameSettings, var2, var3, 200, 20, var4);
      this.field6579 = var4;
   }

   @Override
   public AbstractOption method5811() {
      return this.field6579;
   }
}
