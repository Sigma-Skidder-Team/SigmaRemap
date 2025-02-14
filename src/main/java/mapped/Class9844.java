package mapped;

import java.nio.IntBuffer;
import java.util.Arrays;

public class Class9844 {
   private static String[] field45943;
   private IntBuffer field45944;
   private int field45945;
   private boolean[] field45946;
   private boolean[] field45947;

   public Class9844(IntBuffer var1, int var2) {
      this.field45944 = var1;
      this.field45945 = var2;
      this.field45946 = new boolean[var1.capacity()];
      this.field45947 = new boolean[var1.capacity()];
   }

   public int method38905(int var1) {
      return this.method38907(var1, this.field45946[var1]);
   }

   public int method38906(int var1) {
      return this.method38907(var1, !this.field45946[var1]);
   }

   private int method38907(int var1, boolean var2) {
      int var5 = !var2 ? 0 : this.field45945;
      return this.field45944.get(var5 + var1);
   }

   public void method38908(int var1) {
      this.field45946[var1] = !this.field45946[var1];
      this.field45947[var1] = true;
   }

   public boolean method38909(int var1) {
      return this.field45947[var1];
   }

   public void method38910() {
      Arrays.fill(this.field45946, false);
      Arrays.fill(this.field45947, false);
   }
}
