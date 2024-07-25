package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_5986 extends class_7114 {
   private static String[] field_30496;
   public class_4639 field_30492;
   public boolean field_30498;
   public int field_30493;
   public int field_30494;
   public int field_30497;
   public int field_30495;

   public class_5986(int var1, int var2, int var3, int var4, boolean var5) {
      super(var1, var2, var3, var4, StringTextComponent.EMPTY);
      this.field_30498 = var5;
   }

   public void method_27297(int var1, int var2, int var3, int var4, class_4639 var5) {
      this.field_30493 = var1;
      this.field_30494 = var2;
      this.field_30497 = var3;
      this.field_30495 = var4;
      this.field_30492 = var5;
   }

   public void method_27296(boolean var1) {
      this.field_30498 = var1;
   }

   public boolean method_27299() {
      return this.field_30498;
   }

   public void method_27298(int var1, int var2) {
      this.field_36670 = var1;
      this.field_36674 = var2;
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      MinecraftClient var7 = MinecraftClient.method_8510();
      var7.method_8577().method_35674(this.field_30492);
      class_3542.method_16491();
      int var8 = this.field_30493;
      int var9 = this.field_30494;
      if (this.field_30498) {
         var8 += this.field_30497;
      }

      if (this.method_32703()) {
         var9 += this.field_30495;
      }

      this.method_9781(var1, this.field_36670, this.field_36674, var8, var9, this.field_36671, this.field_36681);
      class_3542.method_16428();
   }
}
