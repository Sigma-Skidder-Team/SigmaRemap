package mapped;

import java.util.function.Consumer;

public class Class9617 {
   private static String[] field44955;
   private Class8506 field44956;
   private boolean field44957;
   public final Class9818 field44958;

   public boolean method37437() {
      return this.field44957;
   }

   public Class9617(Class9818 var1, Class8506 var2) {
      this.field44958 = var1;
      this.field44956 = var2;
   }

   public void method37438(Consumer<Class8506> var1) {
      Class9818.method38761(this.field44958).execute(() -> {
         if (this.field44956 != null) {
            var1.accept(this.field44956);
         }
      });
   }

   public void method37439() {
      this.field44957 = true;
      Class9818.method38762(this.field44958).method27289(this.field44956);
      this.field44956 = null;
   }

   // $VF: synthetic method
   public static Class8506 method37441(Class9617 var0) {
      return var0.field44956;
   }
}
