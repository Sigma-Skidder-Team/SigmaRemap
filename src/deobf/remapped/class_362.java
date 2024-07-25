package remapped;

import java.util.Optional;

public class class_362 extends class_7571 {
   private static String[] field_1401;
   private final Entity field_1402;

   public class_362(Entity var1) {
      this.field_1402 = var1;
   }

   @Override
   public Optional<Float> method_34424(class_2730 var1, class_6163 var2, class_1331 var3, class_2522 var4, class_4774 var5) {
      return super.method_34424(var1, var2, var3, var4, var5).<Float>map(var6 -> this.field_1402.method_37083(var1, var2, var3, var4, var5, var6));
   }

   @Override
   public boolean method_34425(class_2730 var1, class_6163 var2, class_1331 var3, class_2522 var4, float var5) {
      return this.field_1402.method_37348(var1, var2, var3, var4, var5);
   }
}
