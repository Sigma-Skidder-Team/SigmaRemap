package mapped;

import java.io.IOException;

public class Class4995 extends Class4975 {
   private String field22926;

   public Class4995() {
      super("Requirement Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field22926 = var1.readString((int)this.method15430(var1));
   }

   public String method15340() {
      return this.field22926;
   }
}
