package mapped;

public class Class1419 implements Runnable {
   private static String[] field7603;
   public final long field7604;
   public final int field7605;
   public final long field7606;
   public final int field7607;
   public final Class2378 field7608;
   public final boolean field7609;
   public final Class8026 field7610;

   public Class1419(Class8026 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field7610 = var1;
      this.field7604 = var2;
      this.field7605 = var4;
      this.field7606 = var5;
      this.field7607 = var7;
      this.field7608 = var8;
      this.field7609 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field7604);
      if (this.field7605 != -1) {
         if (Class8026.method27523(this.field7610) <= 4L) {
            if (Class8026.method27523(this.field7610) != 4L) {
               if (Class8026.method27523(this.field7610) == 2L) {
                  for (long var4 = this.field7606; var4 < Class8026.method27521(this.field7610); var4 += (long)this.field7607) {
                     long var6 = var4 * Class8026.method27522(this.field7610);

                     for (long var8 = 0L; var8 < Class8026.method27524(this.field7610); var8++) {
                        long var12 = var8 * Class8026.method27520(this.field7610) + var6;
                        long var14 = 2L * var8;
                        var3.method9685(var14, this.field7608.method9651(var12));
                        var3.method9685(var14 + 1L, this.field7608.method9651(var12 + 1L));
                     }

                     Class8026.method27519(this.field7610).method30936(var3, 0L, this.field7609);

                     for (long var32 = 0L; var32 < Class8026.method27524(this.field7610); var32++) {
                        long var44 = var32 * Class8026.method27520(this.field7610) + var6;
                        long var55 = 2L * var32;
                        this.field7608.method9685(var44, var3.method9651(var55));
                        this.field7608.method9685(var44 + 1L, var3.method9651(var55 + 1L));
                     }
                  }
               }
            } else {
               for (long var22 = this.field7606; var22 < Class8026.method27521(this.field7610); var22 += (long)this.field7607) {
                  long var27 = var22 * Class8026.method27522(this.field7610);

                  for (long var33 = 0L; var33 < Class8026.method27524(this.field7610); var33++) {
                     long var45 = var33 * Class8026.method27520(this.field7610) + var27;
                     long var56 = 2L * var33;
                     long var16 = 2L * Class8026.method27524(this.field7610) + 2L * var33;
                     var3.method9685(var56, this.field7608.method9651(var45));
                     var3.method9685(var56 + 1L, this.field7608.method9651(var45 + 1L));
                     var3.method9685(var16, this.field7608.method9651(var45 + 2L));
                     var3.method9685(var16 + 1L, this.field7608.method9651(var45 + 3L));
                  }

                  Class8026.method27519(this.field7610).method30936(var3, 0L, this.field7609);
                  Class8026.method27519(this.field7610).method30936(var3, 2L * Class8026.method27524(this.field7610), this.field7609);

                  for (long var34 = 0L; var34 < Class8026.method27524(this.field7610); var34++) {
                     long var46 = var34 * Class8026.method27520(this.field7610) + var27;
                     long var57 = 2L * var34;
                     long var66 = 2L * Class8026.method27524(this.field7610) + 2L * var34;
                     this.field7608.method9685(var46, var3.method9651(var57));
                     this.field7608.method9685(var46 + 1L, var3.method9651(var57 + 1L));
                     this.field7608.method9685(var46 + 2L, var3.method9651(var66));
                     this.field7608.method9685(var46 + 3L, var3.method9651(var66 + 1L));
                  }
               }
            }
         } else {
            for (long var23 = this.field7606; var23 < Class8026.method27521(this.field7610); var23 += (long)this.field7607) {
               long var28 = var23 * Class8026.method27522(this.field7610);

               for (long var35 = 0L; var35 < Class8026.method27523(this.field7610); var35 += 8L) {
                  for (long var10 = 0L; var10 < Class8026.method27524(this.field7610); var10++) {
                     long var47 = var10 * Class8026.method27520(this.field7610) + var28 + var35;
                     long var58 = 2L * var10;
                     long var67 = 2L * Class8026.method27524(this.field7610) + 2L * var10;
                     long var18 = var67 + 2L * Class8026.method27524(this.field7610);
                     long var20 = var18 + 2L * Class8026.method27524(this.field7610);
                     var3.method9685(var58, this.field7608.method9651(var47));
                     var3.method9685(var58 + 1L, this.field7608.method9651(var47 + 1L));
                     var3.method9685(var67, this.field7608.method9651(var47 + 2L));
                     var3.method9685(var67 + 1L, this.field7608.method9651(var47 + 3L));
                     var3.method9685(var18, this.field7608.method9651(var47 + 4L));
                     var3.method9685(var18 + 1L, this.field7608.method9651(var47 + 5L));
                     var3.method9685(var20, this.field7608.method9651(var47 + 6L));
                     var3.method9685(var20 + 1L, this.field7608.method9651(var47 + 7L));
                  }

                  Class8026.method27519(this.field7610).method30936(var3, 0L, this.field7609);
                  Class8026.method27519(this.field7610).method30936(var3, 2L * Class8026.method27524(this.field7610), this.field7609);
                  Class8026.method27519(this.field7610).method30936(var3, 4L * Class8026.method27524(this.field7610), this.field7609);
                  Class8026.method27519(this.field7610).method30936(var3, 6L * Class8026.method27524(this.field7610), this.field7609);

                  for (long var41 = 0L; var41 < Class8026.method27524(this.field7610); var41++) {
                     long var48 = var41 * Class8026.method27520(this.field7610) + var28 + var35;
                     long var59 = 2L * var41;
                     long var68 = 2L * Class8026.method27524(this.field7610) + 2L * var41;
                     long var73 = var68 + 2L * Class8026.method27524(this.field7610);
                     long var76 = var73 + 2L * Class8026.method27524(this.field7610);
                     this.field7608.method9685(var48, var3.method9651(var59));
                     this.field7608.method9685(var48 + 1L, var3.method9651(var59 + 1L));
                     this.field7608.method9685(var48 + 2L, var3.method9651(var68));
                     this.field7608.method9685(var48 + 3L, var3.method9651(var68 + 1L));
                     this.field7608.method9685(var48 + 4L, var3.method9651(var73));
                     this.field7608.method9685(var48 + 5L, var3.method9651(var73 + 1L));
                     this.field7608.method9685(var48 + 6L, var3.method9651(var76));
                     this.field7608.method9685(var48 + 7L, var3.method9651(var76 + 1L));
                  }
               }
            }
         }
      } else if (Class8026.method27523(this.field7610) <= 4L) {
         if (Class8026.method27523(this.field7610) != 4L) {
            if (Class8026.method27523(this.field7610) == 2L) {
               for (long var24 = this.field7606; var24 < Class8026.method27521(this.field7610); var24 += (long)this.field7607) {
                  long var29 = var24 * Class8026.method27522(this.field7610);

                  for (long var36 = 0L; var36 < Class8026.method27524(this.field7610); var36++) {
                     long var49 = var36 * Class8026.method27520(this.field7610) + var29;
                     long var60 = 2L * var36;
                     var3.method9685(var60, this.field7608.method9651(var49));
                     var3.method9685(var60 + 1L, this.field7608.method9651(var49 + 1L));
                  }

                  Class8026.method27519(this.field7610).method30932(var3, 0L);

                  for (long var37 = 0L; var37 < Class8026.method27524(this.field7610); var37++) {
                     long var50 = var37 * Class8026.method27520(this.field7610) + var29;
                     long var61 = 2L * var37;
                     this.field7608.method9685(var50, var3.method9651(var61));
                     this.field7608.method9685(var50 + 1L, var3.method9651(var61 + 1L));
                  }
               }
            }
         } else {
            for (long var25 = this.field7606; var25 < Class8026.method27521(this.field7610); var25 += (long)this.field7607) {
               long var30 = var25 * Class8026.method27522(this.field7610);

               for (long var38 = 0L; var38 < Class8026.method27524(this.field7610); var38++) {
                  long var51 = var38 * Class8026.method27520(this.field7610) + var30;
                  long var62 = 2L * var38;
                  long var69 = 2L * Class8026.method27524(this.field7610) + 2L * var38;
                  var3.method9685(var62, this.field7608.method9651(var51));
                  var3.method9685(var62 + 1L, this.field7608.method9651(var51 + 1L));
                  var3.method9685(var69, this.field7608.method9651(var51 + 2L));
                  var3.method9685(var69 + 1L, this.field7608.method9651(var51 + 3L));
               }

               Class8026.method27519(this.field7610).method30932(var3, 0L);
               Class8026.method27519(this.field7610).method30932(var3, 2L * Class8026.method27524(this.field7610));

               for (long var39 = 0L; var39 < Class8026.method27524(this.field7610); var39++) {
                  long var52 = var39 * Class8026.method27520(this.field7610) + var30;
                  long var63 = 2L * var39;
                  long var70 = 2L * Class8026.method27524(this.field7610) + 2L * var39;
                  this.field7608.method9685(var52, var3.method9651(var63));
                  this.field7608.method9685(var52 + 1L, var3.method9651(var63 + 1L));
                  this.field7608.method9685(var52 + 2L, var3.method9651(var70));
                  this.field7608.method9685(var52 + 3L, var3.method9651(var70 + 1L));
               }
            }
         }
      } else {
         for (long var26 = this.field7606; var26 < Class8026.method27521(this.field7610); var26 += (long)this.field7607) {
            long var31 = var26 * Class8026.method27522(this.field7610);

            for (long var40 = 0L; var40 < Class8026.method27523(this.field7610); var40 += 8L) {
               for (long var42 = 0L; var42 < Class8026.method27524(this.field7610); var42++) {
                  long var53 = var42 * Class8026.method27520(this.field7610) + var31 + var40;
                  long var64 = 2L * var42;
                  long var71 = 2L * Class8026.method27524(this.field7610) + 2L * var42;
                  long var74 = var71 + 2L * Class8026.method27524(this.field7610);
                  long var77 = var74 + 2L * Class8026.method27524(this.field7610);
                  var3.method9685(var64, this.field7608.method9651(var53));
                  var3.method9685(var64 + 1L, this.field7608.method9651(var53 + 1L));
                  var3.method9685(var71, this.field7608.method9651(var53 + 2L));
                  var3.method9685(var71 + 1L, this.field7608.method9651(var53 + 3L));
                  var3.method9685(var74, this.field7608.method9651(var53 + 4L));
                  var3.method9685(var74 + 1L, this.field7608.method9651(var53 + 5L));
                  var3.method9685(var77, this.field7608.method9651(var53 + 6L));
                  var3.method9685(var77 + 1L, this.field7608.method9651(var53 + 7L));
               }

               Class8026.method27519(this.field7610).method30932(var3, 0L);
               Class8026.method27519(this.field7610).method30932(var3, 2L * Class8026.method27524(this.field7610));
               Class8026.method27519(this.field7610).method30932(var3, 4L * Class8026.method27524(this.field7610));
               Class8026.method27519(this.field7610).method30932(var3, 6L * Class8026.method27524(this.field7610));

               for (long var43 = 0L; var43 < Class8026.method27524(this.field7610); var43++) {
                  long var54 = var43 * Class8026.method27520(this.field7610) + var31 + var40;
                  long var65 = 2L * var43;
                  long var72 = 2L * Class8026.method27524(this.field7610) + 2L * var43;
                  long var75 = var72 + 2L * Class8026.method27524(this.field7610);
                  long var78 = var75 + 2L * Class8026.method27524(this.field7610);
                  this.field7608.method9685(var54, var3.method9651(var65));
                  this.field7608.method9685(var54 + 1L, var3.method9651(var65 + 1L));
                  this.field7608.method9685(var54 + 2L, var3.method9651(var72));
                  this.field7608.method9685(var54 + 3L, var3.method9651(var72 + 1L));
                  this.field7608.method9685(var54 + 4L, var3.method9651(var75));
                  this.field7608.method9685(var54 + 5L, var3.method9651(var75 + 1L));
                  this.field7608.method9685(var54 + 6L, var3.method9651(var78));
                  this.field7608.method9685(var54 + 7L, var3.method9651(var78 + 1L));
               }
            }
         }
      }
   }
}
