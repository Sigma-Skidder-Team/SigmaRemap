package mapped;

import net.minecraft.client.Minecraft;

public class Parallex {
   private static String[] field21396;
   private final Minecraft field21397;
   private final RenderSkyboxCube field21398;
   private float field21399;

   public Parallex(RenderSkyboxCube var1) {
      this.field21398 = var1;
      this.field21397 = Minecraft.getInstance();
   }

   public void method13754(float var1, float var2) {
      this.field21399 += var1;
      this.field21398.method24087(this.field21397, MathHelper.sin(this.field21399 * 0.001F) * 5.0F + 25.0F, -this.field21399 * 0.1F, var2);
   }
}
