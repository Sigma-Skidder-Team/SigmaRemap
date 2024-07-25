package remapped;

import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public abstract class class_3757 {
   private static final Logger field_18360 = LogManager.getLogger();
   private final class_133<?> field_18362;
   public World field_18364;
   public class_1331 field_18358 = class_1331.field_7306;
   public boolean field_18361;
   private class_2522 field_18363;
   private boolean field_18359;

   public class_3757(class_133<?> var1) {
      this.field_18362 = var1;
   }

   @Nullable
   public World method_17402() {
      return this.field_18364;
   }

   public void method_17393(World var1, class_1331 var2) {
      this.field_18364 = var1;
      this.field_18358 = var2.method_6072();
   }

   public boolean method_17392() {
      return this.field_18364 != null;
   }

   public void method_17394(class_2522 var1, CompoundNBT var2) {
      this.field_18358 = new class_1331(var2.method_25947("x"), var2.method_25947("y"), var2.method_25947("z"));
   }

   public CompoundNBT method_17396(CompoundNBT var1) {
      return this.method_17401(var1);
   }

   private CompoundNBT method_17401(CompoundNBT var1) {
      Identifier var4 = class_133.method_445(this.method_17405());
      if (var4 != null) {
         var1.method_25941("id", var4.toString());
         var1.method_25931("x", this.field_18358.method_12173());
         var1.method_25931("y", this.field_18358.method_12165());
         var1.method_25931("z", this.field_18358.method_12185());
         return var1;
      } else {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      }
   }

   @Nullable
   public static class_3757 method_17410(class_2522 var0, CompoundNBT var1) {
      String var4 = var1.method_25965("id");
      return class_8669.field_44426.method_39794(new Identifier(var4)).<class_3757>map(var1x -> {
         try {
            return var1x.method_449();
         } catch (Throwable var5) {
            field_18360.error("Failed to create block entity {}", var4, var5);
            return null;
         }
      }).<class_3757>map(var3 -> {
         try {
            var3.method_17394(var0, var1);
            return (class_3757)var3;
         } catch (Throwable var7) {
            field_18360.error("Failed to load data for block entity {}", var4, var7);
            return null;
         }
      }).orElseGet(() -> {
         field_18360.warn("Skipping BlockEntity with id {}", var4);
         return null;
      });
   }

   public void method_17407() {
      if (this.field_18364 != null) {
         this.field_18363 = this.field_18364.method_28262(this.field_18358);
         this.field_18364.method_29557(this.field_18358, this);
         if (!this.field_18363.method_8345()) {
            this.field_18364.method_29523(this.field_18358, this.field_18363.method_8360());
         }
      }
   }

   public double method_17404() {
      return 64.0;
   }

   public class_1331 method_17399() {
      return this.field_18358;
   }

   public class_2522 method_17403() {
      if (this.field_18363 == null) {
         this.field_18363 = this.field_18364.method_28262(this.field_18358);
      }

      return this.field_18363;
   }

   @Nullable
   public class_5029 method_17413() {
      return null;
   }

   public CompoundNBT method_17414() {
      return this.method_17401(new CompoundNBT());
   }

   public boolean method_17395() {
      return this.field_18361;
   }

   public void method_17406() {
      this.field_18361 = true;
   }

   public void method_17412() {
      this.field_18361 = false;
   }

   public boolean method_17408(int var1, int var2) {
      return false;
   }

   public void method_17400() {
      this.field_18363 = null;
   }

   public void method_17398(class_6544 var1) {
      var1.method_29851("Name", () -> class_8669.field_44426.method_39797(this.method_17405()) + " // " + this.getClass().getCanonicalName());
      if (this.field_18364 != null) {
         class_6544.method_29843(var1, this.field_18358, this.method_17403());
         class_6544.method_29843(var1, this.field_18358, this.field_18364.method_28262(this.field_18358));
      }
   }

   public void method_17390(class_1331 var1) {
      this.field_18358 = var1.method_6072();
   }

   public boolean method_17397() {
      return false;
   }

   public void method_17391(class_6631 var1) {
   }

   public void method_17389(class_9022 var1) {
   }

   public class_133<?> method_17405() {
      return this.field_18362;
   }

   public void method_17411() {
      if (!this.field_18359) {
         this.field_18359 = true;
         field_18360.warn("Block entity invalid: {} @ {}", new Supplier[]{() -> class_8669.field_44426.method_39797(this.method_17405()), this::method_17399});
      }
   }
}
