package mapped;

import org.lwjgl.opengl.GL11;

public class Class9368 {
   private static String[] field43487;
   private final int field43488;
   private boolean field43489;

   public Class9368(int var1) {
      this.field43488 = var1;
   }

   public void method35529() {
      this.method35531(false);
   }

   public void method35530() {
      this.method35531(true);
   }

   public void method35531(boolean var1) {
      RenderSystem.assertThread(RenderSystem::method27804);
      if (var1 != this.field43489) {
         this.field43489 = var1;
         if (!var1) {
            GL11.glDisable(this.field43488);
         } else {
            GL11.glEnable(this.field43488);
         }
      }
   }

   // $VF: synthetic method
   public static boolean method35532(Class9368 var0) {
      return var0.field43489;
   }
}
