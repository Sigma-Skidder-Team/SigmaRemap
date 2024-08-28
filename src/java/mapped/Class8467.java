package mapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class Class8467 {
   private static String[] field36287;
   public final int field36288;

   public Class8467(Class2312 var1, String var2) {
      this.field36288 = ARBShaderObjects.glCreateShaderObjectARB(var1.field15845);
      ARBShaderObjects.glShaderSourceARB(this.field36288, var2);
      ARBShaderObjects.glCompileShaderARB(this.field36288);
      if (ARBShaderObjects.glGetObjectParameteriARB(this.field36288, 35713) != 0) {
         throw new RuntimeException(ARBShaderObjects.glGetInfoLogARB(this.field36288));
      }
   }
}
