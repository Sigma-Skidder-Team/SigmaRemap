package remapped;

import java.util.List;
import java.util.stream.Collectors;

public class class_8010 extends Thread {
   public class_8010(class_4502 var1, String var2) {
      super(var2);
      this.field_41035 = var1;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();

      try {
         List var4 = var3.method_797().field_34591;
         List var5 = var4.stream().<class_131>map(var1 -> {
            class_4502 var10002 = this.field_41035;
            this.field_41035.getClass();
            return new class_131(var10002, var1);
         }).collect(Collectors.toList());
         class_4502.method_20939(this.field_41035).execute(() -> class_4502.method_20917(this.field_41035).method_36225(var5));
      } catch (class_3900 var9) {
         class_4502.method_20926().error("Couldn't list invites");
      } finally {
         class_4502.method_20931(this.field_41035, true);
      }
   }
}
