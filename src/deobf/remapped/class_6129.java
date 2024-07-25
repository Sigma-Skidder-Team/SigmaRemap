package remapped;

import java.util.ArrayList;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class class_6129 {
   private static String[] field_31470;
   public ArrayList<class_1125<?>> field_31471 = new ArrayList<class_1125<?>>();
   public final int field_31472 = ARBShaderObjects.glCreateProgramObjectARB();

   public class_6129(class_4697 var1, class_4697 var2) {
      ARBShaderObjects.glAttachObjectARB(this.field_31472, var1.field_22847);
      ARBShaderObjects.glAttachObjectARB(this.field_31472, var2.field_22847);
      ARBShaderObjects.glLinkProgramARB(this.field_31472);
      ARBShaderObjects.glValidateProgramARB(this.field_31472);
   }

   public void method_28164() {
      GL11.glPushMatrix();
      GL20.glUseProgram(this.field_31472);

      for (class_1125 var4 : this.field_31471) {
         if (var4.field_6428) {
            var4.field_6428 = false;
            var4.field_6430.accept(this.field_31472, var4.field_6427);
         }
      }
   }

   public void method_28165() {
      GL20.glUseProgram(0);
      GL11.glPopMatrix();
   }

   public class_1125<Float> method_28166(String var1, float var2) {
      class_1125 var5 = new class_1125<Float>(this, var2, var1, (var0, var1x) -> GL20.glUniform1f(var0, var1x));
      this.field_31471.add(var5);
      return var5;
   }

   public class_1125<Integer> method_28167(String var1, int var2) {
      class_1125 var5 = new class_1125<Integer>(this, var2, var1, (var0, var1x) -> GL20.glUniform1i(var0, var1x));
      this.field_31471.add(var5);
      return var5;
   }

   public class_1125<class_4895> method_28168(String var1, class_4895 var2) {
      class_1125 var5 = new class_1125<class_4895>(this, var2, var1, (var0, var1x) -> GL20.glUniform2f(var0, var1x.field_24326, var1x.field_24329));
      this.field_31471.add(var5);
      return var5;
   }

   public class_1125<Boolean> method_28169(String var1, boolean var2) {
      class_1125 var5 = new class_1125<Boolean>(this, var2, var1, (var0, var1x) -> GL20.glUniform1i(var0, !var1x ? 0 : 1));
      this.field_31471.add(var5);
      return var5;
   }
}
