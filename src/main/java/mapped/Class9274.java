package mapped;

import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

public class Class9274 {
   private static String[] field42658;
   public static SGL field42659 = Renderer.get();

   public static void method34950() {
      field42659.glDepthMask(true);
      field42659.glClearDepth(1.0F);
      field42659.glClear(256);
      field42659.glDepthFunc(519);
      field42659.glEnable(2929);
      field42659.glDepthMask(true);
      field42659.glColorMask(false, false, false, false);
   }

   public static void method34951() {
      field42659.glDepthMask(false);
      field42659.glColorMask(true, true, true, true);
   }

   public static void method34952() {
      field42659.glDepthFunc(514);
   }

   public static void method34953() {
      field42659.glDepthFunc(517);
   }

   public static void method34954() {
      field42659.glDepthMask(true);
      field42659.glClearDepth(0.0F);
      field42659.glClear(256);
      field42659.glDepthMask(false);
      field42659.glDisable(2929);
   }
}
