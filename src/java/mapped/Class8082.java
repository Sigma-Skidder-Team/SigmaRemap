package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapLike;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class Class8082 implements MapLike<Class30> {
   public final Class39 field34734;
   public final Class8063 field34735;

   public Class8082(Class8063 var1, Class39 var2) {
      this.field34735 = var1;
      this.field34734 = var2;
   }

   @Nullable
   public Class30 get(Class30 var1) {
      return this.field34734.method116(var1.method81());
   }

   @Nullable
   public Class30 get(String var1) {
      return this.field34734.method116(var1);
   }

   public Stream<Pair<Class30, Class30>> entries() {
      return this.field34734.method97().stream().<Pair<Class30, Class30>>map(var2 -> Pair.of(this.field34735.createString(var2), this.field34734.method116(var2)));
   }

   @Override
   public String toString() {
      return "MapLike[" + this.field34734 + "]";
   }
}
