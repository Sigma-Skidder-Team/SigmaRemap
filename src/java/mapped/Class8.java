package mapped;

import java.awt.Color;
import java.io.Serializable;

public class Class8 extends Class7 implements Serializable {
   private static String[] field16;
   public static final long field12 = 6632576088353444794L;

   public Class8(byte var1, byte var2, byte var3) {
      super(var1, var2, var3);
   }

   public Class8(byte[] var1) {
      super(var1);
   }

   public Class8(Class8 var1) {
      super(var1);
   }

   public Class8(Class7 var1) {
      super(var1);
   }

   public Class8(Color var1) {
      super((byte)var1.getRed(), (byte)var1.getGreen(), (byte)var1.getBlue());
   }

   public Class8() {
   }

   public final void method54(Color var1) {
      this.field13 = (byte)var1.getRed();
      this.field14 = (byte)var1.getGreen();
      this.field15 = (byte)var1.getBlue();
   }

   public final Color method55() {
      int var3 = this.field13 & 255;
      int var4 = this.field14 & 255;
      int var5 = this.field15 & 255;
      return new Color(var3, var4, var5);
   }
}
