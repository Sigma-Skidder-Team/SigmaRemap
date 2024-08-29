package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4307;
import net.minecraft.client.Minecraft;

public class Class4324 extends Class4307 {
   private static Minecraft field21107 = Minecraft.getInstance();
   public Class4257 field21108;

   public Class4324() {
      super("Spotlight");
      this.method13300(false);
      int var3 = (this.method13267() - 675) / 2;
      this.method13230(this.field21108 = new Class4257(this, "search", var3, (int)((float)this.field20898 * 0.25F), 675, 60, true));
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         field21107.displayGuiScreen(null);
      }
   }
}
