package remapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class class_1147 {
   private static String[] field_6533;
   public final Set<class_4639> field_6530 = Sets.newHashSet();
   public final Set<class_4639> field_6531 = Sets.newHashSet();
   private final class_7529 field_6532 = new class_7529();

   public void method_5087(class_1147 var1) {
      this.field_6530.clear();
      this.field_6531.clear();
      this.field_6532.method_34311(var1.field_6532);
      this.field_6530.addAll(var1.field_6530);
      this.field_6531.addAll(var1.field_6531);
   }

   public void method_5084(class_8932<?> var1) {
      if (!var1.method_41053()) {
         this.method_5083(var1.method_41050());
      }
   }

   public void method_5083(class_4639 var1) {
      this.field_6530.add(var1);
   }

   public boolean method_5072(class_8932<?> var1) {
      return var1 != null ? this.field_6530.contains(var1.method_41050()) : false;
   }

   public boolean method_5073(class_4639 var1) {
      return this.field_6530.contains(var1);
   }

   public void method_5070(class_8932<?> var1) {
      this.method_5069(var1.method_41050());
   }

   public void method_5069(class_4639 var1) {
      this.field_6530.remove(var1);
      this.field_6531.remove(var1);
   }

   public boolean method_5081(class_8932<?> var1) {
      return this.field_6531.contains(var1.method_41050());
   }

   public void method_5088(class_8932<?> var1) {
      this.field_6531.remove(var1.method_41050());
   }

   public void method_5078(class_8932<?> var1) {
      this.method_5077(var1.method_41050());
   }

   public void method_5077(class_4639 var1) {
      this.field_6531.add(var1);
   }

   public boolean method_5075(class_4269 var1) {
      return this.field_6532.method_34301(var1);
   }

   public void method_5076(class_4269 var1, boolean var2) {
      this.field_6532.method_34308(var1, var2);
   }

   public boolean method_5079(class_3954<?> var1) {
      return this.method_5082(var1.method_18263());
   }

   public boolean method_5082(class_4269 var1) {
      return this.field_6532.method_34305(var1);
   }

   public void method_5071(class_4269 var1, boolean var2) {
      this.field_6532.method_34302(var1, var2);
   }

   public void method_5080(class_7529 var1) {
      this.field_6532.method_34311(var1);
   }

   public class_7529 method_5074() {
      return this.field_6532.method_34310();
   }

   public void method_5085(class_4269 var1, boolean var2, boolean var3) {
      this.field_6532.method_34308(var1, var2);
      this.field_6532.method_34302(var1, var3);
   }
}
