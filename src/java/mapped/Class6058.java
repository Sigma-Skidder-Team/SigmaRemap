package mapped;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Class6058 extends Class6036 {
   private static String[] field26239;
   private final Map<Integer, Byte> field26291 = new ConcurrentHashMap<Integer, Byte>();
   private final Map<Integer, Byte> field26292 = new ConcurrentHashMap<Integer, Byte>();
   private final Map<Integer, Byte> field26293 = new ConcurrentHashMap<Integer, Byte>();
   private int field26294;
   private boolean field26295 = true;
   private int field26296;
   private int field26297;

   public Class6058(Class7161 var1) {
      super(var1, Class1873.field10755);
   }

   @Override
   public void method18665(int var1) {
      super.method18665(var1);
      this.field26291.remove(var1);
      this.field26292.remove(var1);
      this.field26293.remove(var1);
   }

   public byte method18772(int var1) {
      Byte var4 = this.field26291.get(var1);
      return var4 != null ? var4 : 0;
   }

   public void method18773(int var1, byte var2) {
      this.field26291.put(var1, var2);
   }

   private static byte method18774(Byte var0) {
      return var0 != null ? var0 : 0;
   }

   public boolean method18775(int var1) {
      return (method18774(this.field26292.get(var1)) & 1) != 0;
   }

   public void method18776(int var1, boolean var2) {
      byte var5 = (byte)(method18774(this.field26292.get(var1)) & -2 | (!var2 ? 0 : 1));
      if (var5 != 0) {
         this.field26292.put(var1, var5);
      } else {
         this.field26292.remove(var1);
      }
   }

   public boolean method18777(int var1) {
      return (method18774(this.field26292.get(var1)) & 2) != 0;
   }

   public void method18778(int var1, boolean var2) {
      byte var5 = (byte)(method18774(this.field26292.get(var1)) & -3 | (!var2 ? 0 : 2));
      if (var5 != 0) {
         this.field26292.put(var1, var5);
      } else {
         this.field26292.remove(var1);
      }
   }

   @Override
   public void method18669(int var1) {
      super.method18669(var1);
      Class8563 var4 = new Class8563(65, null, this.method18672());
      var4.method30560(BruhMotha.field22544, 64);

      try {
         var4.method30568(Class6371.class, true, true);
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public byte method18779(int var1) {
      return method18774(this.field26293.get(var1));
   }

   public void method18780(int var1, byte var2) {
      this.field26293.put(var1, var2);
   }

   public int method18781() {
      return this.field26294;
   }

   public void method18782(int var1) {
      this.field26294 = var1;
   }

   public boolean method18783() {
      return this.field26295;
   }

   public void method18784(boolean var1) {
      this.field26295 = var1;
   }

   public int method18785() {
      return this.field26296;
   }

   public void method18786(int var1) {
      this.field26296 = var1;
   }

   public int method18787() {
      return this.field26297;
   }

   public void method18788(int var1) {
      this.field26297 = var1;
   }
}
