// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.nio.charset.Charset;
import java.io.IOException;
import java.io.DataInputStream;

public class Class9447
{
    public static final int field40517 = 1413565506;
    public static final int field40518 = 1414745921;
    public static final int field40519 = 1414546737;
    public static final int field40520 = 1095780675;
    public static final int field40521 = 1095061059;
    public static final int field40522 = 1095979081;
    public static final int field40523 = 1414546738;
    public static final int field40524 = 1413632077;
    public static final int field40525 = 1129270605;
    public static final int field40526 = 1129270610;
    public static final int field40527 = 1464029005;
    public static final int field40528 = 1413697357;
    public static final int field40529 = 1414546739;
    public static final int field40530 = 1414091825;
    public static final int field40531 = 1413697358;
    public static final int field40532 = 1464029008;
    public static final int field40533 = 1413697360;
    public static final int field40534 = 1413828163;
    public static final int field40535 = 1413760334;
    public static final int field40536 = 1162756946;
    public static final int field40537 = 1162958130;
    public static final int field40538 = 1163150159;
    public static final int field40539 = 1414485838;
    public static final int field40540 = 1413893204;
    public static final int field40541 = 1195724610;
    public static final int field40542 = 1196575044;
    public static final int field40543 = 1414219097;
    public static final int field40544 = 1414681422;
    public static final int field40545 = 1414681423;
    public static final int field40546 = 1414546740;
    public static final int field40547 = 1414090828;
    public static final int field40548 = 1414746691;
    public static final int field40549 = 1414283598;
    public static final int field40550 = 1414284622;
    public static final int field40551 = 1279872587;
    public static final int field40552 = 1413830740;
    public static final int field40553 = 1414350148;
    public static final int field40554 = 1414352719;
    public static final int field40555 = 1296845908;
    public static final int field40556 = 1414349644;
    public static final int field40557 = 1296254025;
    public static final int field40558 = 1464811858;
    public static final int field40559 = 1464811846;
    public static final int field40560 = 1464811859;
    public static final int field40561 = 1464816211;
    public static final int field40562 = 1414480204;
    public static final int field40563 = 1414484037;
    public static final int field40564 = 1414481486;
    public static final int field40565 = 1414483033;
    public static final int field40566 = 1413762898;
    public static final int field40567 = 1331121733;
    public static final int field40568 = 1414549331;
    public static final int field40569 = 1464877401;
    public static final int field40570 = 1414745936;
    public static final int field40571 = 1413762137;
    public static final int field40572 = 1346588244;
    public static final int field40573 = 1347375181;
    public static final int field40574 = 1347375955;
    public static final int field40575 = 1347570006;
    public static final int field40576 = 1414550095;
    public static final int field40577 = 1414550850;
    public static final int field40578 = 1464882498;
    public static final int field40579 = 1380078918;
    public static final int field40580 = 1413763651;
    public static final int field40581 = 1381384498;
    public static final int field40582 = 1413763660;
    public static final int field40583 = 1381388866;
    public static final int field40584 = 1397048651;
    public static final int field40585 = 1414746964;
    public static final int field40586 = 1397311310;
    public static final int field40587 = 1414746949;
    public static final int field40588 = 1414091827;
    public static final int field40589 = 1398361172;
    public static final int field40590 = 1398363203;
    public static final int field40591 = 1413764167;
    public static final int field40592 = 1431520594;
    public static final int field40593 = 1414091826;
    public static final int field40594 = 1414745940;
    public static final int field40595 = 1414677323;
    public static final int field40596 = 1430669636;
    public static final int field40597 = 1431522388;
    public static final int field40598 = 1415075928;
    public static final int field40599 = 1465407576;
    private static final String[] field40600;
    private static final String[] field40601;
    private static final String field40602 = "xxx";
    private long field40603;
    private int field40604;
    private int field40605;
    private int field40606;
    private int field40607;
    private byte[] field40608;
    
    public Class9447(final DataInputStream dataInputStream) throws IOException {
        this.field40604 = dataInputStream.readInt();
        this.field40603 = Class7921.method25665(dataInputStream);
        this.field40605 = dataInputStream.readShort();
        if (this.method35087()) {
            this.field40606 = dataInputStream.read();
        }
        if (this.method35090()) {
            this.field40607 = dataInputStream.read();
        }
        dataInputStream.readFully(this.field40608 = new byte[(int)this.field40603]);
    }
    
    public int method35085() {
        return this.field40604;
    }
    
    public long method35086() {
        return this.field40603;
    }
    
    public final boolean method35087() {
        return (this.field40605 & 0x40) == 0x40;
    }
    
    public int method35088() {
        return this.field40606;
    }
    
    public final boolean method35089() {
        return (this.field40605 & 0x8) == 0x8;
    }
    
    public final boolean method35090() {
        return (this.field40605 & 0x4) == 0x4;
    }
    
    public int method35091() {
        return this.field40607;
    }
    
    public byte[] method35092() {
        return this.field40608;
    }
    
    public String method35093() {
        return new String(this.field40608, Charset.forName(Class9447.field40600[0]));
    }
    
    public String method35094() {
        final byte b = this.field40608[0];
        int n = -1;
        for (int n2 = 1; n2 < this.field40608.length && n < 0; ++n2) {
            if (this.field40608[n2] == 0) {
                if (b != 0) {
                    if (b != 3) {
                        if (this.field40608[n2 + 1] != 0) {
                            continue;
                        }
                    }
                }
                n = n2;
            }
        }
        return new String(this.field40608, 1, n - 1, Charset.forName(Class9447.field40600[b]));
    }
    
    public int method35095() {
        return Integer.parseInt(new String(this.field40608));
    }
    
    public int[] method35096() {
        final String s = new String(this.field40608, Charset.forName(Class9447.field40600[0]));
        final int index = s.indexOf(47);
        int[] array;
        if (index <= 0) {
            array = new int[] { Integer.parseInt(s) };
        }
        else {
            array = new int[] { Integer.parseInt(s.substring(0, index)), Integer.parseInt(s.substring(index + 1)) };
        }
        return array;
    }
    
    public Date method35097() {
        final int n = (int)Math.floor(this.field40608.length / 3) - 1;
        Date parse;
        if (n >= 0 && n < Class9447.field40601.length) {
            parse = new SimpleDateFormat(Class9447.field40601[n]).parse(new String(this.field40608), new ParsePosition(0));
        }
        else {
            parse = null;
        }
        return parse;
    }
    
    public Locale method35098() {
        final String lowerCase = new String(this.field40608).toLowerCase();
        Locale locale;
        if (!lowerCase.equals("xxx")) {
            locale = new Locale(lowerCase);
        }
        else {
            locale = null;
        }
        return locale;
    }
    
    static {
        field40600 = new String[] { "ISO-8859-1", "UTF-16", "UTF-16", "UTF-8" };
        field40601 = new String[] { "yyyy, yyyy-MM", "yyyy-MM-dd", "yyyy-MM-ddTHH", "yyyy-MM-ddTHH:mm", "yyyy-MM-ddTHH:mm:ss" };
    }
}
