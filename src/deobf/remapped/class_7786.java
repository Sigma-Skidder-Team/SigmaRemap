package remapped;

import java.io.IOException;
import java.util.function.Supplier;

public class class_7786 implements class_6310<class_392> {
   private static String[] field_39453;
   private class_8760 field_39457;
   private class_5621<World> field_39456;
   private long field_39461;
   private class_4666 field_39454;
   private class_4666 field_39459;
   private boolean field_39458;
   private boolean field_39455;
   private boolean field_39460;

   public class_7786() {
   }

   public class_7786(class_8760 var1, class_5621<World> var2, long var3, class_4666 var5, class_4666 var6, boolean var7, boolean var8, boolean var9) {
      this.field_39457 = var1;
      this.field_39456 = var2;
      this.field_39461 = var3;
      this.field_39454 = var5;
      this.field_39459 = var6;
      this.field_39458 = var7;
      this.field_39455 = var8;
      this.field_39460 = var9;
   }

   public void method_35337(class_392 var1) {
      var1.method_1941(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_39457 = var1.<Supplier<class_8760>>method_37771(class_8760.field_44831).get();
      this.field_39456 = class_5621.<World>method_25497(class_8669.field_44372, var1.method_37768());
      this.field_39461 = var1.readLong();
      this.field_39454 = class_4666.method_21590(var1.readUnsignedByte());
      this.field_39459 = class_4666.method_21590(var1.readUnsignedByte());
      this.field_39458 = var1.readBoolean();
      this.field_39455 = var1.readBoolean();
      this.field_39460 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37786(class_8760.field_44831, () -> this.field_39457);
      var1.method_37780(this.field_39456.method_25499());
      var1.writeLong(this.field_39461);
      var1.writeByte(this.field_39454.method_21589());
      var1.writeByte(this.field_39459.method_21589());
      var1.writeBoolean(this.field_39458);
      var1.writeBoolean(this.field_39455);
      var1.writeBoolean(this.field_39460);
   }

   public class_8760 method_35335() {
      return this.field_39457;
   }

   public class_5621<World> method_35339() {
      return this.field_39456;
   }

   public long method_35332() {
      return this.field_39461;
   }

   public class_4666 method_35334() {
      return this.field_39454;
   }

   public class_4666 method_35330() {
      return this.field_39459;
   }

   public boolean method_35336() {
      return this.field_39458;
   }

   public boolean method_35338() {
      return this.field_39455;
   }

   public boolean method_35333() {
      return this.field_39460;
   }
}
