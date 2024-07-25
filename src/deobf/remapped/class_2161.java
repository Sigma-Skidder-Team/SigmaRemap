package remapped;

import java.io.IOException;

public class class_2161 implements Packet<class_392> {
   private static String[] field_10790;
   public static final class_8183 field_10779 = new class_8183(0);
   public static final class_8183 field_10786 = new class_8183(1);
   public static final class_8183 field_10778 = new class_8183(2);
   public static final class_8183 field_10791 = new class_8183(3);
   public static final class_8183 field_10784 = new class_8183(4);
   public static final class_8183 field_10781 = new class_8183(5);
   public static final class_8183 field_10780 = new class_8183(6);
   public static final class_8183 field_10777 = new class_8183(7);
   public static final class_8183 field_10789 = new class_8183(8);
   public static final class_8183 field_10787 = new class_8183(9);
   public static final class_8183 field_10788 = new class_8183(10);
   public static final class_8183 field_10782 = new class_8183(11);
   private class_8183 field_10783;
   private float field_10785;

   public class_2161() {
   }

   public class_2161(class_8183 var1, float var2) {
      this.field_10783 = var1;
      this.field_10785 = var2;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_10783 = (class_8183)class_8183.method_37502().get(var1.readUnsignedByte());
      this.field_10785 = var1.readFloat();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeByte(this.field_10783.field_41885);
      var1.writeFloat(this.field_10785);
   }

   public void method_10057(class_392 var1) {
      var1.method_1909(this);
   }

   public class_8183 method_10056() {
      return this.field_10783;
   }

   public float method_10055() {
      return this.field_10785;
   }
}
