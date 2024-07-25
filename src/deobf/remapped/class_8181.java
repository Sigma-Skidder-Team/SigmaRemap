package remapped;

import java.util.Map.Entry;

public final class class_8181 implements class_5226 {
   private static String[] field_41877;

   @Override
   public void method_23914(class_5051 var1) throws Exception {
      var1.method_23236(class_8039.field_41157, class_8633.field_44277.method_43098().size());

      for (Entry var5 : class_8633.field_44277.method_43098().entrySet()) {
         var1.method_23236(class_8039.field_41171, (String)var5.getKey());
         var1.method_23236(class_8039.field_41144, class_8633.method_39633((Integer[])var5.getValue()));
      }

      var1.method_23236(class_8039.field_41157, class_8633.field_44277.method_43094().size());

      for (Entry var8 : class_8633.field_44277.method_43094().entrySet()) {
         var1.method_23236(class_8039.field_41171, (String)var8.getKey());
         var1.method_23236(class_8039.field_41144, class_8633.method_39633((Integer[])var8.getValue()));
      }

      var1.method_23236(class_8039.field_41157, class_8633.field_44277.method_43095().size());

      for (Entry var9 : class_8633.field_44277.method_43095().entrySet()) {
         var1.method_23236(class_8039.field_41171, (String)var9.getKey());
         var1.method_23236(class_8039.field_41144, class_8633.method_39633((Integer[])var9.getValue()));
      }
   }
}
