package net.minecraft.nbt;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import mapped.*;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class CompoundNBT implements Class30 {
   public static final Codec<CompoundNBT> field79 = Codec.PASSTHROUGH.comapFlatMap(var0 -> {
      Class30 var3 = (Class30)var0.convert(NBTDynamicOps.INSTANCE).getValue();
      return !(var3 instanceof CompoundNBT) ? DataResult.error("Not a compound tag: " + var3) : DataResult.success((CompoundNBT)var3);
   }, var0 -> new Dynamic(NBTDynamicOps.INSTANCE, var0));
   private static final Logger field80 = LogManager.getLogger();
   private static final Pattern field81 = Pattern.compile("[A-Za-z0-9._+-]+");
   public static final Class7052<CompoundNBT> field82 = new Class7054();
   private final Map<String, Class30> field83;

   public CompoundNBT(Map<String, Class30> var1) {
      this.field83 = var1;
   }

   public CompoundNBT() {
      this(Maps.newHashMap());
   }

   @Override
   public void method73(DataOutput var1) throws IOException {
      for (String var5 : this.field83.keySet()) {
         Class30 var6 = this.field83.get(var5);
         method136(var5, var6, var1);
      }

      var1.writeByte(0);
   }

   public Set<String> method97() {
      return this.field83.keySet();
   }

   @Override
   public byte method74() {
      return 10;
   }

   @Override
   public Class7052<CompoundNBT> method75() {
      return field82;
   }

   public int method98() {
      return this.field83.size();
   }

   @Nullable
   public Class30 put(String var1, Class30 var2) {
      return this.field83.put(var1, var2);
   }

   public void method100(String var1, byte var2) {
      this.field83.put(var1, Class33.method91(var2));
   }

   public void method101(String var1, short var2) {
      this.field83.put(var1, Class37.method96(var2));
   }

   public void method102(String var1, int var2) {
      this.field83.put(var1, Class36.method95(var2));
   }

   public void method103(String var1, long var2) {
      this.field83.put(var1, Class35.method94(var2));
   }

   public void method104(String var1, UUID var2) {
      this.field83.put(var1, Class8354.method29281(var2));
   }

   public UUID method105(String var1) {
      return Class8354.method29282(this.method116(var1));
   }

   public boolean method106(String var1) {
      Class30 var4 = this.method116(var1);
      return var4 != null && var4.method75() == Class28.field52 && ((Class28)var4).method77().length == 4;
   }

   public void putFloat(String var1, float var2) {
      this.field83.put(var1, Class32.method90(var2));
   }

   public void method108(String var1, double var2) {
      this.field83.put(var1, Class34.method93(var2));
   }

   public void method109(String var1, String var2) {
      this.field83.put(var1, StringNBT.valueOf(var2));
   }

   public void method110(String var1, byte[] var2) {
      this.field83.put(var1, new Class29(var2));
   }

   public void method111(String var1, int[] var2) {
      this.field83.put(var1, new Class28(var2));
   }

   public void method112(String var1, List<Integer> var2) {
      this.field83.put(var1, new Class28(var2));
   }

   public void method113(String var1, long[] var2) {
      this.field83.put(var1, new Class42(var2));
   }

   public void method114(String var1, List<Long> var2) {
      this.field83.put(var1, new Class42(var2));
   }

   public void putBoolean(String var1, boolean var2) {
      this.field83.put(var1, Class33.method92(var2));
   }

   @Nullable
   public Class30 method116(String var1) {
      return this.field83.get(var1);
   }

   public byte method117(String var1) {
      Class30 var4 = this.field83.get(var1);
      return var4 != null ? var4.method74() : 0;
   }

   public boolean contains(String var1) {
      return this.field83.containsKey(var1);
   }

   public boolean contains(String var1, int var2) {
      byte var5 = this.method117(var1);
      if (var5 != var2) {
         return var2 != 99 ? false : var5 == 1 || var5 == 2 || var5 == 3 || var5 == 4 || var5 == 5 || var5 == 6;
      } else {
         return true;
      }
   }

   public byte method120(String var1) {
      try {
         if (this.contains(var1, 99)) {
            return ((Class31)this.field83.get(var1)).method86();
         }
      } catch (ClassCastException var5) {
      }

      return 0;
   }

   public short method121(String var1) {
      try {
         if (this.contains(var1, 99)) {
            return ((Class31)this.field83.get(var1)).method85();
         }
      } catch (ClassCastException var5) {
      }

      return 0;
   }

   public int method122(String var1) {
      try {
         if (this.contains(var1, 99)) {
            return ((Class31)this.field83.get(var1)).method84();
         }
      } catch (ClassCastException var5) {
      }

      return 0;
   }

   public long method123(String var1) {
      try {
         if (this.contains(var1, 99)) {
            return ((Class31)this.field83.get(var1)).method83();
         }
      } catch (ClassCastException var5) {
      }

      return 0L;
   }

   public float getFloat(String var1) {
      try {
         if (this.contains(var1, 99)) {
            return ((Class31)this.field83.get(var1)).method88();
         }
      } catch (ClassCastException var5) {
      }

      return 0.0F;
   }

   public double method125(String var1) {
      try {
         if (this.contains(var1, 99)) {
            return ((Class31)this.field83.get(var1)).method87();
         }
      } catch (ClassCastException var5) {
      }

      return 0.0;
   }

   public String method126(String var1) {
      try {
         if (this.contains(var1, 8)) {
            return this.field83.get(var1).method81();
         }
      } catch (ClassCastException var5) {
      }

      return "";
   }

   public byte[] method127(String var1) {
      try {
         if (this.contains(var1, 7)) {
            return ((Class29)this.field83.get(var1)).method80();
         }
      } catch (ClassCastException var5) {
         throw new ReportedException(this.method135(var1, Class29.field54, var5));
      }

      return new byte[0];
   }

   public int[] method128(String var1) {
      try {
         if (this.contains(var1, 11)) {
            return ((Class28)this.field83.get(var1)).method77();
         }
      } catch (ClassCastException var5) {
         throw new ReportedException(this.method135(var1, Class28.field52, var5));
      }

      return new int[0];
   }

   public long[] method129(String var1) {
      try {
         if (this.contains(var1, 12)) {
            return ((Class42)this.field83.get(var1)).method162();
         }
      } catch (ClassCastException var5) {
         throw new ReportedException(this.method135(var1, Class42.field91, var5));
      }

      return new long[0];
   }

   public CompoundNBT getCompound(String var1) {
      try {
         if (this.contains(var1, 10)) {
            return (CompoundNBT)this.field83.get(var1);
         }
      } catch (ClassCastException var5) {
         throw new ReportedException(this.method135(var1, field82, var5));
      }

      return new CompoundNBT();
   }

   public ListNBT method131(String var1, int var2) {
      try {
         if (this.method117(var1) == 9) {
            ListNBT var5 = (ListNBT)this.field83.get(var1);
            if (!var5.isEmpty() && var5.method72() != var2) {
               return new ListNBT();
            }

            return var5;
         }
      } catch (ClassCastException var6) {
         throw new ReportedException(this.method135(var1, ListNBT.field87, var6));
      }

      return new ListNBT();
   }

   public boolean getBoolean(String var1) {
      return this.method120(var1) != 0;
   }

   public void method133(String var1) {
      this.field83.remove(var1);
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("{");
      Collection<String> var4 = this.field83.keySet();
      if (field80.isDebugEnabled()) {
         List<String> var5 = Lists.newArrayList(this.field83.keySet());
         Collections.sort(var5);
         var4 = var5;
      }

      for (String var6 : var4) {
         if (var3.length() != 1) {
            var3.append(',');
         }

         var3.append(method141(var6)).append(':').append(this.field83.get(var6));
      }

      return var3.append('}').toString();
   }

   public boolean method134() {
      return this.field83.isEmpty();
   }

   private CrashReport method135(String var1, Class7052<?> var2, ClassCastException var3) {
      CrashReport var6 = CrashReport.makeCrashReport(var3, "Reading NBT data");
      CrashReportCategory var7 = var6.method14411("Corrupt NBT tag", 1);
      var7.addDetail("Tag type found", () -> this.field83.get(var1).method75().method21975());
      var7.addDetail("Tag type expected", var2::method21975);
      var7.addDetail("Tag name", var1);
      return var6;
   }

   public CompoundNBT method79() {
      HashMap var3 = Maps.newHashMap(Maps.transformValues(this.field83, Class30::method79));
      return new CompoundNBT(var3);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof CompoundNBT && Objects.equals(this.field83, ((CompoundNBT)var1).field83);
   }

   @Override
   public int hashCode() {
      return this.field83.hashCode();
   }

   private static void method136(String var0, Class30 var1, DataOutput var2) throws IOException {
      var2.writeByte(var1.method74());
      if (var1.method74() != 0) {
         var2.writeUTF(var0);
         var1.method73(var2);
      }
   }

   private static byte method137(DataInput var0, Class8465 var1) throws IOException {
      return var0.readByte();
   }

   private static String method138(DataInput var0, Class8465 var1) throws IOException {
      return var0.readUTF();
   }

   private static Class30 method139(Class7052<?> var0, String var1, DataInput var2, int var3, Class8465 var4) {
      try {
         return var0.method21978(var2, var3, var4);
      } catch (IOException var10) {
         CrashReport var8 = CrashReport.makeCrashReport(var10, "Loading NBT data");
         CrashReportCategory var9 = var8.makeCategory("NBT Tag");
         var9.addDetail("Tag name", var1);
         var9.addDetail("Tag type", var0.method21975());
         throw new ReportedException(var8);
      }
   }

   public CompoundNBT method140(CompoundNBT var1) {
      for (String var5 : var1.field83.keySet()) {
         Class30 var6 = var1.field83.get(var5);
         if (var6.method74() != 10) {
            this.put(var5, var6.method79());
         } else if (!this.contains(var5, 10)) {
            this.put(var5, var6.method79());
         } else {
            CompoundNBT var7 = this.getCompound(var5);
            var7.method140((CompoundNBT)var6);
         }
      }

      return this;
   }

   public static String method141(String var0) {
      return !field81.matcher(var0).matches() ? StringNBT.method151(var0) : var0;
   }

   public static ITextComponent method142(String var0) {
      if (!field81.matcher(var0).matches()) {
         String var3 = StringNBT.method151(var0);
         String var4 = var3.substring(0, 1);
         IFormattableTextComponent var5 = new StringTextComponent(var3.substring(1, var3.length() - 1)).mergeStyle(field56);
         return new StringTextComponent(var4).append(var5).appendString(var4);
      } else {
         return new StringTextComponent(var0).mergeStyle(field56);
      }
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      if (!this.field83.isEmpty()) {
         StringTextComponent var5 = new StringTextComponent("{");
         Collection<String> var6 = this.field83.keySet();
         if (field80.isDebugEnabled()) {
            List<String> var8 = Lists.newArrayList(this.field83.keySet());
            Collections.sort(var8);
            var6 = var8;
         }

         if (!var1.isEmpty()) {
            var5.appendString("\n");
         }

         Iterator<String> var7 = var6.iterator();

         while (var7.hasNext()) {
            String var9 = var7.next();
            IFormattableTextComponent var10 = new StringTextComponent(Strings.repeat(var1, var2 + 1))
               .append(method142(var9))
               .appendString(String.valueOf(':'))
               .appendString(" ")
               .append(this.field83.get(var9).method78(var1, var2 + 1));
            if (var7.hasNext()) {
               var10.appendString(String.valueOf(',')).appendString(!var1.isEmpty() ? "\n" : " ");
            }

            var5.append(var10);
         }

         if (!var1.isEmpty()) {
            var5.appendString("\n").appendString(Strings.repeat(var1, var2));
         }

         var5.appendString("}");
         return var5;
      } else {
         return new StringTextComponent("{}");
      }
   }

   public Map<String, Class30> method143() {
      return Collections.<String, Class30>unmodifiableMap(this.field83);
   }

   // $VF: synthetic method
   public static byte method147(DataInput var0, Class8465 var1) throws IOException {
      return method137(var0, var1);
   }

   // $VF: synthetic method
   public static String method148(DataInput var0, Class8465 var1) throws IOException {
      return method138(var0, var1);
   }

   // $VF: synthetic method
   public static Class30 method149(Class7052 var0, String var1, DataInput var2, int var3, Class8465 var4) {
      return method139(var0, var1, var2, var3, var4);
   }
}
