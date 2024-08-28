package mapped;

import com.google.common.collect.ForwardingList;

import java.util.List;

public class Class2356 extends ForwardingList<ItemStack> {
   private static String[] field16169;
   private final Class25<ItemStack> field16170 = Class25.<ItemStack>method68(Class974.method4029(), ItemStack.EMPTY);

   public List<ItemStack> delegate() {
      return this.field16170;
   }

   public Class41 method9284() {
      Class41 var3 = new Class41();

      for (ItemStack var5 : this.delegate()) {
         var3.add(var5.method32112(new Class39()));
      }

      return var3;
   }

   public void method9285(Class41 var1) {
      List var4 = this.delegate();

      for (int var5 = 0; var5 < var4.size(); var5++) {
         var4.set(var5, ItemStack.method32104(var1.method153(var5)));
      }
   }

   public boolean isEmpty() {
      for (ItemStack var4 : this.delegate()) {
         if (!var4.method32105()) {
            return false;
         }
      }

      return true;
   }
}
