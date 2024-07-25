package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.text.ITextComponent;

public abstract class class_3533 extends class_3268 {
   private final List<class_7107> field_17294;
   public final List<class_5888> field_17295;

   public class_3533(List<class_7107> var1, ITextComponent var2, ITextComponent var3) {
      super(var1, var2);
      this.field_17293 = var1;
      this.field_17295 = Lists.newArrayList();
      this.field_17294 = var1.field_943.field_9668.method_45391(var3, 175);
   }

   @Override
   public List<? extends class_5888> method_41183() {
      return this.field_17295;
   }

   public void method_16318(class_7966 var1, int var2, int var3) {
      if (this.field_17294.size() != 1) {
         if (this.field_17294.size() >= 2) {
            this.field_17293.field_943.field_9668.method_45382(var1, this.field_17294.get(0), (float)var3, (float)var2, 16777215);
            this.field_17293.field_943.field_9668.method_45382(var1, this.field_17294.get(1), (float)var3, (float)(var2 + 10), 16777215);
         }
      } else {
         this.field_17293.field_943.field_9668.method_45382(var1, this.field_17294.get(0), (float)var3, (float)(var2 + 5), 16777215);
      }
   }
}
