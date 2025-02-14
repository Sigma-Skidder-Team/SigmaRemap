package mapped;

import java.util.Arrays;

public final class Class8632 {
   private final Class1856 field38836;
   private final Class7626[] field38837;

   public Class1856 method31012() {
      return this.field38836;
   }

   public Class7626[] method31013() {
      return this.field38837;
   }

   @Override
   public String toString() {
      return "HoverEvent(action=" + this.method31012() + ", value=" + Arrays.deepToString(this.method31013()) + ")";
   }

   public Class8632(Class1856 var1, Class7626[] var2) {
      this.field38836 = var1;
      this.field38837 = var2;
   }
}
