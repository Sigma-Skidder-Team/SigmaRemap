package remapped;

import java.io.IOException;

public class class_8244 implements class_6310<class_1243> {
   private static String[] field_42329;
   private String field_42331;
   private int field_42328;
   private class_1803 field_42327;
   private boolean field_42330;
   private int field_42325;
   private class_1736 field_42326;

   public class_8244() {
   }

   public class_8244(String var1, int var2, class_1803 var3, boolean var4, int var5, class_1736 var6) {
      this.field_42331 = var1;
      this.field_42328 = var2;
      this.field_42327 = var3;
      this.field_42330 = var4;
      this.field_42325 = var5;
      this.field_42326 = var6;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_42331 = var1.method_37784(16);
      this.field_42328 = var1.readByte();
      this.field_42327 = var1.<class_1803>method_37787(class_1803.class);
      this.field_42330 = var1.readBoolean();
      this.field_42325 = var1.readUnsignedByte();
      this.field_42326 = var1.<class_1736>method_37787(class_1736.class);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(this.field_42331);
      var1.writeByte(this.field_42328);
      var1.method_37750(this.field_42327);
      var1.writeBoolean(this.field_42330);
      var1.writeByte(this.field_42325);
      var1.method_37750(this.field_42326);
   }

   public void method_37740(class_1243 var1) {
      var1.method_5565(this);
   }

   public class_1803 method_37735() {
      return this.field_42327;
   }

   public boolean method_37739() {
      return this.field_42330;
   }

   public int method_37736() {
      return this.field_42325;
   }

   public class_1736 method_37738() {
      return this.field_42326;
   }
}
