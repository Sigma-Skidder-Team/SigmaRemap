package mapped;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8653 extends Class8652 {
   private final Entity field38991;

   public Class8653(String var1, Entity var2, Entity var3) {
      super(var1, var2);
      this.field38991 = var3;
   }

   @Nullable
   @Override
   public Entity method31113() {
      return this.field38989;
   }

   @Nullable
   @Override
   public Entity method31109() {
      return this.field38991;
   }

   @Override
   public ITextComponent method31110(Class880 var1) {
      ITextComponent var4 = this.field38991 != null ? this.field38991.getDisplayName() : this.field38989.getDisplayName();
      ItemStack var5 = !(this.field38991 instanceof Class880) ? ItemStack.EMPTY : ((Class880)this.field38991).method3090();
      String var6 = "death.attack." + this.field39022;
      String var7 = var6 + ".item";
      return !var5.isEmpty() && var5.method32152()
         ? new TranslationTextComponent(var7, var1.getDisplayName(), var4, var5.method32173())
         : new TranslationTextComponent(var6, var1.getDisplayName(), var4);
   }
}
