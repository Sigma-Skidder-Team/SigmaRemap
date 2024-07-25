package remapped;

import java.io.IOException;

public class class_6944 implements Packet<class_392> {
   private static String[] field_35710;
   private BlockPos field_35714;
   private int field_35713;
   private int field_35712;
   private class_6414 field_35711;

   public class_6944() {
   }

   public class_6944(BlockPos var1, class_6414 var2, int var3, int var4) {
      this.field_35714 = var1;
      this.field_35711 = var2;
      this.field_35713 = var3;
      this.field_35712 = var4;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_35714 = var1.method_37748();
      this.field_35713 = var1.readUnsignedByte();
      this.field_35712 = var1.readUnsignedByte();
      this.field_35711 = class_8669.field_44462.method_14040(var1.method_37778());
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_35714);
      var1.writeByte(this.field_35713);
      var1.writeByte(this.field_35712);
      var1.method_37743(class_8669.field_44462.method_14041(this.field_35711));
   }

   public void method_31779(class_392 var1) {
      var1.method_1939(this);
   }

   public BlockPos method_31774() {
      return this.field_35714;
   }

   public int method_31775() {
      return this.field_35713;
   }

   public int method_31776() {
      return this.field_35712;
   }

   public class_6414 method_31777() {
      return this.field_35711;
   }
}
