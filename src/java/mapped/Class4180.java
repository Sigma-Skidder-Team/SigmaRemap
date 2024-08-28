package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public abstract class Class4180 extends Class4178 {
   private static final Logger field20452 = LogManager.getLogger();
   public Class8969 field20453;
   public Class9463 field20454;
   public BlockPos field20455;

   public Class4180(Class7792 var1, int var2) {
      super(var1, var2);
   }

   public Class4180(Class7792 var1, Class39 var2) {
      super(var1, var2);
      this.field20455 = new BlockPos(var2.method122("TPX"), var2.method122("TPY"), var2.method122("TPZ"));
   }

   public void method12943(Class8969 var1, BlockPos var2, Class9463 var3) {
      this.field20453 = var1;
      this.method12939(Direction.NORTH);
      this.field20455 = var2;
      this.field20454 = var3;
      this.field20444 = var1.method32909(var3, var2);
   }

   @Override
   public void method12897(Class39 var1) {
      var1.method102("TPX", this.field20455.method8304());
      var1.method102("TPY", this.field20455.getY());
      var1.method102("TPZ", this.field20455.method8306());
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.field20454.method36430(var5);
      this.field20444 = this.field20453.method32909(this.field20454, this.field20455);
      if (this.field20453.method32899(var1, this.field20455, var7, this.field20454, var4, 2)) {
         for (Class8266 var11 : this.field20453.method32893(this.field20455, this.field20454, Blocks.field37113)) {
            if (var11.field35532 != null) {
               Class104 var12 = Class104.valueOf(var11.field35532.method126("mode"));
               if (var12 == Class104.field321) {
                  this.method12944(var11.field35532.method126("metadata"), var11.field35530, var1, var4, var5);
               }
            }
         }

         for (Class8266 var18 : this.field20453.method32893(this.field20455, this.field20454, Blocks.field37114)) {
            if (var18.field35532 != null) {
               String var19 = var18.field35532.method126("final_state");
               Class8268 var13 = new Class8268(new StringReader(var19), false);
               Class7380 var14 = Blocks.AIR.method11579();

               try {
                  var13.method28840(true);
                  Class7380 var15 = var13.method28837();
                  if (var15 != null) {
                     var14 = var15;
                  } else {
                     field20452.error("Error while parsing blockstate {} in jigsaw block @ {}", var19, var18.field35530);
                  }
               } catch (CommandSyntaxException var16) {
                  field20452.error("Error while parsing blockstate {} in jigsaw block @ {}", var19, var18.field35530);
               }

               var1.method6725(var18.field35530, var14, 3);
            }
         }
      }

      return true;
   }

   public abstract void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, Class9764 var5);

   @Override
   public void method12937(int var1, int var2, int var3) {
      super.method12937(var1, var2, var3);
      this.field20455 = this.field20455.method8336(var1, var2, var3);
   }

   @Override
   public Class80 method12940() {
      return this.field20454.method36437();
   }
}