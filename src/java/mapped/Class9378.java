package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class Class9378 {
   public static final Codec<Class9378> field43522 = RecordCodecBuilder.create(
      var0 -> var0.group(
               World.field8998.fieldOf("dimension").forGetter(Class9378::method35578),
               BlockPos.field13030.fieldOf("pos").forGetter(Class9378::method35579)
            )
            .apply(var0, Class9378::method35577)
   );
   private final RegistryKey<World> field43523;
   private final BlockPos field43524;

   private Class9378(RegistryKey<World> var1, BlockPos var2) {
      this.field43523 = var1;
      this.field43524 = var2;
   }

   public static Class9378 method35577(RegistryKey<World> var0, BlockPos var1) {
      return new Class9378(var0, var1);
   }

   public RegistryKey<World> method35578() {
      return this.field43523;
   }

   public BlockPos method35579() {
      return this.field43524;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class9378 var4 = (Class9378)var1;
         return Objects.equals(this.field43523, var4.field43523) && Objects.equals(this.field43524, var4.field43524);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field43523, this.field43524);
   }

   @Override
   public String toString() {
      return this.field43523.toString() + " " + this.field43524;
   }
}
