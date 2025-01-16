// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBT;
import net.minecraft.nbt.INBTType;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;
import java.util.Objects;

public class StringNBT implements INBT
{
    public static final INBTType<StringNBT> TYPE;
    private static final StringNBT EMPTY_STRING;
    private final String data;
    
    public StringNBT(final String s) {
        Objects.requireNonNull(s, "Null string not allowed");
        this.data = s;
    }
    
    public static StringNBT method290(final String s) {
        return s.isEmpty() ? StringNBT.EMPTY_STRING : new StringNBT(s);
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.data);
    }
    
    @Override
    public byte getId() {
        return 8;
    }
    
    @Override
    public INBTType<StringNBT> getType() {
        return StringNBT.TYPE;
    }
    
    @Override
    public String toString() {
        return method292(this.data);
    }
    
    public StringNBT copy() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof StringNBT && Objects.equals(this.data, ((StringNBT)o).data));
    }
    
    @Override
    public int hashCode() {
        return this.data.hashCode();
    }
    
    @Override
    public String getString() {
        return this.data;
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        final String method292 = method292(this.data);
        final String substring = method292.substring(0, 1);
        return new StringTextComponent(substring).appendSibling(new StringTextComponent(method292.substring(1, method292.length() - 1)).applyTextStyle(StringNBT.SYNTAX_HIGHLIGHTING_STRING)).appendText(substring);
    }
    
    public static String method292(final String s) {
        final StringBuilder sb = new StringBuilder(" ");
        char c = '\0';
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 != '\\') {
                if (char1 == '\"' || char1 == '\'') {
                    if (c == '\0') {
                        c = (char)((char1 != '\"') ? 34 : 39);
                    }
                    if (c == char1) {
                        sb.append('\\');
                    }
                }
            }
            else {
                sb.append('\\');
            }
            sb.append(char1);
        }
        if (c == '\0') {
            c = '\"';
        }
        sb.setCharAt(0, c);
        sb.append(c);
        return sb.toString();
    }
    
    static {
        TYPE = new Class6078();
        EMPTY_STRING = new StringNBT("");
    }
}
