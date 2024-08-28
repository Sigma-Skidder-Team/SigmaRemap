package mapped;

import java.util.Random;

public class Class4217 extends Class4213 {
   private static String[] field20544;
   private int field20545;

   public Class4217(Direction var1, Class9312 var2, Random var3) {
      super(Class7792.field33472, 1, var1, var2, 1, 1, 1);
      this.field20545 = var3.nextInt(3);
   }

   public Class4217(Class8761 var1, Class39 var2) {
      super(Class7792.field33472, var2);
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      if (Class9312.method35192(this.field20539) / 25 > 0) {
         this.method13006(var1, var5, 0, 0, Class9312.method35193(this.field20539)[Direction.field672.method533()]);
      }

      if (Class9312.method35191(this.field20539)[Direction.field673.method533()] == null) {
         this.method13007(var1, var5, 1, 4, 1, 6, 4, 6, field20528);
      }

      boolean var10 = this.field20545 != 0
         && var4.nextBoolean()
         && !Class9312.method35193(this.field20539)[Direction.field672.method533()]
         && !Class9312.method35193(this.field20539)[Direction.field673.method533()]
         && this.field20539.method35190() > 1;
      if (this.field20545 != 0) {
         if (this.field20545 != 1) {
            if (this.field20545 == 2) {
               this.method12927(var1, var5, 0, 1, 0, 0, 1, 7, field20529, field20529, false);
               this.method12927(var1, var5, 7, 1, 0, 7, 1, 7, field20529, field20529, false);
               this.method12927(var1, var5, 1, 1, 0, 6, 1, 0, field20529, field20529, false);
               this.method12927(var1, var5, 1, 1, 7, 6, 1, 7, field20529, field20529, false);
               this.method12927(var1, var5, 0, 2, 0, 0, 2, 7, field20530, field20530, false);
               this.method12927(var1, var5, 7, 2, 0, 7, 2, 7, field20530, field20530, false);
               this.method12927(var1, var5, 1, 2, 0, 6, 2, 0, field20530, field20530, false);
               this.method12927(var1, var5, 1, 2, 7, 6, 2, 7, field20530, field20530, false);
               this.method12927(var1, var5, 0, 3, 0, 0, 3, 7, field20529, field20529, false);
               this.method12927(var1, var5, 7, 3, 0, 7, 3, 7, field20529, field20529, false);
               this.method12927(var1, var5, 1, 3, 0, 6, 3, 0, field20529, field20529, false);
               this.method12927(var1, var5, 1, 3, 7, 6, 3, 7, field20529, field20529, false);
               this.method12927(var1, var5, 0, 1, 3, 0, 2, 4, field20530, field20530, false);
               this.method12927(var1, var5, 7, 1, 3, 7, 2, 4, field20530, field20530, false);
               this.method12927(var1, var5, 3, 1, 0, 4, 2, 0, field20530, field20530, false);
               this.method12927(var1, var5, 3, 1, 7, 4, 2, 7, field20530, field20530, false);
               if (Class9312.method35193(this.field20539)[Direction.SOUTH.method533()]) {
                  this.method13005(var1, var5, 3, 1, 0, 4, 2, 0);
               }

               if (Class9312.method35193(this.field20539)[Direction.NORTH.method533()]) {
                  this.method13005(var1, var5, 3, 1, 7, 4, 2, 7);
               }

               if (Class9312.method35193(this.field20539)[Direction.WEST.method533()]) {
                  this.method13005(var1, var5, 0, 1, 3, 0, 2, 4);
               }

               if (Class9312.method35193(this.field20539)[Direction.EAST.method533()]) {
                  this.method13005(var1, var5, 7, 1, 3, 7, 2, 4);
               }
            }
         } else {
            this.method12927(var1, var5, 2, 1, 2, 2, 3, 2, field20529, field20529, false);
            this.method12927(var1, var5, 2, 1, 5, 2, 3, 5, field20529, field20529, false);
            this.method12927(var1, var5, 5, 1, 5, 5, 3, 5, field20529, field20529, false);
            this.method12927(var1, var5, 5, 1, 2, 5, 3, 2, field20529, field20529, false);
            this.method12923(var1, field20532, 2, 2, 2, var5);
            this.method12923(var1, field20532, 2, 2, 5, var5);
            this.method12923(var1, field20532, 5, 2, 5, var5);
            this.method12923(var1, field20532, 5, 2, 2, var5);
            this.method12927(var1, var5, 0, 1, 0, 1, 3, 0, field20529, field20529, false);
            this.method12927(var1, var5, 0, 1, 1, 0, 3, 1, field20529, field20529, false);
            this.method12927(var1, var5, 0, 1, 7, 1, 3, 7, field20529, field20529, false);
            this.method12927(var1, var5, 0, 1, 6, 0, 3, 6, field20529, field20529, false);
            this.method12927(var1, var5, 6, 1, 7, 7, 3, 7, field20529, field20529, false);
            this.method12927(var1, var5, 7, 1, 6, 7, 3, 6, field20529, field20529, false);
            this.method12927(var1, var5, 6, 1, 0, 7, 3, 0, field20529, field20529, false);
            this.method12927(var1, var5, 7, 1, 1, 7, 3, 1, field20529, field20529, false);
            this.method12923(var1, field20528, 1, 2, 0, var5);
            this.method12923(var1, field20528, 0, 2, 1, var5);
            this.method12923(var1, field20528, 1, 2, 7, var5);
            this.method12923(var1, field20528, 0, 2, 6, var5);
            this.method12923(var1, field20528, 6, 2, 7, var5);
            this.method12923(var1, field20528, 7, 2, 6, var5);
            this.method12923(var1, field20528, 6, 2, 0, var5);
            this.method12923(var1, field20528, 7, 2, 1, var5);
            if (!Class9312.method35193(this.field20539)[Direction.SOUTH.method533()]) {
               this.method12927(var1, var5, 1, 3, 0, 6, 3, 0, field20529, field20529, false);
               this.method12927(var1, var5, 1, 2, 0, 6, 2, 0, field20528, field20528, false);
               this.method12927(var1, var5, 1, 1, 0, 6, 1, 0, field20529, field20529, false);
            }

            if (!Class9312.method35193(this.field20539)[Direction.NORTH.method533()]) {
               this.method12927(var1, var5, 1, 3, 7, 6, 3, 7, field20529, field20529, false);
               this.method12927(var1, var5, 1, 2, 7, 6, 2, 7, field20528, field20528, false);
               this.method12927(var1, var5, 1, 1, 7, 6, 1, 7, field20529, field20529, false);
            }

            if (!Class9312.method35193(this.field20539)[Direction.WEST.method533()]) {
               this.method12927(var1, var5, 0, 3, 1, 0, 3, 6, field20529, field20529, false);
               this.method12927(var1, var5, 0, 2, 1, 0, 2, 6, field20528, field20528, false);
               this.method12927(var1, var5, 0, 1, 1, 0, 1, 6, field20529, field20529, false);
            }

            if (!Class9312.method35193(this.field20539)[Direction.EAST.method533()]) {
               this.method12927(var1, var5, 7, 3, 1, 7, 3, 6, field20529, field20529, false);
               this.method12927(var1, var5, 7, 2, 1, 7, 2, 6, field20528, field20528, false);
               this.method12927(var1, var5, 7, 1, 1, 7, 1, 6, field20529, field20529, false);
            }
         }
      } else {
         this.method12927(var1, var5, 0, 1, 0, 2, 1, 2, field20529, field20529, false);
         this.method12927(var1, var5, 0, 3, 0, 2, 3, 2, field20529, field20529, false);
         this.method12927(var1, var5, 0, 2, 0, 0, 2, 2, field20528, field20528, false);
         this.method12927(var1, var5, 1, 2, 0, 2, 2, 0, field20528, field20528, false);
         this.method12923(var1, field20532, 1, 2, 1, var5);
         this.method12927(var1, var5, 5, 1, 0, 7, 1, 2, field20529, field20529, false);
         this.method12927(var1, var5, 5, 3, 0, 7, 3, 2, field20529, field20529, false);
         this.method12927(var1, var5, 7, 2, 0, 7, 2, 2, field20528, field20528, false);
         this.method12927(var1, var5, 5, 2, 0, 6, 2, 0, field20528, field20528, false);
         this.method12923(var1, field20532, 6, 2, 1, var5);
         this.method12927(var1, var5, 0, 1, 5, 2, 1, 7, field20529, field20529, false);
         this.method12927(var1, var5, 0, 3, 5, 2, 3, 7, field20529, field20529, false);
         this.method12927(var1, var5, 0, 2, 5, 0, 2, 7, field20528, field20528, false);
         this.method12927(var1, var5, 1, 2, 7, 2, 2, 7, field20528, field20528, false);
         this.method12923(var1, field20532, 1, 2, 6, var5);
         this.method12927(var1, var5, 5, 1, 5, 7, 1, 7, field20529, field20529, false);
         this.method12927(var1, var5, 5, 3, 5, 7, 3, 7, field20529, field20529, false);
         this.method12927(var1, var5, 7, 2, 5, 7, 2, 7, field20528, field20528, false);
         this.method12927(var1, var5, 5, 2, 7, 6, 2, 7, field20528, field20528, false);
         this.method12923(var1, field20532, 6, 2, 6, var5);
         if (!Class9312.method35193(this.field20539)[Direction.SOUTH.method533()]) {
            this.method12927(var1, var5, 3, 3, 0, 4, 3, 1, field20529, field20529, false);
            this.method12927(var1, var5, 3, 2, 0, 4, 2, 0, field20528, field20528, false);
            this.method12927(var1, var5, 3, 1, 0, 4, 1, 1, field20529, field20529, false);
         } else {
            this.method12927(var1, var5, 3, 3, 0, 4, 3, 0, field20529, field20529, false);
         }

         if (!Class9312.method35193(this.field20539)[Direction.NORTH.method533()]) {
            this.method12927(var1, var5, 3, 3, 6, 4, 3, 7, field20529, field20529, false);
            this.method12927(var1, var5, 3, 2, 7, 4, 2, 7, field20528, field20528, false);
            this.method12927(var1, var5, 3, 1, 6, 4, 1, 7, field20529, field20529, false);
         } else {
            this.method12927(var1, var5, 3, 3, 7, 4, 3, 7, field20529, field20529, false);
         }

         if (!Class9312.method35193(this.field20539)[Direction.WEST.method533()]) {
            this.method12927(var1, var5, 0, 3, 3, 1, 3, 4, field20529, field20529, false);
            this.method12927(var1, var5, 0, 2, 3, 0, 2, 4, field20528, field20528, false);
            this.method12927(var1, var5, 0, 1, 3, 1, 1, 4, field20529, field20529, false);
         } else {
            this.method12927(var1, var5, 0, 3, 3, 0, 3, 4, field20529, field20529, false);
         }

         if (!Class9312.method35193(this.field20539)[Direction.EAST.method533()]) {
            this.method12927(var1, var5, 6, 3, 3, 7, 3, 4, field20529, field20529, false);
            this.method12927(var1, var5, 7, 2, 3, 7, 2, 4, field20528, field20528, false);
            this.method12927(var1, var5, 6, 1, 3, 7, 1, 4, field20529, field20529, false);
         } else {
            this.method12927(var1, var5, 7, 3, 3, 7, 3, 4, field20529, field20529, false);
         }
      }

      if (var10) {
         this.method12927(var1, var5, 3, 1, 3, 4, 1, 4, field20529, field20529, false);
         this.method12927(var1, var5, 3, 2, 3, 4, 2, 4, field20528, field20528, false);
         this.method12927(var1, var5, 3, 3, 3, 4, 3, 4, field20529, field20529, false);
      }

      return true;
   }
}
