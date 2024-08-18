package remapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class class_527 implements Packet<class_392> {
   public int field_3206;
   public short field_3209;
   public short field_3213;
   public short field_3207;
   public byte field_3212;
   public byte field_3214;
   public boolean field_3211;
   public boolean field_3210;
   public boolean field_3215;

   public static long method_2563(double var0) {
      return MathHelper.lfloor(var0 * 4096.0);
   }

   public static double method_2555(long var0) {
      return (double)var0 / 4096.0;
   }

   public Vector3d method_2558(Vector3d var1) {
      double var4 = this.field_3209 != 0 ? method_2555(method_2563(var1.field_7336) + (long)this.field_3209) : var1.field_7336;
      double var6 = this.field_3213 != 0 ? method_2555(method_2563(var1.field_7333) + (long)this.field_3213) : var1.field_7333;
      double var8 = this.field_3207 != 0 ? method_2555(method_2563(var1.field_7334) + (long)this.field_3207) : var1.field_7334;
      return new Vector3d(var4, var6, var8);
   }

   public static Vector3d method_2556(long var0, long var2, long var4) {
      return new Vector3d((double)var0, (double)var2, (double)var4).method_6209(2.4414062E-4F);
   }

   public class_527() {
   }

   public class_527(int var1) {
      this.field_3206 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_3206 = var1.method_37778();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_3206);
   }

   public void method_2562(class_392 var1) {
      var1.method_1962(this);
   }

   @Override
   public String toString() {
      return "Entity_" + super.toString();
   }

   @Nullable
   public Entity method_2564(World var1) {
      return var1.method_29534(this.field_3206);
   }

   public byte method_2557() {
      return this.field_3212;
   }

   public byte method_2561() {
      return this.field_3214;
   }

   public boolean method_2560() {
      return this.field_3210;
   }

   public boolean method_2565() {
      return this.field_3215;
   }

   public boolean method_2554() {
      return this.field_3211;
   }
}
