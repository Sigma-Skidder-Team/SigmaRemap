package remapped;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class class_4074 extends class_3261 {
   private static String[] field_19842;
   private final Map<Integer, Byte> field_19838 = new ConcurrentHashMap<Integer, Byte>();
   private final Map<Integer, Byte> field_19843 = new ConcurrentHashMap<Integer, Byte>();
   private final Map<Integer, Byte> field_19837 = new ConcurrentHashMap<Integer, Byte>();
   private int field_19839;
   private boolean field_19836 = true;
   private int field_19841;
   private int field_19840;

   public class_4074(class_1455 var1) {
      super(var1, class_6124.field_31372);
   }

   @Override
   public void method_14877(int var1) {
      super.method_14877(var1);
      this.field_19838.remove(var1);
      this.field_19843.remove(var1);
      this.field_19837.remove(var1);
   }

   public byte method_18784(int var1) {
      Byte var4 = this.field_19838.get(var1);
      return var4 != null ? var4 : 0;
   }

   public void method_18792(int var1, byte var2) {
      this.field_19838.put(var1, var2);
   }

   private static byte method_18780(Byte var0) {
      return var0 != null ? var0 : 0;
   }

   public boolean method_18788(int var1) {
      return (method_18780(this.field_19843.get(var1)) & 1) != 0;
   }

   public void method_18779(int var1, boolean var2) {
      byte var5 = (byte)(method_18780(this.field_19843.get(var1)) & -2 | (!var2 ? 0 : 1));
      if (var5 != 0) {
         this.field_19843.put(var1, var5);
      } else {
         this.field_19843.remove(var1);
      }
   }

   public boolean method_18786(int var1) {
      return (method_18780(this.field_19843.get(var1)) & 2) != 0;
   }

   public void method_18778(int var1, boolean var2) {
      byte var5 = (byte)(method_18780(this.field_19843.get(var1)) & -3 | (!var2 ? 0 : 2));
      if (var5 != 0) {
         this.field_19843.put(var1, var5);
      } else {
         this.field_19843.remove(var1);
      }
   }

   @Override
   public void method_17248(int var1) {
      super.method_17248(var1);
      class_5051 var4 = new class_5051(65, null, this.method_5205());
      var4.method_23236(class_8039.field_41157, 64);

      try {
         var4.method_23235(class_5988.class, true, true);
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public byte method_18789(int var1) {
      return method_18780(this.field_19837.get(var1));
   }

   public void method_18790(int var1, byte var2) {
      this.field_19837.put(var1, var2);
   }

   public int method_18787() {
      return this.field_19839;
   }

   public void method_18776(int var1) {
      this.field_19839 = var1;
   }

   public boolean method_18782() {
      return this.field_19836;
   }

   public void method_18791(boolean var1) {
      this.field_19836 = var1;
   }

   public int method_18777() {
      return this.field_19841;
   }

   public void method_18785(int var1) {
      this.field_19841 = var1;
   }

   public int method_18783() {
      return this.field_19840;
   }

   public void method_18781(int var1) {
      this.field_19840 = var1;
   }
}
