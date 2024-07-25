package remapped;

import java.io.IOException;
import java.util.UUID;

public class class_6589 implements Packet<class_392> {
   private static String[] field_33987;
   private int field_33995;
   private UUID field_33992;
   private double field_33994;
   private double field_33983;
   private double field_33991;
   private int field_33993;
   private int field_33988;
   private int field_33989;
   private int field_33986;
   private int field_33984;
   private class_6629<?> field_33985;
   private int field_33990;

   public class_6589() {
   }

   public class_6589(int var1, UUID var2, double var3, double var5, double var7, float var9, float var10, class_6629<?> var11, int var12, class_1343 var13) {
      this.field_33995 = var1;
      this.field_33992 = var2;
      this.field_33994 = var3;
      this.field_33983 = var5;
      this.field_33991 = var7;
      this.field_33986 = class_9299.method_42848(var9 * 256.0F / 360.0F);
      this.field_33984 = class_9299.method_42848(var10 * 256.0F / 360.0F);
      this.field_33985 = var11;
      this.field_33990 = var12;
      this.field_33993 = (int)(class_9299.method_42827(var13.field_7336, -3.9, 3.9) * 8000.0);
      this.field_33988 = (int)(class_9299.method_42827(var13.field_7333, -3.9, 3.9) * 8000.0);
      this.field_33989 = (int)(class_9299.method_42827(var13.field_7334, -3.9, 3.9) * 8000.0);
   }

   public class_6589(Entity var1) {
      this(var1, 0);
   }

   public class_6589(Entity var1, int var2) {
      this(
         var1.method_37145(),
         var1.method_37328(),
         var1.method_37302(),
         var1.method_37309(),
         var1.method_37156(),
         var1.rotationPitch,
         var1.rotationYaw,
         var1.method_37387(),
         var2,
         var1.method_37098()
      );
   }

   public class_6589(Entity var1, class_6629<?> var2, int var3, BlockPos var4) {
      this(
         var1.method_37145(),
         var1.method_37328(),
         (double)var4.method_12173(),
         (double)var4.method_12165(),
         (double)var4.method_12185(),
         var1.rotationPitch,
         var1.rotationYaw,
         var2,
         var3,
         var1.method_37098()
      );
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_33995 = var1.method_37778();
      this.field_33992 = var1.method_37753();
      this.field_33985 = class_8669.field_44400.method_14040(var1.method_37778());
      this.field_33994 = var1.readDouble();
      this.field_33983 = var1.readDouble();
      this.field_33991 = var1.readDouble();
      this.field_33986 = var1.readByte();
      this.field_33984 = var1.readByte();
      this.field_33990 = var1.readInt();
      this.field_33993 = var1.readShort();
      this.field_33988 = var1.readShort();
      this.field_33989 = var1.readShort();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_33995);
      var1.method_37746(this.field_33992);
      var1.method_37743(class_8669.field_44400.method_14041(this.field_33985));
      var1.writeDouble(this.field_33994);
      var1.writeDouble(this.field_33983);
      var1.writeDouble(this.field_33991);
      var1.writeByte(this.field_33986);
      var1.writeByte(this.field_33984);
      var1.writeInt(this.field_33990);
      var1.writeShort(this.field_33993);
      var1.writeShort(this.field_33988);
      var1.writeShort(this.field_33989);
   }

   public void method_30340(class_392 var1) {
      var1.method_1919(this);
   }

   public int method_30333() {
      return this.field_33995;
   }

   public UUID method_30337() {
      return this.field_33992;
   }

   public double method_30329() {
      return this.field_33994;
   }

   public double method_30331() {
      return this.field_33983;
   }

   public double method_30339() {
      return this.field_33991;
   }

   public double method_30336() {
      return (double)this.field_33993 / 8000.0;
   }

   public double method_30338() {
      return (double)this.field_33988 / 8000.0;
   }

   public double method_30332() {
      return (double)this.field_33989 / 8000.0;
   }

   public int method_30327() {
      return this.field_33986;
   }

   public int method_30328() {
      return this.field_33984;
   }

   public class_6629<?> method_30334() {
      return this.field_33985;
   }

   public int method_30335() {
      return this.field_33990;
   }
}
