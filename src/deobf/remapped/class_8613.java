package remapped;

import java.util.ArrayList;

public class class_8613<T> {
   private static String[] field_44177;
   private ArrayList<T> field_44178;

   public class_8613(int var1) {
      this.field_44178 = new ArrayList<T>(var1);
   }

   public void method_39588(T var1) {
      this.field_44178.add((T)var1);
   }

   public T method_39590() {
      return this.field_44178.remove(this.field_44178.size() - 1);
   }

   public boolean method_39591() {
      return this.field_44178.isEmpty();
   }

   public void method_39592() {
      this.field_44178.clear();
   }
}
