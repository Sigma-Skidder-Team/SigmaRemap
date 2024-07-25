package remapped;

import net.minecraft.util.text.StringTextComponent;

public class class_9307 extends class_9521 {
   private static String[] field_47534;
   public final int field_47535;

   public class_9307(class_57 var1, int var2, int var3, int var4, class_1500 var5) {
      super(var2, var3, 89, 20, StringTextComponent.EMPTY, var5);
      this.field_47533 = var1;
      this.field_47535 = var4;
      this.field_36677 = false;
   }

   public int method_42966() {
      return this.field_47535;
   }

   @Override
   public void method_32705(class_7966 var1, int var2, int var3) {
      if (this.field_36673 && this.field_47533.field_10956.method_29312().size() > this.field_47535 + class_57.method_20(this.field_47533)) {
         if (var2 >= this.field_36670 + 20) {
            if (var2 < this.field_36670 + 50 && var2 > this.field_36670 + 30) {
               ItemStack var7 = this.field_47533.field_10956.method_29312().get(this.field_47535 + class_57.method_20(this.field_47533)).method_36377();
               if (!var7.method_28022()) {
                  class_57.method_22(this.field_47533, var1, var7, var2, var3);
               }
            } else if (var2 > this.field_36670 + 65) {
               ItemStack var6 = this.field_47533.field_10956.method_29312().get(this.field_47535 + class_57.method_20(this.field_47533)).method_36362();
               class_57.method_15(this.field_47533, var1, var6, var2, var3);
            }
         } else {
            ItemStack var8 = this.field_47533.field_10956.method_29312().get(this.field_47535 + class_57.method_20(this.field_47533)).method_36372();
            class_57.method_23(this.field_47533, var1, var8, var2, var3);
         }
      }
   }
}
