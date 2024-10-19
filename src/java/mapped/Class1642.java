package mapped;

import java.util.function.Consumer;

public final class Class1642<Msg> implements Class321<Msg> {
   private static String[] field8917;
   public final String field8918;
   public final Consumer field8919;

   public Class1642(String var1, Consumer var2) {
      this.field8918 = var1;
      this.field8919 = var2;
   }

   @Override
   public String method1631() {
      return this.field8918;
   }

   @Override
   public void enqueue(Msg var1) {
      this.field8919.accept(var1);
   }

   @Override
   public String toString() {
      return this.field8918;
   }
}
