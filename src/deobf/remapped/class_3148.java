package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class class_3148 extends class_5837 {
   private final List<class_3765> field_15658;

   private class_3148(class_7279[] var1, List<class_3765> var2) {
      super(var1);
      this.field_15658 = ImmutableList.copyOf(var2);
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26393;
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      if (!var1.method_28022()) {
         class_2831 var5 = class_2831.method_12874();
         this.field_15658.forEach(var2x -> var2x.method_4277(var2, var2xx -> var2xx.method_10529(class_1758.method_7861(var5::add), var2)));
         CompoundNBT var6 = new CompoundNBT();
         class_3037.method_13878(var6, var5);
         CompoundNBT var7 = var1.method_27994();
         var7.put("BlockEntityTag", var6.method_25925(var7.getCompound("BlockEntityTag")));
         return var1;
      } else {
         return var1;
      }
   }

   @Override
   public void method_12680(class_4737 var1) {
      super.method_12680(var1);

      for (int var4 = 0; var4 < this.field_15658.size(); var4++) {
         this.field_15658.get(var4).method_17436(var1.method_21888(".entry[" + var4 + "]"));
      }
   }

   public static class_9100 method_14541() {
      return new class_9100();
   }
}
