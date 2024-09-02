package mapped;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import it.unimi.dsi.fastutil.bytes.ByteSet;
import net.minecraft.nbt.NBTTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.IntArrayNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListNBT extends Class27<INBT> {
   public static final Class7052<ListNBT> field87 = new Class7064();
   private static final ByteSet field88 = new ByteOpenHashSet(Arrays.<Byte>asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
   private final List<INBT> field89;
   private byte field90;

   private ListNBT(List<INBT> var1, byte var2) {
      this.field89 = var1;
      this.field90 = var2;
   }

   public ListNBT() {
      this(Lists.newArrayList(), (byte)0);
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      if (!this.field89.isEmpty()) {
         this.field90 = this.field89.get(0).getId();
      } else {
         this.field90 = 0;
      }

      var1.writeByte(this.field90);
      var1.writeInt(this.field89.size());

      for (INBT var5 : this.field89) {
         var5.write(var1);
      }
   }

   @Override
   public byte getId() {
      return 9;
   }

   @Override
   public Class7052<ListNBT> method75() {
      return field87;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("[");

      for (int var4 = 0; var4 < this.field89.size(); var4++) {
         if (var4 != 0) {
            var3.append(',');
         }

         var3.append(this.field89.get(var4));
      }

      return var3.append(']').toString();
   }

   private void method152() {
      if (this.field89.isEmpty()) {
         this.field90 = 0;
      }
   }

   @Override
   public INBT remove(int var1) {
      INBT var4 = this.field89.remove(var1);
      this.method152();
      return var4;
   }

   @Override
   public boolean isEmpty() {
      return this.field89.isEmpty();
   }

   public CompoundNBT method153(int var1) {
      if (var1 >= 0 && var1 < this.field89.size()) {
         INBT var4 = this.field89.get(var1);
         if (var4.getId() == 10) {
            return (CompoundNBT)var4;
         }
      }

      return new CompoundNBT();
   }

   public ListNBT method154(int var1) {
      if (var1 >= 0 && var1 < this.field89.size()) {
         INBT var4 = this.field89.get(var1);
         if (var4.getId() == 9) {
            return (ListNBT)var4;
         }
      }

      return new ListNBT();
   }

   public short method155(int var1) {
      if (var1 >= 0 && var1 < this.field89.size()) {
         INBT var4 = this.field89.get(var1);
         if (var4.getId() == 2) {
            return ((Class37)var4).getShort();
         }
      }

      return 0;
   }

   public int method156(int var1) {
      if (var1 >= 0 && var1 < this.field89.size()) {
         INBT var4 = this.field89.get(var1);
         if (var4.getId() == 3) {
            return ((Class36)var4).getInt();
         }
      }

      return 0;
   }

   public int[] method157(int var1) {
      if (var1 >= 0 && var1 < this.field89.size()) {
         INBT var4 = this.field89.get(var1);
         if (var4.getId() == 11) {
            return ((IntArrayNBT)var4).getIntArray();
         }
      }

      return new int[0];
   }

   public double method158(int var1) {
      if (var1 >= 0 && var1 < this.field89.size()) {
         INBT var4 = this.field89.get(var1);
         if (var4.getId() == 6) {
            return ((Class34)var4).getDouble();
         }
      }

      return 0.0;
   }

   public float method159(int var1) {
      if (var1 >= 0 && var1 < this.field89.size()) {
         INBT var4 = this.field89.get(var1);
         if (var4.getId() == 5) {
            return ((Class32)var4).getFloat();
         }
      }

      return 0.0F;
   }

   public String method160(int var1) {
      if (var1 >= 0 && var1 < this.field89.size()) {
         INBT var4 = this.field89.get(var1);
         return var4.getId() != 8 ? var4.toString() : var4.getString();
      } else {
         return "";
      }
   }

   @Override
   public int size() {
      return this.field89.size();
   }

   public INBT get(int var1) {
      return this.field89.get(var1);
   }

   @Override
   public INBT set(int var1, INBT var2) {
      INBT var5 = this.get(var1);
      if (this.method70(var1, var2)) {
         return var5;
      } else {
         throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", var2.getId(), this.field90));
      }
   }

   @Override
   public void add(int var1, INBT var2) {
      if (!this.method71(var1, var2)) {
         throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", var2.getId(), this.field90));
      }
   }

   @Override
   public boolean method70(int var1, INBT var2) {
      if (!this.method161(var2)) {
         return false;
      } else {
         this.field89.set(var1, var2);
         return true;
      }
   }

   @Override
   public boolean method71(int var1, INBT var2) {
      if (!this.method161(var2)) {
         return false;
      } else {
         this.field89.add(var1, var2);
         return true;
      }
   }

   private boolean method161(INBT var1) {
      if (var1.getId() != 0) {
         if (this.field90 != 0) {
            return this.field90 == var1.getId();
         } else {
            this.field90 = var1.getId();
            return true;
         }
      } else {
         return false;
      }
   }

   public ListNBT method79() {
      Object var3 = !NBTTypes.getGetTypeByID(this.field90).method21977() ? Iterables.transform(this.field89, INBT::method79) : this.field89;
      ArrayList var4 = Lists.newArrayList((Iterable)var3);
      return new ListNBT(var4, this.field90);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof ListNBT && Objects.equals(this.field89, ((ListNBT)var1).field89);
   }

   @Override
   public int hashCode() {
      return this.field89.hashCode();
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      if (!this.isEmpty()) {
         if (field88.contains(this.field90) && this.size() <= 8) {
            String var9 = ", ";
            StringTextComponent var10 = new StringTextComponent("[");

            for (int var11 = 0; var11 < this.field89.size(); var11++) {
               if (var11 != 0) {
                  var10.appendString(", ");
               }

               var10.append(this.field89.get(var11).method82());
            }

            var10.appendString("]");
            return var10;
         } else {
            StringTextComponent var5 = new StringTextComponent("[");
            if (!var1.isEmpty()) {
               var5.appendString("\n");
            }

            String var6 = String.valueOf(',');

            for (int var7 = 0; var7 < this.field89.size(); var7++) {
               StringTextComponent var8 = new StringTextComponent(Strings.repeat(var1, var2 + 1));
               var8.append(this.field89.get(var7).method78(var1, var2 + 1));
               if (var7 != this.field89.size() - 1) {
                  var8.appendString(var6).appendString(!var1.isEmpty() ? "\n" : " ");
               }

               var5.append(var8);
            }

            if (!var1.isEmpty()) {
               var5.appendString("\n").appendString(Strings.repeat(var1, var2));
            }

            var5.appendString("]");
            return var5;
         }
      } else {
         return new StringTextComponent("[]");
      }
   }

   @Override
   public byte method72() {
      return this.field90;
   }

   @Override
   public void clear() {
      this.field89.clear();
      this.field90 = 0;
   }

   // $VF: synthetic method
   public ListNBT(List var1, byte var2, Class7064 var3) {
      this(var1, var2);
   }
}
