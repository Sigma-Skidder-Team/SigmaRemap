package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Class9390 {
   private static String[] field43579;
   private final List<Class7495> field43580;
   private final List<Object> field43581;

   public Class9390(List<Class7495> var1, List<Object> var2) {
      this.field43580 = var1;
      this.field43581 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof Class9390)) {
            return false;
         } else {
            Class9390 var4 = (Class9390)var1;
            return Objects.equals(this.field43580, var4.field43580) && Objects.equals(this.field43581, var4.field43581);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.field43580.hashCode() + this.field43581.hashCode();
   }

   public static Class9390 method35649(BlockState var0, Class7498 var1, Collection<Property<?>> var2) {
      StateContainer var5 = var0.getBlock().getStateContainer();
      List var6 = var1.method24447()
         .stream()
         .filter(var2x -> var2x.method35408(var5).test(var0))
         .<Class7497>map(Class9350::method35407)
         .collect(ImmutableList.toImmutableList());
      List var7 = method35651(var0, var2);
      return new Class9390(var6, var7);
   }

   public static Class9390 method35650(BlockState var0, Class7495 var1, Collection<Property<?>> var2) {
      List var5 = method35651(var0, var2);
      return new Class9390(ImmutableList.of(var1), var5);
   }

   private static List<Object> method35651(BlockState var0, Collection<Property<?>> var1) {
      return var1.stream().map(var0::get).collect(ImmutableList.toImmutableList());
   }
}
