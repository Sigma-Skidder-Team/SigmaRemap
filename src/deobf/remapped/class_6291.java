package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class class_6291 {
   public static final Codec<class_6291> field_32155 = class_8669.field_44454.dispatch(class_6291::method_28707, class_8783::method_40372);

   public abstract class_8783<?> method_28707();

   public abstract void method_28703(class_700 var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, class_9616 var6);

   public void method_28705(class_1678 var1, BlockPos var2, class_6720 var3, Set<BlockPos> var4, class_9616 var5) {
      this.method_28706(var1, var2, class_4783.field_23323.method_29260().method_10308(var3, Boolean.valueOf(true)), var4, var5);
   }

   public void method_28706(class_1678 var1, BlockPos var2, class_2522 var3, Set<BlockPos> var4, class_9616 var5) {
      var1.method_7513(var2, var3, 19);
      var4.add(var2);
      var5.method_44392(new class_9616(var2, var2));
   }
}
