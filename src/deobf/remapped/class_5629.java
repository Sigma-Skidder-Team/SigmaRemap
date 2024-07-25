package remapped;

import java.util.Collections;
import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_5629 extends class_1942 {
   private static String[] field_28561;
   private final ITextComponent field_28564;
   private final int field_28562;

   public class_5629(class_4892 var1, ITextComponent var2) {
      this.field_28563 = var1;
      this.field_28564 = var2;
      this.field_28562 = var1.field_40883.textRenderer.method_45379(this.field_28564);
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.field_28563
         .field_40883
         .field_9668
         .method_45378(
            var1,
            this.field_28564,
            (float)(this.field_28563.field_40883.field_9623.field_941 / 2 - this.field_28562 / 2),
            (float)(var3 + var6 - 9 - 1),
            16777215
         );
   }

   @Override
   public boolean method_26942(boolean var1) {
      return false;
   }

   @Override
   public List<? extends class_5888> method_41183() {
      return Collections.emptyList();
   }
}
