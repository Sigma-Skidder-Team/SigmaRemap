package remapped;

import java.awt.Color;
import java.io.Serializable;

public class class_7506 extends class_361 implements Serializable {
   private static String[] field_38318;
   public static final long field_38317 = -105080578052502155L;

   public class_7506(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4);
   }

   public class_7506(byte[] var1) {
      super(var1);
   }

   public class_7506(class_7506 var1) {
      super(var1);
   }

   public class_7506(class_361 var1) {
      super(var1);
   }

   public class_7506(Color var1) {
      super((byte)var1.getRed(), (byte)var1.getGreen(), (byte)var1.getBlue(), (byte)var1.getAlpha());
   }

   public class_7506() {
   }

   public final void method_34218(Color var1) {
      this.field_1396 = (byte)var1.getRed();
      this.field_1400 = (byte)var1.getGreen();
      this.field_1398 = (byte)var1.getBlue();
      this.field_1397 = (byte)var1.getAlpha();
   }

   public final Color method_34219() {
      int var3 = this.field_1396 & 255;
      int var4 = this.field_1400 & 255;
      int var5 = this.field_1398 & 255;
      int var6 = this.field_1397 & 255;
      return new Color(var3, var4, var5, var6);
   }
}
