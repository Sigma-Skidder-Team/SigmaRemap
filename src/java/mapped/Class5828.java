package mapped;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeBookCategory;

public abstract class Class5828<C extends IInventory> extends Container {
   public Class5828(ContainerType<?> var1, int var2) {
      super(var1, var2);
   }

   public void method18219(boolean var1, IRecipe<?> var2, ServerPlayerEntity var3) {
      new Class1260<C>(this).method5868(var3, (IRecipe<C>) var2, var1);
   }

   public abstract void method18220(Class6207 var1);

   public abstract void method18221();

   public abstract boolean method18222(IRecipe<? super C> var1);

   public abstract int method18223();

   public abstract int method18224();

   public abstract int method18225();

   public abstract int method18226();

   public abstract RecipeBookCategory method18227();
}
