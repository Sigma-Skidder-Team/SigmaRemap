package mapped;

public class Class3413 extends Block {
   private static String[] field19099;
   public static final Class8554 field19100 = Class8820.field39751;
   private static final Class6408 field19101 = method11539(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   public static final Class6408 field19102 = Class8022.method27433(
      Class8022.method27426(),
      Class8022.method27432(
         method11539(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), method11539(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), method11539(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), field19101
      ),
      Class9477.field44041
   );

   public Class3413(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19100, Integer.valueOf(0)));
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19102;
   }

   @Override
   public Class6408 method11938(Class7380 var1, Class1665 var2, BlockPos var3) {
      return field19101;
   }

   @Override
   public void method11523(Class7380 var1, World var2, BlockPos var3, Entity var4) {
      int var7 = var1.<Integer>method23463(field19100);
      float var8 = (float)var3.getY() + (6.0F + (float)(3 * var7)) / 16.0F;
      if (!var2.field9020 && var4.method3327() && var7 > 0 && var4.getPosY() <= (double)var8) {
         var4.method3223();
         this.method12051(var2, var3, var1, var7 - 1);
      }
   }

   @Override
   public ActionResultType method11505(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      ItemStack var9 = var4.getHeldItem(var5);
      if (!var9.method32105()) {
         int var10 = var1.<Integer>method23463(field19100);
         Class3257 var11 = var9.method32107();
         if (var11 != Class8514.field37883) {
            if (var11 != Class8514.field37882) {
               if (var11 != Class8514.field37972) {
                  if (var11 == Class8514.field37971 && Class9741.method38185(var9) == Class8137.field34977) {
                     if (var10 < 3 && !var2.field9020) {
                        if (!var4.field4919.field29609) {
                           ItemStack var17 = new ItemStack(Class8514.field37972);
                           var4.method2911(Class8876.field40143);
                           var4.method3095(var5, var17);
                           if (var4 instanceof Class878) {
                              ((Class878)var4).method2771(var4.field4904);
                           }
                        }

                        var2.method6742((PlayerEntity)null, var3, Class6067.field26417, Class2266.field14732, 1.0F, 1.0F);
                        this.method12051(var2, var3, var1, var10 + 1);
                     }

                     return ActionResultType.method9002(var2.field9020);
                  } else {
                     if (var10 > 0 && var11 instanceof Class3277) {
                        Class3277 var14 = (Class3277)var11;
                        if (var14.method11799(var9) && !var2.field9020) {
                           var14.method11801(var9);
                           this.method12051(var2, var3, var1, var10 - 1);
                           var4.method2911(Class8876.field40144);
                           return ActionResultType.field14818;
                        }
                     }

                     if (var10 > 0 && var11 instanceof Class3301) {
                        if (Class958.method3889(var9) > 0 && !var2.field9020) {
                           ItemStack var16 = var9.copy();
                           var16.method32180(1);
                           Class958.method3892(var16);
                           var4.method2911(Class8876.field40145);
                           if (!var4.field4919.field29609) {
                              var9.method32182(1);
                              this.method12051(var2, var3, var1, var10 - 1);
                           }

                           if (!var9.method32105()) {
                              if (var4.field4902.method4045(var16)) {
                                 if (var4 instanceof Class878) {
                                    ((Class878)var4).method2771(var4.field4904);
                                 }
                              } else {
                                 var4.method2882(var16, false);
                              }
                           } else {
                              var4.method3095(var5, var16);
                           }
                        }

                        return ActionResultType.method9002(var2.field9020);
                     } else if (var10 > 0 && var11 instanceof Class3292) {
                        Block var15 = ((Class3292)var11).method11845();
                        if (var15 instanceof Class3368 && !var2.method6714()) {
                           ItemStack var13 = new ItemStack(Blocks.field36896, 1);
                           if (var9.method32141()) {
                              var13.method32148(var9.method32142().method79());
                           }

                           var4.method3095(var5, var13);
                           this.method12051(var2, var3, var1, var10 - 1);
                           var4.method2911(Class8876.field40146);
                           return ActionResultType.field14818;
                        } else {
                           return ActionResultType.field14819;
                        }
                     } else {
                        return ActionResultType.field14820;
                     }
                  }
               } else {
                  if (var10 > 0 && !var2.field9020) {
                     if (!var4.field4919.field29609) {
                        ItemStack var12 = Class9741.method38187(new ItemStack(Class8514.field37971), Class8137.field34977);
                        var4.method2911(Class8876.field40143);
                        var9.method32182(1);
                        if (!var9.method32105()) {
                           if (var4.field4902.method4045(var12)) {
                              if (var4 instanceof Class878) {
                                 ((Class878)var4).method2771(var4.field4904);
                              }
                           } else {
                              var4.method2882(var12, false);
                           }
                        } else {
                           var4.method3095(var5, var12);
                        }
                     }

                     var2.method6742((PlayerEntity)null, var3, Class6067.field26418, Class2266.field14732, 1.0F, 1.0F);
                     this.method12051(var2, var3, var1, var10 - 1);
                  }

                  return ActionResultType.method9002(var2.field9020);
               }
            } else {
               if (var10 == 3 && !var2.field9020) {
                  if (!var4.field4919.field29609) {
                     var9.method32182(1);
                     if (!var9.method32105()) {
                        if (!var4.field4902.method4045(new ItemStack(Class8514.field37883))) {
                           var4.method2882(new ItemStack(Class8514.field37883), false);
                        }
                     } else {
                        var4.method3095(var5, new ItemStack(Class8514.field37883));
                     }
                  }

                  var4.method2911(Class8876.field40143);
                  this.method12051(var2, var3, var1, 0);
                  var2.method6742((PlayerEntity)null, var3, Class6067.field26429, Class2266.field14732, 1.0F, 1.0F);
               }

               return ActionResultType.method9002(var2.field9020);
            }
         } else {
            if (var10 < 3 && !var2.field9020) {
               if (!var4.field4919.field29609) {
                  var4.method3095(var5, new ItemStack(Class8514.field37882));
               }

               var4.method2911(Class8876.field40142);
               this.method12051(var2, var3, var1, 3);
               var2.method6742((PlayerEntity)null, var3, Class6067.field26426, Class2266.field14732, 1.0F, 1.0F);
            }

            return ActionResultType.method9002(var2.field9020);
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   public void method12051(World var1, BlockPos var2, Class7380 var3, int var4) {
      var1.method6725(var2, var3.method23465(field19100, Integer.valueOf(MathHelper.method37775(var4, 0, 3))), 2);
      var1.method6806(var2, this);
   }

   @Override
   public void method11575(World var1, BlockPos var2) {
      if (var1.field9016.nextInt(20) == 1) {
         float var5 = var1.method7003(var2).method32503(var2);
         if (!(var5 < 0.15F)) {
            Class7380 var6 = var1.method6738(var2);
            if (var6.<Integer>method23463(field19100) < 3) {
               var1.method6725(var2, var6.method23459(field19100), 2);
            }
         }
      }
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, World var2, BlockPos var3) {
      return var1.<Integer>method23463(field19100);
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19100);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
