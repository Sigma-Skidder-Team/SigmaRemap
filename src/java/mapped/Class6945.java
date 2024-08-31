package mapped;

import net.minecraft.nbt.CompoundNBT;

public abstract class Class6945<T, C extends Class6861<T>> {
   private final ResourceLocation field30096;
   private final Class<?> field30097;

   public Class6945(ResourceLocation var1, Class<?> var2) {
      this.field30096 = var1;
      this.field30097 = var2;
   }

   public ResourceLocation method21398() {
      return this.field30096;
   }

   public Class<?> method21399() {
      return this.field30097;
   }

   public abstract void method21397(CompoundNBT var1, C var2);

   public abstract C method21396(CompoundNBT var1);
}
