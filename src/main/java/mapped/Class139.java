package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class Class139 extends Class128 {
   private static String[] field467;
   private final Class2138 field468;

   public Class139(ILootCondition[] var1, Class2138 var2) {
      super(var1);
      this.field468 = var2;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.COPY_NAME;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(this.field468.field14001);
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      Object var5 = var2.method26081(this.field468.field14001);
      if (var5 instanceof INameable) {
         INameable var6 = (INameable)var5;
         if (var6.method3381()) {
            var1.method32150(var6.getDisplayName());
         }
      }

      return var1;
   }

   public static Class5876<?> method417(Class2138 var0) {
      return method372(var1 -> new Class139(var1, var0));
   }

   // $VF: synthetic method
   public static Class2138 method419(Class139 var0) {
      return var0.field468;
   }
}
