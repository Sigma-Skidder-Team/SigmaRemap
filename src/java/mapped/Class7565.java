package mapped;

import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Class7565 implements Class7562 {
   private static final Splitter field32494 = Splitter.on('|').omitEmptyStrings();
   private final String field32495;
   private final String field32496;

   public Class7565(String var1, String var2) {
      this.field32495 = var1;
      this.field32496 = var2;
   }

   @Override
   public Predicate<BlockState> method24750(Class9348<Block, BlockState> var1) {
      Class8550 var4 = var1.method35396(this.field32495);
      if (var4 == null) {
         throw new RuntimeException(String.format("Unknown property '%s' on '%s'", this.field32495, ((Block)var1.method35394()).toString()));
      } else {
         String var5 = this.field32496;
         boolean var6 = !var5.isEmpty() && var5.charAt(0) == '!';
         if (var6) {
            var5 = var5.substring(1);
         }

         List<String> var7 = field32494.splitToList(var5);
         if (!var7.isEmpty()) {
            Predicate<BlockState> var9;
            if (var7.size() != 1) {
               List<Predicate<BlockState>> var8 = var7.stream().<Predicate<BlockState>>map(var3 -> this.method24761(var1, var4, var3)).collect(Collectors.toList());
               var9 = var1x -> var8.stream().anyMatch(var1xx -> var1xx.test(var1x));
            } else {
               var9 = this.method24761(var1, var4, var5);
            }

            return !var6 ? var9 : var9.negate();
         } else {
            throw new RuntimeException(
               String.format("Empty value '%s' for property '%s' on '%s'", this.field32496, this.field32495, ((Block)var1.method35394()).toString())
            );
         }
      }
   }

   private Predicate<BlockState> method24761(Class9348<Block, BlockState> var1, Class8550<?> var2, String var3) {
      Optional var6 = var2.method30476(var3);
      if (var6.isPresent()) {
         return var2x -> var2x.method23463(var2).equals(var6.get());
      } else {
         throw new RuntimeException(
            String.format(
               "Unknown value '%s' for property '%s' on '%s' in '%s'", var3, this.field32495, ((Block)var1.method35394()).toString(), this.field32496
            )
         );
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("key", this.field32495).add("value", this.field32496).toString();
   }
}
