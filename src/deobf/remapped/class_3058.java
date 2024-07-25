package remapped;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;

public class class_3058 {
   private static final long field_15017 = 1L;
   public int field_15019;
   public int field_15018;
   public HashMap<Integer, byte[]> field_15021 = new HashMap<Integer, byte[]>();

   public class_3058(int var1, int var2) {
      this.field_15019 = var1;
      this.field_15018 = var2;
   }

   public class_3058(ObjectInputStream var1) {
      try {
         this.field_15019 = var1.readInt();
         this.field_15021 = (HashMap<Integer, byte[]>)var1.readObject();
         this.field_15018 = var1.readInt();
      } catch (ClassNotFoundException | IOException var5) {
         var5.printStackTrace();
      }
   }

   public void method_13960(ByteBuffer var1, class_2034 var2) {
      byte[] var5 = new byte[var1.capacity()];
      var1.get(var5, 0, var5.length);
      this.field_15021.put(this.method_13959(var2), var5);
   }

   public ByteBuffer method_13963(class_2034 var1) {
      byte[] var4 = this.field_15021.get(this.method_13959(var1));
      return var4 != null ? ByteBuffer.wrap(var4) : null;
   }

   public int method_13959(class_2034 var1) {
      int var4 = Math.abs(var1.field_10328) % 32;
      int var5 = Math.abs(var1.field_10327) % 32;
      int var6 = var4 * 32 + var5;
      return Math.max(0, Math.min(var6, 1024));
   }

   public String method_13964() {
      return this.field_15019 + "c" + this.field_15018 + ".jmap";
   }

   public void method_13962(ObjectOutputStream var1) throws IOException {
      var1.writeInt(this.field_15019);
      var1.writeObject(this.field_15021);
      var1.writeInt(this.field_15018);
   }

   public void method_13958(ObjectInputStream var1) {
      try {
         this.field_15019 = var1.readInt();
         this.field_15021 = (HashMap<Integer, byte[]>)var1.readObject();
         this.field_15018 = var1.readInt();
      } catch (ClassNotFoundException | IOException var5) {
         var5.printStackTrace();
      }
   }

   public static class_4985 method_13961(class_2034 var0) {
      int var3 = (int)Math.floor((double)var0.field_10328 / 32.0);
      int var4 = (int)Math.floor((double)var0.field_10327 / 32.0);
      return new class_4985(var3, var4);
   }
}
