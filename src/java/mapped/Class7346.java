package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import java.util.List;

public class Class7346 {
   private static String[] field31452;
   private final List<Class8995> field31453 = Lists.newArrayList();
   private int field31454;

   public Class7346 method23288(int var1, float var2) {
      this.field31453.add(new Class8995(var1, var2));
      this.method23289();
      return this;
   }

   private void method23289() {
      Int2ObjectAVLTreeMap var3 = new Int2ObjectAVLTreeMap();
      this.field31453.forEach(var1 -> {
         Class8995 var4 = (Class8995)var3.put(var1.method33234(), var1);
      });
      this.field31453.clear();
      this.field31453.addAll(var3.values());
      this.field31454 = 0;
   }

   public float method23290(int var1) {
      if (this.field31453.size() <= 0) {
         return 0.0F;
      } else {
         Class8995 var4 = this.field31453.get(this.field31454);
         Class8995 var5 = this.field31453.get(this.field31453.size() - 1);
         boolean var6 = var1 < var4.method33234();
         int var7 = !var6 ? this.field31454 : 0;
         float var8 = !var6 ? var4.method33235() : var5.method33235();

         for (int var9 = var7; var9 < this.field31453.size(); var9++) {
            Class8995 var10 = this.field31453.get(var9);
            if (var10.method33234() > var1) {
               break;
            }

            this.field31454 = var9;
            var8 = var10.method33235();
         }

         return var8;
      }
   }
}
