package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_77 extends class_9521 {
   private static String[] field_123;
   private final Identifier field_126;
   private final int field_124;
   private final int field_127;
   private final int field_128;
   private final int field_125;
   private final int field_122;

   public class_77(int var1, int var2, int var3, int var4, int var5, int var6, int var7, Identifier var8, class_1500 var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, 256, 256, var9);
   }

   public class_77(int var1, int var2, int var3, int var4, int var5, int var6, int var7, Identifier var8, int var9, int var10, class_1500 var11) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, StringTextComponent.EMPTY);
   }

   public class_77(
           int var1, int var2, int var3, int var4, int var5, int var6, int var7, Identifier var8, int var9, int var10, class_1500 var11, ITextComponent var12
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, field_48465, var12);
   }

   public class_77(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      Identifier var8,
      int var9,
      int var10,
      class_1500 var11,
      class_3623 var12,
      ITextComponent var13
   ) {
      super(var1, var2, var3, var4, var13, var11, var12);
      this.field_125 = var9;
      this.field_122 = var10;
      this.field_124 = var5;
      this.field_127 = var6;
      this.field_128 = var7;
      this.field_126 = var8;
   }

   public void method_166(int var1, int var2) {
      this.field_36670 = var1;
      this.field_36674 = var2;
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      MinecraftClient var7 = MinecraftClient.getInstance();
      var7.method_8577().method_35674(this.field_126);
      int var8 = this.field_127;
      if (this.method_32703()) {
         var8 += this.field_128;
      }

      class_3542.method_16428();
      method_9778(
         var1, this.field_36670, this.field_36674, (float)this.field_124, (float)var8, this.field_36671, this.field_36681, this.field_125, this.field_122
      );
      if (this.method_32703()) {
         this.method_32705(var1, var2, var3);
      }
   }
}
