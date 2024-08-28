package mapped;

import java.util.ArrayList;
import java.util.Collection;

public class Class9630 {
   private static String[] field45047;
   private ArrayList field45048 = new ArrayList();

   public void method37540(Class8952 var1) {
      this.field45048.add(var1);
   }

   public int method37541() {
      return this.field45048.size();
   }

   public Class8952 method37542(int var1) {
      return (Class8952)this.field45048.get(var1);
   }

   public boolean method37543(Class8952 var1) {
      return this.field45048.contains(var1);
   }

   public void method37544(Collection var1) {
      var1.addAll(this.field45048);
   }
}
