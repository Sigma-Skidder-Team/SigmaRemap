package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class class_9172 extends class_2103 {
   public static final Codec<class_9172> field_46940 = Codec.unit(() -> class_9172.field_46939);
   public static final class_9172 field_46939 = new class_9172();

   private class_9172() {
   }

   @Nullable
   @Override
   public class_4099 method_9859(class_4924 var1, class_1331 var2, class_1331 var3, class_4099 var4, class_4099 var5, class_8478 var6) {
      class_2522 var9 = var5.field_19967;
      if (var9.method_8350(class_4783.field_23319)) {
         String var10 = var5.field_19968.method_25965("final_state");
         class_4104 var11 = new class_4104(new StringReader(var10), false);

         try {
            var11.method_18973(true);
         } catch (CommandSyntaxException var13) {
            throw new RuntimeException(var13);
         }

         return var11.method_18967().method_8350(class_4783.field_23227) ? null : new class_4099(var5.field_19965, var11.method_18967(), (CompoundNBT)null);
      } else {
         return var5;
      }
   }

   @Override
   public class_2111<?> method_9858() {
      return class_2111.field_10582;
   }
}
