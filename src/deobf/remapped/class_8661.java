package remapped;

import com.mojang.serialization.Codec;

public class class_8661 implements class_5079 {
   public static final class_7981<class_8661> field_44336 = new class_6366();
   private final class_8583<class_8661> field_44338;
   private final ItemStack field_44339;

   public static Codec<class_8661> method_39707(class_8583<class_8661> var0) {
      return ItemStack.field_31201.xmap(var1 -> new class_8661(var0, var1), var0x -> var0x.field_44339);
   }

   public class_8661(class_8583<class_8661> var1, ItemStack var2) {
      this.field_44338 = var1;
      this.field_44339 = var2;
   }

   @Override
   public void method_23359(class_8248 var1) {
      var1.method_37764(this.field_44339);
   }

   @Override
   public String method_23358() {
      return class_8669.field_44387.method_39797(this.method_23357())
         + " "
         + new class_3238(this.field_44339.method_27960(), this.field_44339.method_27990()).method_14835();
   }

   @Override
   public class_8583<class_8661> method_23357() {
      return this.field_44338;
   }

   public ItemStack method_39705() {
      return this.field_44339;
   }
}
