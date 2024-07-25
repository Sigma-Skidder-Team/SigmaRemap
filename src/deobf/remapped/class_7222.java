package remapped;

import java.io.IOException;

public class class_7222 extends class_6926 {
   private long[] field_37073;
   private long[][] field_37070;
   private int[][] field_37072;
   private boolean[][] field_37069;

   public class_7222() {
      super("Sub Sample Information Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      int var4 = this.field_35590 != 1 ? 2 : 4;
      int var5 = (int)var1.method_27524(4);
      this.field_37073 = new long[var5];
      this.field_37070 = new long[var5][];
      this.field_37072 = new int[var5][];
      this.field_37069 = new boolean[var5][];

      for (int var6 = 0; var6 < var5; var6++) {
         this.field_37073[var6] = var1.method_27524(4);
         int var7 = (int)var1.method_27524(2);
         this.field_37070[var6] = new long[var7];
         this.field_37072[var6] = new int[var7];
         this.field_37069[var6] = new boolean[var7];

         for (int var8 = 0; var8 < var7; var8++) {
            this.field_37070[var6][var8] = var1.method_27524(var4);
            this.field_37072[var6][var8] = var1.method_27531();
            this.field_37069[var6][var8] = (var1.method_27531() & 1) == 1;
            var1.method_27527(4L);
         }
      }
   }

   public long[] method_33072() {
      return this.field_37073;
   }

   public long[][] method_33073() {
      return this.field_37070;
   }

   public int[][] method_33071() {
      return this.field_37072;
   }

   public boolean[][] method_33074() {
      return this.field_37069;
   }
}
