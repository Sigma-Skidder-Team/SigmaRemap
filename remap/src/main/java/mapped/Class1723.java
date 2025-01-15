// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1723 implements Appendable
{
    public int field9639;
    public char[] field9640;
    public final /* synthetic */ Appendable field9641;
    public final /* synthetic */ Class7506 field9642;
    
    public Class1723(final Class7506 field9642, final Appendable field9643) {
        this.field9642 = field9642;
        this.field9641 = field9643;
        this.field9639 = -1;
        this.field9640 = new char[2];
    }
    
    @Override
    public Appendable append(final CharSequence charSequence) throws IOException {
        return this.append(charSequence, 0, charSequence.length());
    }
    
    @Override
    public Appendable append(final CharSequence charSequence, final int n, final int n2) throws IOException {
        int n3 = n;
        if (n3 < n2) {
            int n4 = n3;
            if (this.field9639 != -1) {
                final char char1 = charSequence.charAt(n3++);
                if (!Character.isLowSurrogate(char1)) {
                    throw new IllegalArgumentException("Expected low surrogate character but got " + char1);
                }
                final char[] method23417 = this.field9642.method23417(Character.toCodePoint((char)this.field9639, char1));
                if (method23417 == null) {
                    this.field9641.append((char)this.field9639);
                }
                else {
                    this.method6072(method23417, method23417.length);
                    ++n4;
                }
                this.field9639 = -1;
            }
            while (true) {
                final int method23418 = this.field9642.method23415(charSequence, n3, n2);
                if (method23418 > n4) {
                    this.field9641.append(charSequence, n4, method23418);
                }
                if (method23418 == n2) {
                    break;
                }
                final int method23419 = Class7506.method23420(charSequence, method23418, n2);
                if (method23419 < 0) {
                    this.field9639 = -method23419;
                    break;
                }
                final char[] method23420 = this.field9642.method23417(method23419);
                if (method23420 == null) {
                    this.method6072(this.field9640, Character.toChars(method23419, this.field9640, 0));
                }
                else {
                    this.method6072(method23420, method23420.length);
                }
                n3 = (n4 = method23418 + (Character.isSupplementaryCodePoint(method23419) ? 2 : 1));
            }
        }
        return this;
    }
    
    @Override
    public Appendable append(final char low) throws IOException {
        if (this.field9639 == -1) {
            if (!Character.isHighSurrogate(low)) {
                if (Character.isLowSurrogate(low)) {
                    throw new IllegalArgumentException("Unexpected low surrogate character '" + low + "' with value " + (int)low);
                }
                final char[] method23417 = this.field9642.method23417(low);
                if (method23417 == null) {
                    this.field9641.append(low);
                }
                else {
                    this.method6072(method23417, method23417.length);
                }
            }
            else {
                this.field9639 = low;
            }
        }
        else {
            if (!Character.isLowSurrogate(low)) {
                throw new IllegalArgumentException("Expected low surrogate character but got '" + low + "' with value " + (int)low);
            }
            final char[] method23418 = this.field9642.method23417(Character.toCodePoint((char)this.field9639, low));
            if (method23418 == null) {
                this.field9641.append((char)this.field9639);
                this.field9641.append(low);
            }
            else {
                this.method6072(method23418, method23418.length);
            }
            this.field9639 = -1;
        }
        return this;
    }
    
    private void method6072(final char[] array, final int n) throws IOException {
        for (int i = 0; i < n; ++i) {
            this.field9641.append(array[i]);
        }
    }
}
