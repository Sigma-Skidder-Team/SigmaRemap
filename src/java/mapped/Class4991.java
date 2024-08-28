package mapped;

import java.io.IOException;

public class Class4991 extends Class4975 {
   private long field22906;
   private long field22907;
   private long field22908;
   private long field22909;

   public Class4991() {
      super("Hint Media Header Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field22906 = var1.method31863(2);
      this.field22907 = var1.method31863(2);
      this.field22908 = var1.method31863(4);
      this.field22909 = var1.method31863(4);
      var1.method31870(4L);
   }

   public long method15320() {
      return this.field22906;
   }

   public long method15321() {
      return this.field22907;
   }

   public long method15322() {
      return this.field22908;
   }

   public long method15323() {
      return this.field22909;
   }
}
