package remapped;

public class class_7128 implements Runnable {
   private static String[] field_36737;

   public class_7128(class_4882 var1, Object[] var2) {
      this.field_36738 = var1;
      this.field_36736 = var2;
   }

   @Override
   public void run() {
      Object var3 = this.field_36736.length <= 0 ? null : this.field_36736[0];
      if (!(var3 instanceof String)) {
         if (var3 instanceof byte[]) {
            this.field_36738.field_24282.method_10545((byte[])var3);
         }
      } else {
         this.field_36738.field_24282.method_10544((String)var3);
      }
   }
}
