package mapped;

import java.util.LinkedList;
import java.util.List;

public class Class8731 {
   private List field39382;
   public final Class4650 field39383;

   public Class8731(Class4650 var1) {
      this.field39383 = var1;
      this.field39382 = new LinkedList();
   }

   public Object method31512() {
      return this.field39382.get(0);
   }

   public void method31513() {
      this.field39382.clear();
   }

   public void method31514(Object var1) {
      for (int var4 = 0; var4 < this.field39382.size(); var4++) {
         if (((Comparable)this.field39382.get(var4)).compareTo(var1) > 0) {
            this.field39382.add(var4, var1);
            break;
         }
      }

      if (!this.field39382.contains(var1)) {
         this.field39382.add(var1);
      }
   }

   public void method31515(Object var1) {
      this.field39382.remove(var1);
   }

   public int method31516() {
      return this.field39382.size();
   }

   public boolean method31517(Object var1) {
      return this.field39382.contains(var1);
   }

   @Override
   public String toString() {
      String var3 = "{";

      for (int var4 = 0; var4 < this.method31516(); var4++) {
         var3 = var3 + this.field39382.get(var4).toString() + ",";
      }

      return var3 + "}";
   }
}
