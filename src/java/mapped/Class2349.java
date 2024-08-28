package mapped;

import com.mojang.serialization.Lifecycle;

import java.util.OptionalInt;

public abstract class Class2349<T> extends Class2348<T> {
   public Class2349(Class8705<? extends Class2348<T>> var1, Lifecycle var2) {
      super(var1, var2);
   }

   public abstract <V extends T> V method9249(int var1, Class8705<T> var2, V var3, Lifecycle var4);

   public abstract <V extends T> V method9250(Class8705<T> var1, V var2, Lifecycle var3);

   public abstract <V extends T> V method9251(OptionalInt var1, Class8705<T> var2, V var3, Lifecycle var4);
}
