package remapped;

import java.util.List;
import java.util.Optional;

public class class_2249 extends class_7238 {
   public class_2249(class_2133 var1) {
      super(var1, class_9709.class);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) {
      if (var3.method_24609() instanceof class_9530) {
         class_3048.method_13922((class_9530)var3.method_24609());
      }

      if (var2 != null) {
         if (var2.method_3420(class_6548.field_33351) || var2.method_3420(class_6548.field_33377)) {
            int var8 = var3.method_24602();
            if (var8 == 12) {
               var3.method_24608(class_4907.field_25380);
               boolean var9 = ((Byte)var3.method_24609() & 2) == 2;
               var3.method_24607(var9);
            }
         }

         if (var2.method_3418(class_6548.field_33294)) {
            int var15 = var3.method_24602();
            if (var15 == 12) {
               var4.remove(var3);
            }

            if (var15 == 13) {
               var3.method_24605(12);
            }
         }

         if (var2.method_3418(class_6548.field_33356)) {
            if (var2.method_3421(class_6548.field_33356, class_6548.field_33291) && var3.method_24602() == 14) {
               var4.remove(var3);
            } else if (var3.method_24602() == 15) {
               var3.method_24605(14);
            } else if (var3.method_24602() == 14) {
               var3.method_24605(15);
            }
         }

         if (var2.method_3418(class_6548.field_33332)) {
            int var16 = var3.method_24602();
            if (var16 == 14) {
               var4.remove(var3);
            }

            if (var16 == 16) {
               var3.method_24605(14);
            }

            if (var16 == 17) {
               var3.method_24605(16);
            }

            if (!var2.method_3420(class_6548.field_33350) && (var3.method_24602() == 15 || var3.method_24602() == 16)) {
               var4.remove(var3);
            }

            if (var2.method_3421(class_6548.field_33355, class_6548.field_33293) && var3.method_24602() == 13) {
               if (((Byte)var3.method_24609() & 8) == 8) {
                  var4.add(new class_5407(15, class_4907.field_25380, true));
               } else {
                  var4.add(new class_5407(15, class_4907.field_25380, false));
               }
            }
         }

         if (var2.method_3420(class_6548.field_33367) && class_3446.method_15884().method_25844()) {
            class_5407 var17 = this.method_33117(11, var4);
            class_5407 var18 = this.method_33117(2, var4);
            class_5407 var10 = this.method_33117(3, var4);
            if (var3.method_24602() == 0 && var17 != null && var18 != null && var10 != null) {
               byte var11 = (Byte)var3.method_24609();
               if ((var11 & 32) == 32 && ((Byte)var17.method_24609() & 1) == 1 && !((String)var18.method_24609()).isEmpty() && (Boolean)var10.method_24609()) {
                  class_9709 var12 = var5.<class_9709>method_6746(class_9709.class);
                  if (!var12.method_44848(var1)) {
                     var12.method_44849(var1);

                     try {
                        class_5051 var13 = new class_5051(37, null, var5);
                        var13.method_23236(class_8039.field_41157, var1);
                        var13.method_23236(class_8039.field_41166, (short)0);
                        var13.method_23236(class_8039.field_41166, (short)((int)(128.0 * -class_3446.method_15884().method_25806() * 32.0)));
                        var13.method_23236(class_8039.field_41166, (short)0);
                        var13.method_23236(class_8039.field_41161, true);
                        var13.method_23233(class_2133.class);
                     } catch (Exception var14) {
                        var14.printStackTrace();
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public class_754 method_33127(int var1) {
      return class_7377.method_33597(var1, false);
   }

   @Override
   public class_754 method_33114(int var1) {
      return class_7377.method_33597(var1, true);
   }

   public static class_6548 method_10330(int var0, List<class_5407> var1) {
      Optional var4 = class_6548.method_29873(var0);
      if (!var4.isPresent()) {
         class_3446.method_15883().method_33737().method_34617().severe("Error: could not find Entity type " + var0 + " with metadata: " + var1);
         return null;
      } else {
         class_6548 var5 = (class_6548)var4.get();

         try {
            if (var5.method_3420(class_6548.field_33377)) {
               Optional var6 = method_10329(var1, 12);
               if (var6.isPresent() && ((Byte)((class_5407)var6.get()).method_24609() & 4) == 4) {
                  return class_6548.field_33351;
               }
            }

            if (var5.method_3420(class_6548.field_33357)) {
               Optional var9 = method_10329(var1, 12);
               if (var9.isPresent()) {
                  if ((Integer)((class_5407)var9.get()).method_24609() == 1) {
                     return class_6548.field_33311;
                  }

                  if ((Integer)((class_5407)var9.get()).method_24609() == 2) {
                     return class_6548.field_33364;
                  }
               }
            }

            if (var5.method_3420(class_6548.field_33356)) {
               Optional var10 = method_10329(var1, 13);
               if (var10.isPresent()) {
                  int var7 = (Integer)((class_5407)var10.get()).method_24609();
                  if (var7 > 0 && var7 < 6) {
                     var1.add(new class_5407(16, class_4907.field_25390, var7 - 1));
                     return class_6548.field_33295;
                  }

                  if (var7 == 6) {
                     return class_6548.field_33291;
                  }
               }
            }

            if (var5.method_3420(class_6548.field_33350)) {
               Optional var11 = method_10329(var1, 14);
               if (var11.isPresent()) {
                  if ((Integer)((class_5407)var11.get()).method_24609() == 0) {
                     return class_6548.field_33350;
                  }

                  if ((Integer)((class_5407)var11.get()).method_24609() == 1) {
                     return class_6548.field_33355;
                  }

                  if ((Integer)((class_5407)var11.get()).method_24609() == 2) {
                     return class_6548.field_33293;
                  }

                  if ((Integer)((class_5407)var11.get()).method_24609() == 3) {
                     return class_6548.field_33310;
                  }

                  if ((Integer)((class_5407)var11.get()).method_24609() == 4) {
                     return class_6548.field_33318;
                  }
               }
            }
         } catch (Exception var8) {
            if (!class_3446.method_15884().method_25836() || class_3446.method_15883().method_33731()) {
               class_3446.method_15886().method_34617().warning("An error occurred with entity type rewriter");
               class_3446.method_15886().method_34617().warning("Metadata: " + var1);
               var8.printStackTrace();
            }
         }

         return var5;
      }
   }

   public static Optional<class_5407> method_10329(List<class_5407> var0, int var1) {
      for (class_5407 var5 : var0) {
         if (var5.method_24602() == var1) {
            return Optional.<class_5407>of(var5);
         }
      }

      return Optional.<class_5407>empty();
   }
}
