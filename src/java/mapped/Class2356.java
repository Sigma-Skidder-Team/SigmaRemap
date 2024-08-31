package mapped;

import com.google.common.collect.ForwardingList;
import net.minecraft.nbt.CompoundNBT;

import java.util.List;

public class Class2356 extends ForwardingList<ItemStack> {
   private static String[] field16169;
   private final NonNullList<ItemStack> field16170 = NonNullList.<ItemStack>method68(PlayerInventory.method4029(), ItemStack.EMPTY);

   public List<ItemStack> delegate() {
      return this.field16170;
   }

   public ListNBT method9284() {
      ListNBT var3 = new ListNBT();

      for (ItemStack var5 : this.delegate()) {
         var3.add(var5.method32112(new CompoundNBT()));
      }

      return var3;
   }

   public void method9285(ListNBT var1) {
      List var4 = this.delegate();

      for (int var5 = 0; var5 < var4.size(); var5++) {
         var4.set(var5, ItemStack.method32104(var1.method153(var5)));
      }
   }

   public boolean isEmpty() {
      for (ItemStack var4 : this.delegate()) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }
}
