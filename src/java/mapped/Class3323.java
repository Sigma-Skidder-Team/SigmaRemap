package mapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class Class3323 extends Class3257 {
   public Class3323(Class5643 var1) {
      super(var1);
   }

   @Override
   public ItemStack method11742() {
      return Class9741.method38187(super.method11742(), Class8137.field34977);
   }

   @Override
   public ItemStack method11709(ItemStack var1, World var2, Class880 var3) {
      PlayerEntity var6 = !(var3 instanceof PlayerEntity) ? null : (PlayerEntity)var3;
      if (var6 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44490.method15174((ServerPlayerEntity)var6, var1);
      }

      if (!var2.field9020) {
         for (Class2023 var8 : Class9741.method38176(var1)) {
            if (!var8.method8627().method22292()) {
               var3.method3035(new Class2023(var8));
            } else {
               var8.method8627().method22290(var6, var6, var3, var8.method8629(), 1.0);
            }
         }
      }

      if (var6 != null) {
         var6.method2913(Class8876.field40098.method172(this));
         if (!var6.field4919.field29609) {
            var1.method32182(1);
         }
      }

      if (var6 == null || !var6.field4919.field29609) {
         if (var1.method32105()) {
            return new ItemStack(Class8514.field37972);
         }

         if (var6 != null) {
            var6.field4902.method4045(new ItemStack(Class8514.field37972));
         }
      }

      return var1;
   }

   @Override
   public int method11728(ItemStack var1) {
      return 32;
   }

   @Override
   public Class2103 method11727(ItemStack var1) {
      return Class2103.field13708;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      return Class8482.method29977(var1, var2, var3);
   }

   @Override
   public String method11720(ItemStack var1) {
      return Class9741.method38185(var1).method31815(this.method11719() + ".effect.");
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      Class9741.method38189(var1, var3, 1.0F);
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return super.method11732(var1) || !Class9741.method38176(var1).isEmpty();
   }

   @Override
   public void method11737(Class7401 var1, Class25<ItemStack> var2) {
      if (this.method11738(var1)) {
         for (Class8812 var6 : Class2348.field16076) {
            if (var6 != Class8137.field34976) {
               var2.add(Class9741.method38187(new ItemStack(this), var6));
            }
         }
      }
   }
}