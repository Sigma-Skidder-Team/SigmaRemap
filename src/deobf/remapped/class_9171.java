package remapped;

import java.io.IOException;

public class class_9171 extends class_2159 {
   private int field_46933;
   private int field_46932;
   private int field_46931;
   private int field_46936;
   private byte field_46930;
   private byte[][] field_46935;
   private byte[][] field_46934;

   public class_9171() {
      super("AVC Specific Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.field_46933 = var1.method_27531();
      this.field_46932 = var1.method_27531();
      this.field_46930 = (byte)var1.method_27531();
      this.field_46931 = var1.method_27531();
      this.field_46936 = (var1.method_27531() & 3) + 1;
      int var4 = var1.method_27531() & 31;
      this.field_46935 = new byte[var4][];

      for (int var5 = 0; var5 < var4; var5++) {
         int var7 = (int)var1.method_27524(2);
         this.field_46935[var5] = new byte[var7];
         var1.method_27525(this.field_46935[var5]);
      }

      int var8 = var1.method_27531();
      this.field_46934 = new byte[var8][];

      for (int var6 = 0; var6 < var8; var6++) {
         int var9 = (int)var1.method_27524(2);
         this.field_46934[var6] = new byte[var9];
         var1.method_27525(this.field_46934[var6]);
      }
   }

   public int method_42268() {
      return this.field_46933;
   }

   public int method_42273() {
      return this.field_46932;
   }

   public byte method_42267() {
      return this.field_46930;
   }

   public int method_42271() {
      return this.field_46931;
   }

   public int method_42272() {
      return this.field_46936;
   }

   public byte[][] method_42269() {
      return this.field_46935;
   }

   public byte[][] method_42270() {
      return this.field_46934;
   }
}
