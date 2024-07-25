package remapped;

import java.io.IOException;

public class class_2887 extends class_6926 {
   private int field_14129;
   private int field_14127;
   private int field_14135;
   private int field_14134;
   private int field_14131;
   private int field_14126;
   private int field_14125;
   private String field_14132;
   private int[] field_14133;
   private long[] field_14128;

   public class_2887() {
      super("File Partition Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_14129 = (int)var1.method_27524(2);
      this.field_14127 = (int)var1.method_27524(2);
      var1.method_27527(1L);
      this.field_14135 = var1.method_27531();
      this.field_14134 = (int)var1.method_27524(2);
      this.field_14131 = (int)var1.method_27524(2);
      this.field_14126 = (int)var1.method_27524(2);
      this.field_14125 = (int)var1.method_27524(2);
      this.field_14132 = new String(class_5789.method_26188(var1.method_27537((int)this.method_18113(var1), 0)));
      int var4 = (int)var1.method_27524(2);
      this.field_14133 = new int[var4];
      this.field_14128 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_14133[var5] = (int)var1.method_27524(2);
         this.field_14128[var5] = (long)((int)var1.method_27524(4));
      }
   }

   public int method_13233() {
      return this.field_14129;
   }

   public int method_13242() {
      return this.field_14127;
   }

   public int method_13234() {
      return this.field_14135;
   }

   public int method_13238() {
      return this.field_14134;
   }

   public int method_13237() {
      return this.field_14131;
   }

   public int method_13241() {
      return this.field_14126;
   }

   public int method_13239() {
      return this.field_14125;
   }

   public String method_13236() {
      return this.field_14132;
   }

   public int[] method_13240() {
      return this.field_14133;
   }

   public long[] method_13235() {
      return this.field_14128;
   }
}
