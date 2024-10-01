package mapped;

import java.io.IOException;

public class Class4974 extends Class4975 {
   private long field22845;
   private int field22846;
   private int field22847;
   private int field22848;

   public Class4974() {
      super("Color Parameter Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field22845 = var1.readBits(4);
      this.field22846 = (int)var1.readBits(2);
      this.field22847 = (int)var1.readBits(2);
      this.field22848 = (int)var1.readBits(2);
   }
}
