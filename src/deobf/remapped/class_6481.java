package remapped;

public class class_6481 extends class_623 {
   private static String[] field_33018;
   private final String field_33016;
   private final String field_33019;
   private final String field_33015;
   private final byte[] field_33017;
   private final byte[] field_33020;

   public class_6481(class_7641 var1) {
      super(var1);
      class_7641 var4 = var1.method_34607(1935894633L);
      this.field_33016 = new String(((class_6855)var4.method_34607(1970496882L)).method_31443());
      byte[] var5 = ((class_6855)var4.method_34607(1851878757L)).method_31443();
      int var6 = 0;

      while (var5[var6] != 0) {
         var6++;
      }

      this.field_33019 = new String(var5, 0, var6 - 1);
      this.field_33015 = new String(((class_6855)var4.method_34607(1801812256L)).method_31443());
      this.field_33017 = ((class_6855)var4.method_34607(1886546294L)).method_31443();
      this.field_33020 = ((class_6855)var4.method_34607(1769367926L)).method_31443();
   }

   @Override
   public class_4762 method_2905() {
      return class_4762.field_23050;
   }

   public String method_29500() {
      return this.field_33016;
   }

   public String method_29503() {
      return this.field_33019;
   }

   public String method_29501() {
      return this.field_33015;
   }

   public byte[] method_29502() {
      return this.field_33017;
   }

   public byte[] method_29504() {
      return this.field_33020;
   }
}
