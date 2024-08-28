package mapped;

import java.io.IOException;

public class Class5060 extends Class5056 {
   private int field23065;
   private int field23066;
   private int field23067;
   private int field23068;
   private byte field23069;
   private byte[][] field23070;
   private byte[][] field23071;

   public Class5060() {
      super("AVC Specific Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      this.field23065 = var1.method31861();
      this.field23066 = var1.method31861();
      this.field23069 = (byte)var1.method31861();
      this.field23067 = var1.method31861();
      this.field23068 = (var1.method31861() & 3) + 1;
      int var4 = var1.method31861() & 31;
      this.field23070 = new byte[var4][];

      for (int var5 = 0; var5 < var4; var5++) {
         int var7 = (int)var1.method31863(2);
         this.field23070[var5] = new byte[var7];
         var1.method31864(this.field23070[var5]);
      }

      int var8 = var1.method31861();
      this.field23071 = new byte[var8][];

      for (int var6 = 0; var6 < var8; var6++) {
         int var9 = (int)var1.method31863(2);
         this.field23071[var6] = new byte[var9];
         var1.method31864(this.field23071[var6]);
      }
   }

   public int method15475() {
      return this.field23065;
   }

   public int method15476() {
      return this.field23066;
   }

   public byte method15477() {
      return this.field23069;
   }

   public int method15478() {
      return this.field23067;
   }

   public int method15479() {
      return this.field23068;
   }

   public byte[][] method15480() {
      return this.field23070;
   }

   public byte[][] method15481() {
      return this.field23071;
   }
}
