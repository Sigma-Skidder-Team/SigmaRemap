package remapped;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class class_3279 extends class_8273<class_6047> {
   private static final Identifier field_16224 = new Identifier("channeled_lightning");

   @Override
   public Identifier method_3899() {
      return field_16224;
   }

   public class_6047 method_14971(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8938[] var6 = class_8938.method_41070(var1, "victims", var3);
      return new class_6047(var2, var6);
   }

   public void method_14972(class_9359 var1, Collection<? extends Entity> var2) {
      List var5 = var2.stream().<class_2792>map(var1x -> class_865.method_3739(var1, var1x)).collect(Collectors.toList());
      this.method_38137(var1, var1x -> var1x.method_27613(var5));
   }
}
