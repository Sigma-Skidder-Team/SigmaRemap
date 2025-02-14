package mapped;

import com.google.gson.JsonElement;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.StateHolder;

import java.util.function.Consumer;

public abstract class Class8646 {
   private final String field38926;

   public Class8646(String var1) {
      this.field38926 = var1;
   }

   public <S extends StateHolder<?, S>> boolean method31078(StateContainer<?, S> var1, S var2) {
      Property var5 = var1.getProperty(this.field38926);
      return var5 != null ? this.method31076(var2, var5) : false;
   }

   public abstract <T extends Comparable<T>> boolean method31076(StateHolder<?, ?> var1, Property<T> var2);

   public abstract JsonElement method31077();

   public String method31079() {
      return this.field38926;
   }

   public void method31080(StateContainer<?, ?> var1, Consumer<String> var2) {
      Property var5 = var1.getProperty(this.field38926);
      if (var5 == null) {
         var2.accept(this.field38926);
      }
   }
}
