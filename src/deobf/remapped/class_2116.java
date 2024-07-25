package remapped;

import java.util.List;
import java.util.Optional;
import net.minecraft.util.text.ITextComponent;

public class class_2116 extends class_9521 implements class_938 {
   private static String[] field_10627;
   private final class_1013 field_10626;

   public class_2116(int var1, int var2, int var3, int var4, class_1013 var5, ITextComponent var6, class_1500 var7) {
      super(var1, var2, var3, var4, var6, var7);
      this.field_10626 = var5;
   }

   public class_1013 method_9911() {
      return this.field_10626;
   }

   @Override
   public Optional<List<class_7107>> method_4059() {
      return this.field_10626.method_4486();
   }

   public class_1013 method_9910() {
      return this.field_10626;
   }
}
