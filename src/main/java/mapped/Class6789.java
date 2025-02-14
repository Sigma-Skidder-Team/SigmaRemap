package mapped;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public abstract class Class6789<T> {
   private final T field29584;

   public Class6789(T var1) {
      this.field29584 = (T)var1;
   }

   @Nullable
   public T method20686() {
      return this.field29584;
   }

   public boolean method20684() {
      return false;
   }

   public abstract void method20678(JsonObject var1);
}
