package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class_7256 extends class_4285<class_9658> {
   public class_7256(Codec<class_9658> var1) {
      super(var1);
   }

   public boolean method_33158(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_9658 var5) {
      MutableBoolean var8 = new MutableBoolean();
      var5.field_49196.method_13769(new class_6680(var1, var2), var3, var4).forEach(var5x -> {
         if (var5.field_49193.get().method_27104(var1, var2, var3, var5x)) {
            var8.setTrue();
         }
      });
      return var8.isTrue();
   }

   @Override
   public String toString() {
      return String.format("< %s [%s] >", this.getClass().getSimpleName(), class_8669.field_44417.method_39797(this));
   }
}
