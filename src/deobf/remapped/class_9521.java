package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_9521 extends class_7430 {
   private static String[] field_48466;
   public static final class_3623 field_48465 = (var0, var1, var2, var3) -> {
   };
   public class_1500 field_48464;
   public final class_3623 field_48463;

   public class_9521(int var1, int var2, int var3, int var4, ITextComponent var5, class_1500 var6) {
      this(var1, var2, var3, var4, var5, var6, field_48465);
   }

   public class_9521(int var1, int var2, int var3, int var4, ITextComponent var5, class_1500 var6, class_3623 var7) {
      super(var1, var2, var3, var4, var5);
      this.field_48464 = var6;
      this.field_48463 = var7;
   }

   @Override
   public void method_33827() {
      this.field_48464.method_6905(this);
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      super.method_32686(var1, var2, var3, var4);
      if (this.method_32703()) {
         this.method_32705(var1, var2, var3);
      }
   }

   @Override
   public void method_32705(class_7966 var1, int var2, int var3) {
      this.field_48463.method_16878(this, var1, var2, var3);
   }
}
