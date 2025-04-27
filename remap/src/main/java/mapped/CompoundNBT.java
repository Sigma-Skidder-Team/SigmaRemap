// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.*;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import com.google.common.base.Strings;
import java.io.DataInput;
import java.util.*;

import com.google.common.collect.Lists;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.DataOutput;
import com.google.common.collect.Maps;

import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;

public class CompoundNBT implements INBT
{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Pattern SIMPLE_VALUE = Pattern.compile("[A-Za-z0-9._+-]+");
    public static final INBTType<CompoundNBT> TYPE = new INBTType<CompoundNBT>()
    {
        public CompoundNBT func_225649_b_(DataInput p_225649_1_, int p_225649_2_, NBTSizeTracker p_225649_3_) throws IOException
        {
            p_225649_3_.read(384L);

            if (p_225649_2_ > 512)
            {
                throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
            }
            else
            {
                Map<String, INBT> map = Maps.newHashMap();
                byte b0;

                while ((b0 = CompoundNBT.readType(p_225649_1_, p_225649_3_)) != 0)
                {
                    String s = CompoundNBT.readKey(p_225649_1_, p_225649_3_);
                    p_225649_3_.read(224 + 16L * s.length());
                    INBT inbt = CompoundNBT.func_229680_b_(NBTTypes.func_229710_a_(b0), s, p_225649_1_, p_225649_2_ + 1, p_225649_3_);

                    if (map.put(s, inbt) != null)
                    {
                        p_225649_3_.read(288L);
                    }
                }

                return new CompoundNBT(map);
            }
        }
        public String func_225648_a_()
        {
            return "COMPOUND";
        }
        public String func_225650_b_()
        {
            return "TAG_Compound";
        }
    };

    private final Map<String, INBT> tagMap;
    
    private CompoundNBT(final Map<String, INBT> field127) {
        this.tagMap = field127;
    }
    
    public CompoundNBT() {
        this(Maps.newHashMap());
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        for (final String s : this.tagMap.keySet()) {
            writeEntry(s, this.tagMap.get(s), dataOutput);
        }
        dataOutput.writeByte(0);
    }
    
    public Set<String> keySet() {
        return this.tagMap.keySet();
    }
    
    @Override
    public byte getId() {
        return 10;
    }
    
    @Override
    public INBTType<CompoundNBT> getType() {
        return CompoundNBT.TYPE;
    }
    
    public int size() {
        return this.tagMap.size();
    }
    
    @Nullable
    public INBT put(final String s, final INBT class41) {
        return this.tagMap.put(s, class41);
    }
    
    public void putByte(final String s, final byte b) {
        this.tagMap.put(s, ByteNBT.valueOf(b));
    }
    
    public void putShort(final String s, final short n) {
        this.tagMap.put(s, ShortNBT.method286(n));
    }
    
    public void putInt(final String s, final int n) {
        this.tagMap.put(s, IntNBT.valueOf(n));
    }
    
    public void putLong(final String s, final long n) {
        this.tagMap.put(s, LongNBT.method288(n));
    }
    
    public void putUniqueId(final String s, final UUID uuid) {
        this.putLong(s + "Most", uuid.getMostSignificantBits());
        this.putLong(s + "Least", uuid.getLeastSignificantBits());
    }
    
    public UUID getUniqueId(final String s) {
        return new UUID(this.getLong(s + "Most"), this.getLong(s + "Least"));
    }
    
    public boolean hasUniqueId(final String s) {
        return this.contains(s + "Most", 99) && this.contains(s + "Least", 99);
    }
    
    public void removeUniqueId(final String s) {
        this.remove(s + "Most");
        this.remove(s + "Least");
    }
    
    public void putFloat(final String s, final float n) {
        this.tagMap.put(s, FloatNBT.method281(n));
    }
    
    public void putDouble(final String s, final double n) {
        this.tagMap.put(s, DoubleNBT.method277(n));
    }
    
    public void putString(final String s, final String s2) {
        this.tagMap.put(s, StringNBT.method290(s2));
    }
    
    public void putByteArray(final String s, final byte[] array) {
        this.tagMap.put(s, new ByteArrayNBT(array));
    }
    
    public void putIntArray(final String s, final int[] array) {
        this.tagMap.put(s, new IntArrayNBT(array));
    }
    
    public void putIntArray(final String s, final List<Integer> list) {
        this.tagMap.put(s, new IntArrayNBT(list));
    }
    
    public void putLongArray(final String s, final long[] array) {
        this.tagMap.put(s, new LongArrayNBT(array));
    }
    
    public void putLongArray(final String s, final List<Long> list) {
        this.tagMap.put(s, new LongArrayNBT(list));
    }
    
    public void putBoolean(final String s, final boolean b) {
        this.tagMap.put(s, ByteNBT.method284(b));
    }
    
    @Nullable
    public INBT get(final String s) {
        return this.tagMap.get(s);
    }
    
    public byte getTagId(final String s) {
        final INBT inbt = this.tagMap.get(s);
        return (byte)((inbt != null) ? inbt.getId() : 0);
    }
    
    public boolean contains(final String s) {
        return this.tagMap.containsKey(s);
    }
    
    public boolean contains(final String s, final int n) {
        final byte i = this.getTagId(s);
        if (i == n) {
            return true;
        }
        if (n == 99) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return i == 6;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public byte getByte(final String s) {
        try {
            if (this.contains(s, 99))
            {
                return ((NumberNBT)this.tagMap.get(s)).getByte();
            }
        }
        catch (final ClassCastException ex) {}
        return 0;
    }

    public short getShort(String key)
    {
        try
        {
            if (this.contains(key, 99))
            {
                return ((NumberNBT)this.tagMap.get(key)).getShort();
            }
        }
        catch (ClassCastException var3)
        {
        }

        return 0;
    }

    public int getInt(String key)
    {
        try
        {
            if (this.contains(key, 99))
            {
                return ((NumberNBT)this.tagMap.get(key)).getInt();
            }
        }
        catch (ClassCastException var3)
        {
        }

        return 0;
    }

    public long getLong(String key)
    {
        try
        {
            if (this.contains(key, 99))
            {
                return ((NumberNBT)this.tagMap.get(key)).getLong();
            }
        }
        catch (ClassCastException var3)
        {
        }

        return 0L;
    }

    public float getFloat(String key)
    {
        try
        {
            if (this.contains(key, 99))
            {
                return ((NumberNBT)this.tagMap.get(key)).getFloat();
            }
        }
        catch (ClassCastException var3)
        {
        }

        return 0.0F;
    }

    public double getDouble(String key)
    {
        try
        {
            if (this.contains(key, 99))
            {
                return ((NumberNBT)this.tagMap.get(key)).getDouble();
            }
        }
        catch (ClassCastException var3)
        {
        }

        return 0.0D;
    }

    public String getString(String key)
    {
        try
        {
            if (this.contains(key, 8))
            {
                return this.tagMap.get(key).getString();
            }
        }
        catch (ClassCastException var3)
        {
        }

        return "";
    }

    public byte[] getByteArray(String key)
    {
        try
        {
            if (this.contains(key, 7))
            {
                return ((ByteArrayNBT)this.tagMap.get(key)).getByteArray();
            }
        }
        catch (ClassCastException classcastexception)
        {
            throw new ReportedException(this.func_229677_a_(key, ByteArrayNBT.TYPE, classcastexception));
        }

        return new byte[0];
    }

    public int[] getIntArray(String key)
    {
        try
        {
            if (this.contains(key, 11))
            {
                return ((IntArrayNBT)this.tagMap.get(key)).getIntArray();
            }
        }
        catch (ClassCastException classcastexception)
        {
            throw new ReportedException(this.func_229677_a_(key, IntArrayNBT.TYPE, classcastexception));
        }

        return new int[0];
    }

    public long[] getLongArray(String key)
    {
        try
        {
            if (this.contains(key, 12))
            {
                return ((LongArrayNBT)this.tagMap.get(key)).getAsLongArray();
            }
        }
        catch (ClassCastException classcastexception)
        {
            throw new ReportedException(this.func_229677_a_(key, LongArrayNBT.TYPE, classcastexception));
        }

        return new long[0];
    }

    public CompoundNBT getCompound(String key)
    {
        try
        {
            if (this.contains(key, 10))
            {
                return (CompoundNBT)this.tagMap.get(key);
            }
        }
        catch (ClassCastException classcastexception)
        {
            throw new ReportedException(this.func_229677_a_(key, TYPE, classcastexception));
        }

        return new CompoundNBT();
    }

    public ListNBT getList(String key, int type)
    {
        try
        {
            if (this.getTagId(key) == 9)
            {
                ListNBT listnbt = (ListNBT)this.tagMap.get(key);

                if (!listnbt.isEmpty() && listnbt.getTagType() != type)
                {
                    return new ListNBT();
                }

                return listnbt;
            }
        }
        catch (ClassCastException classcastexception)
        {
            throw new ReportedException(this.func_229677_a_(key, ListNBT.TYPE, classcastexception));
        }

        return new ListNBT();
    }
    
    public boolean getBoolean(final String s) {
        return this.getByte(s) != 0;
    }
    
    public void remove(final String s) {
        this.tagMap.remove(s);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        Set<String> keySet = this.tagMap.keySet();
        if (CompoundNBT.LOGGER.isDebugEnabled()) {
            final ArrayList arrayList = Lists.newArrayList((Iterable)this.tagMap.keySet());
            Collections.sort((List<Comparable>)arrayList);
            keySet = (Set<String>)arrayList;
        }
        for (final String s : keySet) {
            if (sb.length() != 1) {
                sb.append(',');
            }
            sb.append(handleEscape(s)).append(':').append(this.tagMap.get(s));
        }
        return sb.append('}').toString();
    }
    
    public boolean method331() {
        return this.tagMap.isEmpty();
    }

    private CrashReport func_229677_a_(String p_229677_1_, INBTType<?> p_229677_2_, ClassCastException p_229677_3_)
    {
        CrashReport crashreport = CrashReport.makeCrashReport(p_229677_3_, "Reading NBT data");
        CrashReportCategory crashreportcategory = crashreport.makeCategoryDepth("Corrupt NBT tag", 1);
        crashreportcategory.addDetail("Tag type found", () ->
        {
            return this.tagMap.get(p_229677_1_).getType().func_225648_a_();
        });
        crashreportcategory.addDetail("Tag type expected", p_229677_2_::func_225648_a_);
        crashreportcategory.addDetail("Tag name", p_229677_1_);
        return crashreport;
    }
    
    public CompoundNBT copy() {
        return new CompoundNBT(Maps.newHashMap(Maps.transformValues((Map)this.tagMap, INBT::copy)));
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof CompoundNBT && Objects.equals(this.tagMap, ((CompoundNBT)o).tagMap));
    }
    
    @Override
    public int hashCode() {
        return this.tagMap.hashCode();
    }
    
    private static void writeEntry(final String s, final INBT class41, final DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(class41.getId());
        if (class41.getId() != 0) {
            dataOutput.writeUTF(s);
            class41.write(dataOutput);
        }
    }
    
    private static byte readType(final DataInput dataInput, final NBTSizeTracker class7553) throws IOException {
        return dataInput.readByte();
    }
    
    private static String readKey(final DataInput dataInput, final NBTSizeTracker class7553) throws IOException {
        return dataInput.readUTF();
    }
    
    private static INBT func_229680_b_(final INBTType<?> class6068, final String s, final DataInput dataInput, final int n, final NBTSizeTracker class6069) {
        try {
            return class6068.func_225649_b_(dataInput, n, class6069);
        }
        catch (final IOException ex) {
            final CrashReport method24421 = CrashReport.makeCrashReport(ex, "Loading NBT data");
            final CrashReportCategory method24422 = method24421.makeCategory("NBT Tag");
            method24422.addDetail("Tag name", s);
            method24422.addDetail("Tag type", class6068.func_225648_a_());
            throw new ReportedException(method24421);
        }
    }
    
    public CompoundNBT merge(final CompoundNBT class51) {
        for (final String s : class51.tagMap.keySet()) {
            final INBT class52 = class51.tagMap.get(s);
            if (class52.getId() != 10) {
                this.put(s, class52.copy());
            }
            else if (!this.contains(s, 10)) {
                this.put(s, class52.copy());
            }
            else {
                this.getCompound(s).merge((CompoundNBT)class52);
            }
        }
        return this;
    }
    
    public static String handleEscape(final String input) {
        return CompoundNBT.SIMPLE_VALUE.matcher(input).matches() ? input : StringNBT.method292(input);
    }
    
    public static ITextComponent func_197642_t(final String input) {
        if (!CompoundNBT.SIMPLE_VALUE.matcher(input).matches()) {
            final String method292 = StringNBT.method292(input);
            final String substring = method292.substring(0, 1);
            return new StringTextComponent(substring).appendSibling(new StringTextComponent(method292.substring(1, method292.length() - 1)).applyTextStyle(CompoundNBT.SYNTAX_HIGHLIGHTING_KEY)).appendText(substring);
        }
        return new StringTextComponent(input).applyTextStyle(CompoundNBT.SYNTAX_HIGHLIGHTING_KEY);
    }

    public ITextComponent toFormattedComponent(String indentation, int indentDepth)
    {
        if (this.tagMap.isEmpty())
        {
            return new StringTextComponent("{}");
        }
        else
        {
            ITextComponent itextcomponent = new StringTextComponent("{");
            Collection<String> collection = this.tagMap.keySet();

            if (LOGGER.isDebugEnabled())
            {
                List<String> list = Lists.newArrayList(this.tagMap.keySet());
                Collections.sort(list);
                collection = list;
            }

            if (!indentation.isEmpty())
            {
                itextcomponent.appendText("\n");
            }

            ITextComponent itextcomponent1;

            for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); itextcomponent.appendSibling(itextcomponent1))
            {
                String s = iterator.next();
                itextcomponent1 = (new StringTextComponent(Strings.repeat(indentation, indentDepth + 1))).appendSibling(func_197642_t(s)).appendText(String.valueOf(':')).appendText(" ").appendSibling(this.tagMap.get(s).toFormattedComponent(indentation, indentDepth + 1));

                if (iterator.hasNext())
                {
                    itextcomponent1.appendText(String.valueOf(',')).appendText(indentation.isEmpty() ? " " : "\n");
                }
            }

            if (!indentation.isEmpty())
            {
                itextcomponent.appendText("\n").appendText(Strings.repeat(indentation, indentDepth));
            }

            itextcomponent.appendText("}");
            return itextcomponent;
        }
    }
}
