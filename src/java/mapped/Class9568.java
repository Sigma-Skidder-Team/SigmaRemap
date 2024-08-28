package mapped;

import java.util.ArrayList;

public class Class9568 {
   private ArrayList field44555 = new ArrayList();

   public void method37096(Class7276 var1) {
      this.field44555.add(var1);
   }

   public int method37097() {
      return this.field44555.size();
   }

   public float method37098(int var1) {
      return ((Class7276)this.field44555.get(var1)).method22910();
   }

   public float method37099(int var1) {
      return ((Class7276)this.field44555.get(var1)).method22911();
   }

   @Override
   public String toString() {
      return "[Path length=" + this.method37097() + "]";
   }

   public void method37100(int var1) {
      this.field44555.remove(var1);
   }
}
