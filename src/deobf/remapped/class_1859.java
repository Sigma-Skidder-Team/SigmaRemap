package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_1859 extends class_446 {
   private static String[] field_9425;
   private final List<class_4572> field_9426 = new ArrayList<class_4572>();

   public class_1859(class_7038 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class_1859(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, boolean var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public class_1859(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, boolean var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public class_1859(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, class_3384 var9, boolean var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public final void method_8236(class_4572 var1) {
      this.field_9426.add(var1);
   }

   public final void method_8235() {
      for (class_4572 var4 : this.field_9426) {
         var4.method_21216(this);
      }
   }
}
