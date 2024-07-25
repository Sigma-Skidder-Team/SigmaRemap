package remapped;

import java.io.IOException;

public class class_1074 implements Packet<class_1243> {
   private static String[] field_5863;
   private BlockPos field_5868;
   private Identifier field_5865;
   private Identifier field_5867;
   private Identifier field_5864;
   private String field_5869;
   private class_1252 field_5866;

   public class_1074() {
   }

   public class_1074(BlockPos var1, Identifier var2, Identifier var3, Identifier var4, String var5, class_1252 var6) {
      this.field_5868 = var1;
      this.field_5865 = var2;
      this.field_5867 = var3;
      this.field_5864 = var4;
      this.field_5869 = var5;
      this.field_5866 = var6;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_5868 = var1.method_37748();
      this.field_5865 = var1.method_37768();
      this.field_5867 = var1.method_37768();
      this.field_5864 = var1.method_37768();
      this.field_5869 = var1.method_37784(32767);
      this.field_5866 = class_1252.method_5640(var1.method_37784(32767)).orElse(class_1252.field_6898);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_5868);
      var1.method_37780(this.field_5865);
      var1.method_37780(this.field_5867);
      var1.method_37780(this.field_5864);
      var1.method_37760(this.field_5869);
      var1.method_37760(this.field_5866.method_21049());
   }

   public void method_4710(class_1243 var1) {
      var1.method_5563(this);
   }

   public BlockPos method_4704() {
      return this.field_5868;
   }

   public Identifier method_4707() {
      return this.field_5865;
   }

   public Identifier method_4705() {
      return this.field_5867;
   }

   public Identifier method_4703() {
      return this.field_5864;
   }

   public String method_4706() {
      return this.field_5869;
   }

   public class_1252 method_4709() {
      return this.field_5866;
   }
}
