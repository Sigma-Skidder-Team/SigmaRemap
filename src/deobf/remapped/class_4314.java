package remapped;

import javax.annotation.Nullable;

public abstract class class_4314 extends class_6414 implements class_724 {
   public class_4314(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38470;
   }

   @Override
   public boolean method_10800(class_2522 var1, World var2, class_1331 var3, int var4, int var5) {
      super.method_10800(var1, var2, var3, var4, var5);
      class_3757 var8 = var2.method_28260(var3);
      return var8 != null ? var8.method_17408(var4, var5) : false;
   }

   @Nullable
   @Override
   public class_4259 method_10767(class_2522 var1, World var2, class_1331 var3) {
      class_3757 var6 = var2.method_28260(var3);
      return !(var6 instanceof class_4259) ? null : (class_4259)var6;
   }
}
