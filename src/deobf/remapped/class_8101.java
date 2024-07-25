package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class class_8101 implements class_6310<class_392> {
   private static String[] field_41493;
   public int field_41494;

   public class_8101() {
   }

   public class_8101(Entity var1) {
      this.field_41494 = var1.method_37145();
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_41494 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_41494);
   }

   public void method_36789(class_392 var1) {
      var1.method_1966(this);
   }

   @Nullable
   public Entity method_36787(World var1) {
      return var1.method_29534(this.field_41494);
   }
}
