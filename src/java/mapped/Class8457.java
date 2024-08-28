package mapped;

import net.minecraft.util.text.ITextComponent;

public interface Class8457<T extends Class5812, U extends Screen & Class867<T>> {
   default void method29747(ITextComponent var1, Class8298<T> var2, Minecraft var3, int var4) {
      Screen var7 = this.method29748((T)var2.method29013(var4, var3.field1339.field4902), var3.field1339.field4902, var1);
      var3.field1339.field4905 = ((Class867)var7).method2628();
      var3.displayGuiScreen(var7);
   }

   U method29748(T var1, Class974 var2, ITextComponent var3);
}
