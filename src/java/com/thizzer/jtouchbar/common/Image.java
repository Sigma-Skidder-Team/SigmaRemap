package com.thizzer.jtouchbar.common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Image {
    private String _name;
    private String _path;
    private byte[] _data;

    private Image() {
    }

    public Image(String nameOrPath, boolean isPath) {
        if (isPath) {
            this._path = nameOrPath;
        } else {
            this._name = nameOrPath;
        }
    }

    public Image(byte[] data) {
        this._data = data;
    }

    public Image(InputStream dataInputStream) throws IOException {
        this.readFromInputStream(dataInputStream);
    }

    public void readFromInputStream(InputStream dataInputStream) throws IOException {
        if (dataInputStream == null) {
            throw new NullPointerException();
        } else {
            try (ByteArrayOutputStream var4 = new ByteArrayOutputStream()) {
                byte[] read = new byte[1024];
                int var7 = 0;

                while ((var7 = dataInputStream.read(read)) != -1) {
                    var4.write(read, 0, var7);
                }

                this._data = var4.toByteArray();
            } catch (IOException var26) {
                throw var26;
            } finally {
                dataInputStream.close();
            }
        }
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getPath() {
        return this._path;
    }

    public void setPath(String path) {
        this._path = path;
    }

    public byte[] getData() {
        return this._data;
    }

    public void getData(byte[] data) {
        this._data = data;
    }
}
