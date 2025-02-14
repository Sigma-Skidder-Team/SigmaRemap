package mapped;

import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class Class6816 {
   private static String[] field29679;
   private final Path field29680;
   private ServerProperties field29681;

   public Class6816(DynamicRegistries var1, Path var2) {
      this.field29680 = var2;
      this.field29681 = ServerProperties.method36271(var1, var2);
   }

   public ServerProperties getProperties() {
      return this.field29681;
   }

   public void method20780() {
      this.field29681.method36247(this.field29680);
   }

   public Class6816 method20781(UnaryOperator<ServerProperties> var1) {
      (this.field29681 = var1.apply(this.field29681)).method36247(this.field29680);
      return this;
   }
}
