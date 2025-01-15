// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.security.auth.x500.X500Principal;

public final class Class8394
{
    private final String field34406;
    private final int field34407;
    private int field34408;
    private int field34409;
    private int field34410;
    private int field34411;
    private char[] field34412;
    
    public Class8394(final X500Principal x500Principal) {
        this.field34406 = x500Principal.getName("RFC2253");
        this.field34407 = this.field34406.length();
    }
    
    private String method27984() {
        while (this.field34408 < this.field34407 && this.field34412[this.field34408] == ' ') {
            ++this.field34408;
        }
        if (this.field34408 == this.field34407) {
            return null;
        }
        this.field34409 = this.field34408;
        ++this.field34408;
        while (this.field34408 < this.field34407) {
            if (this.field34412[this.field34408] == '=') {
                break;
            }
            if (this.field34412[this.field34408] == ' ') {
                break;
            }
            ++this.field34408;
        }
        if (this.field34408 < this.field34407) {
            this.field34410 = this.field34408;
            if (this.field34412[this.field34408] == ' ') {
                while (this.field34408 < this.field34407) {
                    if (this.field34412[this.field34408] == '=') {
                        break;
                    }
                    if (this.field34412[this.field34408] != ' ') {
                        break;
                    }
                    ++this.field34408;
                }
                if (this.field34412[this.field34408] != '=' || this.field34408 == this.field34407) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.field34406);
                }
            }
            ++this.field34408;
            while (this.field34408 < this.field34407 && this.field34412[this.field34408] == ' ') {
                ++this.field34408;
            }
            if (this.field34410 - this.field34409 > 4) {
                if (this.field34412[this.field34409 + 3] == '.') {
                    if (this.field34412[this.field34409] == 'O' || this.field34412[this.field34409] == 'o') {
                        if (this.field34412[this.field34409 + 1] == 'I' || this.field34412[this.field34409 + 1] == 'i') {
                            if (this.field34412[this.field34409 + 2] == 'D' || this.field34412[this.field34409 + 2] == 'd') {
                                this.field34409 += 4;
                            }
                        }
                    }
                }
            }
            return new String(this.field34412, this.field34409, this.field34410 - this.field34409);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.field34406);
    }
    
    private String method27985() {
        ++this.field34408;
        this.field34409 = this.field34408;
        this.field34410 = this.field34409;
        while (this.field34408 != this.field34407) {
            if (this.field34412[this.field34408] == '\"') {
                ++this.field34408;
                while (this.field34408 < this.field34407 && this.field34412[this.field34408] == ' ') {
                    ++this.field34408;
                }
                return new String(this.field34412, this.field34409, this.field34410 - this.field34409);
            }
            if (this.field34412[this.field34408] != '\\') {
                this.field34412[this.field34410] = this.field34412[this.field34408];
            }
            else {
                this.field34412[this.field34410] = this.method27988();
            }
            ++this.field34408;
            ++this.field34410;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.field34406);
    }
    
    private String method27986() {
        if (this.field34408 + 4 < this.field34407) {
            this.field34409 = this.field34408;
            ++this.field34408;
            while (true) {
                while (this.field34408 != this.field34407) {
                    if (this.field34412[this.field34408] == '+') {
                        break;
                    }
                    if (this.field34412[this.field34408] == ',') {
                        break;
                    }
                    if (this.field34412[this.field34408] == ';') {
                        break;
                    }
                    if (this.field34412[this.field34408] != ' ') {
                        if (this.field34412[this.field34408] >= 'A') {
                            if (this.field34412[this.field34408] <= 'F') {
                                final char[] field34412 = this.field34412;
                                final int field34413 = this.field34408;
                                field34412[field34413] += ' ';
                            }
                        }
                        ++this.field34408;
                    }
                    else {
                        this.field34410 = this.field34408;
                        ++this.field34408;
                        while (this.field34408 < this.field34407) {
                            if (this.field34412[this.field34408] != ' ') {
                                break;
                            }
                            ++this.field34408;
                        }
                        final int count = this.field34410 - this.field34409;
                        if (count >= 5 && (count & 0x1) != 0x0) {
                            final byte[] array = new byte[count / 2];
                            int i = 0;
                            int n = this.field34409 + 1;
                            while (i < array.length) {
                                array[i] = (byte)this.method27990(n);
                                n += 2;
                                ++i;
                            }
                            return new String(this.field34412, this.field34409, count);
                        }
                        throw new IllegalStateException("Unexpected end of DN: " + this.field34406);
                    }
                }
                this.field34410 = this.field34408;
                continue;
            }
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.field34406);
    }
    
    private String method27987() {
        this.field34409 = this.field34408;
        this.field34410 = this.field34408;
        while (this.field34408 < this.field34407) {
            switch (this.field34412[this.field34408]) {
                case '+':
                case ',':
                case ';': {
                    return new String(this.field34412, this.field34409, this.field34410 - this.field34409);
                }
                case '\\': {
                    this.field34412[this.field34410++] = this.method27988();
                    ++this.field34408;
                    continue;
                }
                case ' ': {
                    this.field34411 = this.field34410;
                    ++this.field34408;
                    this.field34412[this.field34410++] = ' ';
                    while (this.field34408 < this.field34407 && this.field34412[this.field34408] == ' ') {
                        this.field34412[this.field34410++] = ' ';
                        ++this.field34408;
                    }
                    if (this.field34408 == this.field34407 || this.field34412[this.field34408] == ',' || this.field34412[this.field34408] == '+' || this.field34412[this.field34408] == ';') {
                        return new String(this.field34412, this.field34409, this.field34411 - this.field34409);
                    }
                    continue;
                }
                default: {
                    this.field34412[this.field34410++] = this.field34412[this.field34408];
                    ++this.field34408;
                    continue;
                }
            }
        }
        return new String(this.field34412, this.field34409, this.field34410 - this.field34409);
    }
    
    private char method27988() {
        ++this.field34408;
        if (this.field34408 == this.field34407) {
            throw new IllegalStateException("Unexpected end of DN: " + this.field34406);
        }
        switch (this.field34412[this.field34408]) {
            case ' ':
            case '\"':
            case '#':
            case '%':
            case '*':
            case '+':
            case ',':
            case ';':
            case '<':
            case '=':
            case '>':
            case '\\':
            case '_': {
                return this.field34412[this.field34408];
            }
            default: {
                return this.method27989();
            }
        }
    }
    
    private char method27989() {
        final int method27990 = this.method27990(this.field34408);
        ++this.field34408;
        if (method27990 < 128) {
            return (char)method27990;
        }
        if (method27990 >= 192 && method27990 <= 247) {
            int n;
            int n2;
            if (method27990 > 223) {
                if (method27990 > 239) {
                    n = 3;
                    n2 = (method27990 & 0x7);
                }
                else {
                    n = 2;
                    n2 = (method27990 & 0xF);
                }
            }
            else {
                n = 1;
                n2 = (method27990 & 0x1F);
            }
            for (int i = 0; i < n; ++i) {
                ++this.field34408;
                if (this.field34408 == this.field34407 || this.field34412[this.field34408] != '\\') {
                    return '?';
                }
                ++this.field34408;
                final int method27991 = this.method27990(this.field34408);
                ++this.field34408;
                if ((method27991 & 0xC0) != 0x80) {
                    return '?';
                }
                n2 = (n2 << 6) + (method27991 & 0x3F);
            }
            return (char)n2;
        }
        return '?';
    }
    
    private int method27990(final int n) {
        if (n + 1 < this.field34407) {
            final char c = this.field34412[n];
            int n2;
            if (c >= '0' && c <= '9') {
                n2 = c - '0';
            }
            else if (c >= 'a' && c <= 'f') {
                n2 = c - 'W';
            }
            else {
                if (c < 'A' || c > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.field34406);
                }
                n2 = c - '7';
            }
            final char c2 = this.field34412[n + 1];
            int n3;
            if (c2 >= '0' && c2 <= '9') {
                n3 = c2 - '0';
            }
            else if (c2 >= 'a' && c2 <= 'f') {
                n3 = c2 - 'W';
            }
            else {
                if (c2 < 'A' || c2 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.field34406);
                }
                n3 = c2 - '7';
            }
            return (n2 << 4) + n3;
        }
        throw new IllegalStateException("Malformed DN: " + this.field34406);
    }
    
    public String method27991(final String s) {
        this.field34408 = 0;
        this.field34409 = 0;
        this.field34410 = 0;
        this.field34411 = 0;
        this.field34412 = this.field34406.toCharArray();
        String anotherString = this.method27984();
        if (anotherString == null) {
            return null;
        }
        while (true) {
            String s2 = "";
            if (this.field34408 == this.field34407) {
                return null;
            }
            switch (this.field34412[this.field34408]) {
                case '\"': {
                    s2 = this.method27985();
                    break;
                }
                case '#': {
                    s2 = this.method27986();
                    break;
                }
                case '+':
                case ',':
                case ';': {
                    break;
                }
                default: {
                    s2 = this.method27987();
                    break;
                }
            }
            if (s.equalsIgnoreCase(anotherString)) {
                return s2;
            }
            if (this.field34408 >= this.field34407) {
                return null;
            }
            if (this.field34412[this.field34408] != ',') {
                if (this.field34412[this.field34408] != ';') {
                    if (this.field34412[this.field34408] != '+') {
                        throw new IllegalStateException("Malformed DN: " + this.field34406);
                    }
                }
            }
            ++this.field34408;
            anotherString = this.method27984();
            if (anotherString == null) {
                throw new IllegalStateException("Malformed DN: " + this.field34406);
            }
        }
    }
}
