package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.minecraft.util.text.ITextProperties;

public class class_9038 implements class_8668 {
   private static String[] field_46248;
   private final List<String> field_46249;

   public class_9038(class_6098 var1) {
      this.field_46249 = method_41495(var1);
   }

   private static List<String> method_41495(class_6098 var0) {
      class_5734 var3 = var0.method_27990();
      return (List<String>)(var3 == null ? ImmutableList.of() : class_7680.method_34805(var3));
   }

   @Override
   public int method_39737() {
      return this.field_46249.size();
   }

   @Override
   public ITextProperties method_39734(int var1) {
      return ITextProperties.func_240652_a_(this.field_46249.get(var1));
   }
}
