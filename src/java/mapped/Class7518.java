package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class7518 implements Class7519 {
   private static String[] field32250;
   private final List<ILootCondition> field32251 = Lists.newArrayList();

   public Class7518(Class7519... var1) {
      for (Class7519 var7 : var1) {
         this.field32251.add(var7.method24517());
      }
   }

   @Override
   public Class7518 method24516(Class7519 var1) {
      this.field32251.add(var1.method24517());
      return this;
   }

   @Override
   public ILootCondition method24517() {
      return new Class150(this.field32251.<ILootCondition>toArray(new ILootCondition[0]));
   }
}
