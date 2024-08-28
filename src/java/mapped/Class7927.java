package mapped;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;

public class Class7927 {
   private static final long field33956 = 1L;
   public int field33957;
   public int field33958;
   public HashMap<Integer, byte[]> field33959 = new HashMap<Integer, byte[]>();

   public Class7927(int var1, int var2) {
      this.field33957 = var1;
      this.field33958 = var2;
   }

   public Class7927(ObjectInputStream var1) {
      try {
         this.field33957 = var1.readInt();
         this.field33959 = (HashMap<Integer, byte[]>)var1.readObject();
         this.field33958 = var1.readInt();
      } catch (ClassNotFoundException | IOException var5) {
         var5.printStackTrace();
      }
   }

   public void method26599(ByteBuffer var1, Class7481 var2) {
      byte[] var5 = new byte[var1.capacity()];
      var1.get(var5, 0, var5.length);
      this.field33959.put(this.method26601(var2), var5);
   }

   public ByteBuffer method26600(Class7481 var1) {
      byte[] var4 = this.field33959.get(this.method26601(var1));
      return var4 != null ? ByteBuffer.wrap(var4) : null;
   }

   public int method26601(Class7481 var1) {
      int var4 = Math.abs(var1.field32174) % 32;
      int var5 = Math.abs(var1.field32175) % 32;
      int var6 = var4 * 32 + var5;
      return Math.max(0, Math.min(var6, 1024));
   }

   public String method26602() {
      return this.field33957 + "c" + this.field33958 + ".jmap";
   }

   public void method26603(ObjectOutputStream var1) throws IOException {
      var1.writeInt(this.field33957);
      var1.writeObject(this.field33959);
      var1.writeInt(this.field33958);
   }

   public void method26604(ObjectInputStream var1) {
      try {
         this.field33957 = var1.readInt();
         this.field33959 = (HashMap<Integer, byte[]>)var1.readObject();
         this.field33958 = var1.readInt();
      } catch (ClassNotFoundException | IOException var5) {
         var5.printStackTrace();
      }
   }

   public static Class2531 method26605(Class7481 var0) {
      int var3 = (int)Math.floor((double)var0.field32174 / 32.0);
      int var4 = (int)Math.floor((double)var0.field32175 / 32.0);
      return new Class2531(var3, var4);
   }
}
