package mapped;

import java.util.ArrayList;

public class Class8671 {
   private static String[] field39054;
   private ArrayList field39055;
   public final Class2536 field39056;

   public Class8671(Class2536 var1) {
      this.field39056 = var1;
      this.field39055 = new ArrayList();
   }

   public boolean method31208(Class8637 var1) {
      return this.field39055.contains(var1);
   }

   public void method31209(Class8637 var1) {
      this.field39055.add(var1);
   }

   public void method31210(Class8637 var1) {
      this.field39055.remove(var1);
   }

   public int method31211() {
      return this.field39055.size();
   }

   public Class8637 method31212(int var1) {
      return (Class8637)this.field39055.get(var1);
   }

   public void method31213() {
      this.field39055.clear();
   }
}
