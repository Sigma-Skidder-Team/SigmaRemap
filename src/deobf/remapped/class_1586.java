package remapped;

import java.io.IOException;

public class class_1586 implements Packet<class_1243> {
   private static String[] field_8291;
   private BlockPos field_8294;
   private Direction field_8292;
   private class_7500 field_8293;

   public class_1586() {
   }

   public class_1586(class_7500 var1, BlockPos var2, Direction var3) {
      this.field_8293 = var1;
      this.field_8294 = var2.method_6072();
      this.field_8292 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_8293 = var1.<class_7500>method_37787(class_7500.class);
      this.field_8294 = var1.method_37748();
      this.field_8292 = Direction.method_1033(var1.readUnsignedByte());
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_8293);
      var1.method_37770(this.field_8294);
      var1.writeByte(this.field_8292.method_1050());
   }

   public void method_7128(class_1243 var1) {
      var1.method_5570(this);
   }

   public BlockPos method_7126() {
      return this.field_8294;
   }

   public Direction method_7129() {
      return this.field_8292;
   }

   public class_7500 method_7130() {
      return this.field_8293;
   }
}
