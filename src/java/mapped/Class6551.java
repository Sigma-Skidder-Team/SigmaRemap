package mapped;

import java.util.function.Consumer;

public class Class6551 extends Class6548 {
   private static String[] field28909;
   public final Class3257 field28910;
   public final Class4685 field28911;

   public Class6551(Class4685 var1, Class3257 var2) {
      super(var1);
      this.field28911 = var1;
      this.field28910 = var2;
   }

   @Override
   public void method19893(Consumer<ItemStack> var1, LootContext var2) {
      var1.accept(new ItemStack(this.field28910));
   }
}
