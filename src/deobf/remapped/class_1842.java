package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import java.util.List;

public class class_1842 {
   private static String[] field_9356;
   private final List<class_6638> field_9357 = Lists.newArrayList();
   private int field_9355;

   public class_1842 method_8144(int var1, float var2) {
      this.field_9357.add(new class_6638(var1, var2));
      this.method_8143();
      return this;
   }

   private void method_8143() {
      Int2ObjectAVLTreeMap var3 = new Int2ObjectAVLTreeMap();
      this.field_9357.forEach(var1 -> {
         class_6638 var4 = (class_6638)var3.put(var1.method_30504(), var1);
      });
      this.field_9357.clear();
      this.field_9357.addAll(var3.values());
      this.field_9355 = 0;
   }

   public float method_8142(int var1) {
      if (this.field_9357.size() <= 0) {
         return 0.0F;
      } else {
         class_6638 var4 = this.field_9357.get(this.field_9355);
         class_6638 var5 = this.field_9357.get(this.field_9357.size() - 1);
         boolean var6 = var1 < var4.method_30504();
         int var7 = !var6 ? this.field_9355 : 0;
         float var8 = !var6 ? var4.method_30502() : var5.method_30502();

         for (int var9 = var7; var9 < this.field_9357.size(); var9++) {
            class_6638 var10 = this.field_9357.get(var9);
            if (var10.method_30504() > var1) {
               break;
            }

            this.field_9355 = var9;
            var8 = var10.method_30502();
         }

         return var8;
      }
   }
}
