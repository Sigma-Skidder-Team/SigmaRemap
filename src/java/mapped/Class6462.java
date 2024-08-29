package mapped;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Class6462 {
   private static String[] field28397;
   private final Map<Item, Class8498> field28398 = Maps.newHashMap();
   private int field28399;

   public boolean method19635(Item var1) {
      return this.method19636(var1, 0.0F) > 0.0F;
   }

   public float method19636(Item var1, float var2) {
      Class8498 var5 = this.field28398.get(var1);
      if (var5 == null) {
         return 0.0F;
      } else {
         float var6 = (float)(Class8498.method30088(var5) - Class8498.method30089(var5));
         float var7 = (float)Class8498.method30088(var5) - ((float)this.field28399 + var2);
         return MathHelper.method37777(var7 / var6, 0.0F, 1.0F);
      }
   }

   public void method19637() {
      this.field28399++;
      if (!this.field28398.isEmpty()) {
         Iterator var3 = this.field28398.entrySet().iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            if (Class8498.method30088((Class8498)var4.getValue()) <= this.field28399) {
               var3.remove();
               this.method19634((Item)var4.getKey());
            }
         }
      }
   }

   public void method19638(Item var1, int var2) {
      this.field28398.put(var1, new Class8498(this, this.field28399, this.field28399 + var2));
      this.method19633(var1, var2);
   }

   public void method19639(Item var1) {
      this.field28398.remove(var1);
      this.method19634(var1);
   }

   public void method19633(Item var1, int var2) {
   }

   public void method19634(Item var1) {
   }
}
