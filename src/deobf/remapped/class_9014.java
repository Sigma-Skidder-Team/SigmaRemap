package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.List;

public class class_9014 implements Packet<class_392> {
   private static String[] field_46114;
   private int field_46115;
   private final List<Pair<class_6943, ItemStack>> field_46116;

   public class_9014() {
      this.field_46116 = Lists.newArrayList();
   }

   public class_9014(int var1, List<Pair<class_6943, ItemStack>> var2) {
      this.field_46115 = var1;
      this.field_46116 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_46115 = var1.method_37778();
      class_6943[] var4 = class_6943.values();
      byte var5 = var1.readByte();
      class_6943 var6 = var4[var5 & 127];
      ItemStack var7 = var1.method_37755();
      this.field_46116.add(Pair.of(var6, var7));
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_46115);
      int var4 = this.field_46116.size();

      for (int var5 = 0; var5 < var4; var5++) {
         Pair var6 = this.field_46116.get(var5);
         class_6943 var7 = (class_6943)var6.getFirst();
         boolean var8 = var5 != var4 - 1;
         int var9 = var7.ordinal();
         var1.writeByte(!var8 ? var9 : var9 | -128);
         var1.method_37764((ItemStack)var6.getSecond());
      }
   }

   public void method_41366(class_392 var1) {
      var1.method_1957(this);
   }

   public int method_41364() {
      return this.field_46115;
   }

   public List<Pair<class_6943, ItemStack>> method_41363() {
      return this.field_46116;
   }
}
