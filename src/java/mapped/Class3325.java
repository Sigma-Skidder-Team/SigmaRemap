package mapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class Class3325 extends Class3324 {
   private static String[] field18833;

   public Class3325(Class5643 var1) {
      super(var1);
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      Class9741.method38189(var1, var3, 0.25F);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      var1.method6743(
         (PlayerEntity)null,
         var2.getPosX(),
         var2.getPosY(),
         var2.getPosZ(),
         Class6067.field26733,
         Class2266.field14734,
         0.5F,
         0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
      );
      return super.method11700(var1, var2, var3);
   }
}