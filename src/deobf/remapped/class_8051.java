package remapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class class_8051 extends class_6926 {
   private int field_41221;
   private int field_41223;
   private long field_41218;
   private byte[] field_41219;
   private byte[] field_41220;
   private Map<String, String> field_41222;

   public class_8051() {
      super("OMA DRM Common Header Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_41221 = var1.method_27531();
      this.field_41223 = var1.method_27531();
      this.field_41218 = var1.method_27524(8);
      int var4 = (int)var1.method_27524(2);
      int var5 = (int)var1.method_27524(2);
      int var6 = (int)var1.method_27524(2);
      this.field_41219 = new byte[var4];
      var1.method_27525(this.field_41219);
      this.field_41220 = new byte[var5];
      var1.method_27525(this.field_41220);
      this.field_41222 = new HashMap<String, String>();

      while (var6 > 0) {
         String var7 = new String(var1.method_27537((int)this.method_18113(var1), 58));
         String var8 = new String(var1.method_27537((int)this.method_18113(var1), 0));
         this.field_41222.put(var7, var8);
         var6 -= var7.length() + var8.length() + 2;
      }

      this.method_18110(var1);
   }

   public int method_36521() {
      return this.field_41221;
   }

   public int method_36523() {
      return this.field_41223;
   }

   public long method_36522() {
      return this.field_41218;
   }

   public byte[] method_36519() {
      return this.field_41219;
   }

   public byte[] method_36518() {
      return this.field_41220;
   }

   public Map<String, String> method_36520() {
      return this.field_41222;
   }
}
