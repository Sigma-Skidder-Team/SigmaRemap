package remapped;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class class_3740 implements class_6310<class_392> {
   private class_8461 field_18306;
   private class_562 field_18309;
   private int field_18313;
   private int field_18307;
   private int field_18310;
   private float field_18311;
   private float field_18312;

   public class_3740() {
   }

   public class_3740(class_8461 var1, class_562 var2, double var3, double var5, double var7, float var9, float var10) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.field_18306 = var1;
      this.field_18309 = var2;
      this.field_18313 = (int)(var3 * 8.0);
      this.field_18307 = (int)(var5 * 8.0);
      this.field_18310 = (int)(var7 * 8.0);
      this.field_18311 = var9;
      this.field_18312 = var10;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_18306 = class_8669.field_44369.method_14040(var1.method_37778());
      this.field_18309 = var1.<class_562>method_37787(class_562.class);
      this.field_18313 = var1.readInt();
      this.field_18307 = var1.readInt();
      this.field_18310 = var1.readInt();
      this.field_18311 = var1.readFloat();
      this.field_18312 = var1.readFloat();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(class_8669.field_44369.method_14041(this.field_18306));
      var1.method_37750(this.field_18309);
      var1.writeInt(this.field_18313);
      var1.writeInt(this.field_18307);
      var1.writeInt(this.field_18310);
      var1.writeFloat(this.field_18311);
      var1.writeFloat(this.field_18312);
   }

   public class_8461 method_17341() {
      return this.field_18306;
   }

   public class_562 method_17342() {
      return this.field_18309;
   }

   public double method_17347() {
      return (double)((float)this.field_18313 / 8.0F);
   }

   public double method_17340() {
      return (double)((float)this.field_18307 / 8.0F);
   }

   public double method_17344() {
      return (double)((float)this.field_18310 / 8.0F);
   }

   public float method_17343() {
      return this.field_18311;
   }

   public float method_17339() {
      return this.field_18312;
   }

   public void method_17345(class_392 var1) {
      var1.method_1958(this);
   }
}
