package mapped;

import java.io.IOException;

public class Class6448 extends AudioByteManager {
   private static String[] field28334;
   private boolean field28335;
   private boolean field28336;
   private boolean field28337;
   private boolean field28338;
   private boolean field28339;
   private boolean field28340;
   private boolean field28341;
   private boolean field28342;
   private long field28343;
   private long field28344;
   private int field28345;
   private int field28346;
   private int field28347;
   private int field28348;
   private int field28349;
   private long field28350;
   private int field28351;
   private int field28352;
   private long field28353;
   private long field28354;
   private long field28355;
   private boolean field28356;
   private int field28357;

   @Override
   public void readData(MP4InputStream reader) throws IOException {
      boolean var4 = reader.readInt() == 1;
      if (!var4) {
         int var5 = reader.readInt();
         this.field28335 = (var5 >> 7 & 1) == 1;
         this.field28336 = (var5 >> 6 & 1) == 1;
         this.field28337 = (var5 >> 5 & 1) == 1;
         this.field28338 = (var5 >> 4 & 1) == 1;
         this.field28339 = (var5 >> 3 & 1) == 1;
         this.field28340 = (var5 >> 2 & 1) == 1;
         this.field28341 = (var5 >> 1 & 1) == 1;
         this.field28342 = (var5 & 1) == 1;
         this.field28343 = reader.readBits(4);
         this.field28344 = reader.readBits(4);
         this.field28345 = reader.readInt();
         this.field28346 = reader.readInt();
         this.field28347 = reader.readInt();
         var5 = reader.readInt();
         this.field28348 = var5 >> 4 & 15;
         this.field28349 = var5 & 15;
         if (this.field28342) {
            this.field28350 = reader.readBits(4);
            this.field28351 = (int) reader.readBits(2);
            this.field28352 = (int) reader.readBits(2);
         }

         if (!this.field28339) {
            if (this.field28340) {
               this.field28353 = reader.readBits(4);
            }

            var5 = (int)Math.ceil((double)(2 * this.field28345) / 8.0);
            long var6 = reader.readBits(var5);
            long var8 = (long)((1 << this.field28345) - 1);
            this.field28354 = var6 >> this.field28345 & var8;
            this.field28355 = var6 & var8;
         }
      }

      int var12 = reader.readInt();
      this.field28356 = (var12 >> 7 & 1) == 1;
      if (this.field28356) {
         this.field28357 = (int) reader.readBits(2);
      }
   }
}
