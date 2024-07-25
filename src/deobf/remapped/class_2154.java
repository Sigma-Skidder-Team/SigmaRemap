package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_2154 extends class_3268 {
   private static String[] field_10765;
   private final ITextComponent field_10766;

   public class_2154(class_3547 var1, ITextComponent var2) {
      super(var1, (List)null);
      this.field_10764 = var1;
      this.field_10766 = var2;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      class_2089.method_9788(var1, this.field_10764.field_943.field_9668, this.field_10766, var4 + var5 / 2, var3 + 5, 16777215);
   }

   @Override
   public List<? extends class_5888> method_41183() {
      return ImmutableList.of();
   }
}
