package remapped;

import java.awt.Color;
import java.io.Serializable;

public class class_1284 extends class_8605 implements Serializable {
   private static String[] field_7056;
   public static final long field_7055 = 6632576088353444794L;

   public class_1284(byte var1, byte var2, byte var3) {
      super(var1, var2, var3);
   }

   public class_1284(byte[] var1) {
      super(var1);
   }

   public class_1284(class_1284 var1) {
      super(var1);
   }

   public class_1284(class_8605 var1) {
      super(var1);
   }

   public class_1284(Color var1) {
      super((byte)var1.getRed(), (byte)var1.getGreen(), (byte)var1.getBlue());
   }

   public class_1284() {
   }

   public final void method_5735(Color var1) {
      this.field_44069 = (byte)var1.getRed();
      this.field_44066 = (byte)var1.getGreen();
      this.field_44068 = (byte)var1.getBlue();
   }

   public final Color method_5734() {
      int var3 = this.field_44069 & 255;
      int var4 = this.field_44066 & 255;
      int var5 = this.field_44068 & 255;
      return new Color(var3, var4, var5);
   }
}
