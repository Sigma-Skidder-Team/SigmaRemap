package remapped;

import java.io.IOException;

public class class_5491 implements Packet<class_392> {
   private static String[] field_27979;
   private int field_27981;
   private int field_27980;
   private ItemStack field_27982 = ItemStack.EMPTY;

   public class_5491() {
   }

   public class_5491(int var1, int var2, ItemStack var3) {
      this.field_27981 = var1;
      this.field_27980 = var2;
      this.field_27982 = var3.method_27973();
   }

   public void method_24955(class_392 var1) {
      var1.method_1935(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_27981 = var1.readByte();
      this.field_27980 = var1.readShort();
      this.field_27982 = var1.method_37755();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_27981);
      var1.writeShort(this.field_27980);
      var1.method_37764(this.field_27982);
   }

   public int method_24952() {
      return this.field_27981;
   }

   public int method_24956() {
      return this.field_27980;
   }

   public ItemStack method_24953() {
      return this.field_27982;
   }
}
