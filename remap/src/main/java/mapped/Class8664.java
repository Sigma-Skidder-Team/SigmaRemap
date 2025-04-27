// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import jaco.mp3.resources.BitstreamException;

public final class Class8664
{
    public static final int[][] field36394;
    public static final int field36395 = 0;
    public static final int field36396 = 2;
    public static final int field36397 = 1;
    public static final int field36398 = 0;
    public static final int field36399 = 1;
    public static final int field36400 = 2;
    public static final int field36401 = 3;
    public static final int field36402 = 0;
    public static final int field36403 = 1;
    public static final int field36404 = 2;
    private int field36405;
    private int field36406;
    private int field36407;
    private int field36408;
    private int field36409;
    private int field36410;
    private int field36411;
    private int field36412;
    private int field36413;
    private int field36414;
    private boolean field36415;
    private boolean field36416;
    private final double[] field36417;
    private boolean field36418;
    private int field36419;
    private int field36420;
    private int field36421;
    private byte[] field36422;
    private byte field36423;
    private Class9410 field36424;
    public short field36425;
    public int field36426;
    public int field36427;
    private int field36428;
    public static final int[][][] field36429;
    public static final String[][][] field36430;
    
    public Class8664() {
        this.field36417 = new double[] { -1.0, 384.0, 1152.0, 1152.0 };
        this.field36423 = Class2341.field14091;
        this.field36428 = -1;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(200);
        sb.append("Layer ");
        sb.append(this.method29659());
        sb.append(" frame ");
        sb.append(this.method29664());
        sb.append(' ');
        sb.append(this.method29665());
        if (!this.method29643()) {
            sb.append(" no");
        }
        sb.append(" checksums");
        sb.append(' ');
        sb.append(this.method29663());
        sb.append(',');
        sb.append(' ');
        sb.append(this.method29660());
        return sb.toString();
    }
    
    public void method29635(final Class2341 class2341, final Class9410[] array) throws BitstreamException {
        boolean b = false;
        while (true) {
            final int method9470 = class2341.method9470(this.field36423);
            this.field36428 = method9470;
            if (this.field36423 == Class2341.field14091) {
                this.field36410 = (method9470 >>> 19 & 0x1);
                if ((method9470 >>> 20 & 0x1) == 0x0) {
                    if (this.field36410 != 0) {
                        throw class2341.method9468(256);
                    }
                    this.field36410 = 2;
                }
                if ((this.field36412 = (method9470 >>> 10 & 0x3)) == 3) {
                    throw class2341.method9468(256);
                }
            }
            this.field36405 = (4 - (method9470 >>> 17) & 0x3);
            this.field36406 = (method9470 >>> 16 & 0x1);
            this.field36407 = (method9470 >>> 12 & 0xF);
            this.field36408 = (method9470 >>> 9 & 0x1);
            this.field36411 = (method9470 >>> 6 & 0x3);
            this.field36409 = (method9470 >>> 4 & 0x3);
            if (this.field36411 != 1) {
                this.field36414 = 0;
            }
            else {
                this.field36414 = (this.field36409 << 2) + 4;
            }
            if ((method9470 >>> 3 & 0x1) == 0x1) {
                this.field36415 = true;
            }
            if ((method9470 >>> 2 & 0x1) == 0x1) {
                this.field36416 = true;
            }
            if (this.field36405 != 1) {
                int field36407 = this.field36407;
                if (this.field36411 != 3) {
                    if (field36407 != 4) {
                        field36407 -= 4;
                    }
                    else {
                        field36407 = 1;
                    }
                }
                if (field36407 != 1 && field36407 != 2) {
                    if (this.field36412 != 1 && (field36407 < 3 || field36407 > 5)) {
                        this.field36413 = 30;
                    }
                    else {
                        this.field36413 = 27;
                    }
                }
                else if (this.field36412 != 2) {
                    this.field36413 = 8;
                }
                else {
                    this.field36413 = 12;
                }
            }
            else {
                this.field36413 = 32;
            }
            if (this.field36414 > this.field36413) {
                this.field36414 = this.field36413;
            }
            this.method29653();
            final int method9471 = class2341.method9472(this.field36426);
            if (this.field36426 >= 0 && method9471 != this.field36426) {
                throw class2341.method9468(261);
            }
            if (!class2341.method9465(this.field36423)) {
                class2341.method9463();
            }
            else {
                if (this.field36423 == Class2341.field14091) {
                    this.field36423 = Class2341.field14092;
                    class2341.method9475(method9470 & 0xFFF80CC0);
                }
                b = true;
            }
            if (!b) {
                continue;
            }
            class2341.method9473();
            if (this.field36406 != 0) {
                array[0] = null;
            }
            else {
                this.field36425 = (short)class2341.method9474(16);
                if (this.field36424 == null) {
                    this.field36424 = new Class9410();
                }
                this.field36424.method35005(method9470, 16);
                array[0] = this.field36424;
            }
            if (this.field36412 != 0) {}
        }
    }
    
    public void method29636(final byte[] array) throws BitstreamException {
        final String s = "Xing";
        final byte[] array2 = new byte[4];
        int n;
        if (this.field36410 == 1) {
            if (this.field36411 == 3) {
                n = 17;
            }
            else {
                n = 32;
            }
        }
        else if (this.field36411 == 3) {
            n = 9;
        }
        else {
            n = 17;
        }
        try {
            System.arraycopy(array, n, array2, 0, 4);
            if (s.equals(new String(array2))) {
                this.field36418 = true;
                this.field36419 = -1;
                this.field36421 = -1;
                this.field36420 = -1;
                this.field36422 = new byte[100];
                final int n2 = 4;
                final byte[] array3 = new byte[4];
                System.arraycopy(array, n + n2, array3, 0, array3.length);
                int n3 = n2 + array3.length;
                if ((array3[3] & 0x1) != 0x0) {
                    System.arraycopy(array, n + n3, array2, 0, array2.length);
                    this.field36419 = ((array2[0] << 24 & 0xFF000000) | (array2[1] << 16 & 0xFF0000) | (array2[2] << 8 & 0xFF00) | (array2[3] & 0xFF));
                    n3 += 4;
                }
                if ((array3[3] & 0x2) != 0x0) {
                    System.arraycopy(array, n + n3, array2, 0, array2.length);
                    this.field36421 = ((array2[0] << 24 & 0xFF000000) | (array2[1] << 16 & 0xFF0000) | (array2[2] << 8 & 0xFF00) | (array2[3] & 0xFF));
                    n3 += 4;
                }
                if ((array3[3] & 0x4) != 0x0) {
                    System.arraycopy(array, n + n3, this.field36422, 0, this.field36422.length);
                    n3 += this.field36422.length;
                }
                if ((array3[3] & 0x8) != 0x0) {
                    System.arraycopy(array, n + n3, array2, 0, array2.length);
                    this.field36420 = ((array2[0] << 24 & 0xFF000000) | (array2[1] << 16 & 0xFF0000) | (array2[2] << 8 & 0xFF00) | (array2[3] & 0xFF));
                    n3 += 4;
                }
            }
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new Class2339("XingVBRHeader Corrupted", ex);
        }
        final String s2 = "VBRI";
        final int n4 = 32;
        try {
            System.arraycopy(array, n4, array2, 0, 4);
            if (s2.equals(new String(array2))) {
                this.field36418 = true;
                this.field36419 = -1;
                this.field36421 = -1;
                this.field36420 = -1;
                this.field36422 = new byte[100];
                int n5 = 10;
                System.arraycopy(array, n4 + n5, array2, 0, array2.length);
                this.field36421 = ((array2[0] << 24 & 0xFF000000) | (array2[1] << 16 & 0xFF0000) | (array2[2] << 8 & 0xFF00) | (array2[3] & 0xFF));
                n5 += 4;
                System.arraycopy(array, n4 + n5, array2, 0, array2.length);
                this.field36419 = ((array2[0] << 24 & 0xFF000000) | (array2[1] << 16 & 0xFF0000) | (array2[2] << 8 & 0xFF00) | (array2[3] & 0xFF));
                n5 += 4;
            }
        }
        catch (final ArrayIndexOutOfBoundsException ex2) {
            throw new Class2339("VBRIVBRHeader Corrupted", ex2);
        }
    }
    
    public int method29637() {
        return this.field36410;
    }
    
    public int method29638() {
        return this.field36405;
    }
    
    public int method29639() {
        return this.field36407;
    }
    
    public int method29640() {
        return this.field36412;
    }
    
    public int method29641() {
        return Class8664.field36394[this.field36410][this.field36412];
    }
    
    public int method29642() {
        return this.field36411;
    }
    
    public boolean method29643() {
        return this.field36406 == 0;
    }
    
    public boolean method29644() {
        return this.field36415;
    }
    
    public boolean method29645() {
        return this.field36416;
    }
    
    public boolean method29646() {
        return this.field36418;
    }
    
    public int method29647() {
        return this.field36420;
    }
    
    public byte[] method29648() {
        return this.field36422;
    }
    
    public boolean method29649() {
        return this.field36425 == this.field36424.method35006();
    }
    
    public boolean method29650() {
        return this.field36408 != 0;
    }
    
    public int method29651() {
        return this.field36427;
    }
    
    public int method29652() {
        return this.field36409;
    }
    
    public int method29653() {
        if (this.field36405 != 1) {
            this.field36426 = 144 * Class8664.field36429[this.field36410][this.field36405 - 1][this.field36407] / Class8664.field36394[this.field36410][this.field36412];
            if (this.field36410 == 0 || this.field36410 == 2) {
                this.field36426 >>= 1;
            }
            if (this.field36408 != 0) {
                ++this.field36426;
            }
            if (this.field36405 != 3) {
                this.field36427 = 0;
            }
            else if (this.field36410 != 1) {
                this.field36427 = this.field36426 - ((this.field36411 != 3) ? 17 : 9) - ((this.field36406 == 0) ? 2 : 0) - 4;
            }
            else {
                this.field36427 = this.field36426 - ((this.field36411 != 3) ? 32 : 17) - ((this.field36406 == 0) ? 2 : 0) - 4;
            }
        }
        else {
            this.field36426 = 12 * Class8664.field36429[this.field36410][0][this.field36407] / Class8664.field36394[this.field36410][this.field36412];
            if (this.field36408 != 0) {
                ++this.field36426;
            }
            this.field36426 <<= 2;
            this.field36427 = 0;
        }
        return this.field36426 -= 4;
    }
    
    public int method29654(final int n) {
        if (this.field36418) {
            return this.field36419;
        }
        if (this.field36426 + 4 - this.field36408 != 0) {
            return n / (this.field36426 + 4 - this.field36408);
        }
        return 0;
    }
    
    public int method29655(final int n) {
        if (this.field36418) {
            return this.field36419;
        }
        if (this.field36426 + 5 - this.field36408 != 0) {
            return n / (this.field36426 + 5 - this.field36408);
        }
        return 0;
    }
    
    public float method29656() {
        if (!this.field36418) {
            return (new float[][] { { 8.707483f, 8.0f, 12.0f }, { 26.12245f, 24.0f, 36.0f }, { 26.12245f, 24.0f, 36.0f } })[this.field36405 - 1][this.field36412];
        }
        double n = this.field36417[this.method29638()] / this.method29641();
        if (this.field36410 == 0 || this.field36410 == 2) {
            n /= 2.0;
        }
        return (float)(n * 1000.0);
    }
    
    public float method29657(final int n) {
        return this.method29654(n) * this.method29656();
    }
    
    public int method29658() {
        return this.field36428;
    }
    
    public String method29659() {
        switch (this.field36405) {
            case 1: {
                return "I";
            }
            case 2: {
                return "II";
            }
            case 3: {
                return "III";
            }
            default: {
                return null;
            }
        }
    }
    
    public String method29660() {
        if (!this.field36418) {
            return Class8664.field36430[this.field36410][this.field36405 - 1][this.field36407];
        }
        return this.method29661() / 1000 + " kb/s";
    }
    
    public int method29661() {
        if (!this.field36418) {
            return Class8664.field36429[this.field36410][this.field36405 - 1][this.field36407];
        }
        return (int)(this.field36421 * 8 / (this.method29656() * this.field36419)) * 1000;
    }
    
    public int method29662() {
        return Class8664.field36429[this.field36410][this.field36405 - 1][this.field36407];
    }
    
    public String method29663() {
        switch (this.field36412) {
            case 2: {
                if (this.field36410 == 1) {
                    return "32 kHz";
                }
                if (this.field36410 == 0) {
                    return "16 kHz";
                }
                return "8 kHz";
            }
            case 0: {
                if (this.field36410 == 1) {
                    return "44.1 kHz";
                }
                if (this.field36410 == 0) {
                    return "22.05 kHz";
                }
                return "11.025 kHz";
            }
            case 1: {
                if (this.field36410 == 1) {
                    return "48 kHz";
                }
                if (this.field36410 == 0) {
                    return "24 kHz";
                }
                return "12 kHz";
            }
            default: {
                return null;
            }
        }
    }
    
    public String method29664() {
        switch (this.field36411) {
            case 0: {
                return "Stereo";
            }
            case 1: {
                return "Joint stereo";
            }
            case 2: {
                return "Dual channel";
            }
            case 3: {
                return "Single channel";
            }
            default: {
                return null;
            }
        }
    }
    
    public String method29665() {
        switch (this.field36410) {
            case 1: {
                return "MPEG-1";
            }
            case 0: {
                return "MPEG-2 LSF";
            }
            case 2: {
                return "MPEG-2.5 LSF";
            }
            default: {
                return null;
            }
        }
    }
    
    public int method29666() {
        return this.field36413;
    }
    
    public int method29667() {
        return this.field36414;
    }
    
    static {
        field36394 = new int[][] { { 22050, 24000, 16000, 1 }, { 44100, 48000, 32000, 1 }, { 11025, 12000, 8000, 1 } };
        field36429 = new int[][][] { { { 0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000, 0 }, { 0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0 }, { 0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0 } }, { { 0, 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000, 0 }, { 0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000, 0 }, { 0, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 0 } }, { { 0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000, 0 }, { 0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0 }, { 0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0 } } };
        field36430 = new String[][][] { { { "free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "176 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "forbidden" }, { "free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden" }, { "free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden" } }, { { "free format", "32 kbit/s", "64 kbit/s", "96 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "288 kbit/s", "320 kbit/s", "352 kbit/s", "384 kbit/s", "416 kbit/s", "448 kbit/s", "forbidden" }, { "free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "320 kbit/s", "384 kbit/s", "forbidden" }, { "free format", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "320 kbit/s", "forbidden" } }, { { "free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "176 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "forbidden" }, { "free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden" }, { "free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden" } } };
    }
}
