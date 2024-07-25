package remapped;

import org.lwjgl.opengl.ARBShaderObjects;

public class class_4697 {
   private static String[] field_22846;
   public final int field_22847;

   public class_4697(class_2865 var1, String var2) {
      this.field_22847 = ARBShaderObjects.glCreateShaderObjectARB(var1.field_14015);
      ARBShaderObjects.glShaderSourceARB(this.field_22847, var2);
      ARBShaderObjects.glCompileShaderARB(this.field_22847);
      if (ARBShaderObjects.glGetObjectParameteriARB(this.field_22847, 35713) != 0) {
         throw new RuntimeException(ARBShaderObjects.glGetInfoLogARB(this.field_22847));
      }
   }
}
