package mapped;

import java.util.List;
import java.util.Random;

public class Class5822 extends Class5812 {
   private static String[] field25504;
   private final Class920 field25505 = new Class983(this, 2);
   private final Class8786 field25506;
   private final Random field25507 = new Random();
   private final Class4923 field25508 = Class4923.method15238();
   public final int[] field25509 = new int[3];
   public final int[] field25510 = new int[]{-1, -1, -1};
   public final int[] field25511 = new int[]{-1, -1, -1};

   public Class5822(int var1, Class974 var2) {
      this(var1, var2, Class8786.field39521);
   }

   public Class5822(int var1, Class974 var2, Class8786 var3) {
      super(Class8298.field35660, var1);
      this.field25506 = var3;
      this.method18124(new Class5842(this, this.field25505, 0, 15, 47));
      this.method18124(new Class5865(this, this.field25505, 1, 35, 47));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method18124(new Class5839(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method18124(new Class5839(var2, var8, 8 + var8 * 18, 142));
      }

      this.method18125(Class4923.method15237(this.field25509, 0));
      this.method18125(Class4923.method15237(this.field25509, 1));
      this.method18125(Class4923.method15237(this.field25509, 2));
      this.method18125(this.field25508).method15235(var2.field5444.method2929());
      this.method18125(Class4923.method15237(this.field25510, 0));
      this.method18125(Class4923.method15237(this.field25510, 1));
      this.method18125(Class4923.method15237(this.field25510, 2));
      this.method18125(Class4923.method15237(this.field25511, 0));
      this.method18125(Class4923.method15237(this.field25511, 1));
      this.method18125(Class4923.method15237(this.field25511, 2));
   }

   @Override
   public void method18106(Class920 var1) {
      if (var1 == this.field25505) {
         ItemStack var4 = var1.method3618(0);
         if (!var4.method32105() && var4.method32161()) {
            this.field25506.method31716((var2, var3) -> {
               int var6 = 0;

               for (int var7 = -1; var7 <= 1; var7++) {
                  for (int var8 = -1; var8 <= 1; var8++) {
                     if ((var7 != 0 || var8 != 0) && var2.method7007(var3.method8336(var8, 0, var7)) && var2.method7007(var3.method8336(var8, 1, var7))) {
                        if (var2.method6738(var3.method8336(var8 * 2, 0, var7 * 2)).method23448(Blocks.field36525)) {
                           var6++;
                        }

                        if (var2.method6738(var3.method8336(var8 * 2, 1, var7 * 2)).method23448(Blocks.field36525)) {
                           var6++;
                        }

                        if (var8 != 0 && var7 != 0) {
                           if (var2.method6738(var3.method8336(var8 * 2, 0, var7)).method23448(Blocks.field36525)) {
                              var6++;
                           }

                           if (var2.method6738(var3.method8336(var8 * 2, 1, var7)).method23448(Blocks.field36525)) {
                              var6++;
                           }

                           if (var2.method6738(var3.method8336(var8, 0, var7 * 2)).method23448(Blocks.field36525)) {
                              var6++;
                           }

                           if (var2.method6738(var3.method8336(var8, 1, var7 * 2)).method23448(Blocks.field36525)) {
                              var6++;
                           }
                        }
                     }
                  }
               }

               this.field25507.setSeed((long)this.field25508.method15234());

               for (int var10 = 0; var10 < 3; var10++) {
                  this.field25509[var10] = Class7858.method26341(this.field25507, var10, var6, var4);
                  this.field25510[var10] = -1;
                  this.field25511[var10] = -1;
                  if (this.field25509[var10] < var10 + 1) {
                     this.field25509[var10] = 0;
                  }
               }

               for (int var11 = 0; var11 < 3; var11++) {
                  if (this.field25509[var11] > 0) {
                     List var12 = this.method18183(var4, var11, this.field25509[var11]);
                     if (var12 != null && !var12.isEmpty()) {
                        Class6694 var9 = (Class6694)var12.get(this.field25507.nextInt(var12.size()));
                        this.field25510[var11] = Class2348.field16073.method9171(var9.field29316);
                        this.field25511[var11] = var9.field29317;
                     }
                  }
               }

               this.method18130();
            });
         } else {
            for (int var5 = 0; var5 < 3; var5++) {
               this.field25509[var5] = 0;
               this.field25510[var5] = -1;
               this.field25511[var5] = -1;
            }
         }
      }
   }

   @Override
   public boolean method18104(PlayerEntity var1, int var2) {
      ItemStack var5 = this.field25505.method3618(0);
      ItemStack var6 = this.field25505.method3618(1);
      int var7 = var2 + 1;
      if ((var6.method32105() || var6.method32179() < var7) && !var1.field4919.field29609) {
         return false;
      } else if (this.field25509[var2] > 0
         && !var5.method32105()
         && (var1.field4920 >= var7 && var1.field4920 >= this.field25509[var2] || var1.field4919.field29609)) {
         this.field25506.method31716((var6x, var7x) -> {
            ItemStack var10 = var5;
            List var11 = this.method18183(var5, var2, this.field25509[var2]);
            if (!var11.isEmpty()) {
               var1.method2728(var5, var7);
               boolean var12 = var5.method32107() == Class8514.field37900;
               if (var12) {
                  var10 = new ItemStack(Class8514.field38070);
                  Class39 var13 = var5.method32142();
                  if (var13 != null) {
                     var10.method32148(var13.method79());
                  }

                  this.field25505.method3621(0, var10);
               }

               for (int var15 = 0; var15 < var11.size(); var15++) {
                  Class6694 var14 = (Class6694)var11.get(var15);
                  if (!var12) {
                     var10.method32162(var14.field29316, var14.field29317);
                  } else {
                     Class3290.method11831(var10, var14);
                  }
               }

               if (!var1.field4919.field29609) {
                  var6.method32182(var7);
                  if (var6.method32105()) {
                     this.field25505.method3621(1, ItemStack.EMPTY);
                  }
               }

               var1.method2911(Class8876.field40157);
               if (var1 instanceof ServerPlayerEntity) {
                  CriteriaTriggers.field44473.method15177((ServerPlayerEntity)var1, var10, var7);
               }

               this.field25505.method3622();
               this.field25508.method15235(var1.method2929());
               this.method18106(this.field25505);
               var6x.method6742((PlayerEntity)null, var7x, Class6067.field26533, Class2266.field14732, 1.0F, var6x.field9016.nextFloat() * 0.1F + 0.9F);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   private List<Class6694> method18183(ItemStack var1, int var2, int var3) {
      this.field25507.setSeed((long)(this.field25508.method15234() + var2));
      List var6 = Class7858.method26343(this.field25507, var1, var3, false);
      if (var1.method32107() == Class8514.field37900 && var6.size() > 1) {
         var6.remove(this.field25507.nextInt(var6.size()));
      }

      return var6;
   }

   public int method18184() {
      ItemStack var3 = this.field25505.method3618(1);
      return !var3.method32105() ? var3.method32179() : 0;
   }

   public int method18185() {
      return this.field25508.method15234();
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25506.method31716((var2, var3) -> this.method18135(var1, var1.field5024, this.field25505));
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return method18121(this.field25506, var1, Blocks.ENCHANTING_TABLE);
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         if (var2 != 0) {
            if (var2 != 1) {
               if (var7.method32107() != Class8514.field37917) {
                  if (this.field25468.get(0).method18266() || !this.field25468.get(0).method18259(var7)) {
                     return ItemStack.EMPTY;
                  }

                  ItemStack var8 = var7.copy();
                  var8.method32180(1);
                  var7.method32182(1);
                  this.field25468.get(0).method18267(var8);
               } else if (!this.method18142(var7, 1, 2, true)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method18142(var7, 2, 38, true)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.method18142(var7, 2, 38, true)) {
            return ItemStack.EMPTY;
         }

         if (!var7.method32105()) {
            var6.method18268();
         } else {
            var6.method18267(ItemStack.EMPTY);
         }

         if (var7.method32179() == var5.method32179()) {
            return ItemStack.EMPTY;
         }

         var6.method18264(var1, var7);
      }

      return var5;
   }
}