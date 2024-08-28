package mapped;

import java.util.function.Consumer;

public class Class6550 extends Class6548 {
   private static String[] field28907;
   public final Class4686 field28908;

   public Class6550(Class4686 var1) {
      super(var1);
      this.field28908 = var1;
   }

   @Override
   public void method19893(Consumer<ItemStack> var1, LootContext var2) {
      this.field28908.method14695(ILootFunction.method369(Class4686.method14705(this.field28908), var1, var2), var2);
   }
}
