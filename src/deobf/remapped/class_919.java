package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_919 extends class_3533 {
   private static String[] field_4725;
   private final class_9521 field_4726;

   public class_919(ITextComponent var1, List<class_7107> var2, String var3, BooleanValue var4, BooleanValue var5) {
      super(var1, var3, var2);
      this.field_4724 = var1;
      this.field_4726 = new class_2196(this, 10, 5, 44, 20, class_1402.method_6479(var5.method_26681()), var1x -> {
         boolean var4x = !var5.method_26681();
         var5.method_26684(var4x, (class_341)null);
         var1x.method_32687(class_1402.method_6479(var5.method_26681()));
      }, var1, var2, var5, var4);
      this.field_17295.add(this.field_4726);
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method_16318(var1, var3, var4);
      this.field_4726.field_36670 = var4 + var5 - 45;
      this.field_4726.field_36674 = var3;
      this.field_4726.method_6767(var1, var7, var8, var10);
   }
}
