package remapped;

import java.util.function.BiConsumer;
import org.lwjgl.opengl.ARBShaderObjects;

public class class_1125<T> {
   private static String[] field_6429;
   public T field_6427;
   public boolean field_6428;
   public final BiConsumer<Integer, T> field_6430;
   public int field_6426;

   public class_1125(class_6129 var1, T var2, String var3, BiConsumer<Integer, T> var4) {
      this.field_6430 = var4;
      this.field_6427 = (T)var2;
      this.field_6428 = true;
      this.field_6426 = ARBShaderObjects.glGetUniformLocationARB(var1.field_31472, var3);
   }
}
