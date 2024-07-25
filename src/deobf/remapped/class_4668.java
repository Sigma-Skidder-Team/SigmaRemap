package remapped;

import net.minecraft.util.text.ITextComponent;

public interface class_4668<T extends class_4088, U extends class_266 & class_4378<T>> {
   default void method_21601(ITextComponent var1, class_4165<T> var2, MinecraftClient var3, int var4) {
      class_266 var7 = this.method_21600((T)var2.method_19322(var4, var3.field_9632.field_3853), var3.field_9632.field_3853, var1);
      var3.field_9632.field_3874 = ((class_4378)var7).method_20393();
      var3.method_8609(var7);
   }

   U method_21600(T var1, class_7051 var2, ITextComponent var3);
}
