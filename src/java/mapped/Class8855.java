package mapped;

import java.util.ArrayList;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class Class8855 {
   private static String[] field40039;
   public ArrayList<Class6895<?>> field40040 = new ArrayList<Class6895<?>>();
   public final int field40041 = ARBShaderObjects.glCreateProgramObjectARB();

   public Class8855(Class8467 var1, Class8467 var2) {
      ARBShaderObjects.glAttachObjectARB(this.field40041, var1.field36288);
      ARBShaderObjects.glAttachObjectARB(this.field40041, var2.field36288);
      ARBShaderObjects.glLinkProgramARB(this.field40041);
      ARBShaderObjects.glValidateProgramARB(this.field40041);
   }

   public void method32237() {
      GL11.glPushMatrix();
      GL20.glUseProgram(this.field40041);

      for (Class6895 var4 : this.field40040) {
         if (var4.field29881) {
            var4.field29881 = false;
            var4.field29882.accept(this.field40041, var4.field29880);
         }
      }
   }

   public void method32238() {
      GL20.glUseProgram(0);
      GL11.glPopMatrix();
   }

   public Class6895<Float> method32239(String var1, float var2) {
      Class6895 var5 = new Class6895<Float>(this, var2, var1, (var0, var1x) -> GL20.glUniform1f(var0, var1x));
      this.field40040.add(var5);
      return var5;
   }

   public Class6895<Integer> method32240(String var1, int var2) {
      Class6895 var5 = new Class6895<Integer>(this, var2, var1, (var0, var1x) -> GL20.glUniform1i(var0, var1x));
      this.field40040.add(var5);
      return var5;
   }

   public Class6895<Class8513> method32241(String var1, Class8513 var2) {
      Class6895 var5 = new Class6895<Class8513>(this, var2, var1, (var0, var1x) -> GL20.glUniform2f(var0, var1x.field37220, var1x.field37221));
      this.field40040.add(var5);
      return var5;
   }

   public Class6895<Boolean> method32242(String var1, boolean var2) {
      Class6895 var5 = new Class6895<Boolean>(this, var2, var1, (var0, var1x) -> GL20.glUniform1i(var0, !var1x ? 0 : 1));
      this.field40040.add(var5);
      return var5;
   }
}
