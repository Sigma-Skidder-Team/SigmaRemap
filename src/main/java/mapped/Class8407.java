package mapped;

import java.util.function.Consumer;

public class Class8407 implements Class8405 {
   private static String[] field36064;
   public final Consumer field36065;
   public final Class9494 field36066;

   public Class8407(Class9494 var1, Consumer var2) {
      this.field36066 = var1;
      this.field36065 = var2;
   }

   @Override
   public void method29524(Class8262 var1) {
   }

   @Override
   public void method29525(Class8262 var1) {
      this.field36065.accept(var1);
   }
}
