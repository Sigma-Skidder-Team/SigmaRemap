package mapped;

public class Class1506 implements Runnable {
   private static String[] field8132;
   public final long field8133;
   public final int field8134;
   public final long field8135;
   public final int field8136;
   public final Class2381 field8137;
   public final boolean field8138;
   public final Class6352 field8139;

   public Class1506(Class6352 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field8139 = var1;
      this.field8133 = var2;
      this.field8134 = var4;
      this.field8135 = var5;
      this.field8136 = var7;
      this.field8137 = var8;
      this.field8138 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field8133);
      if (this.field8134 != -1) {
         if (Class6352.method19338(this.field8139) <= 2L) {
            if (Class6352.method19338(this.field8139) == 2L) {
               for (long var4 = this.field8135; var4 < Class6352.method19336(this.field8139); var4 += (long)this.field8136) {
                  long var6 = var4 * Class6352.method19337(this.field8139);

                  for (long var8 = 0L; var8 < Class6352.method19339(this.field8139); var8++) {
                     long var12 = var8 * Class6352.method19335(this.field8139) + var6;
                     var3.method9687(var8, this.field8137.method9653(var12));
                     var3.method9687(Class6352.method19339(this.field8139) + var8, this.field8137.method9653(var12 + 1L));
                  }

                  Class6352.method19334(this.field8139).method38583(var3, 0L, this.field8138);
                  Class6352.method19334(this.field8139).method38583(var3, Class6352.method19339(this.field8139), this.field8138);

                  for (long var22 = 0L; var22 < Class6352.method19339(this.field8139); var22++) {
                     long var30 = var22 * Class6352.method19335(this.field8139) + var6;
                     this.field8137.method9687(var30, var3.method9653(var22));
                     this.field8137.method9687(var30 + 1L, var3.method9653(Class6352.method19339(this.field8139) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field8135; var16 < Class6352.method19336(this.field8139); var16 += (long)this.field8136) {
               long var19 = var16 * Class6352.method19337(this.field8139);

               for (long var23 = 0L; var23 < Class6352.method19338(this.field8139); var23 += 4L) {
                  for (long var10 = 0L; var10 < Class6352.method19339(this.field8139); var10++) {
                     long var31 = var10 * Class6352.method19335(this.field8139) + var19 + var23;
                     long var14 = Class6352.method19339(this.field8139) + var10;
                     var3.method9687(var10, this.field8137.method9653(var31));
                     var3.method9687(var14, this.field8137.method9653(var31 + 1L));
                     var3.method9687(var14 + Class6352.method19339(this.field8139), this.field8137.method9653(var31 + 2L));
                     var3.method9687(var14 + 2L * Class6352.method19339(this.field8139), this.field8137.method9653(var31 + 3L));
                  }

                  Class6352.method19334(this.field8139).method38583(var3, 0L, this.field8138);
                  Class6352.method19334(this.field8139).method38583(var3, Class6352.method19339(this.field8139), this.field8138);
                  Class6352.method19334(this.field8139).method38583(var3, 2L * Class6352.method19339(this.field8139), this.field8138);
                  Class6352.method19334(this.field8139).method38583(var3, 3L * Class6352.method19339(this.field8139), this.field8138);

                  for (long var27 = 0L; var27 < Class6352.method19339(this.field8139); var27++) {
                     long var32 = var27 * Class6352.method19335(this.field8139) + var19 + var23;
                     long var37 = Class6352.method19339(this.field8139) + var27;
                     this.field8137.method9687(var32, var3.method9653(var27));
                     this.field8137.method9687(var32 + 1L, var3.method9653(var37));
                     this.field8137.method9687(var32 + 2L, var3.method9653(var37 + Class6352.method19339(this.field8139)));
                     this.field8137.method9687(var32 + 3L, var3.method9653(var37 + 2L * Class6352.method19339(this.field8139)));
                  }
               }
            }
         }
      } else if (Class6352.method19338(this.field8139) <= 2L) {
         if (Class6352.method19338(this.field8139) == 2L) {
            for (long var17 = this.field8135; var17 < Class6352.method19336(this.field8139); var17 += (long)this.field8136) {
               long var20 = var17 * Class6352.method19337(this.field8139);

               for (long var24 = 0L; var24 < Class6352.method19339(this.field8139); var24++) {
                  long var33 = var24 * Class6352.method19335(this.field8139) + var20;
                  var3.method9687(var24, this.field8137.method9653(var33));
                  var3.method9687(Class6352.method19339(this.field8139) + var24, this.field8137.method9653(var33 + 1L));
               }

               Class6352.method19334(this.field8139).method38579(var3, 0L, this.field8138);
               Class6352.method19334(this.field8139).method38579(var3, Class6352.method19339(this.field8139), this.field8138);

               for (long var25 = 0L; var25 < Class6352.method19339(this.field8139); var25++) {
                  long var34 = var25 * Class6352.method19335(this.field8139) + var20;
                  this.field8137.method9687(var34, var3.method9653(var25));
                  this.field8137.method9687(var34 + 1L, var3.method9653(Class6352.method19339(this.field8139) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field8135; var18 < Class6352.method19336(this.field8139); var18 += (long)this.field8136) {
            long var21 = var18 * Class6352.method19337(this.field8139);

            for (long var26 = 0L; var26 < Class6352.method19338(this.field8139); var26 += 4L) {
               for (long var28 = 0L; var28 < Class6352.method19339(this.field8139); var28++) {
                  long var35 = var28 * Class6352.method19335(this.field8139) + var21 + var26;
                  long var38 = Class6352.method19339(this.field8139) + var28;
                  var3.method9687(var28, this.field8137.method9653(var35));
                  var3.method9687(var38, this.field8137.method9653(var35 + 1L));
                  var3.method9687(var38 + Class6352.method19339(this.field8139), this.field8137.method9653(var35 + 2L));
                  var3.method9687(var38 + 2L * Class6352.method19339(this.field8139), this.field8137.method9653(var35 + 3L));
               }

               Class6352.method19334(this.field8139).method38579(var3, 0L, this.field8138);
               Class6352.method19334(this.field8139).method38579(var3, Class6352.method19339(this.field8139), this.field8138);
               Class6352.method19334(this.field8139).method38579(var3, 2L * Class6352.method19339(this.field8139), this.field8138);
               Class6352.method19334(this.field8139).method38579(var3, 3L * Class6352.method19339(this.field8139), this.field8138);

               for (long var29 = 0L; var29 < Class6352.method19339(this.field8139); var29++) {
                  long var36 = var29 * Class6352.method19335(this.field8139) + var21 + var26;
                  long var39 = Class6352.method19339(this.field8139) + var29;
                  this.field8137.method9687(var36, var3.method9653(var29));
                  this.field8137.method9687(var36 + 1L, var3.method9653(var39));
                  this.field8137.method9687(var36 + 2L, var3.method9653(var39 + Class6352.method19339(this.field8139)));
                  this.field8137.method9687(var36 + 3L, var3.method9653(var39 + 2L * Class6352.method19339(this.field8139)));
               }
            }
         }
      }
   }
}
