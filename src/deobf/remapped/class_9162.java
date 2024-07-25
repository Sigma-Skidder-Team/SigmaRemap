package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;

public class class_9162 implements class_8343 {
   private static String[] field_46877;
   public static class_1299 field_46886 = class_3980.method_18363();
   public static class_8343 field_46882;
   private int field_46884;
   private int field_46885;
   private int field_46875;
   private int field_46887;
   private int field_46889;
   private int field_46881;
   private float field_46883;
   private float field_46878;
   private boolean field_46876;
   private String field_46879;
   private String field_46888;
   private class_3614 field_46880;

   public static class_8343 method_42220() {
      return field_46882;
   }

   public class_9162() {
   }

   public class_9162(String var1, int var2, int var3) {
      this.field_46884 = var2;
      this.field_46879 = var1;
      this.field_46885 = var3;
      field_46882 = this;
   }

   public void method_42210(String var1) {
      this.field_46888 = var1;
   }

   @Override
   public boolean method_38412() {
      return this.field_46876;
   }

   @Override
   public String method_38416() {
      return this.field_46879;
   }

   public void method_42221(boolean var1) {
      this.field_46876 = var1;
   }

   public static void method_42217() {
      field_46882 = null;
      field_46886.method_5938(3553);
   }

   public static void method_42212() {
      field_46882 = null;
   }

   @Override
   public void method_38419() {
      if (field_46882 != this) {
         field_46882 = this;
         field_46886.method_5911(3553);
         field_46886.method_5904(this.field_46884, this.field_46885);
      }
   }

   public void method_42215(int var1) {
      this.field_46875 = var1;
      this.method_42214();
   }

   public void method_42225(int var1) {
      this.field_46887 = var1;
      this.method_42224();
   }

   @Override
   public int method_38421() {
      return this.field_46875;
   }

   @Override
   public int method_38415() {
      return this.field_46887;
   }

   @Override
   public float method_38414() {
      return this.field_46878;
   }

   @Override
   public float method_38423() {
      return this.field_46883;
   }

   @Override
   public int method_38422() {
      return this.field_46881;
   }

   @Override
   public int method_38420() {
      return this.field_46889;
   }

   public void method_42226(int var1) {
      this.field_46881 = var1;
      this.method_42214();
   }

   public void method_42216(int var1) {
      this.field_46889 = var1;
      this.method_42224();
   }

   private void method_42214() {
      if (this.field_46881 != 0) {
         this.field_46878 = (float)this.field_46875 / (float)this.field_46881;
      }
   }

   private void method_42224() {
      if (this.field_46889 != 0) {
         this.field_46883 = (float)this.field_46887 / (float)this.field_46889;
      }
   }

   @Override
   public void method_38413() {
      IntBuffer var3 = this.method_42213(1);
      var3.put(this.field_46885);
      ((Buffer)var3).flip();
      field_46886.method_5920(var3);
      if (field_46882 == this) {
         method_42217();
      }

      if (this.field_46888 == null) {
         class_8256.method_37848().method_37855(this.field_46879);
      } else {
         class_8256.method_37848().method_37855(this.field_46888);
      }
   }

   @Override
   public int method_38411() {
      return this.field_46885;
   }

   public void method_42223(int var1) {
      this.field_46885 = var1;
   }

   public IntBuffer method_42213(int var1) {
      ByteBuffer var4 = ByteBuffer.allocateDirect(4 * var1);
      var4.order(ByteOrder.nativeOrder());
      return var4.asIntBuffer();
   }

   @Override
   public byte[] method_38418() {
      ByteBuffer var3 = BufferUtils.createByteBuffer((!this.method_38412() ? 3 : 4) * this.field_46889 * this.field_46881);
      this.method_38419();
      field_46886.method_5918(3553, 0, !this.method_38412() ? 6407 : 6408, 5121, var3);
      byte[] var4 = new byte[var3.limit()];
      var3.get(var4);
      ((Buffer)var3).clear();
      return var4;
   }

   @Override
   public void method_38417(int var1) {
      this.method_38419();
      field_46886.method_5908(this.field_46884, 10241, var1);
      field_46886.method_5908(this.field_46884, 10240, var1);
   }

   public void method_42211(int var1, int var2, int var3, int var4, ByteBuffer var5) {
      this.field_46880 = new class_3614(this, null);
      class_3614.method_16844(this.field_46880, var1);
      class_3614.method_16847(this.field_46880, var2);
      class_3614.method_16842(this.field_46880, var3);
      class_3614.method_16843(this.field_46880, var4);
      class_3614.method_16846(this.field_46880, var5);
   }

   public void method_42218() {
      if (this.field_46880 != null) {
         this.field_46885 = this.field_46880.method_16841();
      }
   }
}
