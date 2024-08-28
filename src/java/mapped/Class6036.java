package mapped;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

public abstract class Class6036 extends Class6037 implements Class6052 {
   private final Map<Integer, Class1867> field26236 = new ConcurrentHashMap<Integer, Class1867>();
   private final Class1867 field26237;
   private int field26238;

   public Class6036(Class7161 var1, Class1867 var2) {
      super(var1);
      this.field26237 = var2;
   }

   public void method18665(int var1) {
      this.field26236.remove(var1);
   }

   public void method18666(int var1, Class1867 var2) {
      if (var2 != null && this.field26236 != null) {
         this.field26236.put(var1, var2);
      }
   }

   public boolean method18667(int var1) {
      return this.field26236.containsKey(var1);
   }

   @Nullable
   public Class1867 method18668(int var1) {
      return this.field26236.get(var1);
   }

   @Override
   public void method18669(int var1) {
      this.field26238 = var1;
      this.field26236.put(var1, this.field26237);
   }

   public int method18670() {
      return this.field26238;
   }

   public void method18671(int var1) {
      this.field26238 = var1;
   }
}
