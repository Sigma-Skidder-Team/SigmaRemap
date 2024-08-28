package mapped;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public final class Class7433<T extends Class7436> extends Class7434<T> {
   private static String[] field31993;
   public final Function field31994;

   public Class7433(boolean var1, Class6865 var2, Function var3) {
      super(var1, var2);
      this.field31994 = var3;
   }

   @Override
   public Codec<T> method24005() {
      return (Codec<T>)this.field31994.apply(this);
   }
}
