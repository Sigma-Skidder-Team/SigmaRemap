package remapped;

import java.util.Map;

public final class class_922 extends class_8087 {
   private static String[] field_4736;
   private final boolean field_4735;
   private final class_7826 field_4738;
   private final Map<String, String> field_4737;

   public class_922(class_404 var1, class_404 var2, boolean var3, class_7826 var4, Map<String, String> var5) {
      super(var1, var2);
      this.field_4735 = var3;
      this.field_4738 = var4;
      this.field_4737 = var5;
   }

   public boolean method_4040() {
      return this.field_4735;
   }

   public class_7826 method_4041() {
      return this.field_4738;
   }

   public Map<String, String> method_4042() {
      return this.field_4737;
   }

   @Override
   public boolean method_36724(class_3467 var1) {
      return class_3467.field_16988 == var1;
   }
}
