package mapped;

import java.util.function.BiConsumer;
import org.lwjgl.opengl.ARBShaderObjects;

public class Class6895<T> {
   private static String[] field29879;
   public T field29880;
   public boolean field29881;
   public final BiConsumer<Integer, T> field29882;
   public int field29883;

   public Class6895(Class8855 var1, T var2, String var3, BiConsumer<Integer, T> var4) {
      this.field29882 = var4;
      this.field29880 = (T)var2;
      this.field29881 = true;
      this.field29883 = ARBShaderObjects.glGetUniformLocationARB(var1.field40041, var3);
   }
}
