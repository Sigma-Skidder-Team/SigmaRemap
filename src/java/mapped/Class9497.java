package mapped;

import java.util.ArrayList;

public class Class9497<T> {
   private static String[] field44202;
   private ArrayList<T> field44203;

   public Class9497(int var1) {
      this.field44203 = new ArrayList<T>(var1);
   }

   public void method36683(T var1) {
      this.field44203.add((T)var1);
   }

   public T method36684() {
      return this.field44203.remove(this.field44203.size() - 1);
   }

   public boolean method36685() {
      return this.field44203.isEmpty();
   }

   public void method36686() {
      this.field44203.clear();
   }
}
