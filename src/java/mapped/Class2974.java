package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

import java.util.List;

public class Class2974 extends Class2961<Class4712> {
   private static final List<Class6692> field18087 = ImmutableList.of(new Class6692(Class8992.field41101, 1, 1, 1));
   private static final List<Class6692> field18088 = ImmutableList.of(new Class6692(Class8992.field41012, 1, 1, 1));

   public Class2974(Codec<Class4712> var1) {
      super(var1);
   }

   @Override
   public Class7072<Class4712> method11359() {
      return Class5458::new;
   }

   @Override
   public List<Class6692> method11374() {
      return field18087;
   }

   @Override
   public List<Class6692> method11375() {
      return field18088;
   }
}
