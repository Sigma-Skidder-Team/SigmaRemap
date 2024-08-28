package mapped;

import java.util.Map;

public class Class355 extends Thread {
   private static String[] field1579;
   private String field1580;
   private Map field1581;
   private byte[] field1582;
   private Class5913 field1583;

   public Class355(String var1, Map var2, byte[] var3, Class5913 var4) {
      this.field1580 = var1;
      this.field1581 = var2;
      this.field1582 = var3;
      this.field1583 = var4;
   }

   @Override
   public void run() {
      try {
         Class8819.method31849(this.field1580, this.field1581, this.field1582);
         this.field1583.method18361(this.field1580, this.field1582, (Throwable)null);
      } catch (Exception var4) {
         this.field1583.method18361(this.field1580, this.field1582, var4);
      }
   }

   public String method1816() {
      return this.field1580;
   }

   public byte[] method1817() {
      return this.field1582;
   }

   public Class5913 method1818() {
      return this.field1583;
   }
}
