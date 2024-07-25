package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_1075 extends class_3533 {
   private final class_1863 field_5871;

   public class_1075(ITextComponent var1, List<class_7107> var2, String var3, IntegerValue var4, IntegerValue var5) {
      super(var1, var3, var2);
      this.field_5872 = var1;
      this.field_5871 = new class_1863(var1.field_943.field_9668, 10, 5, 42, 20, var2.deepCopy().appendString("\n").appendString(var4).appendString("\n"));
      this.field_5871.method_8281(Integer.toString(var5.method_9272()));
      this.field_5871.method_8277(var2x -> {
         if (!var5.method_9275(var2x)) {
            this.field_5871.method_8250(16711680);
            class_3547.method_16507(this.field_5872, this);
         } else {
            this.field_5871.method_8250(14737632);
            class_3547.method_16504(this.field_5872, this);
         }
      });
      this.field_17295.add(this.field_5871);
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method_16318(var1, var3, var4);
      this.field_5871.field_36670 = var4 + var5 - 44;
      this.field_5871.field_36674 = var3;
      this.field_5871.method_6767(var1, var7, var8, var10);
   }
}
