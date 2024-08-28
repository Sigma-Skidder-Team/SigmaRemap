package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

import javax.annotation.Nullable;

public abstract class Class944 {
   private static final Logger field5322 = LogManager.getLogger();
   private final Class4387<?> field5323;
   public World field5324;
   public BlockPos field5325 = BlockPos.field13032;
   public boolean field5326;
   private Class7380 field5327;
   private boolean field5328;

   public Class944(Class4387<?> var1) {
      this.field5323 = var1;
   }

   @Nullable
   public World method3734() {
      return this.field5324;
   }

   public void method3769(World var1, BlockPos var2) {
      this.field5324 = var1;
      this.field5325 = var2.method8353();
   }

   public boolean method3770() {
      return this.field5324 != null;
   }

   public void method3645(Class7380 var1, Class39 var2) {
      this.field5325 = new BlockPos(var2.method122("x"), var2.method122("y"), var2.method122("z"));
   }

   public Class39 method3646(Class39 var1) {
      return this.method3771(var1);
   }

   private Class39 method3771(Class39 var1) {
      ResourceLocation var4 = Class4387.method13793(this.method3786());
      if (var4 != null) {
         var1.method109("id", var4.toString());
         var1.method102("x", this.field5325.method8304());
         var1.method102("y", this.field5325.getY());
         var1.method102("z", this.field5325.method8306());
         return var1;
      } else {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      }
   }

   @Nullable
   public static Class944 method3772(Class7380 var0, Class39 var1) {
      String var4 = var1.method126("id");
      return Class2348.field16078.method9187(new ResourceLocation(var4)).<Class944>map(var1x -> {
         try {
            return var1x.method13795();
         } catch (Throwable var5) {
            field5322.error("Failed to create block entity {}", var4, var5);
            return null;
         }
      }).<Class944>map(var3 -> {
         try {
            var3.method3645(var0, var1);
            return (Class944)var3;
         } catch (Throwable var7) {
            field5322.error("Failed to load data for block entity {}", var4, var7);
            return null;
         }
      }).orElseGet(() -> {
         field5322.warn("Skipping BlockEntity with id {}", var4);
         return null;
      });
   }

   public void method3622() {
      if (this.field5324 != null) {
         this.field5327 = this.field5324.method6738(this.field5325);
         this.field5324.method6775(this.field5325, this);
         if (!this.field5327.method23393()) {
            this.field5324.method6806(this.field5325, this.field5327.method23383());
         }
      }
   }

   public double method3773() {
      return 64.0;
   }

   public BlockPos method3774() {
      return this.field5325;
   }

   public Class7380 method3775() {
      if (this.field5327 == null) {
         this.field5327 = this.field5324.method6738(this.field5325);
      }

      return this.field5327;
   }

   @Nullable
   public Class5610 method3776() {
      return null;
   }

   public Class39 method3777() {
      return this.method3771(new Class39());
   }

   public boolean method3778() {
      return this.field5326;
   }

   public void method3765() {
      this.field5326 = true;
   }

   public void method3779() {
      this.field5326 = false;
   }

   public boolean method3751(int var1, int var2) {
      return false;
   }

   public void method3780() {
      this.field5327 = null;
   }

   public void method3781(Class8965 var1) {
      var1.method32806("Name", () -> Class2348.field16078.method9181(this.method3786()) + " // " + this.getClass().getCanonicalName());
      if (this.field5324 != null) {
         Class8965.method32814(var1, this.field5325, this.method3775());
         Class8965.method32814(var1, this.field5325, this.field5324.method6738(this.field5325));
      }
   }

   public void method3782(BlockPos var1) {
      this.field5325 = var1.method8353();
   }

   public boolean method3783() {
      return false;
   }

   public void method3784(Class80 var1) {
   }

   public void method3785(Class2089 var1) {
   }

   public Class4387<?> method3786() {
      return this.field5323;
   }

   public void method3787() {
      if (!this.field5328) {
         this.field5328 = true;
         field5322.warn("Block entity invalid: {} @ {}", new Supplier[]{() -> Class2348.field16078.method9181(this.method3786()), this::method3774});
      }
   }
}
