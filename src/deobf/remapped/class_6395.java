package remapped;

import java.util.function.Function;

public class class_6395 extends class_2526<T1, T2> {
   private static String[] field_32650;

   public class_6395(class_3893 var1, class_8039 var2, Function var3) {
      super(var2);
      this.field_32649 = var1;
      this.field_32651 = var3;
   }

   @Override
   public T2 method_11518(class_5051 var1, T1 var2) throws Exception {
      return (T2)this.field_32651.apply(var2);
   }
}
