package mapped;

import com.mojang.datafixers.DataFixer;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.function.Supplier;

public class Class1648 implements AutoCloseable {
   private final Class1707 field8947;
   public final DataFixer field8948;
   private Class8418 field8949;

   public Class1648(File var1, DataFixer var2, boolean var3) {
      this.field8948 = var2;
      this.field8947 = new Class1707(var1, var3, "chunk");
   }

   public Class39 method6529(Class8705<World> var1, Supplier<Class8250> var2, Class39 var3) {
      int var6 = method6530(var3);
      short var7 = 1493;
      if (var6 < 1493) {
         var3 = Class8354.method29290(this.field8948, Class2108.field13750, var3, var6, 1493);
         if (var3.method130("Level").method132("hasLegacyStructureData")) {
            if (this.field8949 == null) {
               this.field8949 = Class8418.method29580(var1, (Class8250)var2.get());
            }

            var3 = this.field8949.method29575(var3);
         }
      }

      var3 = Class8354.method29289(this.field8948, Class2108.field13750, var3, Math.max(1493, var6));
      if (var6 < SharedConstants.method34773().getWorldVersion()) {
         var3.method102("DataVersion", SharedConstants.method34773().getWorldVersion());
      }

      return var3;
   }

   public static int method6530(Class39 var0) {
      return !var0.method119("DataVersion", 99) ? -1 : var0.method122("DataVersion");
   }

   @Nullable
   public Class39 method6531(Class7481 var1) throws IOException {
      return this.field8947.method7412(var1);
   }

   public void method6532(Class7481 var1, Class39 var2) {
      this.field8947.method7411(var1, var2);
      if (this.field8949 != null) {
         this.field8949.method29574(var1.method24352());
      }
   }

   public void method6533() {
      this.field8947.method7413().join();
   }

   @Override
   public void close() throws IOException {
      this.field8947.close();
   }
}