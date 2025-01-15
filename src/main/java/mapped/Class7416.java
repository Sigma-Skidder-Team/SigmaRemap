// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.zip.DataFormatException;
import java.io.EOFException;
import java.util.Arrays;
import java.util.zip.Inflater;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.util.zip.CRC32;
import java.io.InputStream;

public class Class7416
{
    public static Class7609 field28556;
    public static Class7609 field28557;
    public static Class7609 field28558;
    public static Class7609 field28559;
    public static Class7609 field28560;
    public static Class7609 field28561;
    public static Class7609 field28562;
    private static final byte[] field28563;
    private static final int field28564 = 1229472850;
    private static final int field28565 = 1347179589;
    private static final int field28566 = 1951551059;
    private static final int field28567 = 1229209940;
    private static final int field28568 = 1229278788;
    private static final byte field28569 = 0;
    private static final byte field28570 = 2;
    private static final byte field28571 = 3;
    private static final byte field28572 = 4;
    private static final byte field28573 = 6;
    private final InputStream field28574;
    private final CRC32 field28575;
    private final byte[] field28576;
    private int field28577;
    private int field28578;
    private int field28579;
    private int field28580;
    private int field28581;
    private int field28582;
    private int field28583;
    private int field28584;
    private byte[] field28585;
    private byte[] field28586;
    private byte[] field28587;
    
    public Class7416(final InputStream field28574) throws IOException {
        this.field28574 = field28574;
        this.field28575 = new CRC32();
        this.method22819(this.field28576 = new byte[4096], 0, Class7416.field28563.length);
        if (!method22822(this.field28576)) {
            throw new IOException("Not a valid PNG file");
        }
        this.method22814(1229472850);
        this.method22809();
        this.method22812();
    Label_0121:
        while (true) {
            this.method22813();
            switch (this.field28578) {
                case 1229209940: {
                    break Label_0121;
                }
                case 1347179589: {
                    this.method22810();
                    break;
                }
                case 1951551059: {
                    this.method22811();
                    break;
                }
            }
            this.method22812();
        }
        if (this.field28583 == 3 && this.field28585 == null) {
            throw new IOException("Missing PLTE chunk");
        }
    }
    
    public int method22785() {
        return this.field28581;
    }
    
    public int method22786() {
        return this.field28580;
    }
    
    public boolean method22787() {
        if (this.field28583 != 6) {
            if (this.field28586 == null) {
                if (this.field28587 == null) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean method22788() {
        if (this.field28583 != 6) {
            if (this.field28583 != 2) {
                if (this.field28583 != 3) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public Class7609 method22789(final Class7609 class7609) {
        switch (this.field28583) {
            case 2: {
                if (class7609 == Class7416.field28562 || class7609 == Class7416.field28560 || class7609 == Class7416.field28561 || class7609 == Class7416.field28559) {
                    return class7609;
                }
                return Class7416.field28559;
            }
            case 6: {
                if (class7609 == Class7416.field28562 || class7609 == Class7416.field28560 || class7609 == Class7416.field28561 || class7609 == Class7416.field28559) {
                    return class7609;
                }
                return Class7416.field28560;
            }
            case 0: {
                if (class7609 == Class7416.field28557 || class7609 == Class7416.field28556) {
                    return class7609;
                }
                return Class7416.field28557;
            }
            case 4: {
                return Class7416.field28558;
            }
            case 3: {
                if (class7609 == Class7416.field28562 || class7609 == Class7416.field28560 || class7609 == Class7416.field28561) {
                    return class7609;
                }
                return Class7416.field28560;
            }
            default: {
                throw new UnsupportedOperationException("Not yet implemented");
            }
        }
    }
    
    public void method22790(final ByteBuffer byteBuffer, final int n, final Class7609 class7609) throws IOException {
        final int position = byteBuffer.position();
        final int n2 = (this.field28580 * this.field28582 + 7) / 8 * this.field28584;
        byte[] array = new byte[n2 + 1];
        byte[] array2 = new byte[n2 + 1];
        byte[] array3 = (byte[])((this.field28582 < 8) ? new byte[this.field28580 + 1] : null);
        final Inflater inflater = new Inflater();
        try {
            for (int i = 0; i < this.field28581; ++i) {
                this.method22818(inflater, array, 0, array.length);
                this.method22804(array, array2);
                byteBuffer.position();
                switch (this.field28583) {
                    case 2: {
                        if (class7609 == Class7416.field28562) {
                            this.method22792(byteBuffer, array);
                            break;
                        }
                        if (class7609 == Class7416.field28560) {
                            this.method22793(byteBuffer, array);
                            break;
                        }
                        if (class7609 == Class7416.field28561) {
                            this.method22794(byteBuffer, array);
                            break;
                        }
                        if (class7609 == Class7416.field28559) {
                            this.method22791(byteBuffer, array);
                            break;
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 6: {
                        if (class7609 == Class7416.field28562) {
                            this.method22795(byteBuffer, array);
                            break;
                        }
                        if (class7609 == Class7416.field28560) {
                            this.method22791(byteBuffer, array);
                            break;
                        }
                        if (class7609 == Class7416.field28561) {
                            this.method22796(byteBuffer, array);
                            break;
                        }
                        if (class7609 == Class7416.field28559) {
                            this.method22797(byteBuffer, array);
                            break;
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 0: {
                        if (class7609 == Class7416.field28557 || class7609 == Class7416.field28556) {
                            this.method22791(byteBuffer, array);
                            break;
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 4: {
                        if (class7609 == Class7416.field28558) {
                            this.method22791(byteBuffer, array);
                            break;
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 3: {
                        switch (this.field28582) {
                            case 8: {
                                array3 = array;
                                break;
                            }
                            case 4: {
                                this.method22801(array, array3);
                                break;
                            }
                            case 2: {
                                this.method22802(array, array3);
                                break;
                            }
                            case 1: {
                                this.method22803(array, array3);
                                break;
                            }
                            default: {
                                throw new UnsupportedOperationException("Unsupported bitdepth for this image");
                            }
                        }
                        if (class7609 == Class7416.field28562) {
                            this.method22798(byteBuffer, array3);
                            break;
                        }
                        if (class7609 == Class7416.field28560) {
                            this.method22799(byteBuffer, array3);
                            break;
                        }
                        if (class7609 == Class7416.field28561) {
                            this.method22800(byteBuffer, array3);
                            break;
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    default: {
                        throw new UnsupportedOperationException("Not yet implemented");
                    }
                }
                final byte[] array4 = array;
                array = array2;
                array2 = array4;
            }
        }
        finally {
            inflater.end();
        }
    }
    
    private void method22791(final ByteBuffer byteBuffer, final byte[] src) {
        byteBuffer.put(src, 1, src.length - 1);
    }
    
    private void method22792(final ByteBuffer byteBuffer, final byte[] array) {
        if (this.field28587 == null) {
            for (int i = 1; i < array.length; i += 3) {
                byteBuffer.put((byte)(-1)).put(array[i + 2]).put(array[i + 1]).put(array[i]);
            }
        }
        else {
            final byte b = this.field28587[1];
            final byte b2 = this.field28587[3];
            final byte b3 = this.field28587[5];
            for (int j = 1; j < array.length; j += 3) {
                final byte b4 = array[j];
                final byte b5 = array[j + 1];
                final byte b6 = array[j + 2];
                byte b7 = -1;
                if (b4 == b) {
                    if (b5 == b2) {
                        if (b6 == b3) {
                            b7 = 0;
                        }
                    }
                }
                byteBuffer.put(b7).put(b6).put(b5).put(b4);
            }
        }
    }
    
    private void method22793(final ByteBuffer byteBuffer, final byte[] array) {
        if (this.field28587 == null) {
            for (int i = 1; i < array.length; i += 3) {
                byteBuffer.put(array[i]).put(array[i + 1]).put(array[i + 2]).put((byte)(-1));
            }
        }
        else {
            final byte b = this.field28587[1];
            final byte b2 = this.field28587[3];
            final byte b3 = this.field28587[5];
            for (int j = 1; j < array.length; j += 3) {
                final byte b4 = array[j];
                final byte b5 = array[j + 1];
                final byte b6 = array[j + 2];
                byte b7 = -1;
                if (b4 == b) {
                    if (b5 == b2) {
                        if (b6 == b3) {
                            b7 = 0;
                        }
                    }
                }
                byteBuffer.put(b4).put(b5).put(b6).put(b7);
            }
        }
    }
    
    private void method22794(final ByteBuffer byteBuffer, final byte[] array) {
        if (this.field28587 == null) {
            for (int i = 1; i < array.length; i += 3) {
                byteBuffer.put(array[i + 2]).put(array[i + 1]).put(array[i]).put((byte)(-1));
            }
        }
        else {
            final byte b = this.field28587[1];
            final byte b2 = this.field28587[3];
            final byte b3 = this.field28587[5];
            for (int j = 1; j < array.length; j += 3) {
                final byte b4 = array[j];
                final byte b5 = array[j + 1];
                final byte b6 = array[j + 2];
                byte b7 = -1;
                if (b4 == b) {
                    if (b5 == b2) {
                        if (b6 == b3) {
                            b7 = 0;
                        }
                    }
                }
                byteBuffer.put(b6).put(b5).put(b4).put(b7);
            }
        }
    }
    
    private void method22795(final ByteBuffer byteBuffer, final byte[] array) {
        for (int i = 1; i < array.length; i += 4) {
            byteBuffer.put(array[i + 3]).put(array[i + 2]).put(array[i + 1]).put(array[i]);
        }
    }
    
    private void method22796(final ByteBuffer byteBuffer, final byte[] array) {
        for (int i = 1; i < array.length; i += 4) {
            byteBuffer.put(array[i + 2]).put(array[i + 1]).put(array[i + 0]).put(array[i + 3]);
        }
    }
    
    private void method22797(final ByteBuffer byteBuffer, final byte[] array) {
        for (int i = 1; i < array.length; i += 4) {
            byteBuffer.put(array[i]).put(array[i + 1]).put(array[i + 2]);
        }
    }
    
    private void method22798(final ByteBuffer byteBuffer, final byte[] array) {
        if (this.field28586 == null) {
            for (int i = 1; i < array.length; ++i) {
                final int n = array[i] & 0xFF;
                byteBuffer.put((byte)(-1)).put(this.field28585[n * 3 + 2]).put(this.field28585[n * 3 + 1]).put(this.field28585[n * 3 + 0]);
            }
        }
        else {
            for (int j = 1; j < array.length; ++j) {
                final int n2 = array[j] & 0xFF;
                byteBuffer.put(this.field28586[n2]).put(this.field28585[n2 * 3 + 2]).put(this.field28585[n2 * 3 + 1]).put(this.field28585[n2 * 3 + 0]);
            }
        }
    }
    
    private void method22799(final ByteBuffer byteBuffer, final byte[] array) {
        if (this.field28586 == null) {
            for (int i = 1; i < array.length; ++i) {
                final int n = array[i] & 0xFF;
                byteBuffer.put(this.field28585[n * 3 + 0]).put(this.field28585[n * 3 + 1]).put(this.field28585[n * 3 + 2]).put((byte)(-1));
            }
        }
        else {
            for (int j = 1; j < array.length; ++j) {
                final int n2 = array[j] & 0xFF;
                byteBuffer.put(this.field28585[n2 * 3 + 0]).put(this.field28585[n2 * 3 + 1]).put(this.field28585[n2 * 3 + 2]).put(this.field28586[n2]);
            }
        }
    }
    
    private void method22800(final ByteBuffer byteBuffer, final byte[] array) {
        if (this.field28586 == null) {
            for (int i = 1; i < array.length; ++i) {
                final int n = array[i] & 0xFF;
                byteBuffer.put(this.field28585[n * 3 + 2]).put(this.field28585[n * 3 + 1]).put(this.field28585[n * 3 + 0]).put((byte)(-1));
            }
        }
        else {
            for (int j = 1; j < array.length; ++j) {
                final int n2 = array[j] & 0xFF;
                byteBuffer.put(this.field28585[n2 * 3 + 2]).put(this.field28585[n2 * 3 + 1]).put(this.field28585[n2 * 3 + 0]).put(this.field28586[n2]);
            }
        }
    }
    
    private void method22801(final byte[] array, final byte[] array2) {
        int i = 1;
        final int length = array2.length;
        while (i < length) {
            final int n = array[1 + (i >> 1)] & 0xFF;
            switch (length - i) {
                default: {
                    array2[i + 1] = (byte)(n & 0xF);
                }
                case 1: {
                    array2[i] = (byte)(n >> 4);
                    i += 2;
                    continue;
                }
            }
        }
    }
    
    private void method22802(final byte[] array, final byte[] array2) {
        int i = 1;
        final int length = array2.length;
        while (i < length) {
            final int n = array[1 + (i >> 2)] & 0xFF;
            switch (length - i) {
                default: {
                    array2[i + 3] = (byte)(n & 0x3);
                }
                case 3: {
                    array2[i + 2] = (byte)(n >> 2 & 0x3);
                }
                case 2: {
                    array2[i + 1] = (byte)(n >> 4 & 0x3);
                }
                case 1: {
                    array2[i] = (byte)(n >> 6);
                    i += 4;
                    continue;
                }
            }
        }
    }
    
    private void method22803(final byte[] array, final byte[] array2) {
        int i = 1;
        final int length = array2.length;
        while (i < length) {
            final int n = array[1 + (i >> 3)] & 0xFF;
            switch (length - i) {
                default: {
                    array2[i + 7] = (byte)(n & 0x1);
                }
                case 7: {
                    array2[i + 6] = (byte)(n >> 1 & 0x1);
                }
                case 6: {
                    array2[i + 5] = (byte)(n >> 2 & 0x1);
                }
                case 5: {
                    array2[i + 4] = (byte)(n >> 3 & 0x1);
                }
                case 4: {
                    array2[i + 3] = (byte)(n >> 4 & 0x1);
                }
                case 3: {
                    array2[i + 2] = (byte)(n >> 5 & 0x1);
                }
                case 2: {
                    array2[i + 1] = (byte)(n >> 6 & 0x1);
                }
                case 1: {
                    array2[i] = (byte)(n >> 7);
                    i += 8;
                    continue;
                }
            }
        }
    }
    
    private void method22804(final byte[] array, final byte[] array2) throws IOException {
        switch (array[0]) {
            case 0: {
                break;
            }
            case 1: {
                this.method22805(array);
                break;
            }
            case 2: {
                this.method22806(array, array2);
                break;
            }
            case 3: {
                this.method22807(array, array2);
                break;
            }
            case 4: {
                this.method22808(array, array2);
                break;
            }
            default: {
                throw new IOException("invalide filter type in scanline: " + array[0]);
            }
        }
    }
    
    private void method22805(final byte[] array) {
        final int field28584 = this.field28584;
        for (int i = field28584 + 1; i < array.length; ++i) {
            final int n = i;
            array[n] += array[i - field28584];
        }
    }
    
    private void method22806(final byte[] array, final byte[] array2) {
        final int field28584 = this.field28584;
        for (int i = 1; i < array.length; ++i) {
            final int n = i;
            array[n] += array2[i];
        }
    }
    
    private void method22807(final byte[] array, final byte[] array2) {
        int field28584;
        int i;
        for (field28584 = this.field28584, i = 1; i <= field28584; ++i) {
            final int n = i;
            array[n] += (byte)((array2[i] & 0xFF) >>> 1);
        }
        while (i < array.length) {
            final int n2 = i;
            array[n2] += (byte)((array2[i] & 0xFF) + (array[i - field28584] & 0xFF) >>> 1);
            ++i;
        }
    }
    
    private void method22808(final byte[] array, final byte[] array2) {
        int field28584;
        int i;
        for (field28584 = this.field28584, i = 1; i <= field28584; ++i) {
            final int n = i;
            array[n] += array2[i];
        }
        while (i < array.length) {
            final int n2 = array[i - field28584] & 0xFF;
            final int n3 = array2[i] & 0xFF;
            int n4 = array2[i - field28584] & 0xFF;
            final int n5 = n2 + n3 - n4;
            int n6 = n5 - n2;
            if (n6 < 0) {
                n6 = -n6;
            }
            int n7 = n5 - n3;
            if (n7 < 0) {
                n7 = -n7;
            }
            int n8 = n5 - n4;
            if (n8 < 0) {
                n8 = -n8;
            }
            if (n6 <= n7 && n6 <= n8) {
                n4 = n2;
            }
            else if (n7 <= n8) {
                n4 = n3;
            }
            final int n9 = i;
            array[n9] += (byte)n4;
            ++i;
        }
    }
    
    private void method22809() throws IOException {
        this.method22815(13);
        this.method22816(this.field28576, 0, 13);
        this.field28580 = this.method22820(this.field28576, 0);
        this.field28581 = this.method22820(this.field28576, 4);
        this.field28582 = (this.field28576[8] & 0xFF);
        Label_0446: {
            switch (this.field28583 = (this.field28576[9] & 0xFF)) {
                case 0: {
                    if (this.field28582 != 8) {
                        throw new IOException("Unsupported bit depth: " + this.field28582);
                    }
                    this.field28584 = 1;
                    break;
                }
                case 4: {
                    if (this.field28582 != 8) {
                        throw new IOException("Unsupported bit depth: " + this.field28582);
                    }
                    this.field28584 = 2;
                    break;
                }
                case 2: {
                    if (this.field28582 != 8) {
                        throw new IOException("Unsupported bit depth: " + this.field28582);
                    }
                    this.field28584 = 3;
                    break;
                }
                case 6: {
                    if (this.field28582 != 8) {
                        throw new IOException("Unsupported bit depth: " + this.field28582);
                    }
                    this.field28584 = 4;
                    break;
                }
                case 3: {
                    switch (this.field28582) {
                        case 1:
                        case 2:
                        case 4:
                        case 8: {
                            this.field28584 = 1;
                            break Label_0446;
                        }
                        default: {
                            throw new IOException("Unsupported bit depth: " + this.field28582);
                        }
                    }
                    break;
                }
                default: {
                    throw new IOException("unsupported color format: " + this.field28583);
                }
            }
        }
        if (this.field28576[10] != 0) {
            throw new IOException("unsupported compression method");
        }
        if (this.field28576[11] != 0) {
            throw new IOException("unsupported filtering method");
        }
        if (this.field28576[12] != 0) {
            throw new IOException("unsupported interlace method");
        }
    }
    
    private void method22810() throws IOException {
        final int n = this.field28577 / 3;
        if (n >= 1) {
            if (n <= 256) {
                if (this.field28577 % 3 == 0) {
                    this.method22816(this.field28585 = new byte[n * 3], 0, this.field28585.length);
                    return;
                }
            }
        }
        throw new IOException("PLTE chunk has wrong length");
    }
    
    private void method22811() throws IOException {
        switch (this.field28583) {
            case 0: {
                this.method22815(2);
                this.method22816(this.field28587 = new byte[2], 0, 2);
                break;
            }
            case 2: {
                this.method22815(6);
                this.method22816(this.field28587 = new byte[6], 0, 6);
                break;
            }
            case 3: {
                if (this.field28585 == null) {
                    throw new IOException("tRNS chunk without PLTE chunk");
                }
                Arrays.fill(this.field28586 = new byte[this.field28585.length / 3], (byte)(-1));
                this.method22816(this.field28586, 0, this.field28586.length);
                break;
            }
        }
    }
    
    private void method22812() throws IOException {
        if (this.field28579 <= 0) {
            this.method22819(this.field28576, 0, 4);
            if ((int)this.field28575.getValue() != this.method22820(this.field28576, 0)) {
                throw new IOException("Invalid CRC");
            }
        }
        else {
            this.method22821(this.field28579 + 4);
        }
        this.field28579 = 0;
        this.field28577 = 0;
        this.field28578 = 0;
    }
    
    private void method22813() throws IOException {
        this.method22819(this.field28576, 0, 8);
        this.field28577 = this.method22820(this.field28576, 0);
        this.field28578 = this.method22820(this.field28576, 4);
        this.field28579 = this.field28577;
        this.field28575.reset();
        this.field28575.update(this.field28576, 4, 4);
    }
    
    private void method22814(final int i) throws IOException {
        this.method22813();
        if (this.field28578 == i) {
            return;
        }
        throw new IOException("Expected chunk: " + Integer.toHexString(i));
    }
    
    private void method22815(final int n) throws IOException {
        if (this.field28577 == n) {
            return;
        }
        throw new IOException("Chunk has wrong size");
    }
    
    private int method22816(final byte[] b, final int off, int field28579) throws IOException {
        if (field28579 > this.field28579) {
            field28579 = this.field28579;
        }
        this.method22819(b, off, field28579);
        this.field28575.update(b, off, field28579);
        this.field28579 -= field28579;
        return field28579;
    }
    
    private void method22817(final Inflater inflater) throws IOException {
        while (this.field28579 == 0) {
            this.method22812();
            this.method22814(1229209940);
        }
        inflater.setInput(this.field28576, 0, this.method22816(this.field28576, 0, this.field28576.length));
    }
    
    private void method22818(final Inflater inflater, final byte[] output, int off, int i) throws IOException {
        try {
            do {
                final int inflate = inflater.inflate(output, off, i);
                if (inflate <= 0) {
                    if (inflater.finished()) {
                        throw new EOFException();
                    }
                    if (!inflater.needsInput()) {
                        throw new IOException("Can't inflate " + i + " bytes");
                    }
                    this.method22817(inflater);
                }
                else {
                    off += inflate;
                    i -= inflate;
                }
            } while (i > 0);
        }
        catch (final DataFormatException cause) {
            throw (IOException)new IOException("inflate error").initCause(cause);
        }
    }
    
    private void method22819(final byte[] b, int off, int len) throws IOException {
        while (true) {
            final int read = this.field28574.read(b, off, len);
            if (read < 0) {
                throw new EOFException();
            }
            off += read;
            len -= read;
            if (len > 0) {
                continue;
            }
        }
    }
    
    private int method22820(final byte[] array, final int n) {
        return array[n] << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8 | (array[n + 3] & 0xFF);
    }
    
    private void method22821(long n) throws IOException {
        while (n > 0L) {
            final long skip = this.field28574.skip(n);
            if (skip < 0L) {
                throw new EOFException();
            }
            n -= skip;
        }
    }
    
    private static boolean method22822(final byte[] array) {
        for (int i = 0; i < Class7416.field28563.length; ++i) {
            if (array[i] != Class7416.field28563[i]) {
                return false;
            }
        }
        return true;
    }
    
    static {
        Class7416.field28556 = new Class7609(1, true, null);
        Class7416.field28557 = new Class7609(1, false, null);
        Class7416.field28558 = new Class7609(2, true, null);
        Class7416.field28559 = new Class7609(3, false, null);
        Class7416.field28560 = new Class7609(4, true, null);
        Class7416.field28561 = new Class7609(4, true, null);
        Class7416.field28562 = new Class7609(4, true, null);
        field28563 = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
    }
}
