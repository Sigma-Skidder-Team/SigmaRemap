package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_9496 extends class_9521 {
   private static String[] field_48378;
   private final Identifier field_48377;

   public class_9496(class_5824 var1, int var2, int var3, ITextComponent var4, Identifier var5, class_1500 var6) {
      super(var2, var3, 60, 72, var4, var6);
      this.field_48376 = var1;
      this.field_48377 = var5;
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      class_5824.method_26353(
         this.field_48376,
         var1,
         this.field_36670,
         this.field_36674,
         this.method_32685(),
         this.field_48377,
         this.method_32703(),
         this.method_26937((double)var2, (double)var3)
      );
   }
}
