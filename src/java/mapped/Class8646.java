package mapped;

import com.google.gson.JsonElement;
import java.util.function.Consumer;

public abstract class Class8646 {
   private final String field38926;

   public Class8646(String var1) {
      this.field38926 = var1;
   }

   public <S extends Class7378<?, S>> boolean method31078(Class9348<?, S> var1, S var2) {
      Class8550 var5 = var1.method35396(this.field38926);
      return var5 != null ? this.method31076(var2, var5) : false;
   }

   public abstract <T extends Comparable<T>> boolean method31076(Class7378<?, ?> var1, Class8550<T> var2);

   public abstract JsonElement method31077();

   public String method31079() {
      return this.field38926;
   }

   public void method31080(Class9348<?, ?> var1, Consumer<String> var2) {
      Class8550 var5 = var1.method35396(this.field38926);
      if (var5 == null) {
         var2.accept(this.field38926);
      }
   }
}
