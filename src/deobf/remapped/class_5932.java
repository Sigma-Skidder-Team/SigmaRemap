package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_5932 extends class_9521 {
   private static String[] field_30160;
   public final int field_30159;

   public class_5932(int var1, int var2, int var3, int var4, int var5, String var6, class_1500 var7) {
      super(var2, var3, var4, var5, new StringTextComponent(var6), var7);
      this.field_30159 = var1;
   }

   public class_5932(int var1, int var2, int var3, int var4, int var5, String var6) {
      this(var1, var2, var3, var4, var5, var6, var0 -> {
      });
   }

   public class_5932(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4, var0 -> {
      });
   }

   public void method_27121(String var1) {
      super.method_32687(new StringTextComponent(var1));
   }
}
