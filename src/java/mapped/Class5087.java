package mapped;

import java.io.IOException;

public class Class5087 extends Class4975 {
   private long field23147;
   private long field23148;
   private int field23149;

   public Class5087() {
      super("Meta Box Relation Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field23147 = var1.method31863(4);
      this.field23148 = var1.method31863(4);
      this.field23149 = var1.method31861();
   }

   public long method15545() {
      return this.field23147;
   }

   public long method15546() {
      return this.field23148;
   }

   public int method15547() {
      return this.field23149;
   }
}
