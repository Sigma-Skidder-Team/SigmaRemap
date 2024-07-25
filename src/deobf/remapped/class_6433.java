package remapped;

import com.mojang.serialization.Lifecycle;
import java.util.OptionalInt;

public abstract class class_6433<T> extends class_8669<T> {
   public class_6433(class_5621<? extends class_8669<T>> var1, Lifecycle var2) {
      super(var1, var2);
   }

   public abstract <V extends T> V method_29380(int var1, class_5621<T> var2, V var3, Lifecycle var4);

   public abstract <V extends T> V method_29381(class_5621<T> var1, V var2, Lifecycle var3);

   public abstract <V extends T> V method_29382(OptionalInt var1, class_5621<T> var2, V var3, Lifecycle var4);
}
