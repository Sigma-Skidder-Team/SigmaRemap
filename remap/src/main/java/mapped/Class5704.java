// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import java.util.regex.Pattern;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.nbt.*;

public class Class5704
{
    public static final SimpleCommandExceptionType field23154;
    public static final SimpleCommandExceptionType field23155;
    public static final SimpleCommandExceptionType field23156;
    public static final Dynamic2CommandExceptionType field23157;
    public static final Dynamic2CommandExceptionType field23158;
    public static final DynamicCommandExceptionType field23159;
    private static final Pattern field23160;
    private static final Pattern field23161;
    private static final Pattern field23162;
    private static final Pattern field23163;
    private static final Pattern field23164;
    private static final Pattern field23165;
    private static final Pattern field23166;
    private final StringReader field23167;
    
    public static CompoundNBT method16938(final String s) throws CommandSyntaxException {
        return new Class5704(new StringReader(s)).method16939();
    }
    
    @VisibleForTesting
    public CompoundNBT method16939() throws CommandSyntaxException {
        final CompoundNBT method16945 = this.method16945();
        this.field23167.skipWhitespace();
        if (!this.field23167.canRead()) {
            return method16945;
        }
        throw Class5704.field23154.createWithContext(this.field23167);
    }
    
    public Class5704(final StringReader field23167) {
        this.field23167 = field23167;
    }
    
    public String method16940() throws CommandSyntaxException {
        this.field23167.skipWhitespace();
        if (this.field23167.canRead()) {
            return this.field23167.readString();
        }
        throw Class5704.field23155.createWithContext(this.field23167);
    }
    
    public INBT method16941() throws CommandSyntaxException {
        this.field23167.skipWhitespace();
        final int cursor = this.field23167.getCursor();
        if (StringReader.isQuotedStringStart(this.field23167.peek())) {
            return StringNBT.method290(this.field23167.readQuotedString());
        }
        final String unquotedString = this.field23167.readUnquotedString();
        if (!unquotedString.isEmpty()) {
            return this.method16942(unquotedString);
        }
        this.field23167.setCursor(cursor);
        throw Class5704.field23156.createWithContext(this.field23167);
    }
    
    private INBT method16942(final String anotherString) {
        try {
            if (Class5704.field23162.matcher(anotherString).matches()) {
                return FloatNBT.method281(Float.parseFloat(anotherString.substring(0, anotherString.length() - 1)));
            }
            if (Class5704.field23163.matcher(anotherString).matches()) {
                return ByteNBT.valueOf(Byte.parseByte(anotherString.substring(0, anotherString.length() - 1)));
            }
            if (Class5704.field23164.matcher(anotherString).matches()) {
                return LongNBT.method288(Long.parseLong(anotherString.substring(0, anotherString.length() - 1)));
            }
            if (Class5704.field23165.matcher(anotherString).matches()) {
                return ShortNBT.method286(Short.parseShort(anotherString.substring(0, anotherString.length() - 1)));
            }
            if (Class5704.field23166.matcher(anotherString).matches()) {
                return IntNBT.valueOf(Integer.parseInt(anotherString));
            }
            if (Class5704.field23161.matcher(anotherString).matches()) {
                return DoubleNBT.method277(Double.parseDouble(anotherString.substring(0, anotherString.length() - 1)));
            }
            if (Class5704.field23160.matcher(anotherString).matches()) {
                return DoubleNBT.method277(Double.parseDouble(anotherString));
            }
            if ("true".equalsIgnoreCase(anotherString)) {
                return ByteNBT.ONE;
            }
            if ("false".equalsIgnoreCase(anotherString)) {
                return ByteNBT.ZERO;
            }
        }
        catch (final NumberFormatException ex) {}
        return StringNBT.method290(anotherString);
    }
    
    public INBT method16943() throws CommandSyntaxException {
        this.field23167.skipWhitespace();
        if (!this.field23167.canRead()) {
            throw Class5704.field23156.createWithContext(this.field23167);
        }
        final char peek = this.field23167.peek();
        if (peek != '{') {
            return (peek != '[') ? this.method16941() : this.method16944();
        }
        return this.method16945();
    }
    
    public INBT method16944() throws CommandSyntaxException {
        if (this.field23167.canRead(3)) {
            if (!StringReader.isQuotedStringStart(this.field23167.peek(1))) {
                if (this.field23167.peek(2) == ';') {
                    return this.method16947();
                }
            }
        }
        return this.method16946();
    }
    
    public CompoundNBT method16945() throws CommandSyntaxException {
        this.method16950('{');
        final CompoundNBT class51 = new CompoundNBT();
        this.field23167.skipWhitespace();
        while (this.field23167.canRead()) {
            if (this.field23167.peek() == '}') {
                break;
            }
            final int cursor = this.field23167.getCursor();
            final String method16940 = this.method16940();
            if (method16940.isEmpty()) {
                this.field23167.setCursor(cursor);
                throw Class5704.field23155.createWithContext(this.field23167);
            }
            this.method16950(':');
            class51.put(method16940, this.method16943());
            if (!this.method16949()) {
                break;
            }
            if (this.field23167.canRead()) {
                continue;
            }
            throw Class5704.field23155.createWithContext(this.field23167);
        }
        this.method16950('}');
        return class51;
    }
    
    private INBT method16946() throws CommandSyntaxException {
        this.method16950('[');
        this.field23167.skipWhitespace();
        if (this.field23167.canRead()) {
            final ListNBT class52 = new ListNBT();
            INBTType class53 = null;
            while (this.field23167.peek() != ']') {
                final int cursor = this.field23167.getCursor();
                final INBT method16943 = this.method16943();
                final INBTType<?> method16944 = method16943.getType();
                if (class53 != null) {
                    if (method16944 != class53) {
                        this.field23167.setCursor(cursor);
                        throw Class5704.field23157.createWithContext(this.field23167, method16944.func_225650_b_(), class53.func_225650_b_());
                    }
                }
                else {
                    class53 = method16944;
                }
                class52.add(method16943);
                if (!this.method16949()) {
                    break;
                }
                if (this.field23167.canRead()) {
                    continue;
                }
                throw Class5704.field23156.createWithContext(this.field23167);
            }
            this.method16950(']');
            return class52;
        }
        throw Class5704.field23156.createWithContext(this.field23167);
    }
    
    private INBT method16947() throws CommandSyntaxException {
        this.method16950('[');
        final int cursor = this.field23167.getCursor();
        final char read = this.field23167.read();
        this.field23167.read();
        this.field23167.skipWhitespace();
        if (!this.field23167.canRead()) {
            throw Class5704.field23156.createWithContext(this.field23167);
        }
        if (read == 'B') {
            return new ByteArrayNBT(this.method16948(ByteArrayNBT.TYPE, ByteNBT.TYPE));
        }
        if (read == 'L') {
            return new LongArrayNBT(this.method16948(LongArrayNBT.TYPE, LongNBT.TYPE));
        }
        if (read != 'I') {
            this.field23167.setCursor(cursor);
            throw Class5704.field23159.createWithContext(this.field23167, String.valueOf(read));
        }
        return new IntArrayNBT(this.method16948(IntArrayNBT.TYPE, IntNBT.TYPE));
    }
    
    private <T extends Number> List<T> method16948(final INBTType<?> class6068, final INBTType<?> class6069) throws CommandSyntaxException {
        final ArrayList arrayList = Lists.newArrayList();
        while (this.field23167.peek() != ']') {
            final int cursor = this.field23167.getCursor();
            final INBT method16943 = this.method16943();
            final INBTType<?> method16944 = method16943.getType();
            if (method16944 != class6069) {
                this.field23167.setCursor(cursor);
                throw Class5704.field23158.createWithContext(this.field23167, method16944.func_225650_b_(), class6068.func_225650_b_());
            }
            if (class6069 != ByteNBT.TYPE) {
                if (class6069 != LongNBT.TYPE) {
                    arrayList.add(((NumberNBT)method16943).getInt());
                }
                else {
                    arrayList.add(((NumberNBT)method16943).getLong());
                }
            }
            else {
                arrayList.add(((NumberNBT)method16943).getByte());
            }
            if (!this.method16949()) {
                break;
            }
            if (this.field23167.canRead()) {
                continue;
            }
            throw Class5704.field23156.createWithContext(this.field23167);
        }
        this.method16950(']');
        return arrayList;
    }
    
    private boolean method16949() {
        this.field23167.skipWhitespace();
        if (this.field23167.canRead() && this.field23167.peek() == ',') {
            this.field23167.skip();
            this.field23167.skipWhitespace();
            return true;
        }
        return false;
    }
    
    private void method16950(final char c) throws CommandSyntaxException {
        this.field23167.skipWhitespace();
        this.field23167.expect(c);
    }
    
    static {
        field23154 = new SimpleCommandExceptionType(new Class2259("argument.nbt.trailing", new Object[0]));
        field23155 = new SimpleCommandExceptionType(new Class2259("argument.nbt.expected.key", new Object[0]));
        field23156 = new SimpleCommandExceptionType(new Class2259("argument.nbt.expected.value", new Object[0]));
        field23157 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.nbt.list.mixed", o, o2));
        field23158 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.nbt.array.mixed", o, o2));
        field23159 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.nbt.array.invalid", o);
            return;
        });
        field23160 = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
        field23161 = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
        field23162 = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
        field23163 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
        field23164 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
        field23165 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
        field23166 = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
    }
}
