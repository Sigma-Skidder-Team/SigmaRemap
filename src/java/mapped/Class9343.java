package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;

import java.util.Objects;

public class Class9343 {
   private final BlockPos field43375;
   private final Class4913 field43376;
   private int field43377;
   private final Runnable field43378;

   public static Codec<Class9343> method35350(Runnable var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
                  BlockPos.field13030.fieldOf("pos").forGetter(var0xx -> var0xx.field43375),
                  Registry.field16091.fieldOf("type").forGetter(var0xx -> var0xx.field43376),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(var0xx -> var0xx.field43377),
                  RecordCodecBuilder.point(var0)
               )
               .apply(var1, Class9343::new)
      );
   }

   private Class9343(BlockPos var1, Class4913 var2, int var3, Runnable var4) {
      this.field43375 = var1.method8353();
      this.field43376 = var2;
      this.field43377 = var3;
      this.field43378 = var4;
   }

   public Class9343(BlockPos var1, Class4913 var2, Runnable var3) {
      this(var1, var2, var2.method15181(), var3);
   }

   public boolean method35351() {
      if (this.field43377 > 0) {
         this.field43377--;
         this.field43378.run();
         return true;
      } else {
         return false;
      }
   }

   public boolean method35352() {
      if (this.field43377 < this.field43376.method15181()) {
         this.field43377++;
         this.field43378.run();
         return true;
      } else {
         return false;
      }
   }

   public boolean method35353() {
      return this.field43377 > 0;
   }

   public boolean method35354() {
      return this.field43377 != this.field43376.method15181();
   }

   public BlockPos method35355() {
      return this.field43375;
   }

   public Class4913 method35356() {
      return this.field43376;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? Objects.equals(this.field43375, ((Class9343)var1).field43375) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.field43375.hashCode();
   }
}
