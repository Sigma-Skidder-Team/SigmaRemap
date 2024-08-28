package mapped;

import java.util.function.Consumer;

public enum Class1956 {
   field12749(var0 -> {
   }),
   field12750(Class7271::method22838);

   private final Consumer<Class7271<?>> field12751;
   private static final Class1956[] field12752 = new Class1956[]{field12749, field12750};

   private Class1956(Consumer<Class7271<?>> var3) {
      this.field12751 = var3;
   }

   public void method8219(Class7271<?> var1) {
      this.field12751.accept(var1);
   }
}
