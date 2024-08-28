package mapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.Validate;

public class Class3301 extends Class3298 {
   public Class3301(Block var1, Block var2, Class5643 var3) {
      super(var1, var2, var3);
      Validate.isInstanceOf(Class3359.class, var1);
      Validate.isInstanceOf(Class3359.class, var2);
   }

   public static void method11848(Class8848 var0, List<ITextComponent> var1) {
      Class39 var4 = var0.method32145("BlockEntityTag");
      if (var4 != null && var4.method118("Patterns")) {
         Class41 var5 = var4.method131("Patterns", 10);

         for (int var6 = 0; var6 < var5.size() && var6 < 6; var6++) {
            Class39 var7 = var5.method153(var6);
            Class112 var8 = Class112.method315(var7.method122("Color"));
            Class2154 var9 = Class2154.method8872(var7.method126("Pattern"));
            if (var9 != null) {
               var1.add(new TranslationTextComponent("block.minecraft.banner." + var9.method8870() + '.' + var8.method310()).mergeStyle(TextFormatting.GRAY));
            }
         }
      }
   }

   public Class112 method11849() {
      return ((Class3359)this.method11845()).method11936();
   }

   @Override
   public void method11730(Class8848 var1, Class1655 var2, List<ITextComponent> var3, Class2216 var4) {
      method11848(var1, var3);
   }
}
