package remapped;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class class_3882 extends class_3599 {
   private static String[] field_18894;
   private final AbstractRaiderEntity field_18898;
   private final double field_18893;
   private BlockPos field_18897;
   private final List<BlockPos> field_18892 = Lists.newArrayList();
   private final int field_18896;
   private boolean field_18895;

   public class_3882(AbstractRaiderEntity var1, double var2, int var4) {
      this.field_18898 = var1;
      this.field_18893 = var2;
      this.field_18896 = var4;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      this.method_17952();
      return this.method_17950() && this.method_17949() && this.field_18898.method_17809() == null;
   }

   private boolean method_17950() {
      return this.field_18898.method_18600() && !this.field_18898.method_18589().method_11259();
   }

   private boolean method_17949() {
      class_6331 var3 = (class_6331)this.field_18898.world;
      BlockPos var4 = this.field_18898.method_37075();
      Optional var5 = var3.method_28969()
         .method_6881(var0 -> var0 == class_236.field_778, this::method_17951, class_8122.field_41615, var4, 48, AbstractRaiderEntity.method_18603(this.field_18898));
      if (var5.isPresent()) {
         this.field_18897 = ((BlockPos)var5.get()).method_6072();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return this.field_18898.method_26927().method_5591()
         ? false
         : this.field_18898.method_17809() == null
            && !this.field_18897.method_12170(this.field_18898.method_37245(), (double)(this.field_18898.method_37086() + (float)this.field_18896))
            && !this.field_18895;
   }

   @Override
   public void method_16793() {
      if (this.field_18897.method_12170(this.field_18898.method_37245(), (double)this.field_18896)) {
         this.field_18892.add(this.field_18897);
      }
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_18898.method_26441(0);
      this.field_18898
         .method_26927()
         .method_5595(
            (double)this.field_18897.method_12173(), (double)this.field_18897.method_12165(), (double)this.field_18897.method_12185(), this.field_18893
         );
      this.field_18895 = false;
   }

   @Override
   public void method_16794() {
      if (this.field_18898.method_26927().method_5591()) {
         class_1343 var3 = class_1343.method_6200(this.field_18897);
         class_1343 var4 = class_3425.method_15841(this.field_18898, 16, 7, var3, (float) (Math.PI / 10));
         if (var4 == null) {
            var4 = class_3425.method_15837(this.field_18898, 8, 7, var3);
         }

         if (var4 == null) {
            this.field_18895 = true;
            return;
         }

         this.field_18898.method_26927().method_5595(var4.field_7336, var4.field_7333, var4.field_7334, this.field_18893);
      }
   }

   private boolean method_17951(BlockPos var1) {
      for (BlockPos var5 : this.field_18892) {
         if (Objects.equals(var1, var5)) {
            return false;
         }
      }

      return true;
   }

   private void method_17952() {
      if (this.field_18892.size() > 2) {
         this.field_18892.remove(0);
      }
   }
}
