package mapped;

import java.awt.Color;
import java.io.Serializable;

public class Class2407 extends Class2406 implements Serializable {
   private static String[] field16375;
   public static final long field16370 = -105080578052502155L;

   public Class2407(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4);
   }

   public Class2407(byte[] var1) {
      super(var1);
   }

   public Class2407(Class2407 var1) {
      super(var1);
   }

   public Class2407(Class2406 var1) {
      super(var1);
   }

   public Class2407(Color var1) {
      super((byte)var1.getRed(), (byte)var1.getGreen(), (byte)var1.getBlue(), (byte)var1.getAlpha());
   }

   public Class2407() {
   }

   public final void method10121(Color var1) {
      this.field16371 = (byte)var1.getRed();
      this.field16372 = (byte)var1.getGreen();
      this.field16373 = (byte)var1.getBlue();
      this.field16374 = (byte)var1.getAlpha();
   }

   public final Color method10122() {
      int var3 = this.field16371 & 255;
      int var4 = this.field16372 & 255;
      int var5 = this.field16373 & 255;
      int var6 = this.field16374 & 255;
      return new Color(var3, var4, var5, var6);
   }
}
