package mapped;

public class CubeCoordinateIterator {
   private int startX;
   private int startY;
   private int startZ;
   private int xWidth;
   private int yHeight;
   private int zWidth;
   private int totalAmount;
   private int currentAmount;
   private int x;
   private int y;
   private int z;

   public CubeCoordinateIterator(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.startX = var1;
      this.startY = var2;
      this.startZ = var3;
      this.xWidth = var4 - var1 + 1;
      this.yHeight = var5 - var2 + 1;
      this.zWidth = var6 - var3 + 1;
      this.totalAmount = this.xWidth * this.yHeight * this.zWidth;
   }

   public boolean hasNext() {
      if (this.currentAmount != this.totalAmount) {
         this.x = this.currentAmount % this.xWidth;
         int var3 = this.currentAmount / this.xWidth;
         this.y = var3 % this.yHeight;
         this.z = var3 / this.yHeight;
         this.currentAmount++;
         return true;
      } else {
         return false;
      }
   }

   public int getX() {
      return this.startX + this.x;
   }

   public int getY() {
      return this.startY + this.y;
   }

   public int getZ() {
      return this.startZ + this.z;
   }

   public int numBoundariesTouched() {
      int var3 = 0;
      if (this.x == 0 || this.x == this.xWidth - 1) {
         var3++;
      }

      if (this.y == 0 || this.y == this.yHeight - 1) {
         var3++;
      }

      if (this.z == 0 || this.z == this.zWidth - 1) {
         var3++;
      }

      return var3;
   }
}
