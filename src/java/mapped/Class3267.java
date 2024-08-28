package mapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;

public class Class3267 extends Class3266 implements Class3260 {
   private final float field18761;
   private final Multimap<Class4869, Class9689> field18762;

   public Class3267(Class2283 var1, int var2, float var3, Class5643 var4) {
      super(var1, var4);
      this.field18761 = (float)var2 + var1.method9012();
      Builder var7 = ImmutableMultimap.builder();
      var7.put(Class9173.field42110, new Class9689(field18733, "Weapon modifier", (double)this.field18761, Class2045.field13352));
      var7.put(Class9173.field42112, new Class9689(field18734, "Weapon modifier", (double)var3, Class2045.field13352));
      this.field18762 = var7.build();
   }

   public float method11784() {
      return this.field18761;
   }

   @Override
   public boolean method11706(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4) {
      return !var4.method2801();
   }

   @Override
   public float method11708(ItemStack var1, Class7380 var2) {
      if (var2.method23448(Blocks.COBWEB)) {
         return 15.0F;
      } else {
         Class8649 var5 = var2.method23384();
         return var5 != Class8649.field38936
               && var5 != Class8649.field38938
               && var5 != Class8649.field38972
               && !var2.method23446(Class7645.field32767)
               && var5 != Class8649.field38973
            ? 1.0F
            : 1.5F;
      }
   }

   @Override
   public boolean method11713(ItemStack var1, Class880 var2, Class880 var3) {
      var1.method32121(1, var3, var0 -> var0.method3184(Class2106.field13731));
      return true;
   }

   @Override
   public boolean method11714(ItemStack var1, Class1655 var2, Class7380 var3, BlockPos var4, Class880 var5) {
      if (var3.method23405(var2, var4) != 0.0F) {
         var1.method32121(2, var5, var0 -> var0.method3184(Class2106.field13731));
      }

      return true;
   }

   @Override
   public boolean method11715(Class7380 var1) {
      return var1.method23448(Blocks.COBWEB);
   }

   @Override
   public Multimap<Class4869, Class9689> method11740(Class2106 var1) {
      return var1 != Class2106.field13731 ? super.method11740(var1) : this.field18762;
   }
}
