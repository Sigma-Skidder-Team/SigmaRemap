package remapped;

import java.io.IOException;

public class class_6639 implements Packet<class_392> {
   private static String[] field_34369;
   private int field_34368;
   private class_1331 field_34370;
   private int field_34367;
   private boolean field_34371;

   public class_6639() {
   }

   public class_6639(int var1, class_1331 var2, int var3, boolean var4) {
      this.field_34368 = var1;
      this.field_34370 = var2.method_6072();
      this.field_34367 = var3;
      this.field_34371 = var4;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_34368 = var1.readInt();
      this.field_34370 = var1.method_37748();
      this.field_34367 = var1.readInt();
      this.field_34371 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeInt(this.field_34368);
      var1.method_37770(this.field_34370);
      var1.writeInt(this.field_34367);
      var1.writeBoolean(this.field_34371);
   }

   public void method_30510(class_392 var1) {
      var1.method_1974(this);
   }

   public boolean method_30509() {
      return this.field_34371;
   }

   public int method_30508() {
      return this.field_34368;
   }

   public int method_30507() {
      return this.field_34367;
   }

   public class_1331 method_30506() {
      return this.field_34370;
   }
}
