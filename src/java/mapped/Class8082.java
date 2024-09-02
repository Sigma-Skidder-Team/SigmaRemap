package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapLike;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;

import java.util.stream.Stream;
import javax.annotation.Nullable;

public class Class8082 implements MapLike<INBT> {
   public final CompoundNBT field34734;
   public final NBTDynamicOps field34735;

   public Class8082(NBTDynamicOps var1, CompoundNBT var2) {
      this.field34735 = var1;
      this.field34734 = var2;
   }

   @Nullable
   public INBT get(INBT var1) {
      return this.field34734.method116(var1.getString());
   }

   @Nullable
   public INBT get(String var1) {
      return this.field34734.method116(var1);
   }

   public Stream<Pair<INBT, INBT>> entries() {
      return this.field34734.method97().stream().<Pair<INBT, INBT>>map(var2 -> Pair.of(this.field34735.createString(var2), this.field34734.method116(var2)));
   }

   @Override
   public String toString() {
      return "MapLike[" + this.field34734 + "]";
   }
}
