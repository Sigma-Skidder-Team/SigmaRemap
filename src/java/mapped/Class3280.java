package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class3280 extends Class3257 {
   private static String[] field18787;
   private final Block field18788;

   public Class3280(Block var1, Class5643 var2) {
      super(var2);
      this.field18788 = var1;
   }

   @Override
   public String method11719() {
      return this.field18788.method11566();
   }

   @Override
   public void method11730(ItemStack var1, Class1655 var2, List<ITextComponent> var3, Class2216 var4) {
      super.method11730(var1, var2, var3, var4);
      this.field18788.method11583(var1, var2, var3, var4);
   }
}
